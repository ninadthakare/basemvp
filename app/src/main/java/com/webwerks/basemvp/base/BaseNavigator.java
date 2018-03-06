package com.webwerks.basemvp.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class BaseNavigator {

    private final Context context;

    public BaseNavigator(Context context) {
        this.context = context;
    }

    protected void startActivity(Class<? extends Activity> activityClass, Bundle bundle) {
        Intent intent = new Intent(context, activityClass);
        if (bundle != null) intent.putExtras(bundle);
        context.startActivity(intent);
    }

    protected void startActivity(Class<? extends Activity> activityClass) {
        startActivity(activityClass, null);
    }
}
