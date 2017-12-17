package com.bnkk.padc.proof.of.concept.screen.implementation.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bnkk.padc.proof.of.concept.screen.implementation.R;
import com.bnkk.padc.proof.of.concept.screen.implementation.adapters.NowOnCinemaMoviesAdapter;
import com.bnkk.padc.proof.of.concept.screen.implementation.events.RestApiEvents;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by E5-575G on 11/8/2017.
 */

public class NowOnCinemaMoviesFragment extends BaseFragment {

    @BindView(R.id.rv_now_on_cinema_movie)
    RecyclerView rvMovieList;

    private NowOnCinemaMoviesAdapter mNowOnCinemaMoviesAdapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mNowOnCinemaMoviesAdapter = new NowOnCinemaMoviesAdapter(getContext());
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_now_on_cinema, container, false);
        ButterKnife.bind(this, view);

        rvMovieList.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        rvMovieList.setAdapter(mNowOnCinemaMoviesAdapter);

        return view;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onNewsDataLoaded(RestApiEvents.MovieDataLoadedEvent event) {
        mNowOnCinemaMoviesAdapter.appendNewData(event.getLoadedMovies());
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onErrorInvokingAPI(RestApiEvents.ErrorInvokingAPIEvent event) {
        Snackbar.make(rvMovieList, event.getErrorMsg(), Snackbar.LENGTH_INDEFINITE).show();
    }
}
