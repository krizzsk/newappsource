package bj0;

import com.appboy.configuration.AppboyConfigurationProvider;
import dj0.C23277c;
import java.util.ArrayList;

/* renamed from: bj0.b */
public abstract class C21085b {

    /* renamed from: a */
    public ArrayList<C23277c> f52906a;

    /* renamed from: a */
    public abstract double mo53239a();

    /* renamed from: b */
    public abstract double mo53240b();

    /* renamed from: c */
    public abstract double mo53241c();

    public final boolean equals(Object obj) {
        if (!(obj instanceof C21085b)) {
            return super.equals(obj);
        }
        C21085b bVar = (C21085b) obj;
        if (mo53239a() == bVar.mo53239a() && mo53240b() == bVar.mo53240b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(mo53239a()) ^ (Double.doubleToLongBits(mo53240b()) * 31);
        return ((int) doubleToLongBits) ^ ((int) (doubleToLongBits >> 32));
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("[");
        k.append(mo53239a());
        k.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
        k.append(mo53240b());
        k.append("]");
        return k.toString();
    }
}
