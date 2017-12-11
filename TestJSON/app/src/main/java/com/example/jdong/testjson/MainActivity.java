package com.example.jdong.testjson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    try {
      InputStreamReader isr = new InputStreamReader(getAssets().open("test.json"), "UTF-8");
      BufferedReader br = new BufferedReader(isr);
      String line;
      StringBuilder builder = new StringBuilder();
      while ((line = br.readLine()) != null) {
        builder.append(line);
      }
      br.close();
      isr.close();
      JSONObject root = new JSONObject(builder.toString());
      System.out.println("cat=" + root.getString("cat"));
      JSONArray array = root.getJSONArray("languages");
      for (int i = 0; i < array.length(); i++) {
        JSONObject lan = array.getJSONObject(i);
        System.out.println("---------------");
        System.out.println("id="+ lan.getInt("id"));
        System.out.println("name="+ lan.getString("name"));
        System.out.println("ide="+ lan.getString("ide"));
      }
    } catch (UnsupportedEncodingException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } catch (JSONException e) {
      e.printStackTrace();
    }
  }
}
