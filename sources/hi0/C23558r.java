package hi0;

import androidx.recyclerview.widget.RecyclerView;
import ii0.C23610d;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import si0.C24898f;

/* renamed from: hi0.r */
public final class C23558r {

    /* renamed from: j */
    public static final char[] f59533j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    public final String f59534a;

    /* renamed from: b */
    public final String f59535b;

    /* renamed from: c */
    public final String f59536c;

    /* renamed from: d */
    public final String f59537d;

    /* renamed from: e */
    public final int f59538e;

    /* renamed from: f */
    public final List<String> f59539f;

    /* renamed from: g */
    public final List<String> f59540g;

    /* renamed from: h */
    public final String f59541h;

    /* renamed from: i */
    public final String f59542i;

    /* renamed from: hi0.r$a */
    public static final class C23559a {

        /* renamed from: a */
        public String f59543a;

        /* renamed from: b */
        public String f59544b = "";

        /* renamed from: c */
        public String f59545c = "";

        /* renamed from: d */
        public String f59546d;

        /* renamed from: e */
        public int f59547e = -1;

        /* renamed from: f */
        public final ArrayList f59548f;

        /* renamed from: g */
        public ArrayList f59549g;

        /* renamed from: h */
        public String f59550h;

        public C23559a() {
            ArrayList arrayList = new ArrayList();
            this.f59548f = arrayList;
            arrayList.add("");
        }

        /* renamed from: a */
        public final void mo58706a(String str, String str2) {
            String str3;
            if (str != null) {
                if (this.f59549g == null) {
                    this.f59549g = new ArrayList();
                }
                this.f59549g.add(C23558r.m57722b(str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true));
                ArrayList arrayList = this.f59549g;
                if (str2 != null) {
                    str3 = C23558r.m57722b(str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true);
                } else {
                    str3 = null;
                }
                arrayList.add(str3);
                return;
            }
            throw new NullPointerException("name == null");
        }

        /* renamed from: b */
        public final C23558r mo58707b() {
            if (this.f59543a == null) {
                throw new IllegalStateException("scheme == null");
            } else if (this.f59546d != null) {
                return new C23558r(this);
            } else {
                throw new IllegalStateException("host == null");
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:109:0x0225, code lost:
            if (r1 <= 65535) goto L_0x022d;
         */
        /* JADX WARNING: Removed duplicated region for block: B:104:0x01fb  */
        /* JADX WARNING: Removed duplicated region for block: B:116:0x024d  */
        /* JADX WARNING: Removed duplicated region for block: B:119:0x0268  */
        /* JADX WARNING: Removed duplicated region for block: B:132:0x02bd  */
        /* JADX WARNING: Removed duplicated region for block: B:180:0x03de  */
        /* JADX WARNING: Removed duplicated region for block: B:203:0x01f4 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:209:0x0397 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00ac  */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x0131  */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x0136  */
        /* JADX WARNING: Removed duplicated region for block: B:89:0x01d6  */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo58708c(hi0.C23558r r25, java.lang.String r26) {
            /*
                r24 = this;
                r0 = r24
                r1 = r25
                r10 = r26
                int r2 = r26.length()
                r8 = 0
                int r9 = ii0.C23610d.m57811s(r8, r2, r10)
                int r2 = r26.length()
                int r11 = ii0.C23610d.m57812t(r9, r2, r10)
                int r2 = r11 - r9
                r12 = -1
                r13 = 2
                r14 = 58
                if (r2 >= r13) goto L_0x0020
                goto L_0x0062
            L_0x0020:
                char r2 = r10.charAt(r9)
                r3 = 122(0x7a, float:1.71E-43)
                r4 = 65
                r5 = 97
                r6 = 90
                if (r2 < r5) goto L_0x0030
                if (r2 <= r3) goto L_0x0035
            L_0x0030:
                if (r2 < r4) goto L_0x0062
                if (r2 <= r6) goto L_0x0035
                goto L_0x0062
            L_0x0035:
                r2 = r9
            L_0x0036:
                int r2 = r2 + 1
                if (r2 >= r11) goto L_0x0062
                char r7 = r10.charAt(r2)
                if (r7 < r5) goto L_0x0042
                if (r7 <= r3) goto L_0x005f
            L_0x0042:
                if (r7 < r4) goto L_0x0046
                if (r7 <= r6) goto L_0x005f
            L_0x0046:
                r3 = 48
                if (r7 < r3) goto L_0x004e
                r3 = 57
                if (r7 <= r3) goto L_0x005f
            L_0x004e:
                r3 = 43
                if (r7 == r3) goto L_0x005f
                r3 = 45
                if (r7 == r3) goto L_0x005f
                r3 = 46
                if (r7 != r3) goto L_0x005b
                goto L_0x005f
            L_0x005b:
                if (r7 != r14) goto L_0x0062
                r15 = r2
                goto L_0x0064
            L_0x005f:
                r3 = 122(0x7a, float:1.71E-43)
                goto L_0x0036
            L_0x0062:
                r2 = -1
                r15 = -1
            L_0x0064:
                if (r15 == r12) goto L_0x00ac
                r3 = 1
                r6 = 0
                r7 = 6
                java.lang.String r5 = "https:"
                r2 = r26
                r4 = r9
                boolean r2 = r2.regionMatches(r3, r4, r5, r6, r7)
                if (r2 == 0) goto L_0x007b
                java.lang.String r2 = "https"
                r0.f59543a = r2
                int r9 = r9 + 6
                goto L_0x00b2
            L_0x007b:
                r3 = 1
                r6 = 0
                r7 = 5
                java.lang.String r5 = "http:"
                r2 = r26
                r4 = r9
                boolean r2 = r2.regionMatches(r3, r4, r5, r6, r7)
                if (r2 == 0) goto L_0x0090
                java.lang.String r2 = "http"
                r0.f59543a = r2
                int r9 = r9 + 5
                goto L_0x00b2
            L_0x0090:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Expected URL scheme 'http' or 'https' but was '"
                java.lang.StringBuilder r2 = p379.C13555b.m33972k(r2)
                java.lang.String r3 = r10.substring(r8, r15)
                r2.append(r3)
                java.lang.String r3 = "'"
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L_0x00ac:
                if (r1 == 0) goto L_0x03f8
                java.lang.String r2 = r1.f59534a
                r0.f59543a = r2
            L_0x00b2:
                r2 = 0
                r3 = r9
            L_0x00b4:
                r4 = 92
                r5 = 47
                if (r3 >= r11) goto L_0x00c7
                char r6 = r10.charAt(r3)
                if (r6 == r4) goto L_0x00c2
                if (r6 != r5) goto L_0x00c7
            L_0x00c2:
                int r2 = r2 + 1
                int r3 = r3 + 1
                goto L_0x00b4
            L_0x00c7:
                r3 = 63
                r6 = 35
                if (r2 >= r13) goto L_0x0122
                if (r1 == 0) goto L_0x0122
                java.lang.String r7 = r1.f59534a
                java.lang.String r8 = r0.f59543a
                boolean r7 = r7.equals(r8)
                if (r7 != 0) goto L_0x00da
                goto L_0x0122
            L_0x00da:
                java.lang.String r2 = r25.mo58702i()
                r0.f59544b = r2
                java.lang.String r2 = r25.mo58696e()
                r0.f59545c = r2
                java.lang.String r2 = r1.f59537d
                r0.f59546d = r2
                int r2 = r1.f59538e
                r0.f59547e = r2
                java.util.ArrayList r2 = r0.f59548f
                r2.clear()
                java.util.ArrayList r2 = r0.f59548f
                java.util.ArrayList r3 = r25.mo58699g()
                r2.addAll(r3)
                if (r9 == r11) goto L_0x0104
                char r2 = r10.charAt(r9)
                if (r2 != r6) goto L_0x011e
            L_0x0104:
                java.lang.String r12 = r25.mo58700h()
                if (r12 == 0) goto L_0x011b
                r14 = 1
                r15 = 0
                r16 = 1
                r17 = 1
                java.lang.String r13 = " \"'<>#"
                java.lang.String r1 = hi0.C23558r.m57722b(r12, r13, r14, r15, r16, r17)
                java.util.ArrayList r1 = hi0.C23558r.m57731q(r1)
                goto L_0x011c
            L_0x011b:
                r1 = 0
            L_0x011c:
                r0.f59549g = r1
            L_0x011e:
                r17 = r11
                goto L_0x0269
            L_0x0122:
                int r9 = r9 + r2
                r1 = 0
                r2 = 0
                r13 = r9
                r1 = -1
                r12 = 0
                r15 = 0
            L_0x0129:
                java.lang.String r2 = "@/\\?#"
                int r9 = ii0.C23610d.m57800h(r13, r11, r10, r2)
                if (r9 == r11) goto L_0x0136
                char r2 = r10.charAt(r9)
                goto L_0x0137
            L_0x0136:
                r2 = -1
            L_0x0137:
                if (r2 == r1) goto L_0x01d2
                if (r2 == r6) goto L_0x01d2
                if (r2 == r5) goto L_0x01d2
                if (r2 == r4) goto L_0x01d2
                if (r2 == r3) goto L_0x01d2
                r1 = 64
                if (r2 == r1) goto L_0x0147
                goto L_0x01c5
            L_0x0147:
                java.lang.String r8 = "%40"
                if (r12 != 0) goto L_0x0195
                int r7 = ii0.C23610d.m57801i(r10, r13, r9, r14)
                r5 = 1
                r6 = 0
                r16 = 0
                r17 = 1
                r18 = 0
                java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
                r1 = r26
                r2 = r13
                r3 = r7
                r13 = r7
                r7 = r16
                r14 = r8
                r8 = r17
                r25 = r12
                r12 = r9
                r9 = r18
                java.lang.String r1 = hi0.C23558r.m57721a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                if (r15 == 0) goto L_0x0179
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = r0.f59544b
                java.lang.String r1 = p379.C13715c.m34245k(r2, r3, r14, r1)
            L_0x0179:
                r0.f59544b = r1
                if (r13 == r12) goto L_0x0191
                int r2 = r13 + 1
                r5 = 1
                r6 = 0
                r7 = 0
                r8 = 1
                r9 = 0
                java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
                r1 = r26
                r3 = r12
                java.lang.String r1 = hi0.C23558r.m57721a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                r0.f59545c = r1
                r1 = 1
                goto L_0x0193
            L_0x0191:
                r1 = r25
            L_0x0193:
                r15 = 1
                goto L_0x01c2
            L_0x0195:
                r14 = r8
                r25 = r12
                r12 = r9
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r1 = r0.f59545c
                r9.append(r1)
                r9.append(r14)
                r5 = 1
                r6 = 0
                r7 = 0
                r8 = 1
                r14 = 0
                java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
                r1 = r26
                r2 = r13
                r3 = r12
                r13 = r9
                r9 = r14
                java.lang.String r1 = hi0.C23558r.m57721a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                r13.append(r1)
                java.lang.String r1 = r13.toString()
                r0.f59545c = r1
                r1 = r25
            L_0x01c2:
                int r13 = r12 + 1
                r12 = r1
            L_0x01c5:
                r6 = 35
                r3 = 63
                r5 = 47
                r1 = -1
                r4 = 92
                r14 = 58
                goto L_0x0129
            L_0x01d2:
                r12 = r9
                r9 = r13
            L_0x01d4:
                if (r9 >= r12) goto L_0x01f4
                char r1 = r10.charAt(r9)
                r2 = 58
                if (r1 == r2) goto L_0x01f2
                r3 = 91
                if (r1 == r3) goto L_0x01e4
                r1 = 1
                goto L_0x01f0
            L_0x01e4:
                r1 = 1
            L_0x01e5:
                int r9 = r9 + r1
                if (r9 >= r12) goto L_0x01f0
                char r3 = r10.charAt(r9)
                r4 = 93
                if (r3 != r4) goto L_0x01e5
            L_0x01f0:
                int r9 = r9 + r1
                goto L_0x01d4
            L_0x01f2:
                r14 = r9
                goto L_0x01f5
            L_0x01f4:
                r14 = r12
            L_0x01f5:
                int r15 = r14 + 1
                r9 = 34
                if (r15 >= r12) goto L_0x024d
                r1 = 0
                java.lang.String r1 = hi0.C23558r.m57728n(r10, r13, r14, r1)
                java.lang.String r1 = ii0.C23610d.m57794b(r1)
                r0.f59546d = r1
                java.lang.String r4 = ""
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 1
                r16 = 0
                r1 = r26
                r2 = r15
                r3 = r12
                r17 = r11
                r11 = 34
                r9 = r16
                java.lang.String r1 = hi0.C23558r.m57721a(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ NumberFormatException -> 0x022c }
                int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x022c }
                if (r1 <= 0) goto L_0x022c
                r2 = 65535(0xffff, float:9.1834E-41)
                if (r1 > r2) goto L_0x022c
                goto L_0x022d
            L_0x0228:
                r17 = r11
                r11 = 34
            L_0x022c:
                r1 = -1
            L_0x022d:
                r0.f59547e = r1
                r2 = -1
                if (r1 == r2) goto L_0x0233
                goto L_0x0264
            L_0x0233:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Invalid URL port: \""
                java.lang.StringBuilder r2 = p379.C13555b.m33972k(r2)
                java.lang.String r3 = r10.substring(r15, r12)
                r2.append(r3)
                r2.append(r11)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L_0x024d:
                r17 = r11
                r11 = 34
                r1 = 0
                java.lang.String r1 = hi0.C23558r.m57728n(r10, r13, r14, r1)
                java.lang.String r1 = ii0.C23610d.m57794b(r1)
                r0.f59546d = r1
                java.lang.String r1 = r0.f59543a
                int r1 = hi0.C23558r.m57724d(r1)
                r0.f59547e = r1
            L_0x0264:
                java.lang.String r1 = r0.f59546d
                if (r1 == 0) goto L_0x03de
                r9 = r12
            L_0x0269:
                java.lang.String r1 = "?#"
                r2 = r17
                int r1 = ii0.C23610d.m57800h(r9, r2, r10, r1)
                if (r9 != r1) goto L_0x027a
                r13 = r0
                r4 = r1
                r12 = r2
                r1 = r10
                r2 = r1
                goto L_0x039b
            L_0x027a:
                char r3 = r10.charAt(r9)
                java.lang.String r4 = ""
                r5 = 47
                if (r3 == r5) goto L_0x02a0
                r5 = 92
                if (r3 != r5) goto L_0x0289
                goto L_0x02a0
            L_0x0289:
                java.util.ArrayList r3 = r0.f59548f
                int r5 = r3.size()
                int r5 = r5 + -1
                r3.set(r5, r4)
                r8 = r0
                r15 = r8
                r5 = r1
                r18 = r2
                r7 = r4
                r2 = r10
                r3 = r2
                r6 = r3
                r4 = r5
                r1 = r6
                goto L_0x02ba
            L_0x02a0:
                r3 = 1
                java.util.ArrayList r5 = r0.f59548f
                r5.clear()
                java.util.ArrayList r5 = r0.f59548f
                r5.add(r4)
                r8 = r0
                r12 = r8
                r5 = r1
                r11 = r2
                r7 = r4
                r2 = r10
                r3 = r2
                r6 = 1
                r4 = r5
                r1 = r3
            L_0x02b5:
                int r9 = r9 + r6
                r6 = r10
                r18 = r11
                r15 = r12
            L_0x02ba:
                r10 = r9
            L_0x02bb:
                if (r10 >= r5) goto L_0x0397
                java.lang.String r9 = "/\\"
                int r14 = ii0.C23610d.m57800h(r10, r5, r1, r9)
                if (r14 >= r5) goto L_0x02c9
                r9 = 1
                r19 = 1
                goto L_0x02cc
            L_0x02c9:
                r9 = 0
                r19 = 0
            L_0x02cc:
                r13 = 1
                r16 = 0
                r17 = 0
                r20 = 1
                r21 = 0
                java.lang.String r12 = " \"<>^`{}|/\\?#"
                r9 = r6
                r11 = r14
                r22 = r14
                r14 = r16
                r23 = r15
                r15 = r17
                r16 = r20
                r17 = r21
                java.lang.String r9 = hi0.C23558r.m57721a(r9, r10, r11, r12, r13, r14, r15, r16, r17)
                java.lang.String r10 = "."
                boolean r10 = r9.equals(r10)
                if (r10 != 0) goto L_0x02fc
                java.lang.String r10 = "%2e"
                boolean r10 = r9.equalsIgnoreCase(r10)
                if (r10 == 0) goto L_0x02fa
                goto L_0x02fc
            L_0x02fa:
                r10 = 0
                goto L_0x02fd
            L_0x02fc:
                r10 = 1
            L_0x02fd:
                if (r10 == 0) goto L_0x0303
                r12 = r23
                goto L_0x0387
            L_0x0303:
                java.lang.String r10 = ".."
                boolean r10 = r9.equals(r10)
                if (r10 != 0) goto L_0x0326
                java.lang.String r10 = "%2e."
                boolean r10 = r9.equalsIgnoreCase(r10)
                if (r10 != 0) goto L_0x0326
                java.lang.String r10 = ".%2e"
                boolean r10 = r9.equalsIgnoreCase(r10)
                if (r10 != 0) goto L_0x0326
                java.lang.String r10 = "%2e%2e"
                boolean r10 = r9.equalsIgnoreCase(r10)
                if (r10 == 0) goto L_0x0324
                goto L_0x0326
            L_0x0324:
                r10 = 0
                goto L_0x0327
            L_0x0326:
                r10 = 1
            L_0x0327:
                if (r10 == 0) goto L_0x0359
                r12 = r23
                java.util.ArrayList r9 = r12.f59548f
                int r10 = r9.size()
                int r10 = r10 + -1
                java.lang.Object r9 = r9.remove(r10)
                java.lang.String r9 = (java.lang.String) r9
                boolean r9 = r9.isEmpty()
                if (r9 == 0) goto L_0x0353
                java.util.ArrayList r9 = r12.f59548f
                boolean r9 = r9.isEmpty()
                if (r9 != 0) goto L_0x0353
                java.util.ArrayList r9 = r12.f59548f
                int r10 = r9.size()
                int r10 = r10 + -1
                r9.set(r10, r7)
                goto L_0x0387
            L_0x0353:
                java.util.ArrayList r9 = r12.f59548f
                r9.add(r7)
                goto L_0x0387
            L_0x0359:
                r12 = r23
                java.util.ArrayList r10 = r12.f59548f
                int r11 = r10.size()
                int r11 = r11 + -1
                java.lang.Object r10 = r10.get(r11)
                java.lang.String r10 = (java.lang.String) r10
                boolean r10 = r10.isEmpty()
                if (r10 == 0) goto L_0x037b
                java.util.ArrayList r10 = r12.f59548f
                int r11 = r10.size()
                int r11 = r11 + -1
                r10.set(r11, r9)
                goto L_0x0380
            L_0x037b:
                java.util.ArrayList r10 = r12.f59548f
                r10.add(r9)
            L_0x0380:
                if (r19 == 0) goto L_0x0387
                java.util.ArrayList r9 = r12.f59548f
                r9.add(r7)
            L_0x0387:
                if (r19 == 0) goto L_0x0392
                r9 = 1
                r10 = r6
                r11 = r18
                r9 = r22
                r6 = 1
                goto L_0x02b5
            L_0x0392:
                r15 = r12
                r10 = r22
                goto L_0x02bb
            L_0x0397:
                r1 = r3
                r13 = r8
                r12 = r18
            L_0x039b:
                if (r4 >= r12) goto L_0x03c2
                char r3 = r2.charAt(r4)
                r5 = 63
                if (r3 != r5) goto L_0x03c2
                r14 = 35
                int r15 = ii0.C23610d.m57801i(r2, r4, r12, r14)
                int r4 = r4 + 1
                r7 = 1
                r8 = 0
                r9 = 1
                r10 = 1
                r11 = 0
                java.lang.String r6 = " \"'<>#"
                r3 = r1
                r5 = r15
                java.lang.String r3 = hi0.C23558r.m57721a(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                java.util.ArrayList r3 = hi0.C23558r.m57731q(r3)
                r13.f59549g = r3
                r4 = r15
                goto L_0x03c4
            L_0x03c2:
                r14 = 35
            L_0x03c4:
                if (r4 >= r12) goto L_0x03dd
                char r2 = r2.charAt(r4)
                if (r2 != r14) goto L_0x03dd
                int r4 = r4 + 1
                r7 = 1
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                java.lang.String r6 = ""
                r3 = r1
                r5 = r12
                java.lang.String r1 = hi0.C23558r.m57721a(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                r13.f59550h = r1
            L_0x03dd:
                return
            L_0x03de:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Invalid URL host: \""
                java.lang.StringBuilder r2 = p379.C13555b.m33972k(r2)
                java.lang.String r3 = r10.substring(r13, r14)
                r2.append(r3)
                r2.append(r11)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L_0x03f8:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Expected URL scheme 'http' or 'https' but no colon was found"
                r1.<init>(r2)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: hi0.C23558r.C23559a.mo58708c(hi0.r, java.lang.String):void");
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.f59543a;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (!this.f59544b.isEmpty() || !this.f59545c.isEmpty()) {
                sb.append(this.f59544b);
                if (!this.f59545c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f59545c);
                }
                sb.append('@');
            }
            String str2 = this.f59546d;
            if (str2 != null) {
                if (str2.indexOf(58) != -1) {
                    sb.append('[');
                    sb.append(this.f59546d);
                    sb.append(']');
                } else {
                    sb.append(this.f59546d);
                }
            }
            int i = this.f59547e;
            if (!(i == -1 && this.f59543a == null)) {
                if (i == -1) {
                    i = C23558r.m57724d(this.f59543a);
                }
                String str3 = this.f59543a;
                if (str3 == null || i != C23558r.m57724d(str3)) {
                    sb.append(':');
                    sb.append(i);
                }
            }
            ArrayList arrayList = this.f59548f;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                sb.append('/');
                sb.append((String) arrayList.get(i2));
            }
            if (this.f59549g != null) {
                sb.append('?');
                C23558r.m57726k(sb, this.f59549g);
            }
            if (this.f59550h != null) {
                sb.append('#');
                sb.append(this.f59550h);
            }
            return sb.toString();
        }
    }

    public C23558r(C23559a aVar) {
        List<String> list;
        this.f59534a = aVar.f59543a;
        String str = aVar.f59544b;
        this.f59535b = m57728n(str, 0, str.length(), false);
        String str2 = aVar.f59545c;
        this.f59536c = m57728n(str2, 0, str2.length(), false);
        this.f59537d = aVar.f59546d;
        int i = aVar.f59547e;
        this.f59538e = i == -1 ? m57724d(aVar.f59543a) : i;
        this.f59539f = m57729o(aVar.f59548f, false);
        ArrayList arrayList = aVar.f59549g;
        String str3 = null;
        if (arrayList != null) {
            list = m57729o(arrayList, true);
        } else {
            list = null;
        }
        this.f59540g = list;
        String str4 = aVar.f59550h;
        this.f59541h = str4 != null ? m57728n(str4, 0, str4.length(), false) : str3;
        this.f59542i = aVar.toString();
    }

    /* renamed from: a */
    public static String m57721a(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        String str3;
        String str4 = str;
        int i3 = i2;
        String str5 = str2;
        Charset charset2 = charset;
        int i4 = i;
        while (i4 < i3) {
            int codePointAt = str4.codePointAt(i4);
            int i5 = RecyclerView.C1119a0.FLAG_IGNORE;
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z4) || str5.indexOf(codePointAt) != -1 || ((codePointAt == 37 && (!z || (z2 && !m57730p(i4, i3, str4)))) || (codePointAt == 43 && z3)))) {
                C24898f fVar = new C24898f();
                fVar.mo61403b0(i, i4, str4);
                C24898f fVar2 = null;
                while (i4 < i3) {
                    int codePointAt2 = str4.codePointAt(i4);
                    if (!z || !(codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13)) {
                        if (codePointAt2 == 43 && z3) {
                            if (z) {
                                str3 = "+";
                            } else {
                                str3 = "%2B";
                            }
                            fVar.mo61404c0(str3);
                        } else if (codePointAt2 < 32 || codePointAt2 == 127 || ((codePointAt2 >= i5 && z4) || str5.indexOf(codePointAt2) != -1 || (codePointAt2 == 37 && (!z || (z2 && !m57730p(i4, i3, str4)))))) {
                            if (fVar2 == null) {
                                fVar2 = new C24898f();
                            }
                            if (charset2 == null || charset2.equals(StandardCharsets.UTF_8)) {
                                fVar2.mo61406d0(codePointAt2);
                            } else {
                                fVar2.mo61402a0(str4, i4, Character.charCount(codePointAt2) + i4, charset2);
                            }
                            while (!fVar2.mo61415l1()) {
                                byte readByte = fVar2.readByte() & 255;
                                fVar.mo61395V(37);
                                char[] cArr = f59533j;
                                fVar.mo61395V(cArr[(readByte >> 4) & 15]);
                                fVar.mo61395V(cArr[readByte & 15]);
                            }
                        } else {
                            fVar.mo61406d0(codePointAt2);
                        }
                    }
                    i4 += Character.charCount(codePointAt2);
                    i5 = RecyclerView.C1119a0.FLAG_IGNORE;
                }
                return fVar.mo61380H();
            }
            i4 += Character.charCount(codePointAt);
        }
        int i6 = i;
        return str.substring(i, i2);
    }

    /* renamed from: b */
    public static String m57722b(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return m57721a(str, 0, str.length(), str2, z, z2, z3, z4, (Charset) null);
    }

    /* renamed from: c */
    public static String m57723c(String str, boolean z, Charset charset) {
        return m57721a(str, 0, str.length(), " \"':;<=>@[]^`{}|/\\?#&!$(),~", z, false, true, true, charset);
    }

    /* renamed from: d */
    public static int m57724d(String str) {
        if (str.equals("http")) {
            return 80;
        }
        if (str.equals("https")) {
            return 443;
        }
        return -1;
    }

    /* renamed from: j */
    public static C23558r m57725j(String str) {
        C23559a aVar = new C23559a();
        aVar.mo58708c((C23558r) null, str);
        return aVar.mo58707b();
    }

    /* renamed from: k */
    public static void m57726k(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = list.get(i);
            String str2 = list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    /* renamed from: m */
    public static C23558r m57727m(String str) {
        try {
            return m57725j(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: n */
    public static String m57728n(String str, int i, int i2, boolean z) {
        int i3;
        int i4 = i;
        while (i4 < i2) {
            char charAt = str.charAt(i4);
            if (charAt == '%' || (charAt == '+' && z)) {
                C24898f fVar = new C24898f();
                fVar.mo61403b0(i, i4, str);
                while (i4 < i2) {
                    int codePointAt = str.codePointAt(i4);
                    if (codePointAt == 37 && (i3 = i4 + 2) < i2) {
                        int f = C23610d.m57798f(str.charAt(i4 + 1));
                        int f2 = C23610d.m57798f(str.charAt(i3));
                        if (!(f == -1 || f2 == -1)) {
                            fVar.mo61395V((f << 4) + f2);
                            i4 = i3;
                            i4 += Character.charCount(codePointAt);
                        }
                    } else if (codePointAt == 43 && z) {
                        fVar.mo61395V(32);
                        i4 += Character.charCount(codePointAt);
                    }
                    fVar.mo61406d0(codePointAt);
                    i4 += Character.charCount(codePointAt);
                }
                return fVar.mo61380H();
            }
            i4++;
        }
        return str.substring(i, i2);
    }

    /* renamed from: o */
    public static List m57729o(List list, boolean z) {
        String str;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str2 = (String) list.get(i);
            if (str2 != null) {
                str = m57728n(str2, 0, str2.length(), z);
            } else {
                str = null;
            }
            arrayList.add(str);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: p */
    public static boolean m57730p(int i, int i2, String str) {
        int i3 = i + 2;
        if (i3 >= i2 || str.charAt(i) != '%' || C23610d.m57798f(str.charAt(i + 1)) == -1 || C23610d.m57798f(str.charAt(i3)) == -1) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    public static ArrayList m57731q(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int indexOf = str.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i, indexOf));
                arrayList.add((Object) null);
            } else {
                arrayList.add(str.substring(i, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            }
            i = indexOf + 1;
        }
        return arrayList;
    }

    /* renamed from: e */
    public final String mo58696e() {
        if (this.f59536c.isEmpty()) {
            return "";
        }
        int indexOf = this.f59542i.indexOf(64);
        return this.f59542i.substring(this.f59542i.indexOf(58, this.f59534a.length() + 3) + 1, indexOf);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C23558r) && ((C23558r) obj).f59542i.equals(this.f59542i);
    }

    /* renamed from: f */
    public final String mo58698f() {
        int indexOf = this.f59542i.indexOf(47, this.f59534a.length() + 3);
        String str = this.f59542i;
        return this.f59542i.substring(indexOf, C23610d.m57800h(indexOf, str.length(), str, "?#"));
    }

    /* renamed from: g */
    public final ArrayList mo58699g() {
        int indexOf = this.f59542i.indexOf(47, this.f59534a.length() + 3);
        String str = this.f59542i;
        int h = C23610d.m57800h(indexOf, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < h) {
            int i = indexOf + 1;
            int i2 = C23610d.m57801i(this.f59542i, i, h, '/');
            arrayList.add(this.f59542i.substring(i, i2));
            indexOf = i2;
        }
        return arrayList;
    }

    /* renamed from: h */
    public final String mo58700h() {
        if (this.f59540g == null) {
            return null;
        }
        int indexOf = this.f59542i.indexOf(63) + 1;
        String str = this.f59542i;
        return this.f59542i.substring(indexOf, C23610d.m57801i(str, indexOf, str.length(), '#'));
    }

    public final int hashCode() {
        return this.f59542i.hashCode();
    }

    /* renamed from: i */
    public final String mo58702i() {
        if (this.f59535b.isEmpty()) {
            return "";
        }
        int length = this.f59534a.length() + 3;
        String str = this.f59542i;
        return this.f59542i.substring(length, C23610d.m57800h(length, str.length(), str, ":@"));
    }

    /* renamed from: l */
    public final C23559a mo58703l() {
        int i;
        ArrayList arrayList;
        C23559a aVar = new C23559a();
        aVar.f59543a = this.f59534a;
        aVar.f59544b = mo58702i();
        aVar.f59545c = mo58696e();
        aVar.f59546d = this.f59537d;
        if (this.f59538e != m57724d(this.f59534a)) {
            i = this.f59538e;
        } else {
            i = -1;
        }
        aVar.f59547e = i;
        aVar.f59548f.clear();
        aVar.f59548f.addAll(mo58699g());
        String h = mo58700h();
        String str = null;
        if (h != null) {
            arrayList = m57731q(m57722b(h, " \"'<>#", true, false, true, true));
        } else {
            arrayList = null;
        }
        aVar.f59549g = arrayList;
        if (this.f59541h != null) {
            str = this.f59542i.substring(this.f59542i.indexOf(35) + 1);
        }
        aVar.f59550h = str;
        return aVar;
    }

    /* renamed from: r */
    public final URI mo58704r() {
        C23559a l = mo58703l();
        int size = l.f59548f.size();
        for (int i = 0; i < size; i++) {
            l.f59548f.set(i, m57722b((String) l.f59548f.get(i), "[]", true, true, false, true));
        }
        ArrayList arrayList = l.f59549g;
        if (arrayList != null) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str = (String) l.f59549g.get(i2);
                if (str != null) {
                    l.f59549g.set(i2, m57722b(str, "\\^`{|}", true, true, true, true));
                }
            }
        }
        String str2 = l.f59550h;
        if (str2 != null) {
            l.f59550h = m57722b(str2, " \"#<>\\^`{|}", true, true, false, false);
        }
        String aVar = l.toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e) {
            try {
                return URI.create(aVar.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final String toString() {
        return this.f59542i;
    }
}
