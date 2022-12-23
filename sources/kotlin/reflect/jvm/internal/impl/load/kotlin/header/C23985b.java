package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import kotlin.reflect.jvm.internal.impl.load.kotlin.header.C23981a;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.b */
public final class C23985b extends C23981a.C23982a {

    /* renamed from: b */
    public final /* synthetic */ C23981a.C23983b f60785b;

    public C23985b(C23981a.C23983b bVar) {
        this.f60785b = bVar;
    }

    /* renamed from: f */
    public final void mo59598f(String[] strArr) {
        if (strArr != null) {
            C23981a.this.f60777d = strArr;
        } else {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1", "visitEnd"}));
        }
    }
}
