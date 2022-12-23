package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import lf0.C24236l;
import mf0.C24362h;

@Metadata(mo59059d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo59060d2 = {"<anonymous>", "", "it", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "invoke"}, mo59061k = 3, mo59062mv = {1, 6, 0}, mo59064xi = 48)
final class RuntimeTypeMapperKt$signature$1 extends Lambda implements C24236l<Class<?>, CharSequence> {

    /* renamed from: f */
    public static final RuntimeTypeMapperKt$signature$1 f60284f = new RuntimeTypeMapperKt$signature$1();

    public RuntimeTypeMapperKt$signature$1() {
        super(1);
    }

    public final Object invoke(Object obj) {
        Class cls = (Class) obj;
        C24362h.m61210e(cls, "it");
        return ReflectClassUtilKt.m58950b(cls);
    }
}
