package com.udacity.test.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ramakant on 8/14/2015.
 */
public class Children {

    @SerializedName("data")
    private Post post;

    public Post getPost() {
        return post;
    }
}
