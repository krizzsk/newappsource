package com.moovit.map;

import com.moovit.map.MapFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import o20.C18700f;
import p472er.C16864f;
import p495fq.C17058c;
import p757qu.C19181d;
import p977zz.C20935e;
import p977zz.C20944i0;

/* renamed from: com.moovit.map.l */
public final class C16287l {

    /* renamed from: a */
    public final MapFragment f42560a;

    /* renamed from: b */
    public final C16288a f42561b = new C16288a();

    /* renamed from: c */
    public final ArrayList f42562c = new ArrayList(1);

    /* renamed from: d */
    public final ArrayList f42563d = new ArrayList(1);

    /* renamed from: e */
    public final HashSet f42564e = new HashSet();

    /* renamed from: f */
    public final HashSet f42565f = new HashSet();

    /* renamed from: g */
    public final HashSet f42566g = new HashSet();

    /* renamed from: h */
    public final HashSet f42567h = new HashSet();

    /* renamed from: i */
    public final HashSet f42568i = new HashSet();

    /* renamed from: j */
    public final HashSet f42569j = new HashSet();

    /* renamed from: com.moovit.map.l$a */
    public class C16288a extends MapFragment.C16236q {
        public C16288a() {
        }

        /* renamed from: c */
        public final void mo48515c(int i) {
            if (!MapFragment.C16236q.m41430b(i)) {
                C16287l lVar = C16287l.this;
                HashSet hashSet = lVar.f42564e;
                HashSet hashSet2 = lVar.f42565f;
                HashSet hashSet3 = lVar.f42566g;
                MapFragment mapFragment = lVar.f42560a;
                Objects.requireNonNull(mapFragment);
                C16287l.m41566a(hashSet, hashSet2, hashSet3, new C19181d(mapFragment, 2), new C16864f(lVar, 2));
                C16287l lVar2 = C16287l.this;
                HashSet hashSet4 = lVar2.f42567h;
                HashSet hashSet5 = lVar2.f42568i;
                HashSet hashSet6 = lVar2.f42569j;
                MapFragment mapFragment2 = lVar2.f42560a;
                Objects.requireNonNull(mapFragment2);
                C16287l.m41566a(hashSet4, hashSet5, hashSet6, new C18700f(mapFragment2, 1), new C17058c(lVar2, 5));
            }
        }
    }

    /* renamed from: com.moovit.map.l$b */
    public interface C16289b {
        /* renamed from: a */
        void mo48821a();
    }

    /* renamed from: com.moovit.map.l$c */
    public interface C16290c {
        /* renamed from: F */
        void mo48822F(Set set);
    }

    public C16287l(MapFragment mapFragment) {
        this.f42560a = mapFragment;
    }

    /* renamed from: a */
    public static void m41566a(HashSet hashSet, HashSet hashSet2, HashSet hashSet3, C20935e eVar, C20935e eVar2) {
        hashSet2.clear();
        hashSet2.addAll(hashSet);
        hashSet.clear();
        eVar.invoke(hashSet);
        hashSet3.clear();
        hashSet3.addAll(hashSet);
        hashSet3.removeAll(hashSet2);
        if (!hashSet3.isEmpty()) {
            eVar2.invoke(new C20944i0(Collections.unmodifiableSet(hashSet), Collections.unmodifiableSet(hashSet3)));
        }
    }
}
