package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.play_billing.zza;
import com.google.android.gms.internal.play_billing.zzc;
import com.moovit.app.subscription.MoovitSubscriptionsManager;

/* renamed from: com.android.billingclient.api.r */
public final class C1962r implements ServiceConnection {

    /* renamed from: b */
    public final Object f6787b = new Object();

    /* renamed from: c */
    public boolean f6788c = false;

    /* renamed from: d */
    public C1945d f6789d;

    /* renamed from: e */
    public final /* synthetic */ C1943c f6790e;

    public /* synthetic */ C1962r(C1943c cVar, MoovitSubscriptionsManager.C15358a aVar) {
        this.f6790e = cVar;
        this.f6789d = aVar;
    }

    /* renamed from: a */
    public final void mo9581a(C1949f fVar) {
        synchronized (this.f6787b) {
            try {
                C1945d dVar = this.f6789d;
                if (dVar != null) {
                    int i = fVar.f6770a;
                    MoovitSubscriptionsManager.this.f39762d.open();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zza.zzj("BillingClient", "Billing service connected.");
        this.f6790e.f6743f = zzc.zzn(iBinder);
        C1943c cVar = this.f6790e;
        if (cVar.mo9570l(new C1961q(this), 30000, new C1960p(this, 0), cVar.mo9567i()) == null) {
            mo9581a(this.f6790e.mo9569k());
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        zza.zzk("BillingClient", "Billing service disconnected.");
        this.f6790e.f6743f = null;
        this.f6790e.f6738a = 0;
        synchronized (this.f6787b) {
            try {
                C1945d dVar = this.f6789d;
                if (dVar != null) {
                    MoovitSubscriptionsManager.this.f39762d.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
