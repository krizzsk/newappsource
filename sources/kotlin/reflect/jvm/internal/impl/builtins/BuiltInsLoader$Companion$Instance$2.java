package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ServiceLoader;
import kotlin.collections.C23825c;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import mf0.C24362h;

public final class BuiltInsLoader$Companion$Instance$2 extends Lambda implements C24225a<BuiltInsLoader> {

    /* renamed from: f */
    public static final BuiltInsLoader$Companion$Instance$2 f60306f = new BuiltInsLoader$Companion$Instance$2();

    public BuiltInsLoader$Companion$Instance$2() {
        super(0);
    }

    public final Object invoke() {
        Class<BuiltInsLoader> cls = BuiltInsLoader.class;
        ServiceLoader<S> load = ServiceLoader.load(cls, cls.getClassLoader());
        C24362h.m61210e(load, "implementations");
        BuiltInsLoader builtInsLoader = (BuiltInsLoader) C23825c.m58514k0(load);
        if (builtInsLoader != null) {
            return builtInsLoader;
        }
        throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
    }
}
