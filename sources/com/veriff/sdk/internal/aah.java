package com.veriff.sdk.internal;

import androidx.recyclerview.widget.RecyclerView;
import com.appboy.models.outgoing.FacebookUser;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.usebutton.sdk.internal.WebViewActivity;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p988j$.util.Spliterator;

final class aah {

    /* renamed from: a */
    public static final aag[] f53345a;

    /* renamed from: b */
    public static final Map<abl, Integer> f53346b = m50018a();

    /* renamed from: com.veriff.sdk.internal.aah$a */
    public static final class C21286a {

        /* renamed from: a */
        public aag[] f53347a;

        /* renamed from: b */
        public int f53348b;

        /* renamed from: c */
        public int f53349c;

        /* renamed from: d */
        public int f53350d;

        /* renamed from: e */
        private final List<aag> f53351e;

        /* renamed from: f */
        private final abk f53352f;

        /* renamed from: g */
        private final int f53353g;

        /* renamed from: h */
        private int f53354h;

        public C21286a(int i, aca aca) {
            this(i, i, aca);
        }

        /* renamed from: a */
        private int m50019a(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f53347a.length;
                while (true) {
                    length--;
                    i2 = this.f53348b;
                    if (length < i2 || i <= 0) {
                        aag[] aagArr = this.f53347a;
                        System.arraycopy(aagArr, i2 + 1, aagArr, i2 + 1 + i3, this.f53349c);
                        this.f53348b += i3;
                    } else {
                        int i4 = this.f53347a[length].f53344i;
                        i -= i4;
                        this.f53350d -= i4;
                        this.f53349c--;
                        i3++;
                    }
                }
                aag[] aagArr2 = this.f53347a;
                System.arraycopy(aagArr2, i2 + 1, aagArr2, i2 + 1 + i3, this.f53349c);
                this.f53348b += i3;
            }
            return i3;
        }

        /* renamed from: c */
        private int m50022c(int i) {
            return this.f53348b + 1 + i;
        }

        /* renamed from: d */
        private void m50023d() {
            int i = this.f53354h;
            int i2 = this.f53350d;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                m50025e();
            } else {
                m50019a(i2 - i);
            }
        }

        /* renamed from: e */
        private void m50025e() {
            Arrays.fill(this.f53347a, (Object) null);
            this.f53348b = this.f53347a.length - 1;
            this.f53349c = 0;
            this.f53350d = 0;
        }

        /* renamed from: f */
        private void m50028f() throws IOException {
            this.f53351e.add(new aag(aah.m50017a(mo53685c()), mo53685c()));
        }

        /* renamed from: g */
        private void m50029g() throws IOException {
            m50020a(-1, new aag(aah.m50017a(mo53685c()), mo53685c()));
        }

        /* renamed from: h */
        private int m50031h() throws IOException {
            return this.f53352f.mo53902j() & 255;
        }

        /* renamed from: b */
        public List<aag> mo53684b() {
            ArrayList arrayList = new ArrayList(this.f53351e);
            this.f53351e.clear();
            return arrayList;
        }

        public C21286a(int i, int i2, aca aca) {
            this.f53351e = new ArrayList();
            aag[] aagArr = new aag[8];
            this.f53347a = aagArr;
            this.f53348b = aagArr.length - 1;
            this.f53349c = 0;
            this.f53350d = 0;
            this.f53353g = i;
            this.f53354h = i2;
            this.f53352f = abr.m50508a(aca);
        }

        /* renamed from: c */
        public abl mo53685c() throws IOException {
            int h = m50031h();
            boolean z = (h & RecyclerView.C1119a0.FLAG_IGNORE) == 128;
            int a = mo53682a(h, 127);
            if (z) {
                return abl.m50462a(aao.m50200a().mo53773a(this.f53352f.mo53896h((long) a)));
            }
            return this.f53352f.mo53883d((long) a);
        }

        /* renamed from: b */
        private void m50021b(int i) throws IOException {
            if (m50030g(i)) {
                this.f53351e.add(aah.f53345a[i]);
                return;
            }
            int c = m50022c(i - aah.f53345a.length);
            if (c >= 0) {
                aag[] aagArr = this.f53347a;
                if (c < aagArr.length) {
                    this.f53351e.add(aagArr[c]);
                    return;
                }
            }
            StringBuilder k = C13555b.m33972k("Header index too large ");
            k.append(i + 1);
            throw new IOException(k.toString());
        }

        /* renamed from: d */
        private void m50024d(int i) throws IOException {
            this.f53351e.add(new aag(m50027f(i), mo53685c()));
        }

        /* renamed from: f */
        private abl m50027f(int i) throws IOException {
            if (m50030g(i)) {
                return aah.f53345a[i].f53342g;
            }
            int c = m50022c(i - aah.f53345a.length);
            if (c >= 0) {
                aag[] aagArr = this.f53347a;
                if (c < aagArr.length) {
                    return aagArr[c].f53342g;
                }
            }
            StringBuilder k = C13555b.m33972k("Header index too large ");
            k.append(i + 1);
            throw new IOException(k.toString());
        }

        /* renamed from: g */
        private boolean m50030g(int i) {
            return i >= 0 && i <= aah.f53345a.length - 1;
        }

        /* renamed from: e */
        private void m50026e(int i) throws IOException {
            m50020a(-1, new aag(m50027f(i), mo53685c()));
        }

        /* renamed from: a */
        public void mo53683a() throws IOException {
            while (!this.f53352f.mo53890f()) {
                byte j = this.f53352f.mo53902j() & 255;
                if (j == 128) {
                    throw new IOException("index == 0");
                } else if ((j & 128) == 128) {
                    m50021b(mo53682a((int) j, 127) - 1);
                } else if (j == 64) {
                    m50029g();
                } else if ((j & 64) == 64) {
                    m50026e(mo53682a((int) j, 63) - 1);
                } else if ((j & 32) == 32) {
                    int a = mo53682a((int) j, 31);
                    this.f53354h = a;
                    if (a < 0 || a > this.f53353g) {
                        StringBuilder k = C13555b.m33972k("Invalid dynamic table size update ");
                        k.append(this.f53354h);
                        throw new IOException(k.toString());
                    }
                    m50023d();
                } else if (j == 16 || j == 0) {
                    m50028f();
                } else {
                    m50024d(mo53682a((int) j, 15) - 1);
                }
            }
        }

        /* renamed from: a */
        private void m50020a(int i, aag aag) {
            this.f53351e.add(aag);
            int i2 = aag.f53344i;
            if (i != -1) {
                i2 -= this.f53347a[m50022c(i)].f53344i;
            }
            int i3 = this.f53354h;
            if (i2 > i3) {
                m50025e();
                return;
            }
            int a = m50019a((this.f53350d + i2) - i3);
            if (i == -1) {
                int i4 = this.f53349c + 1;
                aag[] aagArr = this.f53347a;
                if (i4 > aagArr.length) {
                    aag[] aagArr2 = new aag[(aagArr.length * 2)];
                    System.arraycopy(aagArr, 0, aagArr2, aagArr.length, aagArr.length);
                    this.f53348b = this.f53347a.length - 1;
                    this.f53347a = aagArr2;
                }
                int i5 = this.f53348b;
                this.f53348b = i5 - 1;
                this.f53347a[i5] = aag;
                this.f53349c++;
            } else {
                this.f53347a[m50022c(i) + a + i] = aag;
            }
            this.f53350d += i2;
        }

        /* renamed from: a */
        public int mo53682a(int i, int i2) throws IOException {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int h = m50031h();
                if ((h & RecyclerView.C1119a0.FLAG_IGNORE) == 0) {
                    return i2 + (h << i4);
                }
                i2 += (h & 127) << i4;
                i4 += 7;
            }
        }
    }

    /* renamed from: com.veriff.sdk.internal.aah$b */
    public static final class C21287b {

        /* renamed from: b */
        public int f53355b;

        /* renamed from: c */
        public aag[] f53356c;

        /* renamed from: d */
        public int f53357d;

        /* renamed from: e */
        public int f53358e;

        /* renamed from: f */
        public int f53359f;

        /* renamed from: g */
        private final abi f53360g;

        /* renamed from: h */
        private final boolean f53361h;

        /* renamed from: i */
        private int f53362i;

        /* renamed from: j */
        private boolean f53363j;

        public C21287b(abi abi) {
            this(4096, true, abi);
        }

        /* renamed from: a */
        private void m50036a() {
            Arrays.fill(this.f53356c, (Object) null);
            this.f53357d = this.f53356c.length - 1;
            this.f53358e = 0;
            this.f53359f = 0;
        }

        /* renamed from: b */
        private int m50038b(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f53356c.length;
                while (true) {
                    length--;
                    i2 = this.f53357d;
                    if (length < i2 || i <= 0) {
                        aag[] aagArr = this.f53356c;
                        System.arraycopy(aagArr, i2 + 1, aagArr, i2 + 1 + i3, this.f53358e);
                        aag[] aagArr2 = this.f53356c;
                        int i4 = this.f53357d;
                        Arrays.fill(aagArr2, i4 + 1, i4 + 1 + i3, (Object) null);
                        this.f53357d += i3;
                    } else {
                        int i5 = this.f53356c[length].f53344i;
                        i -= i5;
                        this.f53359f -= i5;
                        this.f53358e--;
                        i3++;
                    }
                }
                aag[] aagArr3 = this.f53356c;
                System.arraycopy(aagArr3, i2 + 1, aagArr3, i2 + 1 + i3, this.f53358e);
                aag[] aagArr22 = this.f53356c;
                int i42 = this.f53357d;
                Arrays.fill(aagArr22, i42 + 1, i42 + 1 + i3, (Object) null);
                this.f53357d += i3;
            }
            return i3;
        }

        public C21287b(int i, boolean z, abi abi) {
            this.f53362i = Integer.MAX_VALUE;
            aag[] aagArr = new aag[8];
            this.f53356c = aagArr;
            this.f53357d = aagArr.length - 1;
            this.f53358e = 0;
            this.f53359f = 0;
            this.f53355b = i;
            this.f53361h = z;
            this.f53360g = abi;
        }

        /* renamed from: a */
        private void m50037a(aag aag) {
            int i = aag.f53344i;
            int i2 = this.f53355b;
            if (i > i2) {
                m50036a();
                return;
            }
            m50038b((this.f53359f + i) - i2);
            int i3 = this.f53358e + 1;
            aag[] aagArr = this.f53356c;
            if (i3 > aagArr.length) {
                aag[] aagArr2 = new aag[(aagArr.length * 2)];
                System.arraycopy(aagArr, 0, aagArr2, aagArr.length, aagArr.length);
                this.f53357d = this.f53356c.length - 1;
                this.f53356c = aagArr2;
            }
            int i4 = this.f53357d;
            this.f53357d = i4 - 1;
            this.f53356c[i4] = aag;
            this.f53358e++;
            this.f53359f += i;
        }

        /* renamed from: b */
        private void m50039b() {
            int i = this.f53355b;
            int i2 = this.f53359f;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                m50036a();
            } else {
                m50038b(i2 - i);
            }
        }

        /* renamed from: a */
        public void mo53689a(List<aag> list) throws IOException {
            int i;
            int i2;
            if (this.f53363j) {
                int i3 = this.f53362i;
                if (i3 < this.f53355b) {
                    mo53687a(i3, 31, 32);
                }
                this.f53363j = false;
                this.f53362i = Integer.MAX_VALUE;
                mo53687a(this.f53355b, 31, 32);
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                aag aag = list.get(i4);
                abl g = aag.f53342g.mo53945g();
                abl abl = aag.f53343h;
                Integer num = aah.f53346b.get(g);
                if (num != null) {
                    i2 = num.intValue() + 1;
                    if (i2 > 1 && i2 < 8) {
                        aag[] aagArr = aah.f53345a;
                        if (Objects.equals(aagArr[i2 - 1].f53343h, abl)) {
                            i = i2;
                        } else if (Objects.equals(aagArr[i2].f53343h, abl)) {
                            i = i2;
                            i2++;
                        }
                    }
                    i = i2;
                    i2 = -1;
                } else {
                    i2 = -1;
                    i = -1;
                }
                if (i2 == -1) {
                    int i5 = this.f53357d + 1;
                    int length = this.f53356c.length;
                    while (true) {
                        if (i5 >= length) {
                            break;
                        }
                        if (Objects.equals(this.f53356c[i5].f53342g, g)) {
                            if (Objects.equals(this.f53356c[i5].f53343h, abl)) {
                                i2 = aah.f53345a.length + (i5 - this.f53357d);
                                break;
                            } else if (i == -1) {
                                i = (i5 - this.f53357d) + aah.f53345a.length;
                            }
                        }
                        i5++;
                    }
                }
                if (i2 != -1) {
                    mo53687a(i2, 127, RecyclerView.C1119a0.FLAG_IGNORE);
                } else if (i == -1) {
                    this.f53360g.mo53899i(64);
                    mo53688a(g);
                    mo53688a(abl);
                    m50037a(aag);
                } else if (!g.mo53936a(aag.f53336a) || aag.f53341f.equals(g)) {
                    mo53687a(i, 63, 64);
                    mo53688a(abl);
                    m50037a(aag);
                } else {
                    mo53687a(i, 15, 0);
                    mo53688a(abl);
                }
            }
        }

        /* renamed from: a */
        public void mo53687a(int i, int i2, int i3) {
            if (i < i2) {
                this.f53360g.mo53899i(i | i3);
                return;
            }
            this.f53360g.mo53899i(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                this.f53360g.mo53899i(128 | (i4 & 127));
                i4 >>>= 7;
            }
            this.f53360g.mo53899i(i4);
        }

        /* renamed from: a */
        public void mo53688a(abl abl) throws IOException {
            if (!this.f53361h || aao.m50200a().mo53771a(abl) >= abl.mo53946h()) {
                mo53687a(abl.mo53946h(), 127, 0);
                this.f53360g.mo53882d(abl);
                return;
            }
            abi abi = new abi();
            aao.m50200a().mo53772a(abl, abi);
            abl q = abi.mo53913q();
            mo53687a(q.mo53946h(), 127, RecyclerView.C1119a0.FLAG_IGNORE);
            this.f53360g.mo53882d(q);
        }

        /* renamed from: a */
        public void mo53686a(int i) {
            int min = Math.min(i, Spliterator.SUBSIZED);
            int i2 = this.f53355b;
            if (i2 != min) {
                if (min < i2) {
                    this.f53362i = Math.min(this.f53362i, min);
                }
                this.f53363j = true;
                this.f53355b = min;
                m50039b();
            }
        }
    }

    static {
        abl abl = aag.f53338c;
        abl abl2 = aag.f53339d;
        abl abl3 = aag.f53340e;
        abl abl4 = aag.f53337b;
        f53345a = new aag[]{new aag(aag.f53341f, ""), new aag(abl, "GET"), new aag(abl, "POST"), new aag(abl2, "/"), new aag(abl2, "/index.html"), new aag(abl3, "http"), new aag(abl3, "https"), new aag(abl4, "200"), new aag(abl4, "204"), new aag(abl4, "206"), new aag(abl4, "304"), new aag(abl4, "400"), new aag(abl4, "404"), new aag(abl4, "500"), new aag("accept-charset", ""), new aag("accept-encoding", "gzip, deflate"), new aag("accept-language", ""), new aag("accept-ranges", ""), new aag("accept", ""), new aag("access-control-allow-origin", ""), new aag((String) InneractiveMediationDefs.KEY_AGE, ""), new aag("allow", ""), new aag("authorization", ""), new aag("cache-control", ""), new aag("content-disposition", ""), new aag("content-encoding", ""), new aag("content-language", ""), new aag("content-length", ""), new aag("content-location", ""), new aag("content-range", ""), new aag("content-type", ""), new aag("cookie", ""), new aag("date", ""), new aag("etag", ""), new aag("expect", ""), new aag("expires", ""), new aag("from", ""), new aag("host", ""), new aag("if-match", ""), new aag("if-modified-since", ""), new aag("if-none-match", ""), new aag("if-range", ""), new aag("if-unmodified-since", ""), new aag("last-modified", ""), new aag((String) WebViewActivity.EXTRA_LINK, ""), new aag((String) FacebookUser.LOCATION_OUTER_OBJECT_KEY, ""), new aag("max-forwards", ""), new aag("proxy-authenticate", ""), new aag("proxy-authorization", ""), new aag("range", ""), new aag("referer", ""), new aag("refresh", ""), new aag("retry-after", ""), new aag("server", ""), new aag("set-cookie", ""), new aag("strict-transport-security", ""), new aag("transfer-encoding", ""), new aag("user-agent", ""), new aag("vary", ""), new aag("via", ""), new aag("www-authenticate", "")};
    }

    /* renamed from: a */
    private static Map<abl, Integer> m50018a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f53345a.length);
        int i = 0;
        while (true) {
            aag[] aagArr = f53345a;
            if (i >= aagArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(aagArr[i].f53342g)) {
                linkedHashMap.put(aagArr[i].f53342g, Integer.valueOf(i));
            }
            i++;
        }
    }

    /* renamed from: a */
    public static abl m50017a(abl abl) throws IOException {
        int h = abl.mo53946h();
        int i = 0;
        while (i < h) {
            byte a = abl.mo53930a(i);
            if (a < 65 || a > 90) {
                i++;
            } else {
                StringBuilder k = C13555b.m33972k("PROTOCOL_ERROR response malformed: mixed case name: ");
                k.append(abl.mo53932a());
                throw new IOException(k.toString());
            }
        }
        return abl;
    }
}
