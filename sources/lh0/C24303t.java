package lh0;

import ag0.C20989e;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import mf0.C24362h;
import mh0.C24378d;
import p584jl.C17885a;
import wg0.C25149b;

/* renamed from: lh0.t */
public final class C24303t extends C24298r implements C24302s0 {

    /* renamed from: e */
    public final C24298r f61601e;

    /* renamed from: f */
    public final C24307v f61602f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24303t(C24298r rVar, C24307v vVar) {
        super(rVar.f61594c, rVar.f61595d);
        C24362h.m61211f(rVar, AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
        C24362h.m61211f(vVar, "enhancement");
        this.f61601e = rVar;
        this.f61602f = vVar;
    }

    /* renamed from: Q0 */
    public final C24307v mo59558Q0(C24378d dVar) {
        C24362h.m61211f(dVar, "kotlinTypeRefiner");
        return new C24303t((C24298r) dVar.mo60522A(this.f61601e), dVar.mo60522A(this.f61602f));
    }

    /* renamed from: S0 */
    public final C24306u0 mo59559S0(boolean z) {
        return C17885a.m44395D0(this.f61601e.mo59559S0(z), this.f61602f.mo60450R0().mo59559S0(z));
    }

    /* renamed from: T0 */
    public final C24306u0 mo59560T0(C24378d dVar) {
        C24362h.m61211f(dVar, "kotlinTypeRefiner");
        return new C24303t((C24298r) dVar.mo60522A(this.f61601e), dVar.mo60522A(this.f61602f));
    }

    /* renamed from: U0 */
    public final C24306u0 mo59561U0(C20989e eVar) {
        return C17885a.m44395D0(this.f61601e.mo59561U0(eVar), this.f61602f);
    }

    /* renamed from: V0 */
    public final C24312z mo59562V0() {
        return this.f61601e.mo59562V0();
    }

    /* renamed from: W */
    public final C24306u0 mo60413W() {
        return this.f61601e;
    }

    /* renamed from: W0 */
    public final String mo59563W0(DescriptorRenderer descriptorRenderer, C25149b bVar) {
        C24362h.m61211f(descriptorRenderer, "renderer");
        C24362h.m61211f(bVar, "options");
        if (bVar.mo60127d()) {
            return descriptorRenderer.mo60091s(this.f61602f);
        }
        return this.f61601e.mo59563W0(descriptorRenderer, bVar);
    }

    /* renamed from: l0 */
    public final C24307v mo60415l0() {
        return this.f61602f;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("[@EnhancedForWarnings(");
        k.append(this.f61602f);
        k.append(")] ");
        k.append(this.f61601e);
        return k.toString();
    }
}
