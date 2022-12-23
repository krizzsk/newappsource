package p988j$.time.format;

import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Locale;
import p988j$.time.temporal.C25830a;
import p988j$.time.temporal.C25842m;
import p988j$.util.concurrent.ConcurrentHashMap;

/* renamed from: j$.time.format.u */
class C25816u {

    /* renamed from: a */
    private static final ConcurrentHashMap f64386a = new ConcurrentHashMap(16, 0.75f, 2);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Comparator f64387b = new C25798c();

    /* renamed from: c */
    public static final /* synthetic */ int f64388c = 0;

    C25816u() {
    }

    /* renamed from: b */
    private static String m64483b(String str) {
        return str.substring(0, Character.charCount(str.codePointAt(0)));
    }

    /* renamed from: c */
    public String mo83673c(C25842m mVar, long j, TextStyle textStyle, Locale locale) {
        Object obj;
        C25842m mVar2 = mVar;
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(mVar2, locale);
        Object obj2 = f64386a.get(simpleImmutableEntry);
        if (obj2 == null) {
            HashMap hashMap = new HashMap();
            int i = 0;
            if (mVar2 == C25830a.ERA) {
                DateFormatSymbols instance = DateFormatSymbols.getInstance(locale);
                HashMap hashMap2 = new HashMap();
                HashMap hashMap3 = new HashMap();
                String[] eras = instance.getEras();
                while (i < eras.length) {
                    if (!eras[i].isEmpty()) {
                        long j2 = (long) i;
                        hashMap2.put(Long.valueOf(j2), eras[i]);
                        hashMap3.put(Long.valueOf(j2), m64483b(eras[i]));
                    }
                    i++;
                }
                if (!hashMap2.isEmpty()) {
                    hashMap.put(TextStyle.FULL, hashMap2);
                    hashMap.put(TextStyle.SHORT, hashMap2);
                    hashMap.put(TextStyle.NARROW, hashMap3);
                }
                obj = new C25815t(hashMap);
            } else if (mVar2 == C25830a.MONTH_OF_YEAR) {
                DateFormatSymbols instance2 = DateFormatSymbols.getInstance(locale);
                HashMap hashMap4 = new HashMap();
                HashMap hashMap5 = new HashMap();
                String[] months = instance2.getMonths();
                for (int i2 = 0; i2 < months.length; i2++) {
                    if (!months[i2].isEmpty()) {
                        long j3 = ((long) i2) + 1;
                        hashMap4.put(Long.valueOf(j3), months[i2]);
                        hashMap5.put(Long.valueOf(j3), m64483b(months[i2]));
                    }
                }
                if (!hashMap4.isEmpty()) {
                    hashMap.put(TextStyle.FULL, hashMap4);
                    hashMap.put(TextStyle.NARROW, hashMap5);
                }
                HashMap hashMap6 = new HashMap();
                String[] shortMonths = instance2.getShortMonths();
                while (i < shortMonths.length) {
                    if (!shortMonths[i].isEmpty()) {
                        hashMap6.put(Long.valueOf(((long) i) + 1), shortMonths[i]);
                    }
                    i++;
                }
                if (!hashMap6.isEmpty()) {
                    hashMap.put(TextStyle.SHORT, hashMap6);
                }
                obj = new C25815t(hashMap);
            } else if (mVar2 == C25830a.DAY_OF_WEEK) {
                DateFormatSymbols instance3 = DateFormatSymbols.getInstance(locale);
                HashMap hashMap7 = new HashMap();
                String[] weekdays = instance3.getWeekdays();
                hashMap7.put(1L, weekdays[2]);
                hashMap7.put(2L, weekdays[3]);
                hashMap7.put(3L, weekdays[4]);
                hashMap7.put(4L, weekdays[5]);
                hashMap7.put(5L, weekdays[6]);
                hashMap7.put(6L, weekdays[7]);
                hashMap7.put(7L, weekdays[1]);
                hashMap.put(TextStyle.FULL, hashMap7);
                HashMap hashMap8 = new HashMap();
                hashMap8.put(1L, m64483b(weekdays[2]));
                hashMap8.put(2L, m64483b(weekdays[3]));
                hashMap8.put(3L, m64483b(weekdays[4]));
                hashMap8.put(4L, m64483b(weekdays[5]));
                hashMap8.put(5L, m64483b(weekdays[6]));
                hashMap8.put(6L, m64483b(weekdays[7]));
                hashMap8.put(7L, m64483b(weekdays[1]));
                hashMap.put(TextStyle.NARROW, hashMap8);
                HashMap hashMap9 = new HashMap();
                String[] shortWeekdays = instance3.getShortWeekdays();
                hashMap9.put(1L, shortWeekdays[2]);
                hashMap9.put(2L, shortWeekdays[3]);
                hashMap9.put(3L, shortWeekdays[4]);
                hashMap9.put(4L, shortWeekdays[5]);
                hashMap9.put(5L, shortWeekdays[6]);
                hashMap9.put(6L, shortWeekdays[7]);
                hashMap9.put(7L, shortWeekdays[1]);
                hashMap.put(TextStyle.SHORT, hashMap9);
                obj = new C25815t(hashMap);
            } else if (mVar2 == C25830a.AMPM_OF_DAY) {
                DateFormatSymbols instance4 = DateFormatSymbols.getInstance(locale);
                HashMap hashMap10 = new HashMap();
                HashMap hashMap11 = new HashMap();
                String[] amPmStrings = instance4.getAmPmStrings();
                while (i < amPmStrings.length) {
                    if (!amPmStrings[i].isEmpty()) {
                        long j4 = (long) i;
                        hashMap10.put(Long.valueOf(j4), amPmStrings[i]);
                        hashMap11.put(Long.valueOf(j4), m64483b(amPmStrings[i]));
                    }
                    i++;
                }
                if (!hashMap10.isEmpty()) {
                    hashMap.put(TextStyle.FULL, hashMap10);
                    hashMap.put(TextStyle.SHORT, hashMap10);
                    hashMap.put(TextStyle.NARROW, hashMap11);
                }
                obj = new C25815t(hashMap);
            } else {
                obj = "";
            }
            ConcurrentHashMap concurrentHashMap = f64386a;
            concurrentHashMap.putIfAbsent(simpleImmutableEntry, obj);
            obj2 = concurrentHashMap.get(simpleImmutableEntry);
        }
        if (obj2 instanceof C25815t) {
            return ((C25815t) obj2).mo83716a(j, textStyle);
        }
        return null;
    }
}
