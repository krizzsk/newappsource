package com.fyber.inneractive.sdk.factories;

import com.fyber.inneractive.sdk.interfaces.C2809a;
import com.fyber.inneractive.sdk.response.C3644a;
import com.fyber.inneractive.sdk.response.C3645b;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.HashMap;

/* renamed from: com.fyber.inneractive.sdk.factories.b */
public final class C2754b {

    /* renamed from: a */
    public final HashMap<C3644a, C2756b> f9534a = new HashMap<>();

    /* renamed from: com.fyber.inneractive.sdk.factories.b$a */
    public static class C2755a {

        /* renamed from: a */
        public static C2754b f9535a = new C2754b();
    }

    /* renamed from: com.fyber.inneractive.sdk.factories.b$b */
    public interface C2756b {
        /* renamed from: a */
        C2809a mo13317a();

        /* renamed from: b */
        C3645b mo13318b();
    }

    /* renamed from: a */
    public C3645b mo13508a(C3644a aVar) {
        C2756b bVar = this.f9534a.get(aVar);
        if (bVar != null) {
            return bVar.mo13318b();
        }
        return null;
    }

    /* renamed from: a */
    public void mo13509a(C3644a aVar, C2756b bVar) {
        if (this.f9534a.containsKey(aVar)) {
            IAlog.m9906e("Handler already exists for ad type %s! : %s", aVar, this.f9534a.get(aVar));
            return;
        }
        this.f9534a.put(aVar, bVar);
    }
}
