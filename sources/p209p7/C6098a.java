package p209p7;

import androidx.viewpager2.widget.C1373d;
import bf0.C21049c;
import com.cubic.umo.Environment;
import com.cubic.umo.pass.prefs.Cache;

/* renamed from: p7.a */
public final class C6098a {

    /* renamed from: b */
    public static final Object f19361b = new Object();

    /* renamed from: c */
    public static C6098a f19362c;

    /* renamed from: a */
    public final C1373d f19363a;

    /* renamed from: p7.a$a */
    public static final class C6099a {
        /* renamed from: a */
        public static C6098a m14634a() {
            C6098a aVar;
            synchronized (C6098a.f19361b) {
                aVar = C6098a.f19362c;
                if (aVar == null) {
                    throw new IllegalStateException("The CubicSDK has not been initialized.");
                }
            }
            return aVar;
        }
    }

    public C6098a(C1373d dVar) {
        this.f19363a = dVar;
        C21049c<Cache> cVar = Cache.f8326d;
        Cache.C2259a.m6090a((Environment) dVar.f5105b);
    }
}
