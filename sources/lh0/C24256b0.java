package lh0;

import ag0.C20989e;
import mf0.C24362h;
import mh0.C24378d;
import p584jl.C17885a;

/* renamed from: lh0.b0 */
public final class C24256b0 extends C24277k implements C24302s0 {

    /* renamed from: c */
    public final C24312z f61543c;

    /* renamed from: d */
    public final C24307v f61544d;

    public C24256b0(C24312z zVar, C24307v vVar) {
        C24362h.m61211f(zVar, "delegate");
        C24362h.m61211f(vVar, "enhancement");
        this.f61543c = zVar;
        this.f61544d = vVar;
    }

    /* renamed from: V0 */
    public final C24312z mo60403V0(boolean z) {
        return (C24312z) C17885a.m44395D0(this.f61543c.mo59559S0(z), this.f61544d.mo60450R0().mo59559S0(z));
    }

    /* renamed from: W */
    public final C24306u0 mo60413W() {
        return this.f61543c;
    }

    /* renamed from: W0 */
    public final C24312z mo60404W0(C20989e eVar) {
        C24362h.m61211f(eVar, "newAnnotations");
        return (C24312z) C17885a.m44395D0(this.f61543c.mo59561U0(eVar), this.f61544d);
    }

    /* renamed from: X0 */
    public final C24312z mo60405X0() {
        return this.f61543c;
    }

    /* renamed from: Z0 */
    public final C24277k mo60407Z0(C24312z zVar) {
        C24362h.m61211f(zVar, "delegate");
        return new C24256b0(zVar, this.f61544d);
    }

    /* renamed from: a1 */
    public final C24256b0 mo60406Y0(C24378d dVar) {
        C24362h.m61211f(dVar, "kotlinTypeRefiner");
        return new C24256b0((C24312z) dVar.mo60522A(this.f61543c), dVar.mo60522A(this.f61544d));
    }

    /* renamed from: l0 */
    public final C24307v mo60415l0() {
        return this.f61544d;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("[@EnhancedForWarnings(");
        k.append(this.f61544d);
        k.append(")] ");
        k.append(this.f61543c);
        return k.toString();
    }
}
