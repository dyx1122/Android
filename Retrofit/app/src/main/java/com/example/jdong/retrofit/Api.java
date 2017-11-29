package com.example.jdong.retrofit;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by jdong on 11/28/17.
 */

public interface Api {

  @GET("users")
  Call<List<User>> getUserInfo();
}
