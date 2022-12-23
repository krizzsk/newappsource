package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import ag0.C20989e;
import cg0.C21178j0;
import kh0.C23792h;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.descriptors.C23894a;
import kotlin.reflect.jvm.internal.impl.descriptors.C23900c;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C23907b;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import lh0.C24307v;
import mf0.C24362h;
import mf0.C24365j;
import sf0.C24866j;
import ug0.C25069e;
import ug0.C25071g;
import zf0.C25430b;
import zf0.C25432c;
import zf0.C25435d0;
import zf0.C25440f;
import zf0.C25442g;
import zf0.C25446h0;
import zf0.C25449j;
import zf0.C25453l;

public final class TypeAliasConstructorDescriptorImpl extends C23907b implements C21178j0 {

    /* renamed from: H */
    public static final C23905a f60459H = new C23905a();

    /* renamed from: I */
    public static final /* synthetic */ C24866j<Object>[] f60460I = {C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(TypeAliasConstructorDescriptorImpl.class), "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"))};

    /* renamed from: E */
    public final C23792h f60461E;

    /* renamed from: F */
    public final C25446h0 f60462F;

    /* renamed from: G */
    public C25430b f60463G;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl$a */
    public static final class C23905a {
    }

    public /* synthetic */ TypeAliasConstructorDescriptorImpl() {
        throw null;
    }

    public TypeAliasConstructorDescriptorImpl(C23792h hVar, C25446h0 h0Var, C25430b bVar, C21178j0 j0Var, C20989e eVar, CallableMemberDescriptor.Kind kind, C25435d0 d0Var) {
        super(kind, h0Var, j0Var, d0Var, eVar, C25071g.f63270e);
        this.f60461E = hVar;
        this.f60462F = h0Var;
        this.f60483s = h0Var.mo53427a0();
        hVar.mo59022g(new TypeAliasConstructorDescriptorImpl$withDispatchReceiver$2(this, bVar));
        this.f60463G = bVar;
    }

    /* renamed from: N0 */
    public final C23907b mo53467N0(CallableMemberDescriptor.Kind kind, C25442g gVar, C23900c cVar, C25435d0 d0Var, C20989e eVar, C25069e eVar2) {
        C24362h.m61211f(gVar, "newOwner");
        C24362h.m61211f(kind, "kind");
        C24362h.m61211f(eVar, "annotations");
        return new TypeAliasConstructorDescriptorImpl(this.f60461E, this.f60462F, this.f60463G, this, eVar, CallableMemberDescriptor.Kind.DECLARATION, d0Var);
    }

    /* renamed from: U */
    public final C25430b mo53501U() {
        return this.f60463G;
    }

    /* renamed from: W */
    public final C25449j mo53425W() {
        return (C21178j0) super.m58883a();
    }

    /* renamed from: W0 */
    public final C21178j0 mo53473l0(C25442g gVar, Modality modality, C25453l lVar, CallableMemberDescriptor.Kind kind) {
        C24362h.m61211f(gVar, "newOwner");
        C24362h.m61211f(lVar, "visibility");
        C24362h.m61211f(kind, "kind");
        C23907b.C23908a aVar = (C23907b.C23908a) mo53474u();
        aVar.mo59431j(gVar);
        aVar.mo59433l(modality);
        aVar.mo59436o(lVar);
        aVar.mo59438q(kind);
        aVar.f60502l = false;
        C23900c build = aVar.build();
        if (build != null) {
            return (C21178j0) build;
        }
        throw new NullPointerException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
    }

    /* renamed from: X0 */
    public final TypeAliasConstructorDescriptorImpl m58854c(TypeSubstitutor typeSubstitutor) {
        C24362h.m61211f(typeSubstitutor, "substitutor");
        C23900c c = super.m58886c(typeSubstitutor);
        if (c != null) {
            TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl = (TypeAliasConstructorDescriptorImpl) c;
            C24307v vVar = typeAliasConstructorDescriptorImpl.f60472h;
            C24362h.m61208c(vVar);
            C25430b c2 = this.f60463G.mo53407a().mo53408c(TypeSubstitutor.m60493d(vVar));
            if (c2 == null) {
                return null;
            }
            typeAliasConstructorDescriptorImpl.f60463G = c2;
            return typeAliasConstructorDescriptorImpl;
        }
        throw new NullPointerException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
    }

    /* renamed from: a */
    public final C23894a m58847a() {
        return (C21178j0) super.m58883a();
    }

    /* renamed from: b */
    public final C25440f mo53399b() {
        return this.f60462F;
    }

    /* renamed from: f0 */
    public final boolean mo53499f0() {
        return this.f60463G.mo53499f0();
    }

    /* renamed from: g0 */
    public final C25432c mo53500g0() {
        C25432c g0 = this.f60463G.mo53500g0();
        C24362h.m61210e(g0, "underlyingConstructorDescriptor.constructedClass");
        return g0;
    }

    /* renamed from: i */
    public final C24307v mo53443i() {
        C24307v vVar = this.f60472h;
        C24362h.m61208c(vVar);
        return vVar;
    }

    /* renamed from: a */
    public final CallableMemberDescriptor mo53407a() {
        return (C21178j0) super.m58883a();
    }

    /* renamed from: b */
    public final C25442g m58851b() {
        return this.f60462F;
    }

    /* renamed from: a */
    public final C23900c m58848a() {
        return (C21178j0) super.m58883a();
    }

    /* renamed from: a */
    public final C25442g m58849a() {
        return (C21178j0) super.m58883a();
    }
}
