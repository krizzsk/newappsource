package p911xg;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: xg.d */
public final class C20494d {

    /* renamed from: b */
    public static volatile C20494d f51884b;

    /* renamed from: c */
    public static final C20494d f51885c = new C20494d(0);

    /* renamed from: a */
    public final Map<Object, Object> f51886a;

    public C20494d() {
        this.f51886a = new HashMap();
    }

    /* renamed from: a */
    public static void m48117a() {
        if (f51884b == null) {
            synchronized (C20494d.class) {
                if (f51884b == null) {
                    Class<?> cls = C20493c.f51883a;
                    C20494d dVar = null;
                    if (cls != null) {
                        try {
                            dVar = (C20494d) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke((Object) null, new Object[0]);
                        } catch (Exception unused) {
                        }
                    }
                    if (dVar == null) {
                        dVar = f51885c;
                    }
                    f51884b = dVar;
                }
            }
        }
    }

    public C20494d(int i) {
        this.f51886a = Collections.emptyMap();
    }
}
