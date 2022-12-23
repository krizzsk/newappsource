package q00;

import android.annotation.SuppressLint;
import android.content.Context;
import ce0.C21100e;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import p810sz.C19589j;
import p810sz.C19600l;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

/* renamed from: q00.a */
public final class C19047a {

    /* renamed from: d */
    public static C19048a f48441d = new C19048a();

    /* renamed from: a */
    public final Map<String, String> f48442a;

    /* renamed from: b */
    public final IdentityHashMap f48443b;

    /* renamed from: c */
    public final long f48444c;

    /* renamed from: q00.a$a */
    public class C19048a extends C19619s<C19047a> {
        public C19048a() {
            super(1, C19047a.class);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i >= 0 && i <= 1;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            long j;
            int l = pVar.mo51924l();
            C19589j.C19598i iVar = C19589j.f49779k;
            Map o = pVar.mo51961o(iVar, iVar, new HashMap(l));
            if (i >= 1) {
                j = pVar.mo51925m();
            } else {
                j = -1;
            }
            return new C19047a(j, o);
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            C19047a aVar = (C19047a) obj;
            qVar.mo51939l(aVar.f48442a.size());
            Map<String, String> map = aVar.f48442a;
            C19600l.C19609i iVar = C19600l.f49790t;
            qVar.mo51966o(map, iVar, iVar);
            qVar.mo51940m(aVar.f48444c);
        }
    }

    /* renamed from: q00.a$b */
    public static abstract class C19049b<T> {

        /* renamed from: a */
        public final T f48445a;

        public C19049b(T t) {
            this.f48445a = t;
        }

        /* renamed from: a */
        public abstract T mo39882a(Map<String, String> map) throws Exception;
    }

    public C19047a(long j, Map map) {
        C21100e.m49373x(map, "properties");
        this.f48442a = Collections.unmodifiableMap(map);
        this.f48443b = new IdentityHashMap(map.size());
        this.f48444c = j;
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: a */
    public static C19047a m46164a(Context context) {
        return (C19047a) context.getSystemService("user_configuration");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:11|12) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r0 = r3.f48445a;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x001b */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized <T> T mo51505b(q00.C19047a.C19049b<T> r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.IdentityHashMap r0 = r2.f48443b     // Catch:{ all -> 0x0024 }
            boolean r0 = r0.containsKey(r3)     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0011
            java.util.IdentityHashMap r0 = r2.f48443b     // Catch:{ all -> 0x0024 }
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x0024 }
            monitor-exit(r2)
            return r3
        L_0x0011:
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.f48442a     // Catch:{ all -> 0x0024 }
            r3.getClass()     // Catch:{ all -> 0x0024 }
            java.lang.Object r0 = r3.mo39882a(r0)     // Catch:{ Exception -> 0x001b }
            goto L_0x001d
        L_0x001b:
            T r0 = r3.f48445a     // Catch:{ all -> 0x0024 }
        L_0x001d:
            java.util.IdentityHashMap r1 = r2.f48443b     // Catch:{ all -> 0x0024 }
            r1.put(r3, r0)     // Catch:{ all -> 0x0024 }
            monitor-exit(r2)
            return r0
        L_0x0024:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: q00.C19047a.mo51505b(q00.a$b):java.lang.Object");
    }
}
