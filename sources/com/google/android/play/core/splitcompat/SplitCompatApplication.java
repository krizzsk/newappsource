package com.google.android.play.core.splitcompat;

import android.app.Application;
import android.content.Context;
import p506gd.C17170a;

public class SplitCompatApplication extends Application {
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        C17170a.m43154c(this, false);
    }
}
