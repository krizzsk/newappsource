package com.facebook.internal;

import android.net.Uri;
import android.os.Bundle;
import mf0.C24362h;
import p009a8.C0115o;
import p262t8.C6606a;

/* renamed from: com.facebook.internal.t */
public final class C2431t extends C2392d {
    public C2431t(String str, Bundle bundle) {
        super(str, bundle);
        Uri uri;
        bundle = bundle == null ? new Bundle() : bundle;
        if (C24362h.m61206a(str, "oauth")) {
            C2397f0 f0Var = C2397f0.f8630a;
            uri = C2397f0.m6308b(bundle, C2393d0.m6287b(), "oauth/authorize");
        } else {
            C2397f0 f0Var2 = C2397f0.f8630a;
            String b = C2393d0.m6287b();
            uri = C2397f0.m6308b(bundle, b, C0115o.m213d() + "/dialog/" + str);
        }
        if (!C6606a.m15601b(this)) {
            try {
                this.f8625a = uri;
            } catch (Throwable th) {
                C6606a.m15600a(this, th);
            }
        }
    }
}
