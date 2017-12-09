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
import com.bnkk.padc.proof.of.concept.screen.implementation.adapters.UpcomingMoviesAdapter;
import com.bnkk.padc.proof.of.concept.screen.implementation.events.RestApiEvents;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by E5-575G on 11/9/2017.
 */

public class UpcomingMoviesFragment extends Fragment {

    @BindView(R.id.rv_upcoming_movie)
    RecyclerView rvUpcomingMovies;

    private UpcomingMoviesAdapter mUpcomingMoviesAdapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mUpcomingMoviesAdapter = new UpcomingMoviesAdapter(getContext());
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_upcoming, container, false);
        ButterKnife.bind(this, view);

        rvUpcomingMovies.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        rvUpcomingMovies.setAdapter(mUpcomingMoviesAdapter);

        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        if (!EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().register(this);
        }
    }

    @Override
    public void onStop() {
        super.onStop();
        EventBus.getDefault().unregister(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onNewsDataLoaded(RestApiEvents.MovieDataLoadedEvent event) {
        mUpcomingMoviesAdapter.appendNewData(event.getLoadedMovies());
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onErrorInvokingAPI(RestApiEvents.ErrorInvokingAPIEvent event) {
        Snackbar.make(rvUpcomingMovies, event.getErrorMsg(), Snackbar.LENGTH_INDEFINITE).show();
    }
}
