package p239rb;

import android.graphics.Color;
import android.text.TextUtils;
import com.appboy.support.ValidationUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p277ub.C6803r;

/* renamed from: rb.g */
public final class C6291g {

    /* renamed from: a */
    public static final Pattern f19900a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b */
    public static final Pattern f19901b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c */
    public static final Map<String, Integer> f19902c;

    /* renamed from: d */
    public static final Map<String, Integer> f19903d;

    /* renamed from: rb.g$a */
    public static class C6292a {

        /* renamed from: c */
        public static final C6290f f19904c = new C6290f(0);

        /* renamed from: a */
        public final C6293b f19905a;

        /* renamed from: b */
        public final int f19906b;

        public C6292a(C6293b bVar, int i) {
            this.f19905a = bVar;
            this.f19906b = i;
        }
    }

    /* renamed from: rb.g$b */
    public static final class C6293b {

        /* renamed from: a */
        public final String f19907a;

        /* renamed from: b */
        public final int f19908b;

        /* renamed from: c */
        public final String f19909c;

        /* renamed from: d */
        public final Set<String> f19910d;

        public C6293b(String str, int i, String str2, Set<String> set) {
            this.f19908b = i;
            this.f19907a = str;
            this.f19909c = str2;
            this.f19910d = set;
        }
    }

    /* renamed from: rb.g$c */
    public static final class C6294c implements Comparable<C6294c> {

        /* renamed from: b */
        public final int f19911b;

        /* renamed from: c */
        public final C6288d f19912c;

        public C6294c(int i, C6288d dVar) {
            this.f19911b = i;
            this.f19912c = dVar;
        }

        public final int compareTo(Object obj) {
            return Integer.compare(this.f19911b, ((C6294c) obj).f19911b);
        }
    }

    /* renamed from: rb.g$d */
    public static final class C6295d {

        /* renamed from: a */
        public long f19913a = 0;

        /* renamed from: b */
        public long f19914b = 0;

        /* renamed from: c */
        public CharSequence f19915c;

        /* renamed from: d */
        public int f19916d = 2;

        /* renamed from: e */
        public float f19917e = -3.4028235E38f;

        /* renamed from: f */
        public int f19918f = 1;

        /* renamed from: g */
        public int f19919g = 0;

        /* renamed from: h */
        public float f19920h = -3.4028235E38f;

        /* renamed from: i */
        public int f19921i = Integer.MIN_VALUE;

        /* renamed from: j */
        public float f19922j = 1.0f;

        /* renamed from: k */
        public int f19923k = Integer.MIN_VALUE;

        /* JADX WARNING: Code restructure failed: missing block: B:37:0x006b, code lost:
            if (r6 == 0) goto L_0x006d;
         */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0069  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x006b  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x007f  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x009b  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x00ab  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p126ib.C5332a.C5333a mo22276a() {
            /*
                r13 = this;
                float r0 = r13.f19920h
                r1 = 1056964608(0x3f000000, float:0.5)
                r2 = 0
                r3 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
                r4 = 1065353216(0x3f800000, float:1.0)
                r5 = 5
                r6 = 4
                int r7 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r7 == 0) goto L_0x0011
                goto L_0x001e
            L_0x0011:
                int r0 = r13.f19916d
                if (r0 == r6) goto L_0x001d
                if (r0 == r5) goto L_0x001a
                r0 = 1056964608(0x3f000000, float:0.5)
                goto L_0x001e
            L_0x001a:
                r0 = 1065353216(0x3f800000, float:1.0)
                goto L_0x001e
            L_0x001d:
                r0 = 0
            L_0x001e:
                int r7 = r13.f19921i
                r8 = -2147483648(0xffffffff80000000, float:-0.0)
                r9 = 3
                r10 = 2
                r11 = 1
                if (r7 == r8) goto L_0x0028
                goto L_0x0037
            L_0x0028:
                int r7 = r13.f19916d
                if (r7 == r11) goto L_0x0036
                if (r7 == r9) goto L_0x0034
                if (r7 == r6) goto L_0x0036
                if (r7 == r5) goto L_0x0034
                r7 = 1
                goto L_0x0037
            L_0x0034:
                r7 = 2
                goto L_0x0037
            L_0x0036:
                r7 = 0
            L_0x0037:
                ib.a$a r8 = new ib.a$a
                r8.<init>()
                int r12 = r13.f19916d
                if (r12 == r11) goto L_0x0050
                if (r12 == r10) goto L_0x004d
                if (r12 == r9) goto L_0x004a
                if (r12 == r6) goto L_0x0050
                if (r12 == r5) goto L_0x004a
                r5 = 0
                goto L_0x0052
            L_0x004a:
                android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_OPPOSITE
                goto L_0x0052
            L_0x004d:
                android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_CENTER
                goto L_0x0052
            L_0x0050:
                android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_NORMAL
            L_0x0052:
                r8.f17608c = r5
                float r5 = r13.f19917e
                int r6 = r13.f19918f
                int r9 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r9 == 0) goto L_0x0067
                if (r6 != 0) goto L_0x0067
                int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
                if (r2 < 0) goto L_0x006d
                int r2 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
                if (r2 <= 0) goto L_0x0067
                goto L_0x006d
            L_0x0067:
                if (r9 == 0) goto L_0x006b
                r3 = r5
                goto L_0x006f
            L_0x006b:
                if (r6 != 0) goto L_0x006f
            L_0x006d:
                r3 = 1065353216(0x3f800000, float:1.0)
            L_0x006f:
                r8.f17610e = r3
                r8.f17611f = r6
                int r2 = r13.f19919g
                r8.f17612g = r2
                r8.f17613h = r0
                r8.f17614i = r7
                float r2 = r13.f19922j
                if (r7 == 0) goto L_0x009b
                if (r7 == r11) goto L_0x008e
                if (r7 != r10) goto L_0x0084
                goto L_0x009d
            L_0x0084:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = java.lang.String.valueOf(r7)
                r0.<init>(r1)
                throw r0
            L_0x008e:
                r3 = 1073741824(0x40000000, float:2.0)
                int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r1 > 0) goto L_0x0097
                float r0 = r0 * r3
                goto L_0x009d
            L_0x0097:
                float r4 = r4 - r0
                float r0 = r4 * r3
                goto L_0x009d
            L_0x009b:
                float r0 = r4 - r0
            L_0x009d:
                float r0 = java.lang.Math.min(r2, r0)
                r8.f17617l = r0
                int r0 = r13.f19923k
                r8.f17621p = r0
                java.lang.CharSequence r0 = r13.f19915c
                if (r0 == 0) goto L_0x00ad
                r8.f17606a = r0
            L_0x00ad:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p239rb.C6291g.C6295d.mo22276a():ib.a$a");
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(ValidationUtils.APPBOY_STRING_MAX_LENGTH, ValidationUtils.APPBOY_STRING_MAX_LENGTH, ValidationUtils.APPBOY_STRING_MAX_LENGTH)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, ValidationUtils.APPBOY_STRING_MAX_LENGTH, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, ValidationUtils.APPBOY_STRING_MAX_LENGTH, ValidationUtils.APPBOY_STRING_MAX_LENGTH)));
        hashMap.put("red", Integer.valueOf(Color.rgb(ValidationUtils.APPBOY_STRING_MAX_LENGTH, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(ValidationUtils.APPBOY_STRING_MAX_LENGTH, ValidationUtils.APPBOY_STRING_MAX_LENGTH, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(ValidationUtils.APPBOY_STRING_MAX_LENGTH, 0, ValidationUtils.APPBOY_STRING_MAX_LENGTH)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, ValidationUtils.APPBOY_STRING_MAX_LENGTH)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f19902c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(ValidationUtils.APPBOY_STRING_MAX_LENGTH, ValidationUtils.APPBOY_STRING_MAX_LENGTH, ValidationUtils.APPBOY_STRING_MAX_LENGTH)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, ValidationUtils.APPBOY_STRING_MAX_LENGTH, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, ValidationUtils.APPBOY_STRING_MAX_LENGTH, ValidationUtils.APPBOY_STRING_MAX_LENGTH)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(ValidationUtils.APPBOY_STRING_MAX_LENGTH, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(ValidationUtils.APPBOY_STRING_MAX_LENGTH, ValidationUtils.APPBOY_STRING_MAX_LENGTH, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(ValidationUtils.APPBOY_STRING_MAX_LENGTH, 0, ValidationUtils.APPBOY_STRING_MAX_LENGTH)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, ValidationUtils.APPBOY_STRING_MAX_LENGTH)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f19903d = Collections.unmodifiableMap(hashMap2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0099 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0179  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m14892a(android.text.SpannableStringBuilder r19, p239rb.C6291g.C6293b r20, java.lang.String r21, java.util.List r22, java.util.List r23) {
        /*
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r23
            int r4 = r1.f19908b
            int r5 = r19.length()
            java.lang.String r6 = r1.f19907a
            r6.getClass()
            int r7 = r6.hashCode()
            r9 = 2
            r10 = -1
            if (r7 == 0) goto L_0x0089
            r13 = 105(0x69, float:1.47E-43)
            if (r7 == r13) goto L_0x007e
            r13 = 3314158(0x3291ee, float:4.644125E-39)
            if (r7 == r13) goto L_0x0073
            r13 = 3511770(0x3595da, float:4.921038E-39)
            if (r7 == r13) goto L_0x0068
            r13 = 98
            if (r7 == r13) goto L_0x005d
            r13 = 99
            if (r7 == r13) goto L_0x0052
            r13 = 117(0x75, float:1.64E-43)
            if (r7 == r13) goto L_0x0046
            r13 = 118(0x76, float:1.65E-43)
            if (r7 == r13) goto L_0x003a
            goto L_0x0091
        L_0x003a:
            java.lang.String r7 = "v"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0044
            goto L_0x0091
        L_0x0044:
            r6 = 5
            goto L_0x0094
        L_0x0046:
            java.lang.String r7 = "u"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0050
            goto L_0x0091
        L_0x0050:
            r6 = 4
            goto L_0x0094
        L_0x0052:
            java.lang.String r7 = "c"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x005b
            goto L_0x0091
        L_0x005b:
            r6 = 2
            goto L_0x0094
        L_0x005d:
            java.lang.String r7 = "b"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0066
            goto L_0x0091
        L_0x0066:
            r6 = 1
            goto L_0x0094
        L_0x0068:
            java.lang.String r7 = "ruby"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0071
            goto L_0x0091
        L_0x0071:
            r6 = 7
            goto L_0x0094
        L_0x0073:
            java.lang.String r7 = "lang"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x007c
            goto L_0x0091
        L_0x007c:
            r6 = 6
            goto L_0x0094
        L_0x007e:
            java.lang.String r7 = "i"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0087
            goto L_0x0091
        L_0x0087:
            r6 = 3
            goto L_0x0094
        L_0x0089:
            java.lang.String r7 = ""
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0093
        L_0x0091:
            r6 = -1
            goto L_0x0094
        L_0x0093:
            r6 = 0
        L_0x0094:
            r7 = 33
            switch(r6) {
                case 0: goto L_0x016e;
                case 1: goto L_0x0165;
                case 2: goto L_0x011d;
                case 3: goto L_0x0114;
                case 4: goto L_0x010b;
                case 5: goto L_0x016e;
                case 6: goto L_0x016e;
                case 7: goto L_0x009a;
                default: goto L_0x0099;
            }
        L_0x0099:
            return
        L_0x009a:
            int r6 = m14894c(r3, r2, r1)
            java.util.ArrayList r13 = new java.util.ArrayList
            int r14 = r22.size()
            r13.<init>(r14)
            r14 = r22
            r13.addAll(r14)
            rb.f r14 = p239rb.C6291g.C6292a.f19904c
            java.util.Collections.sort(r13, r14)
            int r14 = r1.f19908b
            r15 = 0
            r16 = 0
        L_0x00b6:
            int r11 = r13.size()
            if (r15 >= r11) goto L_0x016e
            java.lang.Object r11 = r13.get(r15)
            rb.g$a r11 = (p239rb.C6291g.C6292a) r11
            rb.g$b r11 = r11.f19905a
            java.lang.String r11 = r11.f19907a
            java.lang.String r8 = "rt"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto L_0x00cf
            goto L_0x0107
        L_0x00cf:
            java.lang.Object r8 = r13.get(r15)
            rb.g$a r8 = (p239rb.C6291g.C6292a) r8
            rb.g$b r11 = r8.f19905a
            int r11 = m14894c(r3, r2, r11)
            if (r11 == r10) goto L_0x00de
            goto L_0x00e3
        L_0x00de:
            if (r6 == r10) goto L_0x00e2
            r11 = r6
            goto L_0x00e3
        L_0x00e2:
            r11 = 1
        L_0x00e3:
            rb.g$b r10 = r8.f19905a
            int r10 = r10.f19908b
            int r10 = r10 - r16
            int r8 = r8.f19906b
            int r8 = r8 - r16
            java.lang.CharSequence r17 = r0.subSequence(r10, r8)
            r0.delete(r10, r8)
            mb.c r8 = new mb.c
            java.lang.String r12 = r17.toString()
            r8.<init>(r12, r11)
            r0.setSpan(r8, r14, r10, r7)
            int r8 = r17.length()
            int r16 = r8 + r16
            r14 = r10
        L_0x0107:
            int r15 = r15 + 1
            r10 = -1
            goto L_0x00b6
        L_0x010b:
            android.text.style.UnderlineSpan r6 = new android.text.style.UnderlineSpan
            r6.<init>()
            r0.setSpan(r6, r4, r5, r7)
            goto L_0x016e
        L_0x0114:
            android.text.style.StyleSpan r6 = new android.text.style.StyleSpan
            r6.<init>(r9)
            r0.setSpan(r6, r4, r5, r7)
            goto L_0x016e
        L_0x011d:
            java.util.Set<java.lang.String> r6 = r1.f19910d
            java.util.Iterator r6 = r6.iterator()
        L_0x0123:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x016e
            java.lang.Object r8 = r6.next()
            java.lang.String r8 = (java.lang.String) r8
            java.util.Map<java.lang.String, java.lang.Integer> r10 = f19902c
            boolean r11 = r10.containsKey(r8)
            if (r11 == 0) goto L_0x014a
            java.lang.Object r8 = r10.get(r8)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            android.text.style.ForegroundColorSpan r10 = new android.text.style.ForegroundColorSpan
            r10.<init>(r8)
            r0.setSpan(r10, r4, r5, r7)
            goto L_0x0123
        L_0x014a:
            java.util.Map<java.lang.String, java.lang.Integer> r10 = f19903d
            boolean r11 = r10.containsKey(r8)
            if (r11 == 0) goto L_0x0123
            java.lang.Object r8 = r10.get(r8)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            android.text.style.BackgroundColorSpan r10 = new android.text.style.BackgroundColorSpan
            r10.<init>(r8)
            r0.setSpan(r10, r4, r5, r7)
            goto L_0x0123
        L_0x0165:
            android.text.style.StyleSpan r6 = new android.text.style.StyleSpan
            r8 = 1
            r6.<init>(r8)
            r0.setSpan(r6, r4, r5, r7)
        L_0x016e:
            java.util.ArrayList r1 = m14893b(r3, r2, r1)
            r2 = 0
        L_0x0173:
            int r3 = r1.size()
            if (r2 >= r3) goto L_0x0268
            java.lang.Object r3 = r1.get(r2)
            rb.g$c r3 = (p239rb.C6291g.C6294c) r3
            rb.d r3 = r3.f19912c
            if (r3 != 0) goto L_0x0188
            r6 = -1
            r11 = 3
            r12 = 1
            goto L_0x0264
        L_0x0188:
            int r6 = r3.f19891l
            r8 = -1
            if (r6 != r8) goto L_0x0193
            int r10 = r3.f19892m
            if (r10 != r8) goto L_0x0193
            r8 = -1
            goto L_0x01a1
        L_0x0193:
            r8 = 1
            if (r6 != r8) goto L_0x0198
            r6 = 1
            goto L_0x0199
        L_0x0198:
            r6 = 0
        L_0x0199:
            int r10 = r3.f19892m
            if (r10 != r8) goto L_0x019f
            r8 = 2
            goto L_0x01a0
        L_0x019f:
            r8 = 0
        L_0x01a0:
            r8 = r8 | r6
        L_0x01a1:
            r6 = -1
            if (r8 == r6) goto L_0x01c4
            android.text.style.StyleSpan r8 = new android.text.style.StyleSpan
            int r10 = r3.f19891l
            if (r10 != r6) goto L_0x01b0
            int r11 = r3.f19892m
            if (r11 != r6) goto L_0x01b0
            r10 = -1
            goto L_0x01be
        L_0x01b0:
            r11 = 1
            if (r10 != r11) goto L_0x01b5
            r10 = 1
            goto L_0x01b6
        L_0x01b5:
            r10 = 0
        L_0x01b6:
            int r12 = r3.f19892m
            if (r12 != r11) goto L_0x01bc
            r11 = 2
            goto L_0x01bd
        L_0x01bc:
            r11 = 0
        L_0x01bd:
            r10 = r10 | r11
        L_0x01be:
            r8.<init>(r10)
            p584jl.C17885a.m44437f(r0, r8, r4, r5)
        L_0x01c4:
            int r8 = r3.f19889j
            r10 = 1
            if (r8 != r10) goto L_0x01cc
            r18 = 1
            goto L_0x01ce
        L_0x01cc:
            r18 = 0
        L_0x01ce:
            if (r18 == 0) goto L_0x01d8
            android.text.style.StrikethroughSpan r8 = new android.text.style.StrikethroughSpan
            r8.<init>()
            r0.setSpan(r8, r4, r5, r7)
        L_0x01d8:
            int r8 = r3.f19890k
            if (r8 != r10) goto L_0x01de
            r8 = 1
            goto L_0x01df
        L_0x01de:
            r8 = 0
        L_0x01df:
            if (r8 == 0) goto L_0x01e9
            android.text.style.UnderlineSpan r8 = new android.text.style.UnderlineSpan
            r8.<init>()
            r0.setSpan(r8, r4, r5, r7)
        L_0x01e9:
            boolean r8 = r3.f19886g
            if (r8 == 0) goto L_0x0204
            android.text.style.ForegroundColorSpan r8 = new android.text.style.ForegroundColorSpan
            boolean r10 = r3.f19886g
            if (r10 == 0) goto L_0x01fc
            int r10 = r3.f19885f
            r8.<init>(r10)
            p584jl.C17885a.m44437f(r0, r8, r4, r5)
            goto L_0x0204
        L_0x01fc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Font color not defined"
            r0.<init>(r1)
            throw r0
        L_0x0204:
            boolean r8 = r3.f19888i
            if (r8 == 0) goto L_0x021f
            android.text.style.BackgroundColorSpan r8 = new android.text.style.BackgroundColorSpan
            boolean r10 = r3.f19888i
            if (r10 == 0) goto L_0x0217
            int r10 = r3.f19887h
            r8.<init>(r10)
            p584jl.C17885a.m44437f(r0, r8, r4, r5)
            goto L_0x021f
        L_0x0217:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Background color not defined."
            r0.<init>(r1)
            throw r0
        L_0x021f:
            java.lang.String r8 = r3.f19884e
            if (r8 == 0) goto L_0x022d
            android.text.style.TypefaceSpan r8 = new android.text.style.TypefaceSpan
            java.lang.String r10 = r3.f19884e
            r8.<init>(r10)
            p584jl.C17885a.m44437f(r0, r8, r4, r5)
        L_0x022d:
            int r8 = r3.f19893n
            r10 = 0
            r11 = 1
            if (r8 == r11) goto L_0x024d
            if (r8 == r9) goto L_0x0242
            r11 = 3
            if (r8 == r11) goto L_0x0239
            goto L_0x024b
        L_0x0239:
            android.text.style.RelativeSizeSpan r8 = new android.text.style.RelativeSizeSpan
            r8.<init>(r10)
            p584jl.C17885a.m44437f(r0, r8, r4, r5)
            goto L_0x024b
        L_0x0242:
            r11 = 3
            android.text.style.RelativeSizeSpan r8 = new android.text.style.RelativeSizeSpan
            r8.<init>(r10)
            p584jl.C17885a.m44437f(r0, r8, r4, r5)
        L_0x024b:
            r12 = 1
            goto L_0x0258
        L_0x024d:
            r11 = 3
            android.text.style.AbsoluteSizeSpan r8 = new android.text.style.AbsoluteSizeSpan
            int r10 = (int) r10
            r12 = 1
            r8.<init>(r10, r12)
            p584jl.C17885a.m44437f(r0, r8, r4, r5)
        L_0x0258:
            boolean r3 = r3.f19895p
            if (r3 == 0) goto L_0x0264
            mb.a r3 = new mb.a
            r3.<init>()
            r0.setSpan(r3, r4, r5, r7)
        L_0x0264:
            int r2 = r2 + 1
            goto L_0x0173
        L_0x0268:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p239rb.C6291g.m14892a(android.text.SpannableStringBuilder, rb.g$b, java.lang.String, java.util.List, java.util.List):void");
    }

    /* renamed from: b */
    public static ArrayList m14893b(List list, String str, C6293b bVar) {
        int i;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            C6288d dVar = (C6288d) list.get(i2);
            String str2 = bVar.f19907a;
            Set<String> set = bVar.f19910d;
            String str3 = bVar.f19909c;
            if (!dVar.f19880a.isEmpty() || !dVar.f19881b.isEmpty() || !dVar.f19882c.isEmpty() || !dVar.f19883d.isEmpty()) {
                int a = C6288d.m14891a(C6288d.m14891a(C6288d.m14891a(0, 1073741824, dVar.f19880a, str), 2, dVar.f19881b, str2), 4, dVar.f19883d, str3);
                if (a == -1 || !set.containsAll(dVar.f19882c)) {
                    i = 0;
                } else {
                    i = a + (dVar.f19882c.size() * 4);
                }
            } else {
                i = TextUtils.isEmpty(str2);
            }
            if (i > 0) {
                arrayList.add(new C6294c(i, dVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: c */
    public static int m14894c(List<C6288d> list, String str, C6293b bVar) {
        ArrayList b = m14893b(list, str, bVar);
        for (int i = 0; i < b.size(); i++) {
            int i2 = ((C6294c) b.get(i)).f19912c.f19894o;
            if (i2 != -1) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: d */
    public static C6289e m14895d(String str, Matcher matcher, C6803r rVar, ArrayList arrayList) {
        C6295d dVar = new C6295d();
        try {
            String group = matcher.group(1);
            group.getClass();
            dVar.f19913a = C6297i.m14902b(group);
            String group2 = matcher.group(2);
            group2.getClass();
            dVar.f19914b = C6297i.m14902b(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            m14896e(group3, dVar);
            StringBuilder sb = new StringBuilder();
            String d = rVar.mo22985d();
            while (!TextUtils.isEmpty(d)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(d.trim());
                d = rVar.mo22985d();
            }
            dVar.f19915c = m14897f(str, sb.toString(), arrayList);
            return new C6289e(dVar.mo22276a().mo21116a(), dVar.f19913a, dVar.f19914b);
        } catch (NumberFormatException unused) {
            String valueOf = String.valueOf(matcher.group());
            if (valueOf.length() == 0) {
                return null;
            }
            "Skipping cue with bad header: ".concat(valueOf);
            return null;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c4, code lost:
        if (r6.equals("start") == false) goto L_0x00be;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m14896e(java.lang.String r18, p239rb.C6291g.C6295d r19) {
        /*
            r0 = r19
            java.util.regex.Pattern r1 = f19901b
            r2 = r18
            java.util.regex.Matcher r1 = r1.matcher(r2)
        L_0x000a:
            boolean r2 = r1.find()
            if (r2 == 0) goto L_0x017d
            r2 = 1
            java.lang.String r3 = r1.group(r2)
            r3.getClass()
            r4 = 2
            java.lang.String r5 = r1.group(r4)
            r5.getClass()
            java.lang.String r6 = "line"
            boolean r6 = r6.equals(r3)     // Catch:{ NumberFormatException -> 0x0167 }
            if (r6 == 0) goto L_0x002c
            m14898g(r5, r0)     // Catch:{ NumberFormatException -> 0x0167 }
            goto L_0x000a
        L_0x002c:
            java.lang.String r6 = "align"
            boolean r6 = r6.equals(r3)     // Catch:{ NumberFormatException -> 0x0167 }
            java.lang.String r7 = "start"
            java.lang.String r8 = "end"
            java.lang.String r9 = "middle"
            java.lang.String r10 = "center"
            r11 = 5
            r12 = 4
            r13 = 3
            r14 = -1
            r15 = 0
            if (r6 == 0) goto L_0x009c
            int r3 = r5.hashCode()
            switch(r3) {
                case -1364013995: goto L_0x007a;
                case -1074341483: goto L_0x0071;
                case 100571: goto L_0x0068;
                case 3317767: goto L_0x005d;
                case 108511772: goto L_0x0052;
                case 109757538: goto L_0x0049;
                default: goto L_0x0048;
            }
        L_0x0048:
            goto L_0x0082
        L_0x0049:
            boolean r3 = r5.equals(r7)
            if (r3 != 0) goto L_0x0050
            goto L_0x0082
        L_0x0050:
            r14 = 5
            goto L_0x0082
        L_0x0052:
            java.lang.String r3 = "right"
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L_0x005b
            goto L_0x0082
        L_0x005b:
            r14 = 4
            goto L_0x0082
        L_0x005d:
            java.lang.String r3 = "left"
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L_0x0066
            goto L_0x0082
        L_0x0066:
            r14 = 3
            goto L_0x0082
        L_0x0068:
            boolean r3 = r5.equals(r8)
            if (r3 != 0) goto L_0x006f
            goto L_0x0082
        L_0x006f:
            r14 = 2
            goto L_0x0082
        L_0x0071:
            boolean r3 = r5.equals(r9)
            if (r3 != 0) goto L_0x0078
            goto L_0x0082
        L_0x0078:
            r14 = 1
            goto L_0x0082
        L_0x007a:
            boolean r3 = r5.equals(r10)
            if (r3 != 0) goto L_0x0081
            goto L_0x0082
        L_0x0081:
            r14 = 0
        L_0x0082:
            switch(r14) {
                case 0: goto L_0x0097;
                case 1: goto L_0x0097;
                case 2: goto L_0x0095;
                case 3: goto L_0x0093;
                case 4: goto L_0x0091;
                case 5: goto L_0x0098;
                default: goto L_0x0085;
            }
        L_0x0085:
            int r2 = r5.length()     // Catch:{ NumberFormatException -> 0x0167 }
            if (r2 == 0) goto L_0x0097
            java.lang.String r2 = "Invalid alignment value: "
            r2.concat(r5)     // Catch:{ NumberFormatException -> 0x0167 }
            goto L_0x0097
        L_0x0091:
            r2 = 5
            goto L_0x0098
        L_0x0093:
            r2 = 4
            goto L_0x0098
        L_0x0095:
            r2 = 3
            goto L_0x0098
        L_0x0097:
            r2 = 2
        L_0x0098:
            r0.f19916d = r2     // Catch:{ NumberFormatException -> 0x0167 }
            goto L_0x000a
        L_0x009c:
            java.lang.String r6 = "position"
            boolean r6 = r6.equals(r3)     // Catch:{ NumberFormatException -> 0x0167 }
            r16 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 == 0) goto L_0x0119
            r3 = 44
            int r3 = r5.indexOf(r3)     // Catch:{ NumberFormatException -> 0x0167 }
            if (r3 == r14) goto L_0x0111
            int r6 = r3 + 1
            java.lang.String r6 = r5.substring(r6)     // Catch:{ NumberFormatException -> 0x0167 }
            r6.getClass()     // Catch:{ NumberFormatException -> 0x0167 }
            int r17 = r6.hashCode()
            switch(r17) {
                case -1842484672: goto L_0x00ed;
                case -1364013995: goto L_0x00e4;
                case -1276788989: goto L_0x00d9;
                case -1074341483: goto L_0x00d0;
                case 100571: goto L_0x00c7;
                case 109757538: goto L_0x00c0;
                default: goto L_0x00be;
            }
        L_0x00be:
            r11 = -1
            goto L_0x00f7
        L_0x00c0:
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L_0x00f7
            goto L_0x00be
        L_0x00c7:
            boolean r7 = r6.equals(r8)
            if (r7 != 0) goto L_0x00ce
            goto L_0x00be
        L_0x00ce:
            r11 = 4
            goto L_0x00f7
        L_0x00d0:
            boolean r7 = r6.equals(r9)
            if (r7 != 0) goto L_0x00d7
            goto L_0x00be
        L_0x00d7:
            r11 = 3
            goto L_0x00f7
        L_0x00d9:
            java.lang.String r7 = "line-right"
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L_0x00e2
            goto L_0x00be
        L_0x00e2:
            r11 = 2
            goto L_0x00f7
        L_0x00e4:
            boolean r7 = r6.equals(r10)
            if (r7 != 0) goto L_0x00eb
            goto L_0x00be
        L_0x00eb:
            r11 = 1
            goto L_0x00f7
        L_0x00ed:
            java.lang.String r7 = "line-left"
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L_0x00f6
            goto L_0x00be
        L_0x00f6:
            r11 = 0
        L_0x00f7:
            switch(r11) {
                case 0: goto L_0x010a;
                case 1: goto L_0x010b;
                case 2: goto L_0x0108;
                case 3: goto L_0x010b;
                case 4: goto L_0x0108;
                case 5: goto L_0x010a;
                default: goto L_0x00fa;
            }
        L_0x00fa:
            int r2 = r6.length()     // Catch:{ NumberFormatException -> 0x0167 }
            if (r2 == 0) goto L_0x0105
            java.lang.String r2 = "Invalid anchor value: "
            r2.concat(r6)     // Catch:{ NumberFormatException -> 0x0167 }
        L_0x0105:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x010b
        L_0x0108:
            r2 = 2
            goto L_0x010b
        L_0x010a:
            r2 = 0
        L_0x010b:
            r0.f19921i = r2     // Catch:{ NumberFormatException -> 0x0167 }
            java.lang.String r5 = r5.substring(r15, r3)     // Catch:{ NumberFormatException -> 0x0167 }
        L_0x0111:
            float r2 = p239rb.C6297i.m14901a(r5)     // Catch:{ NumberFormatException -> 0x0167 }
            r0.f19920h = r2     // Catch:{ NumberFormatException -> 0x0167 }
            goto L_0x000a
        L_0x0119:
            java.lang.String r6 = "size"
            boolean r6 = r6.equals(r3)     // Catch:{ NumberFormatException -> 0x0167 }
            if (r6 == 0) goto L_0x0129
            float r2 = p239rb.C6297i.m14901a(r5)     // Catch:{ NumberFormatException -> 0x0167 }
            r0.f19922j = r2     // Catch:{ NumberFormatException -> 0x0167 }
            goto L_0x000a
        L_0x0129:
            java.lang.String r6 = "vertical"
            boolean r6 = r6.equals(r3)     // Catch:{ NumberFormatException -> 0x0167 }
            if (r6 == 0) goto L_0x0155
            java.lang.String r3 = "lr"
            boolean r3 = r5.equals(r3)     // Catch:{ NumberFormatException -> 0x0167 }
            if (r3 != 0) goto L_0x0150
            java.lang.String r3 = "rl"
            boolean r3 = r5.equals(r3)     // Catch:{ NumberFormatException -> 0x0167 }
            if (r3 != 0) goto L_0x0151
            int r2 = r5.length()     // Catch:{ NumberFormatException -> 0x0167 }
            if (r2 == 0) goto L_0x014d
            java.lang.String r2 = "Invalid 'vertical' value: "
            r2.concat(r5)     // Catch:{ NumberFormatException -> 0x0167 }
        L_0x014d:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0151
        L_0x0150:
            r2 = 2
        L_0x0151:
            r0.f19923k = r2     // Catch:{ NumberFormatException -> 0x0167 }
            goto L_0x000a
        L_0x0155:
            int r2 = r3.length()     // Catch:{ NumberFormatException -> 0x0167 }
            int r2 = r2 + 21
            int r3 = r5.length()     // Catch:{ NumberFormatException -> 0x0167 }
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0167 }
            r3.<init>(r2)     // Catch:{ NumberFormatException -> 0x0167 }
            goto L_0x000a
        L_0x0167:
            java.lang.String r2 = r1.group()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r3 = r2.length()
            if (r3 == 0) goto L_0x000a
            java.lang.String r3 = "Skipping bad cue setting: "
            r3.concat(r2)
            goto L_0x000a
        L_0x017d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p239rb.C6291g.m14896e(java.lang.String, rb.g$d):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:71:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0128  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.text.SpannedString m14897f(java.lang.String r17, java.lang.String r18, java.util.List<p239rb.C6288d> r19) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
            r3.<init>()
            java.util.ArrayDeque r4 = new java.util.ArrayDeque
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
            r7 = 0
        L_0x0017:
            int r8 = r18.length()
            java.lang.String r9 = ""
            if (r7 >= r8) goto L_0x0228
            char r8 = r1.charAt(r7)
            java.lang.String r10 = " "
            r11 = 62
            r12 = 60
            r13 = 38
            r15 = 2
            r14 = -1
            r16 = 1
            if (r8 == r13) goto L_0x01a5
            if (r8 == r12) goto L_0x003a
            r3.append(r8)
            int r7 = r7 + 1
            goto L_0x0225
        L_0x003a:
            int r8 = r7 + 1
            int r12 = r18.length()
            if (r8 < r12) goto L_0x0044
            goto L_0x01a2
        L_0x0044:
            char r12 = r1.charAt(r8)
            r13 = 47
            if (r12 != r13) goto L_0x004e
            r12 = 1
            goto L_0x004f
        L_0x004e:
            r12 = 0
        L_0x004f:
            int r8 = r1.indexOf(r11, r8)
            if (r8 != r14) goto L_0x005a
            int r8 = r18.length()
            goto L_0x005c
        L_0x005a:
            int r8 = r8 + 1
        L_0x005c:
            int r11 = r8 + -2
            char r14 = r1.charAt(r11)
            if (r14 != r13) goto L_0x0066
            r13 = 1
            goto L_0x0067
        L_0x0066:
            r13 = 0
        L_0x0067:
            if (r12 == 0) goto L_0x006b
            r14 = 2
            goto L_0x006c
        L_0x006b:
            r14 = 1
        L_0x006c:
            int r7 = r7 + r14
            if (r13 == 0) goto L_0x0070
            goto L_0x0072
        L_0x0070:
            int r11 = r8 + -1
        L_0x0072:
            java.lang.String r7 = r1.substring(r7, r11)
            java.lang.String r11 = r7.trim()
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L_0x0082
            goto L_0x0125
        L_0x0082:
            java.lang.String r11 = r7.trim()
            boolean r14 = r11.isEmpty()
            r14 = r14 ^ 1
            p583jk.C17875h.m44301k(r14)
            int r14 = p277ub.C6774a0.f20959a
            java.lang.String r14 = "[ \\.]"
            java.lang.String[] r11 = r11.split(r14, r15)
            r11 = r11[r6]
            r11.getClass()
            int r14 = r11.hashCode()
            r15 = 98
            if (r14 == r15) goto L_0x0112
            r15 = 99
            if (r14 == r15) goto L_0x0107
            r15 = 105(0x69, float:1.47E-43)
            if (r14 == r15) goto L_0x00fc
            r15 = 3650(0xe42, float:5.115E-42)
            if (r14 == r15) goto L_0x00f1
            r15 = 3314158(0x3291ee, float:4.644125E-39)
            if (r14 == r15) goto L_0x00e6
            r15 = 3511770(0x3595da, float:4.921038E-39)
            if (r14 == r15) goto L_0x00db
            r15 = 117(0x75, float:1.64E-43)
            if (r14 == r15) goto L_0x00cf
            r15 = 118(0x76, float:1.65E-43)
            if (r14 == r15) goto L_0x00c3
            goto L_0x011a
        L_0x00c3:
            java.lang.String r14 = "v"
            boolean r14 = r11.equals(r14)
            if (r14 != 0) goto L_0x00cd
            goto L_0x011a
        L_0x00cd:
            r14 = 4
            goto L_0x011d
        L_0x00cf:
            java.lang.String r14 = "u"
            boolean r14 = r11.equals(r14)
            if (r14 != 0) goto L_0x00d9
            goto L_0x011a
        L_0x00d9:
            r14 = 3
            goto L_0x011d
        L_0x00db:
            java.lang.String r14 = "ruby"
            boolean r14 = r11.equals(r14)
            if (r14 != 0) goto L_0x00e4
            goto L_0x011a
        L_0x00e4:
            r14 = 7
            goto L_0x011d
        L_0x00e6:
            java.lang.String r14 = "lang"
            boolean r14 = r11.equals(r14)
            if (r14 != 0) goto L_0x00ef
            goto L_0x011a
        L_0x00ef:
            r14 = 6
            goto L_0x011d
        L_0x00f1:
            java.lang.String r14 = "rt"
            boolean r14 = r11.equals(r14)
            if (r14 != 0) goto L_0x00fa
            goto L_0x011a
        L_0x00fa:
            r14 = 5
            goto L_0x011d
        L_0x00fc:
            java.lang.String r14 = "i"
            boolean r14 = r11.equals(r14)
            if (r14 != 0) goto L_0x0105
            goto L_0x011a
        L_0x0105:
            r14 = 2
            goto L_0x011d
        L_0x0107:
            java.lang.String r14 = "c"
            boolean r14 = r11.equals(r14)
            if (r14 != 0) goto L_0x0110
            goto L_0x011a
        L_0x0110:
            r14 = 1
            goto L_0x011d
        L_0x0112:
            java.lang.String r14 = "b"
            boolean r14 = r11.equals(r14)
            if (r14 != 0) goto L_0x011c
        L_0x011a:
            r14 = -1
            goto L_0x011d
        L_0x011c:
            r14 = 0
        L_0x011d:
            switch(r14) {
                case 0: goto L_0x0122;
                case 1: goto L_0x0122;
                case 2: goto L_0x0122;
                case 3: goto L_0x0122;
                case 4: goto L_0x0122;
                case 5: goto L_0x0122;
                case 6: goto L_0x0122;
                case 7: goto L_0x0122;
                default: goto L_0x0120;
            }
        L_0x0120:
            r14 = 0
            goto L_0x0123
        L_0x0122:
            r14 = 1
        L_0x0123:
            if (r14 != 0) goto L_0x0128
        L_0x0125:
            r7 = r8
            goto L_0x0017
        L_0x0128:
            if (r12 == 0) goto L_0x015a
        L_0x012a:
            boolean r7 = r4.isEmpty()
            if (r7 == 0) goto L_0x0132
            goto L_0x01a2
        L_0x0132:
            java.lang.Object r7 = r4.pop()
            rb.g$b r7 = (p239rb.C6291g.C6293b) r7
            m14892a(r3, r7, r0, r5, r2)
            boolean r9 = r4.isEmpty()
            if (r9 != 0) goto L_0x014e
            rb.g$a r9 = new rb.g$a
            int r10 = r3.length()
            r9.<init>(r7, r10)
            r5.add(r9)
            goto L_0x0151
        L_0x014e:
            r5.clear()
        L_0x0151:
            java.lang.String r7 = r7.f19907a
            boolean r7 = r7.equals(r11)
            if (r7 == 0) goto L_0x012a
            goto L_0x01a2
        L_0x015a:
            if (r13 != 0) goto L_0x01a2
            int r11 = r3.length()
            java.lang.String r7 = r7.trim()
            boolean r12 = r7.isEmpty()
            r12 = r12 ^ 1
            p583jk.C17875h.m44301k(r12)
            int r10 = r7.indexOf(r10)
            r12 = -1
            if (r10 != r12) goto L_0x0175
            goto L_0x0181
        L_0x0175:
            java.lang.String r9 = r7.substring(r10)
            java.lang.String r9 = r9.trim()
            java.lang.String r7 = r7.substring(r6, r10)
        L_0x0181:
            java.lang.String r10 = "\\."
            java.lang.String[] r7 = r7.split(r10, r12)
            r10 = r7[r6]
            java.util.HashSet r12 = new java.util.HashSet
            r12.<init>()
            r13 = 1
        L_0x018f:
            int r14 = r7.length
            if (r13 >= r14) goto L_0x019a
            r14 = r7[r13]
            r12.add(r14)
            int r13 = r13 + 1
            goto L_0x018f
        L_0x019a:
            rb.g$b r7 = new rb.g$b
            r7.<init>(r10, r11, r9, r12)
            r4.push(r7)
        L_0x01a2:
            r7 = r8
            goto L_0x0225
        L_0x01a5:
            r9 = 59
            int r7 = r7 + 1
            int r9 = r1.indexOf(r9, r7)
            r14 = 32
            int r15 = r1.indexOf(r14, r7)
            r6 = -1
            if (r9 != r6) goto L_0x01b8
            r9 = r15
            goto L_0x01bf
        L_0x01b8:
            if (r15 != r6) goto L_0x01bb
            goto L_0x01bf
        L_0x01bb:
            int r9 = java.lang.Math.min(r9, r15)
        L_0x01bf:
            if (r9 == r6) goto L_0x0222
            java.lang.String r7 = r1.substring(r7, r9)
            r7.getClass()
            int r8 = r7.hashCode()
            switch(r8) {
                case 3309: goto L_0x01f1;
                case 3464: goto L_0x01e6;
                case 96708: goto L_0x01db;
                case 3374865: goto L_0x01d0;
                default: goto L_0x01cf;
            }
        L_0x01cf:
            goto L_0x01fb
        L_0x01d0:
            java.lang.String r8 = "nbsp"
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L_0x01d9
            goto L_0x01fb
        L_0x01d9:
            r6 = 3
            goto L_0x01fb
        L_0x01db:
            java.lang.String r8 = "amp"
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L_0x01e4
            goto L_0x01fb
        L_0x01e4:
            r6 = 2
            goto L_0x01fb
        L_0x01e6:
            java.lang.String r8 = "lt"
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L_0x01ef
            goto L_0x01fb
        L_0x01ef:
            r6 = 1
            goto L_0x01fb
        L_0x01f1:
            java.lang.String r8 = "gt"
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L_0x01fa
            goto L_0x01fb
        L_0x01fa:
            r6 = 0
        L_0x01fb:
            switch(r6) {
                case 0: goto L_0x0216;
                case 1: goto L_0x0212;
                case 2: goto L_0x020e;
                case 3: goto L_0x020a;
                default: goto L_0x01fe;
            }
        L_0x01fe:
            int r6 = r7.length()
            int r6 = r6 + 33
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r6)
            goto L_0x0219
        L_0x020a:
            r3.append(r14)
            goto L_0x0219
        L_0x020e:
            r3.append(r13)
            goto L_0x0219
        L_0x0212:
            r3.append(r12)
            goto L_0x0219
        L_0x0216:
            r3.append(r11)
        L_0x0219:
            if (r9 != r15) goto L_0x021e
            r3.append(r10)
        L_0x021e:
            int r9 = r9 + 1
            r7 = r9
            goto L_0x0225
        L_0x0222:
            r3.append(r8)
        L_0x0225:
            r6 = 0
            goto L_0x0017
        L_0x0228:
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L_0x0238
            java.lang.Object r1 = r4.pop()
            rb.g$b r1 = (p239rb.C6291g.C6293b) r1
            m14892a(r3, r1, r0, r5, r2)
            goto L_0x0228
        L_0x0238:
            rb.g$b r1 = new rb.g$b
            java.util.Set r4 = java.util.Collections.emptySet()
            r5 = 0
            r1.<init>(r9, r5, r9, r4)
            java.util.List r4 = java.util.Collections.emptyList()
            m14892a(r3, r1, r0, r4, r2)
            android.text.SpannedString r0 = android.text.SpannedString.valueOf(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p239rb.C6291g.m14897f(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    /* renamed from: g */
    public static void m14898g(String str, C6295d dVar) {
        int indexOf = str.indexOf(44);
        char c = 65535;
        if (indexOf != -1) {
            String substring = str.substring(indexOf + 1);
            substring.getClass();
            int i = 2;
            switch (substring.hashCode()) {
                case -1364013995:
                    if (substring.equals("center")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1074341483:
                    if (substring.equals("middle")) {
                        c = 1;
                        break;
                    }
                    break;
                case 100571:
                    if (substring.equals("end")) {
                        c = 2;
                        break;
                    }
                    break;
                case 109757538:
                    if (substring.equals("start")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                    i = 1;
                    break;
                case 2:
                    break;
                case 3:
                    i = 0;
                    break;
                default:
                    if (substring.length() != 0) {
                        "Invalid anchor value: ".concat(substring);
                    }
                    i = Integer.MIN_VALUE;
                    break;
            }
            dVar.f19919g = i;
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            dVar.f19917e = C6297i.m14901a(str);
            dVar.f19918f = 0;
            return;
        }
        dVar.f19917e = (float) Integer.parseInt(str);
        dVar.f19918f = 1;
    }
}
