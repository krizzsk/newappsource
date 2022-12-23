package com.fyber.inneractive.sdk.activities;

import android.view.View;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.activities.e */
public class C2535e implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ InneractiveInternalBrowserActivity f9022a;

    public C2535e(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f9022a = inneractiveInternalBrowserActivity;
    }

    public void onClick(View view) {
        this.f9022a.f9009d.reload();
        int i = IAlog.f12814a;
        IAlog.m9900a(1, (Exception) null, "%s %s", "AD_INTERNAL_BROWSER_REFRESH", this.f9022a.f9009d.getUrl());
    }
}
