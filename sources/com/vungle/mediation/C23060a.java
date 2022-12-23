package com.vungle.mediation;

import android.os.Bundle;

/* renamed from: com.vungle.mediation.a */
public final class C23060a {

    /* renamed from: com.vungle.mediation.a$a */
    public static class C23061a {

        /* renamed from: a */
        public String f58484a;

        /* renamed from: b */
        public String f58485b;
    }

    /* renamed from: a */
    public static C23061a m56985a(Bundle bundle, String str) {
        String str2;
        if (bundle == null || !bundle.containsKey("uniqueVungleRequestKey")) {
            str2 = null;
        } else {
            str2 = bundle.getString("uniqueVungleRequestKey");
        }
        C23061a aVar = new C23061a();
        aVar.f58484a = str;
        aVar.f58485b = str2;
        return aVar;
    }
}
