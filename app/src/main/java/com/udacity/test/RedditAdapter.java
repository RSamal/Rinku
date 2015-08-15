package com.udacity.test;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.udacity.test.model.Post;

import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by ramakant on 8/14/2015.
 */
public class RedditAdapter extends RecyclerView.Adapter<RedditAdapter.MyViewHolder> {

    List<Post> mPostList;

    public RedditAdapter(List<Post> posts){
        mPostList = posts;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_post,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

            holder.textView.setText(mPostList.get(position).getTitle());

    }

    @Override
    public int getItemCount() {
        return mPostList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView textView;
        public MyViewHolder(View itemView) {

            super(itemView);

            textView = (TextView) itemView.findViewById(R.id.row_tv);
        }
    }
}
