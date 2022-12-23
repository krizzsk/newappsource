package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.play_billing.zza;
import com.moovit.app.subscription.MoovitSubscriptionsManager;
import p431cy.C16525b;

/* renamed from: com.android.billingclient.api.w */
public final class C1967w extends BroadcastReceiver {

    /* renamed from: a */
    public final C1954j f6808a;

    /* renamed from: b */
    public boolean f6809b;

    /* renamed from: c */
    public final /* synthetic */ C16525b f6810c;

    public /* synthetic */ C1967w(C16525b bVar, C1954j jVar) {
        this.f6810c = bVar;
        this.f6808a = jVar;
    }

    public final void onReceive(Context context, Intent intent) {
        ((MoovitSubscriptionsManager) this.f6808a).mo45937g(zza.zzg(intent, "BillingBroadcastManager"), zza.zzi(intent.getExtras()));
    }
}
