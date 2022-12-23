package androidx.lifecycle;

import androidx.lifecycle.C1019k0;
import androidx.lifecycle.C1026n0;
import bf0.C21049c;
import com.cubic.umo.auth.activity.AuthActivity$special$$inlined$viewModels$default$1;
import com.cubic.umo.auth.activity.AuthActivity$special$$inlined$viewModels$default$2;
import lf0.C24225a;
import mf0.C24361g;
import mf0.C24362h;
import p091g2.C4746a;
import sf0.C24855b;

/* renamed from: androidx.lifecycle.l0 */
public final class C1021l0<VM extends C1019k0> implements C21049c<VM> {

    /* renamed from: b */
    public final C24855b<VM> f3955b;

    /* renamed from: c */
    public final C24225a<C1034p0> f3956c;

    /* renamed from: d */
    public final C24225a<C1026n0.C1028b> f3957d;

    /* renamed from: e */
    public final C24225a<C4746a> f3958e;

    /* renamed from: f */
    public VM f3959f;

    public C1021l0(C24855b<VM> bVar, C24225a<? extends C1034p0> aVar, C24225a<? extends C1026n0.C1028b> aVar2, C24225a<? extends C4746a> aVar3) {
        C24362h.m61211f(bVar, "viewModelClass");
        C24362h.m61211f(aVar3, "extrasProducer");
        this.f3955b = bVar;
        this.f3956c = aVar;
        this.f3957d = aVar2;
        this.f3958e = aVar3;
    }

    public final Object getValue() {
        VM vm = this.f3959f;
        if (vm != null) {
            return vm;
        }
        VM a = new C1026n0(this.f3956c.invoke(), this.f3957d.invoke(), this.f3958e.invoke()).mo4313a(C24361g.m61144N(this.f3955b));
        this.f3959f = a;
        return a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C1021l0(C24855b bVar, AuthActivity$special$$inlined$viewModels$default$2 authActivity$special$$inlined$viewModels$default$2, AuthActivity$special$$inlined$viewModels$default$1 authActivity$special$$inlined$viewModels$default$1) {
        this(bVar, authActivity$special$$inlined$viewModels$default$2, authActivity$special$$inlined$viewModels$default$1, ViewModelLazy$1.f3906f);
        C24362h.m61211f(bVar, "viewModelClass");
    }
}
