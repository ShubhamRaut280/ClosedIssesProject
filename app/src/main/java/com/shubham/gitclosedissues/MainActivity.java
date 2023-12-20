package com.shubham.gitclosedissues;

import static android.content.ContentValues.TAG;
import static android.widget.Toast.LENGTH_LONG;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.shubham.gitclosedissues.ApiRelated.issuesData;
import com.shubham.gitclosedissues.ApiRelated.jsonModel.ClosedIssues;
import com.shubham.gitclosedissues.recyclerrelated.Model;
import com.shubham.gitclosedissues.recyclerrelated.adapter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    TextView error;
    FloatingActionButton refresh;

    ArrayList<Model> list = new ArrayList<>();
    adapter adapter = new adapter(MainActivity.this,list);

    RecyclerView recyclerView;
ProgressBar pb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getColor(R.color.main)));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler);
        pb = findViewById(R.id.progressBar);
        error = findViewById(R.id.error);
        refresh = findViewById(R.id.refresh);

        refresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                retrofitwork();
                Toast.makeText(MainActivity.this, "Refreshing", Toast.LENGTH_SHORT).show();

            }
        });

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        pb.setVisibility(View.VISIBLE);
        retrofitwork();


    }





    // for fetching data using api
    public void retrofitwork()
    {

        String url = "https://api.github.com/repos/WeMakeDevs/roadmaps/";
        String token = "token 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";


        Retrofit retrofit = new Retrofit.Builder().baseUrl(url).addConverterFactory(GsonConverterFactory.create()).build();

        issuesData requestData = retrofit.create(issuesData.class);

        requestData.getClosedIssued(token).enqueue(new Callback<List<ClosedIssues>>() {
            @Override
            public void onResponse(Call<List<ClosedIssues>> call, Response<List<ClosedIssues>> response) {
                Log.d(TAG, "onResponse: Everything is ok till now");


                if(response.isSuccessful() && response.body()!=null)
                {
                    for (ClosedIssues issue: response.body()) {
                        String title = issue.title;
                        String username = issue.getUser().getLogin();
                        String userprofilepicturelink = issue.getUser().getAvatar_url();
                        String createdDate = getDate(issue.getCreated_at());
                        String closedDate = getDate(issue.getClosed_at());

                        Log.d(TAG, "onResponse: Title is : "+ title + " username is : "+ username+" url for profile : "+ userprofilepicturelink+
                                " createed at date: "+ createdDate+" closed at: " + closedDate);

                        Model model = new Model(title, username, closedDate,createdDate,userprofilepicturelink);

                        list.add(model);



                    }
                    pb.setVisibility(View.GONE);


                    Log.d(TAG, "onResponse: Size of list : "+ list.size());
                    recyclerView.setAdapter(adapter);



                }

                
            }

            @Override
            public void onFailure(Call<List<ClosedIssues>> call, Throwable t) {
                pb.setVisibility(View.GONE);
                error.setVisibility(View.VISIBLE);
                Log.d(TAG, "onFailure: Something is wrong request failed : "+ t);
                Toast.makeText(MainActivity.this, "Something is wrong please check the network", LENGTH_LONG).show();

            }
        });




    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.searchmenu,menu);

        MenuItem item = menu.findItem(R.id.search_menu);
        SearchView searchView =  (SearchView)item.getActionView();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);

                return false;
            }
        });

        return super.onCreateOptionsMenu(menu);
    }

    public String getDate(Date date)
    {
        String inputdate =  date.toString();
        SimpleDateFormat inputFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.ENGLISH);
        SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.ENGLISH);
        String result = new String();
        try{
        Date date1 = inputFormat.parse(inputdate);
      result = outputFormat.format(date1);
         }
        catch (ParseException e)
        {
            e.printStackTrace();
        }


        return result;
}





}