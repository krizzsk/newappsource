package mh0;

import ag0.C20989e;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import lh0.C24274i0;
import lh0.C24281l0;
import lh0.C24289p;
import lh0.C24306u0;
import lh0.C24312z;
import mf0.C24362h;
import oh0.C24613b;

/* renamed from: mh0.f */
public final class C24381f extends C24312z implements C24613b {

    /* renamed from: c */
    public final CaptureStatus f61717c;

    /* renamed from: d */
    public final NewCapturedTypeConstructor f61718d;

    /* renamed from: e */
    public final C24306u0 f61719e;

    /* renamed from: f */
    public final C20989e f61720f;

    /* renamed from: g */
    public final boolean f61721g;

    /* renamed from: h */
    public final boolean f61722h;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C24381f(CaptureStatus captureStatus, NewCapturedTypeConstructor newCapturedTypeConstructor, C24306u0 u0Var, C20989e eVar, boolean z, int i) {
        this(captureStatus, newCapturedTypeConstructor, u0Var, (i & 8) != 0 ? C20989e.C20990a.f52739a : eVar, (i & 16) != 0 ? false : z, false);
    }

    /* renamed from: N0 */
    public final List<C24281l0> mo60410N0() {
        return EmptyList.f60173b;
    }

    /* renamed from: O0 */
    public final C24274i0 mo60411O0() {
        return this.f61718d;
    }

    /* renamed from: P0 */
    public final boolean mo60412P0() {
        return this.f61721g;
    }

    /* renamed from: S0 */
    public final C24306u0 mo59559S0(boolean z) {
        return new C24381f(this.f61717c, this.f61718d, this.f61719e, this.f61720f, z, 32);
    }

    /* renamed from: U0 */
    public final C24306u0 mo59561U0(C20989e eVar) {
        return new C24381f(this.f61717c, this.f61718d, this.f61719e, eVar, this.f61721g, 32);
    }

    /* renamed from: V0 */
    public final C24312z mo60403V0(boolean z) {
        return new C24381f(this.f61717c, this.f61718d, this.f61719e, this.f61720f, z, 32);
    }

    /* renamed from: W0 */
    public final C24312z mo60404W0(C20989e eVar) {
        C24362h.m61211f(eVar, "newAnnotations");
        return new C24381f(this.f61717c, this.f61718d, this.f61719e, eVar, this.f61721g, 32);
    }

    /* renamed from: X0 */
    public final C24381f mo59560T0(C24378d dVar) {
        C24306u0 u0Var;
        C24362h.m61211f(dVar, "kotlinTypeRefiner");
        CaptureStatus captureStatus = this.f61717c;
        NewCapturedTypeConstructor b = this.f61718d.mo60260b(dVar);
        C24306u0 u0Var2 = this.f61719e;
        if (u0Var2 == null) {
            u0Var = null;
        } else {
            u0Var = dVar.mo60522A(u0Var2).mo60450R0();
        }
        return new C24381f(captureStatus, b, u0Var, this.f61720f, this.f61721g, 32);
    }

    public final C20989e getAnnotations() {
        return this.f61720f;
    }

    /* renamed from: o */
    public final MemberScope mo59564o() {
        return C24289p.m60913c("No member resolution should be done on captured type!", true);
    }

    public C24381f(CaptureStatus captureStatus, NewCapturedTypeConstructor newCapturedTypeConstructor, C24306u0 u0Var, C20989e eVar, boolean z, boolean z2) {
        C24362h.m61211f(captureStatus, "captureStatus");
        C24362h.m61211f(newCapturedTypeConstructor, "constructor");
        C24362h.m61211f(eVar, "annotations");
        this.f61717c = captureStatus;
        this.f61718d = newCapturedTypeConstructor;
        this.f61719e = u0Var;
        this.f61720f = eVar;
        this.f61721g = z;
        this.f61722h = z2;
    }
}
