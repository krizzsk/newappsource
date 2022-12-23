package p289va;

import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import p173ma.C5737j;
import p173ma.C5754v;
import p277ub.C6795o;
import p277ub.C6803r;
import p277ub.C6804s;
import p289va.C6896d0;

/* renamed from: va.m */
public final class C6913m implements C6907j {

    /* renamed from: a */
    public final C6931z f21428a;

    /* renamed from: b */
    public final boolean f21429b;

    /* renamed from: c */
    public final boolean f21430c;

    /* renamed from: d */
    public final C6921r f21431d = new C6921r(7);

    /* renamed from: e */
    public final C6921r f21432e = new C6921r(8);

    /* renamed from: f */
    public final C6921r f21433f = new C6921r(6);

    /* renamed from: g */
    public long f21434g;

    /* renamed from: h */
    public final boolean[] f21435h = new boolean[3];

    /* renamed from: i */
    public String f21436i;

    /* renamed from: j */
    public C5754v f21437j;

    /* renamed from: k */
    public C6914a f21438k;

    /* renamed from: l */
    public boolean f21439l;

    /* renamed from: m */
    public long f21440m;

    /* renamed from: n */
    public boolean f21441n;

    /* renamed from: o */
    public final C6803r f21442o = new C6803r();

    /* renamed from: va.m$a */
    public static final class C6914a {

        /* renamed from: a */
        public final C5754v f21443a;

        /* renamed from: b */
        public final boolean f21444b;

        /* renamed from: c */
        public final boolean f21445c;

        /* renamed from: d */
        public final SparseArray<C6795o.C6797b> f21446d = new SparseArray<>();

        /* renamed from: e */
        public final SparseArray<C6795o.C6796a> f21447e = new SparseArray<>();

        /* renamed from: f */
        public final C6804s f21448f;

        /* renamed from: g */
        public byte[] f21449g;

        /* renamed from: h */
        public int f21450h;

        /* renamed from: i */
        public int f21451i;

        /* renamed from: j */
        public long f21452j;

        /* renamed from: k */
        public boolean f21453k;

        /* renamed from: l */
        public long f21454l;

        /* renamed from: m */
        public C6915a f21455m = new C6915a();

        /* renamed from: n */
        public C6915a f21456n = new C6915a();

        /* renamed from: o */
        public boolean f21457o;

        /* renamed from: p */
        public long f21458p;

        /* renamed from: q */
        public long f21459q;

        /* renamed from: r */
        public boolean f21460r;

        /* renamed from: va.m$a$a */
        public static final class C6915a {

            /* renamed from: a */
            public boolean f21461a;

            /* renamed from: b */
            public boolean f21462b;

            /* renamed from: c */
            public C6795o.C6797b f21463c;

            /* renamed from: d */
            public int f21464d;

            /* renamed from: e */
            public int f21465e;

            /* renamed from: f */
            public int f21466f;

            /* renamed from: g */
            public int f21467g;

            /* renamed from: h */
            public boolean f21468h;

            /* renamed from: i */
            public boolean f21469i;

            /* renamed from: j */
            public boolean f21470j;

            /* renamed from: k */
            public boolean f21471k;

            /* renamed from: l */
            public int f21472l;

            /* renamed from: m */
            public int f21473m;

            /* renamed from: n */
            public int f21474n;

            /* renamed from: o */
            public int f21475o;

            /* renamed from: p */
            public int f21476p;
        }

        public C6914a(C5754v vVar, boolean z, boolean z2) {
            this.f21443a = vVar;
            this.f21444b = z;
            this.f21445c = z2;
            byte[] bArr = new byte[RecyclerView.C1119a0.FLAG_IGNORE];
            this.f21449g = bArr;
            this.f21448f = new C6804s(bArr, 0, 0);
            this.f21453k = false;
            this.f21457o = false;
            C6915a aVar = this.f21456n;
            aVar.f21462b = false;
            aVar.f21461a = false;
        }
    }

    public C6913m(C6931z zVar, boolean z, boolean z2) {
        this.f21428a = zVar;
        this.f21429b = z;
        this.f21430c = z2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0171  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23161a(int r17, int r18, byte[] r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            boolean r4 = r0.f21439l
            if (r4 == 0) goto L_0x0012
            va.m$a r4 = r0.f21438k
            boolean r4 = r4.f21445c
            if (r4 == 0) goto L_0x001c
        L_0x0012:
            va.r r4 = r0.f21431d
            r4.mo23163a(r1, r2, r3)
            va.r r4 = r0.f21432e
            r4.mo23163a(r1, r2, r3)
        L_0x001c:
            va.r r4 = r0.f21433f
            r4.mo23163a(r1, r2, r3)
            va.m$a r4 = r0.f21438k
            boolean r5 = r4.f21453k
            if (r5 != 0) goto L_0x0029
            goto L_0x01cb
        L_0x0029:
            int r2 = r2 - r1
            byte[] r5 = r4.f21449g
            int r6 = r5.length
            int r7 = r4.f21450h
            int r7 = r7 + r2
            r8 = 2
            if (r6 >= r7) goto L_0x003b
            int r7 = r7 * 2
            byte[] r5 = java.util.Arrays.copyOf(r5, r7)
            r4.f21449g = r5
        L_0x003b:
            byte[] r5 = r4.f21449g
            int r6 = r4.f21450h
            java.lang.System.arraycopy(r3, r1, r5, r6, r2)
            int r1 = r4.f21450h
            int r1 = r1 + r2
            r4.f21450h = r1
            ub.s r2 = r4.f21448f
            byte[] r3 = r4.f21449g
            r2.f21041a = r3
            r3 = 0
            r2.f21043c = r3
            r2.f21042b = r1
            r2.f21044d = r3
            r2.mo23008a()
            ub.s r1 = r4.f21448f
            r2 = 8
            boolean r1 = r1.mo23009b(r2)
            if (r1 != 0) goto L_0x0063
            goto L_0x01cb
        L_0x0063:
            ub.s r1 = r4.f21448f
            r1.mo23016i()
            ub.s r1 = r4.f21448f
            int r1 = r1.mo23012e(r8)
            ub.s r2 = r4.f21448f
            r5 = 5
            r2.mo23017j(r5)
            ub.s r2 = r4.f21448f
            boolean r2 = r2.mo23010c()
            if (r2 != 0) goto L_0x007e
            goto L_0x01cb
        L_0x007e:
            ub.s r2 = r4.f21448f
            r2.mo23013f()
            ub.s r2 = r4.f21448f
            boolean r2 = r2.mo23010c()
            if (r2 != 0) goto L_0x008d
            goto L_0x01cb
        L_0x008d:
            ub.s r2 = r4.f21448f
            int r2 = r2.mo23013f()
            boolean r6 = r4.f21445c
            r7 = 1
            if (r6 != 0) goto L_0x00a2
            r4.f21453k = r3
            va.m$a$a r1 = r4.f21456n
            r1.f21465e = r2
            r1.f21462b = r7
            goto L_0x01cb
        L_0x00a2:
            ub.s r6 = r4.f21448f
            boolean r6 = r6.mo23010c()
            if (r6 != 0) goto L_0x00ac
            goto L_0x01cb
        L_0x00ac:
            ub.s r6 = r4.f21448f
            int r6 = r6.mo23013f()
            android.util.SparseArray<ub.o$a> r9 = r4.f21447e
            int r9 = r9.indexOfKey(r6)
            if (r9 >= 0) goto L_0x00be
            r4.f21453k = r3
            goto L_0x01cb
        L_0x00be:
            android.util.SparseArray<ub.o$a> r9 = r4.f21447e
            java.lang.Object r9 = r9.get(r6)
            ub.o$a r9 = (p277ub.C6795o.C6796a) r9
            android.util.SparseArray<ub.o$b> r10 = r4.f21446d
            int r11 = r9.f21012b
            java.lang.Object r10 = r10.get(r11)
            ub.o$b r10 = (p277ub.C6795o.C6797b) r10
            boolean r11 = r10.f21021h
            if (r11 == 0) goto L_0x00e3
            ub.s r11 = r4.f21448f
            boolean r11 = r11.mo23009b(r8)
            if (r11 != 0) goto L_0x00de
            goto L_0x01cb
        L_0x00de:
            ub.s r11 = r4.f21448f
            r11.mo23017j(r8)
        L_0x00e3:
            ub.s r8 = r4.f21448f
            int r11 = r10.f21023j
            boolean r8 = r8.mo23009b(r11)
            if (r8 != 0) goto L_0x00ef
            goto L_0x01cb
        L_0x00ef:
            ub.s r8 = r4.f21448f
            int r11 = r10.f21023j
            int r8 = r8.mo23012e(r11)
            boolean r11 = r10.f21022i
            if (r11 != 0) goto L_0x011f
            ub.s r11 = r4.f21448f
            boolean r11 = r11.mo23009b(r7)
            if (r11 != 0) goto L_0x0105
            goto L_0x01cb
        L_0x0105:
            ub.s r11 = r4.f21448f
            boolean r11 = r11.mo23011d()
            if (r11 == 0) goto L_0x0120
            ub.s r12 = r4.f21448f
            boolean r12 = r12.mo23009b(r7)
            if (r12 != 0) goto L_0x0117
            goto L_0x01cb
        L_0x0117:
            ub.s r12 = r4.f21448f
            boolean r12 = r12.mo23011d()
            r13 = 1
            goto L_0x0122
        L_0x011f:
            r11 = 0
        L_0x0120:
            r12 = 0
            r13 = 0
        L_0x0122:
            int r14 = r4.f21451i
            if (r14 != r5) goto L_0x0128
            r5 = 1
            goto L_0x0129
        L_0x0128:
            r5 = 0
        L_0x0129:
            if (r5 == 0) goto L_0x013c
            ub.s r14 = r4.f21448f
            boolean r14 = r14.mo23010c()
            if (r14 != 0) goto L_0x0135
            goto L_0x01cb
        L_0x0135:
            ub.s r14 = r4.f21448f
            int r14 = r14.mo23013f()
            goto L_0x013d
        L_0x013c:
            r14 = 0
        L_0x013d:
            int r15 = r10.f21024k
            if (r15 != 0) goto L_0x0171
            ub.s r15 = r4.f21448f
            int r3 = r10.f21025l
            boolean r3 = r15.mo23009b(r3)
            if (r3 != 0) goto L_0x014d
            goto L_0x01cb
        L_0x014d:
            ub.s r3 = r4.f21448f
            int r15 = r10.f21025l
            int r3 = r3.mo23012e(r15)
            boolean r9 = r9.f21013c
            if (r9 == 0) goto L_0x016c
            if (r11 != 0) goto L_0x016c
            ub.s r9 = r4.f21448f
            boolean r9 = r9.mo23010c()
            if (r9 != 0) goto L_0x0165
            goto L_0x01cb
        L_0x0165:
            ub.s r9 = r4.f21448f
            int r9 = r9.mo23014g()
            goto L_0x016d
        L_0x016c:
            r9 = 0
        L_0x016d:
            r15 = r9
            r7 = 0
            r9 = 0
            goto L_0x01a5
        L_0x0171:
            if (r15 != r7) goto L_0x01a0
            boolean r3 = r10.f21026m
            if (r3 != 0) goto L_0x01a0
            ub.s r3 = r4.f21448f
            boolean r3 = r3.mo23010c()
            if (r3 != 0) goto L_0x0180
            goto L_0x01cb
        L_0x0180:
            ub.s r3 = r4.f21448f
            int r3 = r3.mo23014g()
            boolean r9 = r9.f21013c
            if (r9 == 0) goto L_0x01a1
            if (r11 != 0) goto L_0x01a1
            ub.s r9 = r4.f21448f
            boolean r9 = r9.mo23010c()
            if (r9 != 0) goto L_0x0195
            goto L_0x01cb
        L_0x0195:
            ub.s r9 = r4.f21448f
            int r9 = r9.mo23014g()
            r7 = r9
            r15 = 0
            r9 = r3
            r3 = 0
            goto L_0x01a5
        L_0x01a0:
            r3 = 0
        L_0x01a1:
            r9 = r3
            r3 = 0
            r7 = 0
            r15 = 0
        L_0x01a5:
            va.m$a$a r0 = r4.f21456n
            r0.f21463c = r10
            r0.f21464d = r1
            r0.f21465e = r2
            r0.f21466f = r8
            r0.f21467g = r6
            r0.f21468h = r11
            r0.f21469i = r13
            r0.f21470j = r12
            r0.f21471k = r5
            r0.f21472l = r14
            r0.f21473m = r3
            r0.f21474n = r15
            r0.f21475o = r9
            r0.f21476p = r7
            r1 = 1
            r0.f21461a = r1
            r0.f21462b = r1
            r0 = 0
            r4.f21453k = r0
        L_0x01cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p289va.C6913m.mo23161a(int, int, byte[]):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0276, code lost:
        if (r6 != 1) goto L_0x027a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01a8, code lost:
        if (r7.f21470j == r10.f21470j) goto L_0x01aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01b2, code lost:
        if (r14 != 0) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01c6, code lost:
        if (r7.f21474n == r10.f21474n) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01d9, code lost:
        if (r7.f21476p == r10.f21476p) goto L_0x01db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01e7, code lost:
        if (r7.f21472l == r10.f21472l) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01ed, code lost:
        if (r7 == false) goto L_0x0221;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x027e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0296 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x023d A[ADDED_TO_REGION] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23139b(p277ub.C6803r r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            ma.v r2 = r0.f21437j
            p583jk.C17875h.m44306q(r2)
            int r2 = p277ub.C6774a0.f20959a
            int r2 = r1.f21039b
            int r3 = r1.f21040c
            byte[] r4 = r1.f21038a
            long r5 = r0.f21434g
            int r7 = r3 - r2
            long r8 = (long) r7
            long r5 = r5 + r8
            r0.f21434g = r5
            ma.v r5 = r0.f21437j
            r5.mo20631b(r7, r1)
        L_0x001e:
            boolean[] r1 = r0.f21435h
            int r1 = p277ub.C6795o.m15999b(r4, r2, r3, r1)
            if (r1 != r3) goto L_0x002a
            r0.mo23161a(r2, r3, r4)
            return
        L_0x002a:
            int r5 = r1 + 3
            byte r6 = r4[r5]
            r6 = r6 & 31
            int r7 = r1 - r2
            if (r7 <= 0) goto L_0x0037
            r0.mo23161a(r2, r1, r4)
        L_0x0037:
            int r1 = r3 - r1
            long r8 = r0.f21434g
            long r10 = (long) r1
            long r8 = r8 - r10
            if (r7 >= 0) goto L_0x0041
            int r7 = -r7
            goto L_0x0042
        L_0x0041:
            r7 = 0
        L_0x0042:
            long r10 = r0.f21440m
            boolean r12 = r0.f21439l
            if (r12 == 0) goto L_0x0055
            va.m$a r12 = r0.f21438k
            boolean r12 = r12.f21445c
            if (r12 == 0) goto L_0x004f
            goto L_0x0055
        L_0x004f:
            r16 = r3
            r17 = r4
            goto L_0x0136
        L_0x0055:
            va.r r12 = r0.f21431d
            r12.mo23164b(r7)
            va.r r12 = r0.f21432e
            r12.mo23164b(r7)
            boolean r12 = r0.f21439l
            r14 = 3
            if (r12 != 0) goto L_0x00f9
            va.r r12 = r0.f21431d
            boolean r12 = r12.f21545c
            if (r12 == 0) goto L_0x004f
            va.r r12 = r0.f21432e
            boolean r12 = r12.f21545c
            if (r12 == 0) goto L_0x004f
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            va.r r15 = r0.f21431d
            byte[] r2 = r15.f21546d
            int r15 = r15.f21547e
            byte[] r2 = java.util.Arrays.copyOf(r2, r15)
            r12.add(r2)
            va.r r2 = r0.f21432e
            byte[] r15 = r2.f21546d
            int r2 = r2.f21547e
            byte[] r2 = java.util.Arrays.copyOf(r15, r2)
            r12.add(r2)
            va.r r2 = r0.f21431d
            byte[] r15 = r2.f21546d
            int r2 = r2.f21547e
            ub.o$b r2 = p277ub.C6795o.m16001d(r14, r2, r15)
            va.r r14 = r0.f21432e
            byte[] r15 = r14.f21546d
            int r14 = r14.f21547e
            ub.o$a r14 = p277ub.C6795o.m16000c(r14, r15)
            int r15 = r2.f21014a
            int r13 = r2.f21015b
            r16 = r3
            int r3 = r2.f21016c
            java.lang.String r3 = p389bl.C13637c.m34069h(r15, r13, r3)
            ma.v r13 = r0.f21437j
            com.google.android.exoplayer2.Format$b r15 = new com.google.android.exoplayer2.Format$b
            r15.<init>()
            r17 = r4
            java.lang.String r4 = r0.f21436i
            r15.f13436a = r4
            java.lang.String r4 = "video/avc"
            r15.f13446k = r4
            r15.f13443h = r3
            int r3 = r2.f21018e
            r15.f13451p = r3
            int r3 = r2.f21019f
            r15.f13452q = r3
            float r3 = r2.f21020g
            r15.f13455t = r3
            r15.f13448m = r12
            com.google.android.exoplayer2.Format r3 = new com.google.android.exoplayer2.Format
            r3.<init>((com.google.android.exoplayer2.Format.C3872b) r15)
            r13.mo20632c(r3)
            r3 = 1
            r0.f21439l = r3
            va.m$a r3 = r0.f21438k
            android.util.SparseArray<ub.o$b> r3 = r3.f21446d
            int r4 = r2.f21017d
            r3.append(r4, r2)
            va.m$a r2 = r0.f21438k
            android.util.SparseArray<ub.o$a> r2 = r2.f21447e
            int r3 = r14.f21011a
            r2.append(r3, r14)
            va.r r2 = r0.f21431d
            r2.mo23165c()
            va.r r2 = r0.f21432e
            r2.mo23165c()
            goto L_0x0136
        L_0x00f9:
            r16 = r3
            r17 = r4
            va.r r2 = r0.f21431d
            boolean r3 = r2.f21545c
            if (r3 == 0) goto L_0x011a
            byte[] r3 = r2.f21546d
            int r2 = r2.f21547e
            ub.o$b r2 = p277ub.C6795o.m16001d(r14, r2, r3)
            va.m$a r3 = r0.f21438k
            android.util.SparseArray<ub.o$b> r3 = r3.f21446d
            int r4 = r2.f21017d
            r3.append(r4, r2)
            va.r r2 = r0.f21431d
            r2.mo23165c()
            goto L_0x0136
        L_0x011a:
            va.r r2 = r0.f21432e
            boolean r3 = r2.f21545c
            if (r3 == 0) goto L_0x0136
            byte[] r3 = r2.f21546d
            int r2 = r2.f21547e
            ub.o$a r2 = p277ub.C6795o.m16000c(r2, r3)
            va.m$a r3 = r0.f21438k
            android.util.SparseArray<ub.o$a> r3 = r3.f21447e
            int r4 = r2.f21011a
            r3.append(r4, r2)
            va.r r2 = r0.f21432e
            r2.mo23165c()
        L_0x0136:
            va.r r2 = r0.f21433f
            boolean r2 = r2.mo23164b(r7)
            if (r2 == 0) goto L_0x0160
            va.r r2 = r0.f21433f
            byte[] r3 = r2.f21546d
            int r2 = r2.f21547e
            int r2 = p277ub.C6795o.m16002e(r2, r3)
            ub.r r3 = r0.f21442o
            va.r r4 = r0.f21433f
            byte[] r4 = r4.f21546d
            r3.mo23005x(r2, r4)
            ub.r r2 = r0.f21442o
            r3 = 4
            r2.mo23007z(r3)
            va.z r2 = r0.f21428a
            ub.r r3 = r0.f21442o
            ma.v[] r2 = r2.f21598b
            p173ma.C5729b.m14088a(r10, r3, r2)
        L_0x0160:
            va.m$a r2 = r0.f21438k
            boolean r3 = r0.f21439l
            boolean r4 = r0.f21441n
            int r7 = r2.f21451i
            r10 = 9
            if (r7 == r10) goto L_0x01ef
            boolean r7 = r2.f21445c
            if (r7 == 0) goto L_0x0221
            va.m$a$a r7 = r2.f21456n
            va.m$a$a r10 = r2.f21455m
            boolean r11 = r7.f21461a
            if (r11 != 0) goto L_0x017a
            goto L_0x01ea
        L_0x017a:
            boolean r11 = r10.f21461a
            if (r11 != 0) goto L_0x0180
            goto L_0x01ec
        L_0x0180:
            ub.o$b r11 = r7.f21463c
            p583jk.C17875h.m44306q(r11)
            ub.o$b r12 = r10.f21463c
            p583jk.C17875h.m44306q(r12)
            int r13 = r7.f21466f
            int r14 = r10.f21466f
            if (r13 != r14) goto L_0x01ec
            int r13 = r7.f21467g
            int r14 = r10.f21467g
            if (r13 != r14) goto L_0x01ec
            boolean r13 = r7.f21468h
            boolean r14 = r10.f21468h
            if (r13 != r14) goto L_0x01ec
            boolean r13 = r7.f21469i
            if (r13 == 0) goto L_0x01aa
            boolean r13 = r10.f21469i
            if (r13 == 0) goto L_0x01aa
            boolean r13 = r7.f21470j
            boolean r14 = r10.f21470j
            if (r13 != r14) goto L_0x01ec
        L_0x01aa:
            int r13 = r7.f21464d
            int r14 = r10.f21464d
            if (r13 == r14) goto L_0x01b4
            if (r13 == 0) goto L_0x01ec
            if (r14 == 0) goto L_0x01ec
        L_0x01b4:
            int r11 = r11.f21024k
            if (r11 != 0) goto L_0x01c8
            int r13 = r12.f21024k
            if (r13 != 0) goto L_0x01c8
            int r13 = r7.f21473m
            int r14 = r10.f21473m
            if (r13 != r14) goto L_0x01ec
            int r13 = r7.f21474n
            int r14 = r10.f21474n
            if (r13 != r14) goto L_0x01ec
        L_0x01c8:
            r13 = 1
            if (r11 != r13) goto L_0x01db
            int r11 = r12.f21024k
            if (r11 != r13) goto L_0x01db
            int r11 = r7.f21475o
            int r12 = r10.f21475o
            if (r11 != r12) goto L_0x01ec
            int r11 = r7.f21476p
            int r12 = r10.f21476p
            if (r11 != r12) goto L_0x01ec
        L_0x01db:
            boolean r11 = r7.f21471k
            boolean r12 = r10.f21471k
            if (r11 != r12) goto L_0x01ec
            if (r11 == 0) goto L_0x01ea
            int r7 = r7.f21472l
            int r10 = r10.f21472l
            if (r7 == r10) goto L_0x01ea
            goto L_0x01ec
        L_0x01ea:
            r7 = 0
            goto L_0x01ed
        L_0x01ec:
            r7 = 1
        L_0x01ed:
            if (r7 == 0) goto L_0x0221
        L_0x01ef:
            if (r3 == 0) goto L_0x0213
            boolean r3 = r2.f21457o
            if (r3 == 0) goto L_0x0213
            long r10 = r2.f21452j
            long r12 = r8 - r10
            int r3 = (int) r12
            int r23 = r1 + r3
            boolean r1 = r2.f21460r
            long r12 = r2.f21458p
            long r10 = r10 - r12
            int r3 = (int) r10
            ma.v r7 = r2.f21443a
            long r10 = r2.f21459q
            r24 = 0
            r18 = r7
            r19 = r10
            r21 = r1
            r22 = r3
            r18.mo20633d(r19, r21, r22, r23, r24)
        L_0x0213:
            long r10 = r2.f21452j
            r2.f21458p = r10
            long r10 = r2.f21454l
            r2.f21459q = r10
            r1 = 0
            r2.f21460r = r1
            r1 = 1
            r2.f21457o = r1
        L_0x0221:
            boolean r1 = r2.f21444b
            r3 = 2
            if (r1 == 0) goto L_0x0236
            va.m$a$a r1 = r2.f21456n
            boolean r4 = r1.f21462b
            if (r4 == 0) goto L_0x0235
            int r1 = r1.f21465e
            r4 = 7
            if (r1 == r4) goto L_0x0233
            if (r1 != r3) goto L_0x0235
        L_0x0233:
            r4 = 1
            goto L_0x0236
        L_0x0235:
            r4 = 0
        L_0x0236:
            boolean r1 = r2.f21460r
            int r7 = r2.f21451i
            r10 = 5
            if (r7 == r10) goto L_0x0245
            if (r4 == 0) goto L_0x0243
            r4 = 1
            if (r7 != r4) goto L_0x0243
            goto L_0x0245
        L_0x0243:
            r4 = 0
            goto L_0x0246
        L_0x0245:
            r4 = 1
        L_0x0246:
            r1 = r1 | r4
            r2.f21460r = r1
            if (r1 == 0) goto L_0x024e
            r1 = 0
            r0.f21441n = r1
        L_0x024e:
            long r1 = r0.f21440m
            boolean r4 = r0.f21439l
            if (r4 == 0) goto L_0x025a
            va.m$a r4 = r0.f21438k
            boolean r4 = r4.f21445c
            if (r4 == 0) goto L_0x0264
        L_0x025a:
            va.r r4 = r0.f21431d
            r4.mo23166d(r6)
            va.r r4 = r0.f21432e
            r4.mo23166d(r6)
        L_0x0264:
            va.r r4 = r0.f21433f
            r4.mo23166d(r6)
            va.m$a r4 = r0.f21438k
            r4.f21451i = r6
            r4.f21454l = r1
            r4.f21452j = r8
            boolean r1 = r4.f21444b
            if (r1 == 0) goto L_0x0279
            r1 = 1
            if (r6 == r1) goto L_0x0284
            goto L_0x027a
        L_0x0279:
            r1 = 1
        L_0x027a:
            boolean r2 = r4.f21445c
            if (r2 == 0) goto L_0x0296
            if (r6 == r10) goto L_0x0284
            if (r6 == r1) goto L_0x0284
            if (r6 != r3) goto L_0x0296
        L_0x0284:
            va.m$a$a r1 = r4.f21455m
            va.m$a$a r2 = r4.f21456n
            r4.f21455m = r2
            r4.f21456n = r1
            r2 = 0
            r1.f21462b = r2
            r1.f21461a = r2
            r4.f21450h = r2
            r1 = 1
            r4.f21453k = r1
        L_0x0296:
            r2 = r5
            r3 = r16
            r4 = r17
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: p289va.C6913m.mo23139b(ub.r):void");
    }

    /* renamed from: c */
    public final void mo23140c() {
        this.f21434g = 0;
        this.f21441n = false;
        C6795o.m15998a(this.f21435h);
        this.f21431d.mo23165c();
        this.f21432e.mo23165c();
        this.f21433f.mo23165c();
        C6914a aVar = this.f21438k;
        if (aVar != null) {
            aVar.f21453k = false;
            aVar.f21457o = false;
            C6914a.C6915a aVar2 = aVar.f21456n;
            aVar2.f21462b = false;
            aVar2.f21461a = false;
        }
    }

    /* renamed from: d */
    public final void mo23141d() {
    }

    /* renamed from: e */
    public final void mo23142e(int i, long j) {
        boolean z;
        this.f21440m = j;
        boolean z2 = this.f21441n;
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f21441n = z | z2;
    }

    /* renamed from: f */
    public final void mo23143f(C5737j jVar, C6896d0.C6900d dVar) {
        dVar.mo23151a();
        dVar.mo23152b();
        this.f21436i = dVar.f21327e;
        dVar.mo23152b();
        C5754v p = jVar.mo20709p(dVar.f21326d, 2);
        this.f21437j = p;
        this.f21438k = new C6914a(p, this.f21429b, this.f21430c);
        this.f21428a.mo23169a(jVar, dVar);
    }
}
