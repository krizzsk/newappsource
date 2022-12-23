package androidx.paging;

import androidx.recyclerview.widget.C1164b;
import androidx.recyclerview.widget.C1166c;
import androidx.recyclerview.widget.C1241u;
import androidx.recyclerview.widget.RecyclerView;
import bf0.C21050d;
import com.moovit.home.lines.search.C16004b;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import lf0.C24240p;
import mf0.C24362h;
import p178n2.C5816a;
import p178n2.C5817b;
import p201p.C6019a;
import sf0.C24858e;

/* renamed from: androidx.paging.a */
public final class C1103a<T> {

    /* renamed from: a */
    public C1241u f4161a;

    /* renamed from: b */
    public final C1166c<T> f4162b;

    /* renamed from: c */
    public C6019a.C6020a f4163c = C6019a.f19239d;

    /* renamed from: d */
    public final CopyOnWriteArrayList<C1105b<T>> f4164d = new CopyOnWriteArrayList<>();

    /* renamed from: e */
    public PagedList<T> f4165e;

    /* renamed from: f */
    public PagedList<T> f4166f;

    /* renamed from: g */
    public int f4167g;

    /* renamed from: h */
    public final C24858e<C21050d> f4168h = new AsyncPagedListDiffer$loadStateListener$1(new C5816a(this));

    /* renamed from: i */
    public final CopyOnWriteArrayList f4169i = new CopyOnWriteArrayList();

    /* renamed from: j */
    public final C5817b f4170j = new C5817b(this);

    /* renamed from: androidx.paging.a$a */
    public static final class C1104a<T> implements C1105b<T> {

        /* renamed from: a */
        public final C24240p<PagedList<T>, PagedList<T>, C21050d> f4171a;

        public C1104a(C24240p<? super PagedList<T>, ? super PagedList<T>, C21050d> pVar) {
            this.f4171a = pVar;
        }

        /* renamed from: a */
        public final void mo4429a(PagedList<T> pagedList, PagedList<T> pagedList2) {
            this.f4171a.invoke(pagedList, pagedList2);
        }
    }

    /* renamed from: androidx.paging.a$b */
    public interface C1105b<T> {
        /* renamed from: a */
        void mo4429a(PagedList<T> pagedList, PagedList<T> pagedList2);
    }

    public C1103a(RecyclerView.Adapter adapter) {
        C16004b.C16005a aVar = C16004b.f41657m;
        C24362h.m61211f(adapter, "adapter");
        this.f4161a = new C1164b(adapter);
        C1166c.C1167a aVar2 = new C1166c.C1167a();
        if (aVar2.f4441a == null) {
            synchronized (C1166c.C1167a.f4439b) {
                if (C1166c.C1167a.f4440c == null) {
                    C1166c.C1167a.f4440c = Executors.newFixedThreadPool(2);
                }
            }
            aVar2.f4441a = C1166c.C1167a.f4440c;
        }
        this.f4162b = new C1166c<>(aVar2.f4441a, aVar);
    }

    /* renamed from: a */
    public final C1241u mo4427a() {
        C1241u uVar = this.f4161a;
        if (uVar != null) {
            return uVar;
        }
        C24362h.m61217l("updateCallback");
        throw null;
    }

    /* renamed from: b */
    public final void mo4428b(PagedList<T> pagedList, PagedList<T> pagedList2, Runnable runnable) {
        for (C1105b a : this.f4164d) {
            a.mo4429a(pagedList, pagedList2);
        }
        if (runnable != null) {
            runnable.run();
        }
    }
}
