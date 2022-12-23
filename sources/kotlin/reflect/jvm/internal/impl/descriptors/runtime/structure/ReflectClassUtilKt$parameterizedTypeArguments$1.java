package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import mf0.C24362h;

public final class ReflectClassUtilKt$parameterizedTypeArguments$1 extends Lambda implements C24236l<ParameterizedType, ParameterizedType> {

    /* renamed from: f */
    public static final ReflectClassUtilKt$parameterizedTypeArguments$1 f60534f = new ReflectClassUtilKt$parameterizedTypeArguments$1();

    public ReflectClassUtilKt$parameterizedTypeArguments$1() {
        super(1);
    }

    public final Object invoke(Object obj) {
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        C24362h.m61211f(parameterizedType, "it");
        Type ownerType = parameterizedType.getOwnerType();
        if (ownerType instanceof ParameterizedType) {
            return (ParameterizedType) ownerType;
        }
        return null;
    }
}
