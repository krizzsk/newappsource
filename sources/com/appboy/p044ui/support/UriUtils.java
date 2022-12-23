package com.appboy.p044ui.support;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import com.appboy.IAppboyNavigator;
import com.appboy.p044ui.AppboyNavigator;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.appboy.ui.support.UriUtils */
public class UriUtils {
    private static final String TAG = AppboyLogger.getBrazeLogTag(UriUtils.class);

    public static Intent getMainActivityIntent(Context context, Bundle bundle) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        launchIntentForPackage.setFlags(AppboyNavigator.getAppboyNavigator().getIntentFlags(IAppboyNavigator.IntentFlagPurpose.URI_UTILS_GET_MAIN_ACTIVITY_INTENT));
        if (bundle != null) {
            launchIntentForPackage.putExtras(bundle);
        }
        return launchIntentForPackage;
    }

    public static Map<String, String> getQueryParameters(Uri uri) {
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null) {
            String str = TAG;
            AppboyLogger.m5457v(str, "Encoded query is null for Uri: " + uri + " Returning empty map for query parameters");
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        try {
            if (uri.isOpaque()) {
                uri = Uri.parse("://").buildUpon().encodedQuery(encodedQuery).build();
            }
            for (String next : uri.getQueryParameterNames()) {
                String queryParameter = uri.getQueryParameter(next);
                if (!StringUtils.isNullOrEmpty(next) && !StringUtils.isNullOrEmpty(queryParameter)) {
                    hashMap.put(next, queryParameter);
                }
            }
        } catch (Exception e) {
            String str2 = TAG;
            AppboyLogger.m5452e(str2, "Failed to map the query parameters of Uri: " + uri, e);
        }
        return hashMap;
    }

    public static boolean isActivityRegisteredInManifest(Context context, String str) {
        try {
            if (context.getPackageManager().getActivityInfo(new ComponentName(context, str), 0) != null) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            String str2 = TAG;
            AppboyLogger.m5460w(str2, "Could not find activity info for class with name: " + str, e);
            return false;
        }
    }
}
