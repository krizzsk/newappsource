package androidx.paging;

import androidx.paging.PagedList;
import androidx.paging.PagingSource;
import ff0.C23349c;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.C24199d;
import kotlinx.coroutines.CoroutineDispatcher;
import mf0.C24362h;
import p178n2.C5821e;
import p178n2.C5824h;
import p178n2.C5831m;
import wh0.C25177g;
import wh0.C25211r0;
import wh0.C25235z;

/* renamed from: androidx.paging.b */
public final class C1106b<K, V> {

    /* renamed from: a */
    public final C25235z f4172a;

    /* renamed from: b */
    public final PagedList.C1091c f4173b;

    /* renamed from: c */
    public final PagingSource<K, V> f4174c;

    /* renamed from: d */
    public final CoroutineDispatcher f4175d;

    /* renamed from: e */
    public final CoroutineDispatcher f4176e;

    /* renamed from: f */
    public final C1108b<V> f4177f;

    /* renamed from: g */
    public final C1107a<K> f4178g;

    /* renamed from: h */
    public final AtomicBoolean f4179h = new AtomicBoolean(false);

    /* renamed from: i */
    public C5821e f4180i = new C5821e(this);

    /* renamed from: androidx.paging.b$a */
    public interface C1107a<K> {
        /* renamed from: i */
        K mo4433i();

        /* renamed from: n */
        K mo4434n();
    }

    /* renamed from: androidx.paging.b$b */
    public interface C1108b<V> {
        /* renamed from: a */
        void mo4393a(LoadType loadType, C5824h hVar);

        /* renamed from: b */
        boolean mo4394b(LoadType loadType, PagingSource.C1100b.C1102b<?, V> bVar);
    }

    /* renamed from: androidx.paging.b$c */
    public /* synthetic */ class C1109c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4181a;

        static {
            int[] iArr = new int[LoadType.values().length];
            iArr[LoadType.PREPEND.ordinal()] = 1;
            iArr[LoadType.APPEND.ordinal()] = 2;
            f4181a = iArr;
        }
    }

    public C1106b(C25211r0 r0Var, PagedList.C1091c cVar, LegacyPagingSource legacyPagingSource, CoroutineDispatcher coroutineDispatcher, C24199d dVar, C1108b bVar, C5831m mVar) {
        C24362h.m61211f(bVar, "pageConsumer");
        C24362h.m61211f(mVar, "keyProvider");
        this.f4172a = r0Var;
        this.f4173b = cVar;
        this.f4174c = legacyPagingSource;
        this.f4175d = coroutineDispatcher;
        this.f4176e = dVar;
        this.f4177f = bVar;
        this.f4178g = mVar;
    }

    /* renamed from: a */
    public final void mo4430a(LoadType loadType, PagingSource.C1100b.C1102b<K, V> bVar) {
        C5824h.C5826b bVar2;
        if (!this.f4179h.get()) {
            if (this.f4177f.mo4394b(loadType, bVar)) {
                int i = C1109c.f4181a[loadType.ordinal()];
                if (i == 1) {
                    mo4432c();
                } else if (i == 2) {
                    mo4431b();
                } else {
                    throw new IllegalStateException("Can only fetch more during append/prepend");
                }
            } else {
                C5821e eVar = this.f4180i;
                if (bVar.f4155a.isEmpty()) {
                    bVar2 = C5824h.C5826b.f18790b;
                } else {
                    bVar2 = C5824h.C5826b.f18791c;
                }
                eVar.mo4419b(loadType, bVar2);
            }
        }
    }

    /* renamed from: b */
    public final void mo4431b() {
        K i = this.f4178g.mo4433i();
        if (i == null) {
            mo4430a(LoadType.APPEND, PagingSource.C1100b.C1102b.f4154f);
            return;
        }
        C5821e eVar = this.f4180i;
        LoadType loadType = LoadType.APPEND;
        eVar.mo4419b(loadType, C5824h.C5825a.f18789b);
        PagedList.C1091c cVar = this.f4173b;
        C25177g.m63218b(this.f4172a, this.f4176e, new LegacyPageFetcher$scheduleLoad$1(this, new PagingSource.C1096a.C1097a(cVar.f4133a, i, cVar.f4135c), loadType, (C23349c<? super LegacyPageFetcher$scheduleLoad$1>) null), 2);
    }

    /* renamed from: c */
    public final void mo4432c() {
        K n = this.f4178g.mo4434n();
        if (n == null) {
            mo4430a(LoadType.PREPEND, PagingSource.C1100b.C1102b.f4154f);
            return;
        }
        C5821e eVar = this.f4180i;
        LoadType loadType = LoadType.PREPEND;
        eVar.mo4419b(loadType, C5824h.C5825a.f18789b);
        PagedList.C1091c cVar = this.f4173b;
        C25177g.m63218b(this.f4172a, this.f4176e, new LegacyPageFetcher$scheduleLoad$1(this, new PagingSource.C1096a.C1098b(cVar.f4133a, n, cVar.f4135c), loadType, (C23349c<? super LegacyPageFetcher$scheduleLoad$1>) null), 2);
    }
}
