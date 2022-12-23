package com.google.android.play.core.assetpacks;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.app.C0262r;
import com.google.android.play.core.appupdate.C14226d;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import p434dd.C16546c0;
import p458ed.C16809c;

/* renamed from: com.google.android.play.core.assetpacks.x */
public final class C14334x extends C16809c {

    /* renamed from: g */
    public final C14276i1 f36109g;

    /* renamed from: h */
    public final C14323u0 f36110h;

    /* renamed from: i */
    public final C16546c0 f36111i;

    /* renamed from: j */
    public final C14287l0 f36112j;

    /* renamed from: k */
    public final C14335x0 f36113k;

    /* renamed from: l */
    public final C16546c0 f36114l;

    /* renamed from: m */
    public final C16546c0 f36115m;

    /* renamed from: n */
    public final C14245a2 f36116n;

    /* renamed from: o */
    public final Handler f36117o = new Handler(Looper.getMainLooper());

    public C14334x(Context context, C14276i1 i1Var, C14323u0 u0Var, C16546c0 c0Var, C14335x0 x0Var, C14287l0 l0Var, C16546c0 c0Var2, C16546c0 c0Var3, C14245a2 a2Var) {
        super(new C0262r("AssetPackServiceListenerRegistry"), new IntentFilter("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE"), context);
        this.f36109g = i1Var;
        this.f36110h = u0Var;
        this.f36111i = c0Var;
        this.f36113k = x0Var;
        this.f36112j = l0Var;
        this.f36114l = c0Var2;
        this.f36115m = c0Var3;
        this.f36116n = a2Var;
    }

    /* renamed from: a */
    public final void mo42763a(Context context, Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE");
        if (bundleExtra != null) {
            ArrayList<String> stringArrayList = bundleExtra.getStringArrayList("pack_names");
            if (stringArrayList == null || stringArrayList.size() != 1) {
                this.f43762a.mo975b("Corrupt bundle received from broadcast.", new Object[0]);
                return;
            }
            C14263f0 i = AssetPackState.m35444i(bundleExtra, stringArrayList.get(0), this.f36113k, this.f36116n, C14226d.f35750e);
            this.f43762a.mo974a("ListenerRegistryBroadcastReceiver.onReceive: %s", i);
            if (((PendingIntent) bundleExtra.getParcelable("confirmation_intent")) != null) {
                this.f36112j.getClass();
            }
            ((Executor) this.f36115m.zza()).execute(new C14322u(this, bundleExtra, i));
            ((Executor) this.f36114l.zza()).execute(new C14318t(this, bundleExtra));
            return;
        }
        this.f43762a.mo975b("Empty bundle received from broadcast.", new Object[0]);
    }
}
