package com.example.chiangj.rxjavaretrofit;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by chiangj on 21-7-17.
 */

public interface GithubApi {
    @GET("/orgs/{organization}/members")
    Observable<List<Member>> getMembers(@Path("organization") String organization);
}
