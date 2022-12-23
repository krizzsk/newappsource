package com.fyber.inneractive.sdk.config;

import android.content.Context;
import java.io.Serializable;

/* renamed from: com.fyber.inneractive.sdk.config.k */
public class C2672k implements C2697t {

    /* renamed from: a */
    public Context f9343a;

    /* renamed from: b */
    public C2675c f9344b = new C2675c();

    /* renamed from: com.fyber.inneractive.sdk.config.k$b */
    public static class C2674b {

        /* renamed from: a */
        public static C2672k f9345a = new C2672k();
    }

    /* renamed from: com.fyber.inneractive.sdk.config.k$c */
    public static class C2675c implements Serializable {
        public static final long serialVersionUID = 2;

        /* renamed from: a */
        public String f9346a;

        /* renamed from: b */
        public boolean f9347b;

        /* renamed from: c */
        public boolean f9348c;

        public C2675c() {
        }
    }

    /* renamed from: a */
    public static String m6749a() {
        C2675c cVar = C2674b.f9345a.f9344b;
        if (cVar != null) {
            return cVar.f9346a;
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m6750b() {
        C2675c cVar = C2674b.f9345a.f9344b;
        if (cVar != null) {
            return cVar.f9348c;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m6751c() {
        C2675c cVar = C2674b.f9345a.f9344b;
        if (cVar != null) {
            return cVar.f9347b;
        }
        return false;
    }
}
