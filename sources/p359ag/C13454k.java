package p359ag;

import com.google.gson.internal.LazilyParsedNumber;
import java.io.Serializable;
import java.math.BigInteger;

/* renamed from: ag.k */
public final class C13454k extends C13450g {

    /* renamed from: b */
    public final Serializable f33307b;

    public C13454k(Boolean bool) {
        bool.getClass();
        this.f33307b = bool;
    }

    /* renamed from: D */
    public static boolean m33763D(C13454k kVar) {
        Serializable serializable = kVar.f33307b;
        if (serializable instanceof Number) {
            Number number = (Number) serializable;
            if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: B */
    public final String mo40326B() {
        Serializable serializable = this.f33307b;
        if (serializable instanceof Number) {
            return mo40357C().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        return (String) serializable;
    }

    /* renamed from: C */
    public final Number mo40357C() {
        Serializable serializable = this.f33307b;
        return serializable instanceof String ? new LazilyParsedNumber((String) serializable) : (Number) serializable;
    }

    /* renamed from: e */
    public final C13450g mo40330e() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C13454k.class != obj.getClass()) {
            return false;
        }
        C13454k kVar = (C13454k) obj;
        if (this.f33307b == null) {
            if (kVar.f33307b == null) {
                return true;
            }
            return false;
        } else if (!m33763D(this) || !m33763D(kVar)) {
            Serializable serializable = this.f33307b;
            if (!(serializable instanceof Number) || !(kVar.f33307b instanceof Number)) {
                return serializable.equals(kVar.f33307b);
            }
            double doubleValue = mo40357C().doubleValue();
            double doubleValue2 = kVar.mo40357C().doubleValue();
            if (doubleValue == doubleValue2) {
                return true;
            }
            if (!Double.isNaN(doubleValue) || !Double.isNaN(doubleValue2)) {
                return false;
            }
            return true;
        } else if (mo40357C().longValue() == kVar.mo40357C().longValue()) {
            return true;
        } else {
            return false;
        }
    }

    public final int hashCode() {
        long j;
        if (this.f33307b == null) {
            return 31;
        }
        if (m33763D(this)) {
            j = mo40357C().longValue();
        } else {
            Serializable serializable = this.f33307b;
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            j = Double.doubleToLongBits(mo40357C().doubleValue());
        }
        return (int) ((j >>> 32) ^ j);
    }

    /* renamed from: i */
    public final boolean mo40333i() {
        Serializable serializable = this.f33307b;
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).booleanValue();
        }
        return Boolean.parseBoolean(mo40326B());
    }

    /* renamed from: m */
    public final double mo40335m() {
        if (this.f33307b instanceof Number) {
            return mo40357C().doubleValue();
        }
        return Double.parseDouble(mo40326B());
    }

    /* renamed from: n */
    public final float mo40336n() {
        if (this.f33307b instanceof Number) {
            return mo40357C().floatValue();
        }
        return Float.parseFloat(mo40326B());
    }

    /* renamed from: p */
    public final int mo40337p() {
        if (this.f33307b instanceof Number) {
            return mo40357C().intValue();
        }
        return Integer.parseInt(mo40326B());
    }

    /* renamed from: z */
    public final long mo40339z() {
        if (this.f33307b instanceof Number) {
            return mo40357C().longValue();
        }
        return Long.parseLong(mo40326B());
    }

    public C13454k(Number number) {
        number.getClass();
        this.f33307b = number;
    }

    public C13454k(String str) {
        str.getClass();
        this.f33307b = str;
    }
}
