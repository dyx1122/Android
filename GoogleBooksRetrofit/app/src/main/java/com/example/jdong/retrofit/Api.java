package com.example.jdong.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by jdong on 11/28/17.
 */

public interface Api {

  //https://www.googleapis.com/books/v1/volumes?q=android&startIndex=0&maxResults=10
  @GET("volumes?q=android")
  Call<BookList> getBooks(@Query("startIndex") int startIndex, @Query("maxResults") int maxResults);
}
