package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.C23900c;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import lf0.C24236l;
import mf0.C24362h;
import tf0.C24978j;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo59060d2 = {"Lkotlin/reflect/jvm/internal/impl/descriptors/c;", "descriptor", "", "invoke", "(Lkotlin/reflect/jvm/internal/impl/descriptors/c;)Ljava/lang/CharSequence;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 6, 0})
final class KDeclarationContainerImpl$findFunctionDescriptor$allMembers$1 extends Lambda implements C24236l<C23900c, CharSequence> {

    /* renamed from: f */
    public static final KDeclarationContainerImpl$findFunctionDescriptor$allMembers$1 f60227f = new KDeclarationContainerImpl$findFunctionDescriptor$allMembers$1();

    public KDeclarationContainerImpl$findFunctionDescriptor$allMembers$1() {
        super(1);
    }

    public final Object invoke(Object obj) {
        C23900c cVar = (C23900c) obj;
        C24362h.m61211f(cVar, "descriptor");
        return DescriptorRenderer.f61107b.mo60100E(cVar) + " | " + C24978j.m62673c(cVar).mo59293a();
    }
}
