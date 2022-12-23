package p988j$.util;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

/* renamed from: j$.util.i */
public abstract class C26011i {
    /* renamed from: a */
    public static Optional m64868a(Optional optional) {
        if (optional == null) {
            return null;
        }
        return optional.isPresent() ? Optional.m64694d(optional.get()) : Optional.m64693a();
    }

    /* renamed from: b */
    public static C26012j m64869b(OptionalDouble optionalDouble) {
        if (optionalDouble == null) {
            return null;
        }
        return optionalDouble.isPresent() ? C26012j.m64877d(optionalDouble.getAsDouble()) : C26012j.m64876a();
    }

    /* renamed from: c */
    public static C26013k m64870c(OptionalInt optionalInt) {
        if (optionalInt == null) {
            return null;
        }
        return optionalInt.isPresent() ? C26013k.m64881d(optionalInt.getAsInt()) : C26013k.m64880a();
    }

    /* renamed from: d */
    public static C26014l m64871d(OptionalLong optionalLong) {
        if (optionalLong == null) {
            return null;
        }
        return optionalLong.isPresent() ? C26014l.m64885d(optionalLong.getAsLong()) : C26014l.m64884a();
    }

    /* renamed from: e */
    public static Optional m64872e(Optional optional) {
        if (optional == null) {
            return null;
        }
        return optional.mo83878c() ? Optional.of(optional.mo83877b()) : Optional.empty();
    }

    /* renamed from: f */
    public static OptionalDouble m64873f(C26012j jVar) {
        if (jVar == null) {
            return null;
        }
        return jVar.mo84112c() ? OptionalDouble.of(jVar.mo84111b()) : OptionalDouble.empty();
    }

    /* renamed from: g */
    public static OptionalInt m64874g(C26013k kVar) {
        if (kVar == null) {
            return null;
        }
        return kVar.mo84117c() ? OptionalInt.of(kVar.mo84116b()) : OptionalInt.empty();
    }

    /* renamed from: h */
    public static OptionalLong m64875h(C26014l lVar) {
        if (lVar == null) {
            return null;
        }
        return lVar.mo84122c() ? OptionalLong.of(lVar.mo84121b()) : OptionalLong.empty();
    }
}
