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
import com.bnkk.padc.proof.of.concept.screen.implementation.adapters.MoviesAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by E5-575G on 11/8/2017.
 */

public class MoviesFragment extends Fragment {

    @BindView(R.id.rv_movie_list)
    RecyclerView rvMovieList;

    private MoviesAdapter mMoviesAdapter;

    public static MoviesFragment newInstance() {
        MoviesFragment fragment = new MoviesFragment();
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mMoviesAdapter = new MoviesAdapter(getContext());
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_movies, container, false);
        ButterKnife.bind(this, view);

        rvMovieList.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        rvMovieList.setAdapter(mMoviesAdapter);

        return view;
    }
}
