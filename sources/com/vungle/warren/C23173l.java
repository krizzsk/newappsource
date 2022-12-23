package com.vungle.warren;

import android.content.Context;
import com.vungle.warren.AdConfig;
import com.vungle.warren.model.admarkup.AdMarkup;
import com.vungle.warren.persistence.C23192a;
import java.util.concurrent.Callable;
import od0.C24545c;
import od0.C24566m;

/* renamed from: com.vungle.warren.l */
public final class C23173l implements Callable<Boolean> {

    /* renamed from: b */
    public final /* synthetic */ Context f58823b;

    /* renamed from: c */
    public final /* synthetic */ AdMarkup f58824c;

    /* renamed from: d */
    public final /* synthetic */ String f58825d;

    /* renamed from: e */
    public final /* synthetic */ AdConfig.AdSize f58826e;

    public C23173l(Context context, AdMarkup adMarkup, String str, AdConfig.AdSize adSize) {
        this.f58823b = context;
        this.f58824c = adMarkup;
        this.f58825d = str;
        this.f58826e = adSize;
    }

    public final Object call() throws Exception {
        String str;
        boolean z;
        AdConfig.AdSize adSize;
        if (!Vungle.isInitialized()) {
            int i = C23179n.f58839a;
            return Boolean.FALSE;
        }
        C23192a aVar = (C23192a) C23236v0.m57280a(this.f58823b).mo58350c(C23192a.class);
        AdMarkup adMarkup = this.f58824c;
        if (adMarkup != null) {
            str = adMarkup.mo58243a();
        } else {
            str = null;
        }
        C24566m mVar = (C24566m) aVar.mo58281p(C24566m.class, this.f58825d).get();
        if (mVar == null) {
            return Boolean.FALSE;
        }
        if (mVar.mo60833c() && str == null) {
            return Boolean.FALSE;
        }
        C24545c cVar = aVar.mo58277l(this.f58825d, str).get();
        if (cVar == null) {
            return Boolean.FALSE;
        }
        AdConfig.AdSize a = mVar.mo60831a();
        AdConfig.AdSize a2 = cVar.f62224w.mo58261a();
        boolean z2 = true;
        if (this.f58826e != AdConfig.AdSize.VUNGLE_MREC || !AdConfig.AdSize.isDefaultAdSize(a) || !AdConfig.AdSize.isDefaultAdSize(a2) || mVar.f62265i != 3) {
            z = false;
        } else {
            z = true;
        }
        if (!mVar.mo60833c() || !AdConfig.AdSize.isNonMrecBannerAdSize(a) || !AdConfig.AdSize.isNonMrecBannerAdSize(a2) || !AdConfig.AdSize.isNonMrecBannerAdSize(this.f58826e)) {
            z2 = z;
        }
        if (z2 || ((adSize = this.f58826e) == a && adSize == a2)) {
            return Boolean.valueOf(Vungle.canPlayAd(cVar));
        }
        return Boolean.FALSE;
    }
}
