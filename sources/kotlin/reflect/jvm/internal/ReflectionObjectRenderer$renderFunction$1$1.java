package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import lf0.C24236l;
import lh0.C24307v;
import mf0.C24362h;
import zf0.C25452k0;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo59060d2 = {"Lzf0/k0;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Lzf0/k0;)Ljava/lang/CharSequence;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 6, 0})
public final class ReflectionObjectRenderer$renderFunction$1$1 extends Lambda implements C24236l<C25452k0, CharSequence> {

    /* renamed from: f */
    public static final ReflectionObjectRenderer$renderFunction$1$1 f60282f = new ReflectionObjectRenderer$renderFunction$1$1();

    public ReflectionObjectRenderer$renderFunction$1$1() {
        super(1);
    }

    public final Object invoke(Object obj) {
        DescriptorRendererImpl descriptorRendererImpl = ReflectionObjectRenderer.f60280a;
        C24307v type = ((C25452k0) obj).getType();
        C24362h.m61210e(type, "it.type");
        return ReflectionObjectRenderer.m58644d(type);
    }
}
