package com.shubham.gitclosedissues.recyclerrelated;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import com.shubham.gitclosedissues.R;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Transformation;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class adapter extends RecyclerView.Adapter<holder> {
    Context context;
    ArrayList<Model> issueList = new ArrayList<>();

    public adapter(Context context, ArrayList<Model> issueList) {
        this.context = context;
        this.issueList = issueList;
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
}
