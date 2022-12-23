package androidx.paging;

import androidx.paging.C1106b;
import androidx.paging.PagedList;
import androidx.paging.PagingSource;
import bf0.C21050d;
import ff0.C23349c;
import java.lang.ref.WeakReference;
import kotlin.collections.C23825c;
import kotlinx.coroutines.C24199d;
import kotlinx.coroutines.CoroutineDispatcher;
import lf0.C24240p;
import mf0.C24362h;
import p178n2.C5821e;
import p178n2.C5824h;
import p178n2.C5831m;
import wh0.C25177g;
import wh0.C25211r0;

public class ContiguousPagedList<K, V> extends PagedList<V> implements C5831m.C5832a, C1106b.C1108b<V> {

    /* renamed from: v */
    public static final /* synthetic */ int f4091v = 0;

    /* renamed from: k */
    public final PagingSource<K, V> f4092k;

    /* renamed from: l */
    public final K f4093l;

    /* renamed from: m */
    public int f4094m;

    /* renamed from: n */
    public int f4095n;

    /* renamed from: o */
    public boolean f4096o;

    /* renamed from: p */
    public boolean f4097p;

    /* renamed from: q */
    public int f4098q = Integer.MAX_VALUE;

    /* renamed from: r */
    public int f4099r = Integer.MIN_VALUE;

    /* renamed from: s */
    public boolean f4100s;

    /* renamed from: t */
    public final boolean f4101t;

    /* renamed from: u */
    public final C1106b<K, V> f4102u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContiguousPagedList(PagedList.C1091c cVar, PagingSource.C1100b.C1102b bVar, LegacyPagingSource legacyPagingSource, Object obj, CoroutineDispatcher coroutineDispatcher, C24199d dVar, C25211r0 r0Var) {
        super(legacyPagingSource, r0Var, coroutineDispatcher, new C5831m(), cVar);
        boolean z;
        int i;
        int i2;
        int i3;
        boolean z2;
        PagedList.C1091c cVar2 = cVar;
        PagingSource.C1100b.C1102b bVar2 = bVar;
        C24362h.m61211f(bVar2, "initialPage");
        this.f4092k = legacyPagingSource;
        this.f4093l = obj;
        if (cVar2.f4137e != Integer.MAX_VALUE) {
            z = true;
        } else {
            z = false;
        }
        this.f4101t = z;
        this.f4102u = new C1106b(r0Var, cVar, legacyPagingSource, coroutineDispatcher, dVar, this, this.f4122e);
        if (cVar2.f4135c) {
            C5831m<T> mVar = this.f4122e;
            int i4 = bVar2.f4158d;
            if (i4 != Integer.MIN_VALUE) {
                i2 = i4;
            } else {
                i2 = 0;
            }
            int i5 = bVar2.f4159e;
            if (i5 != Integer.MIN_VALUE) {
                i3 = i5;
            } else {
                i3 = 0;
            }
            if (i4 == Integer.MIN_VALUE || i5 == Integer.MIN_VALUE) {
                z2 = false;
            } else {
                z2 = true;
            }
            mVar.mo21707a(i2, bVar, i3, 0, this, z2);
        } else {
            C5831m<T> mVar2 = this.f4122e;
            int i6 = bVar2.f4158d;
            if (i6 != Integer.MIN_VALUE) {
                i = i6;
            } else {
                i = 0;
            }
            mVar2.mo21707a(0, bVar, 0, i, this, false);
        }
        LoadType loadType = LoadType.REFRESH;
    }

    /* renamed from: E */
    public final void mo4389E(int i, int i2, int i3) {
        mo4413z(i, i2);
        mo4403B(i + i2, i3);
    }

    /* renamed from: F */
    public final void mo4390F(int i, int i2, int i3) {
        mo4413z(i, i2);
        mo4403B(0, i3);
        this.f4098q += i3;
        this.f4099r += i3;
    }

    /* renamed from: G */
    public final void mo4391G(int i, int i2) {
        if (i2 != 0) {
            for (WeakReference weakReference : C23825c.m58489A0(this.f4125h)) {
                PagedList.C1090b bVar = (PagedList.C1090b) weakReference.get();
                if (bVar != null) {
                    bVar.mo4417c(i, i2);
                }
            }
        }
    }

    /* renamed from: I */
    public final void mo4392I(boolean z) {
        boolean z2;
        boolean z3 = true;
        if (!this.f4096o || this.f4098q > this.f4123f.f4134b) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!this.f4097p || this.f4099r < (size() - 1) - this.f4123f.f4134b) {
            z3 = false;
        }
        if (z2 || z3) {
            if (z2) {
                this.f4096o = false;
            }
            if (z3) {
                this.f4097p = false;
            }
            if (z) {
                C25177g.m63218b(this.f4120c, this.f4121d, new ContiguousPagedList$tryDispatchBoundaryCallbacks$1(this, z2, z3, (C23349c<? super ContiguousPagedList$tryDispatchBoundaryCallbacks$1>) null), 2);
            } else if (z2) {
                C24362h.m61208c((Object) null);
                throw null;
            } else if (z3) {
                C24362h.m61208c((Object) null);
                throw null;
            }
        }
    }

    /* renamed from: a */
    public final void mo4393a(LoadType loadType, C5824h hVar) {
        C24362h.m61211f(loadType, "type");
        C24362h.m61211f(hVar, "state");
        C25177g.m63218b(this.f4120c, this.f4121d, new PagedList$dispatchStateChangeAsync$1(this, loadType, hVar, (C23349c<? super PagedList$dispatchStateChangeAsync$1>) null), 2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0093, code lost:
        if ((!r0.isEmpty()) != false) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e1, code lost:
        if ((!r0.isEmpty()) != false) goto L_0x00e3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ea  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo4394b(androidx.paging.LoadType r10, androidx.paging.PagingSource.C1100b.C1102b<?, V> r11) {
        /*
            r9 = this;
            java.lang.String r0 = "type"
            mf0.C24362h.m61211f(r10, r0)
            java.lang.String r0 = "page"
            mf0.C24362h.m61211f(r11, r0)
            java.util.List<Value> r0 = r11.f4155a
            n2.m<T> r1 = r9.f4122e
            int r2 = r1.f18807c
            int r3 = r1.f18812h
            int r3 = r3 + r2
            int r4 = r1.f18811g
            int r4 = r4 / 2
            int r4 = r4 + r2
            r2 = 1
            r5 = 0
            if (r3 <= r4) goto L_0x001f
            r3 = 1
            goto L_0x0020
        L_0x001f:
            r3 = 0
        L_0x0020:
            boolean r4 = r9.f4101t
            if (r4 == 0) goto L_0x0046
            androidx.paging.PagedList$c r4 = r9.f4123f
            int r4 = r4.f4137e
            int r6 = r9.f4124g
            int r7 = r0.size()
            int r8 = r1.f18811g
            int r8 = r8 + r7
            if (r8 <= r4) goto L_0x0041
            java.util.ArrayList r4 = r1.f18806b
            int r4 = r4.size()
            if (r4 <= r2) goto L_0x0041
            int r1 = r1.f18811g
            if (r1 < r6) goto L_0x0041
            r1 = 1
            goto L_0x0042
        L_0x0041:
            r1 = 0
        L_0x0042:
            if (r1 == 0) goto L_0x0046
            r1 = 1
            goto L_0x0047
        L_0x0046:
            r1 = 0
        L_0x0047:
            androidx.paging.LoadType r4 = androidx.paging.LoadType.APPEND
            if (r10 != r4) goto L_0x0096
            if (r1 == 0) goto L_0x0053
            if (r3 != 0) goto L_0x0053
            r9.f4095n = r5
            goto L_0x00e5
        L_0x0053:
            n2.m<T> r10 = r9.f4122e
            r10.getClass()
            java.util.List<Value> r1 = r11.f4155a
            int r1 = r1.size()
            if (r1 != 0) goto L_0x0061
            goto L_0x0083
        L_0x0061:
            java.util.ArrayList r4 = r10.f18806b
            r4.add(r11)
            int r11 = r10.f18811g
            int r11 = r11 + r1
            r10.f18811g = r11
            int r11 = r10.f18808d
            int r11 = java.lang.Math.min(r11, r1)
            int r4 = r1 - r11
            if (r11 == 0) goto L_0x007a
            int r6 = r10.f18808d
            int r6 = r6 - r11
            r10.f18808d = r6
        L_0x007a:
            int r6 = r10.f18807c
            int r10 = r10.f18811g
            int r6 = r6 + r10
            int r6 = r6 - r1
            r9.mo4389E(r6, r11, r4)
        L_0x0083:
            int r10 = r9.f4095n
            int r11 = r0.size()
            int r10 = r10 - r11
            r9.f4095n = r10
            if (r10 <= 0) goto L_0x00e5
            boolean r10 = r0.isEmpty()
            r10 = r10 ^ r2
            if (r10 == 0) goto L_0x00e5
            goto L_0x00e3
        L_0x0096:
            androidx.paging.LoadType r4 = androidx.paging.LoadType.PREPEND
            if (r10 != r4) goto L_0x01c2
            if (r1 == 0) goto L_0x00a1
            if (r3 == 0) goto L_0x00a1
            r9.f4094m = r5
            goto L_0x00e5
        L_0x00a1:
            n2.m<T> r10 = r9.f4122e
            r10.getClass()
            java.util.List<Value> r1 = r11.f4155a
            int r1 = r1.size()
            if (r1 != 0) goto L_0x00af
            goto L_0x00d1
        L_0x00af:
            java.util.ArrayList r4 = r10.f18806b
            r4.add(r5, r11)
            int r11 = r10.f18811g
            int r11 = r11 + r1
            r10.f18811g = r11
            int r11 = r10.f18807c
            int r11 = java.lang.Math.min(r11, r1)
            int r1 = r1 - r11
            if (r11 == 0) goto L_0x00c7
            int r4 = r10.f18807c
            int r4 = r4 - r11
            r10.f18807c = r4
        L_0x00c7:
            int r4 = r10.f18809e
            int r4 = r4 - r1
            r10.f18809e = r4
            int r10 = r10.f18807c
            r9.mo4390F(r10, r11, r1)
        L_0x00d1:
            int r10 = r9.f4094m
            int r11 = r0.size()
            int r10 = r10 - r11
            r9.f4094m = r10
            if (r10 <= 0) goto L_0x00e5
            boolean r10 = r0.isEmpty()
            r10 = r10 ^ r2
            if (r10 == 0) goto L_0x00e5
        L_0x00e3:
            r10 = 1
            goto L_0x00e6
        L_0x00e5:
            r10 = 0
        L_0x00e6:
            boolean r11 = r9.f4101t
            if (r11 == 0) goto L_0x01c1
            if (r3 == 0) goto L_0x0152
            androidx.paging.b<K, V> r11 = r9.f4102u
            n2.e r11 = r11.f4180i
            n2.h r11 = r11.f4142b
            boolean r11 = r11 instanceof p178n2.C5824h.C5825a
            if (r11 != 0) goto L_0x01c1
            n2.m<T> r11 = r9.f4122e
            boolean r0 = r9.f4100s
            androidx.paging.PagedList$c r1 = r9.f4123f
            int r1 = r1.f4137e
            int r3 = r9.f4124g
            r11.getClass()
            r4 = 0
        L_0x0104:
            boolean r6 = r11.mo21708b(r1, r3, r5)
            if (r6 == 0) goto L_0x011f
            java.util.ArrayList r6 = r11.f18806b
            java.lang.Object r6 = r6.remove(r5)
            androidx.paging.PagingSource$b$b r6 = (androidx.paging.PagingSource.C1100b.C1102b) r6
            java.util.List<Value> r6 = r6.f4155a
            int r6 = r6.size()
            int r4 = r4 + r6
            int r7 = r11.f18811g
            int r7 = r7 - r6
            r11.f18811g = r7
            goto L_0x0104
        L_0x011f:
            int r1 = r11.f18812h
            int r1 = r1 - r4
            if (r1 >= 0) goto L_0x0125
            r1 = 0
        L_0x0125:
            r11.f18812h = r1
            if (r4 <= 0) goto L_0x013f
            if (r0 == 0) goto L_0x0135
            int r0 = r11.f18807c
            int r1 = r0 + r4
            r11.f18807c = r1
            r9.mo4413z(r0, r4)
            goto L_0x013f
        L_0x0135:
            int r0 = r11.f18809e
            int r0 = r0 + r4
            r11.f18809e = r0
            int r11 = r11.f18807c
            r9.mo4391G(r11, r4)
        L_0x013f:
            if (r4 <= 0) goto L_0x0142
            goto L_0x0143
        L_0x0142:
            r2 = 0
        L_0x0143:
            if (r2 == 0) goto L_0x01c1
            androidx.paging.b<K, V> r11 = r9.f4102u
            n2.e r11 = r11.f4180i
            androidx.paging.LoadType r0 = androidx.paging.LoadType.PREPEND
            n2.h$b r1 = p178n2.C5824h.C5826b.f18791c
            r11.mo4419b(r0, r1)
            goto L_0x01c1
        L_0x0152:
            androidx.paging.b<K, V> r11 = r9.f4102u
            n2.e r11 = r11.f4180i
            n2.h r11 = r11.f4143c
            boolean r11 = r11 instanceof p178n2.C5824h.C5825a
            if (r11 != 0) goto L_0x01c1
            n2.m<T> r11 = r9.f4122e
            boolean r0 = r9.f4100s
            androidx.paging.PagedList$c r1 = r9.f4123f
            int r1 = r1.f4137e
            int r3 = r9.f4124g
            r11.getClass()
            r4 = 0
        L_0x016a:
            java.util.ArrayList r6 = r11.f18806b
            int r6 = r6.size()
            int r6 = r6 + -1
            boolean r6 = r11.mo21708b(r1, r3, r6)
            if (r6 == 0) goto L_0x0192
            java.util.ArrayList r6 = r11.f18806b
            int r7 = r6.size()
            int r7 = r7 - r2
            java.lang.Object r6 = r6.remove(r7)
            androidx.paging.PagingSource$b$b r6 = (androidx.paging.PagingSource.C1100b.C1102b) r6
            java.util.List<Value> r6 = r6.f4155a
            int r6 = r6.size()
            int r4 = r4 + r6
            int r7 = r11.f18811g
            int r7 = r7 - r6
            r11.f18811g = r7
            goto L_0x016a
        L_0x0192:
            int r1 = r11.f18812h
            int r3 = r11.f18811g
            int r6 = r3 + -1
            if (r1 <= r6) goto L_0x019b
            r1 = r6
        L_0x019b:
            r11.f18812h = r1
            if (r4 <= 0) goto L_0x01b0
            int r1 = r11.f18807c
            int r1 = r1 + r3
            if (r0 == 0) goto L_0x01ad
            int r0 = r11.f18808d
            int r0 = r0 + r4
            r11.f18808d = r0
            r9.mo4413z(r1, r4)
            goto L_0x01b0
        L_0x01ad:
            r9.mo4391G(r1, r4)
        L_0x01b0:
            if (r4 <= 0) goto L_0x01b3
            goto L_0x01b4
        L_0x01b3:
            r2 = 0
        L_0x01b4:
            if (r2 == 0) goto L_0x01c1
            androidx.paging.b<K, V> r11 = r9.f4102u
            n2.e r11 = r11.f4180i
            androidx.paging.LoadType r0 = androidx.paging.LoadType.APPEND
            n2.h$b r1 = p178n2.C5824h.C5826b.f18791c
            r11.mo4419b(r0, r1)
        L_0x01c1:
            return r10
        L_0x01c2:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "unexpected result type "
            java.lang.String r10 = mf0.C24362h.m61216k(r10, r0)
            r11.<init>(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.ContiguousPagedList.mo4394b(androidx.paging.LoadType, androidx.paging.PagingSource$b$b):boolean");
    }

    /* renamed from: d */
    public final void mo4395d(int i) {
        boolean z = false;
        mo4403B(0, i);
        C5831m<T> mVar = this.f4122e;
        if (mVar.f18807c > 0 || mVar.f18808d > 0) {
            z = true;
        }
        this.f4100s = z;
    }

    /* renamed from: m */
    public final void mo4396m(C24240p<? super LoadType, ? super C5824h, C21050d> pVar) {
        C24362h.m61211f(pVar, WidgetMessageParser.KEY_CALLBACK);
        C5821e eVar = this.f4102u.f4180i;
        eVar.getClass();
        pVar.invoke(LoadType.REFRESH, eVar.f4141a);
        pVar.invoke(LoadType.PREPEND, eVar.f4142b);
        pVar.invoke(LoadType.APPEND, eVar.f4143c);
    }

    /* renamed from: n */
    public final PagingSource<K, V> mo4397n() {
        return this.f4092k;
    }

    /* renamed from: p */
    public final boolean mo4398p() {
        return this.f4102u.f4179h.get();
    }

    /* renamed from: x */
    public final void mo4399x(int i) {
        int i2 = this.f4123f.f4134b;
        C5831m<T> mVar = this.f4122e;
        int i3 = mVar.f18807c;
        int i4 = i2 - (i - i3);
        int i5 = ((i2 + i) + 1) - (i3 + mVar.f18811g);
        int max = Math.max(i4, this.f4094m);
        this.f4094m = max;
        if (max > 0) {
            C1106b<K, V> bVar = this.f4102u;
            C5824h hVar = bVar.f4180i.f4142b;
            if ((hVar instanceof C5824h.C5826b) && !hVar.f18788a) {
                bVar.mo4432c();
            }
        }
        int max2 = Math.max(i5, this.f4095n);
        this.f4095n = max2;
        if (max2 > 0) {
            C1106b<K, V> bVar2 = this.f4102u;
            C5824h hVar2 = bVar2.f4180i.f4143c;
            if ((hVar2 instanceof C5824h.C5826b) && !hVar2.f18788a) {
                bVar2.mo4431b();
            }
        }
        this.f4098q = Math.min(this.f4098q, i);
        this.f4099r = Math.max(this.f4099r, i);
        mo4392I(true);
    }
}
