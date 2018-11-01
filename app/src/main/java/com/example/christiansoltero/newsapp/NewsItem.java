package com.example.christiansoltero.newsapp;

import org.json.JSONException;
import org.json.JSONObject;

public class NewsItem {

    private String jStatus;

    public NewsItem(JSONObject json){
        try {
            jStatus = json.getString("source");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public String getStatus(){
        return jStatus;
    }
}
