package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import ih0.C23606c;
import java.io.InputStream;
import kotlin.jvm.internal.FunctionReference;
import lf0.C24236l;
import mf0.C24362h;
import mf0.C24365j;
import sf0.C24857d;

public /* synthetic */ class BuiltInsLoaderImpl$createPackageFragmentProvider$1 extends FunctionReference implements C24236l<String, InputStream> {
    public BuiltInsLoaderImpl$createPackageFragmentProvider$1(C23606c cVar) {
        super(1, cVar);
    }

    public final String getName() {
        return "loadResource";
    }

    public final C24857d getOwner() {
        return C24365j.m61219a(C23606c.class);
    }

    public final String getSignature() {
        return "loadResource(Ljava/lang/String;)Ljava/io/InputStream;";
    }

    public final Object invoke(Object obj) {
        String str = (String) obj;
        C24362h.m61211f(str, "p0");
        ((C23606c) this.receiver).getClass();
        return C23606c.m57791a(str);
    }
}
