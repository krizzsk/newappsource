package com.fyber.inneractive.sdk.util;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: com.fyber.inneractive.sdk.util.p */
public class C3720p {
    /* renamed from: a */
    public static boolean m9978a(Context context, Uri uri) {
        if (context == null || uri == null) {
            return false;
        }
        try {
            return !context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", uri), 0).isEmpty();
        } catch (Exception unused) {
            IAlog.m9902a("%sFyberDeepLink: Invalid url ", uri);
            return false;
        }
    }
}
