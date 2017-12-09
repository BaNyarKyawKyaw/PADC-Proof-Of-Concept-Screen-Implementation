package com.bnkk.padc.proof.of.concept.screen.implementation;

import android.app.Application;

import com.bnkk.padc.proof.of.concept.screen.implementation.data.models.MovieModel;

/**
 * Created by E5-575G on 12/7/2017.
 */

public class MovieApp extends Application {

    public static final String LOG_TAG = "MovieApp";

    @Override
    public void onCreate() {
        super.onCreate();
        MovieModel.getObjInstance().startLoadingMovies();
    }
}
