package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import kotlin.reflect.jvm.internal.impl.load.kotlin.header.C23981a;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.e */
public final class C23988e extends C23981a.C23982a {

    /* renamed from: b */
    public final /* synthetic */ C23981a.C23984c f60788b;

    public C23988e(C23981a.C23984c cVar) {
        this.f60788b = cVar;
    }

    /* renamed from: f */
    public final void mo59598f(String[] strArr) {
        if (strArr != null) {
            C23981a.this.f60777d = strArr;
        } else {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1", "visitEnd"}));
        }
    }
}
