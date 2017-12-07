package com.bnkk.padc.proof.of.concept.screen.implementation.viewholders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bnkk.padc.proof.of.concept.screen.implementation.R;
import com.bnkk.padc.proof.of.concept.screen.implementation.data.vo.MovieVO;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by E5-575G on 11/9/2017.
 */

public class MostPopularMoviesViewHolder extends BaseViewHolder<MovieVO> {

    @BindView(R.id.iv_movie_cover)
    ImageView ivMovieCover;

    @BindView(R.id.tv_movie_name)
    TextView tvMovieName;

    @BindView(R.id.tv_movie_type)
    TextView tvMovieType;

    public MostPopularMoviesViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    @Override
    public void setData(MovieVO data) {

        tvMovieName.setText(data.getTitle());
    }

    @Override
    public void onClick(View v) {

    }
}
