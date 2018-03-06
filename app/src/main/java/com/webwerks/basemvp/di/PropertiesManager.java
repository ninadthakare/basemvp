package com.webwerks.basemvp.di;

import android.content.res.AssetManager;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.inject.Inject;

import dagger.Reusable;
import io.reactivex.annotations.Nullable;
import timber.log.Timber;

import static dagger.internal.Preconditions.checkNotNull;

@Reusable
final class PropertiesManager {

    private static final String LIVE_FINAL_DEV_URL = "liveDevUrl";
    private static final String PROPERTIES_FILENAME = "project.properties";
    private final Properties properties;

    @Inject
    PropertiesManager(AssetManager assetManager) {
        properties = new Properties();
        InputStream inputStream;
        try {
            inputStream = assetManager.open(PROPERTIES_FILENAME);
            properties.load(inputStream);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
        try {
            inputStream.close();
        } catch (IOException e) {
            Timber.e(e, "Failed to close input stream");
        }
    }

    String getBaseUrl() {
        @Nullable String baseUrl = properties.getProperty(LIVE_FINAL_DEV_URL);
        return checkNotNull(baseUrl);
    }
}