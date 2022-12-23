package com.fyber.inneractive.sdk.activities;

import android.view.View;

/* renamed from: com.fyber.inneractive.sdk.activities.d */
public class C2534d implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ InneractiveInternalBrowserActivity f9021a;

    public C2534d(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f9021a = inneractiveInternalBrowserActivity;
    }

    public void onClick(View view) {
        if (this.f9021a.f9009d.canGoForward()) {
            this.f9021a.f9009d.goForward();
        }
    }
}
