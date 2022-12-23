package androidx.paging;

import androidx.paging.PagingSource;
import bf0.C21050d;
import bi0.C21073k;
import cf0.C21140n;
import ci0.C21207b;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.moovit.home.lines.search.C16002a;
import ff0.C23349c;
import java.lang.ref.WeakReference;
import java.util.AbstractList;
import java.util.ArrayList;
import kotlin.collections.C23825c;
import kotlinx.coroutines.C24199d;
import kotlinx.coroutines.CoroutineDispatcher;
import lf0.C24240p;
import mf0.C24362h;
import p178n2.C5817b;
import p178n2.C5824h;
import p178n2.C5831m;
import p584jl.C17885a;
import wh0.C25177g;
import wh0.C25184i0;
import wh0.C25208q0;
import wh0.C25211r0;
import wh0.C25235z;

public abstract class PagedList<T> extends AbstractList<T> {

    /* renamed from: j */
    public static final /* synthetic */ int f4118j = 0;

    /* renamed from: b */
    public final PagingSource<?, T> f4119b;

    /* renamed from: c */
    public final C25235z f4120c;

    /* renamed from: d */
    public final CoroutineDispatcher f4121d;

    /* renamed from: e */
    public final C5831m<T> f4122e;

    /* renamed from: f */
    public final C1091c f4123f;

    /* renamed from: g */
    public final int f4124g;

    /* renamed from: h */
    public final ArrayList f4125h = new ArrayList();

    /* renamed from: i */
    public final ArrayList f4126i = new ArrayList();

    /* renamed from: androidx.paging.PagedList$a */
    public static final class C1089a<Key, Value> {

        /* renamed from: a */
        public DataSource<Key, Value> f4127a;

        /* renamed from: b */
        public final C1091c f4128b;

        /* renamed from: c */
        public C25211r0 f4129c = C25211r0.f63482b;

        /* renamed from: d */
        public C25208q0 f4130d;

        /* renamed from: e */
        public C25208q0 f4131e;

        /* renamed from: f */
        public Key f4132f;

        public C1089a(C16002a aVar, C1091c cVar) {
            C24362h.m61211f(aVar, "dataSource");
            this.f4127a = aVar;
            this.f4128b = cVar;
        }

        /* renamed from: a */
        public final ContiguousPagedList mo4414a() {
            LegacyPagingSource legacyPagingSource;
            boolean z;
            C24199d dVar = this.f4131e;
            if (dVar == null) {
                dVar = C25184i0.f63460b;
            }
            C24199d dVar2 = dVar;
            DataSource<Key, Value> dataSource = this.f4127a;
            if (dataSource == null) {
                legacyPagingSource = null;
            } else {
                legacyPagingSource = new LegacyPagingSource(dVar2, dataSource);
            }
            boolean z2 = true;
            if (legacyPagingSource instanceof LegacyPagingSource) {
                int i = this.f4128b.f4133a;
                int i2 = legacyPagingSource.f4117d;
                if (i2 == Integer.MIN_VALUE || i == i2) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    legacyPagingSource.f4117d = i;
                } else {
                    throw new IllegalStateException(C16530d.m42014g(C13555b.m33972k("Page size is already set to "), legacyPagingSource.f4117d, '.').toString());
                }
            }
            if (legacyPagingSource == null) {
                z2 = false;
            }
            if (z2) {
                int i3 = PagedList.f4118j;
                C25211r0 r0Var = this.f4129c;
                CoroutineDispatcher coroutineDispatcher = this.f4130d;
                if (coroutineDispatcher == null) {
                    C21207b bVar = C25184i0.f63459a;
                    coroutineDispatcher = C21073k.f52890a.mo60300z();
                }
                CoroutineDispatcher coroutineDispatcher2 = coroutineDispatcher;
                C1091c cVar = this.f4128b;
                Key key = this.f4132f;
                C24362h.m61211f(legacyPagingSource, "pagingSource");
                C24362h.m61211f(r0Var, "coroutineScope");
                C24362h.m61211f(coroutineDispatcher2, "notifyDispatcher");
                C24362h.m61211f(dVar2, "fetchDispatcher");
                C24362h.m61211f(cVar, "config");
                return new ContiguousPagedList(cVar, (PagingSource.C1100b.C1102b) C25177g.m63220d(new PagedList$Companion$create$resolvedInitialPage$1(legacyPagingSource, new PagingSource.C1096a.C1099c(cVar.f4136d, key, cVar.f4135c), (C23349c<? super PagedList$Companion$create$resolvedInitialPage$1>) null)), legacyPagingSource, key, coroutineDispatcher2, dVar2, r0Var);
            }
            throw new IllegalStateException("PagedList cannot be built without a PagingSource or DataSource".toString());
        }
    }

    /* renamed from: androidx.paging.PagedList$b */
    public static abstract class C1090b {
        /* renamed from: a */
        public abstract void mo4415a(int i, int i2);

        /* renamed from: b */
        public abstract void mo4416b(int i, int i2);

        /* renamed from: c */
        public abstract void mo4417c(int i, int i2);
    }

    /* renamed from: androidx.paging.PagedList$c */
    public static final class C1091c {

        /* renamed from: a */
        public final int f4133a;

        /* renamed from: b */
        public final int f4134b;

        /* renamed from: c */
        public final boolean f4135c;

        /* renamed from: d */
        public final int f4136d;

        /* renamed from: e */
        public final int f4137e;

        /* renamed from: androidx.paging.PagedList$c$a */
        public static final class C1092a {

            /* renamed from: a */
            public int f4138a = -1;

            /* renamed from: b */
            public int f4139b = -1;

            /* renamed from: c */
            public int f4140c = Integer.MAX_VALUE;
        }

        public C1091c(int i, int i2, int i3, int i4, boolean z) {
            this.f4133a = i;
            this.f4134b = i2;
            this.f4135c = z;
            this.f4136d = i3;
            this.f4137e = i4;
        }
    }

    /* renamed from: androidx.paging.PagedList$d */
    public static abstract class C1093d {

        /* renamed from: a */
        public C5824h f4141a;

        /* renamed from: b */
        public C5824h f4142b;

        /* renamed from: c */
        public C5824h f4143c;

        /* renamed from: androidx.paging.PagedList$d$a */
        public /* synthetic */ class C1094a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f4144a;

            static {
                int[] iArr = new int[LoadType.values().length];
                iArr[LoadType.REFRESH.ordinal()] = 1;
                iArr[LoadType.PREPEND.ordinal()] = 2;
                iArr[LoadType.APPEND.ordinal()] = 3;
                f4144a = iArr;
            }
        }

        public C1093d() {
            C5824h.C5826b bVar = C5824h.C5826b.f18791c;
            this.f4141a = bVar;
            this.f4142b = bVar;
            this.f4143c = bVar;
        }

        /* renamed from: a */
        public abstract void mo4418a(LoadType loadType, C5824h hVar);

        /* renamed from: b */
        public final void mo4419b(LoadType loadType, C5824h hVar) {
            C24362h.m61211f(loadType, "type");
            C24362h.m61211f(hVar, "state");
            int i = C1094a.f4144a[loadType.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        if (!C24362h.m61206a(this.f4143c, hVar)) {
                            this.f4143c = hVar;
                        } else {
                            return;
                        }
                    }
                } else if (!C24362h.m61206a(this.f4142b, hVar)) {
                    this.f4142b = hVar;
                } else {
                    return;
                }
            } else if (!C24362h.m61206a(this.f4141a, hVar)) {
                this.f4141a = hVar;
            } else {
                return;
            }
            mo4418a(loadType, hVar);
        }
    }

    public PagedList(PagingSource<?, T> pagingSource, C25235z zVar, CoroutineDispatcher coroutineDispatcher, C5831m<T> mVar, C1091c cVar) {
        C24362h.m61211f(pagingSource, "pagingSource");
        C24362h.m61211f(zVar, "coroutineScope");
        C24362h.m61211f(coroutineDispatcher, "notifyDispatcher");
        C24362h.m61211f(cVar, "config");
        this.f4119b = pagingSource;
        this.f4120c = zVar;
        this.f4121d = coroutineDispatcher;
        this.f4122e = mVar;
        this.f4123f = cVar;
        this.f4124g = (cVar.f4134b * 2) + cVar.f4133a;
    }

    /* renamed from: B */
    public final void mo4403B(int i, int i2) {
        if (i2 != 0) {
            for (WeakReference weakReference : C23825c.m58489A0(this.f4125h)) {
                C1090b bVar = (C1090b) weakReference.get();
                if (bVar != null) {
                    bVar.mo4416b(i, i2);
                }
            }
        }
    }

    /* renamed from: C */
    public final void mo4404C(C5817b bVar) {
        C24362h.m61211f(bVar, WidgetMessageParser.KEY_CALLBACK);
        C21140n.m49440b0(this.f4125h, new PagedList$removeWeakCallback$1(bVar));
    }

    /* renamed from: D */
    public final void mo4405D(C24240p<? super LoadType, ? super C5824h, C21050d> pVar) {
        C24362h.m61211f(pVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        C21140n.m49440b0(this.f4126i, new PagedList$removeWeakLoadStateListener$1(pVar));
    }

    /* renamed from: e */
    public final void mo4406e(C1090b bVar) {
        C24362h.m61211f(bVar, WidgetMessageParser.KEY_CALLBACK);
        C21140n.m49440b0(this.f4125h, PagedList$addWeakCallback$1.f4145f);
        this.f4125h.add(new WeakReference(bVar));
    }

    public final T get(int i) {
        return this.f4122e.get(i);
    }

    /* renamed from: i */
    public final void mo4408i(C24240p<? super LoadType, ? super C5824h, C21050d> pVar) {
        C24362h.m61211f(pVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        C21140n.m49440b0(this.f4126i, PagedList$addWeakLoadStateListener$1.f4146f);
        this.f4126i.add(new WeakReference(pVar));
        mo4396m(pVar);
    }

    /* renamed from: m */
    public abstract void mo4396m(C24240p<? super LoadType, ? super C5824h, C21050d> pVar);

    /* renamed from: n */
    public PagingSource<?, T> mo4397n() {
        return this.f4119b;
    }

    /* renamed from: p */
    public abstract boolean mo4398p();

    public final /* bridge */ T remove(int i) {
        return super.remove(i);
    }

    /* renamed from: s */
    public boolean mo4410s() {
        return mo4398p();
    }

    public final int size() {
        return this.f4122e.mo21703e();
    }

    /* renamed from: u */
    public final void mo4412u(int i) {
        if (i < 0 || i >= size()) {
            StringBuilder r = C25541a.m63887r("Index: ", i, ", Size: ");
            r.append(size());
            throw new IndexOutOfBoundsException(r.toString());
        }
        C5831m<T> mVar = this.f4122e;
        mVar.f18812h = C17885a.m44464u(i - mVar.f18807c, 0, mVar.f18811g - 1);
        mo4399x(i);
    }

    /* renamed from: x */
    public abstract void mo4399x(int i);

    /* renamed from: z */
    public final void mo4413z(int i, int i2) {
        if (i2 != 0) {
            for (WeakReference weakReference : C23825c.m58489A0(this.f4125h)) {
                C1090b bVar = (C1090b) weakReference.get();
                if (bVar != null) {
                    bVar.mo4415a(i, i2);
                }
            }
        }
    }
}
