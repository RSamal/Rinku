package com.udacity.test.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ramakant on 8/14/2015.
 */
public class Listing {

    @SerializedName("data")
    private ChildrenArray childrenArray;


    public List<Post> getPostList() {
        List<Post> postList = new ArrayList<Post>();


        for (Children children : childrenArray.getChildrens()) {

            postList.add(children.getPost());

        }

        return postList;
    }
}