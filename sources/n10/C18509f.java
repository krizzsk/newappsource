package n10;

import com.appboy.configuration.AppboyConfigurationProvider;
import java.util.Comparator;
import java.util.HashMap;
import p977zz.C20975x0;

/* renamed from: n10.f */
public final class C18509f implements Comparator<String> {

    /* renamed from: b */
    public final HashMap f47133b;

    /* renamed from: n10.f$a */
    public static class C18510a implements Comparable<C18510a> {

        /* renamed from: b */
        public final long f47134b;

        /* renamed from: c */
        public final String f47135c;

        /* renamed from: d */
        public final long f47136d;

        public C18510a(long j, String str, long j2) {
            this.f47134b = j;
            this.f47135c = str;
            this.f47136d = j2;
        }

        /* renamed from: a */
        public final int compareTo(C18510a aVar) {
            int b = C20975x0.m49115b(this.f47134b, aVar.f47134b);
            if (b != 0) {
                return b;
            }
            int compareToIgnoreCase = this.f47135c.compareToIgnoreCase(aVar.f47135c);
            if (compareToIgnoreCase != 0) {
                return compareToIgnoreCase;
            }
            return C20975x0.m49115b(this.f47136d, aVar.f47136d);
        }

        public final String toString() {
            StringBuilder k = C13555b.m33972k("Split[");
            k.append(this.f47134b);
            k.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(this.f47135c);
            k.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            return C25541a.m63884o(k, this.f47136d, "]");
        }
    }

    public C18509f(int i) {
        this.f47133b = new HashMap(i);
    }

    /* renamed from: c */
    public static String m45377c(int i, String str) {
        int length = str.length();
        int i2 = i;
        int i3 = i2;
        while (i2 < length && Character.isDigit(str.charAt(i2))) {
            i3++;
            i2++;
        }
        if (i == i3) {
            return "";
        }
        return str.substring(i, i3);
    }

    /* renamed from: a */
    public final int compare(String str, String str2) {
        return mo50925b(str).compareTo(mo50925b(str2));
    }

    /* renamed from: b */
    public final C18510a mo50925b(String str) {
        String str2;
        long j;
        long j2;
        C18510a aVar = (C18510a) this.f47133b.get(str);
        if (aVar != null) {
            return aVar;
        }
        String c = m45377c(0, str);
        int length = c.length() + 0;
        int length2 = str.length();
        int i = length;
        int i2 = i;
        while (i < length2 && !Character.isDigit(str.charAt(i))) {
            i2++;
            i++;
        }
        if (length == i2) {
            str2 = "";
        } else {
            str2 = str.substring(length, i2);
        }
        String str3 = str2;
        String c2 = m45377c(str3.length() + length, str);
        if (c.isEmpty()) {
            j = Long.MAX_VALUE;
        } else {
            j = Long.parseLong(c);
        }
        long j3 = j;
        if (c2.isEmpty()) {
            j2 = Long.MIN_VALUE;
        } else {
            j2 = Long.parseLong(c2);
        }
        C18510a aVar2 = new C18510a(j3, str3, j2);
        this.f47133b.put(str, aVar2);
        return aVar2;
    }
}
