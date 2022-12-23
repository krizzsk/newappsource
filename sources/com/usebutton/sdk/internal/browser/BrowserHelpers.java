package com.usebutton.sdk.internal.browser;

import android.net.Uri;
import com.usebutton.sdk.internal.events.Events;
import com.usebutton.sdk.internal.models.MetaInfo;
import com.usebutton.sdk.internal.purchasepath.CheckoutManager;
import com.usebutton.sdk.internal.util.JsonBuilder;
import org.json.JSONObject;
import p358af.C13437d;

public class BrowserHelpers {
    public static boolean isStoreUrl(String str) {
        if (str == null) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (parse.isOpaque()) {
            return false;
        }
        String scheme = parse.getScheme();
        if ("market".equals(scheme) && "details".equals(parse.getHost())) {
            return true;
        }
        if (("http".equals(scheme) || "https".equals(scheme)) && "play.google.com".equals(parse.getHost())) {
            return true;
        }
        return false;
    }

    public static JSONObject propertiesForUrl(Uri uri, MetaInfo metaInfo) {
        return JsonBuilder.toJson(Events.PROPERTY_SOURCE_TOKEN, metaInfo.getSourceToken(), "url", stripParameters(uri), Events.PROPERTY_CHECKOUT_EXTENSION, Boolean.valueOf(CheckoutManager.getInstance().hasExtension()), Events.PROPERTY_IS_UNSUPPORTED_PARTNER_URL, Boolean.valueOf(metaInfo.isUnsupportedUrl()));
    }

    private static String stripParameters(Uri uri) {
        if (uri.isOpaque()) {
            return uri.toString();
        }
        String scheme = uri.getScheme();
        if (scheme == null) {
            return "";
        }
        StringBuilder n = C13437d.m33708n(scheme, "://");
        n.append(uri.getHost());
        if (uri.getPath() != null) {
            n.append(uri.getPath());
        }
        return n.toString();
    }
}
