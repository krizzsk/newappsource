package com.vungle.warren;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import ce0.C21095c;
import ce0.C21103h;
import ce0.C21119t;
import com.vungle.warren.AdConfig;
import com.vungle.warren.model.admarkup.AdMarkup;
import com.vungle.warren.persistence.C23192a;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import od0.C24566m;
import td0.C24935e;

/* renamed from: com.vungle.warren.m */
public final class C23176m implements Callable<Pair<Boolean, C24566m>> {

    /* renamed from: b */
    public final /* synthetic */ String f58831b;

    /* renamed from: c */
    public final /* synthetic */ C23135f0 f58832c;

    /* renamed from: d */
    public final /* synthetic */ C23236v0 f58833d;

    /* renamed from: e */
    public final /* synthetic */ AdConfig.AdSize f58834e;

    /* renamed from: f */
    public final /* synthetic */ String f58835f = null;

    public C23176m(String str, C23138g0 g0Var, C23236v0 v0Var, AdConfig.AdSize adSize) {
        this.f58831b = str;
        this.f58832c = g0Var;
        this.f58833d = v0Var;
        this.f58834e = adSize;
    }

    public final Object call() throws Exception {
        Pair pair;
        Context appContext;
        if (!Vungle.isInitialized()) {
            int i = C23179n.f58839a;
            C23179n.m57205c(this.f58831b, this.f58832c, 9);
            return new Pair(Boolean.FALSE, (Object) null);
        } else if (TextUtils.isEmpty(this.f58831b)) {
            C23179n.m57205c(this.f58831b, this.f58832c, 13);
            return new Pair(Boolean.FALSE, (Object) null);
        } else {
            C24566m mVar = (C24566m) ((C23192a) this.f58833d.mo58350c(C23192a.class)).mo58281p(C24566m.class, this.f58831b).get();
            if (mVar == null) {
                C23179n.m57205c(this.f58831b, this.f58832c, 13);
                return new Pair(Boolean.FALSE, (Object) null);
            }
            if (!AdConfig.AdSize.isBannerAdSize(this.f58834e)) {
                C23179n.m57205c(this.f58831b, this.f58832c, 30);
                pair = new Pair(Boolean.FALSE, mVar);
            } else {
                String str = this.f58831b;
                String str2 = this.f58835f;
                AdConfig.AdSize adSize = this.f58834e;
                boolean z = false;
                if (AdConfig.AdSize.isBannerAdSize(adSize) && (appContext = Vungle.appContext()) != null && !TextUtils.isEmpty(str)) {
                    AdMarkup a = C21095c.m49293a(str2);
                    if (str2 == null || a != null) {
                        C23236v0 a2 = C23236v0.m57280a(appContext);
                        z = Boolean.TRUE.equals(new C24935e(((C21103h) a2.mo58350c(C21103h.class)).mo53296a().submit(new C23173l(appContext, a, str, adSize))).get(((C21119t) a2.mo58350c(C21119t.class)).mo53295a(), TimeUnit.MILLISECONDS));
                    }
                }
                if (!z) {
                    C23179n.m57205c(this.f58831b, this.f58832c, 10);
                    pair = new Pair(Boolean.FALSE, mVar);
                } else {
                    pair = new Pair(Boolean.TRUE, mVar);
                }
            }
            return pair;
        }
    }
}
