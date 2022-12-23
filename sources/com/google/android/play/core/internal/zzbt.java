package com.google.android.play.core.internal;

import android.content.pm.PackageManager;

public final class zzbt extends RuntimeException {
    public zzbt(String str) {
        super(str);
    }

    public zzbt(PackageManager.NameNotFoundException nameNotFoundException) {
        super("Failed to initialize FileStorage", nameNotFoundException);
    }
}
