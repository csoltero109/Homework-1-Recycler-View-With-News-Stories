package com.example.christiansoltero.newsapp;

import org.json.JSONException;
import org.json.JSONObject;

public class NewsItem {
    private String author;
    private String title;
    private String description;
    private String url;
    private String urlToImage;
    private String publishedAt;


    public NewsItem() {
        this.author = author;
        this.title = title;
        this.description = description;
        this.url = url;
        this.urlToImage = urlToImage;
        this.publishedAt = publishedAt;
    }

    public void setAuthorFromJSON(String aName){
        author = aName;
    }
    public void setTitleFromJSON(String tName){
        title = tName;
    }
    public void setDescriptionFromJSON(String dName){
        description = dName;
    }
    public void setUrlFromJSON(String uName){
        url = uName;
    }
    public void setUrlToImageFromJSON(String uImageName){
        urlToImage = uImageName;
    }
    public void setPublishedFromJSON(String pName){
        publishedAt = pName;
    }

    public String getAuthorFromJSON(){
        return author;
    }
    public String getTitleFromJSON(){
        return title;
    }
    public String getDescriptionFromJSON(){
        return description;
    }
    public String getUrlFromJSON(){
        return url;
    }
    public String getUrlToImageFromJSON(){
        return urlToImage;
    }
    public String getPublishedAtFromJSON(){
        return publishedAt;
    }
}
