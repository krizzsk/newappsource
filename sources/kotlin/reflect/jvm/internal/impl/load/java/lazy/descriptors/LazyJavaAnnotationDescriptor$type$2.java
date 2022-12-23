package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C23912a;
import lf0.C24225a;
import lh0.C24289p;
import lh0.C24312z;
import mf0.C24362h;
import p583jk.C17875h;
import ug0.C25065b;
import ug0.C25066c;
import zf0.C25432c;

public final class LazyJavaAnnotationDescriptor$type$2 extends Lambda implements C24225a<C24312z> {
    public final /* synthetic */ LazyJavaAnnotationDescriptor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaAnnotationDescriptor$type$2(LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor) {
        super(0);
        this.this$0 = lazyJavaAnnotationDescriptor;
    }

    public final Object invoke() {
        C25066c f = this.this$0.mo53066f();
        if (f == null) {
            return C24289p.m60914d(C24362h.m61216k(this.this$0.f60629b, "No fqName: "));
        }
        C25432c G = C17875h.m44283G(C17875h.f45862f, f, this.this$0.f60628a.f60080a.f60069o.mo59460m());
        if (G == null) {
            C23912a x = this.this$0.f60629b.mo58481x();
            if (x == null) {
                G = null;
            } else {
                G = this.this$0.f60628a.f60080a.f60065k.mo59012a(x);
            }
            if (G == null) {
                LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor = this.this$0;
                G = FindClassInModuleKt.m58737c(lazyJavaAnnotationDescriptor.f60628a.f60080a.f60069o, C25065b.m62790l(f), lazyJavaAnnotationDescriptor.f60628a.f60080a.f60058d.mo59585c().f59322l);
            }
        }
        return G.mo53412q();
    }
}
