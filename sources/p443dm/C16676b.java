package p443dm;

import com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider;
import com.masabi.justride.sdk.internal.models.network.HttpMethod;
import java.util.Collections;
import java.util.Map;
import p363ak.C13475a;
import p364al.C13487h;
import p411cm.C13843a;
import p411cm.C13844b;
import p411cm.C13847e;
import p583jk.C17881n;
import p725pj.C18926a;
import p913xi.C20531d;

/* renamed from: dm.b */
public final class C16676b implements C13844b<String> {

    /* renamed from: l */
    public static final Map<String, String> f43429l = Collections.emptyMap();

    /* renamed from: a */
    public final String f43430a;

    /* renamed from: b */
    public final String f43431b;

    /* renamed from: c */
    public final C13843a f43432c;

    /* renamed from: d */
    public final C17881n.C17882a f43433d;

    /* renamed from: e */
    public final C13847e.C13848a f43434e;

    /* renamed from: f */
    public final C20531d f43435f;

    /* renamed from: g */
    public final C16681f f43436g;

    /* renamed from: h */
    public final HttpMethod f43437h;

    /* renamed from: i */
    public final String f43438i;

    /* renamed from: j */
    public final String f43439j;

    /* renamed from: k */
    public final String f43440k;

    /* renamed from: dm.b$a */
    public static class C16677a {

        /* renamed from: a */
        public final String f43441a;

        /* renamed from: b */
        public final String f43442b;

        /* renamed from: c */
        public final C13843a f43443c;

        /* renamed from: d */
        public final C17881n.C17882a f43444d;

        /* renamed from: e */
        public final C13847e.C13848a f43445e;

        /* renamed from: f */
        public final C20531d f43446f;

        /* renamed from: g */
        public final C16681f f43447g;

        public C16677a(String str, String str2, C13843a aVar, C17881n.C17882a aVar2, C13847e.C13848a aVar3, C20531d dVar, C16681f fVar) {
            this.f43441a = str;
            this.f43442b = str2;
            this.f43443c = aVar;
            this.f43444d = aVar2;
            this.f43445e = aVar3;
            this.f43446f = dVar;
            this.f43447g = fVar;
        }
    }

    public C16676b(String str, String str2, C13843a aVar, C17881n.C17882a aVar2, C13847e.C13848a aVar3, C20531d dVar, C16681f fVar, HttpMethod httpMethod, String str3, String str4, String str5) {
        this.f43430a = str;
        this.f43431b = str2;
        this.f43432c = aVar;
        this.f43433d = aVar2;
        this.f43434e = aVar3;
        this.f43435f = dVar;
        this.f43436g = fVar;
        this.f43437h = httpMethod;
        this.f43438i = str3;
        this.f43439j = str4;
        this.f43440k = str5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x02ff  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0306  */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p364al.C13487h<java.lang.String> mo40394C() {
        /*
            r28 = this;
            r1 = r28
            java.lang.String r0 = r1.f43430a
            java.lang.String r2 = r1.f43431b
            java.lang.String r3 = r1.f43438i
            if (r0 == 0) goto L_0x03d9
            if (r2 == 0) goto L_0x03d1
            if (r3 == 0) goto L_0x03c9
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "https://"
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = "/edge/broker/enc/rest/V3.5/"
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = "/"
            boolean r2 = r3.startsWith(r0)
            if (r2 != 0) goto L_0x002e
            r4.append(r0)
        L_0x002e:
            r4.append(r3)
            java.lang.String r0 = r4.toString()
            cm.a r2 = r1.f43432c
            al.h r2 = r2.mo40777a()
            boolean r3 = r2.mo40399a()
            if (r3 == 0) goto L_0x0048
            pj.a r0 = r2.f33366b
            al.h r0 = r1.mo49400a(r0)
            return r0
        L_0x0048:
            S r2 = r2.f33365a
            java.util.Map r2 = (java.util.Map) r2
            jk.n$a r3 = r1.f43433d
            jk.n r4 = new jk.n
            byte[] r5 = r3.f45875a
            androidx.lifecycle.u r6 = new androidx.lifecycle.u
            un.a r3 = r3.f45876b
            r6.<init>((java.lang.Object) r3)
            r4.<init>(r5, r6)
            r3 = 0
            ji.a r5 = mf0.C24361g.m61143M(r3)
            java.lang.String r7 = r1.f43439j
            java.nio.charset.Charset r8 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r7 = r7.getBytes(r8)
            java.util.Vector r8 = new java.util.Vector
            r8.<init>()
            r9 = 0
        L_0x006f:
            r10 = 24
            if (r9 >= r10) goto L_0x0083
            r10 = 12
            java.lang.Object r11 = r6.f3985a
            un.a r11 = (p846un.C19959a) r11
            byte[] r10 = r11.mo52261a(r10)
            r8.add(r10)
            int r9 = r9 + 1
            goto L_0x006f
        L_0x0083:
            r6 = 0
        L_0x0084:
            int r9 = r8.size()
            if (r6 >= r9) goto L_0x0098
            ji.a r9 = r4.f45872a
            java.lang.Object r10 = r8.elementAt(r6)
            byte[] r10 = (byte[]) r10
            r9.mo50431i(r10)
            int r6 = r6 + 1
            goto L_0x0084
        L_0x0098:
            r6 = 32
            byte[] r8 = new byte[r6]
            ji.a r9 = r4.f45872a
            r9.mo50428f(r6, r8)
        L_0x00a1:
            byte r9 = r8[r3]
            r10 = 2
            r11 = 3
            r12 = 1
            if (r9 != 0) goto L_0x00b6
            byte r9 = r8[r12]
            if (r9 != 0) goto L_0x00b6
            byte r9 = r8[r10]
            if (r9 != 0) goto L_0x00b6
            ji.a r9 = r4.f45872a
            r9.mo50428f(r11, r8)
            goto L_0x00a1
        L_0x00b6:
            int r9 = r7.length
            int r13 = r9 + 36
            int r14 = r13 + 8
            r15 = 128(0x80, float:1.794E-43)
            if (r14 >= r15) goto L_0x00c2
            int r15 = 128 - r14
            goto L_0x00c6
        L_0x00c2:
            int r15 = r14 % 16
            int r15 = 16 - r15
        L_0x00c6:
            int r14 = r14 + r15
            byte[] r11 = new byte[r14]
            java.lang.System.arraycopy(r8, r3, r11, r3, r6)
            r6 = 4
            byte[] r10 = new byte[r6]
            int r6 = r9 >> 24
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6
            r10[r3] = r6
            int r6 = r9 >> 16
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6
            r10[r12] = r6
            int r6 = r9 >> 8
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6
            r17 = 2
            r10[r17] = r6
            int r6 = r9 >> 0
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6
            r16 = 3
            r10[r16] = r6
            r6 = 4
            r12 = 32
            java.lang.System.arraycopy(r10, r3, r11, r12, r6)
            r6 = 36
            java.lang.System.arraycopy(r7, r3, r11, r6, r9)
            androidx.lifecycle.u r6 = r4.f45874c
            java.lang.Object r6 = r6.f3985a
            un.a r6 = (p846un.C19959a) r6
            byte[] r6 = r6.mo52261a(r15)
            java.lang.System.arraycopy(r6, r3, r11, r13, r15)
            int r6 = r14 + -32
            r7 = 4
            int r6 = r6 >> r7
            r5.mo50426b(r8)
            r8 = 32
            r5.mo50425a(r8, r6, r11)
            int r6 = r14 + 1
            byte[] r6 = new byte[r6]
            r6[r3] = r3
            r9 = 1
            java.lang.System.arraycopy(r11, r3, r6, r9, r14)
            ji.b r4 = r4.f45873b
            r4.getClass()
            int[] r9 = new int[r8]
            r8 = 0
        L_0x0125:
            r10 = 128(0x80, float:1.794E-43)
            if (r8 >= r10) goto L_0x0130
            byte r10 = r6[r8]
            if (r10 != 0) goto L_0x0130
            int r8 = r8 + 1
            goto L_0x0125
        L_0x0130:
            int r10 = 128 - r8
            r11 = 3
            r10 = r10 & r11
            if (r10 != 0) goto L_0x0137
            r10 = 4
        L_0x0137:
            r11 = 0
            r12 = 0
        L_0x0139:
            r13 = 128(0x80, float:1.794E-43)
            if (r8 >= r13) goto L_0x0151
            int r11 = r11 << 8
            byte r13 = r6[r8]
            r13 = r13 & 255(0xff, float:3.57E-43)
            r11 = r11 | r13
            int r10 = r10 + -1
            if (r10 > 0) goto L_0x014e
            r9[r12] = r11
            int r12 = r12 + 1
            r10 = 4
            r11 = 0
        L_0x014e:
            int r8 = r8 + 1
            goto L_0x0139
        L_0x0151:
            r7 = 1024(0x400, float:1.435E-42)
            int[] r7 = p581ji.C17855b.m44250d(r7, r9)
            int[] r8 = r4.f45851a
            int r8 = p581ji.C17855b.m44248b(r3, r3, r7, r8)
            r9 = 31
            if (r8 <= 0) goto L_0x0218
            int r8 = p581ji.C17855b.m44247a(r3, r7)
            int[] r10 = r4.f45851a
            int r10 = p581ji.C17855b.m44247a(r3, r10)
            int r8 = r8 - r10
            r10 = 1
            if (r8 <= r10) goto L_0x0177
            int[] r11 = r4.f45851a
            int r8 = r8 - r10
            int[] r8 = p581ji.C17855b.m44250d(r8, r11)
            goto L_0x0183
        L_0x0177:
            int r8 = r7.length
            int[] r10 = new int[r8]
            int[] r11 = r4.f45851a
            r12 = 32
            int r8 = r8 - r12
            java.lang.System.arraycopy(r11, r3, r10, r8, r12)
            r8 = r10
        L_0x0183:
            p581ji.C17855b.m44251e(r3, r3, r7, r8)
            r10 = 0
            r11 = 0
        L_0x0188:
            int r12 = p581ji.C17855b.m44248b(r10, r11, r7, r8)
            if (r12 < 0) goto L_0x0192
            p581ji.C17855b.m44251e(r10, r11, r7, r8)
            goto L_0x0188
        L_0x0192:
            int[] r12 = r4.f45851a
            int r12 = p581ji.C17855b.m44248b(r10, r3, r7, r12)
            if (r12 <= 0) goto L_0x020e
            r12 = r7[r10]
            if (r12 != 0) goto L_0x01a0
            int r10 = r10 + 1
        L_0x01a0:
            int r12 = p581ji.C17855b.m44247a(r11, r8)
            int r13 = p581ji.C17855b.m44247a(r10, r7)
            int r12 = r12 - r13
            if (r12 != 0) goto L_0x01c7
            int r12 = r8.length
            r13 = 1
            int r12 = r12 - r13
        L_0x01ae:
            int r14 = r11 + 1
            if (r12 < r14) goto L_0x01c1
            r14 = r8[r12]
            int r14 = r14 >>> r13
            int r15 = r12 + -1
            r17 = r8[r15]
            int r17 = r17 << 31
            r14 = r14 | r17
            r8[r12] = r14
            r12 = r15
            goto L_0x01ae
        L_0x01c1:
            r12 = r8[r11]
            int r12 = r12 >>> r13
            r8[r11] = r12
            goto L_0x0204
        L_0x01c7:
            r13 = 1
            int r14 = r12 >>> 5
            int r14 = r14 + r11
            int r15 = r8.length
            int r15 = r15 - r13
            if (r14 == r11) goto L_0x01e6
            int r13 = r14 - r11
            r9 = r15
        L_0x01d2:
            if (r9 < r14) goto L_0x01dd
            int r18 = r9 - r13
            r18 = r8[r18]
            r8[r9] = r18
            int r9 = r9 + -1
            goto L_0x01d2
        L_0x01dd:
            int r9 = r14 + -1
        L_0x01df:
            if (r9 < r11) goto L_0x01e6
            r8[r9] = r3
            int r9 = r9 + -1
            goto L_0x01df
        L_0x01e6:
            r9 = r12 & 31
            if (r9 == 0) goto L_0x0204
            int r12 = 32 - r9
        L_0x01ec:
            if (r15 <= r14) goto L_0x01fe
            r13 = r8[r15]
            int r13 = r13 >>> r9
            int r18 = r15 + -1
            r19 = r8[r18]
            int r19 = r19 << r12
            r13 = r13 | r19
            r8[r15] = r13
            r15 = r18
            goto L_0x01ec
        L_0x01fe:
            r12 = r8[r14]
            int r9 = r12 >>> r9
            r8[r14] = r9
        L_0x0204:
            r9 = r8[r11]
            if (r9 != 0) goto L_0x020a
            int r11 = r11 + 1
        L_0x020a:
            r9 = 31
            goto L_0x0188
        L_0x020e:
            if (r12 != 0) goto L_0x0223
        L_0x0210:
            int r8 = r7.length
            if (r10 == r8) goto L_0x0223
            r7[r10] = r3
            int r10 = r10 + 1
            goto L_0x0210
        L_0x0218:
            if (r8 != 0) goto L_0x0223
            r8 = 0
        L_0x021b:
            int r9 = r7.length
            if (r8 == r9) goto L_0x0223
            r7[r8] = r3
            int r8 = r8 + 1
            goto L_0x021b
        L_0x0223:
            r8 = 0
        L_0x0224:
            int r9 = r7.length
            if (r8 >= r9) goto L_0x022f
            r9 = r7[r8]
            if (r9 == 0) goto L_0x022c
            goto L_0x022f
        L_0x022c:
            int r8 = r8 + 1
            goto L_0x0224
        L_0x022f:
            r9 = 32
            int[] r10 = new int[r9]
            int r11 = r7.length
            int r11 = r11 - r8
            int r11 = 32 - r11
            int r12 = r7.length
            int r12 = r12 - r8
            java.lang.System.arraycopy(r7, r8, r10, r11, r12)
            int[] r7 = new int[r9]
            java.lang.System.arraycopy(r10, r3, r7, r3, r9)
            r8 = 33
            int[] r8 = new int[r8]
            r19 = r0
            r12 = r1
            r21 = r2
            r2 = r6
            r0 = r7
            r6 = r8
            r8 = r10
            r7 = 0
        L_0x024f:
            r9 = 1
            if (r7 >= r9) goto L_0x0290
            int[] r9 = r4.f45853c
            r9 = r9[r7]
            r10 = 0
            if (r7 != 0) goto L_0x0260
        L_0x0259:
            if (r9 <= 0) goto L_0x0288
            int r9 = r9 << 1
            int r10 = r10 + 1
            goto L_0x0259
        L_0x0260:
            r11 = 32
            if (r10 >= r11) goto L_0x028c
            int[] r11 = r4.f45851a
            long r13 = r4.f45852b
            r22 = r6
            r23 = r0
            r24 = r0
            r25 = r11
            r26 = r13
            p581ji.C17855b.m44249c(r22, r23, r24, r25, r26)
            if (r9 >= 0) goto L_0x0288
            int[] r11 = r4.f45851a
            long r13 = r4.f45852b
            r22 = r6
            r23 = r0
            r24 = r8
            r25 = r11
            r26 = r13
            p581ji.C17855b.m44249c(r22, r23, r24, r25, r26)
        L_0x0288:
            r13 = 1
            int r9 = r9 << r13
            int r10 = r10 + r13
            goto L_0x0260
        L_0x028c:
            r13 = 1
            int r7 = r7 + 1
            goto L_0x024f
        L_0x0290:
            r13 = 1
            r7 = 0
            r14 = 32
        L_0x0294:
            if (r7 >= r14) goto L_0x029b
            r8[r7] = r3
            int r7 = r7 + 1
            goto L_0x0294
        L_0x029b:
            r7 = 31
            r8[r7] = r13
            int[] r9 = r4.f45851a
            long r10 = r4.f45852b
            r7 = r0
            p581ji.C17855b.m44249c(r6, r7, r8, r9, r10)
            int r4 = p581ji.C17855b.m44247a(r3, r0)
            r16 = 3
            int r4 = r4 >> 3
            int r4 = r4 + r13
            byte[] r6 = new byte[r4]
            int r7 = r4 + -1
            r8 = 0
        L_0x02b5:
            if (r7 < 0) goto L_0x02cf
            if (r8 != 0) goto L_0x02bf
            if (r14 <= 0) goto L_0x02bf
            int r14 = r14 + -1
            r8 = 3
            goto L_0x02c7
        L_0x02bf:
            r9 = r0[r14]
            int r9 = r9 >>> 8
            r0[r14] = r9
            int r8 = r8 + -1
        L_0x02c7:
            r9 = r0[r14]
            byte r9 = (byte) r9
            r6[r7] = r9
            int r7 = r7 + -1
            goto L_0x02b5
        L_0x02cf:
            r7 = 128(0x80, float:1.794E-43)
            if (r4 >= r7) goto L_0x02dc
            byte[] r0 = new byte[r7]
            int r8 = 128 - r4
            java.lang.System.arraycopy(r6, r3, r0, r8, r4)
            r6 = r0
            goto L_0x02e1
        L_0x02dc:
            if (r4 <= r7) goto L_0x02e1
            int r4 = r4 + -128
            goto L_0x02e2
        L_0x02e1:
            r4 = 0
        L_0x02e2:
            java.lang.System.arraycopy(r6, r4, r2, r3, r7)
            cm.e$a r0 = r12.f43434e
            com.masabi.justride.sdk.internal.models.network.HttpMethod r3 = r12.f43437h
            java.util.Map<java.lang.String, java.lang.String> r22 = f43429l
            r18 = r0
            r20 = r3
            r23 = r2
            cm.e r0 = r18.mo40779a(r19, r20, r21, r22, r23)
            al.h r0 = r0.mo40394C()
            boolean r2 = r0.mo40399a()
            if (r2 == 0) goto L_0x0306
            pj.a r0 = r0.f33366b
            al.h r0 = r12.mo49400a(r0)
            return r0
        L_0x0306:
            S r0 = r0.f33365a
            tk.g r0 = (p819tk.C19690g) r0
            byte[] r0 = r0.f49980b
            r2 = 0
            byte[] r0 = p583jk.C17881n.m44328a(r0, r5)     // Catch:{ Exception -> 0x03b6 }
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8
            r3.<init>(r0, r4)
            xi.d r0 = r12.f43435f     // Catch:{ JSONException -> 0x03a7 }
            java.lang.Class<tk.f> r4 = p819tk.C19689f.class
            java.lang.Object r0 = r0.mo52732a(r4, r3)     // Catch:{ JSONException -> 0x03a7 }
            tk.d r0 = (p819tk.C19687d) r0     // Catch:{ JSONException -> 0x03a7 }
            dm.f r4 = r12.f43436g
            java.lang.String r5 = r12.f43440k
            r4.getClass()
            tk.i r6 = r0.f49976a
            if (r6 != 0) goto L_0x032e
            goto L_0x0356
        L_0x032e:
            java.lang.String r7 = r6.f49998b
            java.lang.Long r6 = r6.f49999c
            if (r7 == 0) goto L_0x0356
            if (r6 != 0) goto L_0x0337
            goto L_0x0356
        L_0x0337:
            kn.a r8 = new kn.a
            r8.<init>(r7, r6)
            java.lang.Object r6 = r4.f43451b
            kl.b r6 = (p608kl.C18092b) r6
            java.lang.Object r7 = r6.f46253e
            monitor-enter(r7)
            w10.a r9 = r6.f46251c     // Catch:{ all -> 0x0353 }
            al.h r9 = r9.mo52444e(r8)     // Catch:{ all -> 0x0353 }
            boolean r9 = r9.mo40399a()     // Catch:{ all -> 0x0353 }
            if (r9 != 0) goto L_0x0351
            r6.f46254f = r8     // Catch:{ all -> 0x0353 }
        L_0x0351:
            monitor-exit(r7)     // Catch:{ all -> 0x0353 }
            goto L_0x0356
        L_0x0353:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0353 }
            throw r0
        L_0x0356:
            java.util.List<tk.b> r0 = r0.f49978c
            if (r0 != 0) goto L_0x035b
            goto L_0x03a1
        L_0x035b:
            java.util.Iterator r0 = r0.iterator()
        L_0x035f:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x03a1
            java.lang.Object r6 = r0.next()
            tk.b r6 = (p819tk.C19685b) r6
            java.lang.Object r7 = r4.f43452c
            mf0.m r7 = (mf0.C24368m) r7
            r7.getClass()
            ak.e r6 = mf0.C24368m.m61231c(r6)
            java.lang.String r7 = r6.f48169a
            java.lang.String r8 = "UserServiceError"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x035f
            java.lang.Integer r7 = p890wj.C20343a.f51505b
            java.lang.Integer r6 = r6.f48170b
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x035f
            java.lang.Object r0 = r4.f43450a
            kl.d r0 = (p608kl.C18094d) r0
            al.h r0 = r0.mo50541a(r5)
            boolean r5 = r0.mo40399a()
            if (r5 == 0) goto L_0x03a1
            java.lang.Object r4 = r4.f43453d
            xl.b r4 = (p916xl.C20536b) r4
            pj.a r0 = r0.f33366b
            r4.mo52737a(r0)
        L_0x03a1:
            al.h r0 = new al.h
            r0.<init>(r3, r2)
            return r0
        L_0x03a7:
            r0 = move-exception
            ik.a r2 = new ik.a
            java.lang.String r0 = r0.getMessage()
            r2.<init>(r0)
            al.h r0 = r12.mo49400a(r2)
            return r0
        L_0x03b6:
            r0 = move-exception
            r3 = r0
            java.lang.Integer r0 = p363ak.C13475a.f33349e
            java.lang.String r3 = r3.getMessage()
            ak.a r4 = new ak.a
            r4.<init>(r2, r0, r3)
            al.h r0 = new al.h
            r0.<init>(r2, r4)
            return r0
        L_0x03c9:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r2 = "path cannot be null"
            r0.<init>(r2)
            throw r0
        L_0x03d1:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r2 = "brandId cannot be null"
            r0.<init>(r2)
            throw r0
        L_0x03d9:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r2 = "hostname cannot be null"
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p443dm.C16676b.mo40394C():al.h");
    }

    /* renamed from: a */
    public final C13487h<String> mo49400a(C18926a aVar) {
        return new C13487h<>(null, new C13475a(aVar, Integer.valueOf(STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS), "Unexpected error"));
    }
}
