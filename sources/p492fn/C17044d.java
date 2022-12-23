package p492fn;

import com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider;
import com.appboy.support.ValidationUtils;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.nearby.messages.Strategy;
import java.util.Calendar;
import p258t4.C6587a;
import p581ji.C17854a;
import p583jk.C17871d;
import p683np.C18579a;

/* renamed from: fn.d */
public final class C17044d {

    /* renamed from: i */
    public static final int[] f44183i;

    /* renamed from: j */
    public static final int f44184j;

    /* renamed from: k */
    public static final int[] f44185k = {16711680, 16755200, 16776192, 12451584, 65283, 11141439, 8323264, 6579698, 2424973, Place.TYPE_SUBLOCALITY_LEVEL_1, 16711932, 32897, 8355711, 13197056, 52428};

    /* renamed from: a */
    public final C17871d f44186a;

    /* renamed from: b */
    public final C18579a f44187b;

    /* renamed from: c */
    public final C17046e[] f44188c;

    /* renamed from: d */
    public final boolean f44189d;

    /* renamed from: e */
    public final int[] f44190e;

    /* renamed from: f */
    public final Calendar f44191f;

    /* renamed from: g */
    public long[] f44192g;

    /* renamed from: h */
    public int[] f44193h;

    /* renamed from: fn.d$a */
    public static class C17045a {

        /* renamed from: a */
        public final C17871d f44194a;

        /* renamed from: b */
        public final C6587a f44195b;

        public C17045a(C17871d dVar, C6587a aVar) {
            this.f44194a = dVar;
            this.f44195b = aVar;
        }
    }

    static {
        int[] iArr = {Strategy.TTL_SECONDS_MAX, 3600, STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS};
        f44183i = iArr;
        f44184j = iArr.length;
    }

    public C17044d(C17871d dVar, C17854a aVar, C17046e[] eVarArr, boolean z) {
        int i = f44184j;
        int i2 = i * 2;
        this.f44192g = new long[i2];
        this.f44193h = new int[i2];
        this.f44186a = dVar;
        this.f44187b = aVar;
        this.f44188c = eVarArr;
        this.f44189d = z;
        this.f44190e = new int[i];
        dVar.getClass();
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(dVar.f45856a.mo49402a());
        this.f44191f = instance;
    }

    /* renamed from: a */
    public static int m42894a(int i, int i2, int i3) {
        int i4 = i2 & ValidationUtils.APPBOY_STRING_MAX_LENGTH;
        int i5 = i & ValidationUtils.APPBOY_STRING_MAX_LENGTH;
        int i6 = (((((i4 - i5) * i3) + 512) >> 10) + i5) & ValidationUtils.APPBOY_STRING_MAX_LENGTH;
        int i7 = (i2 >> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH;
        int i8 = (i >> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH;
        int i9 = (i2 >> 16) & ValidationUtils.APPBOY_STRING_MAX_LENGTH;
        int i11 = (i >> 16) & ValidationUtils.APPBOY_STRING_MAX_LENGTH;
        return (((((((i9 - i11) * i3) + 512) >> 10) + i11) & ValidationUtils.APPBOY_STRING_MAX_LENGTH) << 16) | i6 | (((((((i7 - i8) * i3) + 512) >> 10) + i8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH) << 8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x0166 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0167  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo49648b(int r18, java.util.Calendar r19, boolean r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            if (r20 == 0) goto L_0x001d
            java.util.Calendar r2 = r0.f44191f
            java.util.Date r3 = new java.util.Date
            long r4 = r19.getTimeInMillis()
            int[] r6 = f44183i
            r6 = r6[r1]
            int r6 = r6 * 1000
            long r6 = (long) r6
            long r4 = r4 + r6
            r3.<init>(r4)
            r2.setTime(r3)
            goto L_0x002b
        L_0x001d:
            java.util.Calendar r2 = r0.f44191f
            java.util.Date r3 = new java.util.Date
            long r4 = r19.getTimeInMillis()
            r3.<init>(r4)
            r2.setTime(r3)
        L_0x002b:
            java.util.Calendar r2 = r0.f44191f
            r3 = 11
            int r2 = r2.get(r3)
            int r2 = r2 * 3600
            java.util.Calendar r4 = r0.f44191f
            r5 = 12
            int r4 = r4.get(r5)
            int r4 = r4 * 60
            int r4 = r4 + r2
            java.util.Calendar r2 = r0.f44191f
            r6 = 13
            int r2 = r2.get(r6)
            int r2 = r2 + r4
            int[] r4 = f44183i
            r4 = r4[r1]
            int r4 = r2 % r4
            int r2 = r2 - r4
            java.util.Calendar r4 = r0.f44191f
            int r7 = r2 / 3600
            r4.set(r3, r7)
            java.util.Calendar r4 = r0.f44191f
            int r7 = r2 % 3600
            int r7 = r7 / 60
            r4.set(r5, r7)
            java.util.Calendar r4 = r0.f44191f
            int r2 = r2 % 60
            r4.set(r6, r2)
            java.util.Calendar r2 = r0.f44191f
            r4 = 14
            r7 = 0
            r2.set(r4, r7)
            java.util.Calendar r2 = r0.f44191f
            if (r20 == 0) goto L_0x0076
            int r4 = f44184j
            goto L_0x0077
        L_0x0076:
            r4 = 0
        L_0x0077:
            int r4 = r4 + r1
            long r8 = r2.getTimeInMillis()
            long[] r10 = r0.f44192g
            if (r10 == 0) goto L_0x008b
            r11 = r10[r4]
            int r10 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r10 != 0) goto L_0x008b
            int[] r1 = r0.f44193h
            r1 = r1[r4]
            return r1
        L_0x008b:
            r10 = 1
            int r11 = r2.get(r10)
            r12 = 2
            int r13 = r2.get(r12)
            r14 = 5
            int r15 = r2.get(r14)
            int r11 = r11 + -2000
            java.lang.String r6 = " "
            if (r11 < 0) goto L_0x00a4
            r5 = 99
            if (r11 <= r5) goto L_0x00bd
        L_0x00a4:
            java.io.PrintStream r5 = java.lang.System.err
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r10 = "DateUtils.packDate() Attempt to pack date with invalid year: "
            r12.append(r10)
            r12.append(r11)
            r12.append(r6)
            java.lang.String r10 = r12.toString()
            r5.println(r10)
        L_0x00bd:
            if (r13 < 0) goto L_0x00c1
            if (r13 <= r3) goto L_0x00da
        L_0x00c1:
            java.io.PrintStream r5 = java.lang.System.err
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = "DateUtils.packDate() Attempt to pack date with invalid month: "
            r10.append(r12)
            r10.append(r13)
            r10.append(r6)
            java.lang.String r10 = r10.toString()
            r5.println(r10)
        L_0x00da:
            if (r15 < 0) goto L_0x00e0
            r5 = 31
            if (r15 <= r5) goto L_0x00f9
        L_0x00e0:
            java.io.PrintStream r5 = java.lang.System.err
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = "DateUtils.packDate() Attempt to pack date with invalid day of the month: "
            r10.append(r12)
            r10.append(r15)
            r10.append(r6)
            java.lang.String r6 = r10.toString()
            r5.println(r6)
        L_0x00f9:
            int r5 = r11 << 9
            int r6 = r13 << 5
            r5 = r5 | r6
            r5 = r5 | r15
            short r5 = (short) r5
            fn.e[] r6 = r0.f44188c
            if (r6 == 0) goto L_0x0123
            int r11 = r6.length
            if (r11 != 0) goto L_0x0108
            goto L_0x0123
        L_0x0108:
            int r11 = r6.length
            r12 = 0
            r13 = 0
        L_0x010b:
            if (r12 >= r11) goto L_0x0124
            r15 = r6[r12]
            if (r15 != 0) goto L_0x0112
            goto L_0x0120
        L_0x0112:
            short r10 = r15.f44197b
            if (r10 != r5) goto L_0x0118
            r10 = 0
            goto L_0x011d
        L_0x0118:
            if (r10 <= r5) goto L_0x011c
            r10 = 1
            goto L_0x011d
        L_0x011c:
            r10 = -1
        L_0x011d:
            if (r10 > 0) goto L_0x0124
            r13 = r15
        L_0x0120:
            int r12 = r12 + 1
            goto L_0x010b
        L_0x0123:
            r13 = 0
        L_0x0124:
            r5 = 16
            if (r13 != 0) goto L_0x0129
            goto L_0x0150
        L_0x0129:
            byte[] r6 = r13.f44196a
            int r10 = r6.length
            byte[] r6 = java.util.Arrays.copyOf(r6, r10)
            java.lang.String r10 = r13.f44198c
            if (r10 != 0) goto L_0x0137
            byte[] r10 = new byte[r5]
            goto L_0x014c
        L_0x0137:
            int r11 = r10.length()
            byte[] r12 = new byte[r5]
            byte[] r10 = r10.getBytes()
            java.lang.System.arraycopy(r10, r7, r12, r7, r11)
            if (r11 >= r5) goto L_0x014b
            int r13 = 16 - r11
            java.lang.System.arraycopy(r10, r7, r12, r11, r13)
        L_0x014b:
            r10 = r12
        L_0x014c:
            int r11 = r6.length
            int r12 = r10.length
            if (r11 == r12) goto L_0x0152
        L_0x0150:
            r12 = 0
            goto L_0x0164
        L_0x0152:
            int r11 = r6.length
            byte[] r12 = new byte[r11]
            r13 = 0
        L_0x0156:
            if (r13 >= r11) goto L_0x0164
            byte r15 = r6[r13]
            byte r16 = r10[r13]
            r15 = r15 ^ r16
            byte r15 = (byte) r15
            r12[r13] = r15
            int r13 = r13 + 1
            goto L_0x0156
        L_0x0164:
            if (r12 != 0) goto L_0x0167
            return r7
        L_0x0167:
            r6 = 1
            int r10 = r2.get(r6)
            r6 = 2
            int r11 = r2.get(r6)
            int r6 = r2.get(r14)
            int r3 = r2.get(r3)
            r13 = 12
            int r13 = r2.get(r13)
            r15 = 13
            int r2 = r2.get(r15)
            r15 = 7
            byte[] r5 = new byte[r15]
            int r15 = r10 >> 8
            r15 = r15 & 255(0xff, float:3.57E-43)
            byte r15 = (byte) r15
            r5[r7] = r15
            r10 = r10 & 255(0xff, float:3.57E-43)
            byte r10 = (byte) r10
            r15 = 1
            r5[r15] = r10
            byte r10 = (byte) r11
            r11 = 2
            r5[r11] = r10
            byte r6 = (byte) r6
            r10 = 3
            r5[r10] = r6
            byte r3 = (byte) r3
            r6 = 4
            r5[r6] = r3
            byte r3 = (byte) r13
            r5[r14] = r3
            byte r2 = (byte) r2
            r3 = 6
            r5[r3] = r2
            r2 = 32
            byte[] r2 = new byte[r2]
            int r3 = r12.length
            java.lang.System.arraycopy(r12, r7, r2, r7, r3)
            int r3 = r12.length
            r11 = 7
            java.lang.System.arraycopy(r5, r7, r2, r3, r11)
            int r3 = r12.length
            int r3 = r3 + r11
            byte r1 = (byte) r1
            r2[r3] = r1
            np.a r1 = r0.f44187b
            ji.a r1 = (p581ji.C17854a) r1
            r3 = 0
            r1.mo50426b(r3)
            r1 = 16
            byte[] r3 = new byte[r1]
            java.lang.System.arraycopy(r2, r7, r3, r7, r1)
            np.a r5 = r0.f44187b
            ji.a r5 = (p581ji.C17854a) r5
            r5.mo50431i(r3)
            java.lang.System.arraycopy(r2, r1, r3, r7, r1)
            np.a r1 = r0.f44187b
            ji.a r1 = (p581ji.C17854a) r1
            r1.mo50431i(r3)
            np.a r1 = r0.f44187b
            ji.a r1 = (p581ji.C17854a) r1
            byte[] r2 = new byte[r6]
            r1.mo50428f(r6, r2)
            byte r1 = r2[r7]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r3 = 1
            byte r3 = r2[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 8
            r1 = r1 | r3
            r3 = 2
            byte r3 = r2[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r5 = 16
            int r3 = r3 << r5
            r1 = r1 | r3
            byte r2 = r2[r10]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 24
            r1 = r1 | r2
            int r1 = java.lang.Math.abs(r1)
            int[] r2 = f44185k
            int r1 = r1 % 15
            r1 = r2[r1]
            long[] r2 = r0.f44192g
            if (r2 == 0) goto L_0x0215
            int[] r3 = r0.f44193h
            if (r3 == 0) goto L_0x0215
            r2[r4] = r8
            r3[r4] = r1
        L_0x0215:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p492fn.C17044d.mo49648b(int, java.util.Calendar, boolean):int");
    }
}
