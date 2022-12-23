package ba0;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber$PhoneNumber;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p977zz.C20930c;
import p977zz.C20964s0;

/* renamed from: ba0.e */
public final class C7568e {

    /* renamed from: a */
    public static volatile ArrayList f23062a;

    /* renamed from: a */
    public static String m17311a(Context context, String str, PhoneNumberUtil.PhoneNumberFormat phoneNumberFormat) {
        Phonenumber$PhoneNumber h = m17318h(str, ((C7564a) ((ArrayList) m17314d(context)).get(m17315e(context))).f23054c);
        if (h == null) {
            return str;
        }
        return PhoneNumberUtil.m36283j().mo43755e(h, phoneNumberFormat);
    }

    /* renamed from: b */
    public static String m17312b(String str, String str2, PhoneNumberUtil.PhoneNumberFormat phoneNumberFormat) {
        Phonenumber$PhoneNumber h = m17318h(str, str2);
        if (h == null) {
            return str;
        }
        return PhoneNumberUtil.m36283j().mo43755e(h, phoneNumberFormat);
    }

    /* renamed from: c */
    public static int m17313c(int i, Context context) {
        boolean z;
        List<C7564a> d = m17314d(context);
        int size = d.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            }
            if (d.get(i2).f23052a == i) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            return i2;
        }
        return 0;
    }

    /* renamed from: d */
    public static List<C7564a> m17314d(Context context) {
        if (f23062a == null) {
            synchronized (C7568e.class) {
                if (f23062a == null) {
                    f23062a = m17317g(context);
                }
            }
        }
        return f23062a;
    }

    /* renamed from: e */
    public static int m17315e(Context context) {
        Locale b = C20930c.m49020b(context);
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager != null && !C20964s0.m49090h(telephonyManager.getSimCountryIso())) {
            b = new Locale(b.getLanguage(), telephonyManager.getSimCountryIso());
        }
        return m17313c(PhoneNumberUtil.m36283j().mo43758h(b.getCountry()), context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0051 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0052  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m17316f(android.content.Context r7, java.lang.String r8, com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat r9) {
        /*
            com.google.i18n.phonenumbers.PhoneNumberUtil r0 = com.google.i18n.phonenumbers.PhoneNumberUtil.m36283j()
            com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberType r1 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.MOBILE
            boolean r2 = r0.mo43767t(r8)
            r3 = 0
            r4 = 0
            if (r2 != 0) goto L_0x0027
            java.util.logging.Logger r1 = com.google.i18n.phonenumbers.PhoneNumberUtil.f36725h
            java.util.logging.Level r2 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Invalid or unknown region code provided: "
            r5.append(r6)
            r5.append(r8)
            java.lang.String r8 = r5.toString()
            r1.log(r2, r8)
            goto L_0x004e
        L_0x0027:
            com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata r2 = r0.mo43761l(r8)
            com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc r1 = com.google.i18n.phonenumbers.PhoneNumberUtil.m36285o(r2, r1)
            boolean r2 = r1.mo43834g()     // Catch:{ NumberParseException -> 0x0042 }
            if (r2 == 0) goto L_0x004e
            java.lang.String r1 = r1.mo43828a()     // Catch:{ NumberParseException -> 0x0042 }
            com.google.i18n.phonenumbers.Phonenumber$PhoneNumber r2 = new com.google.i18n.phonenumbers.Phonenumber$PhoneNumber     // Catch:{ NumberParseException -> 0x0042 }
            r2.<init>()     // Catch:{ NumberParseException -> 0x0042 }
            r0.mo43752A(r1, r8, r3, r2)     // Catch:{ NumberParseException -> 0x0042 }
            goto L_0x004f
        L_0x0042:
            r8 = move-exception
            java.util.logging.Logger r1 = com.google.i18n.phonenumbers.PhoneNumberUtil.f36725h
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r8 = r8.toString()
            r1.log(r2, r8)
        L_0x004e:
            r2 = r4
        L_0x004f:
            if (r2 != 0) goto L_0x0052
            return r4
        L_0x0052:
            java.lang.String r8 = r0.mo43755e(r2, r9)
            boolean r9 = p977zz.C20964s0.m49090h(r8)
            if (r9 == 0) goto L_0x005d
            return r4
        L_0x005d:
            int r9 = p824tp.C19746x.phone_example
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r3] = r8
            java.lang.String r7 = r7.getString(r9, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ba0.C7568e.m17316f(android.content.Context, java.lang.String, com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat):java.lang.String");
    }

    /* renamed from: g */
    public static ArrayList m17317g(Context context) {
        Locale b = C20930c.m49020b(context);
        HashSet hashSet = new HashSet(Arrays.asList(Locale.getISOCountries()));
        PhoneNumberUtil j = PhoneNumberUtil.m36283j();
        ArrayList arrayList = new ArrayList(Collections.unmodifiableSet(j.f36745b.keySet()));
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            String q = j.mo43764q(intValue);
            if (hashSet.contains(q)) {
                arrayList2.add(new C7564a(intValue, C16759e.m42349e("+", intValue), q, new Locale(b.getLanguage(), q).getDisplayCountry()));
            }
        }
        Collections.sort(arrayList2, new C7567d());
        return arrayList2;
    }

    /* renamed from: h */
    public static Phonenumber$PhoneNumber m17318h(CharSequence charSequence, String str) {
        try {
            PhoneNumberUtil j = PhoneNumberUtil.m36283j();
            j.getClass();
            Phonenumber$PhoneNumber phonenumber$PhoneNumber = new Phonenumber$PhoneNumber();
            j.mo43752A(charSequence, str, true, phonenumber$PhoneNumber);
            return phonenumber$PhoneNumber;
        } catch (Exception unused) {
            return null;
        }
    }
}
