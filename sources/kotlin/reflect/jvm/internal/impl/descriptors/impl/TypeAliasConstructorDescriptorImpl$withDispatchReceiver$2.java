package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import ag0.C20989e;
import cg0.C21163d;
import cg0.C21171g0;
import java.util.List;
import kh0.C23792h;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import lf0.C24225a;
import lh0.C24307v;
import mf0.C24362h;
import zf0.C25430b;
import zf0.C25433c0;
import zf0.C25435d0;
import zf0.C25446h0;
import zf0.C25448i0;
import zf0.C25452k0;

public final class TypeAliasConstructorDescriptorImpl$withDispatchReceiver$2 extends Lambda implements C24225a<TypeAliasConstructorDescriptorImpl> {
    public final /* synthetic */ C25430b $underlyingConstructorDescriptor;
    public final /* synthetic */ TypeAliasConstructorDescriptorImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TypeAliasConstructorDescriptorImpl$withDispatchReceiver$2(TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl, C25430b bVar) {
        super(0);
        this.this$0 = typeAliasConstructorDescriptorImpl;
        this.$underlyingConstructorDescriptor = bVar;
    }

    public final Object invoke() {
        TypeSubstitutor typeSubstitutor;
        C21163d dVar;
        TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl = this.this$0;
        C23792h hVar = typeAliasConstructorDescriptorImpl.f60461E;
        C25446h0 h0Var = typeAliasConstructorDescriptorImpl.f60462F;
        C25430b bVar = this.$underlyingConstructorDescriptor;
        C20989e annotations = bVar.getAnnotations();
        CallableMemberDescriptor.Kind p = this.$underlyingConstructorDescriptor.mo53433p();
        C24362h.m61210e(p, "underlyingConstructorDescriptor.kind");
        C25435d0 e = this.this$0.f60462F.mo53400e();
        C24362h.m61210e(e, "typeAliasDescriptor.source");
        TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl2 = new TypeAliasConstructorDescriptorImpl(hVar, h0Var, bVar, typeAliasConstructorDescriptorImpl, annotations, p, e);
        TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl3 = this.this$0;
        C25430b bVar2 = this.$underlyingConstructorDescriptor;
        TypeAliasConstructorDescriptorImpl.C23905a aVar = TypeAliasConstructorDescriptorImpl.f60459H;
        C25446h0 h0Var2 = typeAliasConstructorDescriptorImpl3.f60462F;
        aVar.getClass();
        if (h0Var2.mo58972t() == null) {
            typeSubstitutor = null;
        } else {
            typeSubstitutor = TypeSubstitutor.m60493d(h0Var2.mo58970L());
        }
        if (typeSubstitutor == null) {
            return null;
        }
        C25433c0 O = bVar2.mo53422O();
        if (O == null) {
            dVar = null;
        } else {
            dVar = O.mo53408c(typeSubstitutor);
        }
        List<C25448i0> r = typeAliasConstructorDescriptorImpl3.f60462F.mo53514r();
        List<C25452k0> h = typeAliasConstructorDescriptorImpl3.mo53442h();
        C24307v vVar = typeAliasConstructorDescriptorImpl3.f60472h;
        C24362h.m61208c(vVar);
        typeAliasConstructorDescriptorImpl2.mo53468Q0((C21171g0) null, dVar, r, h, vVar, Modality.FINAL, typeAliasConstructorDescriptorImpl3.f60462F.mo53429g());
        return typeAliasConstructorDescriptorImpl2;
    }
}
