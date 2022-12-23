package com.fyber.inneractive.sdk.config;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.C2660m;
import com.fyber.inneractive.sdk.external.InvalidAppIdException;
import com.fyber.inneractive.sdk.network.C2888b;
import com.fyber.inneractive.sdk.network.C2899f;
import com.fyber.inneractive.sdk.network.C2900f0;
import com.fyber.inneractive.sdk.network.C2916m0;
import com.fyber.inneractive.sdk.network.C2921n0;
import com.fyber.inneractive.sdk.network.C2936u;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.FileNotFoundException;

/* renamed from: com.fyber.inneractive.sdk.config.n */
public class C2679n implements C2936u<IAConfigManager.C2615a> {

    /* renamed from: a */
    public final /* synthetic */ IAConfigManager f9354a;

    public C2679n(IAConfigManager iAConfigManager) {
        this.f9354a = iAConfigManager;
    }

    /* renamed from: a */
    public void mo13154a(Object obj, Exception exc, boolean z) {
        int i;
        IAConfigManager.C2615a aVar = (IAConfigManager.C2615a) obj;
        boolean z2 = false;
        if (aVar != null) {
            if (aVar.f9242d != null) {
                this.f9354a.getClass();
            }
            if (z) {
                IAConfigManager iAConfigManager = this.f9354a;
                IAConfigManager iAConfigManager2 = IAConfigManager.f9202J;
                iAConfigManager.getClass();
                iAConfigManager.f9217e = aVar.f9241c;
                iAConfigManager.f9216d = aVar.f9240b;
                iAConfigManager.f9213a = aVar.f9243e;
                iAConfigManager.f9214b = aVar.f9244f;
            } else {
                IAConfigManager.f9203K = System.currentTimeMillis();
                IAConfigManager iAConfigManager3 = this.f9354a;
                iAConfigManager3.getClass();
                IAlog.m9902a("Got new remote configuration from server:", new Object[0]);
                iAConfigManager3.f9217e = aVar.f9241c;
                iAConfigManager3.f9216d = aVar.f9240b;
                iAConfigManager3.f9213a = aVar.f9243e;
                iAConfigManager3.f9214b = aVar.f9244f;
            }
        } else if (exc instanceof C2899f) {
            IAConfigManager.f9203K = System.currentTimeMillis();
        }
        if (!z) {
            IAConfigManager iAConfigManager4 = this.f9354a;
            boolean f = IAConfigManager.m6636f();
            iAConfigManager4.getClass();
            if (f) {
                iAConfigManager4.mo13187a((Exception) null);
            } else {
                if ((exc instanceof InvalidAppIdException) || (exc instanceof FileNotFoundException) || (!(exc instanceof C2921n0) ? TextUtils.isEmpty(iAConfigManager4.f9215c.trim()) : !((i = ((C2921n0) exc).f9977a) < 400 || i >= 500))) {
                    z2 = true;
                }
                if (z2) {
                    iAConfigManager4.mo13187a(new InvalidAppIdException());
                } else if (exc instanceof C2888b) {
                    iAConfigManager4.mo13187a(exc);
                } else {
                    iAConfigManager4.mo13187a(new IAConfigManager.C2616b());
                }
            }
            if (IAConfigManager.m6636f()) {
                IAConfigManager iAConfigManager5 = this.f9354a;
                if (iAConfigManager5.f9206C == null) {
                    iAConfigManager5.f9206C = new C2900f0(new C2682p(iAConfigManager5), iAConfigManager5.f9218f, new C2660m());
                }
                C2916m0 l = iAConfigManager5.f9206C.mo13677l();
                if (l != C2916m0.RUNNING && l != C2916m0.QUEUED) {
                    iAConfigManager5.f9232t.mo13730c(iAConfigManager5.f9206C);
                }
            }
        }
    }
}
