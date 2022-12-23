package androidx.camera.core.impl;

import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.HashSet;
import p066e0.C4427f0;
import p066e0.C4428g;
import p066e0.C4450p0;

/* renamed from: androidx.camera.core.impl.f */
public interface C0581f {

    /* renamed from: androidx.camera.core.impl.f$a */
    public static final class C0582a implements C0581f {

        /* renamed from: a */
        public final C0578e f1984a;

        public C0582a() {
            HashSet hashSet = new HashSet();
            C0589m t = C0589m.m1674t();
            ArrayList arrayList = new ArrayList();
            C4427f0 c = C4427f0.m11609c();
            ArrayList arrayList2 = new ArrayList(hashSet);
            C0590n s = C0590n.m1678s(t);
            C4450p0 p0Var = C4450p0.f15508b;
            ArrayMap arrayMap = new ArrayMap();
            for (String next : c.mo19987b()) {
                arrayMap.put(next, c.mo19986a(next));
            }
            this.f1984a = new C0578e(arrayList2, s, -1, arrayList, false, new C4450p0(arrayMap), (C4428g) null);
        }

        public final C0578e getCaptureConfig() {
            return this.f1984a;
        }

        public final void getId() {
        }
    }

    C0578e getCaptureConfig();

    void getId();
}
