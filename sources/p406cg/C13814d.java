package p406cg;

import com.google.gson.JsonIOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;

/* renamed from: cg.d */
public final class C13814d implements C13821j<Object> {

    /* renamed from: b */
    public final /* synthetic */ Type f34001b;

    public C13814d(Type type) {
        this.f34001b = type;
    }

    /* renamed from: g */
    public final Object mo40737g() {
        Type type = this.f34001b;
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return EnumSet.noneOf((Class) type2);
            }
            StringBuilder k = C13555b.m33972k("Invalid EnumSet type: ");
            k.append(this.f34001b.toString());
            throw new JsonIOException(k.toString());
        }
        StringBuilder k2 = C13555b.m33972k("Invalid EnumSet type: ");
        k2.append(this.f34001b.toString());
        throw new JsonIOException(k2.toString());
    }
}
