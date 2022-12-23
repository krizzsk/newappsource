package p262t8;

import ce0.C21100e;
import com.appboy.Constants;
import com.facebook.internal.instrument.InstrumentData;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import mf0.C24362h;
import p009a8.C0098d0;
import p009a8.C0115o;

/* renamed from: t8.a */
public final class C6606a {

    /* renamed from: a */
    public static final Set<Object> f20451a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    public static boolean f20452b;

    /* renamed from: a */
    public static final void m15600a(Object obj, Throwable th) {
        C24362h.m61211f(obj, "o");
        if (f20452b) {
            f20451a.add(obj);
            C0115o oVar = C0115o.f331a;
            if (C0098d0.m169b()) {
                C21100e.m49323R(th);
                InstrumentData.Type type = InstrumentData.Type.CrashShield;
                C24362h.m61211f(type, Constants.APPBOY_PUSH_TITLE_KEY);
                new InstrumentData(th, type).mo12559c();
            }
        }
    }

    /* renamed from: b */
    public static final boolean m15601b(Object obj) {
        C24362h.m61211f(obj, "o");
        return f20451a.contains(obj);
    }
}
