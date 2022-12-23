package p603kg;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.HashMap;
import java.util.Set;
import p956ze.C20839b;

/* renamed from: kg.c */
public final class C18040c {

    /* renamed from: a */
    public final HashMap f46152a = new HashMap();

    @KeepForSdk
    /* renamed from: kg.c$a */
    public static class C18041a {

        /* renamed from: a */
        public final Class f46153a = C18038a.class;

        /* renamed from: b */
        public final C20839b f46154b;

        @KeepForSdk
        public C18041a(C20839b bVar) {
            this.f46154b = bVar;
        }
    }

    @KeepForSdk
    public C18040c(Set<C18041a> set) {
        for (C18041a next : set) {
            this.f46152a.put(next.f46153a, next.f46154b);
        }
    }
}
