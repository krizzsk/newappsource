package androidx.camera.core.impl;

import android.util.ArrayMap;
import androidx.camera.core.impl.Config;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p066e0.C4424e;
import p066e0.C4425e0;
import p066e0.C4427f0;
import p066e0.C4428g;
import p066e0.C4450p0;

/* renamed from: androidx.camera.core.impl.e */
public final class C0578e {

    /* renamed from: h */
    public static final C0572a f1968h = Config.C0564a.m1591a(Integer.TYPE, "camerax.core.captureConfig.rotation");

    /* renamed from: i */
    public static final C0572a f1969i = Config.C0564a.m1591a(Integer.class, "camerax.core.captureConfig.jpegQuality");

    /* renamed from: a */
    public final List<DeferrableSurface> f1970a;

    /* renamed from: b */
    public final Config f1971b;

    /* renamed from: c */
    public final int f1972c;

    /* renamed from: d */
    public final List<C4424e> f1973d;

    /* renamed from: e */
    public final boolean f1974e;

    /* renamed from: f */
    public final C4450p0 f1975f;

    /* renamed from: g */
    public final C4428g f1976g;

    /* renamed from: androidx.camera.core.impl.e$b */
    public interface C0580b {
        /* renamed from: a */
        void mo2483a(C0585i iVar, C0579a aVar);
    }

    public C0578e(ArrayList arrayList, C0590n nVar, int i, List list, boolean z, C4450p0 p0Var, C4428g gVar) {
        this.f1970a = arrayList;
        this.f1971b = nVar;
        this.f1972c = i;
        this.f1973d = Collections.unmodifiableList(list);
        this.f1974e = z;
        this.f1975f = p0Var;
        this.f1976g = gVar;
    }

    /* renamed from: a */
    public final List<DeferrableSurface> mo2478a() {
        return Collections.unmodifiableList(this.f1970a);
    }

    /* renamed from: androidx.camera.core.impl.e$a */
    public static final class C0579a {

        /* renamed from: a */
        public final HashSet f1977a;

        /* renamed from: b */
        public C0589m f1978b;

        /* renamed from: c */
        public int f1979c;

        /* renamed from: d */
        public ArrayList f1980d;

        /* renamed from: e */
        public boolean f1981e;

        /* renamed from: f */
        public C4427f0 f1982f;

        /* renamed from: g */
        public C4428g f1983g;

        public C0579a() {
            this.f1977a = new HashSet();
            this.f1978b = C0589m.m1674t();
            this.f1979c = -1;
            this.f1980d = new ArrayList();
            this.f1981e = false;
            this.f1982f = C4427f0.m11609c();
        }

        /* renamed from: a */
        public final void mo2479a(List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                mo2480b((C4424e) it.next());
            }
        }

        /* renamed from: b */
        public final void mo2480b(C4424e eVar) {
            if (!this.f1980d.contains(eVar)) {
                this.f1980d.add(eVar);
            }
        }

        /* renamed from: c */
        public final void mo2481c(Config config) {
            for (Config.C0564a next : config.listOptions()) {
                C0589m mVar = this.f1978b;
                Object obj = null;
                mVar.getClass();
                try {
                    obj = mVar.mo2422a(next);
                } catch (IllegalArgumentException unused) {
                }
                Object a = config.mo2422a(next);
                if (obj instanceof C4425e0) {
                    C4425e0 e0Var = (C4425e0) a;
                    e0Var.getClass();
                    ((C4425e0) obj).f15497a.addAll(Collections.unmodifiableList(new ArrayList(e0Var.f15497a)));
                } else {
                    if (a instanceof C4425e0) {
                        a = ((C4425e0) a).clone();
                    }
                    this.f1978b.mo2502v(next, config.mo2424c(next), a);
                }
            }
        }

        /* renamed from: d */
        public final C0578e mo2482d() {
            ArrayList arrayList = new ArrayList(this.f1977a);
            C0590n s = C0590n.m1678s(this.f1978b);
            int i = this.f1979c;
            ArrayList arrayList2 = this.f1980d;
            boolean z = this.f1981e;
            C4427f0 f0Var = this.f1982f;
            C4450p0 p0Var = C4450p0.f15508b;
            ArrayMap arrayMap = new ArrayMap();
            for (String next : f0Var.mo19987b()) {
                arrayMap.put(next, f0Var.mo19986a(next));
            }
            return new C0578e(arrayList, s, i, arrayList2, z, new C4450p0(arrayMap), this.f1983g);
        }

        public C0579a(C0578e eVar) {
            HashSet hashSet = new HashSet();
            this.f1977a = hashSet;
            this.f1978b = C0589m.m1674t();
            this.f1979c = -1;
            this.f1980d = new ArrayList();
            this.f1981e = false;
            this.f1982f = C4427f0.m11609c();
            hashSet.addAll(eVar.f1970a);
            this.f1978b = C0589m.m1675u(eVar.f1971b);
            this.f1979c = eVar.f1972c;
            this.f1980d.addAll(eVar.f1973d);
            this.f1981e = eVar.f1974e;
            C4450p0 p0Var = eVar.f1975f;
            ArrayMap arrayMap = new ArrayMap();
            for (String next : p0Var.mo19987b()) {
                arrayMap.put(next, p0Var.mo19986a(next));
            }
            this.f1982f = new C4427f0(arrayMap);
        }
    }
}
