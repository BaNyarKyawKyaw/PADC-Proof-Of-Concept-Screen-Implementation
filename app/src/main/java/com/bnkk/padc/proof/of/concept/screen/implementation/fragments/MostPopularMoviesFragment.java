package com.bnkk.padc.proof.of.concept.screen.implementation.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bnkk.padc.proof.of.concept.screen.implementation.R;
import com.bnkk.padc.proof.of.concept.screen.implementation.adapters.MostPopularMoviesAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by E5-575G on 11/9/2017.
 */

public class MostPopularMoviesFragment extends Fragment {

    @BindView(R.id.rv_most_popular_movie)
    RecyclerView rvMostPopularMovie;

    private MostPopularMoviesAdapter mMostPopularMoviesAdapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mMostPopularMoviesAdapter = new MostPopularMoviesAdapter(getContext());
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_most_popular, container, false);
        ButterKnife.bind(this, view);

        rvMostPopularMovie.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        rvMostPopularMovie.setAdapter(mMostPopularMoviesAdapter);

        return view;
    }
}
