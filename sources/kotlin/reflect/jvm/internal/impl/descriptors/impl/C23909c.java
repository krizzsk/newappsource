package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import ag0.C20989e;
import bf0.C21049c;
import cg0.C21158b0;
import cg0.C21183m;
import cg0.C21185n;
import cg0.C21199x;
import cg0.C21200y;
import com.usebutton.sdk.internal.api.AppActionRequest;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kh0.C23787c;
import kh0.C23792h;
import kotlin.C23812a;
import kotlin.collections.C23816b;
import kotlin.collections.C23825c;
import kotlin.collections.C23826d;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.builtins.C23867c;
import kotlin.reflect.jvm.internal.impl.descriptors.InvalidModuleException;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import lf0.C24236l;
import mf0.C24362h;
import p502fx.C17119d;
import ug0.C25066c;
import ug0.C25069e;
import zf0.C25442g;
import zf0.C25447i;
import zf0.C25482q;
import zf0.C25483r;
import zf0.C25485t;
import zf0.C25487v;
import zf0.C25489x;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.c */
public final class C23909c extends C21185n implements C25485t {

    /* renamed from: d */
    public final C23792h f60514d;

    /* renamed from: e */
    public final C23867c f60515e;

    /* renamed from: f */
    public final Map<C17119d, Object> f60516f;

    /* renamed from: g */
    public final C21158b0 f60517g;

    /* renamed from: h */
    public C21199x f60518h;

    /* renamed from: i */
    public C25487v f60519i;

    /* renamed from: j */
    public boolean f60520j;

    /* renamed from: k */
    public final C23787c<C25066c, C25489x> f60521k;

    /* renamed from: l */
    public final C21049c f60522l;

    public C23909c() {
        throw null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23909c(C25069e eVar, C23792h hVar, C23867c cVar, int i) {
        super(C20989e.C20990a.f52739a, eVar);
        Map<C17119d, Object> U = (i & 16) != 0 ? C23826d.m58530U() : null;
        C24362h.m61211f(U, AppActionRequest.KEY_CAPABILITIES);
        this.f60514d = hVar;
        this.f60515e = cVar;
        if (eVar.f63264c) {
            this.f60516f = U;
            C21158b0.f53017a.getClass();
            C21158b0 b0Var = (C21158b0) mo59456K(C21158b0.C21159a.f53019b);
            this.f60517g = b0Var == null ? C21158b0.C21160b.f53020b : b0Var;
            this.f60520j = true;
            this.f60521k = hVar.mo59020e(new ModuleDescriptorImpl$packages$1(this));
            this.f60522l = C23812a.m58432b(new C23904x39a25915(this));
            return;
        }
        throw new IllegalArgumentException(C24362h.m61216k(eVar, "Module name must be special: "));
    }

    /* renamed from: B0 */
    public final <R, D> R mo53398B0(C25447i<R, D> iVar, D d) {
        return iVar.mo60157h(this, d);
    }

    /* renamed from: D */
    public final boolean mo59454D(C25485t tVar) {
        C24362h.m61211f(tVar, "targetModule");
        if (C24362h.m61206a(this, tVar)) {
            return true;
        }
        C21199x xVar = this.f60518h;
        C24362h.m61208c(xVar);
        if (!C23825c.m58507d0(xVar.mo53540c(), tVar) && !mo59455E0().contains(tVar) && !tVar.mo59455E0().contains(this)) {
            return false;
        }
        return true;
    }

    /* renamed from: E0 */
    public final List<C25485t> mo59455E0() {
        C21199x xVar = this.f60518h;
        if (xVar != null) {
            return xVar.mo53539b();
        }
        StringBuilder k = C13555b.m33972k("Dependencies of module ");
        String str = getName().f63263b;
        C24362h.m61210e(str, "name.toString()");
        k.append(str);
        k.append(" were not set");
        throw new AssertionError(k.toString());
    }

    /* renamed from: K */
    public final <T> T mo59456K(C17119d dVar) {
        C24362h.m61211f(dVar, "capability");
        return this.f60516f.get(dVar);
    }

    /* renamed from: W */
    public final void mo59457W() {
        if (!this.f60520j) {
            C25483r rVar = (C25483r) mo59456K(C25482q.f63770a);
            if (rVar != null) {
                rVar.mo62744a();
                return;
            }
            throw new InvalidModuleException(C24362h.m61216k(this, "Accessing invalid module descriptor "));
        }
    }

    /* renamed from: b */
    public final C25442g mo53399b() {
        return null;
    }

    /* renamed from: k0 */
    public final C25489x mo59458k0(C25066c cVar) {
        C24362h.m61211f(cVar, "fqName");
        mo59457W();
        return (C25489x) ((LockBasedStorageManager.C24148k) this.f60521k).invoke(cVar);
    }

    /* renamed from: l0 */
    public final void mo59459l0(C23909c... cVarArr) {
        List h1 = C23816b.m58452h1(cVarArr);
        C24362h.m61211f(h1, "descriptors");
        EmptySet emptySet = EmptySet.f60175b;
        C24362h.m61211f(emptySet, "friends");
        this.f60518h = new C21200y(h1, emptySet, EmptyList.f60173b, emptySet);
    }

    /* renamed from: m */
    public final C23867c mo59460m() {
        return this.f60515e;
    }

    /* renamed from: n */
    public final Collection<C25066c> mo59461n(C25066c cVar, C24236l<? super C25069e, Boolean> lVar) {
        C24362h.m61211f(cVar, "fqName");
        C24362h.m61211f(lVar, "nameFilter");
        mo59457W();
        mo59457W();
        return ((C21183m) this.f60522l.getValue()).mo53524n(cVar, lVar);
    }
}
