package com.example.christiansoltero.newsapp;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {
    private static int counter = 0;
    private static String results = "Your URL should be: ";
    private static String json;
    private static final String TAG = "News App URL";
    public TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1 = (TextView)findViewById(R.id.textView1);
        textView1.setText(results);
        NewsQueryTask n = new NewsQueryTask();
        n.execute();
    }

    class NewsQueryTask extends AsyncTask<Void, Void, Void> {


        @Override
        protected Void doInBackground(Void... voids) {
            NetworkUtils n = new NetworkUtils();
            URL url = n.buildUrl();
            try{
                json = n.getResponseFromHttpUrl(url);
            } catch(java.io.IOException e){
                e.printStackTrace();
            }

            JSONObject jobj = new JSONObject();
            try {
                jobj = new JSONObject(json);
                Log.e(TAG,jobj.getString("articles"));
                //Log.e(TAG,jobj.get);
            } catch (JSONException e) {
                e.printStackTrace();
            }




            results += json;
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            textView1.setText(results);

        }
    }
}