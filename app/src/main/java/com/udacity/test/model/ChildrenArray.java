package com.udacity.test.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ramakant on 8/14/2015.
 */
public class ChildrenArray {

    @SerializedName("children")
    private List<Children> childrens;

    public List<Children> getChildrens() {
        return childrens;
    }
}
