package com.google.i18n.phonenumbers;

import com.appboy.support.StringUtils;
import com.google.android.play.core.assetpacks.C14291m0;
import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.internal.RegexCache;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import mf0.C24361g;
import p001a0.C0016g;
import p001a0.C0017h;
import p033c1.C1757a;
import p533hg.C17430a;
import p533hg.C17431b;
import p988j$.util.concurrent.ConcurrentHashMap;

public final class PhoneNumberUtil {

    /* renamed from: h */
    public static final Logger f36725h = Logger.getLogger(PhoneNumberUtil.class.getName());

    /* renamed from: i */
    public static final Map<Integer, String> f36726i;

    /* renamed from: j */
    public static final Map<Character, Character> f36727j;

    /* renamed from: k */
    public static final Map<Character, Character> f36728k;

    /* renamed from: l */
    public static final Map<Character, Character> f36729l;

    /* renamed from: m */
    public static final Map<Character, Character> f36730m;

    /* renamed from: n */
    public static final Pattern f36731n = Pattern.compile("[\\d]+(?:[~⁓∼～][\\d]+)?");

    /* renamed from: o */
    public static final Pattern f36732o = Pattern.compile("[+＋]+");

    /* renamed from: p */
    public static final Pattern f36733p = Pattern.compile("[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]+");

    /* renamed from: q */
    public static final Pattern f36734q = Pattern.compile("(\\p{Nd})");

    /* renamed from: r */
    public static final Pattern f36735r = Pattern.compile("[+＋\\p{Nd}]");

    /* renamed from: s */
    public static final Pattern f36736s = Pattern.compile("[\\\\/] *x");

    /* renamed from: t */
    public static final Pattern f36737t = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");

    /* renamed from: u */
    public static final Pattern f36738u = Pattern.compile("(?:.*?[A-Za-z]){3}.*");

    /* renamed from: v */
    public static final Pattern f36739v;

    /* renamed from: w */
    public static final Pattern f36740w;

    /* renamed from: x */
    public static final Pattern f36741x = Pattern.compile("(\\$\\d)");

    /* renamed from: y */
    public static final Pattern f36742y = Pattern.compile("\\(?\\$1\\)?");

    /* renamed from: z */
    public static PhoneNumberUtil f36743z = null;

    /* renamed from: a */
    public final C1757a f36744a;

    /* renamed from: b */
    public final Map<Integer, List<String>> f36745b;

    /* renamed from: c */
    public final C14291m0 f36746c = new C14291m0(2);

    /* renamed from: d */
    public final HashSet f36747d = new HashSet(35);

    /* renamed from: e */
    public final RegexCache f36748e = new RegexCache(100);

    /* renamed from: f */
    public final HashSet f36749f = new HashSet(320);

    /* renamed from: g */
    public final HashSet f36750g = new HashSet();

    public enum PhoneNumberFormat {
        E164,
        INTERNATIONAL,
        NATIONAL,
        RFC3966
    }

    public enum PhoneNumberType {
        FIXED_LINE,
        MOBILE,
        FIXED_LINE_OR_MOBILE,
        TOLL_FREE,
        PREMIUM_RATE,
        SHARED_COST,
        VOIP,
        PERSONAL_NUMBER,
        PAGER,
        UAN,
        VOICEMAIL,
        UNKNOWN
    }

    public enum ValidationResult {
        IS_POSSIBLE,
        IS_POSSIBLE_LOCAL_ONLY,
        INVALID_COUNTRY_CODE,
        TOO_SHORT,
        INVALID_LENGTH,
        TOO_LONG
    }

    /* renamed from: com.google.i18n.phonenumbers.PhoneNumberUtil$a */
    public static /* synthetic */ class C14561a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36751a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f36752b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f36753c;

        /* JADX WARNING: Can't wrap try/catch for region: R(39:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|(2:27|28)|29|31|32|33|34|35|36|37|38|39|41|42|43|44|45|46|(3:47|48|50)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(40:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|(2:27|28)|29|31|32|33|34|35|36|37|38|39|41|42|43|44|45|46|(3:47|48|50)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(43:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|37|38|39|41|42|43|44|45|46|47|48|50) */
        /* JADX WARNING: Can't wrap try/catch for region: R(44:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|37|38|39|41|42|43|44|45|46|47|48|50) */
        /* JADX WARNING: Can't wrap try/catch for region: R(45:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|37|38|39|41|42|43|44|45|46|47|48|50) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0095 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x009f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00a9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00c4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00ce */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00d8 */
        static {
            /*
                com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberType[] r0 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f36753c = r0
                r1 = 1
                com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberType r2 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.PREMIUM_RATE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f36753c     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberType r3 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.TOLL_FREE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f36753c     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberType r4 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.MOBILE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f36753c     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberType r5 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.FIXED_LINE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r4 = f36753c     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberType r5 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.FIXED_LINE_OR_MOBILE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r6 = 5
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r4 = f36753c     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberType r5 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.SHARED_COST     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6 = 6
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r4 = f36753c     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberType r5 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.VOIP     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r6 = 7
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r4 = f36753c     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberType r5 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.PERSONAL_NUMBER     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r6 = 8
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r4 = f36753c     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberType r5 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.PAGER     // Catch:{ NoSuchFieldError -> 0x006c }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r6 = 9
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r4 = f36753c     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberType r5 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.UAN     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r6 = 10
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r4 = f36753c     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberType r5 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.VOICEMAIL     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r6 = 11
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat[] r4 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f36752b = r4
                com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat r5 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.E164     // Catch:{ NoSuchFieldError -> 0x0095 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0095 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0095 }
            L_0x0095:
                int[] r4 = f36752b     // Catch:{ NoSuchFieldError -> 0x009f }
                com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat r5 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.INTERNATIONAL     // Catch:{ NoSuchFieldError -> 0x009f }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x009f }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x009f }
            L_0x009f:
                int[] r4 = f36752b     // Catch:{ NoSuchFieldError -> 0x00a9 }
                com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat r5 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.RFC3966     // Catch:{ NoSuchFieldError -> 0x00a9 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a9 }
                r4[r5] = r2     // Catch:{ NoSuchFieldError -> 0x00a9 }
            L_0x00a9:
                int[] r4 = f36752b     // Catch:{ NoSuchFieldError -> 0x00b3 }
                com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat r5 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.NATIONAL     // Catch:{ NoSuchFieldError -> 0x00b3 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b3 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x00b3 }
            L_0x00b3:
                com.google.i18n.phonenumbers.Phonenumber$PhoneNumber$CountryCodeSource[] r4 = com.google.i18n.phonenumbers.Phonenumber$PhoneNumber.CountryCodeSource.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f36751a = r4
                com.google.i18n.phonenumbers.Phonenumber$PhoneNumber$CountryCodeSource r5 = com.google.i18n.phonenumbers.Phonenumber$PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_PLUS_SIGN     // Catch:{ NoSuchFieldError -> 0x00c4 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c4 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x00c4 }
            L_0x00c4:
                int[] r1 = f36751a     // Catch:{ NoSuchFieldError -> 0x00ce }
                com.google.i18n.phonenumbers.Phonenumber$PhoneNumber$CountryCodeSource r4 = com.google.i18n.phonenumbers.Phonenumber$PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_IDD     // Catch:{ NoSuchFieldError -> 0x00ce }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ce }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x00ce }
            L_0x00ce:
                int[] r0 = f36751a     // Catch:{ NoSuchFieldError -> 0x00d8 }
                com.google.i18n.phonenumbers.Phonenumber$PhoneNumber$CountryCodeSource r1 = com.google.i18n.phonenumbers.Phonenumber$PhoneNumber.CountryCodeSource.FROM_NUMBER_WITHOUT_PLUS_SIGN     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                int[] r0 = f36751a     // Catch:{ NoSuchFieldError -> 0x00e2 }
                com.google.i18n.phonenumbers.Phonenumber$PhoneNumber$CountryCodeSource r1 = com.google.i18n.phonenumbers.Phonenumber$PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY     // Catch:{ NoSuchFieldError -> 0x00e2 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e2 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x00e2 }
            L_0x00e2:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.i18n.phonenumbers.PhoneNumberUtil.C14561a.<clinit>():void");
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(54, "9");
        f36726i = Collections.unmodifiableMap(hashMap);
        HashSet hashSet = new HashSet();
        hashSet.add(86);
        Collections.unmodifiableSet(hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(52);
        hashSet2.add(54);
        hashSet2.add(55);
        hashSet2.add(62);
        hashSet2.addAll(hashSet);
        Collections.unmodifiableSet(hashSet2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put('0', '0');
        hashMap2.put('1', '1');
        hashMap2.put('2', '2');
        hashMap2.put('3', '3');
        hashMap2.put('4', '4');
        hashMap2.put('5', '5');
        hashMap2.put('6', '6');
        hashMap2.put('7', '7');
        hashMap2.put('8', '8');
        hashMap2.put('9', '9');
        HashMap hashMap3 = new HashMap(40);
        hashMap3.put('A', '2');
        hashMap3.put('B', '2');
        hashMap3.put('C', '2');
        hashMap3.put('D', '3');
        hashMap3.put('E', '3');
        hashMap3.put('F', '3');
        hashMap3.put('G', '4');
        hashMap3.put('H', '4');
        hashMap3.put('I', '4');
        hashMap3.put('J', '5');
        hashMap3.put('K', '5');
        hashMap3.put('L', '5');
        hashMap3.put('M', '6');
        hashMap3.put('N', '6');
        hashMap3.put('O', '6');
        hashMap3.put('P', '7');
        hashMap3.put('Q', '7');
        hashMap3.put('R', '7');
        hashMap3.put('S', '7');
        hashMap3.put('T', '8');
        hashMap3.put('U', '8');
        hashMap3.put('V', '8');
        hashMap3.put('W', '9');
        hashMap3.put('X', '9');
        hashMap3.put('Y', '9');
        hashMap3.put('Z', '9');
        Map<Character, Character> unmodifiableMap = Collections.unmodifiableMap(hashMap3);
        f36728k = unmodifiableMap;
        HashMap hashMap4 = new HashMap(100);
        hashMap4.putAll(unmodifiableMap);
        hashMap4.putAll(hashMap2);
        f36729l = Collections.unmodifiableMap(hashMap4);
        HashMap hashMap5 = new HashMap();
        hashMap5.putAll(hashMap2);
        hashMap5.put('+', '+');
        hashMap5.put('*', '*');
        hashMap5.put('#', '#');
        f36727j = Collections.unmodifiableMap(hashMap5);
        HashMap hashMap6 = new HashMap();
        for (Character charValue : unmodifiableMap.keySet()) {
            char charValue2 = charValue.charValue();
            hashMap6.put(Character.valueOf(Character.toLowerCase(charValue2)), Character.valueOf(charValue2));
            hashMap6.put(Character.valueOf(charValue2), Character.valueOf(charValue2));
        }
        hashMap6.putAll(hashMap2);
        hashMap6.put('-', '-');
        hashMap6.put(65293, '-');
        hashMap6.put(8208, '-');
        hashMap6.put(8209, '-');
        hashMap6.put(8210, '-');
        hashMap6.put(8211, '-');
        hashMap6.put(8212, '-');
        hashMap6.put(8213, '-');
        hashMap6.put(8722, '-');
        hashMap6.put('/', '/');
        hashMap6.put(65295, '/');
        hashMap6.put(' ', ' ');
        hashMap6.put(12288, ' ');
        hashMap6.put(8288, ' ');
        hashMap6.put('.', '.');
        hashMap6.put(65294, '.');
        f36730m = Collections.unmodifiableMap(hashMap6);
        StringBuilder sb = new StringBuilder();
        Map<Character, Character> map = f36728k;
        sb.append(Arrays.toString(map.keySet().toArray()).replaceAll("[, \\[\\]]", ""));
        sb.append(Arrays.toString(map.keySet().toArray()).toLowerCase().replaceAll("[, \\[\\]]", ""));
        String sb2 = sb.toString();
        String l = C25541a.m63882l("\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～*", sb2, "\\p{Nd}", "]*");
        String b = m36281b(true);
        m36281b(false);
        f36739v = Pattern.compile("(?:" + b + ")$", 66);
        f36740w = Pattern.compile(l + "(?:" + b + ")?", 66);
        Pattern.compile("(\\D+)");
    }

    public PhoneNumberUtil(C1757a aVar, HashMap hashMap) {
        this.f36744a = aVar;
        this.f36745b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            List list = (List) entry.getValue();
            if (list.size() != 1 || !"001".equals(list.get(0))) {
                this.f36749f.addAll(list);
            } else {
                this.f36750g.add(entry.getKey());
            }
        }
        if (this.f36749f.remove("001")) {
            f36725h.log(Level.WARNING, "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        this.f36747d.addAll((Collection) hashMap.get(1));
    }

    /* renamed from: B */
    public static void m36279B(int i, PhoneNumberFormat phoneNumberFormat, StringBuilder sb) {
        int i2 = C14561a.f36752b[phoneNumberFormat.ordinal()];
        if (i2 == 1) {
            sb.insert(0, i).insert(0, '+');
        } else if (i2 == 2) {
            sb.insert(0, " ").insert(0, i).insert(0, '+');
        } else if (i2 == 3) {
            sb.insert(0, "-").insert(0, i).insert(0, '+').insert(0, "tel:");
        }
    }

    /* renamed from: C */
    public static ValidationResult m36280C(StringBuilder sb, Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata, PhoneNumberType phoneNumberType) {
        ArrayList arrayList;
        boolean z;
        boolean z2;
        List<Integer> list;
        ArrayList arrayList2;
        Phonemetadata$PhoneNumberDesc o = m36285o(phonemetadata$PhoneMetadata, phoneNumberType);
        if (o.mo43832e().isEmpty()) {
            arrayList = phonemetadata$PhoneMetadata.mo43797c().mo43832e();
        } else {
            arrayList = o.mo43832e();
        }
        List<Integer> f = o.mo43833f();
        if (phoneNumberType == PhoneNumberType.FIXED_LINE_OR_MOBILE) {
            Phonemetadata$PhoneNumberDesc o2 = m36285o(phonemetadata$PhoneMetadata, PhoneNumberType.FIXED_LINE);
            if (o2.mo43831d() == 1 && o2.mo43830c() == -1) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                return m36280C(sb, phonemetadata$PhoneMetadata, PhoneNumberType.MOBILE);
            }
            Phonemetadata$PhoneNumberDesc o3 = m36285o(phonemetadata$PhoneMetadata, PhoneNumberType.MOBILE);
            if (o3.mo43831d() == 1 && o3.mo43830c() == -1) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                ArrayList arrayList3 = new ArrayList(arrayList);
                if (o3.mo43831d() == 0) {
                    list = phonemetadata$PhoneMetadata.mo43797c().mo43832e();
                } else {
                    list = o3.mo43832e();
                }
                arrayList3.addAll(list);
                Collections.sort(arrayList3);
                if (f.isEmpty()) {
                    arrayList2 = o3.mo43833f();
                } else {
                    ArrayList arrayList4 = new ArrayList(f);
                    arrayList4.addAll(o3.mo43833f());
                    Collections.sort(arrayList4);
                    arrayList2 = arrayList4;
                }
                f = arrayList2;
                arrayList = arrayList3;
            }
        }
        if (((Integer) arrayList.get(0)).intValue() == -1) {
            return ValidationResult.INVALID_LENGTH;
        }
        int length = sb.length();
        if (f.contains(Integer.valueOf(length))) {
            return ValidationResult.IS_POSSIBLE_LOCAL_ONLY;
        }
        int intValue = ((Integer) arrayList.get(0)).intValue();
        if (intValue == length) {
            return ValidationResult.IS_POSSIBLE;
        }
        if (intValue > length) {
            return ValidationResult.TOO_SHORT;
        }
        if (((Integer) arrayList.get(arrayList.size() - 1)).intValue() < length) {
            return ValidationResult.TOO_LONG;
        }
        if (arrayList.subList(1, arrayList.size()).contains(Integer.valueOf(length))) {
            return ValidationResult.IS_POSSIBLE;
        }
        return ValidationResult.INVALID_LENGTH;
    }

    /* renamed from: b */
    public static String m36281b(boolean z) {
        StringBuilder k = C13555b.m33972k(";ext=");
        k.append(m36282c(20));
        String sb = k.toString();
        StringBuilder l = C13555b.m33973l("[  \\t,]*", "(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|доб|anexo)", "[:\\.．]?[  \\t,-]*");
        l.append(m36282c(20));
        l.append("#?");
        String sb2 = l.toString();
        StringBuilder l2 = C13555b.m33973l("[  \\t,]*", "(?:[xｘ#＃~～]|int|ｉｎｔ)", "[:\\.．]?[  \\t,-]*");
        l2.append(m36282c(9));
        l2.append("#?");
        String sb3 = l2.toString();
        StringBuilder k2 = C13555b.m33972k("[- ]+");
        k2.append(m36282c(6));
        k2.append("#");
        String o = C0016g.m31o(C16759e.m42352h(sb, "|", sb2, "|", sb3), "|", k2.toString());
        if (!z) {
            return o;
        }
        StringBuilder l3 = C13555b.m33973l("[  \\t]*", "(?:,{2}|;)", "[:\\.．]?[  \\t,-]*");
        l3.append(m36282c(15));
        l3.append("#?");
        String sb4 = l3.toString();
        StringBuilder l4 = C13555b.m33973l("[  \\t]*", "(?:,)+", "[:\\.．]?[  \\t,-]*");
        l4.append(m36282c(9));
        l4.append("#?");
        return C0017h.m56M(o, "|", sb4, "|", l4.toString());
    }

    /* renamed from: c */
    public static String m36282c(int i) {
        return C25541a.m63878h("(\\p{Nd}{1,", i, "})");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: j */
    public static synchronized com.google.i18n.phonenumbers.PhoneNumberUtil m36283j() {
        /*
            java.lang.Class<com.google.i18n.phonenumbers.PhoneNumberUtil> r0 = com.google.i18n.phonenumbers.PhoneNumberUtil.class
            monitor-enter(r0)
            com.google.i18n.phonenumbers.PhoneNumberUtil r1 = f36743z     // Catch:{ all -> 0x0024 }
            if (r1 != 0) goto L_0x0020
            hg.b$a r1 = p533hg.C17431b.f44899a     // Catch:{ all -> 0x0024 }
            c1.a r1 = new c1.a     // Catch:{ all -> 0x0024 }
            r2 = 0
            r1.<init>(r2)     // Catch:{ all -> 0x0024 }
            com.google.i18n.phonenumbers.PhoneNumberUtil r2 = new com.google.i18n.phonenumbers.PhoneNumberUtil     // Catch:{ all -> 0x0024 }
            java.util.HashMap r3 = mf0.C24361g.m61142L()     // Catch:{ all -> 0x0024 }
            r2.<init>(r1, r3)     // Catch:{ all -> 0x0024 }
            monitor-enter(r0)     // Catch:{ all -> 0x0024 }
            f36743z = r2     // Catch:{ all -> 0x001d }
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            goto L_0x0020
        L_0x001d:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            throw r1     // Catch:{ all -> 0x0024 }
        L_0x0020:
            com.google.i18n.phonenumbers.PhoneNumberUtil r1 = f36743z     // Catch:{ all -> 0x0024 }
            monitor-exit(r0)
            return r1
        L_0x0024:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.i18n.phonenumbers.PhoneNumberUtil.m36283j():com.google.i18n.phonenumbers.PhoneNumberUtil");
    }

    /* renamed from: n */
    public static String m36284n(Phonenumber$PhoneNumber phonenumber$PhoneNumber) {
        StringBuilder sb = new StringBuilder();
        if (phonenumber$PhoneNumber.mo43849k() && phonenumber$PhoneNumber.mo43843f() > 0) {
            char[] cArr = new char[phonenumber$PhoneNumber.mo43843f()];
            Arrays.fill(cArr, '0');
            sb.append(new String(cArr));
        }
        sb.append(phonenumber$PhoneNumber.mo43841e());
        return sb.toString();
    }

    /* renamed from: o */
    public static Phonemetadata$PhoneNumberDesc m36285o(Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata, PhoneNumberType phoneNumberType) {
        switch (C14561a.f36753c[phoneNumberType.ordinal()]) {
            case 1:
                return phonemetadata$PhoneMetadata.mo43811q();
            case 2:
                return phonemetadata$PhoneMetadata.mo43815t();
            case 3:
                return phonemetadata$PhoneMetadata.mo43802h();
            case 4:
            case 5:
                return phonemetadata$PhoneMetadata.mo43796b();
            case 6:
                return phonemetadata$PhoneMetadata.mo43814s();
            case 7:
                return phonemetadata$PhoneMetadata.mo43818w();
            case 8:
                return phonemetadata$PhoneMetadata.mo43808n();
            case 9:
                return phonemetadata$PhoneMetadata.mo43807m();
            case 10:
                return phonemetadata$PhoneMetadata.mo43816u();
            case 11:
                return phonemetadata$PhoneMetadata.mo43817v();
            default:
                return phonemetadata$PhoneMetadata.mo43797c();
        }
    }

    /* renamed from: u */
    public static void m36286u(Phonenumber$PhoneNumber phonenumber$PhoneNumber, Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata, PhoneNumberFormat phoneNumberFormat, StringBuilder sb) {
        if (phonenumber$PhoneNumber.mo43847i() && phonenumber$PhoneNumber.mo43840d().length() > 0) {
            if (phoneNumberFormat == PhoneNumberFormat.RFC3966) {
                sb.append(";ext=");
                sb.append(phonenumber$PhoneNumber.mo43840d());
            } else if (phonemetadata$PhoneMetadata.mo43822z()) {
                sb.append(phonemetadata$PhoneMetadata.mo43809o());
                sb.append(phonenumber$PhoneNumber.mo43840d());
            } else {
                sb.append(" ext. ");
                sb.append(phonenumber$PhoneNumber.mo43840d());
            }
        }
    }

    /* renamed from: x */
    public static void m36287x(StringBuilder sb) {
        if (f36738u.matcher(sb).matches()) {
            sb.replace(0, sb.length(), m36289z(sb, f36729l));
        } else {
            sb.replace(0, sb.length(), m36288y(sb));
        }
    }

    /* renamed from: y */
    public static String m36288y(CharSequence charSequence) {
        StringBuilder sb = new StringBuilder(charSequence.length());
        for (int i = 0; i < charSequence.length(); i++) {
            int digit = Character.digit(charSequence.charAt(i), 10);
            if (digit != -1) {
                sb.append(digit);
            }
        }
        return sb.toString();
    }

    /* renamed from: z */
    public static String m36289z(CharSequence charSequence, Map map) {
        StringBuilder sb = new StringBuilder(charSequence.length());
        for (int i = 0; i < charSequence.length(); i++) {
            Character ch = (Character) map.get(Character.valueOf(Character.toUpperCase(charSequence.charAt(i))));
            if (ch != null) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    /* renamed from: A */
    public final void mo43752A(CharSequence charSequence, String str, boolean z, Phonenumber$PhoneNumber phonenumber$PhoneNumber) throws NumberParseException {
        boolean z2;
        boolean z3;
        int i;
        boolean z4;
        CharSequence charSequence2;
        int i2;
        String str2 = str;
        Phonenumber$PhoneNumber phonenumber$PhoneNumber2 = phonenumber$PhoneNumber;
        if (charSequence == null) {
            throw new NumberParseException(NumberParseException.ErrorType.NOT_A_NUMBER, "The phone number supplied was null.");
        } else if (charSequence.length() <= 250) {
            StringBuilder sb = new StringBuilder();
            String charSequence3 = charSequence.toString();
            int indexOf = charSequence3.indexOf(";phone-context=");
            String str3 = "";
            if (indexOf >= 0) {
                int i3 = indexOf + 15;
                if (i3 < charSequence3.length() - 1 && charSequence3.charAt(i3) == '+') {
                    int indexOf2 = charSequence3.indexOf(59, i3);
                    if (indexOf2 > 0) {
                        sb.append(charSequence3.substring(i3, indexOf2));
                    } else {
                        sb.append(charSequence3.substring(i3));
                    }
                }
                int indexOf3 = charSequence3.indexOf("tel:");
                if (indexOf3 >= 0) {
                    i2 = indexOf3 + 4;
                } else {
                    i2 = 0;
                }
                sb.append(charSequence3.substring(i2, indexOf));
            } else {
                Matcher matcher = f36735r.matcher(charSequence3);
                if (matcher.find()) {
                    charSequence2 = charSequence3.subSequence(matcher.start(), charSequence3.length());
                    Matcher matcher2 = f36737t.matcher(charSequence2);
                    if (matcher2.find()) {
                        charSequence2 = charSequence2.subSequence(0, matcher2.start());
                    }
                    Matcher matcher3 = f36736s.matcher(charSequence2);
                    if (matcher3.find()) {
                        charSequence2 = charSequence2.subSequence(0, matcher3.start());
                    }
                } else {
                    charSequence2 = str3;
                }
                sb.append(charSequence2);
            }
            int indexOf4 = sb.indexOf(";isub=");
            if (indexOf4 > 0) {
                sb.delete(indexOf4, sb.length());
            }
            if (sb.length() < 2) {
                z2 = false;
            } else {
                z2 = f36740w.matcher(sb).matches();
            }
            if (z2) {
                if (mo43767t(str2) || (sb.length() != 0 && f36732o.matcher(sb).lookingAt())) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    if (z) {
                        phonenumber$PhoneNumber2.mo43857s(charSequence3);
                    }
                    Matcher matcher4 = f36739v.matcher(sb);
                    if (matcher4.find()) {
                        String substring = sb.substring(0, matcher4.start());
                        if (substring.length() < 2) {
                            z4 = false;
                        } else {
                            z4 = f36740w.matcher(substring).matches();
                        }
                        if (z4) {
                            int groupCount = matcher4.groupCount();
                            int i4 = 1;
                            while (true) {
                                if (i4 > groupCount) {
                                    break;
                                } else if (matcher4.group(i4) != null) {
                                    str3 = matcher4.group(i4);
                                    sb.delete(matcher4.start(), sb.length());
                                    break;
                                } else {
                                    i4++;
                                }
                            }
                        }
                    }
                    if (str3.length() > 0) {
                        phonenumber$PhoneNumber2.mo43852n(str3);
                    }
                    Phonemetadata$PhoneMetadata l = mo43761l(str2);
                    StringBuilder sb2 = new StringBuilder();
                    try {
                        i = mo43768v(sb, l, sb2, z, phonenumber$PhoneNumber);
                    } catch (NumberParseException e) {
                        NumberParseException numberParseException = e;
                        Matcher matcher5 = f36732o.matcher(sb);
                        if (numberParseException.mo43750a() != NumberParseException.ErrorType.INVALID_COUNTRY_CODE || !matcher5.lookingAt()) {
                            throw new NumberParseException(numberParseException.mo43750a(), numberParseException.getMessage());
                        }
                        i = mo43768v(sb.substring(matcher5.end()), l, sb2, z, phonenumber$PhoneNumber);
                        if (i == 0) {
                            throw new NumberParseException(NumberParseException.ErrorType.INVALID_COUNTRY_CODE, "Could not interpret numbers after plus-sign.");
                        }
                    }
                    if (i != 0) {
                        String q = mo43764q(i);
                        if (!q.equals(str2)) {
                            l = mo43762m(i, q);
                        }
                    } else {
                        m36287x(sb);
                        sb2.append(sb);
                        if (str2 != null) {
                            phonenumber$PhoneNumber2.mo43850l(l.mo43795a());
                        } else if (z) {
                            phonenumber$PhoneNumber.mo43837a();
                        }
                    }
                    if (sb2.length() >= 2) {
                        if (l != null) {
                            StringBuilder sb3 = new StringBuilder();
                            StringBuilder sb4 = new StringBuilder(sb2);
                            mo43769w(sb4, l, sb3);
                            ValidationResult C = m36280C(sb4, l, PhoneNumberType.UNKNOWN);
                            if (!(C == ValidationResult.TOO_SHORT || C == ValidationResult.IS_POSSIBLE_LOCAL_ONLY || C == ValidationResult.INVALID_LENGTH)) {
                                if (z && sb3.length() > 0) {
                                    phonenumber$PhoneNumber2.mo43856r(sb3.toString());
                                }
                                sb2 = sb4;
                            }
                        }
                        int length = sb2.length();
                        if (length < 2) {
                            throw new NumberParseException(NumberParseException.ErrorType.TOO_SHORT_NSN, "The string supplied is too short to be a phone number.");
                        } else if (length <= 17) {
                            if (sb2.length() > 1 && sb2.charAt(0) == '0') {
                                phonenumber$PhoneNumber.mo43853o();
                                int i5 = 1;
                                while (i5 < sb2.length() - 1 && sb2.charAt(i5) == '0') {
                                    i5++;
                                }
                                if (i5 != 1) {
                                    phonenumber$PhoneNumber2.mo43855q(i5);
                                }
                            }
                            phonenumber$PhoneNumber2.mo43854p(Long.parseLong(sb2.toString()));
                        } else {
                            throw new NumberParseException(NumberParseException.ErrorType.TOO_LONG, "The string supplied is too long to be a phone number.");
                        }
                    } else {
                        throw new NumberParseException(NumberParseException.ErrorType.TOO_SHORT_NSN, "The string supplied is too short to be a phone number.");
                    }
                } else {
                    throw new NumberParseException(NumberParseException.ErrorType.INVALID_COUNTRY_CODE, "Missing or invalid default region.");
                }
            } else {
                throw new NumberParseException(NumberParseException.ErrorType.NOT_A_NUMBER, "The string supplied did not seem to be a phone number.");
            }
        } else {
            throw new NumberParseException(NumberParseException.ErrorType.TOO_LONG, "The string supplied was too long to parse.");
        }
    }

    /* renamed from: a */
    public final Phonemetadata$NumberFormat mo43753a(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Phonemetadata$NumberFormat phonemetadata$NumberFormat = (Phonemetadata$NumberFormat) it.next();
            int e = phonemetadata$NumberFormat.mo43774e();
            if ((e == 0 || this.f36748e.mo43873a(phonemetadata$NumberFormat.mo43773d(e - 1)).matcher(str).lookingAt()) && this.f36748e.mo43873a(phonemetadata$NumberFormat.mo43778h()).matcher(str).matches()) {
                return phonemetadata$NumberFormat;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final int mo43754d(StringBuilder sb, StringBuilder sb2) {
        if (!(sb.length() == 0 || sb.charAt(0) == '0')) {
            int length = sb.length();
            int i = 1;
            while (i <= 3 && i <= length) {
                int parseInt = Integer.parseInt(sb.substring(0, i));
                if (this.f36745b.containsKey(Integer.valueOf(parseInt))) {
                    sb2.append(sb.substring(i));
                    return parseInt;
                }
                i++;
            }
        }
        return 0;
    }

    /* renamed from: e */
    public final String mo43755e(Phonenumber$PhoneNumber phonenumber$PhoneNumber, PhoneNumberFormat phoneNumberFormat) {
        if (phonenumber$PhoneNumber.mo43841e() == 0 && phonenumber$PhoneNumber.mo43848j()) {
            String g = phonenumber$PhoneNumber.mo43844g();
            if (g.length() > 0) {
                return g;
            }
        }
        StringBuilder sb = new StringBuilder(20);
        sb.setLength(0);
        int b = phonenumber$PhoneNumber.mo43838b();
        String n = m36284n(phonenumber$PhoneNumber);
        PhoneNumberFormat phoneNumberFormat2 = PhoneNumberFormat.E164;
        if (phoneNumberFormat == phoneNumberFormat2) {
            sb.append(n);
            m36279B(b, phoneNumberFormat2, sb);
        } else if (!this.f36745b.containsKey(Integer.valueOf(b))) {
            sb.append(n);
        } else {
            Phonemetadata$PhoneMetadata m = mo43762m(b, mo43764q(b));
            sb.append(mo43756f(n, m, phoneNumberFormat));
            m36286u(phonenumber$PhoneNumber, m, phoneNumberFormat, sb);
            m36279B(b, phoneNumberFormat, sb);
        }
        return sb.toString();
    }

    /* renamed from: f */
    public final String mo43756f(String str, Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata, PhoneNumberFormat phoneNumberFormat) {
        List<Phonemetadata$NumberFormat> list;
        if (phonemetadata$PhoneMetadata.mo43800f().size() == 0 || phoneNumberFormat == PhoneNumberFormat.NATIONAL) {
            list = phonemetadata$PhoneMetadata.mo43806l();
        } else {
            list = phonemetadata$PhoneMetadata.mo43800f();
        }
        Phonemetadata$NumberFormat a = mo43753a(str, list);
        if (a == null) {
            return str;
        }
        return mo43757g(str, a, phoneNumberFormat);
    }

    /* renamed from: g */
    public final String mo43757g(String str, Phonemetadata$NumberFormat phonemetadata$NumberFormat, PhoneNumberFormat phoneNumberFormat) {
        String str2;
        String format = phonemetadata$NumberFormat.getFormat();
        Matcher matcher = this.f36748e.mo43873a(phonemetadata$NumberFormat.mo43778h()).matcher(str);
        PhoneNumberFormat phoneNumberFormat2 = PhoneNumberFormat.NATIONAL;
        String f = phonemetadata$NumberFormat.mo43775f();
        if (phoneNumberFormat != phoneNumberFormat2 || f == null || f.length() <= 0) {
            str2 = matcher.replaceAll(format);
        } else {
            str2 = matcher.replaceAll(f36741x.matcher(format).replaceFirst(f));
        }
        if (phoneNumberFormat != PhoneNumberFormat.RFC3966) {
            return str2;
        }
        Matcher matcher2 = f36733p.matcher(str2);
        if (matcher2.lookingAt()) {
            str2 = matcher2.replaceFirst("");
        }
        return matcher2.reset(str2).replaceAll("-");
    }

    /* renamed from: h */
    public final int mo43758h(String str) {
        if (mo43767t(str)) {
            return mo43759i(str);
        }
        Logger logger = f36725h;
        Level level = Level.WARNING;
        StringBuilder k = C13555b.m33972k("Invalid or missing region code (");
        if (str == null) {
            str = StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
        }
        k.append(str);
        k.append(") provided.");
        logger.log(level, k.toString());
        return 0;
    }

    /* renamed from: i */
    public final int mo43759i(String str) {
        Phonemetadata$PhoneMetadata l = mo43761l(str);
        if (l != null) {
            return l.mo43795a();
        }
        throw new IllegalArgumentException(C25541a.m63881k("Invalid region code: ", str));
    }

    /* renamed from: k */
    public final Phonemetadata$PhoneMetadata mo43760k(int i) {
        if (!this.f36745b.containsKey(Integer.valueOf(i))) {
            return null;
        }
        C1757a aVar = this.f36744a;
        aVar.getClass();
        List list = (List) C24361g.m61142L().get(Integer.valueOf(i));
        boolean z = false;
        if (list.size() == 1 && "001".equals(list.get(0))) {
            z = true;
        }
        if (!z) {
            return null;
        }
        return C17431b.m43469a(Integer.valueOf(i), (ConcurrentHashMap) aVar.f6161e, (String) aVar.f6158b, (C17430a) aVar.f6159c);
    }

    /* renamed from: l */
    public final Phonemetadata$PhoneMetadata mo43761l(String str) {
        if (!mo43767t(str)) {
            return null;
        }
        C1757a aVar = this.f36744a;
        return C17431b.m43469a(str, (ConcurrentHashMap) aVar.f6160d, (String) aVar.f6158b, (C17430a) aVar.f6159c);
    }

    /* renamed from: m */
    public final Phonemetadata$PhoneMetadata mo43762m(int i, String str) {
        if ("001".equals(str)) {
            return mo43760k(i);
        }
        return mo43761l(str);
    }

    /* renamed from: p */
    public final PhoneNumberType mo43763p(String str, Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata) {
        if (!mo43765r(str, phonemetadata$PhoneMetadata.mo43797c())) {
            return PhoneNumberType.UNKNOWN;
        }
        if (mo43765r(str, phonemetadata$PhoneMetadata.mo43811q())) {
            return PhoneNumberType.PREMIUM_RATE;
        }
        if (mo43765r(str, phonemetadata$PhoneMetadata.mo43815t())) {
            return PhoneNumberType.TOLL_FREE;
        }
        if (mo43765r(str, phonemetadata$PhoneMetadata.mo43814s())) {
            return PhoneNumberType.SHARED_COST;
        }
        if (mo43765r(str, phonemetadata$PhoneMetadata.mo43818w())) {
            return PhoneNumberType.VOIP;
        }
        if (mo43765r(str, phonemetadata$PhoneMetadata.mo43808n())) {
            return PhoneNumberType.PERSONAL_NUMBER;
        }
        if (mo43765r(str, phonemetadata$PhoneMetadata.mo43807m())) {
            return PhoneNumberType.PAGER;
        }
        if (mo43765r(str, phonemetadata$PhoneMetadata.mo43816u())) {
            return PhoneNumberType.UAN;
        }
        if (mo43765r(str, phonemetadata$PhoneMetadata.mo43817v())) {
            return PhoneNumberType.VOICEMAIL;
        }
        if (mo43765r(str, phonemetadata$PhoneMetadata.mo43796b())) {
            if (phonemetadata$PhoneMetadata.mo43812r()) {
                return PhoneNumberType.FIXED_LINE_OR_MOBILE;
            }
            if (mo43765r(str, phonemetadata$PhoneMetadata.mo43802h())) {
                return PhoneNumberType.FIXED_LINE_OR_MOBILE;
            }
            return PhoneNumberType.FIXED_LINE;
        } else if (phonemetadata$PhoneMetadata.mo43812r() || !mo43765r(str, phonemetadata$PhoneMetadata.mo43802h())) {
            return PhoneNumberType.UNKNOWN;
        } else {
            return PhoneNumberType.MOBILE;
        }
    }

    /* renamed from: q */
    public final String mo43764q(int i) {
        List list = this.f36745b.get(Integer.valueOf(i));
        if (list == null) {
            return "ZZ";
        }
        return (String) list.get(0);
    }

    /* renamed from: r */
    public final boolean mo43765r(String str, Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc) {
        int length = str.length();
        List<Integer> e = phonemetadata$PhoneNumberDesc.mo43832e();
        if (e.size() <= 0 || e.contains(Integer.valueOf(length))) {
            return this.f36746c.mo42866f(str, phonemetadata$PhoneNumberDesc);
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a3 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo43766s(com.google.i18n.phonenumbers.Phonenumber$PhoneNumber r8) {
        /*
            r7 = this;
            int r0 = r8.mo43838b()
            java.util.Map<java.lang.Integer, java.util.List<java.lang.String>> r1 = r7.f36745b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r1.get(r2)
            java.util.List r1 = (java.util.List) r1
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0032
            java.util.logging.Logger r1 = f36725h
            java.util.logging.Level r4 = java.util.logging.Level.INFO
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Missing/invalid country_code ("
            r5.append(r6)
            r5.append(r0)
            java.lang.String r0 = ")"
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            r1.log(r4, r0)
            goto L_0x007c
        L_0x0032:
            int r0 = r1.size()
            if (r0 != r2) goto L_0x003f
            java.lang.Object r0 = r1.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x007d
        L_0x003f:
            java.lang.String r0 = m36284n(r8)
            java.util.Iterator r1 = r1.iterator()
        L_0x0047:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x007c
            java.lang.Object r4 = r1.next()
            java.lang.String r4 = (java.lang.String) r4
            com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata r5 = r7.mo43761l(r4)
            boolean r6 = r5.mo43820x()
            if (r6 == 0) goto L_0x0072
            com.google.i18n.phonenumbers.internal.RegexCache r6 = r7.f36748e
            java.lang.String r5 = r5.mo43801g()
            java.util.regex.Pattern r5 = r6.mo43873a(r5)
            java.util.regex.Matcher r5 = r5.matcher(r0)
            boolean r5 = r5.lookingAt()
            if (r5 == 0) goto L_0x0047
            goto L_0x007a
        L_0x0072:
            com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberType r5 = r7.mo43763p(r0, r5)
            com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberType r6 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.UNKNOWN
            if (r5 == r6) goto L_0x0047
        L_0x007a:
            r0 = r4
            goto L_0x007d
        L_0x007c:
            r0 = 0
        L_0x007d:
            int r1 = r8.mo43838b()
            com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata r4 = r7.mo43762m(r1, r0)
            if (r4 == 0) goto L_0x00a3
            java.lang.String r5 = "001"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0096
            int r0 = r7.mo43759i(r0)
            if (r1 == r0) goto L_0x0096
            goto L_0x00a3
        L_0x0096:
            java.lang.String r8 = m36284n(r8)
            com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberType r8 = r7.mo43763p(r8, r4)
            com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberType r0 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.UNKNOWN
            if (r8 == r0) goto L_0x00a3
            goto L_0x00a4
        L_0x00a3:
            r2 = 0
        L_0x00a4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.i18n.phonenumbers.PhoneNumberUtil.mo43766s(com.google.i18n.phonenumbers.Phonenumber$PhoneNumber):boolean");
    }

    /* renamed from: t */
    public final boolean mo43767t(String str) {
        return str != null && this.f36749f.contains(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007b  */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo43768v(java.lang.CharSequence r6, com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata r7, java.lang.StringBuilder r8, boolean r9, com.google.i18n.phonenumbers.Phonenumber$PhoneNumber r10) throws com.google.i18n.phonenumbers.NumberParseException {
        /*
            r5 = this;
            int r0 = r6.length()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r6)
            if (r7 == 0) goto L_0x0014
            java.lang.String r6 = r7.mo43798d()
            goto L_0x0016
        L_0x0014:
            java.lang.String r6 = "NonMatch"
        L_0x0016:
            int r2 = r0.length()
            if (r2 != 0) goto L_0x001f
            com.google.i18n.phonenumbers.Phonenumber$PhoneNumber$CountryCodeSource r6 = com.google.i18n.phonenumbers.Phonenumber$PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY
            goto L_0x007d
        L_0x001f:
            java.util.regex.Pattern r2 = f36732o
            java.util.regex.Matcher r2 = r2.matcher(r0)
            boolean r3 = r2.lookingAt()
            if (r3 == 0) goto L_0x0038
            int r6 = r2.end()
            r0.delete(r1, r6)
            m36287x(r0)
            com.google.i18n.phonenumbers.Phonenumber$PhoneNumber$CountryCodeSource r6 = com.google.i18n.phonenumbers.Phonenumber$PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_PLUS_SIGN
            goto L_0x007d
        L_0x0038:
            com.google.i18n.phonenumbers.internal.RegexCache r2 = r5.f36748e
            java.util.regex.Pattern r6 = r2.mo43873a(r6)
            m36287x(r0)
            java.util.regex.Matcher r6 = r6.matcher(r0)
            boolean r2 = r6.lookingAt()
            r3 = 1
            if (r2 == 0) goto L_0x0075
            int r6 = r6.end()
            java.util.regex.Pattern r2 = f36734q
            java.lang.String r4 = r0.substring(r6)
            java.util.regex.Matcher r2 = r2.matcher(r4)
            boolean r4 = r2.find()
            if (r4 == 0) goto L_0x0071
            java.lang.String r2 = r2.group(r3)
            java.lang.String r2 = m36288y(r2)
            java.lang.String r4 = "0"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0071
            goto L_0x0075
        L_0x0071:
            r0.delete(r1, r6)
            goto L_0x0076
        L_0x0075:
            r3 = 0
        L_0x0076:
            if (r3 == 0) goto L_0x007b
            com.google.i18n.phonenumbers.Phonenumber$PhoneNumber$CountryCodeSource r6 = com.google.i18n.phonenumbers.Phonenumber$PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_IDD
            goto L_0x007d
        L_0x007b:
            com.google.i18n.phonenumbers.Phonenumber$PhoneNumber$CountryCodeSource r6 = com.google.i18n.phonenumbers.Phonenumber$PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY
        L_0x007d:
            if (r9 == 0) goto L_0x0082
            r10.mo43851m(r6)
        L_0x0082:
            com.google.i18n.phonenumbers.Phonenumber$PhoneNumber$CountryCodeSource r2 = com.google.i18n.phonenumbers.Phonenumber$PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY
            if (r6 == r2) goto L_0x00ab
            int r6 = r0.length()
            r7 = 2
            if (r6 <= r7) goto L_0x00a1
            int r6 = r5.mo43754d(r0, r8)
            if (r6 == 0) goto L_0x0097
            r10.mo43850l(r6)
            return r6
        L_0x0097:
            com.google.i18n.phonenumbers.NumberParseException r6 = new com.google.i18n.phonenumbers.NumberParseException
            com.google.i18n.phonenumbers.NumberParseException$ErrorType r7 = com.google.i18n.phonenumbers.NumberParseException.ErrorType.INVALID_COUNTRY_CODE
            java.lang.String r8 = "Country calling code supplied was not recognised."
            r6.<init>(r7, r8)
            throw r6
        L_0x00a1:
            com.google.i18n.phonenumbers.NumberParseException r6 = new com.google.i18n.phonenumbers.NumberParseException
            com.google.i18n.phonenumbers.NumberParseException$ErrorType r7 = com.google.i18n.phonenumbers.NumberParseException.ErrorType.TOO_SHORT_AFTER_IDD
            java.lang.String r8 = "Phone number had an IDD, but after this was not long enough to be a viable phone number."
            r6.<init>(r7, r8)
            throw r6
        L_0x00ab:
            if (r7 == 0) goto L_0x00fc
            int r6 = r7.mo43795a()
            java.lang.String r2 = java.lang.String.valueOf(r6)
            java.lang.String r3 = r0.toString()
            boolean r4 = r3.startsWith(r2)
            if (r4 == 0) goto L_0x00fc
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r2 = r2.length()
            java.lang.String r2 = r3.substring(r2)
            r4.<init>(r2)
            com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc r2 = r7.mo43797c()
            r3 = 0
            r5.mo43769w(r4, r7, r3)
            com.google.android.play.core.assetpacks.m0 r3 = r5.f36746c
            boolean r3 = r3.mo42866f(r0, r2)
            if (r3 != 0) goto L_0x00e4
            com.google.android.play.core.assetpacks.m0 r3 = r5.f36746c
            boolean r2 = r3.mo42866f(r4, r2)
            if (r2 != 0) goto L_0x00ee
        L_0x00e4:
            com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberType r2 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.UNKNOWN
            com.google.i18n.phonenumbers.PhoneNumberUtil$ValidationResult r7 = m36280C(r0, r7, r2)
            com.google.i18n.phonenumbers.PhoneNumberUtil$ValidationResult r0 = com.google.i18n.phonenumbers.PhoneNumberUtil.ValidationResult.TOO_LONG
            if (r7 != r0) goto L_0x00fc
        L_0x00ee:
            r8.append(r4)
            if (r9 == 0) goto L_0x00f8
            com.google.i18n.phonenumbers.Phonenumber$PhoneNumber$CountryCodeSource r7 = com.google.i18n.phonenumbers.Phonenumber$PhoneNumber.CountryCodeSource.FROM_NUMBER_WITHOUT_PLUS_SIGN
            r10.mo43851m(r7)
        L_0x00f8:
            r10.mo43850l(r6)
            return r6
        L_0x00fc:
            r10.mo43850l(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.i18n.phonenumbers.PhoneNumberUtil.mo43768v(java.lang.CharSequence, com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata, java.lang.StringBuilder, boolean, com.google.i18n.phonenumbers.Phonenumber$PhoneNumber):int");
    }

    /* renamed from: w */
    public final void mo43769w(StringBuilder sb, Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata, StringBuilder sb2) {
        int length = sb.length();
        String j = phonemetadata$PhoneMetadata.mo43804j();
        if (length != 0 && j.length() != 0) {
            Matcher matcher = this.f36748e.mo43873a(j).matcher(sb);
            if (matcher.lookingAt()) {
                Phonemetadata$PhoneNumberDesc c = phonemetadata$PhoneMetadata.mo43797c();
                boolean f = this.f36746c.mo42866f(sb, c);
                int groupCount = matcher.groupCount();
                String k = phonemetadata$PhoneMetadata.mo43805k();
                if (k != null && k.length() != 0 && matcher.group(groupCount) != null) {
                    StringBuilder sb3 = new StringBuilder(sb);
                    sb3.replace(0, length, matcher.replaceFirst(k));
                    if (!f || this.f36746c.mo42866f(sb3.toString(), c)) {
                        if (sb2 != null && groupCount > 1) {
                            sb2.append(matcher.group(1));
                        }
                        sb.replace(0, sb.length(), sb3.toString());
                    }
                } else if (!f || this.f36746c.mo42866f(sb.substring(matcher.end()), c)) {
                    if (!(sb2 == null || groupCount <= 0 || matcher.group(groupCount) == null)) {
                        sb2.append(matcher.group(1));
                    }
                    sb.delete(0, matcher.end());
                }
            }
        }
    }
}
