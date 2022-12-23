package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import ag0.C20989e;
import cg0.C21185n;
import java.util.List;
import kh0.C23789e;
import kh0.C23792h;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.LazyScopeAdapter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import mf0.C24362h;
import mf0.C24365j;
import p845um.C19958a;
import sf0.C24866j;
import ug0.C25066c;
import zf0.C25442g;
import zf0.C25447i;
import zf0.C25486u;
import zf0.C25489x;

public final class LazyPackageViewDescriptorImpl extends C21185n implements C25489x {

    /* renamed from: i */
    public static final /* synthetic */ C24866j<Object>[] f60453i;

    /* renamed from: d */
    public final C23909c f60454d;

    /* renamed from: e */
    public final C25066c f60455e;

    /* renamed from: f */
    public final C23789e f60456f;

    /* renamed from: g */
    public final C23789e f60457g;

    /* renamed from: h */
    public final LazyScopeAdapter f60458h;

    static {
        Class<LazyPackageViewDescriptorImpl> cls = LazyPackageViewDescriptorImpl.class;
        f60453i = new C24866j[]{C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(cls), "fragments", "getFragments()Ljava/util/List;")), C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(cls), "empty", "getEmpty()Z"))};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyPackageViewDescriptorImpl(C23909c cVar, C25066c cVar2, C23792h hVar) {
        super(C20989e.C20990a.f52739a, cVar2.mo61586g());
        C24362h.m61211f(cVar, "module");
        C24362h.m61211f(cVar2, "fqName");
        C24362h.m61211f(hVar, "storageManager");
        this.f60454d = cVar;
        this.f60455e = cVar2;
        this.f60456f = hVar.mo59019d(new LazyPackageViewDescriptorImpl$fragments$2(this));
        this.f60457g = hVar.mo59019d(new LazyPackageViewDescriptorImpl$empty$2(this));
        this.f60458h = new LazyScopeAdapter(hVar, new LazyPackageViewDescriptorImpl$memberScope$1(this));
    }

    /* renamed from: B0 */
    public final <R, D> R mo53398B0(C25447i<R, D> iVar, D d) {
        return iVar.mo60158i(this, d);
    }

    /* renamed from: G0 */
    public final C23909c mo59441G0() {
        return this.f60454d;
    }

    /* renamed from: b */
    public final C25442g mo53399b() {
        if (this.f60455e.mo61582d()) {
            return null;
        }
        C23909c cVar = this.f60454d;
        C25066c e = this.f60455e.mo61583e();
        C24362h.m61210e(e, "fqName.parent()");
        return cVar.mo59458k0(e);
    }

    public final boolean equals(Object obj) {
        C25489x xVar;
        if (obj instanceof C25489x) {
            xVar = (C25489x) obj;
        } else {
            xVar = null;
        }
        if (xVar != null && C24362h.m61206a(this.f60455e, xVar.mo59443f()) && C24362h.m61206a(this.f60454d, xVar.mo59441G0())) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final C25066c mo59443f() {
        return this.f60455e;
    }

    public final int hashCode() {
        return this.f60455e.hashCode() + (this.f60454d.hashCode() * 31);
    }

    public final boolean isEmpty() {
        return ((Boolean) C19958a.m47435j(this.f60457g, f60453i[1])).booleanValue();
    }

    /* renamed from: m0 */
    public final List<C25486u> mo59446m0() {
        return (List) C19958a.m47435j(this.f60456f, f60453i[0]);
    }

    /* renamed from: o */
    public final MemberScope mo59447o() {
        return this.f60458h;
    }
}
