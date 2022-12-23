package com.vungle.warren;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.vungle.warren.a */
public final class C23089a extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ AdActivity f58594a;

    public C23089a(AdActivity adActivity) {
        this.f58594a = adActivity;
    }

    public final void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("command");
        stringExtra.getClass();
        if (!stringExtra.equals("stopAll")) {
            VungleLogger.m57032e("AdActivity#connectBroadcastReceiver", String.format("Receiving Invalid Broadcast: %1$s", new Object[]{stringExtra}));
            return;
        }
        this.f58594a.finish();
    }
}
