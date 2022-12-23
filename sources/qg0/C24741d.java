package qg0;

import ag0.C20986c;
import ag0.C20988d;
import com.appboy.models.InAppMessageBase;
import com.google.android.play.core.assetpacks.C14256d1;
import hg0.C23480p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.C23825c;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory;
import lh0.C24307v;
import mf0.C24361g;
import mf0.C24362h;
import p626lf.C18201b;
import qg0.C24757k;
import ug0.C25065b;
import ug0.C25069e;
import vf0.C25089a;
import vf0.C25090b;
import zf0.C25432c;
import zf0.C25435d0;
import zf0.C25452k0;
import zg0.C25492a;
import zg0.C25497f;
import zg0.C25498g;
import zg0.C25500i;
import zg0.C25501j;
import zg0.C25507o;

/* renamed from: qg0.d */
public final class C24741d implements C24757k.C24758a {

    /* renamed from: a */
    public final HashMap<C25069e, C25498g<?>> f62625a = new HashMap<>();

    /* renamed from: b */
    public final /* synthetic */ C24744e f62626b;

    /* renamed from: c */
    public final /* synthetic */ C25432c f62627c;

    /* renamed from: d */
    public final /* synthetic */ C25435d0 f62628d;

    /* renamed from: e */
    public final /* synthetic */ List<C20986c> f62629e;

    /* renamed from: qg0.d$a */
    public static final class C24742a implements C24757k.C24759b {

        /* renamed from: a */
        public final ArrayList<C25498g<?>> f62630a = new ArrayList<>();

        /* renamed from: b */
        public final /* synthetic */ C24741d f62631b;

        /* renamed from: c */
        public final /* synthetic */ C25069e f62632c;

        /* renamed from: d */
        public final /* synthetic */ C24744e f62633d;

        /* renamed from: e */
        public final /* synthetic */ C25432c f62634e;

        /* renamed from: qg0.d$a$a */
        public static final class C24743a implements C24757k.C24758a {

            /* renamed from: a */
            public final /* synthetic */ C24757k.C24758a f62635a;

            /* renamed from: b */
            public final /* synthetic */ C24757k.C24758a f62636b;

            /* renamed from: c */
            public final /* synthetic */ C24742a f62637c;

            /* renamed from: d */
            public final /* synthetic */ ArrayList<C20986c> f62638d;

            public C24743a(C24741d dVar, C24742a aVar, ArrayList arrayList) {
                this.f62636b = dVar;
                this.f62637c = aVar;
                this.f62638d = arrayList;
                this.f62635a = dVar;
            }

            /* renamed from: a */
            public final void mo59599a() {
                this.f62636b.mo59599a();
                this.f62637c.f62630a.add(new C25492a((C20986c) C23825c.m58491C0(this.f62638d)));
            }

            /* renamed from: b */
            public final C24757k.C24758a mo59600b(C25065b bVar, C25069e eVar) {
                return this.f62635a.mo59600b(bVar, eVar);
            }

            /* renamed from: c */
            public final C24757k.C24759b mo59601c(C25069e eVar) {
                return this.f62635a.mo59601c(eVar);
            }

            /* renamed from: d */
            public final void mo59602d(C25069e eVar, C25497f fVar) {
                this.f62635a.mo59602d(eVar, fVar);
            }

            /* renamed from: e */
            public final void mo59603e(C25069e eVar, C25065b bVar, C25069e eVar2) {
                this.f62635a.mo59603e(eVar, bVar, eVar2);
            }

            /* renamed from: f */
            public final void mo59604f(Object obj, C25069e eVar) {
                this.f62635a.mo59604f(obj, eVar);
            }
        }

        public C24742a(C24741d dVar, C25069e eVar, C24744e eVar2, C25432c cVar) {
            this.f62631b = dVar;
            this.f62632c = eVar;
            this.f62633d = eVar2;
            this.f62634e = cVar;
        }

        /* renamed from: a */
        public final void mo59593a() {
            C25452k0 p = C18201b.m44919p(this.f62632c, this.f62634e);
            if (p != null) {
                HashMap<C25069e, C25498g<?>> hashMap = this.f62631b.f62625a;
                C25069e eVar = this.f62632c;
                List x = C24361g.m61195x(this.f62630a);
                C24307v type = p.getType();
                C24362h.m61210e(type, "parameter.type");
                hashMap.put(eVar, ConstantValueFactory.m60273b(x, type));
            }
        }

        /* renamed from: b */
        public final void mo59594b(C25065b bVar, C25069e eVar) {
            this.f62630a.add(new C25500i(bVar, eVar));
        }

        /* renamed from: c */
        public final void mo59595c(Object obj) {
            ArrayList<C25498g<?>> arrayList = this.f62630a;
            C24741d dVar = this.f62631b;
            C25069e eVar = this.f62632c;
            dVar.getClass();
            C25498g c = ConstantValueFactory.m60274c(obj);
            if (c == null) {
                String k = C24362h.m61216k(eVar, "Unsupported annotation argument: ");
                C24362h.m61211f(k, InAppMessageBase.MESSAGE);
                c = new C25501j.C25502a(k);
            }
            arrayList.add(c);
        }

        /* renamed from: d */
        public final void mo59596d(C25497f fVar) {
            this.f62630a.add(new C25507o(fVar));
        }

        /* renamed from: e */
        public final C24757k.C24758a mo59597e(C25065b bVar) {
            ArrayList arrayList = new ArrayList();
            return new C24743a(this.f62633d.mo59581r(bVar, C25435d0.f63736a, arrayList), this, arrayList);
        }
    }

    public C24741d(C24744e eVar, C25432c cVar, C25435d0 d0Var, List<C20986c> list) {
        this.f62626b = eVar;
        this.f62627c = cVar;
        this.f62628d = d0Var;
        this.f62629e = list;
    }

    /* renamed from: a */
    public final void mo59599a() {
        C25507o oVar;
        C24757k b;
        C20988d dVar = new C20988d(this.f62627c.mo53412q(), this.f62625a, this.f62628d);
        C24744e eVar = this.f62626b;
        eVar.getClass();
        boolean z = false;
        if (C24362h.m61206a(C20986c.C20987a.m49140a(dVar), C23480p.f59274g)) {
            C25498g<?> gVar = dVar.mo53067g().get(C25069e.m62820i("value"));
            C25507o.C25508a.C25510b bVar = null;
            if (gVar instanceof C25507o) {
                oVar = (C25507o) gVar;
            } else {
                oVar = null;
            }
            if (oVar != null) {
                T t = oVar.f63774a;
                if (t instanceof C25507o.C25508a.C25510b) {
                    bVar = (C25507o.C25508a.C25510b) t;
                }
                if (bVar != null) {
                    C25065b bVar2 = bVar.f63779a.f63772a;
                    if (!(bVar2.mo61573g() == null || !C24362h.m61206a(bVar2.mo61577j().mo61604f(), "Container") || (b = C14256d1.m35484b(eVar.f60751a, bVar2)) == null)) {
                        LinkedHashSet linkedHashSet = C25090b.f63297a;
                        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                        b.mo58419b(new C25089a(ref$BooleanRef));
                        if (ref$BooleanRef.element) {
                            z = true;
                        }
                    }
                }
            }
        }
        if (!z) {
            this.f62629e.add(dVar);
        }
    }

    /* renamed from: b */
    public final C24757k.C24758a mo59600b(C25065b bVar, C25069e eVar) {
        ArrayList arrayList = new ArrayList();
        return new C24740c(this.f62626b.mo59581r(bVar, C25435d0.f63736a, arrayList), this, eVar, arrayList);
    }

    /* renamed from: c */
    public final C24757k.C24759b mo59601c(C25069e eVar) {
        return new C24742a(this, eVar, this.f62626b, this.f62627c);
    }

    /* renamed from: d */
    public final void mo59602d(C25069e eVar, C25497f fVar) {
        this.f62625a.put(eVar, new C25507o(fVar));
    }

    /* renamed from: e */
    public final void mo59603e(C25069e eVar, C25065b bVar, C25069e eVar2) {
        this.f62625a.put(eVar, new C25500i(bVar, eVar2));
    }

    /* renamed from: f */
    public final void mo59604f(Object obj, C25069e eVar) {
        HashMap<C25069e, C25498g<?>> hashMap = this.f62625a;
        C25498g c = ConstantValueFactory.m60274c(obj);
        if (c == null) {
            String k = C24362h.m61216k(eVar, "Unsupported annotation argument: ");
            C24362h.m61211f(k, InAppMessageBase.MESSAGE);
            c = new C25501j.C25502a(k);
        }
        hashMap.put(eVar, c);
    }
}
