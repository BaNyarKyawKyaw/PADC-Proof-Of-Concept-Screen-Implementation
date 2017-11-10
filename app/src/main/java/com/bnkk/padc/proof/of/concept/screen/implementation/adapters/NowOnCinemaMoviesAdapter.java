package com.bnkk.padc.proof.of.concept.screen.implementation.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bnkk.padc.proof.of.concept.screen.implementation.R;
import com.bnkk.padc.proof.of.concept.screen.implementation.viewholders.MoviesViewHolder;

/**
 * Created by E5-575G on 11/8/2017.
 */

public class MoviesAdapter extends RecyclerView.Adapter<MoviesViewHolder> {

    private LayoutInflater mLayoutInflater;

    public MoviesAdapter(Context context) {
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public MoviesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mLayoutInflater.inflate(R.layout.view_item_movies, parent, false);
        return new MoviesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MoviesViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 15;
    }
}
