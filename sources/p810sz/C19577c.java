package p810sz;

import android.text.TextUtils;
import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.IOException;
import java.lang.Enum;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.EnumSet;

/* renamed from: sz.c */
public final class C19577c<T extends Enum<T>> implements C19584i<T> {

    /* renamed from: u */
    public final ArrayList<T> f49761u;

    /* renamed from: v */
    public final EnumMap<T, Short> f49762v;

    @SafeVarargs
    public C19577c(Class<T> cls, T... tArr) {
        if (tArr.length <= 32767) {
            this.f49761u = new ArrayList<>(tArr.length);
            this.f49762v = new EnumMap<>(cls);
            EnumSet<E> allOf = EnumSet.allOf(cls);
            for (short s = 0; s < tArr.length; s = (short) (s + 1)) {
                T t = tArr[s];
                this.f49761u.add(t);
                if (t != null) {
                    this.f49762v.put(t, Short.valueOf(s));
                    allOf.remove(t);
                }
            }
            if (!allOf.isEmpty()) {
                String join = TextUtils.join(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, allOf);
                StringBuilder k = C13555b.m33972k("Missing ");
                k.append(cls.getSimpleName());
                k.append(" values in the given list: ");
                k.append(join);
                throw new IllegalArgumentException(k.toString());
            }
            return;
        }
        throw new IllegalArgumentException("Enum too large");
    }

    /* renamed from: a */
    public final T mo51916a(short s) {
        return (Enum) this.f49761u.get(s);
    }

    /* renamed from: b */
    public final short mo51917b(T t) {
        return this.f49762v.get(t).shortValue();
    }

    public final Object read(C19615p pVar) throws IOException {
        return mo51916a(pVar.mo51926r());
    }

    public final void write(Object obj, C19616q qVar) throws IOException {
        qVar.mo51941r(mo51917b((Enum) obj));
    }
}
