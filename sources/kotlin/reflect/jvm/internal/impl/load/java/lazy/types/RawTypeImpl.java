package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import ag0.C20989e;
import cf0.C21136j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C23825c;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.text.C24179b;
import lh0.C24281l0;
import lh0.C24298r;
import lh0.C24306u0;
import lh0.C24307v;
import lh0.C24311y;
import lh0.C24312z;
import mf0.C24362h;
import mh0.C24376c;
import mh0.C24378d;
import wg0.C25149b;
import zf0.C25432c;
import zf0.C25437e;

public final class RawTypeImpl extends C24298r implements C24311y {
    public RawTypeImpl(C24312z zVar, C24312z zVar2, boolean z) {
        super(zVar, zVar2);
        if (!z) {
            C24376c.f61714a.mo60531f(zVar, zVar2);
        }
    }

    /* renamed from: X0 */
    public static final ArrayList m59148X0(DescriptorRenderer descriptorRenderer, C24312z zVar) {
        List<C24281l0> N0 = zVar.mo60410N0();
        ArrayList arrayList = new ArrayList(C21136j.m49436X(N0, 10));
        for (C24281l0 t : N0) {
            arrayList.add(descriptorRenderer.mo60092t(t));
        }
        return arrayList;
    }

    /* renamed from: Y0 */
    public static final String m59149Y0(String str, String str2) {
        C24362h.m61211f(str, "<this>");
        boolean z = false;
        if (C24179b.m60564L(str, '<', 0, false, 2) >= 0) {
            z = true;
        }
        if (!z) {
            return str;
        }
        return C24179b.m60582d0(str, '<') + '<' + str2 + '>' + C24179b.m60581c0(str, '>');
    }

    /* renamed from: Q0 */
    public final C24307v mo59558Q0(C24378d dVar) {
        C24362h.m61211f(dVar, "kotlinTypeRefiner");
        return new RawTypeImpl((C24312z) dVar.mo60522A(this.f61594c), (C24312z) dVar.mo60522A(this.f61595d), true);
    }

    /* renamed from: S0 */
    public final C24306u0 mo59559S0(boolean z) {
        return new RawTypeImpl(this.f61594c.mo59559S0(z), this.f61595d.mo59559S0(z));
    }

    /* renamed from: T0 */
    public final C24306u0 mo59560T0(C24378d dVar) {
        C24362h.m61211f(dVar, "kotlinTypeRefiner");
        return new RawTypeImpl((C24312z) dVar.mo60522A(this.f61594c), (C24312z) dVar.mo60522A(this.f61595d), true);
    }

    /* renamed from: U0 */
    public final C24306u0 mo59561U0(C20989e eVar) {
        return new RawTypeImpl(this.f61594c.mo59561U0(eVar), this.f61595d.mo59561U0(eVar));
    }

    /* renamed from: V0 */
    public final C24312z mo59562V0() {
        return this.f61594c;
    }

    /* renamed from: W0 */
    public final String mo59563W0(DescriptorRenderer descriptorRenderer, C25149b bVar) {
        boolean z;
        C24362h.m61211f(descriptorRenderer, "renderer");
        C24362h.m61211f(bVar, "options");
        String s = descriptorRenderer.mo60091s(this.f61594c);
        String s2 = descriptorRenderer.mo60091s(this.f61595d);
        if (bVar.mo60139j()) {
            return "raw (" + s + ".." + s2 + ')';
        } else if (this.f61595d.mo60410N0().isEmpty()) {
            return descriptorRenderer.mo60088p(s, s2, TypeUtilsKt.m60522g(this));
        } else {
            ArrayList X0 = m59148X0(descriptorRenderer, this.f61594c);
            ArrayList X02 = m59148X0(descriptorRenderer, this.f61595d);
            String q0 = C23825c.m58520q0(X0, ", ", (String) null, (String) null, RawTypeImpl$render$newArgs$1.f60714f, 30);
            ArrayList Q0 = C23825c.m58505Q0(X0, X02);
            boolean z2 = true;
            if (!Q0.isEmpty()) {
                Iterator it = Q0.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Pair pair = (Pair) it.next();
                    String str = (String) pair.mo59069d();
                    if (C24362h.m61206a((String) pair.mo59068c(), C24179b.m60573U("out ", str)) || C24362h.m61206a(str, "*")) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (!z) {
                        z2 = false;
                        break;
                    }
                }
            }
            if (z2) {
                s2 = m59149Y0(s2, q0);
            }
            String Y0 = m59149Y0(s, q0);
            if (C24362h.m61206a(Y0, s2)) {
                return Y0;
            }
            return descriptorRenderer.mo60088p(Y0, s2, TypeUtilsKt.m60522g(this));
        }
    }

    /* renamed from: o */
    public final MemberScope mo59564o() {
        C25432c cVar;
        C25437e o = mo60411O0().mo53460o();
        if (o instanceof C25432c) {
            cVar = (C25432c) o;
        } else {
            cVar = null;
        }
        if (cVar != null) {
            MemberScope n0 = cVar.mo53411n0(new RawSubstitution((TypeParameterUpperBoundEraser) null));
            C24362h.m61210e(n0, "classDescriptor.getMemberScope(RawSubstitution())");
            return n0;
        }
        throw new IllegalStateException(C24362h.m61216k(mo60411O0().mo53460o(), "Incorrect classifier: ").toString());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public RawTypeImpl(C24312z zVar, C24312z zVar2) {
        this(zVar, zVar2, false);
        C24362h.m61211f(zVar, "lowerBound");
        C24362h.m61211f(zVar2, "upperBound");
    }
}
