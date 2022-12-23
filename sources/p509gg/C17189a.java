package p509gg;

import com.google.gson.internal.C$Gson$Types;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: gg.a */
public class C17189a<T> {

    /* renamed from: a */
    public final Class<? super T> f44431a;

    /* renamed from: b */
    public final Type f44432b;

    /* renamed from: c */
    public final int f44433c;

    public C17189a() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            Type a = C$Gson$Types.m36262a(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
            this.f44432b = a;
            this.f44431a = C$Gson$Types.m36266e(a);
            this.f44433c = a.hashCode();
            return;
        }
        throw new RuntimeException("Missing type parameter.");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17189a) || !C$Gson$Types.m36264c(this.f44432b, ((C17189a) obj).f44432b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f44433c;
    }

    public final String toString() {
        return C$Gson$Types.m36269h(this.f44432b);
    }

    public C17189a(Type type) {
        type.getClass();
        Type a = C$Gson$Types.m36262a(type);
        this.f44432b = a;
        this.f44431a = C$Gson$Types.m36266e(a);
        this.f44433c = a.hashCode();
    }
}
