package p066e0;

import java.util.HashMap;

/* renamed from: e0.v */
public final class C4458v {

    /* renamed from: a */
    public static final Object f15529a = new Object();

    /* renamed from: b */
    public static final HashMap f15530b = new HashMap();

    /* renamed from: a */
    public static C4432i m11668a(C4459w wVar) {
        C4432i iVar;
        synchronized (f15529a) {
            iVar = (C4432i) f15530b.get(wVar);
        }
        if (iVar == null) {
            return C4432i.f15498a;
        }
        return iVar;
    }
}
