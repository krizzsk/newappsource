package com.veriff.sdk.internal;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.veriff.sdk.internal.yl */
public final class C22738yl {

    /* renamed from: d */
    private static final char[] f57522d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    public final String f57523a;

    /* renamed from: b */
    public final String f57524b;

    /* renamed from: c */
    public final int f57525c;

    /* renamed from: e */
    private final String f57526e;

    /* renamed from: f */
    private final String f57527f;

    /* renamed from: g */
    private final List<String> f57528g;

    /* renamed from: h */
    private final List<String> f57529h;

    /* renamed from: i */
    private final String f57530i;

    /* renamed from: j */
    private final String f57531j;

    public C22738yl(C22739a aVar) {
        List<String> list;
        this.f57523a = aVar.f57532a;
        this.f57526e = m55575a(aVar.f57533b, false);
        this.f57527f = m55575a(aVar.f57534c, false);
        this.f57524b = aVar.f57535d;
        this.f57525c = aVar.mo57306a();
        this.f57528g = m55576a(aVar.f57537f, false);
        List<String> list2 = aVar.f57538g;
        String str = null;
        if (list2 != null) {
            list = m55576a(list2, true);
        } else {
            list = null;
        }
        this.f57529h = list;
        String str2 = aVar.f57539h;
        this.f57530i = str2 != null ? m55575a(str2, false) : str;
        this.f57531j = aVar.toString();
    }

    /* renamed from: a */
    public URI mo57283a() {
        String aVar = mo57304q().mo57311b().toString();
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

    /* renamed from: b */
    public String mo57284b() {
        return this.f57523a;
    }

    /* renamed from: c */
    public boolean mo57287c() {
        return this.f57523a.equals("https");
    }

    /* renamed from: d */
    public String mo57289d() {
        if (this.f57526e.isEmpty()) {
            return "";
        }
        int length = this.f57523a.length() + 3;
        String str = this.f57531j;
        return this.f57531j.substring(length, C22766za.m55818a(str, length, str.length(), ":@"));
    }

    /* renamed from: e */
    public String mo57290e() {
        if (this.f57527f.isEmpty()) {
            return "";
        }
        int indexOf = this.f57531j.indexOf(64);
        return this.f57531j.substring(this.f57531j.indexOf(58, this.f57523a.length() + 3) + 1, indexOf);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C22738yl) && ((C22738yl) obj).f57531j.equals(this.f57531j);
    }

    /* renamed from: f */
    public String mo57292f() {
        return this.f57524b;
    }

    /* renamed from: g */
    public int mo57293g() {
        return this.f57525c;
    }

    /* renamed from: h */
    public int mo57294h() {
        return this.f57528g.size();
    }

    public int hashCode() {
        return this.f57531j.hashCode();
    }

    /* renamed from: i */
    public String mo57296i() {
        int indexOf = this.f57531j.indexOf(47, this.f57523a.length() + 3);
        String str = this.f57531j;
        return this.f57531j.substring(indexOf, C22766za.m55818a(str, indexOf, str.length(), "?#"));
    }

    /* renamed from: j */
    public List<String> mo57297j() {
        int indexOf = this.f57531j.indexOf(47, this.f57523a.length() + 3);
        String str = this.f57531j;
        int a = C22766za.m55818a(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < a) {
            int i = indexOf + 1;
            int a2 = C22766za.m55817a(this.f57531j, i, a, '/');
            arrayList.add(this.f57531j.substring(i, a2));
            indexOf = a2;
        }
        return arrayList;
    }

    /* renamed from: k */
    public List<String> mo57298k() {
        return this.f57528g;
    }

    /* renamed from: l */
    public String mo57299l() {
        if (this.f57529h == null) {
            return null;
        }
        int indexOf = this.f57531j.indexOf(63) + 1;
        String str = this.f57531j;
        return this.f57531j.substring(indexOf, C22766za.m55817a(str, indexOf, str.length(), '#'));
    }

    /* renamed from: m */
    public String mo57300m() {
        if (this.f57529h == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        m55582b(sb, this.f57529h);
        return sb.toString();
    }

    /* renamed from: n */
    public int mo57301n() {
        List<String> list = this.f57529h;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    /* renamed from: o */
    public String mo57302o() {
        if (this.f57530i == null) {
            return null;
        }
        return this.f57531j.substring(this.f57531j.indexOf(35) + 1);
    }

    /* renamed from: p */
    public String mo57303p() {
        return mo57288d("/...").mo57312b("").mo57314c("").mo57315c().toString();
    }

    /* renamed from: q */
    public C22739a mo57304q() {
        int i;
        C22739a aVar = new C22739a();
        aVar.f57532a = this.f57523a;
        aVar.f57533b = mo57289d();
        aVar.f57534c = mo57290e();
        aVar.f57535d = this.f57524b;
        if (this.f57525c != m55570a(this.f57523a)) {
            i = this.f57525c;
        } else {
            i = -1;
        }
        aVar.f57536e = i;
        aVar.f57537f.clear();
        aVar.f57537f.addAll(mo57297j());
        aVar.mo57319g(mo57299l());
        aVar.f57539h = mo57302o();
        return aVar;
    }

    public String toString() {
        return this.f57531j;
    }

    /* renamed from: com.veriff.sdk.internal.yl$a */
    public static final class C22739a {

        /* renamed from: a */
        public String f57532a;

        /* renamed from: b */
        public String f57533b = "";

        /* renamed from: c */
        public String f57534c = "";

        /* renamed from: d */
        public String f57535d;

        /* renamed from: e */
        public int f57536e = -1;

        /* renamed from: f */
        public final List<String> f57537f;

        /* renamed from: g */
        public List<String> f57538g;

        /* renamed from: h */
        public String f57539h;

        public C22739a() {
            ArrayList arrayList = new ArrayList();
            this.f57537f = arrayList;
            arrayList.add("");
        }

        /* renamed from: h */
        private boolean m55614h(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        /* renamed from: i */
        private boolean m55615i(String str) {
            if (str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e")) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public C22739a mo57309a(String str) {
            if (str != null) {
                if (str.equalsIgnoreCase("http")) {
                    this.f57532a = "http";
                } else if (str.equalsIgnoreCase("https")) {
                    this.f57532a = "https";
                } else {
                    throw new IllegalArgumentException(C25541a.m63881k("unexpected scheme: ", str));
                }
                return this;
            }
            throw new NullPointerException("scheme == null");
        }

        /* renamed from: b */
        public C22739a mo57312b(String str) {
            if (str != null) {
                this.f57533b = C22738yl.m55573a(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                return this;
            }
            throw new NullPointerException("username == null");
        }

        /* renamed from: c */
        public C22739a mo57314c(String str) {
            if (str != null) {
                this.f57534c = C22738yl.m55573a(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                return this;
            }
            throw new NullPointerException("password == null");
        }

        /* renamed from: d */
        public C22739a mo57316d(String str) {
            if (str != null) {
                String e = m55612e(str, 0, str.length());
                if (e != null) {
                    this.f57535d = e;
                    return this;
                }
                throw new IllegalArgumentException(C25541a.m63881k("unexpected host: ", str));
            }
            throw new NullPointerException("host == null");
        }

        /* renamed from: e */
        public C22739a mo57317e(String str) {
            if (str == null) {
                throw new NullPointerException("encodedPath == null");
            } else if (str.startsWith("/")) {
                m55606a(str, 0, str.length());
                return this;
            } else {
                throw new IllegalArgumentException(C25541a.m63881k("unexpected encodedPath: ", str));
            }
        }

        /* renamed from: f */
        public C22739a mo57318f(String str) {
            this.f57538g = str != null ? C22738yl.m55581b(C22738yl.m55573a(str, " \"'<>#", false, false, true, true)) : null;
            return this;
        }

        /* renamed from: g */
        public C22739a mo57319g(String str) {
            List<String> list;
            if (str != null) {
                list = C22738yl.m55581b(C22738yl.m55573a(str, " \"'<>#", true, false, true, true));
            } else {
                list = null;
            }
            this.f57538g = list;
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.f57532a;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (!this.f57533b.isEmpty() || !this.f57534c.isEmpty()) {
                sb.append(this.f57533b);
                if (!this.f57534c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f57534c);
                }
                sb.append('@');
            }
            String str2 = this.f57535d;
            if (str2 != null) {
                if (str2.indexOf(58) != -1) {
                    sb.append('[');
                    sb.append(this.f57535d);
                    sb.append(']');
                } else {
                    sb.append(this.f57535d);
                }
            }
            if (!(this.f57536e == -1 && this.f57532a == null)) {
                int a = mo57306a();
                String str3 = this.f57532a;
                if (str3 == null || a != C22738yl.m55570a(str3)) {
                    sb.append(':');
                    sb.append(a);
                }
            }
            C22738yl.m55579a(sb, this.f57537f);
            if (this.f57538g != null) {
                sb.append('?');
                C22738yl.m55582b(sb, this.f57538g);
            }
            if (this.f57539h != null) {
                sb.append('#');
                sb.append(this.f57539h);
            }
            return sb.toString();
        }

        /* renamed from: f */
        private static int m55613f(String str, int i, int i2) {
            try {
                int parseInt = Integer.parseInt(C22738yl.m55571a(str, i, i2, "", false, false, false, true, (Charset) null));
                if (parseInt <= 0 || parseInt > 65535) {
                    return -1;
                }
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }

        /* renamed from: b */
        public C22739a mo57313b(String str, String str2) {
            if (str != null) {
                if (this.f57538g == null) {
                    this.f57538g = new ArrayList();
                }
                this.f57538g.add(C22738yl.m55573a(str, " \"'<>#&=", true, false, true, true));
                this.f57538g.add(str2 != null ? C22738yl.m55573a(str2, " \"'<>#&=", true, false, true, true) : null);
                return this;
            }
            throw new NullPointerException("encodedName == null");
        }

        /* renamed from: c */
        public C22738yl mo57315c() {
            if (this.f57532a == null) {
                throw new IllegalStateException("scheme == null");
            } else if (this.f57535d != null) {
                return new C22738yl(this);
            } else {
                throw new IllegalStateException("host == null");
            }
        }

        /* renamed from: c */
        private static int m55609c(String str, int i, int i2) {
            int i3 = 0;
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i3++;
                i++;
            }
            return i3;
        }

        /* renamed from: b */
        public C22739a mo57311b() {
            int size = this.f57537f.size();
            for (int i = 0; i < size; i++) {
                this.f57537f.set(i, C22738yl.m55573a(this.f57537f.get(i), "[]", true, true, false, true));
            }
            List<String> list = this.f57538g;
            if (list != null) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str = this.f57538g.get(i2);
                    if (str != null) {
                        this.f57538g.set(i2, C22738yl.m55573a(str, "\\^`{|}", true, true, true, true));
                    }
                }
            }
            String str2 = this.f57539h;
            if (str2 != null) {
                this.f57539h = C22738yl.m55573a(str2, " \"#<>\\^`{|}", true, true, false, false);
            }
            return this;
        }

        /* renamed from: d */
        private void m55611d() {
            List<String> list = this.f57537f;
            if (!list.remove(list.size() - 1).isEmpty() || this.f57537f.isEmpty()) {
                this.f57537f.add("");
                return;
            }
            List<String> list2 = this.f57537f;
            list2.set(list2.size() - 1, "");
        }

        /* renamed from: e */
        private static String m55612e(String str, int i, int i2) {
            return C22766za.m55822a(C22738yl.m55572a(str, i, i2, false));
        }

        /* renamed from: a */
        public C22739a mo57307a(int i) {
            if (i <= 0 || i > 65535) {
                throw new IllegalArgumentException(C16759e.m42349e("unexpected port: ", i));
            }
            this.f57536e = i;
            return this;
        }

        /* renamed from: d */
        private static int m55610d(String str, int i, int i2) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt == ':') {
                    return i;
                }
                if (charAt == '[') {
                    do {
                        i++;
                        if (i >= i2) {
                            break;
                        }
                    } while (str.charAt(i) == ']');
                }
                i++;
            }
            return i2;
        }

        /* renamed from: a */
        public int mo57306a() {
            int i = this.f57536e;
            return i != -1 ? i : C22738yl.m55570a(this.f57532a);
        }

        /* renamed from: b */
        private static int m55608b(String str, int i, int i2) {
            if (i2 - i < 2) {
                return -1;
            }
            char charAt = str.charAt(i);
            if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                while (true) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                    char charAt2 = str.charAt(i);
                    if ((charAt2 < 'a' || charAt2 > 'z') && ((charAt2 < 'A' || charAt2 > 'Z') && !((charAt2 >= '0' && charAt2 <= '9') || charAt2 == '+' || charAt2 == '-' || charAt2 == '.'))) {
                        if (charAt2 == ':') {
                            return i;
                        }
                    }
                }
            }
            return -1;
        }

        /* renamed from: a */
        public C22739a mo57310a(String str, String str2) {
            if (str != null) {
                if (this.f57538g == null) {
                    this.f57538g = new ArrayList();
                }
                this.f57538g.add(C22738yl.m55573a(str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true));
                this.f57538g.add(str2 != null ? C22738yl.m55573a(str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true) : null);
                return this;
            }
            throw new NullPointerException("name == null");
        }

        /* renamed from: a */
        public C22739a mo57308a(C22738yl ylVar, String str) {
            int a;
            C22738yl ylVar2 = ylVar;
            String str2 = str;
            int a2 = C22766za.m55816a(str2, 0, str.length());
            int b = C22766za.m55844b(str2, a2, str.length());
            int b2 = m55608b(str2, a2, b);
            char c = 65535;
            if (b2 != -1) {
                if (str.regionMatches(true, a2, "https:", 0, 6)) {
                    this.f57532a = "https";
                    a2 += 6;
                } else if (str.regionMatches(true, a2, "http:", 0, 5)) {
                    this.f57532a = "http";
                    a2 += 5;
                } else {
                    StringBuilder k = C13555b.m33972k("Expected URL scheme 'http' or 'https' but was '");
                    k.append(str2.substring(0, b2));
                    k.append("'");
                    throw new IllegalArgumentException(k.toString());
                }
            } else if (ylVar2 != null) {
                this.f57532a = ylVar2.f57523a;
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int c2 = m55609c(str2, a2, b);
            char c3 = '?';
            char c4 = '#';
            if (c2 >= 2 || ylVar2 == null || !ylVar2.f57523a.equals(this.f57532a)) {
                int i = a2 + c2;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    a = C22766za.m55818a(str2, i, b, "@/\\?#");
                    char charAt = a != b ? str2.charAt(a) : 65535;
                    if (charAt == c || charAt == c4 || charAt == '/' || charAt == '\\' || charAt == c3) {
                        int d = m55610d(str2, i, a);
                        int i2 = d + 1;
                    } else {
                        if (charAt == '@') {
                            if (!z) {
                                int a3 = C22766za.m55817a(str2, i, a, ':');
                                int i3 = a3;
                                boolean z3 = z;
                                String str3 = "%40";
                                String a4 = C22738yl.m55571a(str, i, a3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, (Charset) null);
                                if (z2) {
                                    a4 = C13715c.m34245k(new StringBuilder(), this.f57533b, str3, a4);
                                }
                                this.f57533b = a4;
                                if (i3 != a) {
                                    this.f57534c = C22738yl.m55571a(str, i3 + 1, a, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, (Charset) null);
                                    z = true;
                                } else {
                                    z = z3;
                                }
                                z2 = true;
                            } else {
                                this.f57534c += "%40" + C22738yl.m55571a(str, i, a, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, (Charset) null);
                                z = z;
                            }
                            i = a + 1;
                        }
                        c3 = '?';
                        c4 = '#';
                        c = 65535;
                    }
                }
                int d2 = m55610d(str2, i, a);
                int i22 = d2 + 1;
                if (i22 < a) {
                    this.f57535d = m55612e(str2, i, d2);
                    int f = m55613f(str2, i22, a);
                    this.f57536e = f;
                    if (f == -1) {
                        StringBuilder k2 = C13555b.m33972k("Invalid URL port: \"");
                        k2.append(str2.substring(i22, a));
                        k2.append('\"');
                        throw new IllegalArgumentException(k2.toString());
                    }
                } else {
                    this.f57535d = m55612e(str2, i, d2);
                    this.f57536e = C22738yl.m55570a(this.f57532a);
                }
                if (this.f57535d != null) {
                    a2 = a;
                } else {
                    StringBuilder k3 = C13555b.m33972k("Invalid URL host: \"");
                    k3.append(str2.substring(i, d2));
                    k3.append('\"');
                    throw new IllegalArgumentException(k3.toString());
                }
            } else {
                this.f57533b = ylVar.mo57289d();
                this.f57534c = ylVar.mo57290e();
                this.f57535d = ylVar2.f57524b;
                this.f57536e = ylVar2.f57525c;
                this.f57537f.clear();
                this.f57537f.addAll(ylVar.mo57297j());
                if (a2 == b || str2.charAt(a2) == '#') {
                    mo57319g(ylVar.mo57299l());
                }
            }
            int a5 = C22766za.m55818a(str2, a2, b, "?#");
            m55606a(str2, a2, a5);
            if (a5 < b && str2.charAt(a5) == '?') {
                int a6 = C22766za.m55817a(str2, a5, b, '#');
                this.f57538g = C22738yl.m55581b(C22738yl.m55571a(str, a5 + 1, a6, " \"'<>#", true, false, true, true, (Charset) null));
                a5 = a6;
            }
            if (a5 < b && str2.charAt(a5) == '#') {
                this.f57539h = C22738yl.m55571a(str, a5 + 1, b, "", true, false, false, false, (Charset) null);
            }
            return this;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0044 A[SYNTHETIC] */
        /* renamed from: a */
        private void m55606a(java.lang.String r11, int r12, int r13) {
            /*
                r10 = this;
                if (r12 != r13) goto L_0x0003
                return
            L_0x0003:
                char r0 = r11.charAt(r12)
                r1 = 47
                java.lang.String r2 = ""
                r3 = 1
                if (r0 == r1) goto L_0x001e
                r1 = 92
                if (r0 != r1) goto L_0x0013
                goto L_0x001e
            L_0x0013:
                java.util.List<java.lang.String> r0 = r10.f57537f
                int r1 = r0.size()
                int r1 = r1 - r3
                r0.set(r1, r2)
                goto L_0x0029
            L_0x001e:
                java.util.List<java.lang.String> r0 = r10.f57537f
                r0.clear()
                java.util.List<java.lang.String> r0 = r10.f57537f
                r0.add(r2)
                goto L_0x0041
            L_0x0029:
                r6 = r12
                if (r6 >= r13) goto L_0x0044
                java.lang.String r12 = "/\\"
                int r12 = com.veriff.sdk.internal.C22766za.m55818a((java.lang.String) r11, (int) r6, (int) r13, (java.lang.String) r12)
                if (r12 >= r13) goto L_0x0036
                r0 = 1
                goto L_0x0037
            L_0x0036:
                r0 = 0
            L_0x0037:
                r9 = 1
                r4 = r10
                r5 = r11
                r7 = r12
                r8 = r0
                r4.m55607a(r5, r6, r7, r8, r9)
                if (r0 == 0) goto L_0x0029
            L_0x0041:
                int r12 = r12 + 1
                goto L_0x0029
            L_0x0044:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22738yl.C22739a.m55606a(java.lang.String, int, int):void");
        }

        /* renamed from: a */
        private void m55607a(String str, int i, int i2, boolean z, boolean z2) {
            String a = C22738yl.m55571a(str, i, i2, " \"<>^`{}|/\\?#", z2, false, false, true, (Charset) null);
            if (!m55614h(a)) {
                if (m55615i(a)) {
                    m55611d();
                    return;
                }
                List<String> list = this.f57537f;
                if (list.get(list.size() - 1).isEmpty()) {
                    List<String> list2 = this.f57537f;
                    list2.set(list2.size() - 1, a);
                } else {
                    this.f57537f.add(a);
                }
                if (z) {
                    this.f57537f.add("");
                }
            }
        }
    }

    /* renamed from: b */
    public static void m55582b(StringBuilder sb, List<String> list) {
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

    /* renamed from: f */
    public static C22738yl m55584f(String str) {
        return new C22739a().mo57308a((C22738yl) null, str).mo57315c();
    }

    /* renamed from: c */
    public C22738yl mo57286c(String str) {
        C22739a d = mo57288d(str);
        if (d != null) {
            return d.mo57315c();
        }
        return null;
    }

    /* renamed from: e */
    public static C22738yl m55583e(String str) {
        try {
            return m55584f(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public C22739a mo57288d(String str) {
        try {
            return new C22739a().mo57308a(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static int m55570a(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* renamed from: a */
    public static void m55579a(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append(list.get(i));
        }
    }

    /* renamed from: b */
    public static List<String> m55581b(String str) {
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

    /* renamed from: a */
    public String mo57282a(int i) {
        List<String> list = this.f57529h;
        if (list != null) {
            return list.get(i * 2);
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: a */
    public static String m55575a(String str, boolean z) {
        return m55572a(str, 0, str.length(), z);
    }

    /* renamed from: a */
    private List<String> m55576a(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = list.get(i);
            arrayList.add(str != null ? m55575a(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: b */
    public String mo57285b(int i) {
        List<String> list = this.f57529h;
        if (list != null) {
            return list.get((i * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: a */
    public static String m55572a(String str, int i, int i2, boolean z) {
        for (int i3 = i; i3 < i2; i3++) {
            char charAt = str.charAt(i3);
            if (charAt == '%' || (charAt == '+' && z)) {
                abi abi = new abi();
                abi.mo53871b(str, i, i3);
                m55578a(abi, str, i3, i2, z);
                return abi.mo53914r();
            }
        }
        return str.substring(i, i2);
    }

    /* renamed from: a */
    public static void m55578a(abi abi, String str, int i, int i2, boolean z) {
        int i3;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt == 37 && (i3 = i + 2) < i2) {
                int a = C22766za.m55815a(str.charAt(i + 1));
                int a2 = C22766za.m55815a(str.charAt(i3));
                if (!(a == -1 || a2 == -1)) {
                    abi.mo53899i((a << 4) + a2);
                    i = i3;
                    i += Character.charCount(codePointAt);
                }
            } else if (codePointAt == 43 && z) {
                abi.mo53899i(32);
                i += Character.charCount(codePointAt);
            }
            abi.mo53851a(codePointAt);
            i += Character.charCount(codePointAt);
        }
    }

    /* renamed from: a */
    public static boolean m55580a(String str, int i, int i2) {
        int i3 = i + 2;
        if (i3 >= i2 || str.charAt(i) != '%' || C22766za.m55815a(str.charAt(i + 1)) == -1 || C22766za.m55815a(str.charAt(i3)) == -1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static String m55571a(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        String str3 = str;
        int i3 = i2;
        int i4 = i;
        while (i4 < i3) {
            int codePointAt = str.codePointAt(i4);
            if (codePointAt < 32 || codePointAt == 127 || (codePointAt >= 128 && z4)) {
                String str4 = str2;
            } else {
                String str5 = str2;
                if (str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || (z && (!z2 || m55580a(str, i4, i2)))) && (codePointAt != 43 || !z3))) {
                    i4 += Character.charCount(codePointAt);
                }
            }
            abi abi = new abi();
            int i5 = i;
            abi.mo53871b(str, i, i4);
            m55577a(abi, str, i4, i2, str2, z, z2, z3, z4, charset);
            return abi.mo53914r();
        }
        int i6 = i;
        return str.substring(i, i2);
    }

    /* renamed from: a */
    public static void m55577a(abi abi, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        abi abi2 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || !(codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13)) {
                if (codePointAt == 43 && z3) {
                    abi.mo53870b(z ? "+" : "%2B");
                } else if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z4) || str2.indexOf(codePointAt) != -1 || (codePointAt == 37 && (!z || (z2 && !m55580a(str, i, i2)))))) {
                    if (abi2 == null) {
                        abi2 = new abi();
                    }
                    if (charset == null || charset.equals(StandardCharsets.UTF_8)) {
                        abi2.mo53851a(codePointAt);
                    } else {
                        abi2.mo53856a(str, i, Character.charCount(codePointAt) + i, charset);
                    }
                    while (!abi2.mo53890f()) {
                        byte j = abi2.mo53902j() & 255;
                        abi.mo53899i(37);
                        char[] cArr = f57522d;
                        abi.mo53899i((int) cArr[(j >> 4) & 15]);
                        abi.mo53899i((int) cArr[j & 15]);
                    }
                } else {
                    abi.mo53851a(codePointAt);
                }
            }
            i += Character.charCount(codePointAt);
        }
    }

    /* renamed from: a */
    public static String m55574a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        return m55571a(str, 0, str.length(), str2, z, z2, z3, z4, charset);
    }

    /* renamed from: a */
    public static String m55573a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return m55571a(str, 0, str.length(), str2, z, z2, z3, z4, (Charset) null);
    }
}
