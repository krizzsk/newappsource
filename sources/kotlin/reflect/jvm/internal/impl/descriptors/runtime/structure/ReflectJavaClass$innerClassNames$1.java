package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import kotlin.jvm.internal.Lambda;
import lf0.C24236l;

final class ReflectJavaClass$innerClassNames$1 extends Lambda implements C24236l<Class<?>, Boolean> {

    /* renamed from: f */
    public static final ReflectJavaClass$innerClassNames$1 f60540f = new ReflectJavaClass$innerClassNames$1();

    public ReflectJavaClass$innerClassNames$1() {
        super(1);
    }

    public final Object invoke(Object obj) {
        boolean z;
        if (((Class) obj).getSimpleName().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
