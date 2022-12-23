package p265tb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import p277ub.C6774a0;

/* renamed from: tb.d */
public abstract class C6651d implements C6654g {

    /* renamed from: a */
    public final boolean f20655a;

    /* renamed from: b */
    public final ArrayList<C6671u> f20656b = new ArrayList<>(1);

    /* renamed from: c */
    public int f20657c;

    /* renamed from: d */
    public C6657i f20658d;

    public C6651d(boolean z) {
        this.f20655a = z;
    }

    /* renamed from: b */
    public Map mo20679b() {
        return Collections.emptyMap();
    }

    /* renamed from: d */
    public final void mo20680d(C6671u uVar) {
        uVar.getClass();
        if (!this.f20656b.contains(uVar)) {
            this.f20656b.add(uVar);
            this.f20657c++;
        }
    }

    /* renamed from: k */
    public final void mo22821k(int i) {
        C6657i iVar = this.f20658d;
        int i2 = C6774a0.f20959a;
        for (int i3 = 0; i3 < this.f20657c; i3++) {
            this.f20656b.get(i3).mo22837g(iVar, this.f20655a, i);
        }
    }

    /* renamed from: l */
    public final void mo22822l() {
        C6657i iVar = this.f20658d;
        int i = C6774a0.f20959a;
        for (int i2 = 0; i2 < this.f20657c; i2++) {
            this.f20656b.get(i2).mo22835e(iVar, this.f20655a);
        }
        this.f20658d = null;
    }

    /* renamed from: m */
    public final void mo22823m(C6657i iVar) {
        for (int i = 0; i < this.f20657c; i++) {
            this.f20656b.get(i).mo22834b();
        }
    }

    /* renamed from: n */
    public final void mo22824n(C6657i iVar) {
        this.f20658d = iVar;
        for (int i = 0; i < this.f20657c; i++) {
            this.f20656b.get(i).mo22836f(iVar, this.f20655a);
        }
    }
}
