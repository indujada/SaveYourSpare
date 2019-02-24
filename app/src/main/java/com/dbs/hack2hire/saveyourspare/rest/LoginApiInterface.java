package com.dbs.hack2hire.saveyourspare.rest;

import com.dbs.hack2hire.saveyourspare.model.LoginResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

  public interface LoginApiInterface {
        @GET("api/{username}/{password}")
        Call<LoginResponse> checkLogin(@Path("username") String username, @Path("password") String password);
    }

