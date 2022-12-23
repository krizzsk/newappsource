package kotlin.reflect.jvm.internal;

import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.collections.C23816b;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import lh0.C24307v;
import mf0.C24362h;
import tf0.C24979k;
import zf0.C25432c;
import zf0.C25437e;

@Metadata(mo59059d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo59060d2 = {"<anonymous>", "Ljava/lang/reflect/Type;", "T", "", "invoke"}, mo59061k = 3, mo59062mv = {1, 6, 0}, mo59064xi = 48)
final class KClassImpl$Data$supertypes$2$1$1 extends Lambda implements C24225a<Type> {
    public final /* synthetic */ C24307v $kotlinType;
    public final /* synthetic */ KClassImpl<Object>.Data this$0;
    public final /* synthetic */ KClassImpl<Object> this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KClassImpl$Data$supertypes$2$1$1(C24307v vVar, KClassImpl<Object>.Data data, KClassImpl<Object> kClassImpl) {
        super(0);
        this.$kotlinType = vVar;
        this.this$0 = data;
        this.this$1 = kClassImpl;
    }

    public final Object invoke() {
        C25437e o = this.$kotlinType.mo60411O0().mo53460o();
        if (o instanceof C25432c) {
            Class<?> g = C24979k.m62680g((C25432c) o);
            if (g == null) {
                StringBuilder k = C13555b.m33972k("Unsupported superclass of ");
                k.append(this.this$0);
                k.append(": ");
                k.append(o);
                throw new KotlinReflectionInternalError(k.toString());
            } else if (C24362h.m61206a(this.this$1.f60209c.getSuperclass(), g)) {
                Type genericSuperclass = this.this$1.f60209c.getGenericSuperclass();
                C24362h.m61210e(genericSuperclass, "{\n                      …ass\n                    }");
                return genericSuperclass;
            } else {
                Class[] interfaces = this.this$1.f60209c.getInterfaces();
                C24362h.m61210e(interfaces, "jClass.interfaces");
                int X0 = C23816b.m58442X0(g, interfaces);
                if (X0 >= 0) {
                    Type type = this.this$1.f60209c.getGenericInterfaces()[X0];
                    C24362h.m61210e(type, "{\n                      …ex]\n                    }");
                    return type;
                }
                StringBuilder k2 = C13555b.m33972k("No superclass of ");
                k2.append(this.this$0);
                k2.append(" in Java reflection for ");
                k2.append(o);
                throw new KotlinReflectionInternalError(k2.toString());
            }
        } else {
            throw new KotlinReflectionInternalError(C24362h.m61216k(o, "Supertype not a class: "));
        }
    }
}
