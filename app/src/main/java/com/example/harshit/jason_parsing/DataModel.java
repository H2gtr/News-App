package com.example.harshit.jason_parsing;

/**
 * Created by Harshit on 9/1/2018.
 */

public class DataModel  {

  private   String title;
    private String description;
    private String Url;
    private String UrltoImage;

    public DataModel(String title, String description, String url, String urltoImage) {
        this.title = title;
        this.description = description;
        Url = url;
        UrltoImage = urltoImage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public String getUrltoImage() {
        return UrltoImage;
    }

    public void setUrltoImage(String urltoImage) {
        UrltoImage = urltoImage;
    }
}
