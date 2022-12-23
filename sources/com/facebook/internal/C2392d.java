package com.facebook.internal;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import mf0.C24362h;
import p009a8.C0115o;

/* renamed from: com.facebook.internal.d */
public class C2392d {

    /* renamed from: a */
    public Uri f8625a;

    public C2392d(String str, Bundle bundle) {
        Uri uri;
        bundle = bundle == null ? new Bundle() : bundle;
        GamingAction[] values = GamingAction.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (GamingAction rawValue : values) {
            arrayList.add(rawValue.getRawValue());
        }
        if (arrayList.contains(str)) {
            C2397f0 f0Var = C2397f0.f8630a;
            int i = C2393d0.f8626a;
            C0115o oVar = C0115o.f331a;
            uri = C2397f0.m6308b(bundle, C13555b.m33971j(new Object[]{"fb.gg"}, 1, "%s", "java.lang.String.format(format, *args)"), C24362h.m61216k(str, "/dialog/"));
        } else {
            C2397f0 f0Var2 = C2397f0.f8630a;
            uri = C2397f0.m6308b(bundle, C2393d0.m6286a(), C0115o.m213d() + "/dialog/" + str);
        }
        this.f8625a = uri;
    }
}
