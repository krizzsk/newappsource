package p146k6;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: k6.o */
public final class C5510o {

    /* renamed from: g */
    public static final boolean f18053g;

    /* renamed from: h */
    public static final boolean f18054h;

    /* renamed from: i */
    public static final File f18055i = new File("/proc/self/fd");

    /* renamed from: j */
    public static volatile C5510o f18056j;

    /* renamed from: k */
    public static volatile int f18057k = -1;

    /* renamed from: a */
    public final boolean f18058a;

    /* renamed from: b */
    public final int f18059b;

    /* renamed from: c */
    public final int f18060c;

    /* renamed from: d */
    public int f18061d;

    /* renamed from: e */
    public boolean f18062e = true;

    /* renamed from: f */
    public final AtomicBoolean f18063f = new AtomicBoolean(false);

    static {
        boolean z;
        int i = Build.VERSION.SDK_INT;
        boolean z2 = true;
        if (i < 29) {
            z = true;
        } else {
            z = false;
        }
        f18053g = z;
        if (i < 26) {
            z2 = false;
        }
        f18054h = z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x009e, code lost:
        if (r2 == false) goto L_0x00a2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C5510o() {
        /*
            r26 = this;
            r0 = r26
            r26.<init>()
            r1 = 1
            r0.f18062e = r1
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r3 = 0
            r2.<init>(r3)
            r0.f18063f = r2
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r2 == r4) goto L_0x0017
            goto L_0x005b
        L_0x0017:
            java.lang.String r5 = "SC-04J"
            java.lang.String r6 = "SM-N935"
            java.lang.String r7 = "SM-J720"
            java.lang.String r8 = "SM-G570F"
            java.lang.String r9 = "SM-G570M"
            java.lang.String r10 = "SM-G960"
            java.lang.String r11 = "SM-G965"
            java.lang.String r12 = "SM-G935"
            java.lang.String r13 = "SM-G930"
            java.lang.String r14 = "SM-A520"
            java.lang.String r15 = "SM-A720F"
            java.lang.String r16 = "moto e5"
            java.lang.String r17 = "moto e5 play"
            java.lang.String r18 = "moto e5 plus"
            java.lang.String r19 = "moto e5 cruise"
            java.lang.String r20 = "moto g(6) forge"
            java.lang.String r21 = "moto g(6) play"
            java.lang.String[] r2 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21}
            java.util.List r2 = java.util.Arrays.asList(r2)
            java.util.Iterator r2 = r2.iterator()
        L_0x0045:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x005b
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = android.os.Build.MODEL
            boolean r4 = r5.startsWith(r4)
            if (r4 == 0) goto L_0x0045
            r2 = 1
            goto L_0x005c
        L_0x005b:
            r2 = 0
        L_0x005c:
            if (r2 != 0) goto L_0x00a1
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 27
            if (r2 == r4) goto L_0x0066
            r2 = 0
            goto L_0x009e
        L_0x0066:
            java.lang.String r5 = "LG-M250"
            java.lang.String r6 = "LG-M320"
            java.lang.String r7 = "LG-Q710AL"
            java.lang.String r8 = "LG-Q710PL"
            java.lang.String r9 = "LGM-K121K"
            java.lang.String r10 = "LGM-K121L"
            java.lang.String r11 = "LGM-K121S"
            java.lang.String r12 = "LGM-X320K"
            java.lang.String r13 = "LGM-X320L"
            java.lang.String r14 = "LGM-X320S"
            java.lang.String r15 = "LGM-X401L"
            java.lang.String r16 = "LGM-X401S"
            java.lang.String r17 = "LM-Q610.FG"
            java.lang.String r18 = "LM-Q610.FGN"
            java.lang.String r19 = "LM-Q617.FG"
            java.lang.String r20 = "LM-Q617.FGN"
            java.lang.String r21 = "LM-Q710.FG"
            java.lang.String r22 = "LM-Q710.FGN"
            java.lang.String r23 = "LM-X220PM"
            java.lang.String r24 = "LM-X220QMA"
            java.lang.String r25 = "LM-X410PM"
            java.lang.String[] r2 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25}
            java.util.List r2 = java.util.Arrays.asList(r2)
            java.lang.String r4 = android.os.Build.MODEL
            boolean r2 = r2.contains(r4)
        L_0x009e:
            if (r2 != 0) goto L_0x00a1
            goto L_0x00a2
        L_0x00a1:
            r1 = 0
        L_0x00a2:
            r0.f18058a = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L_0x00b1
            r1 = 20000(0x4e20, float:2.8026E-41)
            r0.f18059b = r1
            r0.f18060c = r3
            goto L_0x00b9
        L_0x00b1:
            r1 = 700(0x2bc, float:9.81E-43)
            r0.f18059b = r1
            r1 = 128(0x80, float:1.794E-43)
            r0.f18060c = r1
        L_0x00b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p146k6.C5510o.<init>():void");
    }

    /* renamed from: a */
    public final boolean mo21382a(int i, int i2, boolean z, boolean z2) {
        boolean z3;
        int i3;
        boolean z4;
        int i4;
        boolean z5;
        if (!z || !this.f18058a || !f18054h) {
            return false;
        }
        if (!f18053g || this.f18063f.get()) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z3 || z2 || i < (i3 = this.f18060c) || i2 < i3) {
            return false;
        }
        synchronized (this) {
            int i5 = this.f18061d + 1;
            this.f18061d = i5;
            if (i5 >= 50) {
                this.f18061d = 0;
                int length = f18055i.list().length;
                if (f18057k != -1) {
                    i4 = f18057k;
                } else {
                    i4 = this.f18059b;
                }
                if (((long) length) < ((long) i4)) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                this.f18062e = z5;
            }
            z4 = this.f18062e;
        }
        if (!z4) {
            return false;
        }
        return true;
    }

    @TargetApi(26)
    /* renamed from: b */
    public final boolean mo21383b(int i, int i2, BitmapFactory.Options options, boolean z, boolean z2) {
        boolean a = mo21382a(i, i2, z, z2);
        if (a) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return a;
    }
}
