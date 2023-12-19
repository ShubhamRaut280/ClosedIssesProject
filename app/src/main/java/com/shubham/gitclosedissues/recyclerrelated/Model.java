package com.shubham.gitclosedissues.recyclerrelated;

import android.graphics.drawable.Drawable;

public class Model {
    String title, username, closeddate, createddate;
    String userDpUrl;

    public Model(String title, String username, String closeddate, String createddate, String userDp) {
        this.title = title;
        this.username = username;
        this.closeddate = closeddate;
        this.createddate = createddate;
        this.userDpUrl = userDp;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCloseddate() {
        return closeddate;
    }

    public void setCloseddate(String closeddate) {
        this.closeddate = closeddate;
    }

    public String getCreateddate() {
        return createddate;
    }

    public void setCreateddate(String createddate) {
        this.createddate = createddate;
    }

    public String getUserDp() {
        return userDpUrl;
    }

    public void setUserDp(String userDp) {
        this.userDpUrl = userDp;
    }
}
