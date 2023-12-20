package com.shubham.gitclosedissues.recyclerrelated;

import static android.content.ContentValues.TAG;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.Toast;

import androidx.annotation.NonNull;

import androidx.recyclerview.widget.RecyclerView;

import com.shubham.gitclosedissues.MainActivity;
import com.shubham.gitclosedissues.R;
import com.squareup.picasso.Picasso;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class adapter extends RecyclerView.Adapter<holder> implements Filterable {
    Context context;
    ArrayList<Model> issueList ;
    ArrayList<Model> backupList;

    public adapter(Context context, ArrayList<Model> issueList) {
        this.context = context;
        this.issueList = issueList;
        this.backupList = new ArrayList<>(issueList);
    }

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.issuelayout, parent, false);
        return new holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {

        int radius = 250;
        Model m = issueList.get(position);
        holder.title.setText(m.getTitle());
        Picasso.get().load(m.getUserDp()).transform(new RoundedCornerTransformation(radius)).into(holder.userdp);;
        holder.closeddate.setText("Closing Date: " +m.getCloseddate());
        holder.createddate.setText("Created Date: "+ m.getCreateddate());
        holder.username.setText("User : "+m.getUsername());


    }

    @Override
    public int getItemCount() {
        return issueList.size();
    }

    @Override
    public Filter getFilter() {
        return filter;
    }

    Filter filter = new Filter() {


        @Override
        protected FilterResults performFiltering(CharSequence input) {

            ArrayList<Model> filteredList = new ArrayList<>();

            if (backupList.size()==0)
                backupList.addAll(issueList);

            if(input.toString().isEmpty())
            {
                filteredList.addAll(backupList);
            }
            else
            {
                for (Model m :issueList) {
                    if(m.getTitle().toLowerCase().contains(input.toString().toLowerCase()))
                    {
                        filteredList.add(m);
                    }
                }

            }

            FilterResults ans = new FilterResults();
            ans.values = filteredList;



            return ans;
        }

        @Override
        protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
            issueList.clear();
            issueList.addAll((ArrayList<Model>)filterResults.values);
            notifyDataSetChanged();
            if(issueList.size()==0)
                Toast.makeText(context.getApplicationContext(), "Issue not found !", Toast.LENGTH_SHORT).show();


        }
    };
}
