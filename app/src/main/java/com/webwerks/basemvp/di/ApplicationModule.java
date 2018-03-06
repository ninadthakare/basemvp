package com.webwerks.basemvp.di;

import android.content.Context;

import com.webwerks.basemvp.App;
import com.webwerks.basemvp.di.scopes.ApplicationContext;

import dagger.Module;
import dagger.Provides;
import dagger.Reusable;

@Module
public final class ApplicationModule {

    private ApplicationModule() {
        throw new AssertionError();
    }

    @Provides
    @Reusable
    @ApplicationContext
    static Context provideApplicationContext(App app) {
        return app.getApplicationContext();
    }
}
