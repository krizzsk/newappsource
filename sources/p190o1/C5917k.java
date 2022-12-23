package p190o1;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p229r1.C6231a;
import p241s0.C6306f;
import p241s0.C6313h;

/* renamed from: o1.k */
public final class C5917k {

    /* renamed from: a */
    public static final C6306f<String, Typeface> f19001a = new C6306f<>(16);

    /* renamed from: b */
    public static final ThreadPoolExecutor f19002b;

    /* renamed from: c */
    public static final Object f19003c = new Object();

    /* renamed from: d */
    public static final C6313h<String, ArrayList<C6231a<C5918a>>> f19004d = new C6313h<>();

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, (long) 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new C5921n());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f19002b = threadPoolExecutor;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0045  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p190o1.C5917k.C5918a m14392a(java.lang.String r6, android.content.Context r7, p190o1.C5912f r8, int r9) {
        /*
            s0.f<java.lang.String, android.graphics.Typeface> r0 = f19001a
            java.lang.Object r0 = r0.get(r6)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            if (r0 == 0) goto L_0x0010
            o1.k$a r6 = new o1.k$a
            r6.<init>((android.graphics.Typeface) r0)
            return r6
        L_0x0010:
            o1.l r8 = p190o1.C5910e.m14390a(r7, r8)     // Catch:{ NameNotFoundException -> 0x0060 }
            int r0 = r8.f19007a
            r1 = -3
            r2 = 1
            if (r0 == 0) goto L_0x001f
            if (r0 == r2) goto L_0x001d
            goto L_0x0034
        L_0x001d:
            r0 = -2
            goto L_0x003d
        L_0x001f:
            o1.m[] r0 = r8.f19008b
            r3 = 0
            if (r0 == 0) goto L_0x003c
            int r4 = r0.length
            if (r4 != 0) goto L_0x0028
            goto L_0x003c
        L_0x0028:
            int r2 = r0.length
            r4 = 0
        L_0x002a:
            if (r4 >= r2) goto L_0x003b
            r5 = r0[r4]
            int r5 = r5.f19013e
            if (r5 == 0) goto L_0x0038
            if (r5 >= 0) goto L_0x0036
        L_0x0034:
            r0 = -3
            goto L_0x003d
        L_0x0036:
            r0 = r5
            goto L_0x003d
        L_0x0038:
            int r4 = r4 + 1
            goto L_0x002a
        L_0x003b:
            r2 = 0
        L_0x003c:
            r0 = r2
        L_0x003d:
            if (r0 == 0) goto L_0x0045
            o1.k$a r6 = new o1.k$a
            r6.<init>((int) r0)
            return r6
        L_0x0045:
            o1.m[] r8 = r8.f19008b
            j1.l r0 = p129j1.C5355e.f17653a
            android.graphics.Typeface r7 = r0.mo21136b(r7, r8, r9)
            if (r7 == 0) goto L_0x005a
            s0.f<java.lang.String, android.graphics.Typeface> r8 = f19001a
            r8.put(r6, r7)
            o1.k$a r6 = new o1.k$a
            r6.<init>((android.graphics.Typeface) r7)
            return r6
        L_0x005a:
            o1.k$a r6 = new o1.k$a
            r6.<init>((int) r1)
            return r6
        L_0x0060:
            o1.k$a r6 = new o1.k$a
            r7 = -1
            r6.<init>((int) r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p190o1.C5917k.m14392a(java.lang.String, android.content.Context, o1.f, int):o1.k$a");
    }

    /* renamed from: o1.k$a */
    public static final class C5918a {

        /* renamed from: a */
        public final Typeface f19005a;

        /* renamed from: b */
        public final int f19006b;

        public C5918a(int i) {
            this.f19005a = null;
            this.f19006b = i;
        }

        @SuppressLint({"WrongConstant"})
        public C5918a(Typeface typeface) {
            this.f19005a = typeface;
            this.f19006b = 0;
        }
    }
}
