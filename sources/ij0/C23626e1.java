package ij0;

import java.util.ArrayList;
import java.util.Iterator;
import kj0.C23810e;
import org.simpleframework.xml.util.ConcurrentCache;
import p258t4.C6587a;
import p358af.C13437d;

/* renamed from: ij0.e1 */
public final class C23626e1 implements C23647l0 {

    /* renamed from: b */
    public ConcurrentCache f59712b = new ConcurrentCache();

    /* renamed from: c */
    public ConcurrentCache f59713c = new ConcurrentCache();

    /* renamed from: d */
    public ArrayList f59714d = new ArrayList();

    /* renamed from: e */
    public ArrayList f59715e = new ArrayList();

    /* renamed from: f */
    public ArrayList f59716f = new ArrayList();

    /* renamed from: g */
    public StringBuilder f59717g = new StringBuilder();

    /* renamed from: h */
    public String f59718h;

    /* renamed from: i */
    public String f59719i;

    /* renamed from: j */
    public String f59720j;

    /* renamed from: k */
    public C6587a f59721k;

    /* renamed from: l */
    public C23810e f59722l;

    /* renamed from: m */
    public boolean f59723m;

    /* renamed from: n */
    public char[] f59724n;

    /* renamed from: o */
    public int f59725o;

    /* renamed from: p */
    public int f59726p;

    /* renamed from: q */
    public int f59727q;

    /* JADX WARNING: Removed duplicated region for block: B:122:0x00c4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0134 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01ad A[LOOP:2: B:46:0x010e->B:79:0x01ad, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C23626e1(java.lang.String r13, p069e3.C4544g r14, lj0.C24330g r15) throws java.lang.Exception {
        /*
            r12 = this;
            r12.<init>()
            org.simpleframework.xml.util.ConcurrentCache r0 = new org.simpleframework.xml.util.ConcurrentCache
            r0.<init>()
            r12.f59712b = r0
            org.simpleframework.xml.util.ConcurrentCache r0 = new org.simpleframework.xml.util.ConcurrentCache
            r0.<init>()
            r12.f59713c = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r12.f59714d = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r12.f59715e = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r12.f59716f = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r12.f59717g = r0
            t4.a r15 = r15.f61633b
            r12.f59721k = r15
            r12.f59722l = r14
            r12.f59720j = r13
            r14 = 0
            if (r13 == 0) goto L_0x0045
            int r15 = r13.length()
            r12.f59725o = r15
            char[] r0 = new char[r15]
            r12.f59724n = r0
            r13.getChars(r14, r15, r0, r14)
        L_0x0045:
            char[] r13 = r12.f59724n
            int r15 = r12.f59727q
            char r0 = r13[r15]
            r1 = 2
            r2 = 47
            r3 = 1
            if (r0 == r2) goto L_0x0292
            r4 = 46
            if (r0 != r4) goto L_0x0079
            int r0 = r13.length
            if (r0 <= r3) goto L_0x0072
            int r15 = r15 + r3
            char r13 = r13[r15]
            if (r13 != r2) goto L_0x0060
            r12.f59727q = r15
            goto L_0x0072
        L_0x0060:
            org.simpleframework.xml.core.PathException r13 = new org.simpleframework.xml.core.PathException
            java.lang.Object[] r15 = new java.lang.Object[r1]
            java.lang.String r0 = r12.f59720j
            r15[r14] = r0
            kj0.e r14 = r12.f59722l
            r15[r3] = r14
            java.lang.String r14 = "Path '%s' in %s has an illegal syntax"
            r13.<init>(r14, r15)
            throw r13
        L_0x0072:
            int r13 = r12.f59727q
            int r13 = r13 + r3
            r12.f59727q = r13
            r12.f59726p = r13
        L_0x0079:
            int r13 = r12.f59727q
            int r15 = r12.f59725o
            r0 = 64
            r4 = 93
            r5 = 91
            r6 = 58
            if (r13 >= r15) goto L_0x0218
            boolean r15 = r12.f59723m
            if (r15 != 0) goto L_0x0206
            char[] r15 = r12.f59724n
            char r15 = r15[r13]
            if (r15 == r2) goto L_0x01f4
            r7 = 3
            r8 = 0
            r9 = 45
            r10 = 95
            if (r15 != r0) goto L_0x010d
            int r13 = r13 + 1
            r12.f59727q = r13
        L_0x009d:
            int r15 = r12.f59727q
            int r0 = r12.f59725o
            if (r15 >= r0) goto L_0x00dc
            char[] r0 = r12.f59724n
            int r4 = r15 + 1
            r12.f59727q = r4
            char r15 = r0[r15]
            boolean r0 = java.lang.Character.isLetterOrDigit(r15)
            if (r0 != 0) goto L_0x00c0
            if (r15 == r10) goto L_0x00ba
            if (r15 == r9) goto L_0x00ba
            if (r15 != r6) goto L_0x00b8
            goto L_0x00ba
        L_0x00b8:
            r0 = 0
            goto L_0x00bb
        L_0x00ba:
            r0 = 1
        L_0x00bb:
            if (r0 == 0) goto L_0x00be
            goto L_0x00c0
        L_0x00be:
            r0 = 0
            goto L_0x00c1
        L_0x00c0:
            r0 = 1
        L_0x00c1:
            if (r0 == 0) goto L_0x00c4
            goto L_0x009d
        L_0x00c4:
            org.simpleframework.xml.core.PathException r13 = new org.simpleframework.xml.core.PathException
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Character r15 = java.lang.Character.valueOf(r15)
            r0[r14] = r15
            java.lang.String r14 = r12.f59720j
            r0[r3] = r14
            kj0.e r14 = r12.f59722l
            r0[r1] = r14
            java.lang.String r14 = "Illegal character '%s' in attribute for '%s' in %s"
            r13.<init>(r14, r0)
            throw r13
        L_0x00dc:
            if (r15 <= r13) goto L_0x00fb
            r12.f59723m = r3
            int r15 = r15 - r13
            java.lang.String r0 = new java.lang.String
            char[] r4 = r12.f59724n
            r0.<init>(r4, r13, r15)
            if (r15 <= 0) goto L_0x01db
            t4.a r13 = r12.f59721k
            r13.getClass()
            java.util.ArrayList r13 = r12.f59715e
            r13.add(r8)
            java.util.ArrayList r13 = r12.f59716f
            r13.add(r0)
            goto L_0x01db
        L_0x00fb:
            org.simpleframework.xml.core.PathException r13 = new org.simpleframework.xml.core.PathException
            java.lang.Object[] r15 = new java.lang.Object[r1]
            java.lang.String r0 = r12.f59720j
            r15[r14] = r0
            kj0.e r14 = r12.f59722l
            r15[r3] = r14
            java.lang.String r14 = "Attribute reference in '%s' for %s is empty"
            r13.<init>(r14, r15)
            throw r13
        L_0x010d:
            r15 = 0
        L_0x010e:
            int r7 = r12.f59727q
            int r8 = r12.f59725o
            if (r7 >= r8) goto L_0x01b1
            char[] r8 = r12.f59724n
            int r11 = r7 + 1
            r12.f59727q = r11
            char r7 = r8[r7]
            boolean r8 = java.lang.Character.isLetterOrDigit(r7)
            if (r8 != 0) goto L_0x0131
            if (r7 == r10) goto L_0x012b
            if (r7 == r9) goto L_0x012b
            if (r7 != r6) goto L_0x0129
            goto L_0x012b
        L_0x0129:
            r8 = 0
            goto L_0x012c
        L_0x012b:
            r8 = 1
        L_0x012c:
            if (r8 == 0) goto L_0x012f
            goto L_0x0131
        L_0x012f:
            r8 = 0
            goto L_0x0132
        L_0x0131:
            r8 = 1
        L_0x0132:
            if (r8 != 0) goto L_0x01ad
            if (r7 != r0) goto L_0x013d
            int r0 = r12.f59727q
            int r0 = r0 - r3
            r12.f59727q = r0
            goto L_0x01b1
        L_0x013d:
            if (r7 != r5) goto L_0x0191
            char[] r0 = r12.f59724n
            int r7 = r12.f59727q
            int r7 = r7 - r3
            char r0 = r0[r7]
            if (r0 != r5) goto L_0x0167
            r0 = 0
        L_0x0149:
            int r5 = r12.f59727q
            int r7 = r12.f59725o
            if (r5 >= r7) goto L_0x0168
            char[] r7 = r12.f59724n
            int r8 = r5 + 1
            r12.f59727q = r8
            char r5 = r7[r5]
            boolean r7 = java.lang.Character.isDigit(r5)
            if (r7 != 0) goto L_0x015e
            goto L_0x0168
        L_0x015e:
            r7 = 10
            r8 = -48
            int r0 = p379.C16530d.m42021o(r0, r7, r5, r8)
            goto L_0x0149
        L_0x0167:
            r0 = 0
        L_0x0168:
            char[] r5 = r12.f59724n
            int r7 = r12.f59727q
            int r8 = r7 + 1
            r12.f59727q = r8
            int r7 = r7 - r3
            char r5 = r5[r7]
            if (r5 != r4) goto L_0x017f
            java.util.ArrayList r4 = r12.f59714d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.add(r0)
            goto L_0x01b1
        L_0x017f:
            org.simpleframework.xml.core.PathException r13 = new org.simpleframework.xml.core.PathException
            java.lang.Object[] r15 = new java.lang.Object[r1]
            java.lang.String r0 = r12.f59720j
            r15[r14] = r0
            kj0.e r14 = r12.f59722l
            r15[r3] = r14
            java.lang.String r14 = "Invalid index for path '%s' in %s"
            r13.<init>(r14, r15)
            throw r13
        L_0x0191:
            if (r7 != r2) goto L_0x0194
            goto L_0x01b1
        L_0x0194:
            org.simpleframework.xml.core.PathException r13 = new org.simpleframework.xml.core.PathException
            r15 = 3
            java.lang.Object[] r15 = new java.lang.Object[r15]
            java.lang.Character r0 = java.lang.Character.valueOf(r7)
            r15[r14] = r0
            java.lang.String r14 = r12.f59720j
            r15[r3] = r14
            kj0.e r14 = r12.f59722l
            r15[r1] = r14
            java.lang.String r14 = "Illegal character '%s' in element for '%s' in %s"
            r13.<init>(r14, r15)
            throw r13
        L_0x01ad:
            int r15 = r15 + 1
            goto L_0x010e
        L_0x01b1:
            java.lang.String r0 = new java.lang.String
            char[] r4 = r12.f59724n
            r0.<init>(r4, r13, r15)
            if (r15 <= 0) goto L_0x01db
            int r13 = r0.indexOf(r6)
            if (r13 <= 0) goto L_0x01cb
            java.lang.String r15 = r0.substring(r14, r13)
            int r13 = r13 + 1
            java.lang.String r0 = r0.substring(r13)
            goto L_0x01cc
        L_0x01cb:
            r15 = 0
        L_0x01cc:
            t4.a r13 = r12.f59721k
            r13.getClass()
            java.util.ArrayList r13 = r12.f59715e
            r13.add(r15)
            java.util.ArrayList r13 = r12.f59716f
            r13.add(r0)
        L_0x01db:
            java.util.ArrayList r13 = r12.f59716f
            int r13 = r13.size()
            java.util.ArrayList r15 = r12.f59714d
            int r15 = r15.size()
            if (r13 <= r15) goto L_0x0079
            java.util.ArrayList r13 = r12.f59714d
            java.lang.Integer r15 = java.lang.Integer.valueOf(r3)
            r13.add(r15)
            goto L_0x0079
        L_0x01f4:
            org.simpleframework.xml.core.PathException r13 = new org.simpleframework.xml.core.PathException
            java.lang.Object[] r15 = new java.lang.Object[r1]
            java.lang.String r0 = r12.f59720j
            r15[r14] = r0
            kj0.e r14 = r12.f59722l
            r15[r3] = r14
            java.lang.String r14 = "Invalid path expression '%s' in %s"
            r13.<init>(r14, r15)
            throw r13
        L_0x0206:
            org.simpleframework.xml.core.PathException r13 = new org.simpleframework.xml.core.PathException
            java.lang.Object[] r15 = new java.lang.Object[r1]
            java.lang.String r0 = r12.f59720j
            r15[r14] = r0
            kj0.e r14 = r12.f59722l
            r15[r3] = r14
            java.lang.String r14 = "Path '%s' in %s references an invalid attribute"
            r13.<init>(r14, r15)
            throw r13
        L_0x0218:
            int r13 = r13 + -1
            char[] r15 = r12.f59724n
            int r1 = r15.length
            if (r13 < r1) goto L_0x0222
            r12.f59727q = r13
            goto L_0x0228
        L_0x0222:
            char r15 = r15[r13]
            if (r15 != r2) goto L_0x0228
            r12.f59727q = r13
        L_0x0228:
            java.util.ArrayList r13 = r12.f59716f
            int r13 = r13.size()
            int r15 = r13 + -1
        L_0x0230:
            if (r14 >= r13) goto L_0x0289
            java.util.ArrayList r1 = r12.f59715e
            java.lang.Object r1 = r1.get(r14)
            java.lang.String r1 = (java.lang.String) r1
            java.util.ArrayList r3 = r12.f59716f
            java.lang.Object r3 = r3.get(r14)
            java.lang.String r3 = (java.lang.String) r3
            java.util.ArrayList r7 = r12.f59714d
            java.lang.Object r7 = r7.get(r14)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r14 <= 0) goto L_0x0255
            java.lang.StringBuilder r8 = r12.f59717g
            r8.append(r2)
        L_0x0255:
            boolean r8 = r12.f59723m
            if (r8 == 0) goto L_0x0266
            if (r14 != r15) goto L_0x0266
            java.lang.StringBuilder r1 = r12.f59717g
            r1.append(r0)
            java.lang.StringBuilder r1 = r12.f59717g
            r1.append(r3)
            goto L_0x0286
        L_0x0266:
            if (r1 == 0) goto L_0x0272
            java.lang.StringBuilder r8 = r12.f59717g
            r8.append(r1)
            java.lang.StringBuilder r1 = r12.f59717g
            r1.append(r6)
        L_0x0272:
            java.lang.StringBuilder r1 = r12.f59717g
            r1.append(r3)
            java.lang.StringBuilder r1 = r12.f59717g
            r1.append(r5)
            java.lang.StringBuilder r1 = r12.f59717g
            r1.append(r7)
            java.lang.StringBuilder r1 = r12.f59717g
            r1.append(r4)
        L_0x0286:
            int r14 = r14 + 1
            goto L_0x0230
        L_0x0289:
            java.lang.StringBuilder r13 = r12.f59717g
            java.lang.String r13 = r13.toString()
            r12.f59718h = r13
            return
        L_0x0292:
            org.simpleframework.xml.core.PathException r13 = new org.simpleframework.xml.core.PathException
            java.lang.Object[] r15 = new java.lang.Object[r1]
            java.lang.String r0 = r12.f59720j
            r15[r14] = r0
            kj0.e r14 = r12.f59722l
            r15[r3] = r14
            java.lang.String r14 = "Path '%s' in %s references document root"
            r13.<init>(r14, r15)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ij0.C23626e1.<init>(java.lang.String, e3.g, lj0.g):void");
    }

    /* renamed from: d */
    public static boolean m57888d(String str) {
        return str == null || str.length() == 0;
    }

    /* renamed from: A0 */
    public final boolean mo58785A0() {
        return this.f59716f.size() > 1;
    }

    /* renamed from: a */
    public final String mo58786a(String str, String str2) {
        this.f59721k.getClass();
        if (m57888d(str)) {
            return str2;
        }
        return C13437d.m33706k(str, "/@", str2);
    }

    /* renamed from: b */
    public final String mo58787b(String str, String str2) {
        this.f59721k.getClass();
        if (m57888d(str2)) {
            return str;
        }
        if (m57888d(str)) {
            return str2;
        }
        return C25541a.m63882l(str, "/", str2, "[1]");
    }

    /* renamed from: b2 */
    public final C23627a mo58788b2(int i, int i2) {
        int size = (this.f59716f.size() - 1) - i2;
        if (size >= i) {
            return new C23627a(i, size);
        }
        return new C23627a(i, i);
    }

    public final String getAttribute(String str) {
        if (!m57888d(this.f59718h)) {
            String str2 = (String) this.f59712b.get(str);
            if (str2 == null && (str2 = mo58786a(this.f59718h, str)) != null) {
                this.f59712b.put(str, str2);
            }
            return str2;
        }
        this.f59721k.getClass();
        return str;
    }

    public final String getFirst() {
        return (String) this.f59716f.get(0);
    }

    public final int getIndex() {
        return ((Integer) this.f59714d.get(0)).intValue();
    }

    public final String getLast() {
        return (String) this.f59716f.get(this.f59716f.size() - 1);
    }

    public final String getPrefix() {
        return (String) this.f59715e.get(0);
    }

    public final boolean isEmpty() {
        return m57888d(this.f59718h);
    }

    public final Iterator<String> iterator() {
        return this.f59716f.iterator();
    }

    /* renamed from: j1 */
    public final String mo58796j1(String str) {
        if (!m57888d(this.f59718h)) {
            String str2 = (String) this.f59713c.get(str);
            if (str2 == null && (str2 = mo58787b(this.f59718h, str)) != null) {
                this.f59713c.put(str, str2);
            }
            return str2;
        }
        this.f59721k.getClass();
        return str;
    }

    /* renamed from: q */
    public final String m57895q() {
        return this.f59718h;
    }

    /* renamed from: t */
    public final boolean mo58798t() {
        return this.f59723m;
    }

    public final String toString() {
        int i = this.f59727q;
        int i2 = this.f59726p;
        int i3 = i - i2;
        if (this.f59719i == null) {
            this.f59719i = new String(this.f59724n, i2, i3);
        }
        return this.f59719i;
    }

    /* renamed from: q */
    public final C23627a mo58797q() {
        return mo58788b2(1, 0);
    }

    /* renamed from: ij0.e1$a */
    public class C23627a implements C23647l0 {

        /* renamed from: b */
        public ArrayList f59728b = new ArrayList();

        /* renamed from: c */
        public String f59729c;

        /* renamed from: d */
        public String f59730d;

        /* renamed from: e */
        public int f59731e;

        /* renamed from: f */
        public int f59732f;

        public C23627a(int i, int i2) {
            this.f59731e = i;
            this.f59732f = i2;
        }

        /* renamed from: A0 */
        public final boolean mo58785A0() {
            return this.f59732f - this.f59731e >= 1;
        }

        /* renamed from: b2 */
        public final C23627a mo58788b2(int i, int i2) {
            return new C23627a(this.f59731e + i, this.f59732f - i2);
        }

        public final String getAttribute(String str) {
            String q = mo58797q();
            if (q != null) {
                return C23626e1.this.mo58786a(q, str);
            }
            return str;
        }

        public final String getFirst() {
            return (String) C23626e1.this.f59716f.get(this.f59731e);
        }

        public final int getIndex() {
            return ((Integer) C23626e1.this.f59714d.get(this.f59731e)).intValue();
        }

        public final String getLast() {
            return (String) C23626e1.this.f59716f.get(this.f59732f);
        }

        public final String getPrefix() {
            return (String) C23626e1.this.f59715e.get(this.f59731e);
        }

        public final boolean isEmpty() {
            return this.f59731e == this.f59732f;
        }

        public final Iterator<String> iterator() {
            if (this.f59728b.isEmpty()) {
                for (int i = this.f59731e; i <= this.f59732f; i++) {
                    String str = (String) C23626e1.this.f59716f.get(i);
                    if (str != null) {
                        this.f59728b.add(str);
                    }
                }
            }
            return this.f59728b.iterator();
        }

        /* renamed from: j1 */
        public final String mo58796j1(String str) {
            String q = mo58797q();
            if (q != null) {
                return C23626e1.this.mo58787b(q, str);
            }
            return str;
        }

        /* renamed from: q */
        public final String m57901q() {
            if (this.f59729c == null) {
                int i = 0;
                int i2 = 0;
                while (i < this.f59731e) {
                    i2 = C23626e1.this.f59718h.indexOf(47, i2 + 1);
                    i++;
                }
                int i3 = i2;
                while (i <= this.f59732f) {
                    i3 = C23626e1.this.f59718h.indexOf(47, i3 + 1);
                    if (i3 == -1) {
                        i3 = C23626e1.this.f59718h.length();
                    }
                    i++;
                }
                this.f59729c = C23626e1.this.f59718h.substring(i2 + 1, i3);
            }
            return this.f59729c;
        }

        /* renamed from: t */
        public final boolean mo58798t() {
            C23626e1 e1Var = C23626e1.this;
            if (!e1Var.f59723m || this.f59732f < e1Var.f59716f.size() - 1) {
                return false;
            }
            return true;
        }

        public final String toString() {
            if (this.f59730d == null) {
                int i = C23626e1.this.f59726p;
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i2 > this.f59732f) {
                        break;
                    }
                    C23626e1 e1Var = C23626e1.this;
                    if (i >= e1Var.f59725o) {
                        i++;
                        break;
                    }
                    int i4 = i + 1;
                    if (e1Var.f59724n[i] == '/' && (i2 = i2 + 1) == this.f59731e) {
                        i = i4;
                        i3 = i;
                    } else {
                        i = i4;
                    }
                }
                this.f59730d = new String(C23626e1.this.f59724n, i3, (i - 1) - i3);
            }
            return this.f59730d;
        }

        /* renamed from: q */
        public final C23627a mo58797q() {
            return mo58788b2(1, 0);
        }
    }
}
