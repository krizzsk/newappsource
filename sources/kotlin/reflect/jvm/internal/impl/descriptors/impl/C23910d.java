package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import ag0.C20989e;
import bf0.C21049c;
import cf0.C21136j;
import cg0.C21182l0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C23812a;
import kotlin.reflect.jvm.internal.impl.descriptors.C23894a;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import lf0.C24225a;
import lh0.C24307v;
import mf0.C24362h;
import ug0.C25069e;
import xf0.C25255d;
import zf0.C25435d0;
import zf0.C25445h;
import zf0.C25447i;
import zf0.C25452k0;
import zf0.C25454l0;
import zf0.C25455m;
import zf0.C25478n;
import zg0.C25498g;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.d */
public class C23910d extends C21182l0 implements C25452k0 {

    /* renamed from: g */
    public final int f60523g;

    /* renamed from: h */
    public final boolean f60524h;

    /* renamed from: i */
    public final boolean f60525i;

    /* renamed from: j */
    public final boolean f60526j;

    /* renamed from: k */
    public final C24307v f60527k;

    /* renamed from: l */
    public final C25452k0 f60528l;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.d$a */
    public static final class C23911a extends C23910d {

        /* renamed from: m */
        public final C21049c f60529m;

        public C23911a(C23894a aVar, C25452k0 k0Var, int i, C20989e eVar, C25069e eVar2, C24307v vVar, boolean z, boolean z2, boolean z3, C24307v vVar2, C25435d0 d0Var, C24225a<? extends List<? extends C25454l0>> aVar2) {
            super(aVar, k0Var, i, eVar, eVar2, vVar, z, z2, z3, vVar2, d0Var);
            this.f60529m = C23812a.m58432b(aVar2);
        }

        /* renamed from: b0 */
        public final C25452k0 mo59463b0(C25255d dVar, C25069e eVar, int i) {
            C20989e annotations = getAnnotations();
            C24362h.m61210e(annotations, "annotations");
            C24307v type = getType();
            C24362h.m61210e(type, "type");
            return new C23911a(dVar, (C25452k0) null, i, annotations, eVar, type, mo59462F0(), this.f60525i, this.f60526j, this.f60527k, C25435d0.f63736a, new ValueParameterDescriptorImpl$WithDestructuringDeclaration$copy$1(this));
        }
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [zf0.k0] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C23910d(kotlin.reflect.jvm.internal.impl.descriptors.C23894a r8, zf0.C25452k0 r9, int r10, ag0.C20989e r11, ug0.C25069e r12, lh0.C24307v r13, boolean r14, boolean r15, boolean r16, lh0.C24307v r17, zf0.C25435d0 r18) {
        /*
            r7 = this;
            r6 = r7
            java.lang.String r0 = "containingDeclaration"
            r1 = r8
            mf0.C24362h.m61211f(r8, r0)
            java.lang.String r0 = "annotations"
            r2 = r11
            mf0.C24362h.m61211f(r11, r0)
            java.lang.String r0 = "name"
            r3 = r12
            mf0.C24362h.m61211f(r12, r0)
            java.lang.String r0 = "outType"
            r4 = r13
            mf0.C24362h.m61211f(r13, r0)
            java.lang.String r0 = "source"
            r5 = r18
            mf0.C24362h.m61211f(r5, r0)
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = r10
            r6.f60523g = r0
            r0 = r14
            r6.f60524h = r0
            r0 = r15
            r6.f60525i = r0
            r0 = r16
            r6.f60526j = r0
            r0 = r17
            r6.f60527k = r0
            if (r9 != 0) goto L_0x0039
            r0 = r6
            goto L_0x003a
        L_0x0039:
            r0 = r9
        L_0x003a:
            r6.f60528l = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.impl.C23910d.<init>(kotlin.reflect.jvm.internal.impl.descriptors.a, zf0.k0, int, ag0.e, ug0.e, lh0.v, boolean, boolean, boolean, lh0.v, zf0.d0):void");
    }

    /* renamed from: B0 */
    public final <R, D> R mo53398B0(C25447i<R, D> iVar, D d) {
        return iVar.mo60156g(this, d);
    }

    /* renamed from: F0 */
    public final boolean mo59462F0() {
        return this.f60524h && ((CallableMemberDescriptor) m58939b()).mo53433p().isReal();
    }

    /* renamed from: Q */
    public final boolean mo53526Q() {
        return false;
    }

    /* renamed from: b0 */
    public C25452k0 mo59463b0(C25255d dVar, C25069e eVar, int i) {
        C20989e annotations = getAnnotations();
        C24362h.m61210e(annotations, "annotations");
        C24307v type = getType();
        C24362h.m61210e(type, "type");
        return new C23910d(dVar, (C25452k0) null, i, annotations, eVar, type, mo59462F0(), this.f60525i, this.f60526j, this.f60527k, C25435d0.f63736a);
    }

    /* renamed from: c */
    public final C25445h mo53408c(TypeSubstitutor typeSubstitutor) {
        C24362h.m61211f(typeSubstitutor, "substitutor");
        if (typeSubstitutor.mo60249h()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public final Collection<C25452k0> mo53440d() {
        Collection<? extends C23894a> d = m58939b().mo53440d();
        C24362h.m61210e(d, "containingDeclaration.overriddenDescriptors");
        ArrayList arrayList = new ArrayList(C21136j.m49436X(d, 10));
        for (C23894a h : d) {
            arrayList.add(h.mo53442h().get(this.f60523g));
        }
        return arrayList;
    }

    /* renamed from: g */
    public final C25478n mo53429g() {
        C25455m.C25464i iVar = C25455m.f63745f;
        C24362h.m61210e(iVar, "LOCAL");
        return iVar;
    }

    public final int getIndex() {
        return this.f60523g;
    }

    /* renamed from: t0 */
    public final /* bridge */ /* synthetic */ C25498g mo53527t0() {
        return null;
    }

    /* renamed from: u0 */
    public final boolean mo59465u0() {
        return this.f60526j;
    }

    /* renamed from: v0 */
    public final boolean mo59466v0() {
        return this.f60525i;
    }

    /* renamed from: z0 */
    public final C24307v mo59467z0() {
        return this.f60527k;
    }

    /* renamed from: b */
    public final C23894a m58939b() {
        return (C23894a) super.mo53399b();
    }

    /* renamed from: a */
    public final C25452k0 m58937a() {
        C25452k0 k0Var = this.f60528l;
        return k0Var == this ? this : k0Var.mo53407a();
    }
}
