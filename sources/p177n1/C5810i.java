package p177n1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: n1.i */
public final class C5810i implements C5811j {

    /* renamed from: b */
    public static final Locale[] f18759b = new Locale[0];

    /* renamed from: a */
    public final Locale[] f18760a;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        int i = C5808h.f18757b;
        String[] split = "en-Latn".split("-", -1);
        if (split.length > 2) {
            new Locale(split[0], split[1], split[2]);
        } else if (split.length > 1) {
            new Locale(split[0], split[1]);
        } else if (split.length == 1) {
            new Locale(split[0]);
        } else {
            throw new IllegalArgumentException("Can not parse language tag: [en-Latn]");
        }
    }

    public C5810i(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f18760a = f18759b;
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        int i = 0;
        while (i < localeArr.length) {
            Locale locale = localeArr[i];
            if (locale != null) {
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    locale2.getLanguage();
                    String country = locale2.getCountry();
                    if (country != null && !country.isEmpty()) {
                        locale2.getCountry();
                    }
                    hashSet.add(locale2);
                }
                i++;
            } else {
                throw new NullPointerException(C25541a.m63878h("list[", i, "] is null"));
            }
        }
        this.f18760a = (Locale[]) arrayList.toArray(new Locale[0]);
    }

    /* renamed from: a */
    public final Object mo21679a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5810i)) {
            return false;
        }
        Locale[] localeArr = ((C5810i) obj).f18760a;
        if (this.f18760a.length != localeArr.length) {
            return false;
        }
        int i = 0;
        while (true) {
            Locale[] localeArr2 = this.f18760a;
            if (i >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i].equals(localeArr[i])) {
                return false;
            }
            i++;
        }
    }

    public final Locale get(int i) {
        if (i >= 0) {
            Locale[] localeArr = this.f18760a;
            if (i < localeArr.length) {
                return localeArr[i];
            }
        }
        return null;
    }

    public final int hashCode() {
        int i = 1;
        for (Locale hashCode : this.f18760a) {
            i = (i * 31) + hashCode.hashCode();
        }
        return i;
    }

    public final int size() {
        return this.f18760a.length;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.f18760a;
            if (i < localeArr.length) {
                k.append(localeArr[i]);
                if (i < this.f18760a.length - 1) {
                    k.append(',');
                }
                i++;
            } else {
                k.append("]");
                return k.toString();
            }
        }
    }
}
