package com.bnkk.padc.proof.of.concept.screen.implementation.data.models;

import com.bnkk.padc.proof.of.concept.screen.implementation.data.vo.MovieVO;
import com.bnkk.padc.proof.of.concept.screen.implementation.events.RestApiEvents;
import com.bnkk.padc.proof.of.concept.screen.implementation.network.MovieDataAgentImpl;
import com.bnkk.padc.proof.of.concept.screen.implementation.utils.AppConstants;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by E5-575G on 12/7/2017.
 */

public class MovieModel {

    private static MovieModel objInstance;

    private List<MovieVO> mMovies;
    private int mmPageIndex = 1;

    private MovieModel() {
        EventBus.getDefault().register(this);
        mMovies = new ArrayList<>();
    }

    public static MovieModel getObjInstance() {
        if (objInstance == null) {
            objInstance = new MovieModel();
        }
        return objInstance;
    }

    public void StartLoadingMovies() {
        MovieDataAgentImpl.getObjInstance().loadMovies(AppConstants.ACCESS_TOKEN, mmPageIndex);
    }

    @Subscribe
    public void onMovieDataLoaded(RestApiEvents.MovieDataLoadedEvent event) {
        mMovies.addAll(event.getLoadedMovies());
        mmPageIndex = event.getLoadedPageIndex() + 1;
    }
}
