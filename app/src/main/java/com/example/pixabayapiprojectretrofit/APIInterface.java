package com.example.pixabayapiprojectretrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIInterface {

    @GET("?key=19999666-dcd12856d7a383c52280a0783&q=cat")
    public Call<Response> getPosts();
}
