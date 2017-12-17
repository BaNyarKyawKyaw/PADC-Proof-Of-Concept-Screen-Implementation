package com.bnkk.padc.proof.of.concept.screen.implementation.fragments;

import android.support.v4.app.Fragment;

import org.greenrobot.eventbus.EventBus;

/**
 * Created by E5-575G on 12/10/2017.
 */

public abstract class BaseFragment extends Fragment {

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
}
