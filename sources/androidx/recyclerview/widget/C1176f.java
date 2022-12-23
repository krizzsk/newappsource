package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C1190i0;
import androidx.recyclerview.widget.C1242v;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;

/* renamed from: androidx.recyclerview.widget.f */
public final class C1176f implements C1242v.C1244b {

    /* renamed from: a */
    public final ConcatAdapter f4458a;

    /* renamed from: b */
    public final C1206l0 f4459b;

    /* renamed from: c */
    public ArrayList f4460c = new ArrayList();

    /* renamed from: d */
    public final IdentityHashMap<RecyclerView.C1119a0, C1242v> f4461d = new IdentityHashMap<>();

    /* renamed from: e */
    public ArrayList f4462e = new ArrayList();

    /* renamed from: f */
    public C1177a f4463f = new C1177a();

    /* renamed from: g */
    public final ConcatAdapter.Config.StableIdMode f4464g;

    /* renamed from: h */
    public final C1190i0 f4465h;

    /* renamed from: androidx.recyclerview.widget.f$a */
    public static class C1177a {

        /* renamed from: a */
        public C1242v f4466a;

        /* renamed from: b */
        public int f4467b;

        /* renamed from: c */
        public boolean f4468c;
    }

    public C1176f(ConcatAdapter concatAdapter, ConcatAdapter.Config config) {
        this.f4458a = concatAdapter;
        config.getClass();
        this.f4459b = new C1206l0();
        ConcatAdapter.Config.StableIdMode stableIdMode = config.f4186a;
        this.f4464g = stableIdMode;
        if (stableIdMode == ConcatAdapter.Config.StableIdMode.NO_STABLE_IDS) {
            this.f4465h = new C1190i0.C1193b();
        } else if (stableIdMode == ConcatAdapter.Config.StableIdMode.ISOLATED_STABLE_IDS) {
            this.f4465h = new C1190i0.C1191a();
        } else if (stableIdMode == ConcatAdapter.Config.StableIdMode.SHARED_STABLE_IDS) {
            this.f4465h = new C1190i0.C1195c();
        } else {
            throw new IllegalArgumentException("unknown stable id mode");
        }
    }

    /* renamed from: a */
    public final void mo5054a() {
        RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy;
        Iterator it = this.f4462e.iterator();
        while (true) {
            if (!it.hasNext()) {
                stateRestorationPolicy = RecyclerView.Adapter.StateRestorationPolicy.ALLOW;
                break;
            }
            C1242v vVar = (C1242v) it.next();
            RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy2 = vVar.f4693c.getStateRestorationPolicy();
            stateRestorationPolicy = RecyclerView.Adapter.StateRestorationPolicy.PREVENT;
            if (stateRestorationPolicy2 == stateRestorationPolicy || (stateRestorationPolicy2 == RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY && vVar.f4695e == 0)) {
                break;
            }
        }
        if (stateRestorationPolicy != this.f4458a.getStateRestorationPolicy()) {
            this.f4458a.mo4441k(stateRestorationPolicy);
        }
    }

    /* renamed from: b */
    public final int mo5055b(C1242v vVar) {
        C1242v vVar2;
        Iterator it = this.f4462e.iterator();
        int i = 0;
        while (it.hasNext() && (vVar2 = (C1242v) it.next()) != vVar) {
            i += vVar2.f4695e;
        }
        return i;
    }

    /* renamed from: c */
    public final C1177a mo5056c(int i) {
        C1177a aVar = this.f4463f;
        if (aVar.f4468c) {
            aVar = new C1177a();
        } else {
            aVar.f4468c = true;
        }
        Iterator it = this.f4462e.iterator();
        int i2 = i;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C1242v vVar = (C1242v) it.next();
            int i3 = vVar.f4695e;
            if (i3 > i2) {
                aVar.f4466a = vVar;
                aVar.f4467b = i2;
                break;
            }
            i2 -= i3;
        }
        if (aVar.f4466a != null) {
            return aVar;
        }
        throw new IllegalArgumentException(C16759e.m42349e("Cannot find wrapper for ", i));
    }

    /* renamed from: d */
    public final C1242v mo5057d(RecyclerView.C1119a0 a0Var) {
        C1242v vVar = this.f4461d.get(a0Var);
        if (vVar != null) {
            return vVar;
        }
        throw new IllegalStateException("Cannot find wrapper for " + a0Var + ", seems like it is not bound by this adapter: " + this);
    }
}
