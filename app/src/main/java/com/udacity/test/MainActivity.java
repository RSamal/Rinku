package com.udacity.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.google.gson.Gson;
import com.udacity.test.model.Listing;


public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    private Toolbar mToolbar;
    public  final String REDIT_URL ="https://www.reddit.com/r/all.json?list=5";

    private RecyclerView recyclerView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Setup Toolbar
        mToolbar = (Toolbar) findViewById(R.id.tool_bar);
        mToolbar.setTitle(R.string.app_name);
        setSupportActionBar(mToolbar);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerListview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());





        RequestQueue queue = ConnectionManager.getInstance(this);

        StringRequest request = new StringRequest(Request.Method.GET , REDIT_URL, new com.android.volley.Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                Listing   listing = new Gson().fromJson(response,Listing.class);
                RedditAdapter adapter = new RedditAdapter(listing.getPostList());
                recyclerView.setAdapter(adapter);

            }
        }, new com.android.volley.Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

        queue.add(request);





    }


}
