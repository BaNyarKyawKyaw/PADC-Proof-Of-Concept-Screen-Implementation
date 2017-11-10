package com.bnkk.padc.proof.of.concept.screen.implementation.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bnkk.padc.proof.of.concept.screen.implementation.R;
import com.bnkk.padc.proof.of.concept.screen.implementation.viewholders.NowOnCinemaMoviesViewHolder;

/**
 * Created by E5-575G on 11/8/2017.
 */

public class NowOnCinemaMoviesAdapter extends RecyclerView.Adapter<NowOnCinemaMoviesViewHolder> {

    private LayoutInflater mLayoutInflater;

    public NowOnCinemaMoviesAdapter(Context context) {
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public NowOnCinemaMoviesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mLayoutInflater.inflate(R.layout.view_item_movies, parent, false);
        return new NowOnCinemaMoviesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NowOnCinemaMoviesViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 15;
    }
}
