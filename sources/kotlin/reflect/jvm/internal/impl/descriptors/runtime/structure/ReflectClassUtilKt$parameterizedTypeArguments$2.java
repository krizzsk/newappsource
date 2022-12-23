package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.collections.C23816b;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import mf0.C24362h;
import th0.C25003h;

public final class ReflectClassUtilKt$parameterizedTypeArguments$2 extends Lambda implements C24236l<ParameterizedType, C25003h<? extends Type>> {

    /* renamed from: f */
    public static final ReflectClassUtilKt$parameterizedTypeArguments$2 f60535f = new ReflectClassUtilKt$parameterizedTypeArguments$2();

    public ReflectClassUtilKt$parameterizedTypeArguments$2() {
        super(1);
    }

    public final Object invoke(Object obj) {
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        C24362h.m61211f(parameterizedType, "it");
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        C24362h.m61210e(actualTypeArguments, "it.actualTypeArguments");
        return C23816b.m58436R0(actualTypeArguments);
    }
}
