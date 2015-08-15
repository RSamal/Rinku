package com.udacity.test;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by ramakant on 8/14/2015.
 */
public class ConnectionManager {

    private static RequestQueue requestQueue;

    public static RequestQueue getInstance(Context context){

        if(requestQueue==null){
            requestQueue = Volley.newRequestQueue(context);
        }

        return requestQueue;
    }

    private ConnectionManager(){}
}
