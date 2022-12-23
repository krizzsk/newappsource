package p264ta;

import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import com.appboy.support.ValidationUtils;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import p012ab.C0145b;
import p173ma.C5735h;
import p173ma.C5736i;
import p173ma.C5737j;
import p173ma.C5754v;
import p264ta.C6619a;
import p264ta.C6636i;
import p277ub.C6774a0;
import p277ub.C6795o;
import p277ub.C6803r;

/* renamed from: ta.e */
public final class C6629e implements C5735h {

    /* renamed from: F */
    public static final byte[] f20516F = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: G */
    public static final Format f20517G;

    /* renamed from: A */
    public boolean f20518A;

    /* renamed from: B */
    public C5737j f20519B;

    /* renamed from: C */
    public C5754v[] f20520C;

    /* renamed from: D */
    public C5754v[] f20521D;

    /* renamed from: E */
    public boolean f20522E;

    /* renamed from: a */
    public final int f20523a = 0;

    /* renamed from: b */
    public final List<Format> f20524b;

    /* renamed from: c */
    public final SparseArray<C6631b> f20525c;

    /* renamed from: d */
    public final C6803r f20526d;

    /* renamed from: e */
    public final C6803r f20527e;

    /* renamed from: f */
    public final C6803r f20528f;

    /* renamed from: g */
    public final byte[] f20529g;

    /* renamed from: h */
    public final C6803r f20530h;

    /* renamed from: i */
    public final C0145b f20531i;

    /* renamed from: j */
    public final C6803r f20532j;

    /* renamed from: k */
    public final ArrayDeque<C6619a.C6620a> f20533k;

    /* renamed from: l */
    public final ArrayDeque<C6630a> f20534l;

    /* renamed from: m */
    public int f20535m;

    /* renamed from: n */
    public int f20536n;

    /* renamed from: o */
    public long f20537o;

    /* renamed from: p */
    public int f20538p;

    /* renamed from: q */
    public C6803r f20539q;

    /* renamed from: r */
    public long f20540r;

    /* renamed from: s */
    public int f20541s;

    /* renamed from: t */
    public long f20542t;

    /* renamed from: u */
    public long f20543u;

    /* renamed from: v */
    public long f20544v;

    /* renamed from: w */
    public C6631b f20545w;

    /* renamed from: x */
    public int f20546x;

    /* renamed from: y */
    public int f20547y;

    /* renamed from: z */
    public int f20548z;

    /* renamed from: ta.e$a */
    public static final class C6630a {

        /* renamed from: a */
        public final long f20549a;

        /* renamed from: b */
        public final int f20550b;

        public C6630a(long j, int i) {
            this.f20549a = j;
            this.f20550b = i;
        }
    }

    /* renamed from: ta.e$b */
    public static final class C6631b {

        /* renamed from: a */
        public final C5754v f20551a;

        /* renamed from: b */
        public final C6643n f20552b = new C6643n();

        /* renamed from: c */
        public final C6803r f20553c = new C6803r();

        /* renamed from: d */
        public C6644o f20554d;

        /* renamed from: e */
        public C6627c f20555e;

        /* renamed from: f */
        public int f20556f;

        /* renamed from: g */
        public int f20557g;

        /* renamed from: h */
        public int f20558h;

        /* renamed from: i */
        public int f20559i;

        /* renamed from: j */
        public final C6803r f20560j = new C6803r(1);

        /* renamed from: k */
        public final C6803r f20561k = new C6803r();

        /* renamed from: l */
        public boolean f20562l;

        public C6631b(C5754v vVar, C6644o oVar, C6627c cVar) {
            this.f20551a = vVar;
            this.f20554d = oVar;
            this.f20555e = cVar;
            this.f20554d = oVar;
            this.f20555e = cVar;
            vVar.mo20632c(oVar.f20637a.f20608f);
            mo22813d();
        }

        /* renamed from: a */
        public final C6642m mo22810a() {
            if (!this.f20562l) {
                return null;
            }
            C6643n nVar = this.f20552b;
            C6627c cVar = nVar.f20619a;
            int i = C6774a0.f20959a;
            int i2 = cVar.f20511a;
            C6642m mVar = nVar.f20632n;
            if (mVar == null) {
                C6642m[] mVarArr = this.f20554d.f20637a.f20613k;
                if (mVarArr == null) {
                    mVar = null;
                } else {
                    mVar = mVarArr[i2];
                }
            }
            if (mVar == null || !mVar.f20614a) {
                return null;
            }
            return mVar;
        }

        /* renamed from: b */
        public final boolean mo22811b() {
            this.f20556f++;
            if (!this.f20562l) {
                return false;
            }
            int i = this.f20557g + 1;
            this.f20557g = i;
            int[] iArr = this.f20552b.f20625g;
            int i2 = this.f20558h;
            if (i != iArr[i2]) {
                return true;
            }
            this.f20558h = i2 + 1;
            this.f20557g = 0;
            return false;
        }

        /* renamed from: c */
        public final int mo22812c(int i, int i2) {
            C6803r rVar;
            boolean z;
            boolean z2;
            int i3;
            C6642m a = mo22810a();
            if (a == null) {
                return 0;
            }
            int i4 = a.f20617d;
            if (i4 != 0) {
                rVar = this.f20552b.f20633o;
            } else {
                byte[] bArr = a.f20618e;
                int i5 = C6774a0.f20959a;
                this.f20561k.mo23005x(bArr.length, bArr);
                C6803r rVar2 = this.f20561k;
                i4 = bArr.length;
                rVar = rVar2;
            }
            C6643n nVar = this.f20552b;
            int i6 = this.f20556f;
            if (!nVar.f20630l || !nVar.f20631m[i6]) {
                z = false;
            } else {
                z = true;
            }
            if (z || i2 != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            C6803r rVar3 = this.f20560j;
            byte[] bArr2 = rVar3.f21038a;
            if (z2) {
                i3 = RecyclerView.C1119a0.FLAG_IGNORE;
            } else {
                i3 = 0;
            }
            bArr2[0] = (byte) (i3 | i4);
            rVar3.mo23007z(0);
            this.f20551a.mo20634e(this.f20560j, 1);
            this.f20551a.mo20634e(rVar, i4);
            if (!z2) {
                return i4 + 1;
            }
            if (!z) {
                this.f20553c.mo23004w(8);
                C6803r rVar4 = this.f20553c;
                byte[] bArr3 = rVar4.f21038a;
                bArr3[0] = 0;
                bArr3[1] = 1;
                bArr3[2] = (byte) ((i2 >> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
                bArr3[3] = (byte) (i2 & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
                bArr3[4] = (byte) ((i >> 24) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
                bArr3[5] = (byte) ((i >> 16) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
                bArr3[6] = (byte) ((i >> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
                bArr3[7] = (byte) (i & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
                this.f20551a.mo20634e(rVar4, 8);
                return i4 + 1 + 8;
            }
            C6803r rVar5 = this.f20552b.f20633o;
            int u = rVar5.mo23002u();
            rVar5.mo22981A(-2);
            int i7 = (u * 6) + 2;
            if (i2 != 0) {
                this.f20553c.mo23004w(i7);
                byte[] bArr4 = this.f20553c.f21038a;
                rVar5.mo22983b(0, i7, bArr4);
                int i8 = (((bArr4[2] & 255) << 8) | (bArr4[3] & 255)) + i2;
                bArr4[2] = (byte) ((i8 >> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
                bArr4[3] = (byte) (i8 & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
                rVar5 = this.f20553c;
            }
            this.f20551a.mo20634e(rVar5, i7);
            return i4 + 1 + i7;
        }

        /* renamed from: d */
        public final void mo22813d() {
            C6643n nVar = this.f20552b;
            nVar.f20622d = 0;
            nVar.f20635q = 0;
            nVar.f20636r = false;
            nVar.f20630l = false;
            nVar.f20634p = false;
            nVar.f20632n = null;
            this.f20556f = 0;
            this.f20558h = 0;
            this.f20557g = 0;
            this.f20559i = 0;
            this.f20562l = false;
        }
    }

    static {
        Format.C3872b bVar = new Format.C3872b();
        bVar.f13446k = "application/x-emsg";
        f20517G = bVar.mo15806a();
    }

    public C6629e() {
        List emptyList = Collections.emptyList();
        this.f20524b = Collections.unmodifiableList(emptyList);
        this.f20531i = new C0145b();
        this.f20532j = new C6803r(16);
        this.f20526d = new C6803r(C6795o.f21007a);
        this.f20527e = new C6803r(5);
        this.f20528f = new C6803r();
        byte[] bArr = new byte[16];
        this.f20529g = bArr;
        this.f20530h = new C6803r(bArr);
        this.f20533k = new ArrayDeque<>();
        this.f20534l = new ArrayDeque<>();
        this.f20525c = new SparseArray<>();
        this.f20543u = -9223372036854775807L;
        this.f20542t = -9223372036854775807L;
        this.f20544v = -9223372036854775807L;
        this.f20519B = C5737j.f18598i0;
        this.f20520C = new C5754v[0];
        this.f20521D = new C5754v[0];
    }

    /* renamed from: c */
    public static DrmInitData m15677c(ArrayList arrayList) {
        UUID uuid;
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i = 0; i < size; i++) {
            C6619a.C6621b bVar = (C6619a.C6621b) arrayList.get(i);
            if (bVar.f20488a == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = bVar.f20492b.f21038a;
                C6636i.C6637a a = C6636i.m15699a(bArr);
                if (a == null) {
                    uuid = null;
                } else {
                    uuid = a.f20592a;
                }
                if (uuid != null) {
                    arrayList2.add(new DrmInitData.SchemeData(uuid, (String) null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new DrmInitData((String) null, false, (DrmInitData.SchemeData[]) arrayList2.toArray(new DrmInitData.SchemeData[0]));
    }

    /* renamed from: d */
    public static void m15678d(C6803r rVar, int i, C6643n nVar) throws ParserException {
        boolean z;
        rVar.mo23007z(i + 8);
        int c = rVar.mo22984c() & 16777215;
        if ((c & 1) == 0) {
            if ((c & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            int s = rVar.mo23000s();
            if (s == 0) {
                Arrays.fill(nVar.f20631m, 0, nVar.f20623e, false);
            } else if (s == nVar.f20623e) {
                Arrays.fill(nVar.f20631m, 0, s, z);
                nVar.f20633o.mo23004w(rVar.f21040c - rVar.f21039b);
                nVar.f20630l = true;
                nVar.f20634p = true;
                C6803r rVar2 = nVar.f20633o;
                rVar.mo22983b(0, rVar2.f21040c, rVar2.f21038a);
                nVar.f20633o.mo23007z(0);
                nVar.f20634p = false;
            } else {
                throw new ParserException(C13715c.m34243i(80, "Senc sample count ", s, " is different from fragment sample count", nVar.f20623e));
            }
        } else {
            throw new ParserException("Overriding TrackEncryptionBox parameters is unsupported.");
        }
    }

    /* renamed from: a */
    public final void mo21592a(long j, long j2) {
        int size = this.f20525c.size();
        for (int i = 0; i < size; i++) {
            this.f20525c.valueAt(i).mo22813d();
        }
        this.f20534l.clear();
        this.f20541s = 0;
        this.f20542t = j2;
        this.f20533k.clear();
        this.f20535m = 0;
        this.f20538p = 0;
    }

    /* renamed from: b */
    public final boolean mo21593b(C5736i iVar) throws IOException {
        return C6640k.m15701a(iVar, true, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:145:0x039a  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x039c  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x03ae  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo22809e(long r47) throws com.google.android.exoplayer2.ParserException {
        /*
            r46 = this;
            r0 = r46
            r1 = r0
            r2 = r1
        L_0x0004:
            java.util.ArrayDeque<ta.a$a> r3 = r1.f20533k
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x079d
            java.util.ArrayDeque<ta.a$a> r3 = r1.f20533k
            java.lang.Object r3 = r3.peek()
            ta.a$a r3 = (p264ta.C6619a.C6620a) r3
            long r3 = r3.f20489b
            int r5 = (r3 > r47 ? 1 : (r3 == r47 ? 0 : -1))
            if (r5 != 0) goto L_0x079d
            java.util.ArrayDeque<ta.a$a> r3 = r1.f20533k
            java.lang.Object r3 = r3.pop()
            r4 = r3
            ta.a$a r4 = (p264ta.C6619a.C6620a) r4
            int r3 = r4.f20488a
            r5 = 1836019574(0x6d6f6f76, float:4.631354E27)
            r6 = 12
            if (r3 != r5) goto L_0x0187
            java.util.ArrayList r3 = r4.f20490c
            com.google.android.exoplayer2.drm.DrmInitData r8 = m15677c(r3)
            r3 = 1836475768(0x6d766578, float:4.7659988E27)
            ta.a$a r3 = r4.mo22800b(r3)
            r3.getClass()
            android.util.SparseArray r12 = new android.util.SparseArray
            r12.<init>()
            java.util.ArrayList r5 = r3.f20490c
            int r5 = r5.size()
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 0
        L_0x004d:
            if (r7 >= r5) goto L_0x00c0
            java.util.ArrayList r11 = r3.f20490c
            java.lang.Object r11 = r11.get(r7)
            ta.a$b r11 = (p264ta.C6619a.C6621b) r11
            int r13 = r11.f20488a
            r14 = 1953654136(0x74726578, float:7.6818474E31)
            if (r13 != r14) goto L_0x0098
            ub.r r11 = r11.f20492b
            r11.mo23007z(r6)
            int r6 = r11.mo22984c()
            int r13 = r11.mo22984c()
            int r13 = r13 + -1
            int r14 = r11.mo22984c()
            int r15 = r11.mo22984c()
            int r11 = r11.mo22984c()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r16 = r3
            ta.c r3 = new ta.c
            r3.<init>(r13, r14, r15, r11)
            android.util.Pair r3 = android.util.Pair.create(r6, r3)
            java.lang.Object r6 = r3.first
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.lang.Object r3 = r3.second
            ta.c r3 = (p264ta.C6627c) r3
            r12.put(r6, r3)
            goto L_0x00b9
        L_0x0098:
            r16 = r3
            r3 = 1835362404(0x6d656864, float:4.4373917E27)
            if (r13 != r3) goto L_0x00b9
            ub.r r3 = r11.f20492b
            r6 = 8
            r3.mo23007z(r6)
            int r6 = r3.mo22984c()
            int r6 = r6 >> 24
            r6 = r6 & 255(0xff, float:3.57E-43)
            if (r6 != 0) goto L_0x00b5
            long r9 = r3.mo22998q()
            goto L_0x00b9
        L_0x00b5:
            long r9 = r3.mo23001t()
        L_0x00b9:
            int r7 = r7 + 1
            r6 = 12
            r3 = r16
            goto L_0x004d
        L_0x00c0:
            ma.p r5 = new ma.p
            r5.<init>()
            int r3 = r1.f20523a
            r3 = r3 & 16
            if (r3 == 0) goto L_0x00cd
            r3 = 1
            goto L_0x00ce
        L_0x00cd:
            r3 = 0
        L_0x00ce:
            r11 = 0
            ta.d r13 = new ta.d
            r13.<init>(r1)
            r6 = r9
            r9 = r3
            r10 = r11
            r11 = r13
            java.util.ArrayList r3 = p264ta.C6622b.m15666e(r4, r5, r6, r8, r9, r10, r11)
            int r4 = r3.size()
            android.util.SparseArray<ta.e$b> r5 = r1.f20525c
            int r5 = r5.size()
            if (r5 != 0) goto L_0x0134
            r5 = 0
        L_0x00e9:
            if (r5 >= r4) goto L_0x012e
            java.lang.Object r6 = r3.get(r5)
            ta.o r6 = (p264ta.C6644o) r6
            ta.l r7 = r6.f20637a
            ta.e$b r8 = new ta.e$b
            ma.j r9 = r1.f20519B
            int r10 = r7.f20604b
            ma.v r9 = r9.mo20709p(r5, r10)
            int r10 = r7.f20603a
            int r11 = r12.size()
            r13 = 1
            if (r11 != r13) goto L_0x010e
            r10 = 0
            java.lang.Object r10 = r12.valueAt(r10)
            ta.c r10 = (p264ta.C6627c) r10
            goto L_0x0117
        L_0x010e:
            java.lang.Object r10 = r12.get(r10)
            ta.c r10 = (p264ta.C6627c) r10
            r10.getClass()
        L_0x0117:
            r8.<init>(r9, r6, r10)
            android.util.SparseArray<ta.e$b> r6 = r1.f20525c
            int r9 = r7.f20603a
            r6.put(r9, r8)
            long r8 = r1.f20543u
            long r6 = r7.f20607e
            long r6 = java.lang.Math.max(r8, r6)
            r1.f20543u = r6
            int r5 = r5 + 1
            goto L_0x00e9
        L_0x012e:
            ma.j r3 = r1.f20519B
            r3.mo20708n()
            goto L_0x0184
        L_0x0134:
            android.util.SparseArray<ta.e$b> r5 = r1.f20525c
            int r5 = r5.size()
            if (r5 != r4) goto L_0x013e
            r5 = 1
            goto L_0x013f
        L_0x013e:
            r5 = 0
        L_0x013f:
            p583jk.C17875h.m44304o(r5)
            r5 = 0
        L_0x0143:
            if (r5 >= r4) goto L_0x0184
            java.lang.Object r6 = r3.get(r5)
            ta.o r6 = (p264ta.C6644o) r6
            ta.l r7 = r6.f20637a
            android.util.SparseArray<ta.e$b> r8 = r1.f20525c
            int r9 = r7.f20603a
            java.lang.Object r8 = r8.get(r9)
            ta.e$b r8 = (p264ta.C6629e.C6631b) r8
            int r7 = r7.f20603a
            int r9 = r12.size()
            r10 = 1
            if (r9 != r10) goto L_0x0168
            r7 = 0
            java.lang.Object r7 = r12.valueAt(r7)
            ta.c r7 = (p264ta.C6627c) r7
            goto L_0x0171
        L_0x0168:
            java.lang.Object r7 = r12.get(r7)
            ta.c r7 = (p264ta.C6627c) r7
            r7.getClass()
        L_0x0171:
            r8.f20554d = r6
            r8.f20555e = r7
            ma.v r7 = r8.f20551a
            ta.l r6 = r6.f20637a
            com.google.android.exoplayer2.Format r6 = r6.f20608f
            r7.mo20632c(r6)
            r8.mo22813d()
            int r5 = r5 + 1
            goto L_0x0143
        L_0x0184:
            r4 = r0
            goto L_0x079a
        L_0x0187:
            r5 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r3 != r5) goto L_0x0783
            android.util.SparseArray<ta.e$b> r2 = r1.f20525c
            int r3 = r1.f20523a
            byte[] r1 = r1.f20529g
            java.util.ArrayList r5 = r4.f20491d
            int r5 = r5.size()
            r6 = 0
        L_0x0199:
            if (r6 >= r5) goto L_0x06e0
            java.util.ArrayList r7 = r4.f20491d
            java.lang.Object r7 = r7.get(r6)
            ta.a$a r7 = (p264ta.C6619a.C6620a) r7
            int r8 = r7.f20488a
            r9 = 1953653094(0x74726166, float:7.6813435E31)
            if (r8 != r9) goto L_0x06c5
            r8 = 1952868452(0x74666864, float:7.301914E31)
            ta.a$b r8 = r7.mo22801c(r8)
            r8.getClass()
            ub.r r8 = r8.f20492b
            r9 = 8
            r8.mo23007z(r9)
            int r9 = r8.mo22984c()
            r10 = 16777215(0xffffff, float:2.3509886E-38)
            r9 = r9 & r10
            int r10 = r8.mo22984c()
            java.lang.Object r10 = r2.get(r10)
            ta.e$b r10 = (p264ta.C6629e.C6631b) r10
            if (r10 != 0) goto L_0x01d1
            r10 = 0
            goto L_0x0218
        L_0x01d1:
            r11 = r9 & 1
            if (r11 == 0) goto L_0x01df
            long r11 = r8.mo23001t()
            ta.n r13 = r10.f20552b
            r13.f20620b = r11
            r13.f20621c = r11
        L_0x01df:
            ta.c r11 = r10.f20555e
            r12 = r9 & 2
            if (r12 == 0) goto L_0x01ec
            int r12 = r8.mo22984c()
            int r12 = r12 + -1
            goto L_0x01ee
        L_0x01ec:
            int r12 = r11.f20511a
        L_0x01ee:
            r13 = r9 & 8
            if (r13 == 0) goto L_0x01f7
            int r13 = r8.mo22984c()
            goto L_0x01f9
        L_0x01f7:
            int r13 = r11.f20512b
        L_0x01f9:
            r14 = r9 & 16
            if (r14 == 0) goto L_0x0202
            int r14 = r8.mo22984c()
            goto L_0x0204
        L_0x0202:
            int r14 = r11.f20513c
        L_0x0204:
            r9 = r9 & 32
            if (r9 == 0) goto L_0x020d
            int r8 = r8.mo22984c()
            goto L_0x020f
        L_0x020d:
            int r8 = r11.f20514d
        L_0x020f:
            ta.n r9 = r10.f20552b
            ta.c r11 = new ta.c
            r11.<init>(r12, r13, r14, r8)
            r9.f20619a = r11
        L_0x0218:
            if (r10 != 0) goto L_0x021c
            goto L_0x06c5
        L_0x021c:
            ta.n r8 = r10.f20552b
            long r11 = r8.f20635q
            boolean r9 = r8.f20636r
            r10.mo22813d()
            r13 = 1
            r10.f20562l = r13
            r13 = 1952867444(0x74666474, float:7.3014264E31)
            ta.a$b r13 = r7.mo22801c(r13)
            if (r13 == 0) goto L_0x0255
            r14 = r3 & 2
            if (r14 != 0) goto L_0x0255
            ub.r r9 = r13.f20492b
            r11 = 8
            r9.mo23007z(r11)
            int r11 = r9.mo22984c()
            int r11 = r11 >> 24
            r11 = r11 & 255(0xff, float:3.57E-43)
            r12 = 1
            if (r11 != r12) goto L_0x024c
            long r13 = r9.mo23001t()
            goto L_0x0250
        L_0x024c:
            long r13 = r9.mo22998q()
        L_0x0250:
            r8.f20635q = r13
            r8.f20636r = r12
            goto L_0x0259
        L_0x0255:
            r8.f20635q = r11
            r8.f20636r = r9
        L_0x0259:
            java.util.ArrayList r9 = r7.f20490c
            int r11 = r9.size()
            r12 = 0
            r13 = 0
            r14 = 0
        L_0x0262:
            r15 = 1953658222(0x7472756e, float:7.683823E31)
            if (r12 >= r11) goto L_0x028e
            java.lang.Object r16 = r9.get(r12)
            r17 = r2
            r2 = r16
            ta.a$b r2 = (p264ta.C6619a.C6621b) r2
            r16 = r5
            int r5 = r2.f20488a
            if (r5 != r15) goto L_0x0287
            ub.r r2 = r2.f20492b
            r5 = 12
            r2.mo23007z(r5)
            int r2 = r2.mo23000s()
            if (r2 <= 0) goto L_0x0287
            int r14 = r14 + r2
            int r13 = r13 + 1
        L_0x0287:
            int r12 = r12 + 1
            r5 = r16
            r2 = r17
            goto L_0x0262
        L_0x028e:
            r17 = r2
            r16 = r5
            r2 = 0
            r10.f20558h = r2
            r10.f20557g = r2
            r10.f20556f = r2
            ta.n r2 = r10.f20552b
            r2.f20622d = r13
            r2.f20623e = r14
            int[] r5 = r2.f20625g
            int r5 = r5.length
            if (r5 >= r13) goto L_0x02ac
            long[] r5 = new long[r13]
            r2.f20624f = r5
            int[] r5 = new int[r13]
            r2.f20625g = r5
        L_0x02ac:
            int[] r5 = r2.f20626h
            int r5 = r5.length
            if (r5 >= r14) goto L_0x02c9
            int r14 = r14 * 125
            int r14 = r14 / 100
            int[] r5 = new int[r14]
            r2.f20626h = r5
            int[] r5 = new int[r14]
            r2.f20627i = r5
            long[] r5 = new long[r14]
            r2.f20628j = r5
            boolean[] r5 = new boolean[r14]
            r2.f20629k = r5
            boolean[] r5 = new boolean[r14]
            r2.f20631m = r5
        L_0x02c9:
            r2 = 0
            r5 = 0
            r12 = 0
        L_0x02cc:
            if (r2 >= r11) goto L_0x049c
            java.lang.Object r18 = r9.get(r2)
            r13 = r18
            ta.a$b r13 = (p264ta.C6619a.C6621b) r13
            int r14 = r13.f20488a
            if (r14 != r15) goto L_0x046f
            int r14 = r12 + 1
            ub.r r13 = r13.f20492b
            r15 = 8
            r13.mo23007z(r15)
            int r15 = r13.mo22984c()
            r18 = 16777215(0xffffff, float:2.3509886E-38)
            r15 = r15 & r18
            r18 = r9
            ta.o r9 = r10.f20554d
            ta.l r9 = r9.f20637a
            r21 = r11
            ta.n r11 = r10.f20552b
            r22 = r14
            ta.c r14 = r11.f20619a
            int r23 = p277ub.C6774a0.f20959a
            int[] r0 = r11.f20625g
            int r23 = r13.mo23000s()
            r0[r12] = r23
            long[] r0 = r11.f20624f
            r23 = r6
            r24 = r7
            long r6 = r11.f20620b
            r0[r12] = r6
            r25 = r15 & 1
            if (r25 == 0) goto L_0x0321
            r25 = r4
            int r4 = r13.mo22984c()
            r26 = r1
            r27 = r2
            long r1 = (long) r4
            long r6 = r6 + r1
            r0[r12] = r6
            goto L_0x0327
        L_0x0321:
            r26 = r1
            r27 = r2
            r25 = r4
        L_0x0327:
            r0 = r15 & 4
            if (r0 == 0) goto L_0x032d
            r0 = 1
            goto L_0x032e
        L_0x032d:
            r0 = 0
        L_0x032e:
            int r1 = r14.f20514d
            if (r0 == 0) goto L_0x0336
            int r1 = r13.mo22984c()
        L_0x0336:
            r2 = r15 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x033c
            r2 = 1
            goto L_0x033d
        L_0x033c:
            r2 = 0
        L_0x033d:
            r4 = r15 & 512(0x200, float:7.175E-43)
            if (r4 == 0) goto L_0x0343
            r4 = 1
            goto L_0x0344
        L_0x0343:
            r4 = 0
        L_0x0344:
            r6 = r15 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto L_0x034a
            r6 = 1
            goto L_0x034b
        L_0x034a:
            r6 = 0
        L_0x034b:
            r7 = r15 & 2048(0x800, float:2.87E-42)
            if (r7 == 0) goto L_0x0351
            r7 = 1
            goto L_0x0352
        L_0x0351:
            r7 = 0
        L_0x0352:
            long[] r15 = r9.f20610h
            if (r15 == 0) goto L_0x037c
            r28 = r1
            int r1 = r15.length
            r29 = r8
            r8 = 1
            if (r1 != r8) goto L_0x037a
            r1 = 0
            r30 = r15[r1]
            r19 = 0
            int r8 = (r30 > r19 ? 1 : (r30 == r19 ? 0 : -1))
            if (r8 != 0) goto L_0x037a
            long[] r8 = r9.f20611i
            r30 = r8[r1]
            r32 = 1000000(0xf4240, double:4.940656E-318)
            r1 = r7
            long r7 = r9.f20605c
            r34 = r7
            long r7 = p277ub.C6774a0.m15939A(r30, r32, r34)
            r19 = r7
            goto L_0x0383
        L_0x037a:
            r1 = r7
            goto L_0x0381
        L_0x037c:
            r28 = r1
            r1 = r7
            r29 = r8
        L_0x0381:
            r19 = 0
        L_0x0383:
            int[] r7 = r11.f20626h
            int[] r8 = r11.f20627i
            long[] r15 = r11.f20628j
            r30 = r7
            boolean[] r7 = r11.f20629k
            r31 = r7
            int r7 = r9.f20604b
            r32 = r10
            r10 = 2
            if (r7 != r10) goto L_0x039c
            r7 = r3 & 1
            if (r7 == 0) goto L_0x039c
            r7 = 1
            goto L_0x039d
        L_0x039c:
            r7 = 0
        L_0x039d:
            int[] r10 = r11.f20625g
            r10 = r10[r12]
            int r10 = r10 + r5
            r40 = r7
            r39 = r8
            long r7 = r9.f20605c
            r41 = r7
            long r7 = r11.f20635q
        L_0x03ac:
            if (r5 >= r10) goto L_0x0465
            if (r2 == 0) goto L_0x03b5
            int r9 = r13.mo22984c()
            goto L_0x03b7
        L_0x03b5:
            int r9 = r14.f20512b
        L_0x03b7:
            java.lang.String r12 = "Unexpected negative value: "
            if (r9 < 0) goto L_0x0459
            if (r4 == 0) goto L_0x03c6
            int r33 = r13.mo22984c()
            r43 = r2
            r2 = r33
            goto L_0x03ca
        L_0x03c6:
            r43 = r2
            int r2 = r14.f20513c
        L_0x03ca:
            if (r2 < 0) goto L_0x044d
            if (r6 == 0) goto L_0x03d3
            int r12 = r13.mo22984c()
            goto L_0x03dc
        L_0x03d3:
            if (r5 != 0) goto L_0x03da
            if (r0 == 0) goto L_0x03da
            r12 = r28
            goto L_0x03dc
        L_0x03da:
            int r12 = r14.f20514d
        L_0x03dc:
            if (r1 == 0) goto L_0x03f2
            r44 = r0
            int r0 = r13.mo22984c()
            r45 = r1
            long r0 = (long) r0
            r33 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 * r33
            long r0 = r0 / r41
            int r1 = (int) r0
            r39[r5] = r1
            goto L_0x03f9
        L_0x03f2:
            r44 = r0
            r45 = r1
            r0 = 0
            r39[r5] = r0
        L_0x03f9:
            r35 = 1000000(0xf4240, double:4.940656E-318)
            r33 = r7
            r37 = r41
            long r0 = p277ub.C6774a0.m15939A(r33, r35, r37)
            long r0 = r0 - r19
            r15[r5] = r0
            r33 = r3
            boolean r3 = r11.f20636r
            if (r3 != 0) goto L_0x041e
            r3 = r32
            r32 = r4
            ta.o r4 = r3.f20554d
            r34 = r13
            r35 = r14
            long r13 = r4.f20644h
            long r0 = r0 + r13
            r15[r5] = r0
            goto L_0x0426
        L_0x041e:
            r34 = r13
            r35 = r14
            r3 = r32
            r32 = r4
        L_0x0426:
            r30[r5] = r2
            int r0 = r12 >> 16
            r0 = r0 & 1
            if (r0 != 0) goto L_0x0434
            if (r40 == 0) goto L_0x0432
            if (r5 != 0) goto L_0x0434
        L_0x0432:
            r0 = 1
            goto L_0x0435
        L_0x0434:
            r0 = 0
        L_0x0435:
            r31[r5] = r0
            long r0 = (long) r9
            long r7 = r7 + r0
            int r5 = r5 + 1
            r4 = r32
            r13 = r34
            r14 = r35
            r2 = r43
            r0 = r44
            r1 = r45
            r32 = r3
            r3 = r33
            goto L_0x03ac
        L_0x044d:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            r1 = 38
            java.lang.String r1 = p379.C13715c.m34241g(r1, r12, r2)
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0459:
            r0 = 38
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            java.lang.String r0 = p379.C13715c.m34241g(r0, r12, r9)
            r1.<init>((java.lang.String) r0)
            throw r1
        L_0x0465:
            r33 = r3
            r3 = r32
            r11.f20635q = r7
            r5 = r10
            r12 = r22
            goto L_0x0482
        L_0x046f:
            r26 = r1
            r27 = r2
            r33 = r3
            r25 = r4
            r23 = r6
            r24 = r7
            r29 = r8
            r18 = r9
            r3 = r10
            r21 = r11
        L_0x0482:
            int r2 = r27 + 1
            r15 = 1953658222(0x7472756e, float:7.683823E31)
            r0 = r46
            r10 = r3
            r9 = r18
            r11 = r21
            r6 = r23
            r7 = r24
            r4 = r25
            r1 = r26
            r8 = r29
            r3 = r33
            goto L_0x02cc
        L_0x049c:
            r26 = r1
            r33 = r3
            r25 = r4
            r23 = r6
            r24 = r7
            r29 = r8
            r3 = r10
            ta.o r0 = r3.f20554d
            ta.l r0 = r0.f20637a
            r1 = r29
            ta.c r2 = r1.f20619a
            r2.getClass()
            int r2 = r2.f20511a
            ta.m[] r0 = r0.f20613k
            if (r0 != 0) goto L_0x04bc
            r0 = 0
            goto L_0x04be
        L_0x04bc:
            r0 = r0[r2]
        L_0x04be:
            r2 = 1935763834(0x7361697a, float:1.785898E31)
            r7 = r24
            ta.a$b r2 = r7.mo22801c(r2)
            if (r2 == 0) goto L_0x053d
            r0.getClass()
            ub.r r2 = r2.f20492b
            int r3 = r0.f20617d
            r4 = 8
            r2.mo23007z(r4)
            int r5 = r2.mo22984c()
            r6 = 16777215(0xffffff, float:2.3509886E-38)
            r5 = r5 & r6
            r6 = 1
            r5 = r5 & r6
            if (r5 != r6) goto L_0x04e4
            r2.mo22981A(r4)
        L_0x04e4:
            int r4 = r2.mo22997p()
            int r5 = r2.mo23000s()
            int r6 = r1.f20623e
            if (r5 > r6) goto L_0x052b
            if (r4 != 0) goto L_0x0507
            boolean[] r4 = r1.f20631m
            r6 = 0
            r8 = 0
        L_0x04f6:
            if (r6 >= r5) goto L_0x0516
            int r9 = r2.mo22997p()
            int r8 = r8 + r9
            if (r9 <= r3) goto L_0x0501
            r9 = 1
            goto L_0x0502
        L_0x0501:
            r9 = 0
        L_0x0502:
            r4[r6] = r9
            int r6 = r6 + 1
            goto L_0x04f6
        L_0x0507:
            if (r4 <= r3) goto L_0x050b
            r2 = 1
            goto L_0x050c
        L_0x050b:
            r2 = 0
        L_0x050c:
            int r4 = r4 * r5
            r3 = 0
            int r8 = r4 + 0
            boolean[] r4 = r1.f20631m
            java.util.Arrays.fill(r4, r3, r5, r2)
        L_0x0516:
            r2 = 0
            boolean[] r3 = r1.f20631m
            int r4 = r1.f20623e
            java.util.Arrays.fill(r3, r5, r4, r2)
            if (r8 <= 0) goto L_0x053d
            ub.r r2 = r1.f20633o
            r2.mo23004w(r8)
            r2 = 1
            r1.f20630l = r2
            r1.f20634p = r2
            goto L_0x053d
        L_0x052b:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            int r1 = r1.f20623e
            r2 = 78
            java.lang.String r3 = "Saiz sample count "
            java.lang.String r4 = " is greater than fragment sample count"
            java.lang.String r1 = p379.C13715c.m34243i(r2, r3, r5, r4, r1)
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x053d:
            r2 = 1935763823(0x7361696f, float:1.7858967E31)
            ta.a$b r2 = r7.mo22801c(r2)
            if (r2 == 0) goto L_0x0585
            ub.r r2 = r2.f20492b
            r3 = 8
            r2.mo23007z(r3)
            int r4 = r2.mo22984c()
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            r5 = r5 & r4
            r6 = 1
            r5 = r5 & r6
            if (r5 != r6) goto L_0x055c
            r2.mo22981A(r3)
        L_0x055c:
            int r3 = r2.mo23000s()
            if (r3 != r6) goto L_0x0577
            int r3 = r4 >> 24
            r3 = r3 & 255(0xff, float:3.57E-43)
            long r4 = r1.f20621c
            if (r3 != 0) goto L_0x056f
            long r2 = r2.mo22998q()
            goto L_0x0573
        L_0x056f:
            long r2 = r2.mo23001t()
        L_0x0573:
            long r4 = r4 + r2
            r1.f20621c = r4
            goto L_0x0585
        L_0x0577:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            r1 = 40
            java.lang.String r2 = "Unexpected saio entry count: "
            java.lang.String r1 = p379.C13715c.m34241g(r1, r2, r3)
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0585:
            r2 = 1936027235(0x73656e63, float:1.8177412E31)
            ta.a$b r2 = r7.mo22801c(r2)
            if (r2 == 0) goto L_0x0594
            ub.r r2 = r2.f20492b
            r3 = 0
            m15678d(r2, r3, r1)
        L_0x0594:
            if (r0 == 0) goto L_0x0599
            java.lang.String r0 = r0.f20615b
            goto L_0x059a
        L_0x0599:
            r0 = 0
        L_0x059a:
            r10 = r0
            r0 = 0
            r2 = 0
            r3 = 0
        L_0x059e:
            java.util.ArrayList r4 = r7.f20490c
            int r4 = r4.size()
            if (r0 >= r4) goto L_0x05db
            java.util.ArrayList r4 = r7.f20490c
            java.lang.Object r4 = r4.get(r0)
            ta.a$b r4 = (p264ta.C6619a.C6621b) r4
            ub.r r5 = r4.f20492b
            int r4 = r4.f20488a
            r6 = 1935828848(0x73626770, float:1.7937577E31)
            r8 = 1936025959(0x73656967, float:1.817587E31)
            if (r4 != r6) goto L_0x05c7
            r4 = 12
            r5.mo23007z(r4)
            int r4 = r5.mo22984c()
            if (r4 != r8) goto L_0x05d8
            r2 = r5
            goto L_0x05d8
        L_0x05c7:
            r6 = 12
            r9 = 1936158820(0x73677064, float:1.8336489E31)
            if (r4 != r9) goto L_0x05d8
            r5.mo23007z(r6)
            int r4 = r5.mo22984c()
            if (r4 != r8) goto L_0x05d8
            r3 = r5
        L_0x05d8:
            int r0 = r0 + 1
            goto L_0x059e
        L_0x05db:
            if (r2 == 0) goto L_0x0687
            if (r3 != 0) goto L_0x05e1
            goto L_0x0687
        L_0x05e1:
            r0 = 8
            r2.mo23007z(r0)
            int r0 = r2.mo22984c()
            int r0 = r0 >> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            r4 = 4
            r2.mo22981A(r4)
            r5 = 1
            if (r0 != r5) goto L_0x05f8
            r2.mo22981A(r4)
        L_0x05f8:
            int r0 = r2.mo22984c()
            if (r0 != r5) goto L_0x067f
            r0 = 8
            r3.mo23007z(r0)
            int r0 = r3.mo22984c()
            int r0 = r0 >> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3.mo22981A(r4)
            if (r0 != r5) goto L_0x0623
            long r4 = r3.mo22998q()
            r8 = 0
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x061b
            goto L_0x0629
        L_0x061b:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.String r1 = "Variable length description in sgpd found (unsupported)"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0623:
            r2 = 2
            if (r0 < r2) goto L_0x0629
            r3.mo22981A(r4)
        L_0x0629:
            long r4 = r3.mo22998q()
            r8 = 1
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x0677
            r0 = 1
            r3.mo22981A(r0)
            int r2 = r3.mo22997p()
            r4 = r2 & 240(0xf0, float:3.36E-43)
            int r13 = r4 >> 4
            r14 = r2 & 15
            int r2 = r3.mo22997p()
            if (r2 != r0) goto L_0x064a
            r0 = 1
            r9 = 1
            goto L_0x064c
        L_0x064a:
            r0 = 0
            r9 = 0
        L_0x064c:
            if (r9 != 0) goto L_0x064f
            goto L_0x0687
        L_0x064f:
            int r11 = r3.mo22997p()
            r0 = 16
            byte[] r12 = new byte[r0]
            r2 = 0
            r3.mo22983b(r2, r0, r12)
            if (r11 != 0) goto L_0x0669
            int r0 = r3.mo22997p()
            byte[] r4 = new byte[r0]
            r3.mo22983b(r2, r0, r4)
            r0 = 1
            r15 = r4
            goto L_0x066c
        L_0x0669:
            r0 = 1
            r2 = 0
            r15 = r2
        L_0x066c:
            r1.f20630l = r0
            ta.m r0 = new ta.m
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r1.f20632n = r0
            goto L_0x0687
        L_0x0677:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.String r1 = "Entry count in sgpd != 1 (unsupported)."
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x067f:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.String r1 = "Entry count in sbgp != 1 (unsupported)."
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0687:
            java.util.ArrayList r0 = r7.f20490c
            int r0 = r0.size()
            r2 = 0
        L_0x068e:
            if (r2 >= r0) goto L_0x06c2
            java.util.ArrayList r3 = r7.f20490c
            java.lang.Object r3 = r3.get(r2)
            ta.a$b r3 = (p264ta.C6619a.C6621b) r3
            int r4 = r3.f20488a
            r5 = 1970628964(0x75756964, float:3.1109627E32)
            if (r4 != r5) goto L_0x06bb
            ub.r r3 = r3.f20492b
            r4 = 8
            r3.mo23007z(r4)
            r4 = 16
            r5 = 0
            r6 = r26
            r3.mo22983b(r5, r4, r6)
            byte[] r5 = f20516F
            boolean r5 = java.util.Arrays.equals(r6, r5)
            if (r5 != 0) goto L_0x06b7
            goto L_0x06bd
        L_0x06b7:
            m15678d(r3, r4, r1)
            goto L_0x06bd
        L_0x06bb:
            r6 = r26
        L_0x06bd:
            int r2 = r2 + 1
            r26 = r6
            goto L_0x068e
        L_0x06c2:
            r6 = r26
            goto L_0x06d0
        L_0x06c5:
            r17 = r2
            r33 = r3
            r25 = r4
            r16 = r5
            r23 = r6
            r6 = r1
        L_0x06d0:
            int r0 = r23 + 1
            r1 = r6
            r5 = r16
            r2 = r17
            r4 = r25
            r3 = r33
            r6 = r0
            r0 = r46
            goto L_0x0199
        L_0x06e0:
            r3 = r4
            java.util.ArrayList r0 = r3.f20490c
            com.google.android.exoplayer2.drm.DrmInitData r0 = m15677c(r0)
            r4 = r46
            if (r0 == 0) goto L_0x0737
            android.util.SparseArray<ta.e$b> r1 = r4.f20525c
            int r1 = r1.size()
            r2 = 0
        L_0x06f2:
            if (r2 >= r1) goto L_0x0737
            android.util.SparseArray<ta.e$b> r3 = r4.f20525c
            java.lang.Object r3 = r3.valueAt(r2)
            ta.e$b r3 = (p264ta.C6629e.C6631b) r3
            ta.o r5 = r3.f20554d
            ta.l r5 = r5.f20637a
            ta.n r6 = r3.f20552b
            ta.c r6 = r6.f20619a
            int r7 = p277ub.C6774a0.f20959a
            int r6 = r6.f20511a
            ta.m[] r5 = r5.f20613k
            if (r5 != 0) goto L_0x070e
            r5 = 0
            goto L_0x0710
        L_0x070e:
            r5 = r5[r6]
        L_0x0710:
            if (r5 == 0) goto L_0x0715
            java.lang.String r5 = r5.f20615b
            goto L_0x0716
        L_0x0715:
            r5 = 0
        L_0x0716:
            com.google.android.exoplayer2.drm.DrmInitData r5 = r0.mo15979b(r5)
            ta.o r6 = r3.f20554d
            ta.l r6 = r6.f20637a
            com.google.android.exoplayer2.Format r6 = r6.f20608f
            r6.getClass()
            com.google.android.exoplayer2.Format$b r7 = new com.google.android.exoplayer2.Format$b
            r7.<init>(r6)
            r7.f13449n = r5
            com.google.android.exoplayer2.Format r5 = new com.google.android.exoplayer2.Format
            r5.<init>((com.google.android.exoplayer2.Format.C3872b) r7)
            ma.v r3 = r3.f20551a
            r3.mo20632c(r5)
            int r2 = r2 + 1
            goto L_0x06f2
        L_0x0737:
            long r0 = r4.f20542t
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x0780
            android.util.SparseArray<ta.e$b> r0 = r4.f20525c
            int r0 = r0.size()
            r1 = 0
        L_0x0749:
            if (r1 >= r0) goto L_0x0779
            android.util.SparseArray<ta.e$b> r2 = r4.f20525c
            java.lang.Object r2 = r2.valueAt(r1)
            ta.e$b r2 = (p264ta.C6629e.C6631b) r2
            long r5 = r4.f20542t
            int r3 = r2.f20556f
        L_0x0757:
            ta.n r7 = r2.f20552b
            int r8 = r7.f20623e
            if (r3 >= r8) goto L_0x0776
            long[] r8 = r7.f20628j
            r9 = r8[r3]
            int[] r8 = r7.f20627i
            r8 = r8[r3]
            long r11 = (long) r8
            long r9 = r9 + r11
            int r8 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r8 >= 0) goto L_0x0776
            boolean[] r7 = r7.f20629k
            boolean r7 = r7[r3]
            if (r7 == 0) goto L_0x0773
            r2.f20559i = r3
        L_0x0773:
            int r3 = r3 + 1
            goto L_0x0757
        L_0x0776:
            int r1 = r1 + 1
            goto L_0x0749
        L_0x0779:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4.f20542t = r0
        L_0x0780:
            r1 = r4
            r2 = r1
            goto L_0x079a
        L_0x0783:
            r3 = r4
            r4 = r0
            java.util.ArrayDeque<ta.a$a> r0 = r1.f20533k
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x079a
            java.util.ArrayDeque<ta.a$a> r0 = r1.f20533k
            java.lang.Object r0 = r0.peek()
            ta.a$a r0 = (p264ta.C6619a.C6620a) r0
            java.util.ArrayList r0 = r0.f20491d
            r0.add(r3)
        L_0x079a:
            r0 = r4
            goto L_0x0004
        L_0x079d:
            r4 = r0
            r0 = 0
            r2.f20535m = r0
            r2.f20538p = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p264ta.C6629e.mo22809e(long):void");
    }

    /* renamed from: g */
    public final void mo21594g(C5737j jVar) {
        int i;
        this.f20519B = jVar;
        int i2 = 0;
        this.f20535m = 0;
        this.f20538p = 0;
        C5754v[] vVarArr = new C5754v[2];
        this.f20520C = vVarArr;
        int i3 = 100;
        if ((this.f20523a & 4) != 0) {
            vVarArr[0] = jVar.mo20709p(100, 5);
            i3 = 101;
            i = 1;
        } else {
            i = 0;
        }
        C5754v[] vVarArr2 = (C5754v[]) C6774a0.m15965y(i, this.f20520C);
        this.f20520C = vVarArr2;
        for (C5754v c : vVarArr2) {
            c.mo20632c(f20517G);
        }
        this.f20521D = new C5754v[this.f20524b.size()];
        while (i2 < this.f20521D.length) {
            C5754v p = this.f20519B.mo20709p(i3, 3);
            p.mo20632c(this.f20524b.get(i2));
            this.f20521D[i2] = p;
            i2++;
            i3++;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:343:0x02fe A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:348:0x0788 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x078a A[SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo21595h(p173ma.C5736i r25, p173ma.C5749s r26) throws java.io.IOException {
        /*
            r24 = this;
            r1 = r24
            r0 = r25
        L_0x0004:
            int r2 = r1.f20535m
            r3 = 1701671783(0x656d7367, float:7.0083103E22)
            r4 = 1936286840(0x73696478, float:1.8491255E31)
            r6 = 0
            r7 = 2
            r8 = 1
            r9 = 0
            if (r2 == 0) goto L_0x0580
            if (r2 == r8) goto L_0x035d
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r11 = 3
            if (r2 == r7) goto L_0x02ff
            ta.e$b r2 = r1.f20545w
            if (r2 != 0) goto L_0x00b2
            android.util.SparseArray<ta.e$b> r2 = r1.f20525c
            int r12 = r2.size()
            r13 = r3
            r3 = r6
            r4 = 0
        L_0x0029:
            if (r4 >= r12) goto L_0x0066
            java.lang.Object r15 = r2.valueAt(r4)
            ta.e$b r15 = (p264ta.C6629e.C6631b) r15
            boolean r7 = r15.f20562l
            if (r7 != 0) goto L_0x003d
            int r10 = r15.f20556f
            ta.o r5 = r15.f20554d
            int r5 = r5.f20638b
            if (r10 == r5) goto L_0x0062
        L_0x003d:
            if (r7 == 0) goto L_0x0048
            int r5 = r15.f20558h
            ta.n r10 = r15.f20552b
            int r10 = r10.f20622d
            if (r5 != r10) goto L_0x0048
            goto L_0x0062
        L_0x0048:
            if (r7 != 0) goto L_0x0053
            ta.o r5 = r15.f20554d
            long[] r5 = r5.f20639c
            int r7 = r15.f20556f
            r18 = r5[r7]
            goto L_0x005b
        L_0x0053:
            ta.n r5 = r15.f20552b
            long[] r5 = r5.f20624f
            int r7 = r15.f20558h
            r18 = r5[r7]
        L_0x005b:
            int r5 = (r18 > r13 ? 1 : (r18 == r13 ? 0 : -1))
            if (r5 >= 0) goto L_0x0062
            r3 = r15
            r13 = r18
        L_0x0062:
            int r4 = r4 + 1
            r7 = 2
            goto L_0x0029
        L_0x0066:
            if (r3 != 0) goto L_0x0089
            long r2 = r1.f20540r
            r4 = r25
            ma.e r4 = (p173ma.C5732e) r4
            long r4 = r4.f18591d
            long r2 = r2 - r4
            int r3 = (int) r2
            if (r3 < 0) goto L_0x0081
            r2 = r0
            ma.e r2 = (p173ma.C5732e) r2
            r2.mo21582i(r3)
            r1.f20535m = r9
            r1.f20538p = r9
            r8 = 0
            goto L_0x02fc
        L_0x0081:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.String r2 = "Offset to end of mdat was negative."
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x0089:
            boolean r2 = r3.f20562l
            if (r2 != 0) goto L_0x0096
            ta.o r2 = r3.f20554d
            long[] r2 = r2.f20639c
            int r4 = r3.f20556f
            r4 = r2[r4]
            goto L_0x009e
        L_0x0096:
            ta.n r2 = r3.f20552b
            long[] r2 = r2.f20624f
            int r4 = r3.f20558h
            r4 = r2[r4]
        L_0x009e:
            r2 = r25
            ma.e r2 = (p173ma.C5732e) r2
            long r12 = r2.f18591d
            long r4 = r4 - r12
            int r2 = (int) r4
            if (r2 >= 0) goto L_0x00a9
            r2 = 0
        L_0x00a9:
            r4 = r0
            ma.e r4 = (p173ma.C5732e) r4
            r4.mo21582i(r2)
            r1.f20545w = r3
            r2 = r3
        L_0x00b2:
            int r3 = r1.f20535m
            r4 = 6
            if (r3 != r11) goto L_0x0169
            boolean r3 = r2.f20562l
            if (r3 != 0) goto L_0x00c4
            ta.o r3 = r2.f20554d
            int[] r3 = r3.f20640d
            int r5 = r2.f20556f
            r3 = r3[r5]
            goto L_0x00cc
        L_0x00c4:
            ta.n r3 = r2.f20552b
            int[] r3 = r3.f20626h
            int r5 = r2.f20556f
            r3 = r3[r5]
        L_0x00cc:
            r1.f20546x = r3
            int r5 = r2.f20556f
            int r7 = r2.f20559i
            if (r5 >= r7) goto L_0x0114
            r5 = r0
            ma.e r5 = (p173ma.C5732e) r5
            r5.mo21582i(r3)
            ta.m r3 = r2.mo22810a()
            if (r3 != 0) goto L_0x00e1
            goto L_0x0108
        L_0x00e1:
            ta.n r5 = r2.f20552b
            ub.r r5 = r5.f20633o
            int r3 = r3.f20617d
            if (r3 == 0) goto L_0x00ec
            r5.mo22981A(r3)
        L_0x00ec:
            ta.n r3 = r2.f20552b
            int r7 = r2.f20556f
            boolean r10 = r3.f20630l
            if (r10 == 0) goto L_0x00fc
            boolean[] r3 = r3.f20631m
            boolean r3 = r3[r7]
            if (r3 == 0) goto L_0x00fc
            r3 = 1
            goto L_0x00fd
        L_0x00fc:
            r3 = 0
        L_0x00fd:
            if (r3 == 0) goto L_0x0108
            int r3 = r5.mo23002u()
            int r3 = r3 * 6
            r5.mo22981A(r3)
        L_0x0108:
            boolean r2 = r2.mo22811b()
            if (r2 != 0) goto L_0x0110
            r1.f20545w = r6
        L_0x0110:
            r1.f20535m = r11
            goto L_0x02fc
        L_0x0114:
            ta.o r5 = r2.f20554d
            ta.l r5 = r5.f20637a
            int r5 = r5.f20609g
            if (r5 != r8) goto L_0x0128
            int r3 = r3 + -8
            r1.f20546x = r3
            r3 = r0
            ma.e r3 = (p173ma.C5732e) r3
            r5 = 8
            r3.mo21582i(r5)
        L_0x0128:
            ta.o r3 = r2.f20554d
            ta.l r3 = r3.f20637a
            com.google.android.exoplayer2.Format r3 = r3.f20608f
            java.lang.String r3 = r3.f13418m
            java.lang.String r5 = "audio/ac4"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0155
            int r3 = r1.f20546x
            r5 = 7
            int r3 = r2.mo22812c(r3, r5)
            r1.f20547y = r3
            int r3 = r1.f20546x
            ub.r r7 = r1.f20530h
            p125ia.C5314c.m13354a(r3, r7)
            ma.v r3 = r2.f20551a
            ub.r r7 = r1.f20530h
            r3.mo20631b(r5, r7)
            int r3 = r1.f20547y
            int r3 = r3 + r5
            r1.f20547y = r3
            goto L_0x015d
        L_0x0155:
            int r3 = r1.f20546x
            int r3 = r2.mo22812c(r3, r9)
            r1.f20547y = r3
        L_0x015d:
            int r3 = r1.f20546x
            int r5 = r1.f20547y
            int r3 = r3 + r5
            r1.f20546x = r3
            r3 = 4
            r1.f20535m = r3
            r1.f20548z = r9
        L_0x0169:
            ta.o r3 = r2.f20554d
            ta.l r5 = r3.f20637a
            ma.v r7 = r2.f20551a
            boolean r10 = r2.f20562l
            if (r10 != 0) goto L_0x017a
            long[] r3 = r3.f20642f
            int r10 = r2.f20556f
            r12 = r3[r10]
            goto L_0x0189
        L_0x017a:
            ta.n r3 = r2.f20552b
            int r10 = r2.f20556f
            long[] r12 = r3.f20628j
            r13 = r12[r10]
            int[] r3 = r3.f20627i
            r3 = r3[r10]
            long r11 = (long) r3
            long r12 = r13 + r11
        L_0x0189:
            int r3 = r5.f20612j
            if (r3 == 0) goto L_0x026a
            ub.r r11 = r1.f20527e
            byte[] r11 = r11.f21038a
            r11[r9] = r9
            r11[r8] = r9
            r14 = 2
            r11[r14] = r9
            int r14 = r3 + 1
            int r3 = 4 - r3
        L_0x019c:
            int r15 = r1.f20547y
            int r10 = r1.f20546x
            if (r15 >= r10) goto L_0x027b
            int r10 = r1.f20548z
            java.lang.String r15 = "video/hevc"
            if (r10 != 0) goto L_0x0215
            r10 = r0
            ma.e r10 = (p173ma.C5732e) r10
            r10.mo21581h(r3, r14, r11, r9)
            ub.r r10 = r1.f20527e
            r10.mo23007z(r9)
            ub.r r10 = r1.f20527e
            int r10 = r10.mo22984c()
            if (r10 < r8) goto L_0x020d
            int r10 = r10 + -1
            r1.f20548z = r10
            ub.r r10 = r1.f20526d
            r10.mo23007z(r9)
            ub.r r10 = r1.f20526d
            r6 = 4
            r7.mo20631b(r6, r10)
            ub.r r10 = r1.f20527e
            r7.mo20631b(r8, r10)
            ma.v[] r10 = r1.f20521D
            int r10 = r10.length
            if (r10 <= 0) goto L_0x01fe
            com.google.android.exoplayer2.Format r10 = r5.f20608f
            java.lang.String r10 = r10.f13418m
            byte r17 = r11[r6]
            byte[] r6 = p277ub.C6795o.f21007a
            java.lang.String r6 = "video/avc"
            boolean r6 = r6.equals(r10)
            if (r6 == 0) goto L_0x01ea
            r6 = r17 & 31
            if (r6 == r4) goto L_0x01f7
        L_0x01ea:
            boolean r6 = r15.equals(r10)
            if (r6 == 0) goto L_0x01f9
            r6 = r17 & 126(0x7e, float:1.77E-43)
            int r6 = r6 >> r8
            r10 = 39
            if (r6 != r10) goto L_0x01f9
        L_0x01f7:
            r6 = 1
            goto L_0x01fa
        L_0x01f9:
            r6 = 0
        L_0x01fa:
            if (r6 == 0) goto L_0x01fe
            r6 = 1
            goto L_0x01ff
        L_0x01fe:
            r6 = 0
        L_0x01ff:
            r1.f20518A = r6
            int r6 = r1.f20547y
            int r6 = r6 + 5
            r1.f20547y = r6
            int r6 = r1.f20546x
            int r6 = r6 + r3
            r1.f20546x = r6
            goto L_0x0265
        L_0x020d:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.String r2 = "Invalid NAL length"
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x0215:
            boolean r6 = r1.f20518A
            if (r6 == 0) goto L_0x0257
            ub.r r6 = r1.f20528f
            r6.mo23004w(r10)
            ub.r r6 = r1.f20528f
            byte[] r6 = r6.f21038a
            int r10 = r1.f20548z
            r4 = r0
            ma.e r4 = (p173ma.C5732e) r4
            r4.mo21581h(r9, r10, r6, r9)
            ub.r r4 = r1.f20528f
            int r6 = r1.f20548z
            r7.mo20631b(r6, r4)
            int r4 = r1.f20548z
            ub.r r6 = r1.f20528f
            byte[] r10 = r6.f21038a
            int r6 = r6.f21040c
            int r6 = p277ub.C6795o.m16002e(r6, r10)
            ub.r r10 = r1.f20528f
            com.google.android.exoplayer2.Format r8 = r5.f20608f
            java.lang.String r8 = r8.f13418m
            boolean r8 = r15.equals(r8)
            r10.mo23007z(r8)
            ub.r r8 = r1.f20528f
            r8.mo23006y(r6)
            ub.r r6 = r1.f20528f
            ma.v[] r8 = r1.f20521D
            p173ma.C5729b.m14088a(r12, r6, r8)
            goto L_0x025b
        L_0x0257:
            int r4 = r7.mo20630a(r0, r10, r9)
        L_0x025b:
            int r6 = r1.f20547y
            int r6 = r6 + r4
            r1.f20547y = r6
            int r6 = r1.f20548z
            int r6 = r6 - r4
            r1.f20548z = r6
        L_0x0265:
            r4 = 6
            r6 = 0
            r8 = 1
            goto L_0x019c
        L_0x026a:
            int r3 = r1.f20547y
            int r4 = r1.f20546x
            if (r3 >= r4) goto L_0x027b
            int r4 = r4 - r3
            int r3 = r7.mo20630a(r0, r4, r9)
            int r4 = r1.f20547y
            int r4 = r4 + r3
            r1.f20547y = r4
            goto L_0x026a
        L_0x027b:
            boolean r3 = r2.f20562l
            if (r3 != 0) goto L_0x0288
            ta.o r3 = r2.f20554d
            int[] r3 = r3.f20643g
            int r4 = r2.f20556f
            r3 = r3[r4]
            goto L_0x0295
        L_0x0288:
            ta.n r3 = r2.f20552b
            boolean[] r3 = r3.f20629k
            int r4 = r2.f20556f
            boolean r3 = r3[r4]
            if (r3 == 0) goto L_0x0294
            r3 = 1
            goto L_0x0295
        L_0x0294:
            r3 = 0
        L_0x0295:
            ta.m r4 = r2.mo22810a()
            if (r4 == 0) goto L_0x029e
            r4 = 1073741824(0x40000000, float:2.0)
            r3 = r3 | r4
        L_0x029e:
            r20 = r3
            ta.m r3 = r2.mo22810a()
            if (r3 == 0) goto L_0x02ab
            ma.v$a r3 = r3.f20616c
            r23 = r3
            goto L_0x02ad
        L_0x02ab:
            r23 = 0
        L_0x02ad:
            int r3 = r1.f20546x
            r22 = 0
            r17 = r7
            r18 = r12
            r21 = r3
            r17.mo20633d(r18, r20, r21, r22, r23)
        L_0x02ba:
            java.util.ArrayDeque<ta.e$a> r3 = r1.f20534l
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x02ef
            java.util.ArrayDeque<ta.e$a> r3 = r1.f20534l
            java.lang.Object r3 = r3.removeFirst()
            ta.e$a r3 = (p264ta.C6629e.C6630a) r3
            int r4 = r1.f20541s
            int r5 = r3.f20550b
            int r4 = r4 - r5
            r1.f20541s = r4
            long r4 = r3.f20549a
            long r4 = r4 + r12
            ma.v[] r6 = r1.f20520C
            int r7 = r6.length
            r8 = 0
        L_0x02d8:
            if (r8 >= r7) goto L_0x02ba
            r14 = r6[r8]
            r17 = 1
            int r10 = r3.f20550b
            int r11 = r1.f20541s
            r20 = 0
            r15 = r4
            r18 = r10
            r19 = r11
            r14.mo20633d(r15, r17, r18, r19, r20)
            int r8 = r8 + 1
            goto L_0x02d8
        L_0x02ef:
            boolean r2 = r2.mo22811b()
            if (r2 != 0) goto L_0x02f8
            r2 = 0
            r1.f20545w = r2
        L_0x02f8:
            r2 = 3
            r1.f20535m = r2
            r8 = 1
        L_0x02fc:
            if (r8 == 0) goto L_0x032f
            return r9
        L_0x02ff:
            android.util.SparseArray<ta.e$b> r2 = r1.f20525c
            int r2 = r2.size()
            r5 = 0
            r6 = 0
        L_0x0307:
            if (r5 >= r2) goto L_0x032a
            android.util.SparseArray<ta.e$b> r7 = r1.f20525c
            java.lang.Object r7 = r7.valueAt(r5)
            ta.e$b r7 = (p264ta.C6629e.C6631b) r7
            ta.n r7 = r7.f20552b
            boolean r8 = r7.f20634p
            if (r8 == 0) goto L_0x0327
            long r7 = r7.f20621c
            int r11 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r11 >= 0) goto L_0x0327
            android.util.SparseArray<ta.e$b> r3 = r1.f20525c
            java.lang.Object r3 = r3.valueAt(r5)
            ta.e$b r3 = (p264ta.C6629e.C6631b) r3
            r6 = r3
            r3 = r7
        L_0x0327:
            int r5 = r5 + 1
            goto L_0x0307
        L_0x032a:
            if (r6 != 0) goto L_0x0332
            r2 = 3
            r1.f20535m = r2
        L_0x032f:
            r7 = r1
            goto L_0x078a
        L_0x0332:
            r2 = r25
            ma.e r2 = (p173ma.C5732e) r2
            long r7 = r2.f18591d
            long r3 = r3 - r7
            int r2 = (int) r3
            if (r2 < 0) goto L_0x0355
            r3 = r0
            ma.e r3 = (p173ma.C5732e) r3
            r3.mo21582i(r2)
            ta.n r2 = r6.f20552b
            ub.r r4 = r2.f20633o
            byte[] r5 = r4.f21038a
            int r4 = r4.f21040c
            r3.mo21581h(r9, r4, r5, r9)
            ub.r r3 = r2.f20633o
            r3.mo23007z(r9)
            r2.f20634p = r9
            goto L_0x032f
        L_0x0355:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.String r2 = "Offset to encryption data was negative."
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x035d:
            long r5 = r1.f20537o
            int r2 = (int) r5
            int r5 = r1.f20538p
            int r2 = r2 - r5
            ub.r r5 = r1.f20539q
            if (r5 == 0) goto L_0x056e
            byte[] r6 = r5.f21038a
            r7 = r0
            ma.e r7 = (p173ma.C5732e) r7
            r8 = 8
            r7.mo21581h(r8, r2, r6, r9)
            ta.a$b r2 = new ta.a$b
            int r6 = r1.f20536n
            r2.<init>(r6, r5)
            r7 = r25
            ma.e r7 = (p173ma.C5732e) r7
            long r7 = r7.f18591d
            java.util.ArrayDeque<ta.a$a> r10 = r1.f20533k
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L_0x0396
            java.util.ArrayDeque<ta.a$a> r3 = r1.f20533k
            java.lang.Object r3 = r3.peek()
            ta.a$a r3 = (p264ta.C6619a.C6620a) r3
            java.util.ArrayList r3 = r3.f20490c
            r3.add(r2)
            r7 = r1
            goto L_0x0575
        L_0x0396:
            if (r6 != r4) goto L_0x0451
            r0 = 8
            r5.mo23007z(r0)
            int r0 = r5.mo22984c()
            int r0 = r0 >> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            r2 = 4
            r5.mo22981A(r2)
            long r2 = r5.mo22998q()
            if (r0 != 0) goto L_0x03b8
            long r10 = r5.mo22998q()
            long r12 = r5.mo22998q()
            goto L_0x03c0
        L_0x03b8:
            long r10 = r5.mo23001t()
            long r12 = r5.mo23001t()
        L_0x03c0:
            r17 = r10
            long r6 = r12 + r7
            r12 = 1000000(0xf4240, double:4.940656E-318)
            r10 = r17
            r14 = r2
            long r19 = p277ub.C6774a0.m15939A(r10, r12, r14)
            r0 = 2
            r5.mo22981A(r0)
            int r0 = r5.mo23002u()
            int[] r4 = new int[r0]
            long[] r8 = new long[r0]
            long[] r14 = new long[r0]
            long[] r15 = new long[r0]
            r10 = r19
        L_0x03e0:
            if (r9 >= r0) goto L_0x0428
            int r12 = r5.mo22984c()
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            r13 = r13 & r12
            if (r13 != 0) goto L_0x0420
            long r21 = r5.mo22998q()
            r13 = 2147483647(0x7fffffff, float:NaN)
            r12 = r12 & r13
            r4[r9] = r12
            r8[r9] = r6
            r15[r9] = r10
            long r17 = r17 + r21
            r12 = 1000000(0xf4240, double:4.940656E-318)
            r10 = r17
            r26 = r0
            r0 = r14
            r1 = r15
            r14 = r2
            long r10 = p277ub.C6774a0.m15939A(r10, r12, r14)
            r12 = r1[r9]
            long r12 = r10 - r12
            r0[r9] = r12
            r12 = 4
            r5.mo22981A(r12)
            r13 = r4[r9]
            long r13 = (long) r13
            long r6 = r6 + r13
            int r9 = r9 + 1
            r14 = r0
            r15 = r1
            r1 = r24
            r0 = r26
            goto L_0x03e0
        L_0x0420:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.String r1 = "Unhandled indirect reference"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0428:
            r0 = r14
            r1 = r15
            java.lang.Long r2 = java.lang.Long.valueOf(r19)
            ma.c r3 = new ma.c
            r3.<init>(r4, r8, r0, r1)
            android.util.Pair r0 = android.util.Pair.create(r2, r3)
            java.lang.Object r1 = r0.first
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r7 = r24
            r7.f20544v = r1
            ma.j r1 = r7.f20519B
            java.lang.Object r0 = r0.second
            ma.t r0 = (p173ma.C5750t) r0
            r1.mo20707k(r0)
            r0 = 1
            r7.f20522E = r0
            goto L_0x056b
        L_0x0451:
            r7 = r1
            if (r6 != r3) goto L_0x056b
            ma.v[] r0 = r7.f20520C
            int r0 = r0.length
            if (r0 != 0) goto L_0x045b
            goto L_0x056b
        L_0x045b:
            r0 = 8
            r5.mo23007z(r0)
            int r0 = r5.mo22984c()
            int r0 = r0 >> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == 0) goto L_0x04a4
            r3 = 1
            if (r0 == r3) goto L_0x0474
            goto L_0x056b
        L_0x0474:
            long r3 = r5.mo22998q()
            long r10 = r5.mo23001t()
            r12 = 1000000(0xf4240, double:4.940656E-318)
            r14 = r3
            long r16 = p277ub.C6774a0.m15939A(r10, r12, r14)
            long r10 = r5.mo22998q()
            r12 = 1000(0x3e8, double:4.94E-321)
            long r3 = p277ub.C6774a0.m15939A(r10, r12, r14)
            long r10 = r5.mo22998q()
            java.lang.String r0 = r5.mo22992k()
            r0.getClass()
            java.lang.String r6 = r5.mo22992k()
            r6.getClass()
            r12 = r1
            r19 = r16
            goto L_0x04e2
        L_0x04a4:
            java.lang.String r0 = r5.mo22992k()
            r0.getClass()
            java.lang.String r6 = r5.mo22992k()
            r6.getClass()
            long r3 = r5.mo22998q()
            long r10 = r5.mo22998q()
            r12 = 1000000(0xf4240, double:4.940656E-318)
            r14 = r3
            long r16 = p277ub.C6774a0.m15939A(r10, r12, r14)
            long r10 = r7.f20544v
            int r8 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r8 == 0) goto L_0x04cd
            long r10 = r10 + r16
            r18 = r10
            goto L_0x04cf
        L_0x04cd:
            r18 = r1
        L_0x04cf:
            long r10 = r5.mo22998q()
            r12 = 1000(0x3e8, double:4.94E-321)
            r14 = r3
            long r3 = p277ub.C6774a0.m15939A(r10, r12, r14)
            long r10 = r5.mo22998q()
            r12 = r16
            r19 = r18
        L_0x04e2:
            int r8 = r5.f21040c
            int r14 = r5.f21039b
            int r8 = r8 - r14
            byte[] r14 = new byte[r8]
            r5.mo22983b(r9, r8, r14)
            com.google.android.exoplayer2.metadata.emsg.EventMessage r5 = new com.google.android.exoplayer2.metadata.emsg.EventMessage
            ub.r r5 = new ub.r
            ab.b r8 = r7.f20531i
            java.io.ByteArrayOutputStream r15 = r8.f413a
            r15.reset()
            java.io.DataOutputStream r15 = r8.f414b     // Catch:{ IOException -> 0x0564 }
            r15.writeBytes(r0)     // Catch:{ IOException -> 0x0564 }
            r15.writeByte(r9)     // Catch:{ IOException -> 0x0564 }
            java.io.DataOutputStream r0 = r8.f414b     // Catch:{ IOException -> 0x0564 }
            r0.writeBytes(r6)     // Catch:{ IOException -> 0x0564 }
            r0.writeByte(r9)     // Catch:{ IOException -> 0x0564 }
            java.io.DataOutputStream r0 = r8.f414b     // Catch:{ IOException -> 0x0564 }
            r0.writeLong(r3)     // Catch:{ IOException -> 0x0564 }
            java.io.DataOutputStream r0 = r8.f414b     // Catch:{ IOException -> 0x0564 }
            r0.writeLong(r10)     // Catch:{ IOException -> 0x0564 }
            java.io.DataOutputStream r0 = r8.f414b     // Catch:{ IOException -> 0x0564 }
            r0.write(r14)     // Catch:{ IOException -> 0x0564 }
            java.io.DataOutputStream r0 = r8.f414b     // Catch:{ IOException -> 0x0564 }
            r0.flush()     // Catch:{ IOException -> 0x0564 }
            java.io.ByteArrayOutputStream r0 = r8.f413a     // Catch:{ IOException -> 0x0564 }
            byte[] r0 = r0.toByteArray()     // Catch:{ IOException -> 0x0564 }
            r5.<init>((byte[]) r0)
            int r0 = r5.f21040c
            int r3 = r5.f21039b
            int r0 = r0 - r3
            ma.v[] r3 = r7.f20520C
            int r4 = r3.length
            r6 = 0
        L_0x052d:
            if (r6 >= r4) goto L_0x053a
            r8 = r3[r6]
            r5.mo23007z(r9)
            r8.mo20631b(r0, r5)
            int r6 = r6 + 1
            goto L_0x052d
        L_0x053a:
            int r3 = (r19 > r1 ? 1 : (r19 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x054e
            java.util.ArrayDeque<ta.e$a> r1 = r7.f20534l
            ta.e$a r2 = new ta.e$a
            r2.<init>(r12, r0)
            r1.addLast(r2)
            int r1 = r7.f20541s
            int r1 = r1 + r0
            r7.f20541s = r1
            goto L_0x056b
        L_0x054e:
            ma.v[] r1 = r7.f20520C
            int r2 = r1.length
        L_0x0551:
            if (r9 >= r2) goto L_0x056b
            r12 = r1[r9]
            r15 = 1
            r17 = 0
            r18 = 0
            r13 = r19
            r16 = r0
            r12.mo20633d(r13, r15, r16, r17, r18)
            int r9 = r9 + 1
            goto L_0x0551
        L_0x0564:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x056b:
            r0 = r25
            goto L_0x0575
        L_0x056e:
            r7 = r1
            r1 = r0
            ma.e r1 = (p173ma.C5732e) r1
            r1.mo21582i(r2)
        L_0x0575:
            r1 = r25
            ma.e r1 = (p173ma.C5732e) r1
            long r1 = r1.f18591d
            r7.mo22809e(r1)
            goto L_0x078a
        L_0x0580:
            r7 = r1
            int r1 = r7.f20538p
            if (r1 != 0) goto L_0x05af
            ub.r r1 = r7.f20532j
            byte[] r1 = r1.f21038a
            r2 = r0
            ma.e r2 = (p173ma.C5732e) r2
            r5 = 8
            r6 = 1
            boolean r1 = r2.mo21581h(r9, r5, r1, r6)
            if (r1 != 0) goto L_0x0598
            r8 = 0
            goto L_0x0786
        L_0x0598:
            r7.f20538p = r5
            ub.r r1 = r7.f20532j
            r1.mo23007z(r9)
            ub.r r1 = r7.f20532j
            long r1 = r1.mo22998q()
            r7.f20537o = r1
            ub.r r1 = r7.f20532j
            int r1 = r1.mo22984c()
            r7.f20536n = r1
        L_0x05af:
            long r1 = r7.f20537o
            r5 = 1
            int r8 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r8 != 0) goto L_0x05d1
            ub.r r1 = r7.f20532j
            byte[] r1 = r1.f21038a
            r2 = r0
            ma.e r2 = (p173ma.C5732e) r2
            r5 = 8
            r2.mo21581h(r5, r5, r1, r9)
            int r1 = r7.f20538p
            int r1 = r1 + r5
            r7.f20538p = r1
            ub.r r1 = r7.f20532j
            long r1 = r1.mo23001t()
            r7.f20537o = r1
            goto L_0x0602
        L_0x05d1:
            r5 = 0
            int r8 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r8 != 0) goto L_0x0602
            r1 = r25
            ma.e r1 = (p173ma.C5732e) r1
            long r5 = r1.f18590c
            r10 = -1
            int r2 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r2 != 0) goto L_0x05f5
            java.util.ArrayDeque<ta.a$a> r2 = r7.f20533k
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x05f5
            java.util.ArrayDeque<ta.a$a> r2 = r7.f20533k
            java.lang.Object r2 = r2.peek()
            ta.a$a r2 = (p264ta.C6619a.C6620a) r2
            long r5 = r2.f20489b
        L_0x05f5:
            int r2 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r2 == 0) goto L_0x0602
            long r1 = r1.f18591d
            long r5 = r5 - r1
            int r1 = r7.f20538p
            long r1 = (long) r1
            long r5 = r5 + r1
            r7.f20537o = r5
        L_0x0602:
            long r1 = r7.f20537o
            int r5 = r7.f20538p
            long r10 = (long) r5
            int r6 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r6 < 0) goto L_0x0795
            r1 = r25
            ma.e r1 = (p173ma.C5732e) r1
            long r10 = r1.f18591d
            long r5 = (long) r5
            long r10 = r10 - r5
            int r2 = r7.f20536n
            r5 = 1835295092(0x6d646174, float:4.4175247E27)
            r6 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r2 == r6) goto L_0x061f
            if (r2 != r5) goto L_0x0632
        L_0x061f:
            boolean r2 = r7.f20522E
            if (r2 != 0) goto L_0x0632
            ma.j r2 = r7.f20519B
            ma.t$b r8 = new ma.t$b
            long r12 = r7.f20543u
            r8.<init>(r12, r10)
            r2.mo20707k(r8)
            r2 = 1
            r7.f20522E = r2
        L_0x0632:
            int r2 = r7.f20536n
            if (r2 != r6) goto L_0x0653
            android.util.SparseArray<ta.e$b> r2 = r7.f20525c
            int r2 = r2.size()
            r8 = 0
        L_0x063d:
            if (r8 >= r2) goto L_0x0653
            android.util.SparseArray<ta.e$b> r12 = r7.f20525c
            java.lang.Object r12 = r12.valueAt(r8)
            ta.e$b r12 = (p264ta.C6629e.C6631b) r12
            ta.n r12 = r12.f20552b
            r12.getClass()
            r12.f20621c = r10
            r12.f20620b = r10
            int r8 = r8 + 1
            goto L_0x063d
        L_0x0653:
            int r2 = r7.f20536n
            if (r2 != r5) goto L_0x0665
            r5 = 0
            r7.f20545w = r5
            long r1 = r7.f20537o
            long r10 = r10 + r1
            r7.f20540r = r10
            r1 = 2
            r7.f20535m = r1
        L_0x0662:
            r1 = 1
            goto L_0x0785
        L_0x0665:
            r5 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r2 == r5) goto L_0x0692
            r5 = 1953653099(0x7472616b, float:7.681346E31)
            if (r2 == r5) goto L_0x0692
            r5 = 1835297121(0x6d646961, float:4.4181236E27)
            if (r2 == r5) goto L_0x0692
            r5 = 1835626086(0x6d696e66, float:4.515217E27)
            if (r2 == r5) goto L_0x0692
            r5 = 1937007212(0x7374626c, float:1.9362132E31)
            if (r2 == r5) goto L_0x0692
            if (r2 == r6) goto L_0x0692
            r5 = 1953653094(0x74726166, float:7.6813435E31)
            if (r2 == r5) goto L_0x0692
            r5 = 1836475768(0x6d766578, float:4.7659988E27)
            if (r2 == r5) goto L_0x0692
            r5 = 1701082227(0x65647473, float:6.742798E22)
            if (r2 != r5) goto L_0x0690
            goto L_0x0692
        L_0x0690:
            r5 = 0
            goto L_0x0693
        L_0x0692:
            r5 = 1
        L_0x0693:
            if (r5 == 0) goto L_0x06b9
            long r3 = r1.f18591d
            long r5 = r7.f20537o
            long r3 = r3 + r5
            r5 = 8
            long r3 = r3 - r5
            java.util.ArrayDeque<ta.a$a> r1 = r7.f20533k
            ta.a$a r5 = new ta.a$a
            r5.<init>(r2, r3)
            r1.push(r5)
            long r1 = r7.f20537o
            int r5 = r7.f20538p
            long r5 = (long) r5
            int r8 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r8 != 0) goto L_0x06b4
            r7.mo22809e(r3)
            goto L_0x0662
        L_0x06b4:
            r7.f20535m = r9
            r7.f20538p = r9
            goto L_0x0662
        L_0x06b9:
            r1 = 1751411826(0x68646c72, float:4.3148E24)
            if (r2 == r1) goto L_0x0742
            r1 = 1835296868(0x6d646864, float:4.418049E27)
            if (r2 == r1) goto L_0x0742
            r1 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r2 == r1) goto L_0x0742
            if (r2 == r4) goto L_0x0742
            r1 = 1937011556(0x73747364, float:1.9367383E31)
            if (r2 == r1) goto L_0x0742
            r1 = 1937011827(0x73747473, float:1.9367711E31)
            if (r2 == r1) goto L_0x0742
            r1 = 1668576371(0x63747473, float:4.5093966E21)
            if (r2 == r1) goto L_0x0742
            r1 = 1937011555(0x73747363, float:1.9367382E31)
            if (r2 == r1) goto L_0x0742
            r1 = 1937011578(0x7374737a, float:1.936741E31)
            if (r2 == r1) goto L_0x0742
            r1 = 1937013298(0x73747a32, float:1.9369489E31)
            if (r2 == r1) goto L_0x0742
            r1 = 1937007471(0x7374636f, float:1.9362445E31)
            if (r2 == r1) goto L_0x0742
            r1 = 1668232756(0x636f3634, float:4.4126776E21)
            if (r2 == r1) goto L_0x0742
            r1 = 1937011571(0x73747373, float:1.9367401E31)
            if (r2 == r1) goto L_0x0742
            r1 = 1952867444(0x74666474, float:7.3014264E31)
            if (r2 == r1) goto L_0x0742
            r1 = 1952868452(0x74666864, float:7.301914E31)
            if (r2 == r1) goto L_0x0742
            r1 = 1953196132(0x746b6864, float:7.46037E31)
            if (r2 == r1) goto L_0x0742
            r1 = 1953654136(0x74726578, float:7.6818474E31)
            if (r2 == r1) goto L_0x0742
            r1 = 1953658222(0x7472756e, float:7.683823E31)
            if (r2 == r1) goto L_0x0742
            r1 = 1886614376(0x70737368, float:3.013775E29)
            if (r2 == r1) goto L_0x0742
            r1 = 1935763834(0x7361697a, float:1.785898E31)
            if (r2 == r1) goto L_0x0742
            r1 = 1935763823(0x7361696f, float:1.7858967E31)
            if (r2 == r1) goto L_0x0742
            r1 = 1936027235(0x73656e63, float:1.8177412E31)
            if (r2 == r1) goto L_0x0742
            r1 = 1970628964(0x75756964, float:3.1109627E32)
            if (r2 == r1) goto L_0x0742
            r1 = 1935828848(0x73626770, float:1.7937577E31)
            if (r2 == r1) goto L_0x0742
            r1 = 1936158820(0x73677064, float:1.8336489E31)
            if (r2 == r1) goto L_0x0742
            r1 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r2 == r1) goto L_0x0742
            r1 = 1835362404(0x6d656864, float:4.4373917E27)
            if (r2 == r1) goto L_0x0742
            if (r2 != r3) goto L_0x0740
            goto L_0x0742
        L_0x0740:
            r1 = 0
            goto L_0x0743
        L_0x0742:
            r1 = 1
        L_0x0743:
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r1 == 0) goto L_0x0779
            int r1 = r7.f20538p
            r4 = 8
            if (r1 != r4) goto L_0x0771
            long r5 = r7.f20537o
            int r1 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x0769
            ub.r r1 = new ub.r
            int r2 = (int) r5
            r1.<init>((int) r2)
            ub.r r2 = r7.f20532j
            byte[] r2 = r2.f21038a
            byte[] r3 = r1.f21038a
            java.lang.System.arraycopy(r2, r9, r3, r9, r4)
            r7.f20539q = r1
            r1 = 1
            r7.f20535m = r1
            goto L_0x0785
        L_0x0769:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.String r1 = "Leaf atom with length > 2147483647 (unsupported)."
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0771:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.String r1 = "Leaf atom defines extended atom size (unsupported)."
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0779:
            long r4 = r7.f20537o
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x078d
            r1 = 0
            r7.f20539q = r1
            r1 = 1
            r7.f20535m = r1
        L_0x0785:
            r8 = 1
        L_0x0786:
            if (r8 != 0) goto L_0x078a
            r0 = -1
            return r0
        L_0x078a:
            r1 = r7
            goto L_0x0004
        L_0x078d:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.String r1 = "Skipping atom with length > 2147483647 (unsupported)."
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0795:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.String r1 = "Atom size less than header length (unsupported)."
            r0.<init>((java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p264ta.C6629e.mo21595h(ma.i, ma.s):int");
    }

    public final void release() {
    }
}
