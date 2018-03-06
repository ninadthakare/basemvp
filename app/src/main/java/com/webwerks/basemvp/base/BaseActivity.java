package com.webwerks.basemvp.base;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

import dagger.Lazy;
import dagger.android.AndroidInjection;

public abstract class BaseActivity<PRESENTER extends BasePresenter> extends AppCompatActivity {

    @Inject
    Lazy<PRESENTER> presenterLazy;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        presenterLazy.get().onCreateView();
    }

    @Override
    protected void onResume() {
        super.onResume();
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    @Override
    protected void onDestroy() {
        presenterLazy.get().onDestroyView();
        super.onDestroy();
    }
}
