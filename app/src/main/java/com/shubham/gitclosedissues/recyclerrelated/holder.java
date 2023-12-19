package com.shubham.gitclosedissues.recyclerrelated;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.shubham.gitclosedissues.R;

public class holder extends RecyclerView.ViewHolder {
    TextView title, username, createddate, closeddate;
    ImageView userdp;

    public holder(@NonNull View itemView) {
        super(itemView);
    title = itemView.findViewById(R.id.title);
    username = itemView.findViewById(R.id.username);
    createddate = itemView.findViewById(R.id.created);
    closeddate = itemView.findViewById(R.id.closed);
    userdp = itemView.findViewById(R.id.dp);



    }
}
