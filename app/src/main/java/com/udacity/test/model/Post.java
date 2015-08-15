package com.udacity.test.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ramakant on 8/14/2015.
 */
public class Post {

    @SerializedName("title")
    private String title;

    @SerializedName("permalink")
    private String permalink;

    @SerializedName("thumbnail")
    private  String thumbnail;

    public String getTitle() {
        return title;
    }

    public String getPermalink() {
        return permalink;
    }

    public String getThumbnail() {
        return thumbnail;
    }
}
