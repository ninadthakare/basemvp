package com.webwerks.basemvp;

import android.app.Activity;
import android.app.Application;

import com.webwerks.basemvp.di.DaggerAppComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;
import timber.log.Timber;

public final class App extends Application implements HasActivityInjector {

    @Inject
    DispatchingAndroidInjector<Activity> dispatchingActivityInjector;

    @Override
    public void onCreate() {
        super.onCreate();
        initDagger();
        setupTimber();
    }

    void setupTimber() {
        if (!BuildConfig.DEBUG) Timber.plant(new Timber.DebugTree());
    }

    private void initDagger() {
        DaggerAppComponent.builder()
                .application(this)
                .build().inject(this);
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return dispatchingActivityInjector;
    }
}
