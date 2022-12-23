package com.moovit.app.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import androidx.lifecycle.C1006f;
import androidx.lifecycle.C1033p;
import ce0.C21100e;
import com.moovit.app.MoovitAppActivity;
import java.lang.ref.WeakReference;
import java.util.EnumSet;
import java.util.concurrent.atomic.AtomicBoolean;
import p130j2.C5367a;

public class LazyAdDisplayHelper implements C1006f {

    /* renamed from: b */
    public final C14723a f37445b = new C14723a();

    /* renamed from: c */
    public final WeakReference<MoovitAppActivity> f37446c;

    /* renamed from: d */
    public final AdSource f37447d;

    /* renamed from: e */
    public final AtomicBoolean f37448e;

    /* renamed from: com.moovit.app.ads.LazyAdDisplayHelper$a */
    public class C14723a extends BroadcastReceiver {
        public C14723a() {
        }

        public final void onReceive(Context context, Intent intent) {
            LazyAdDisplayHelper lazyAdDisplayHelper = LazyAdDisplayHelper.this;
            MoovitAppActivity moovitAppActivity = lazyAdDisplayHelper.f37446c.get();
            if (moovitAppActivity != null && lazyAdDisplayHelper.f37448e.compareAndSet(false, true)) {
                MobileAdsManager.m37073h().mo44716q(moovitAppActivity, lazyAdDisplayHelper.f37447d);
            }
        }
    }

    public LazyAdDisplayHelper(MoovitAppActivity moovitAppActivity, AdSource adSource) {
        C21100e.m49373x(moovitAppActivity, "activity");
        this.f37446c = new WeakReference<>(moovitAppActivity);
        C21100e.m49373x(adSource, "adSource");
        this.f37447d = adSource;
        this.f37448e = new AtomicBoolean(false);
    }

    /* renamed from: e */
    public final /* synthetic */ void mo3607e(C1033p pVar) {
    }

    public final /* synthetic */ void onDestroy(C1033p pVar) {
    }

    public final /* synthetic */ void onPause(C1033p pVar) {
    }

    public final /* synthetic */ void onResume(C1033p pVar) {
    }

    public final void onStart(C1033p pVar) {
        MoovitAppActivity moovitAppActivity = this.f37446c.get();
        if (moovitAppActivity != null) {
            AdSource adSource = this.f37447d;
            C14723a aVar = this.f37445b;
            Uri build = MobileAdsManager.f37453r.buildUpon().appendPath(adSource.name()).build();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.moovit.ads.action.ad_loaded");
            intentFilter.addDataScheme(build.getScheme());
            intentFilter.addDataAuthority(build.getHost(), (String) null);
            intentFilter.addDataPath(build.getPath(), 0);
            C5367a.m13473a(moovitAppActivity).mo21146b(aVar, intentFilter);
        }
    }

    public final void onStop(C1033p pVar) {
        MoovitAppActivity moovitAppActivity = this.f37446c.get();
        if (moovitAppActivity != null) {
            C14723a aVar = this.f37445b;
            EnumSet<AdSource> enumSet = MobileAdsManager.f37451p;
            C5367a.m13473a(moovitAppActivity).mo21148d(aVar);
        }
        pVar.getLifecycle().mo4226c(this);
    }
}
