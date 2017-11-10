package com.bnkk.padc.proof.of.concept.screen.implementation.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bnkk.padc.proof.of.concept.screen.implementation.R;
import com.bnkk.padc.proof.of.concept.screen.implementation.viewholders.MostPopularMoviesViewHolder;

/**
 * Created by E5-575G on 11/9/2017.
 */

public class MostPopularMoviesAdapter extends RecyclerView.Adapter<MostPopularMoviesViewHolder> {

    private LayoutInflater layoutInflater;

    public MostPopularMoviesAdapter(Context context) {
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public MostPopularMoviesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.view_item_movies, parent, false);
        return new MostPopularMoviesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MostPopularMoviesViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
