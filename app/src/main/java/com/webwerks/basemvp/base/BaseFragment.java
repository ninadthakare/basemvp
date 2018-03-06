package com.webwerks.basemvp.base;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import javax.inject.Inject;

import dagger.Lazy;
import dagger.android.support.AndroidSupportInjection;

public abstract class BaseFragment<PRESENTER extends BasePresenter> extends Fragment {

    @Inject
    Lazy<PRESENTER> presenterProvider;

    @Override
    public void onAttach(Activity activity) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) AndroidSupportInjection.inject(this);
        super.onAttach(activity);
    }

    @LayoutRes
    protected abstract int getLayoutId();

    @Override
    public void onAttach(Context context) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) AndroidSupportInjection.inject(this);
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(getLayoutId(), container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        init();
        getPresenter().onCreateView();
    }

    protected void init() {

    }

    @Override
    public void onDestroyView() {
        getPresenter().onDestroyView();
        super.onDestroyView();
    }

    public final PRESENTER getPresenter() {
        return presenterProvider.get();
    }
}