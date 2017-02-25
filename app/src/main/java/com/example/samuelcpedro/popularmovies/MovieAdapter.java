package com.example.samuelcpedro.popularmovies;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Samuel on 25-02-2017.
 */

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder>{

    private ArrayList<Movie> android_versions;
    private Context context;
    private int mNumberItems;

    //public MovieAdapter(int numberOfItems) {
    //    this.mNumberItems = numberOfItems;
    //}

    public DataAdapter(Context context, ArrayList<Movie> android_versions) {
        this.context = context;
        this.android_versions = android_versions;

    }

    @Override
    public MovieAdapter.MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_list_item_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MovieAdapter.MovieViewHolder viewHolder, int position) {
        //viewHolder.tv_android.setText(android_versions.get(i).getAndroid_version_name());
        Picasso.with(context).load(android_versions.get(position).getAndroid_image_url()).resize(120, 60).into(viewHolder.img_movie);
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MovieViewHolder extends RecyclerView.ViewHolder{
        ImageView img_movie;

        public MovieViewHolder(View view) {
            super(view);
            img_movie = (ImageView) view.findViewById(R.id.img_movie);
        }
    }
}
