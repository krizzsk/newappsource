package com.fyber.inneractive.sdk.activities;

import android.view.View;

/* renamed from: com.fyber.inneractive.sdk.activities.c */
public class C2533c implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ InneractiveInternalBrowserActivity f9020a;

    public C2533c(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f9020a = inneractiveInternalBrowserActivity;
    }

    public void onClick(View view) {
        if (this.f9020a.f9009d.canGoBack()) {
            this.f9020a.f9009d.goBack();
        }
    }
}
