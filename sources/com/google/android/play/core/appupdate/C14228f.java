package com.google.android.play.core.appupdate;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.appcompat.app.C0262r;
import p381bd.C13586a;
import p458ed.C16809c;

/* renamed from: com.google.android.play.core.appupdate.f */
public final class C14228f extends C16809c {
    public C14228f(Context context) {
        super(new C0262r("AppUpdateListenerRegistry"), new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), context);
    }

    /* renamed from: a */
    public final void mo42763a(Context context, Intent intent) {
        Intent intent2 = intent;
        if (!context.getPackageName().equals(intent2.getStringExtra("package.name"))) {
            this.f43762a.mo974a("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent2.getStringExtra("package.name"));
            return;
        }
        this.f43762a.mo974a("List of extras in received intent:", new Object[0]);
        for (String next : intent.getExtras().keySet()) {
            this.f43762a.mo974a("Key: %s; value: %s", next, intent.getExtras().get(next));
        }
        C0262r rVar = this.f43762a;
        rVar.mo974a("List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
        rVar.mo974a("Key: %s; value: %s", "install.status", Integer.valueOf(intent2.getIntExtra("install.status", 0)));
        rVar.mo974a("Key: %s; value: %s", "error.code", Integer.valueOf(intent2.getIntExtra("error.code", 0)));
        C13586a aVar = new C13586a(intent2.getIntExtra("install.status", 0), intent2.getIntExtra("error.code", 0), intent2.getLongExtra("bytes.downloaded", 0), intent2.getLongExtra("total.bytes.to.download", 0), intent2.getStringExtra("package.name"));
        this.f43762a.mo974a("ListenerRegistryBroadcastReceiver.onReceive: %s", aVar);
        mo49482c(aVar);
    }
}
