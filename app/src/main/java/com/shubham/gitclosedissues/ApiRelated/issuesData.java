package com.shubham.gitclosedissues.ApiRelated;

import com.shubham.gitclosedissues.ApiRelated.jsonModel.ClosedIssues;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface issuesData {

    @GET("issues?state=closed")
    Call<List<ClosedIssues>> getClosedIssued(@Header("Authorization") String token);

}
