package com.appboy.push.support;

import android.os.Build;
import android.text.Html;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import com.braze.configuration.BrazeConfigurationProvider;

public class HtmlUtils {
    private static final String TAG = AppboyLogger.getBrazeLogTag(HtmlUtils.class);

    public static CharSequence getHtmlSpannedTextIfEnabled(BrazeConfigurationProvider brazeConfigurationProvider, String str) {
        if (StringUtils.isNullOrBlank(str)) {
            AppboyLogger.m5448d(TAG, "Cannot create html spanned text on null or empty text. Returning blank string.");
            return str;
        } else if (!brazeConfigurationProvider.getIsPushNotificationHtmlRenderingEnabled()) {
            return str;
        } else {
            if (Build.VERSION.SDK_INT >= 24) {
                return Html.fromHtml(str, 0);
            }
            return Html.fromHtml(str);
        }
    }
}
