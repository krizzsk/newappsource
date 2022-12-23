package com.appsflyer.internal.model.event;

import android.content.Context;
import com.appsflyer.AFEvent;
import com.appsflyer.AFHelper;

public abstract class BackgroundEvent extends AFEvent {
    private final boolean dateFormatUTC;
    private boolean getDataFormatter;
    private final boolean getRequestListener;

    public BackgroundEvent() {
        this((String) null, (String) null, (Boolean) null, (Boolean) null, (Boolean) null, (Context) null);
    }

    public String body() {
        return AFHelper.toJsonObject(params()).toString();
    }

    public boolean proxyMode() {
        return this.getRequestListener;
    }

    public boolean readResponse() {
        return this.dateFormatUTC;
    }

    public BackgroundEvent trackingStopped(boolean z) {
        this.getDataFormatter = z;
        return this;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackgroundEvent(String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, Context context) {
        super(str, str2, Boolean.valueOf(bool3 != null ? bool3.booleanValue() : false), context);
        boolean z = true;
        this.dateFormatUTC = bool != null ? bool.booleanValue() : true;
        this.getRequestListener = bool2 != null ? bool2.booleanValue() : z;
    }

    public boolean trackingStopped() {
        return this.getDataFormatter;
    }
}
