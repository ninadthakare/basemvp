package com.webwerks.basemvp.util;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.webwerks.basemvp.di.scopes.ApplicationContext;

import javax.inject.Inject;

import dagger.Reusable;

@Reusable
public final class ImageLoader {

    private final Context context;

    @Inject
    public ImageLoader(@ApplicationContext Context context) {
        this.context = context;
    }

    public void loadImage(String url, ImageView imageView) {
        loadImage((Object) url, imageView);
    }

    private void loadImage(Object obj, ImageView imageView) {
        Glide.with(context).load(obj).into(imageView);
    }
}
