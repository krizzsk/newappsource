package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.EnumMap;
import java.util.HashMap;
import kotlin.reflect.jvm.internal.impl.builtins.C23867c;
import lf0.C24225a;
import lh0.C24312z;

/* renamed from: kotlin.reflect.jvm.internal.impl.builtins.b */
public final class C23866b implements C24225a<C23867c.C23868a> {

    /* renamed from: b */
    public final /* synthetic */ C23867c f60308b;

    public C23866b(C23867c cVar) {
        this.f60308b = cVar;
    }

    public final Object invoke() {
        EnumMap enumMap = new EnumMap(PrimitiveType.class);
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (PrimitiveType primitiveType : PrimitiveType.values()) {
            C24312z b = C23867c.m58682b(this.f60308b, primitiveType.getTypeName().mo61604f());
            C24312z b2 = C23867c.m58682b(this.f60308b, primitiveType.getArrayTypeName().mo61604f());
            enumMap.put(primitiveType, b2);
            hashMap.put(b, b2);
            hashMap2.put(b2, b);
        }
        return new C23867c.C23868a(enumMap, hashMap, hashMap2);
    }
}
