package com.bnkk.padc.proof.of.concept.screen.implementation.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bnkk.padc.proof.of.concept.screen.implementation.R;
import com.bnkk.padc.proof.of.concept.screen.implementation.data.vo.MovieVO;
import com.bnkk.padc.proof.of.concept.screen.implementation.viewholders.MostPopularMoviesViewHolder;

/**
 * Created by E5-575G on 11/9/2017.
 */

public class MostPopularMoviesAdapter extends BaseRecyclerAdapter<MostPopularMoviesViewHolder, MovieVO> {

    public MostPopularMoviesAdapter(Context context) {
        super(context);
    }

    @Override
    public MostPopularMoviesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mLayoutInflater.inflate(R.layout.view_item_movies, parent, false);
        return new MostPopularMoviesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MostPopularMoviesViewHolder holder, int position) {
        holder.setData(mData.get(position));
    }
}
