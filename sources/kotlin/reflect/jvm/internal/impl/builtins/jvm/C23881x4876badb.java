package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kg0.C23777b;
import kg0.C23780d;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import lf0.C24225a;
import mf0.C24362h;
import zf0.C25432c;
import zf0.C25442g;

/* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$getAdditionalFunctions$fakeJavaClassDescriptor$1 */
final class C23881x4876badb extends Lambda implements C24225a<C25432c> {
    public final /* synthetic */ LazyJavaClassDescriptor $javaAnalogueDescriptor;
    public final /* synthetic */ C25432c $kotlinMutableClassIfContainer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23881x4876badb(LazyJavaClassDescriptor lazyJavaClassDescriptor, C25432c cVar) {
        super(0);
        this.$javaAnalogueDescriptor = lazyJavaClassDescriptor;
        this.$kotlinMutableClassIfContainer = cVar;
    }

    public final Object invoke() {
        LazyJavaClassDescriptor lazyJavaClassDescriptor = this.$javaAnalogueDescriptor;
        C25432c cVar = this.$kotlinMutableClassIfContainer;
        lazyJavaClassDescriptor.getClass();
        C23780d dVar = lazyJavaClassDescriptor.f60639l;
        C23777b bVar = dVar.f60080a;
        bVar.getClass();
        C25432c cVar2 = cVar;
        C23777b bVar2 = r6;
        C23777b bVar3 = new C23777b(bVar.f60055a, bVar.f60056b, bVar.f60057c, bVar.f60058d, bVar.f60059e, bVar.f60060f, bVar.f60062h, bVar.f60063i, bVar.f60064j, bVar.f60065k, bVar.f60066l, bVar.f60067m, bVar.f60068n, bVar.f60069o, bVar.f60070p, bVar.f60071q, bVar.f60072r, bVar.f60073s, bVar.f60074t, bVar.f60075u, bVar.f60076v, bVar.f60077w);
        C23780d dVar2 = new C23780d(bVar2, dVar.f60081b, dVar.f60082c);
        C25442g b = lazyJavaClassDescriptor.mo53399b();
        C24362h.m61210e(b, "containingDeclaration");
        return new LazyJavaClassDescriptor(dVar2, b, lazyJavaClassDescriptor.f60637j, cVar2);
    }
}
