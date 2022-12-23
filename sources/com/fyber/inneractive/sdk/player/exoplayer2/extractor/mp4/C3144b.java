package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import com.appboy.models.MessageButton;
import com.appboy.support.ValidationUtils;
import com.fyber.inneractive.sdk.player.exoplayer2.C3226i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3393k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b */
public final class C3144b {

    /* renamed from: a */
    public static final int f11060a = C3406u.m8589a("vide");

    /* renamed from: b */
    public static final int f11061b = C3406u.m8589a("soun");

    /* renamed from: c */
    public static final int f11062c = C3406u.m8589a(MessageButton.TEXT);

    /* renamed from: d */
    public static final int f11063d = C3406u.m8589a("sbtl");

    /* renamed from: e */
    public static final int f11064e = C3406u.m8589a("subt");

    /* renamed from: f */
    public static final int f11065f = C3406u.m8589a("clcp");

    /* renamed from: g */
    public static final int f11066g = C3406u.m8589a("cenc");

    /* renamed from: h */
    public static final int f11067h = C3406u.m8589a("meta");

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b$a */
    public interface C3145a {
        /* renamed from: a */
        int mo14212a();

        /* renamed from: b */
        int mo14213b();

        /* renamed from: c */
        boolean mo14214c();
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b$b */
    public static final class C3146b {

        /* renamed from: a */
        public final C3158i[] f11068a;

        /* renamed from: b */
        public C3226i f11069b;

        /* renamed from: c */
        public int f11070c;

        /* renamed from: d */
        public int f11071d = 0;

        public C3146b(int i) {
            this.f11068a = new C3158i[i];
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b$c */
    public static final class C3147c implements C3145a {

        /* renamed from: a */
        public final int f11072a;

        /* renamed from: b */
        public final int f11073b;

        /* renamed from: c */
        public final C3393k f11074c;

        public C3147c(C3141a.C3143b bVar) {
            C3393k kVar = bVar.f11059P0;
            this.f11074c = kVar;
            kVar.mo14549e(12);
            this.f11072a = kVar.mo14560o();
            this.f11073b = kVar.mo14560o();
        }

        /* renamed from: a */
        public int mo14212a() {
            return this.f11073b;
        }

        /* renamed from: b */
        public int mo14213b() {
            int i = this.f11072a;
            return i == 0 ? this.f11074c.mo14560o() : i;
        }

        /* renamed from: c */
        public boolean mo14214c() {
            return this.f11072a != 0;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b$d */
    public static final class C3148d implements C3145a {

        /* renamed from: a */
        public final C3393k f11075a;

        /* renamed from: b */
        public final int f11076b;

        /* renamed from: c */
        public final int f11077c;

        /* renamed from: d */
        public int f11078d;

        /* renamed from: e */
        public int f11079e;

        public C3148d(C3141a.C3143b bVar) {
            C3393k kVar = bVar.f11059P0;
            this.f11075a = kVar;
            kVar.mo14549e(12);
            this.f11077c = kVar.mo14560o() & ValidationUtils.APPBOY_STRING_MAX_LENGTH;
            this.f11076b = kVar.mo14560o();
        }

        /* renamed from: a */
        public int mo14212a() {
            return this.f11076b;
        }

        /* renamed from: b */
        public int mo14213b() {
            int i = this.f11077c;
            if (i == 8) {
                return this.f11075a.mo14557l();
            }
            if (i == 16) {
                return this.f11075a.mo14562q();
            }
            int i2 = this.f11078d;
            this.f11078d = i2 + 1;
            if (i2 % 2 != 0) {
                return this.f11079e & 15;
            }
            int l = this.f11075a.mo14557l();
            this.f11079e = l;
            return (l & 240) >> 4;
        }

        /* renamed from: c */
        public boolean mo14214c() {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a3, code lost:
        if (r6 == 0) goto L_0x00a5;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3157h m7909a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.C3142a r38, com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.C3143b r39, long r40, com.fyber.inneractive.sdk.player.exoplayer2.drm.C3059a r42, boolean r43) throws com.fyber.inneractive.sdk.player.exoplayer2.C3230l {
        /*
            r0 = r38
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10973F
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a r1 = r0.mo14210c(r1)
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10997T
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r2 = r1.mo14211d(r2)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r2 = r2.f11059P0
            r3 = 16
            r2.mo14549e(r3)
            int r2 = r2.mo14544c()
            int r4 = f11061b
            r5 = 4
            r6 = -1
            if (r2 != r4) goto L_0x0022
            r2 = 1
            r9 = 1
            goto L_0x0046
        L_0x0022:
            int r4 = f11060a
            if (r2 != r4) goto L_0x0029
            r2 = 2
            r9 = 2
            goto L_0x0046
        L_0x0029:
            int r4 = f11062c
            if (r2 == r4) goto L_0x0044
            int r4 = f11063d
            if (r2 == r4) goto L_0x0044
            int r4 = f11064e
            if (r2 == r4) goto L_0x0044
            int r4 = f11065f
            if (r2 != r4) goto L_0x003a
            goto L_0x0044
        L_0x003a:
            int r4 = f11067h
            if (r2 != r4) goto L_0x0041
            r2 = 4
            r9 = 4
            goto L_0x0046
        L_0x0041:
            r2 = -1
            r9 = -1
            goto L_0x0046
        L_0x0044:
            r2 = 3
            r9 = 3
        L_0x0046:
            r2 = 0
            if (r9 != r6) goto L_0x004a
            return r2
        L_0x004a:
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10993P
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r2 = r0.mo14211d(r2)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r2 = r2.f11059P0
            r4 = 8
            r2.mo14549e(r4)
            int r7 = r2.mo14544c()
            int r7 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.m7903b(r7)
            if (r7 != 0) goto L_0x0064
            r8 = 8
            goto L_0x0066
        L_0x0064:
            r8 = 16
        L_0x0066:
            r2.mo14551f(r8)
            int r8 = r2.mo14544c()
            r2.mo14551f(r5)
            int r10 = r2.f12122b
            if (r7 != 0) goto L_0x0076
            r11 = 4
            goto L_0x0078
        L_0x0076:
            r11 = 8
        L_0x0078:
            r12 = 0
        L_0x0079:
            if (r12 >= r11) goto L_0x0088
            byte[] r13 = r2.f12121a
            int r14 = r10 + r12
            byte r13 = r13[r14]
            if (r13 == r6) goto L_0x0085
            r6 = 0
            goto L_0x0089
        L_0x0085:
            int r12 = r12 + 1
            goto L_0x0079
        L_0x0088:
            r6 = 1
        L_0x0089:
            r12 = 0
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r6 == 0) goto L_0x0096
            r2.mo14551f(r11)
            goto L_0x00a5
        L_0x0096:
            if (r7 != 0) goto L_0x009d
            long r6 = r2.mo14558m()
            goto L_0x00a1
        L_0x009d:
            long r6 = r2.mo14561p()
        L_0x00a1:
            int r10 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r10 != 0) goto L_0x00a6
        L_0x00a5:
            r6 = r14
        L_0x00a6:
            r2.mo14551f(r3)
            int r3 = r2.mo14544c()
            int r10 = r2.mo14544c()
            r2.mo14551f(r5)
            int r5 = r2.mo14544c()
            int r2 = r2.mo14544c()
            r11 = 65536(0x10000, float:9.18355E-41)
            r12 = -65536(0xffffffffffff0000, float:NaN)
            if (r3 != 0) goto L_0x00cb
            if (r10 != r11) goto L_0x00cb
            if (r5 != r12) goto L_0x00cb
            if (r2 != 0) goto L_0x00cb
            r2 = 90
            goto L_0x00e2
        L_0x00cb:
            if (r3 != 0) goto L_0x00d6
            if (r10 != r12) goto L_0x00d6
            if (r5 != r11) goto L_0x00d6
            if (r2 != 0) goto L_0x00d6
            r2 = 270(0x10e, float:3.78E-43)
            goto L_0x00e2
        L_0x00d6:
            if (r3 != r12) goto L_0x00e1
            if (r10 != 0) goto L_0x00e1
            if (r5 != 0) goto L_0x00e1
            if (r2 != r12) goto L_0x00e1
            r2 = 180(0xb4, float:2.52E-43)
            goto L_0x00e2
        L_0x00e1:
            r2 = 0
        L_0x00e2:
            int r3 = (r40 > r14 ? 1 : (r40 == r14 ? 0 : -1))
            if (r3 != 0) goto L_0x00eb
            r3 = r39
            r18 = r6
            goto L_0x00ef
        L_0x00eb:
            r3 = r39
            r18 = r40
        L_0x00ef:
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r3 = r3.f11059P0
            r3.mo14549e(r4)
            int r5 = r3.mo14544c()
            int r5 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.m7903b(r5)
            if (r5 != 0) goto L_0x0101
            r5 = 8
            goto L_0x0103
        L_0x0101:
            r5 = 16
        L_0x0103:
            r3.mo14551f(r5)
            long r12 = r3.mo14558m()
            int r3 = (r18 > r14 ? 1 : (r18 == r14 ? 0 : -1))
            if (r3 != 0) goto L_0x010f
            goto L_0x0119
        L_0x010f:
            r20 = 1000000(0xf4240, double:4.940656E-318)
            r22 = r12
            long r5 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.m8591a((long) r18, (long) r20, (long) r22)
            r14 = r5
        L_0x0119:
            int r3 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10975G
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a r3 = r1.mo14210c(r3)
            int r5 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10977H
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a r3 = r3.mo14210c(r5)
            int r5 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10996S
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r1 = r1.mo14211d(r5)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r1 = r1.f11059P0
            r1.mo14549e(r4)
            int r4 = r1.mo14544c()
            int r4 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.m7903b(r4)
            if (r4 != 0) goto L_0x013d
            r5 = 8
            goto L_0x013f
        L_0x013d:
            r5 = 16
        L_0x013f:
            r1.mo14551f(r5)
            long r5 = r1.mo14558m()
            if (r4 != 0) goto L_0x014a
            r4 = 4
            goto L_0x014c
        L_0x014a:
            r4 = 8
        L_0x014c:
            r1.mo14551f(r4)
            int r1 = r1.mo14562q()
            java.lang.String r4 = ""
            java.lang.StringBuilder r4 = p379.C13555b.m33972k(r4)
            int r7 = r1 >> 10
            r7 = r7 & 31
            int r7 = r7 + 96
            char r7 = (char) r7
            r4.append(r7)
            int r7 = r1 >> 5
            r7 = r7 & 31
            int r7 = r7 + 96
            char r7 = (char) r7
            r4.append(r7)
            r1 = r1 & 31
            int r1 = r1 + 96
            char r1 = (char) r1
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            java.lang.Long r4 = java.lang.Long.valueOf(r5)
            android.util.Pair r1 = android.util.Pair.create(r4, r1)
            int r4 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10998U
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r3 = r3.mo14211d(r4)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r3 = r3.f11059P0
            java.lang.Object r4 = r1.second
            java.lang.String r4 = (java.lang.String) r4
            r5 = 12
            r3.mo14549e(r5)
            int r5 = r3.mo14544c()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b$b r6 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b$b
            r6.<init>(r5)
            r7 = 0
        L_0x019c:
            if (r7 >= r5) goto L_0x06e3
            int r10 = r3.f12122b
            int r11 = r3.mo14544c()
            if (r11 <= 0) goto L_0x01ae
            r18 = 1
            r39 = r5
            r40 = r14
            r5 = 1
            goto L_0x01b5
        L_0x01ae:
            r18 = 0
            r39 = r5
            r40 = r14
            r5 = 0
        L_0x01b5:
            java.lang.String r14 = "childAtomSize should be positive"
            com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a.m8506a(r5, r14)
            int r5 = r3.mo14544c()
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11007c
            if (r5 == r15) goto L_0x0547
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11009d
            if (r5 == r15) goto L_0x0547
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11004a0
            if (r5 == r15) goto L_0x0547
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11026l0
            if (r5 == r15) goto L_0x0547
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11011e
            if (r5 == r15) goto L_0x0547
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11013f
            if (r5 == r15) goto L_0x0547
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11015g
            if (r5 == r15) goto L_0x0547
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10984K0
            if (r5 == r15) goto L_0x0547
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10986L0
            if (r5 != r15) goto L_0x01e4
            goto L_0x0547
        L_0x01e4:
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11021j
            if (r5 == r15) goto L_0x02cb
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11006b0
            if (r5 == r15) goto L_0x02cb
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11031o
            if (r5 == r15) goto L_0x02cb
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11035q
            if (r5 == r15) goto L_0x02cb
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11039s
            if (r5 == r15) goto L_0x02cb
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11045v
            if (r5 == r15) goto L_0x02cb
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11041t
            if (r5 == r15) goto L_0x02cb
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11043u
            if (r5 == r15) goto L_0x02cb
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11052y0
            if (r5 == r15) goto L_0x02cb
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11054z0
            if (r5 == r15) goto L_0x02cb
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11027m
            if (r5 == r15) goto L_0x02cb
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11029n
            if (r5 == r15) goto L_0x02cb
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11023k
            if (r5 == r15) goto L_0x02cb
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10992O0
            if (r5 != r15) goto L_0x021e
            goto L_0x02cb
        L_0x021e:
            int r14 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11024k0
            if (r5 == r14) goto L_0x0251
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11044u0
            if (r5 == r15) goto L_0x0251
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11046v0
            if (r5 == r15) goto L_0x0251
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11048w0
            if (r5 == r15) goto L_0x0251
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11050x0
            if (r5 != r15) goto L_0x0233
            goto L_0x0251
        L_0x0233:
            int r14 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10990N0
            if (r5 != r14) goto L_0x024b
            java.lang.String r5 = java.lang.Integer.toString(r8)
            java.lang.String r14 = "application/x-camera-motion"
            r15 = -1
            r33 = r12
            r12 = 0
            r13 = r42
            com.fyber.inneractive.sdk.player.exoplayer2.i r5 = com.fyber.inneractive.sdk.player.exoplayer2.C3226i.m8181a(r5, r14, r12, r15, r13)
            r6.f11069b = r5
            goto L_0x0309
        L_0x024b:
            r33 = r12
            r13 = r42
            goto L_0x0309
        L_0x0251:
            r33 = r12
            r13 = r42
            int r12 = r10 + 8
            int r12 = r12 + 8
            r3.mo14549e(r12)
            r18 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.String r12 = "application/ttml+xml"
            if (r5 != r14) goto L_0x026d
            r5 = 0
        L_0x0266:
            r28 = r5
            r26 = r18
            r19 = r12
            goto L_0x02ae
        L_0x026d:
            int r14 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11044u0
            if (r5 != r14) goto L_0x028b
            int r5 = r11 + -8
            int r5 = r5 + -8
            byte[] r12 = new byte[r5]
            byte[] r14 = r3.f12121a
            int r15 = r3.f12122b
            r13 = 0
            java.lang.System.arraycopy(r14, r15, r12, r13, r5)
            int r13 = r3.f12122b
            int r13 = r13 + r5
            r3.f12122b = r13
            java.util.List r5 = java.util.Collections.singletonList(r12)
            java.lang.String r12 = "application/x-quicktime-tx3g"
            goto L_0x0266
        L_0x028b:
            int r13 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11046v0
            if (r5 != r13) goto L_0x0292
            java.lang.String r5 = "application/x-mp4-vtt"
            goto L_0x02a7
        L_0x0292:
            int r13 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11048w0
            if (r5 != r13) goto L_0x029e
            r5 = 0
            r28 = r5
            r19 = r12
            r26 = 0
            goto L_0x02ae
        L_0x029e:
            int r12 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11050x0
            if (r5 != r12) goto L_0x02c5
            r5 = 1
            r6.f11071d = r5
            java.lang.String r5 = "application/x-mp4-cea-608"
        L_0x02a7:
            r12 = 0
            r28 = r12
            r26 = r18
            r19 = r5
        L_0x02ae:
            java.lang.String r18 = java.lang.Integer.toString(r8)
            r20 = 0
            r21 = -1
            r22 = 0
            r24 = -1
            r23 = r4
            r25 = r42
            com.fyber.inneractive.sdk.player.exoplayer2.i r5 = com.fyber.inneractive.sdk.player.exoplayer2.C3226i.m8179a(r18, r19, r20, r21, r22, r23, r24, r25, r26, r28)
            r6.f11069b = r5
            goto L_0x0309
        L_0x02c5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x02cb:
            r33 = r12
            int r12 = r10 + 8
            r13 = 8
            int r12 = r12 + r13
            r3.mo14549e(r12)
            r12 = 6
            if (r43 == 0) goto L_0x02e0
            int r13 = r3.mo14562q()
            r3.mo14551f(r12)
            goto L_0x02e4
        L_0x02e0:
            r3.mo14551f(r13)
            r13 = 0
        L_0x02e4:
            if (r13 == 0) goto L_0x0311
            r12 = 1
            if (r13 != r12) goto L_0x02ea
            goto L_0x0311
        L_0x02ea:
            r12 = 2
            if (r13 != r12) goto L_0x0309
            r12 = 16
            r3.mo14551f(r12)
            long r12 = r3.mo14554i()
            double r12 = java.lang.Double.longBitsToDouble(r12)
            long r12 = java.lang.Math.round(r12)
            int r13 = (int) r12
            int r12 = r3.mo14560o()
            r15 = 20
            r3.mo14551f(r15)
            goto L_0x033d
        L_0x0309:
            r36 = r1
            r37 = r2
            r35 = r9
            goto L_0x06cd
        L_0x0311:
            int r12 = r3.mo14562q()
            r15 = 6
            r3.mo14551f(r15)
            byte[] r15 = r3.f12121a
            r18 = r12
            int r12 = r3.f12122b
            int r19 = r12 + 1
            byte r12 = r15[r12]
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r12 = r12 << 8
            int r20 = r19 + 1
            byte r15 = r15[r19]
            r15 = r15 & 255(0xff, float:3.57E-43)
            r12 = r12 | r15
            int r15 = r20 + 2
            r3.f12122b = r15
            r15 = 1
            if (r13 != r15) goto L_0x033a
            r13 = 16
            r3.mo14551f(r13)
        L_0x033a:
            r13 = r12
            r12 = r18
        L_0x033d:
            int r15 = r3.f12122b
            r18 = r12
            int r12 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11006b0
            if (r5 != r12) goto L_0x034c
            int r5 = m7907a((com.fyber.inneractive.sdk.player.exoplayer2.util.C3393k) r3, (int) r10, (int) r11, (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3144b.C3146b) r6, (int) r7)
            r3.mo14549e(r15)
        L_0x034c:
            int r12 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11031o
            r19 = r13
            java.lang.String r13 = "audio/raw"
            if (r5 != r12) goto L_0x0357
            java.lang.String r5 = "audio/ac3"
            goto L_0x03a0
        L_0x0357:
            int r12 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11035q
            if (r5 != r12) goto L_0x035e
            java.lang.String r5 = "audio/eac3"
            goto L_0x03a0
        L_0x035e:
            int r12 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11039s
            if (r5 != r12) goto L_0x0365
            java.lang.String r5 = "audio/vnd.dts"
            goto L_0x03a0
        L_0x0365:
            int r12 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11041t
            if (r5 == r12) goto L_0x039e
            int r12 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11043u
            if (r5 != r12) goto L_0x036e
            goto L_0x039e
        L_0x036e:
            int r12 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11045v
            if (r5 != r12) goto L_0x0375
            java.lang.String r5 = "audio/vnd.dts.hd;profile=lbr"
            goto L_0x03a0
        L_0x0375:
            int r12 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11052y0
            if (r5 != r12) goto L_0x037c
            java.lang.String r5 = "audio/3gpp"
            goto L_0x03a0
        L_0x037c:
            int r12 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11054z0
            if (r5 != r12) goto L_0x0383
            java.lang.String r5 = "audio/amr-wb"
            goto L_0x03a0
        L_0x0383:
            int r12 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11027m
            if (r5 == r12) goto L_0x039c
            int r12 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11029n
            if (r5 != r12) goto L_0x038c
            goto L_0x039c
        L_0x038c:
            int r12 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11023k
            if (r5 != r12) goto L_0x0393
            java.lang.String r5 = "audio/mpeg"
            goto L_0x03a0
        L_0x0393:
            int r12 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10992O0
            if (r5 != r12) goto L_0x039a
            java.lang.String r5 = "audio/alac"
            goto L_0x03a0
        L_0x039a:
            r5 = 0
            goto L_0x03a0
        L_0x039c:
            r5 = r13
            goto L_0x03a0
        L_0x039e:
            java.lang.String r5 = "audio/vnd.dts.hd"
        L_0x03a0:
            r12 = 0
            r35 = r9
            r30 = r18
            r31 = r19
        L_0x03a7:
            int r9 = r15 - r10
            if (r9 >= r11) goto L_0x0508
            r3.mo14549e(r15)
            int r9 = r3.mo14544c()
            if (r9 <= 0) goto L_0x03ba
            r18 = 1
            r36 = r1
            r1 = 1
            goto L_0x03bf
        L_0x03ba:
            r18 = 0
            r36 = r1
            r1 = 0
        L_0x03bf:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a.m8506a(r1, r14)
            int r1 = r3.mo14544c()
            int r0 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10983K
            r37 = r2
            if (r1 == r0) goto L_0x04a3
            if (r43 == 0) goto L_0x03d4
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11025l
            if (r1 != r2) goto L_0x03d4
            goto L_0x04a3
        L_0x03d4:
            int r0 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11033p
            if (r1 != r0) goto L_0x041b
            int r0 = r15 + 8
            r3.mo14549e(r0)
            java.lang.String r18 = java.lang.Integer.toString(r8)
            int r0 = r3.mo14557l()
            r0 = r0 & 192(0xc0, float:2.69E-43)
            int r0 = r0 >> 6
            int[] r1 = com.fyber.inneractive.sdk.player.exoplayer2.audio.C3035a.f10376b
            r24 = r1[r0]
            int r0 = r3.mo14557l()
            int[] r1 = com.fyber.inneractive.sdk.player.exoplayer2.audio.C3035a.f10378d
            r2 = r0 & 56
            int r2 = r2 >> 3
            r1 = r1[r2]
            r0 = r0 & 4
            if (r0 == 0) goto L_0x03ff
            int r1 = r1 + 1
        L_0x03ff:
            r23 = r1
            r20 = 0
            r21 = -1
            r22 = -1
            r25 = -1
            r26 = 0
            r28 = 0
            java.lang.String r19 = "audio/ac3"
            r27 = r42
            r29 = r4
            com.fyber.inneractive.sdk.player.exoplayer2.i r0 = com.fyber.inneractive.sdk.player.exoplayer2.C3226i.m8178a((java.lang.String) r18, (java.lang.String) r19, (java.lang.String) r20, (int) r21, (int) r22, (int) r23, (int) r24, (int) r25, (java.util.List<byte[]>) r26, (com.fyber.inneractive.sdk.player.exoplayer2.drm.C3059a) r27, (int) r28, (java.lang.String) r29)
            r6.f11069b = r0
            goto L_0x04a0
        L_0x041b:
            int r0 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11037r
            if (r1 != r0) goto L_0x0465
            int r0 = r15 + 8
            r3.mo14549e(r0)
            java.lang.String r18 = java.lang.Integer.toString(r8)
            r0 = 2
            r3.mo14551f(r0)
            int r0 = r3.mo14557l()
            r0 = r0 & 192(0xc0, float:2.69E-43)
            int r0 = r0 >> 6
            int[] r1 = com.fyber.inneractive.sdk.player.exoplayer2.audio.C3035a.f10376b
            r24 = r1[r0]
            int r0 = r3.mo14557l()
            int[] r1 = com.fyber.inneractive.sdk.player.exoplayer2.audio.C3035a.f10378d
            r2 = r0 & 14
            int r2 = r2 >> 1
            r1 = r1[r2]
            r0 = r0 & 1
            if (r0 == 0) goto L_0x044a
            int r1 = r1 + 1
        L_0x044a:
            r23 = r1
            r20 = 0
            r21 = -1
            r22 = -1
            r25 = -1
            r26 = 0
            r28 = 0
            java.lang.String r19 = "audio/eac3"
            r27 = r42
            r29 = r4
            com.fyber.inneractive.sdk.player.exoplayer2.i r0 = com.fyber.inneractive.sdk.player.exoplayer2.C3226i.m8178a((java.lang.String) r18, (java.lang.String) r19, (java.lang.String) r20, (int) r21, (int) r22, (int) r23, (int) r24, (int) r25, (java.util.List<byte[]>) r26, (com.fyber.inneractive.sdk.player.exoplayer2.drm.C3059a) r27, (int) r28, (java.lang.String) r29)
            r6.f11069b = r0
            goto L_0x04a0
        L_0x0465:
            int r0 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11047w
            if (r1 != r0) goto L_0x048a
            java.lang.String r18 = java.lang.Integer.toString(r8)
            r20 = 0
            r21 = -1
            r22 = -1
            r25 = -1
            r26 = 0
            r28 = 0
            r19 = r5
            r23 = r30
            r24 = r31
            r27 = r42
            r29 = r4
            com.fyber.inneractive.sdk.player.exoplayer2.i r0 = com.fyber.inneractive.sdk.player.exoplayer2.C3226i.m8178a((java.lang.String) r18, (java.lang.String) r19, (java.lang.String) r20, (int) r21, (int) r22, (int) r23, (int) r24, (int) r25, (java.util.List<byte[]>) r26, (com.fyber.inneractive.sdk.player.exoplayer2.drm.C3059a) r27, (int) r28, (java.lang.String) r29)
            r6.f11069b = r0
            goto L_0x04a0
        L_0x048a:
            int r0 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10992O0
            if (r1 != r0) goto L_0x04a0
            byte[] r12 = new byte[r9]
            r3.mo14549e(r15)
            byte[] r0 = r3.f12121a
            int r1 = r3.f12122b
            r2 = 0
            java.lang.System.arraycopy(r0, r1, r12, r2, r9)
            int r0 = r3.f12122b
            int r0 = r0 + r9
            r3.f12122b = r0
        L_0x04a0:
            r18 = r14
            goto L_0x04fd
        L_0x04a3:
            r2 = 0
            if (r1 != r0) goto L_0x04aa
            r18 = r14
            r0 = r15
            goto L_0x04d0
        L_0x04aa:
            int r0 = r3.f12122b
        L_0x04ac:
            int r1 = r0 - r15
            if (r1 >= r9) goto L_0x04cd
            r3.mo14549e(r0)
            int r1 = r3.mo14544c()
            if (r1 <= 0) goto L_0x04ba
            r2 = 1
        L_0x04ba:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a.m8506a(r2, r14)
            int r2 = r3.mo14544c()
            r18 = r14
            int r14 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10983K
            if (r2 != r14) goto L_0x04c8
            goto L_0x04d0
        L_0x04c8:
            int r0 = r0 + r1
            r2 = 0
            r14 = r18
            goto L_0x04ac
        L_0x04cd:
            r18 = r14
            r0 = -1
        L_0x04d0:
            r1 = -1
            if (r0 == r1) goto L_0x04fd
            android.util.Pair r0 = m7908a(r3, r0)
            java.lang.Object r1 = r0.first
            r5 = r1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r0 = r0.second
            byte[] r0 = (byte[]) r0
            java.lang.String r1 = "audio/mp4a-latm"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x04fc
            android.util.Pair r1 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3383c.m8512a((byte[]) r0)
            java.lang.Object r2 = r1.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r31 = r2.intValue()
            java.lang.Object r1 = r1.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r30 = r1.intValue()
        L_0x04fc:
            r12 = r0
        L_0x04fd:
            int r15 = r15 + r9
            r0 = r38
            r14 = r18
            r1 = r36
            r2 = r37
            goto L_0x03a7
        L_0x0508:
            r36 = r1
            r37 = r2
            com.fyber.inneractive.sdk.player.exoplayer2.i r0 = r6.f11069b
            if (r0 != 0) goto L_0x06cd
            if (r5 == 0) goto L_0x06cd
            boolean r0 = r13.equals(r5)
            if (r0 == 0) goto L_0x051c
            r0 = 2
            r25 = 2
            goto L_0x051f
        L_0x051c:
            r0 = -1
            r25 = -1
        L_0x051f:
            java.lang.String r18 = java.lang.Integer.toString(r8)
            r20 = 0
            r21 = -1
            r22 = -1
            if (r12 != 0) goto L_0x052d
            r0 = 0
            goto L_0x0531
        L_0x052d:
            java.util.List r0 = java.util.Collections.singletonList(r12)
        L_0x0531:
            r26 = r0
            r28 = 0
            r19 = r5
            r23 = r30
            r24 = r31
            r27 = r42
            r29 = r4
            com.fyber.inneractive.sdk.player.exoplayer2.i r0 = com.fyber.inneractive.sdk.player.exoplayer2.C3226i.m8178a((java.lang.String) r18, (java.lang.String) r19, (java.lang.String) r20, (int) r21, (int) r22, (int) r23, (int) r24, (int) r25, (java.util.List<byte[]>) r26, (com.fyber.inneractive.sdk.player.exoplayer2.drm.C3059a) r27, (int) r28, (java.lang.String) r29)
            r6.f11069b = r0
            goto L_0x06cd
        L_0x0547:
            r36 = r1
            r37 = r2
            r35 = r9
            r33 = r12
            r18 = r14
            int r0 = r10 + 8
            int r0 = r0 + 8
            r3.mo14549e(r0)
            r0 = 16
            r3.mo14551f(r0)
            int r23 = r3.mo14562q()
            int r24 = r3.mo14562q()
            r0 = 50
            r3.mo14551f(r0)
            int r0 = r3.f12122b
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11004a0
            if (r5 != r1) goto L_0x0577
            int r5 = m7907a((com.fyber.inneractive.sdk.player.exoplayer2.util.C3393k) r3, (int) r10, (int) r11, (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3144b.C3146b) r6, (int) r7)
            r3.mo14549e(r0)
        L_0x0577:
            r1 = 0
            r2 = 0
            r9 = 0
            r12 = 1065353216(0x3f800000, float:1.0)
            r13 = 0
            r14 = -1
            r19 = r2
            r26 = r9
            r29 = r13
            r28 = 1065353216(0x3f800000, float:1.0)
            r30 = -1
        L_0x0588:
            int r2 = r0 - r10
            if (r2 >= r11) goto L_0x06b2
            r3.mo14549e(r0)
            int r2 = r3.f12122b
            int r9 = r3.mo14544c()
            if (r9 != 0) goto L_0x059e
            int r12 = r3.f12122b
            int r12 = r12 - r10
            if (r12 != r11) goto L_0x059e
            goto L_0x06b2
        L_0x059e:
            if (r9 <= 0) goto L_0x05a2
            r12 = 1
            goto L_0x05a3
        L_0x05a2:
            r12 = 0
        L_0x05a3:
            r13 = r18
            com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a.m8506a(r12, r13)
            int r12 = r3.mo14544c()
            int r14 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10979I
            if (r12 != r14) goto L_0x05d1
            if (r19 != 0) goto L_0x05b4
            r12 = 1
            goto L_0x05b5
        L_0x05b4:
            r12 = 0
        L_0x05b5:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a.m8507b(r12)
            int r2 = r2 + 8
            r3.mo14549e(r2)
            com.fyber.inneractive.sdk.player.exoplayer2.video.a r2 = com.fyber.inneractive.sdk.player.exoplayer2.video.C3417a.m8631b(r3)
            java.util.List<byte[]> r12 = r2.f12209a
            int r14 = r2.f12210b
            r6.f11070c = r14
            if (r1 != 0) goto L_0x05cd
            float r2 = r2.f12213e
            r28 = r2
        L_0x05cd:
            java.lang.String r2 = "video/avc"
            goto L_0x05ef
        L_0x05d1:
            int r14 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10981J
            if (r12 != r14) goto L_0x05f7
            if (r19 != 0) goto L_0x05d9
            r12 = 1
            goto L_0x05da
        L_0x05d9:
            r12 = 0
        L_0x05da:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a.m8507b(r12)
            int r2 = r2 + 8
            r3.mo14549e(r2)
            com.fyber.inneractive.sdk.player.exoplayer2.video.c r2 = com.fyber.inneractive.sdk.player.exoplayer2.video.C3420c.m8632a(r3)
            java.util.List<byte[]> r12 = r2.f12219a
            int r2 = r2.f12220b
            r6.f11070c = r2
            java.lang.String r2 = "video/hevc"
        L_0x05ef:
            r19 = r2
            r26 = r12
        L_0x05f3:
            r18 = r1
            goto L_0x06ab
        L_0x05f7:
            int r14 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10988M0
            if (r12 != r14) goto L_0x060f
            if (r19 != 0) goto L_0x05ff
            r2 = 1
            goto L_0x0600
        L_0x05ff:
            r2 = 0
        L_0x0600:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a.m8507b(r2)
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10984K0
            if (r5 != r2) goto L_0x060b
            java.lang.String r2 = "video/x-vnd.on2.vp8"
            goto L_0x061e
        L_0x060b:
            java.lang.String r2 = "video/x-vnd.on2.vp9"
            goto L_0x061e
        L_0x060f:
            int r14 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11017h
            if (r12 != r14) goto L_0x0621
            if (r19 != 0) goto L_0x0617
            r2 = 1
            goto L_0x0618
        L_0x0617:
            r2 = 0
        L_0x0618:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a.m8507b(r2)
            java.lang.String r2 = "video/3gpp"
        L_0x061e:
            r19 = r2
            goto L_0x05f3
        L_0x0621:
            int r14 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10983K
            if (r12 != r14) goto L_0x063e
            if (r19 != 0) goto L_0x0629
            r12 = 1
            goto L_0x062a
        L_0x0629:
            r12 = 0
        L_0x062a:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a.m8507b(r12)
            android.util.Pair r2 = m7908a(r3, r2)
            java.lang.Object r12 = r2.first
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r2 = r2.second
            java.util.List r26 = java.util.Collections.singletonList(r2)
            r19 = r12
            goto L_0x05f3
        L_0x063e:
            int r14 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11022j0
            if (r12 != r14) goto L_0x0655
            int r2 = r2 + 8
            r3.mo14549e(r2)
            int r1 = r3.mo14560o()
            int r2 = r3.mo14560o()
            float r1 = (float) r1
            float r2 = (float) r2
            float r28 = r1 / r2
            r1 = 1
            goto L_0x06ad
        L_0x0655:
            int r14 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10980I0
            if (r12 != r14) goto L_0x0681
            int r12 = r2 + 8
        L_0x065b:
            int r14 = r12 - r2
            if (r14 >= r9) goto L_0x067c
            r3.mo14549e(r12)
            int r14 = r3.mo14544c()
            int r15 = r3.mo14544c()
            r18 = r1
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10982J0
            if (r15 != r1) goto L_0x0678
            byte[] r1 = r3.f12121a
            int r14 = r14 + r12
            byte[] r29 = java.util.Arrays.copyOfRange(r1, r12, r14)
            goto L_0x06ab
        L_0x0678:
            int r12 = r12 + r14
            r1 = r18
            goto L_0x065b
        L_0x067c:
            r18 = r1
            r29 = 0
            goto L_0x06ad
        L_0x0681:
            r18 = r1
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10978H0
            if (r12 != r1) goto L_0x06ab
            int r1 = r3.mo14557l()
            r2 = 3
            r3.mo14551f(r2)
            if (r1 != 0) goto L_0x06ab
            int r1 = r3.mo14557l()
            if (r1 == 0) goto L_0x06a9
            r12 = 1
            if (r1 == r12) goto L_0x06a6
            r12 = 2
            if (r1 == r12) goto L_0x06a3
            if (r1 == r2) goto L_0x06a0
            goto L_0x06ab
        L_0x06a0:
            r30 = 3
            goto L_0x06ab
        L_0x06a3:
            r30 = 2
            goto L_0x06ab
        L_0x06a6:
            r30 = 1
            goto L_0x06ab
        L_0x06a9:
            r30 = 0
        L_0x06ab:
            r1 = r18
        L_0x06ad:
            int r0 = r0 + r9
            r18 = r13
            goto L_0x0588
        L_0x06b2:
            if (r19 != 0) goto L_0x06b5
            goto L_0x06cd
        L_0x06b5:
            java.lang.String r18 = java.lang.Integer.toString(r8)
            r20 = 0
            r21 = -1
            r22 = -1
            r25 = -1082130432(0xffffffffbf800000, float:-1.0)
            r31 = 0
            r27 = r37
            r32 = r42
            com.fyber.inneractive.sdk.player.exoplayer2.i r0 = com.fyber.inneractive.sdk.player.exoplayer2.C3226i.m8176a((java.lang.String) r18, (java.lang.String) r19, (java.lang.String) r20, (int) r21, (int) r22, (int) r23, (int) r24, (float) r25, (java.util.List<byte[]>) r26, (int) r27, (float) r28, (byte[]) r29, (int) r30, (com.fyber.inneractive.sdk.player.exoplayer2.video.C3418b) r31, (com.fyber.inneractive.sdk.player.exoplayer2.drm.C3059a) r32)
            r6.f11069b = r0
        L_0x06cd:
            int r10 = r10 + r11
            r3.mo14549e(r10)
            int r7 = r7 + 1
            r0 = r38
            r5 = r39
            r14 = r40
            r12 = r33
            r9 = r35
            r1 = r36
            r2 = r37
            goto L_0x019c
        L_0x06e3:
            r36 = r1
            r35 = r9
            r33 = r12
            r40 = r14
            int r0 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10994Q
            r1 = r38
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a r0 = r1.mo14210c(r0)
            if (r0 == 0) goto L_0x0762
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10995R
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r0 = r0.mo14211d(r1)
            if (r0 != 0) goto L_0x06fe
            goto L_0x0762
        L_0x06fe:
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r0 = r0.f11059P0
            r1 = 8
            r0.mo14549e(r1)
            int r1 = r0.mo14544c()
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.m7903b(r1)
            int r2 = r0.mo14560o()
            long[] r3 = new long[r2]
            long[] r4 = new long[r2]
            r5 = 0
        L_0x0716:
            if (r5 >= r2) goto L_0x075c
            r7 = 1
            if (r1 != r7) goto L_0x0720
            long r9 = r0.mo14561p()
            goto L_0x0724
        L_0x0720:
            long r9 = r0.mo14558m()
        L_0x0724:
            r3[r5] = r9
            if (r1 != r7) goto L_0x072d
            long r9 = r0.mo14554i()
            goto L_0x0732
        L_0x072d:
            int r7 = r0.mo14544c()
            long r9 = (long) r7
        L_0x0732:
            r4[r5] = r9
            byte[] r7 = r0.f12121a
            int r9 = r0.f12122b
            int r10 = r9 + 1
            byte r9 = r7[r9]
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r9 = r9 << 8
            int r11 = r10 + 1
            r0.f12122b = r11
            byte r7 = r7[r10]
            r7 = r7 & 255(0xff, float:3.57E-43)
            r7 = r7 | r9
            short r7 = (short) r7
            r9 = 1
            if (r7 != r9) goto L_0x0754
            r7 = 2
            r0.mo14551f(r7)
            int r5 = r5 + 1
            goto L_0x0716
        L_0x0754:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported media rate."
            r0.<init>(r1)
            throw r0
        L_0x075c:
            android.util.Pair r0 = android.util.Pair.create(r3, r4)
            r1 = 0
            goto L_0x0767
        L_0x0762:
            r1 = 0
            android.util.Pair r0 = android.util.Pair.create(r1, r1)
        L_0x0767:
            com.fyber.inneractive.sdk.player.exoplayer2.i r2 = r6.f11069b
            if (r2 != 0) goto L_0x076c
            goto L_0x079e
        L_0x076c:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.h r1 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.h
            r2 = r36
            java.lang.Object r2 = r2.first
            java.lang.Long r2 = (java.lang.Long) r2
            long r10 = r2.longValue()
            com.fyber.inneractive.sdk.player.exoplayer2.i r2 = r6.f11069b
            int r3 = r6.f11071d
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.i[] r4 = r6.f11068a
            int r5 = r6.f11070c
            java.lang.Object r6 = r0.first
            r20 = r6
            long[] r20 = (long[]) r20
            java.lang.Object r0 = r0.second
            r21 = r0
            long[] r21 = (long[]) r21
            r7 = r1
            r9 = r35
            r12 = r33
            r14 = r40
            r16 = r2
            r17 = r3
            r18 = r4
            r19 = r5
            r7.<init>(r8, r9, r10, r12, r14, r16, r17, r18, r19, r20, r21)
        L_0x079e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3144b.m7909a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a, com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b, long, com.fyber.inneractive.sdk.player.exoplayer2.drm.a, boolean):com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.h");
    }

    /* renamed from: a */
    public static int m7907a(C3393k kVar, int i, int i2, C3146b bVar, int i3) {
        C3393k kVar2 = kVar;
        int i4 = kVar2.f12122b;
        while (true) {
            boolean z = false;
            if (i4 - i >= i2) {
                return 0;
            }
            kVar2.mo14549e(i4);
            int c = kVar.mo14544c();
            int i5 = 1;
            C3380a.m8506a(c > 0, "childAtomSize should be positive");
            if (kVar.mo14544c() == C3141a.f11000W) {
                int i6 = i4 + 8;
                Pair pair = null;
                Integer num = null;
                C3158i iVar = null;
                boolean z2 = false;
                while (i6 - i4 < c) {
                    kVar2.mo14549e(i6);
                    int c2 = kVar.mo14544c();
                    int c3 = kVar.mo14544c();
                    if (c3 == C3141a.f11008c0) {
                        num = Integer.valueOf(kVar.mo14544c());
                    } else if (c3 == C3141a.f11001X) {
                        kVar2.mo14551f(4);
                        z2 = kVar.mo14544c() == f11066g;
                    } else if (c3 == C3141a.f11002Y) {
                        int i7 = i6 + 8;
                        while (true) {
                            if (i7 - i6 >= c2) {
                                iVar = null;
                                break;
                            }
                            kVar2.mo14549e(i7);
                            int c4 = kVar.mo14544c();
                            if (kVar.mo14544c() == C3141a.f11003Z) {
                                kVar2.mo14551f(6);
                                boolean z3 = kVar.mo14557l() == i5;
                                int l = kVar.mo14557l();
                                byte[] bArr = new byte[16];
                                System.arraycopy(kVar2.f12121a, kVar2.f12122b, bArr, 0, 16);
                                kVar2.f12122b += 16;
                                iVar = new C3158i(z3, l, bArr);
                            } else {
                                i7 += c4;
                                i5 = 1;
                            }
                        }
                    }
                    i6 += c2;
                    i5 = 1;
                }
                if (z2) {
                    C3380a.m8506a(num != null, "frma atom is mandatory");
                    if (iVar != null) {
                        z = true;
                    }
                    C3380a.m8506a(z, "schi->tenc atom is mandatory");
                    pair = Pair.create(num, iVar);
                }
                if (pair != null) {
                    bVar.f11068a[i3] = (C3158i) pair.second;
                    return ((Integer) pair.first).intValue();
                }
            }
            C3146b bVar2 = bVar;
            i4 += c;
        }
    }

    /* renamed from: a */
    public static Pair<String, byte[]> m7908a(C3393k kVar, int i) {
        kVar.mo14549e(i + 8 + 4);
        kVar.mo14551f(1);
        m7906a(kVar);
        kVar.mo14551f(2);
        int l = kVar.mo14557l();
        if ((l & RecyclerView.C1119a0.FLAG_IGNORE) != 0) {
            kVar.mo14551f(2);
        }
        if ((l & 64) != 0) {
            kVar.mo14551f(kVar.mo14562q());
        }
        if ((l & 32) != 0) {
            kVar.mo14551f(2);
        }
        kVar.mo14551f(1);
        m7906a(kVar);
        int l2 = kVar.mo14557l();
        String str = null;
        if (l2 == 32) {
            str = "video/mp4v-es";
        } else if (l2 == 33) {
            str = "video/avc";
        } else if (l2 != 35) {
            if (l2 != 64) {
                if (l2 == 107) {
                    return Pair.create("audio/mpeg", (Object) null);
                }
                if (l2 == 165) {
                    str = "audio/ac3";
                } else if (l2 != 166) {
                    switch (l2) {
                        case 102:
                        case 103:
                        case 104:
                            break;
                        default:
                            switch (l2) {
                                case 169:
                                case 172:
                                    return Pair.create("audio/vnd.dts", (Object) null);
                                case 170:
                                case 171:
                                    return Pair.create("audio/vnd.dts.hd", (Object) null);
                            }
                    }
                } else {
                    str = "audio/eac3";
                }
            }
            str = "audio/mp4a-latm";
        } else {
            str = "video/hevc";
        }
        kVar.mo14551f(12);
        kVar.mo14551f(1);
        int a = m7906a(kVar);
        byte[] bArr = new byte[a];
        System.arraycopy(kVar.f12121a, kVar.f12122b, bArr, 0, a);
        kVar.f12122b += a;
        return Pair.create(str, bArr);
    }

    /* renamed from: a */
    public static int m7906a(C3393k kVar) {
        int l = kVar.mo14557l();
        int i = l & 127;
        while ((l & RecyclerView.C1119a0.FLAG_IGNORE) == 128) {
            l = kVar.mo14557l();
            i = (i << 7) | (l & 127);
        }
        return i;
    }
}
