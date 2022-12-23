package ni0;

import androidx.recyclerview.widget.RecyclerView;
import com.appboy.models.outgoing.FacebookUser;
import com.appboy.support.ValidationUtils;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.usebutton.sdk.internal.WebViewActivity;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import mf0.C24362h;
import ni0.C24528n;
import ni0.C24536q;
import okio.ByteString;
import si0.C24898f;
import si0.C24911r;
import si0.C24918x;

/* renamed from: ni0.b */
public final class C24506b {

    /* renamed from: a */
    public static final C24505a[] f62020a;

    /* renamed from: b */
    public static final Map<ByteString, Integer> f62021b;

    /* renamed from: ni0.b$a */
    public static final class C24507a {

        /* renamed from: a */
        public final ArrayList f62022a = new ArrayList();

        /* renamed from: b */
        public final C24918x f62023b;

        /* renamed from: c */
        public final int f62024c = 4096;

        /* renamed from: d */
        public int f62025d = 4096;

        /* renamed from: e */
        public C24505a[] f62026e = new C24505a[8];

        /* renamed from: f */
        public int f62027f = 7;

        /* renamed from: g */
        public int f62028g = 0;

        /* renamed from: h */
        public int f62029h = 0;

        public C24507a(C24528n.C24529a aVar) {
            this.f62023b = C24911r.m62547c(aVar);
        }

        /* renamed from: a */
        public final int mo60748a(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f62026e.length;
                while (true) {
                    length--;
                    i2 = this.f62027f;
                    if (length < i2 || i <= 0) {
                        C24505a[] aVarArr = this.f62026e;
                        System.arraycopy(aVarArr, i2 + 1, aVarArr, i2 + 1 + i3, this.f62028g);
                        this.f62027f += i3;
                    } else {
                        int i4 = this.f62026e[length].f62019c;
                        i -= i4;
                        this.f62029h -= i4;
                        this.f62028g--;
                        i3++;
                    }
                }
                C24505a[] aVarArr2 = this.f62026e;
                System.arraycopy(aVarArr2, i2 + 1, aVarArr2, i2 + 1 + i3, this.f62028g);
                this.f62027f += i3;
            }
            return i3;
        }

        /* renamed from: b */
        public final ByteString mo60749b(int i) throws IOException {
            boolean z;
            if (i < 0 || i > C24506b.f62020a.length - 1) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return C24506b.f62020a[i].f62017a;
            }
            int length = this.f62027f + 1 + (i - C24506b.f62020a.length);
            if (length >= 0) {
                C24505a[] aVarArr = this.f62026e;
                if (length < aVarArr.length) {
                    return aVarArr[length].f62017a;
                }
            }
            StringBuilder k = C13555b.m33972k("Header index too large ");
            k.append(i + 1);
            throw new IOException(k.toString());
        }

        /* renamed from: c */
        public final void mo60750c(C24505a aVar) {
            this.f62022a.add(aVar);
            int i = aVar.f62019c;
            int i2 = this.f62025d;
            if (i > i2) {
                Arrays.fill(this.f62026e, (Object) null);
                this.f62027f = this.f62026e.length - 1;
                this.f62028g = 0;
                this.f62029h = 0;
                return;
            }
            mo60748a((this.f62029h + i) - i2);
            int i3 = this.f62028g + 1;
            C24505a[] aVarArr = this.f62026e;
            if (i3 > aVarArr.length) {
                C24505a[] aVarArr2 = new C24505a[(aVarArr.length * 2)];
                System.arraycopy(aVarArr, 0, aVarArr2, aVarArr.length, aVarArr.length);
                this.f62027f = this.f62026e.length - 1;
                this.f62026e = aVarArr2;
            }
            int i4 = this.f62027f;
            this.f62027f = i4 - 1;
            this.f62026e[i4] = aVar;
            this.f62028g++;
            this.f62029h += i;
        }

        /* renamed from: d */
        public final ByteString mo60751d() throws IOException {
            boolean z;
            byte readByte = this.f62023b.readByte() & 255;
            if ((readByte & 128) == 128) {
                z = true;
            } else {
                z = false;
            }
            int e = mo60752e(readByte, 127);
            if (!z) {
                return this.f62023b.mo61396V0((long) e);
            }
            C24536q qVar = C24536q.f62156d;
            C24918x xVar = this.f62023b;
            long j = (long) e;
            xVar.mo61384N0(j);
            byte[] y = xVar.f62987b.mo61438y(j);
            qVar.getClass();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            C24536q.C24537a aVar = qVar.f62157a;
            byte b = 0;
            int i = 0;
            for (byte b2 : y) {
                b = (b << 8) | (b2 & 255);
                i += 8;
                while (i >= 8) {
                    int i2 = i - 8;
                    aVar = aVar.f62158a[(b >>> i2) & ValidationUtils.APPBOY_STRING_MAX_LENGTH];
                    if (aVar.f62158a == null) {
                        byteArrayOutputStream.write(aVar.f62159b);
                        i -= aVar.f62160c;
                        aVar = qVar.f62157a;
                    } else {
                        i = i2;
                    }
                }
            }
            while (i > 0) {
                C24536q.C24537a aVar2 = aVar.f62158a[(b << (8 - i)) & ValidationUtils.APPBOY_STRING_MAX_LENGTH];
                if (aVar2.f62158a != null || aVar2.f62160c > i) {
                    break;
                }
                byteArrayOutputStream.write(aVar2.f62159b);
                i -= aVar2.f62160c;
                aVar = qVar.f62157a;
            }
            return ByteString.m61904o(byteArrayOutputStream.toByteArray());
        }

        /* renamed from: e */
        public final int mo60752e(int i, int i2) throws IOException {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                byte readByte = this.f62023b.readByte() & 255;
                if ((readByte & 128) == 0) {
                    return i2 + (readByte << i4);
                }
                i2 += (readByte & Byte.MAX_VALUE) << i4;
                i4 += 7;
            }
        }
    }

    /* renamed from: ni0.b$b */
    public static final class C24508b {

        /* renamed from: a */
        public final C24898f f62030a;

        /* renamed from: b */
        public int f62031b = Integer.MAX_VALUE;

        /* renamed from: c */
        public boolean f62032c;

        /* renamed from: d */
        public int f62033d = 4096;

        /* renamed from: e */
        public C24505a[] f62034e = new C24505a[8];

        /* renamed from: f */
        public int f62035f = 7;

        /* renamed from: g */
        public int f62036g = 0;

        /* renamed from: h */
        public int f62037h = 0;

        public C24508b(C24898f fVar) {
            this.f62030a = fVar;
        }

        /* renamed from: a */
        public final void mo60753a(int i) {
            int i2;
            if (i > 0) {
                int length = this.f62034e.length - 1;
                int i3 = 0;
                while (true) {
                    i2 = this.f62035f;
                    if (length < i2 || i <= 0) {
                        C24505a[] aVarArr = this.f62034e;
                        int i4 = i2 + 1;
                        System.arraycopy(aVarArr, i4, aVarArr, i4 + i3, this.f62036g);
                        C24505a[] aVarArr2 = this.f62034e;
                        int i5 = this.f62035f + 1;
                        Arrays.fill(aVarArr2, i5, i5 + i3, (Object) null);
                        this.f62035f += i3;
                    } else {
                        int i6 = this.f62034e[length].f62019c;
                        i -= i6;
                        this.f62037h -= i6;
                        this.f62036g--;
                        i3++;
                        length--;
                    }
                }
                C24505a[] aVarArr3 = this.f62034e;
                int i42 = i2 + 1;
                System.arraycopy(aVarArr3, i42, aVarArr3, i42 + i3, this.f62036g);
                C24505a[] aVarArr22 = this.f62034e;
                int i52 = this.f62035f + 1;
                Arrays.fill(aVarArr22, i52, i52 + i3, (Object) null);
                this.f62035f += i3;
            }
        }

        /* renamed from: b */
        public final void mo60754b(C24505a aVar) {
            int i = aVar.f62019c;
            int i2 = this.f62033d;
            if (i > i2) {
                Arrays.fill(this.f62034e, (Object) null);
                this.f62035f = this.f62034e.length - 1;
                this.f62036g = 0;
                this.f62037h = 0;
                return;
            }
            mo60753a((this.f62037h + i) - i2);
            int i3 = this.f62036g + 1;
            C24505a[] aVarArr = this.f62034e;
            if (i3 > aVarArr.length) {
                C24505a[] aVarArr2 = new C24505a[(aVarArr.length * 2)];
                System.arraycopy(aVarArr, 0, aVarArr2, aVarArr.length, aVarArr.length);
                this.f62035f = this.f62034e.length - 1;
                this.f62034e = aVarArr2;
            }
            int i4 = this.f62035f;
            this.f62035f = i4 - 1;
            this.f62034e[i4] = aVar;
            this.f62036g++;
            this.f62037h += i;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: long} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: byte} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo60755c(okio.ByteString r13) throws java.io.IOException {
            /*
                r12 = this;
                ni0.q r0 = ni0.C24536q.f62156d
                r0.getClass()
                r0 = 0
                r1 = 0
                r4 = r1
                r3 = 0
            L_0x000a:
                int r6 = r13.mo60873k()
                r7 = 255(0xff, float:3.57E-43)
                if (r3 >= r6) goto L_0x0020
                byte r6 = r13.mo60876n(r3)
                r6 = r6 & r7
                byte[] r7 = ni0.C24536q.f62155c
                byte r6 = r7[r6]
                long r6 = (long) r6
                long r4 = r4 + r6
                int r3 = r3 + 1
                goto L_0x000a
            L_0x0020:
                r8 = 7
                long r4 = r4 + r8
                r3 = 3
                long r3 = r4 >> r3
                int r4 = (int) r3
                int r3 = r13.mo60873k()
                r5 = 127(0x7f, float:1.78E-43)
                if (r4 >= r3) goto L_0x0082
                si0.f r3 = new si0.f
                r3.<init>()
                ni0.q r4 = ni0.C24536q.f62156d
                r4.getClass()
                r8 = r1
                r1 = 0
            L_0x003b:
                int r2 = r13.mo60873k()
                if (r0 >= r2) goto L_0x0062
                byte r2 = r13.mo60876n(r0)
                r2 = r2 & r7
                int[] r4 = ni0.C24536q.f62154b
                r4 = r4[r2]
                byte[] r6 = ni0.C24536q.f62155c
                byte r2 = r6[r2]
                long r8 = r8 << r2
                long r10 = (long) r4
                long r8 = r8 | r10
                int r1 = r1 + r2
            L_0x0052:
                r2 = 8
                if (r1 < r2) goto L_0x005f
                int r1 = r1 + -8
                long r10 = r8 >> r1
                int r2 = (int) r10
                r3.mo61395V(r2)
                goto L_0x0052
            L_0x005f:
                int r0 = r0 + 1
                goto L_0x003b
            L_0x0062:
                if (r1 <= 0) goto L_0x006f
                int r13 = 8 - r1
                long r8 = r8 << r13
                int r13 = r7 >>> r1
                long r0 = (long) r13
                long r0 = r0 | r8
                int r13 = (int) r0
                r3.mo61395V(r13)
            L_0x006f:
                okio.ByteString r13 = r3.mo61439z()
                int r0 = r13.mo60873k()
                r1 = 128(0x80, float:1.794E-43)
                r12.mo60757e(r0, r5, r1)
                si0.f r0 = r12.f62030a
                r0.mo61393U(r13)
                goto L_0x008e
            L_0x0082:
                int r1 = r13.mo60873k()
                r12.mo60757e(r1, r5, r0)
                si0.f r0 = r12.f62030a
                r0.mo61393U(r13)
            L_0x008e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ni0.C24506b.C24508b.mo60755c(okio.ByteString):void");
        }

        /* renamed from: d */
        public final void mo60756d(ArrayList arrayList) throws IOException {
            int i;
            int i2;
            if (this.f62032c) {
                int i3 = this.f62031b;
                if (i3 < this.f62033d) {
                    mo60757e(i3, 31, 32);
                }
                this.f62032c = false;
                this.f62031b = Integer.MAX_VALUE;
                mo60757e(this.f62033d, 31, 32);
            }
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                C24505a aVar = (C24505a) arrayList.get(i4);
                ByteString r = aVar.f62017a.mo60879r();
                ByteString byteString = aVar.f62018b;
                Integer num = C24506b.f62021b.get(r);
                if (num != null) {
                    i2 = num.intValue() + 1;
                    if (i2 > 1 && i2 < 8) {
                        C24505a[] aVarArr = C24506b.f62020a;
                        if (Objects.equals(aVarArr[i2 - 1].f62018b, byteString)) {
                            i = i2;
                        } else if (Objects.equals(aVarArr[i2].f62018b, byteString)) {
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
                    int i5 = this.f62035f + 1;
                    int length = this.f62034e.length;
                    while (true) {
                        if (i5 >= length) {
                            break;
                        }
                        if (Objects.equals(this.f62034e[i5].f62017a, r)) {
                            if (Objects.equals(this.f62034e[i5].f62018b, byteString)) {
                                i2 = C24506b.f62020a.length + (i5 - this.f62035f);
                                break;
                            } else if (i == -1) {
                                i = (i5 - this.f62035f) + C24506b.f62020a.length;
                            }
                        }
                        i5++;
                    }
                }
                if (i2 != -1) {
                    mo60757e(i2, 127, RecyclerView.C1119a0.FLAG_IGNORE);
                } else if (i == -1) {
                    this.f62030a.mo61395V(64);
                    mo60755c(r);
                    mo60755c(byteString);
                    mo60754b(aVar);
                } else {
                    ByteString byteString2 = C24505a.f62011d;
                    r.getClass();
                    C24362h.m61211f(byteString2, "prefix");
                    if (!r.mo60878q(byteString2, byteString2.mo60873k()) || C24505a.f62016i.equals(r)) {
                        mo60757e(i, 63, 64);
                        mo60755c(byteString);
                        mo60754b(aVar);
                    } else {
                        mo60757e(i, 15, 0);
                        mo60755c(byteString);
                    }
                }
            }
        }

        /* renamed from: e */
        public final void mo60757e(int i, int i2, int i3) {
            if (i < i2) {
                this.f62030a.mo61395V(i | i3);
                return;
            }
            this.f62030a.mo61395V(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                this.f62030a.mo61395V(128 | (i4 & 127));
                i4 >>>= 7;
            }
            this.f62030a.mo61395V(i4);
        }
    }

    static {
        C24505a aVar = new C24505a(C24505a.f62016i, "");
        int i = 0;
        ByteString byteString = C24505a.f62013f;
        ByteString byteString2 = C24505a.f62014g;
        ByteString byteString3 = C24505a.f62015h;
        ByteString byteString4 = C24505a.f62012e;
        C24505a[] aVarArr = {aVar, new C24505a(byteString, "GET"), new C24505a(byteString, "POST"), new C24505a(byteString2, "/"), new C24505a(byteString2, "/index.html"), new C24505a(byteString3, "http"), new C24505a(byteString3, "https"), new C24505a(byteString4, "200"), new C24505a(byteString4, "204"), new C24505a(byteString4, "206"), new C24505a(byteString4, "304"), new C24505a(byteString4, "400"), new C24505a(byteString4, "404"), new C24505a(byteString4, "500"), new C24505a("accept-charset", ""), new C24505a("accept-encoding", "gzip, deflate"), new C24505a("accept-language", ""), new C24505a("accept-ranges", ""), new C24505a("accept", ""), new C24505a("access-control-allow-origin", ""), new C24505a((String) InneractiveMediationDefs.KEY_AGE, ""), new C24505a("allow", ""), new C24505a("authorization", ""), new C24505a("cache-control", ""), new C24505a("content-disposition", ""), new C24505a("content-encoding", ""), new C24505a("content-language", ""), new C24505a("content-length", ""), new C24505a("content-location", ""), new C24505a("content-range", ""), new C24505a("content-type", ""), new C24505a("cookie", ""), new C24505a("date", ""), new C24505a("etag", ""), new C24505a("expect", ""), new C24505a("expires", ""), new C24505a("from", ""), new C24505a("host", ""), new C24505a("if-match", ""), new C24505a("if-modified-since", ""), new C24505a("if-none-match", ""), new C24505a("if-range", ""), new C24505a("if-unmodified-since", ""), new C24505a("last-modified", ""), new C24505a((String) WebViewActivity.EXTRA_LINK, ""), new C24505a((String) FacebookUser.LOCATION_OUTER_OBJECT_KEY, ""), new C24505a("max-forwards", ""), new C24505a("proxy-authenticate", ""), new C24505a("proxy-authorization", ""), new C24505a("range", ""), new C24505a("referer", ""), new C24505a("refresh", ""), new C24505a("retry-after", ""), new C24505a("server", ""), new C24505a("set-cookie", ""), new C24505a("strict-transport-security", ""), new C24505a("transfer-encoding", ""), new C24505a("user-agent", ""), new C24505a("vary", ""), new C24505a("via", ""), new C24505a("www-authenticate", "")};
        f62020a = aVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(aVarArr.length);
        while (true) {
            C24505a[] aVarArr2 = f62020a;
            if (i < aVarArr2.length) {
                if (!linkedHashMap.containsKey(aVarArr2[i].f62017a)) {
                    linkedHashMap.put(aVarArr2[i].f62017a, Integer.valueOf(i));
                }
                i++;
            } else {
                f62021b = Collections.unmodifiableMap(linkedHashMap);
                return;
            }
        }
    }

    /* renamed from: a */
    public static void m61635a(ByteString byteString) throws IOException {
        int k = byteString.mo60873k();
        int i = 0;
        while (i < k) {
            byte n = byteString.mo60876n(i);
            if (n < 65 || n > 90) {
                i++;
            } else {
                StringBuilder k2 = C13555b.m33972k("PROTOCOL_ERROR response malformed: mixed case name: ");
                k2.append(byteString.mo60881t());
                throw new IOException(k2.toString());
            }
        }
    }
}
