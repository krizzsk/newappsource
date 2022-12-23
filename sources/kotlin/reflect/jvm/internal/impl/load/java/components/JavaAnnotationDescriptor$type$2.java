package kotlin.reflect.jvm.internal.impl.load.java.components;

import kg0.C23780d;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import lh0.C24312z;
import mf0.C24362h;

public final class JavaAnnotationDescriptor$type$2 extends Lambda implements C24225a<C24312z> {

    /* renamed from: $c */
    public final /* synthetic */ C23780d f60590$c;
    public final /* synthetic */ JavaAnnotationDescriptor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JavaAnnotationDescriptor$type$2(C23780d dVar, JavaAnnotationDescriptor javaAnnotationDescriptor) {
        super(0);
        this.f60590$c = dVar;
        this.this$0 = javaAnnotationDescriptor;
    }

    public final Object invoke() {
        C24312z q = this.f60590$c.f60080a.f60069o.mo59460m().mo59387j(this.this$0.f60585a).mo53412q();
        C24362h.m61210e(q, "c.module.builtIns.getBui…qName(fqName).defaultType");
        return q;
    }
}
