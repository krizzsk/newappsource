package kotlin.reflect.jvm.internal.impl.load.java;

import ag0.C20986c;
import hg0.C23459a;
import kotlin.jvm.internal.FunctionReference;
import lf0.C24236l;
import mf0.C24362h;
import mf0.C24365j;
import sf0.C24857d;
import zf0.C25432c;

final /* synthetic */ class AnnotationTypeQualifierResolver$resolvedNicknames$1 extends FunctionReference implements C24236l<C25432c, C20986c> {
    public AnnotationTypeQualifierResolver$resolvedNicknames$1(Object obj) {
        super(1, obj);
    }

    public final String getName() {
        return "computeTypeQualifierNickname";
    }

    public final C24857d getOwner() {
        return C24365j.m61219a(C23922a.class);
    }

    public final String getSignature() {
        return "computeTypeQualifierNickname(Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;)Lorg/jetbrains/kotlin/descriptors/annotations/AnnotationDescriptor;";
    }

    public final Object invoke(Object obj) {
        C25432c cVar = (C25432c) obj;
        C24362h.m61211f(cVar, "p0");
        C23922a aVar = (C23922a) this.receiver;
        aVar.getClass();
        if (!cVar.getAnnotations().mo53070b1(C23459a.f59233a)) {
            return null;
        }
        for (C20986c d : cVar.getAnnotations()) {
            C20986c d2 = aVar.mo59500d(d);
            if (d2 != null) {
                return d2;
            }
        }
        return null;
    }
}
