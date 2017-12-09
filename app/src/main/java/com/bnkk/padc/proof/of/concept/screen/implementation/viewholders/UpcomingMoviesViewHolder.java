package com.bnkk.padc.proof.of.concept.screen.implementation.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bnkk.padc.proof.of.concept.screen.implementation.R;
import com.bnkk.padc.proof.of.concept.screen.implementation.data.vo.MovieVO;
import com.bnkk.padc.proof.of.concept.screen.implementation.utils.AppConstants;
import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by E5-575G on 11/9/2017.
 */

public class UpcomingMoviesViewHolder extends BaseViewHolder<MovieVO> {

    @BindView(R.id.iv_movie_cover)
    ImageView ivMovieCover;

    @BindView(R.id.tv_movie_name)
    TextView tvMovieName;

    @BindView(R.id.tv_movie_type)
    TextView tvMovieType;

    @BindView(R.id.tv_rating_average)
    TextView tvRatingAverage;

    public UpcomingMoviesViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    @Override
    public void setData(MovieVO data) {
        tvMovieName.setText(data.getTitle());

        tvRatingAverage.setText(String.valueOf(data.getVoteAverage()));

        Glide
                .with(ivMovieCover.getContext())
                .load(AppConstants.IMAGE_BASE_PATH + "original" + data.getPosterPath())
                .into(ivMovieCover);
    }

    @Override
    public void onClick(View v) {

    }
}
