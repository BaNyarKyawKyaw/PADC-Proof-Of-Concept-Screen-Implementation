package com.bnkk.padc.proof.of.concept.screen.implementation.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.bnkk.padc.proof.of.concept.screen.implementation.fragments.MostPopularMoviesFragment;
import com.bnkk.padc.proof.of.concept.screen.implementation.fragments.NowOnCinemaMoviesFragment;
import com.bnkk.padc.proof.of.concept.screen.implementation.fragments.UpcomingMoviesFragment;


/**
 * Created by E5-575G on 11/8/2017.
 */

public class MovieTabsAdapter extends FragmentStatePagerAdapter {

    private int mNumberOfTabs;

    public MovieTabsAdapter(FragmentManager fm, int NumberOfTabs) {
        super(fm);
        mNumberOfTabs = NumberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                NowOnCinemaMoviesFragment nowOnCinemaMoviesFragment = new NowOnCinemaMoviesFragment();
                return nowOnCinemaMoviesFragment;
            case 1:
                UpcomingMoviesFragment upcomingMoviesFragment = new UpcomingMoviesFragment();
                return upcomingMoviesFragment;
            case 2:
                MostPopularMoviesFragment mostPopularMoviesFragment = new MostPopularMoviesFragment();
                return mostPopularMoviesFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumberOfTabs;
    }
}
