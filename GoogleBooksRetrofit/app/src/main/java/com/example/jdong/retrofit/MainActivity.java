package com.example.jdong.retrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import android.widget.Toast;

import java.util.ArrayList;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
  private ArrayList<Book> booklist;
  private Api api;
  private BookListAdapter adapter;
  private RecyclerView recyclerView;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://www.googleapis.com/books/v1/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
    api = retrofit.create(Api.class);
    recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
    recyclerView.setLayoutManager(new LinearLayoutManager(this));
    booklist = new ArrayList<>();

    adapter = new BookListAdapter(booklist, new BookListAdapter.LoadMoreListener() {
      @Override
      public void onLoadMore() {
        fetchBook(adapter.getDataCount(), 5);
      }
    }, this);
    recyclerView.setAdapter(adapter);
//    fetchBook(0, 5);
  }

  public void fetchBook(int startIndex, int maxResults) {
    Call<BookList> call = api.getBooks(startIndex, maxResults);
    call.enqueue(new Callback<BookList>() {
      @Override
      public void onResponse(Call<BookList> call, Response<BookList> response) {
        if (response.body().getItems() == null) {
          adapter.setShowLoading(false);
          return;
        }
        ArrayList<Book> list = (ArrayList<Book>) response.body().getItems();
        adapter.append(list);
        adapter.setShowLoading(list.size() == 5);
      }

      @Override
      public void onFailure(Call<BookList> call, Throwable t) {
        Toast.makeText(MainActivity.this, "fail", Toast.LENGTH_LONG).show();
      }
    });

  }
}
