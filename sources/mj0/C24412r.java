package mj0;

import java.io.File;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URL;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.simpleframework.xml.transform.C24678a;

/* renamed from: mj0.r */
public final class C24412r implements C24411q {
    /* renamed from: a */
    public final C24415u mo58820a(Class cls) throws Exception {
        String name = cls.getName();
        if (name.startsWith("java.lang")) {
            if (cls == Boolean.class) {
                return new C24401g(0);
            }
            if (cls == Integer.class) {
                return new C24404j(1);
            }
            if (cls == Long.class) {
                return new C24406l(1);
            }
            if (cls == Double.class) {
                return new C24399e(1);
            }
            if (cls == Float.class) {
                return new C24402h(1);
            }
            if (cls == Short.class) {
                return new C24398d(1);
            }
            if (cls == Byte.class) {
                return new C24402h(0);
            }
            if (cls == Character.class) {
                return new C24404j(0);
            }
            if (cls == String.class) {
                return new C24400f(1);
            }
            if (cls == Class.class) {
                return new C24405k();
            }
            return null;
        } else if (name.startsWith("java.util")) {
            if (cls == Date.class) {
                return new C24678a(cls);
            }
            if (cls == Locale.class) {
                return new C24410p();
            }
            if (cls == Currency.class) {
                return new C24406l(0);
            }
            if (cls == GregorianCalendar.class) {
                return new C24403i();
            }
            if (cls == TimeZone.class) {
                return new C24401g(2);
            }
            if (cls == AtomicInteger.class) {
                return new C24397c();
            }
            if (cls == AtomicLong.class) {
                return new C24398d(0);
            }
            return null;
        } else if (name.startsWith("java.net")) {
            if (cls == URL.class) {
                return new C24417w();
            }
            return null;
        } else if (name.startsWith("java.io")) {
            if (cls == File.class) {
                return new C24401g(1);
            }
            return null;
        } else if (name.startsWith("java.sql")) {
            if (cls == Time.class) {
                return new C24678a(cls);
            }
            if (cls == java.sql.Date.class) {
                return new C24678a(cls);
            }
            if (cls == Timestamp.class) {
                return new C24678a(cls);
            }
            return null;
        } else if (!name.startsWith("java.math")) {
            Class superclass = cls.getSuperclass();
            if (superclass == null) {
                return null;
            }
            if (superclass.isEnum()) {
                return new C24409o(cls);
            }
            if (cls.isEnum()) {
                return new C24409o(cls);
            }
            return null;
        } else if (cls == BigDecimal.class) {
            return new C24399e(0);
        } else {
            if (cls == BigInteger.class) {
                return new C24400f(0);
            }
            return null;
        }
    }
}
