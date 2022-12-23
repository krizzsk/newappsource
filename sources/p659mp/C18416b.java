package p659mp;

import com.appboy.configuration.AppboyConfigurationProvider;
import com.masabi.justride.usagePeriodCalculator.UsagePeriodSpecificationException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;
import p001a0.C0016g;
import p001a0.C0017h;
import p358af.C13437d;

/* renamed from: mp.b */
public final class C18416b {

    /* renamed from: a */
    public static final HashSet f46969a = new HashSet(Arrays.asList(new String[]{"DURATION", "ALIGNMENT", "DAYSTART", "MINDURATION"}));

    /* renamed from: a */
    public static long m45254a(String str, TimeZone timeZone, long j, Integer num, String str2) throws UsagePeriodSpecificationException {
        int i;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeZone(timeZone);
        long intValue = (long) (num.intValue() * 1000);
        gregorianCalendar.setTimeInMillis(j - intValue);
        List<String> asList = Arrays.asList(str.split(Pattern.quote("+")));
        HashMap hashMap = new HashMap();
        for (String str3 : asList) {
            String substring = str3.substring(1);
            if (substring.isEmpty()) {
                i = 0;
            } else {
                i = m45256c(substring);
            }
            String substring2 = str3.substring(0, 1);
            if (i > 0) {
                hashMap.put(substring2, Integer.valueOf(i));
            } else {
                throw new UsagePeriodSpecificationException(C0016g.m31o(C16759e.m42352h("Usage Period Specification '", str2, "=", str, "' invalid: "), substring2, " term must be larger than 0"));
            }
        }
        for (String str4 : hashMap.keySet()) {
            if (str4.startsWith("M")) {
                int i2 = gregorianCalendar.get(5);
                gregorianCalendar.add(2, ((Integer) hashMap.get(str4)).intValue());
                if (gregorianCalendar.get(5) < i2) {
                    gregorianCalendar.add(6, 1);
                }
            } else if (str4.startsWith("D")) {
                gregorianCalendar.add(6, ((Integer) hashMap.get(str4)).intValue());
            } else if (str4.startsWith("H")) {
                gregorianCalendar.add(11, ((Integer) hashMap.get(str4)).intValue());
            } else if (str4.startsWith("U")) {
                gregorianCalendar.add(12, ((Integer) hashMap.get(str4)).intValue());
            }
        }
        return (gregorianCalendar.getTimeInMillis() + intValue) - 1;
    }

    /* renamed from: b */
    public static C18415a m45255b(long j, String str, TimeZone timeZone, long j2, long j3) throws UsagePeriodSpecificationException {
        boolean z;
        String str2;
        int valueOf;
        long j4;
        long j5;
        String str3 = str;
        HashMap hashMap = new HashMap();
        boolean z2 = false;
        if (str3 != null) {
            String[] split = str3.split(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            int length = split.length;
            int i = 0;
            while (i < length) {
                String[] split2 = split[i].split("=");
                if (split2.length == 2) {
                    String trim = split2[0].trim();
                    String trim2 = split2[1].trim();
                    if (!f46969a.contains(trim)) {
                        throw new UsagePeriodSpecificationException(C13437d.m33706k("Invalid key '", trim, "' in Usage Period Specification"));
                    } else if (!hashMap.containsKey(trim)) {
                        hashMap.put(trim, trim2);
                        i++;
                    } else {
                        throw new UsagePeriodSpecificationException(C13437d.m33706k("Duplicate key '", trim, "' in Usage Period Specification"));
                    }
                } else {
                    throw new UsagePeriodSpecificationException(C13437d.m33706k("Usage Period Specification '", str3, "' cannot be parsed"));
                }
            }
        }
        if (hashMap.containsKey("DURATION")) {
            String str4 = (String) hashMap.get("DAYSTART");
            if (str4 == null) {
                valueOf = 0;
            } else {
                if (str4.startsWith("-")) {
                    str2 = str4.substring(1);
                    z = true;
                } else {
                    z = false;
                    str2 = str4;
                }
                try {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH);
                    simpleDateFormat.setLenient(false);
                    Date parse = simpleDateFormat.parse(str2);
                    Calendar instance = Calendar.getInstance();
                    instance.setTime(parse);
                    int i2 = (instance.get(12) * 60) + (instance.get(11) * 60 * 60) + instance.get(13);
                    if (z) {
                        i2 = -i2;
                    }
                    valueOf = Integer.valueOf(i2);
                } catch (ParseException unused) {
                    throw new UsagePeriodSpecificationException(C13437d.m33706k("Usage Period Specification DAYSTART element '", str4, "' does not specify a valid offset from midnight"));
                }
            }
            Integer num = valueOf;
            if (hashMap.containsKey("MINDURATION")) {
                j4 = m45254a((String) hashMap.get("MINDURATION"), timeZone, j, num, "MINDURATION") - j;
            } else {
                j4 = 59999;
            }
            if (hashMap.containsKey("ALIGNMENT")) {
                String str5 = (String) hashMap.get("ALIGNMENT");
                GregorianCalendar gregorianCalendar = new GregorianCalendar();
                gregorianCalendar.setTimeZone(timeZone);
                gregorianCalendar.setTimeInMillis(j - ((long) (num.intValue() * 1000)));
                gregorianCalendar.set(11, 0);
                gregorianCalendar.set(12, 0);
                gregorianCalendar.set(13, 0);
                gregorianCalendar.set(14, 0);
                if (str5 == null || str5.isEmpty()) {
                    throw new UsagePeriodSpecificationException(C13437d.m33706k("Usage Period Specification ALIGNMENT=", str5, " cannot be parsed"));
                }
                String substring = str5.substring(0, 1);
                String substring2 = str5.substring(1);
                Integer num2 = null;
                if ("M".equals(substring)) {
                    num2 = Integer.valueOf(m45256c(substring2));
                    if (num2.intValue() <= 0 || num2.intValue() > 31) {
                        throw new UsagePeriodSpecificationException(C13437d.m33706k("Usage Period Specification ALIGNMENT=", str5, " invalid: Day of month must be in range 1 to 31."));
                    }
                } else if ("W".equals(substring)) {
                    try {
                        Date parse2 = new SimpleDateFormat("EEE", Locale.ENGLISH).parse(substring2);
                        GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
                        gregorianCalendar2.setTime(parse2);
                        num2 = Integer.valueOf(gregorianCalendar2.get(7));
                    } catch (ParseException unused2) {
                        throw new UsagePeriodSpecificationException(C13437d.m33706k("Usage Period Specification ALIGNMENT: ", substring2, " does not specify a valid day of the week"));
                    }
                } else if (!"D".equals(substring)) {
                    throw new UsagePeriodSpecificationException(C13715c.m34245k(C16759e.m42352h("Usage Period Specification 'ALIGNMENT=", str5, "' must start with ", "M", " or "), "W", " or ", "D"));
                } else if (substring2.length() > 0) {
                    throw new UsagePeriodSpecificationException(C0017h.m56M("Usage Period Specification ALIGNMENT=", str5, " invalid: not expecting anything after '", "D", "'."));
                }
                if ("M".equals(substring)) {
                    int intValue = num2.intValue();
                    while (gregorianCalendar.get(5) != intValue) {
                        gregorianCalendar.add(5, -1);
                    }
                } else if ("W".equals(substring)) {
                    int intValue2 = num2.intValue();
                    while (gregorianCalendar.get(7) != intValue2) {
                        gregorianCalendar.add(5, -1);
                    }
                }
                j5 = Long.valueOf(gregorianCalendar.getTime().getTime()).longValue() + ((long) (num.intValue() * 1000));
            } else {
                TimeZone timeZone2 = timeZone;
                j5 = j;
            }
            long a = m45254a((String) hashMap.get("DURATION"), timeZone, j5, num, "DURATION");
            if (a > j3) {
                z2 = true;
                a = j3;
            }
            if (j < j2) {
                return new C18415a(a, j4, 0, false);
            }
            return new C18415a(a, j4, Math.max(a - j, 0), z2);
        }
        throw new UsagePeriodSpecificationException("Usage Period Specification must contain a DURATION element");
    }

    /* renamed from: c */
    public static int m45256c(String str) throws UsagePeriodSpecificationException {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new UsagePeriodSpecificationException(C13437d.m33706k("Error parsing Usage Period Specification: ", str, " is not a valid integer"));
        }
    }
}
