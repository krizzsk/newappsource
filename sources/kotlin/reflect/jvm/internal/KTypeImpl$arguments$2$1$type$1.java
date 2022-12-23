package kotlin.reflect.jvm.internal;

import bf0.C21049c;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C23816b;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import mf0.C24362h;
import tf0.C24973i;

@Metadata(mo59059d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo59060d2 = {"<no name provided>", "Ljava/lang/reflect/Type;", "invoke"}, mo59061k = 3, mo59062mv = {1, 6, 0}, mo59064xi = 48)
final class KTypeImpl$arguments$2$1$type$1 extends Lambda implements C24225a<Type> {

    /* renamed from: $i */
    public final /* synthetic */ int f60274$i;
    public final /* synthetic */ C21049c<List<Type>> $parameterizedTypeArguments$delegate;
    public final /* synthetic */ KTypeImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KTypeImpl$arguments$2$1$type$1(KTypeImpl kTypeImpl, int i, C21049c<? extends List<? extends Type>> cVar) {
        super(0);
        this.this$0 = kTypeImpl;
        this.f60274$i = i;
        this.$parameterizedTypeArguments$delegate = cVar;
    }

    public final Object invoke() {
        Type type;
        Object obj;
        C24973i.C24974a<Type> aVar = this.this$0.f60271b;
        if (aVar == null) {
            type = null;
        } else {
            type = aVar.invoke();
        }
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                obj = cls.getComponentType();
            } else {
                obj = Object.class;
            }
            C24362h.m61210e(obj, "{\n                      …                        }");
            return obj;
        } else if (type instanceof GenericArrayType) {
            if (this.f60274$i == 0) {
                Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
                C24362h.m61210e(genericComponentType, "{\n                      …                        }");
                return genericComponentType;
            }
            throw new KotlinReflectionInternalError(C24362h.m61216k(this.this$0, "Array type has been queried for a non-0th argument: "));
        } else if (type instanceof ParameterizedType) {
            Type type2 = (Type) this.$parameterizedTypeArguments$delegate.getValue().get(this.f60274$i);
            if (type2 instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type2;
                Type[] lowerBounds = wildcardType.getLowerBounds();
                C24362h.m61210e(lowerBounds, "argument.lowerBounds");
                Type type3 = (Type) C23816b.m58440V0(lowerBounds);
                if (type3 == null) {
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    C24362h.m61210e(upperBounds, "argument.upperBounds");
                    type2 = (Type) C23816b.m58439U0(upperBounds);
                } else {
                    type2 = type3;
                }
            }
            C24362h.m61210e(type2, "{\n                      …                        }");
            return type2;
        } else {
            throw new KotlinReflectionInternalError(C24362h.m61216k(this.this$0, "Non-generic type has been queried for arguments: "));
        }
    }
}
