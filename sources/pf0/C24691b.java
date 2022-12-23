package pf0;

import java.util.Random;
import mf0.C24362h;

/* renamed from: pf0.b */
public final class C24691b extends C24690a {

    /* renamed from: d */
    public final C24692a f62522d = new C24692a();

    /* renamed from: pf0.b$a */
    public static final class C24692a extends ThreadLocal<Random> {
        public final Object initialValue() {
            return new Random();
        }
    }

    /* renamed from: e */
    public final Random mo61175e() {
        Object obj = this.f62522d.get();
        C24362h.m61210e(obj, "implStorage.get()");
        return (Random) obj;
    }
}
