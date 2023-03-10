package com.appboy.p044ui.actions;

import android.net.Uri;
import android.os.Bundle;
import com.appboy.enums.Channel;
import com.appboy.support.StringUtils;

/* renamed from: com.appboy.ui.actions.ActionFactory */
public class ActionFactory {
    public static UriAction createUriActionFromUri(Uri uri, Bundle bundle, boolean z, Channel channel) {
        if (uri != null) {
            return new UriAction(uri, bundle, z, channel);
        }
        return null;
    }

    public static UriAction createUriActionFromUrlString(String str, Bundle bundle, boolean z, Channel channel) {
        if (!StringUtils.isNullOrBlank(str)) {
            return createUriActionFromUri(Uri.parse(str), bundle, z, channel);
        }
        return null;
    }
}
