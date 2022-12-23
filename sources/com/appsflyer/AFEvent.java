package com.appsflyer;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.HashMap;
import java.util.Map;

public abstract class AFEvent {
    public String $$a;
    public Map<String, Object> $$b;
    public String AFDateFormat;
    public int AFDeepLinkManager;
    public String collectIntentsFromActivities;
    private byte[] context;
    private AppsFlyerRequestListener dateFormatUTC;
    private final boolean getDataFormatter;
    public boolean getInstance;
    public final Map<String, Object> params;
    private String requestListener;
    private Application urlString;
    public String valueOf;
    public String values;

    public AFEvent() {
        this((String) null, (String) null, (Boolean) null, (Context) null);
    }

    public final byte[] $$a() {
        return this.context;
    }

    public String addChannel(String str) {
        String configuredChannel = AppsFlyerLibCore.getInstance().getConfiguredChannel(context());
        if (configuredChannel != null) {
            return Uri.parse(str).buildUpon().appendQueryParameter("channel", configuredChannel).build().toString();
        }
        return str;
    }

    public AFEvent addParams(Map<String, ?> map) {
        this.params.putAll(map);
        return this;
    }

    public AFEvent context(Context context2) {
        if (context2 != null) {
            this.urlString = (Application) context2.getApplicationContext();
        }
        return this;
    }

    public AppsFlyerRequestListener getRequestListener() {
        return this.dateFormatUTC;
    }

    public boolean isEncrypt() {
        return this.getDataFormatter;
    }

    public AFEvent key(String str) {
        this.requestListener = str;
        return this;
    }

    public Map<String, Object> params() {
        return this.params;
    }

    public AFEvent post(byte[] bArr) {
        this.context = bArr;
        return this;
    }

    public AFEvent requestListener(AppsFlyerRequestListener appsFlyerRequestListener) {
        this.dateFormatUTC = appsFlyerRequestListener;
        return this;
    }

    public AFEvent urlString(String str) {
        this.collectIntentsFromActivities = str;
        return this;
    }

    public final boolean valueOf() {
        return this.getInstance;
    }

    public AFEvent(String str, String str2, Boolean bool, Context context2) {
        this.params = new HashMap();
        this.values = str;
        this.collectIntentsFromActivities = str2;
        this.getDataFormatter = bool != null ? bool.booleanValue() : true;
        context(context2);
    }

    public Application context() {
        return this.urlString;
    }

    public String key() {
        return this.requestListener;
    }

    public String urlString() {
        return this.collectIntentsFromActivities;
    }
}
