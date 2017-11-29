package com.example.jdong.retrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.io.IOException;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

  private Api api;
  private TextView textView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    textView = (TextView)findViewById(R.id.text);
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
    api = retrofit.create(Api.class);
  }

  public void requestAPI(View view) {
    Call<List<User>> call = api.getUserInfo();
    call.enqueue(new Callback<List<User>>() {
      @Override
      public void onResponse(Call<List<User>> call, Response<List<User>> response) {
        StringBuilder result = new StringBuilder();
        for (User u : response.body()) {
          result.append("--");
          result.append(u.getId());
        }
        Toast.makeText(MainActivity.this, result.toString(), Toast.LENGTH_LONG).show();
      }

      @Override
      public void onFailure(Call<List<User>> call, Throwable t) {

      }
    });

  }
}
