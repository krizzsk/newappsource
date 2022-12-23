package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import lf0.C24236l;
import mf0.C24362h;
import tf0.C24978j;
import zf0.C25491z;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo59060d2 = {"Lzf0/z;", "descriptor", "", "invoke", "(Lzf0/z;)Ljava/lang/CharSequence;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 6, 0})
final class KDeclarationContainerImpl$findPropertyDescriptor$allMembers$1 extends Lambda implements C24236l<C25491z, CharSequence> {

    /* renamed from: f */
    public static final KDeclarationContainerImpl$findPropertyDescriptor$allMembers$1 f60228f = new KDeclarationContainerImpl$findPropertyDescriptor$allMembers$1();

    public KDeclarationContainerImpl$findPropertyDescriptor$allMembers$1() {
        super(1);
    }

    public final Object invoke(Object obj) {
        C25491z zVar = (C25491z) obj;
        C24362h.m61211f(zVar, "descriptor");
        return DescriptorRenderer.f61107b.mo60100E(zVar) + " | " + C24978j.m62672b(zVar).mo61523a();
    }
}
