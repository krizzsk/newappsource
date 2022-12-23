package com.vungle.warren.utility;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import ce0.C21087a;

public final class VungleProvider extends ContentProvider {
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public final String getType(Uri uri) {
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public final boolean onCreate() {
        Context context = getContext();
        if (context != null) {
            C21087a aVar = C21087a.f52911k;
            if (!aVar.f52912b) {
                aVar.f52917g = new Handler(Looper.getMainLooper());
                ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(aVar);
                aVar.f52912b = true;
            }
        }
        return true;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
