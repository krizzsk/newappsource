package p129j1;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import p116i1.C5247f;
import p241s0.C6306f;
import p609km.C18097c;

/* renamed from: j1.e */
public final class C5355e {

    /* renamed from: a */
    public static final C5363l f17653a;

    /* renamed from: b */
    public static final C6306f<String, Typeface> f17654b = new C6306f<>(16);

    /* renamed from: j1.e$a */
    public static class C5356a extends C18097c {

        /* renamed from: g */
        public C5247f.C5252e f17655g;

        public C5356a(C5247f.C5252e eVar) {
            this.f17655g = eVar;
        }
    }

    static {
        boolean z;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f17653a = new C5361j();
        } else if (i >= 28) {
            f17653a = new C5360i();
        } else if (i >= 26) {
            f17653a = new C5359h();
        } else {
            if (i >= 24) {
                if (C5358g.f17663c != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    f17653a = new C5358g();
                }
            }
            f17653a = new C5357f();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if (r0.equals(r4) == false) goto L_0x0028;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface m13430a(android.content.Context r7, p116i1.C5240d.C5242b r8, android.content.res.Resources r9, int r10, java.lang.String r11, int r12, int r13, p116i1.C5247f.C5252e r14, boolean r15) {
        /*
            boolean r0 = r8 instanceof p116i1.C5240d.C5245e
            r1 = -3
            if (r0 == 0) goto L_0x0149
            i1.d$e r8 = (p116i1.C5240d.C5245e) r8
            java.lang.String r0 = r8.f17362d
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x0027
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L_0x0014
            goto L_0x0027
        L_0x0014:
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r3)
            android.graphics.Typeface r4 = android.graphics.Typeface.DEFAULT
            android.graphics.Typeface r4 = android.graphics.Typeface.create(r4, r3)
            if (r0 == 0) goto L_0x0027
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r0 = r2
        L_0x0028:
            if (r0 == 0) goto L_0x0030
            if (r14 == 0) goto L_0x002f
            r14.mo21013b(r0)
        L_0x002f:
            return r0
        L_0x0030:
            if (r15 == 0) goto L_0x0037
            int r0 = r8.f17361c
            if (r0 != 0) goto L_0x003a
            goto L_0x0039
        L_0x0037:
            if (r14 != 0) goto L_0x003a
        L_0x0039:
            r3 = 1
        L_0x003a:
            r0 = -1
            if (r15 == 0) goto L_0x0040
            int r15 = r8.f17360b
            goto L_0x0041
        L_0x0040:
            r15 = -1
        L_0x0041:
            android.os.Handler r4 = new android.os.Handler
            android.os.Looper r5 = android.os.Looper.getMainLooper()
            r4.<init>(r5)
            j1.e$a r5 = new j1.e$a
            r5.<init>(r14)
            o1.f r8 = r8.f17359a
            o1.c r14 = new o1.c
            r14.<init>(r5, r4)
            if (r3 == 0) goto L_0x00cd
            s0.f<java.lang.String, android.graphics.Typeface> r3 = p190o1.C5917k.f19001a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = r8.f18990e
            r3.append(r6)
            java.lang.String r6 = "-"
            r3.append(r6)
            r3.append(r13)
            java.lang.String r3 = r3.toString()
            s0.f<java.lang.String, android.graphics.Typeface> r6 = p190o1.C5917k.f19001a
            java.lang.Object r6 = r6.get(r3)
            android.graphics.Typeface r6 = (android.graphics.Typeface) r6
            if (r6 == 0) goto L_0x0085
            o1.a r7 = new o1.a
            r7.<init>(r5, r6)
            r4.post(r7)
            r2 = r6
            goto L_0x015c
        L_0x0085:
            if (r15 != r0) goto L_0x0092
            o1.k$a r7 = p190o1.C5917k.m14392a(r3, r7, r8, r13)
            r14.mo21904a(r7)
            android.graphics.Typeface r2 = r7.f19005a
            goto L_0x015c
        L_0x0092:
            o1.g r0 = new o1.g
            r0.<init>(r3, r7, r8, r13)
            java.util.concurrent.ThreadPoolExecutor r7 = p190o1.C5917k.f19002b     // Catch:{ InterruptedException -> 0x00bf }
            java.util.concurrent.Future r7 = r7.submit(r0)     // Catch:{ InterruptedException -> 0x00bf }
            long r3 = (long) r15
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException -> 0x00b8, InterruptedException -> 0x00b6, TimeoutException -> 0x00ad }
            java.lang.Object r7 = r7.get(r3, r8)     // Catch:{ ExecutionException -> 0x00b8, InterruptedException -> 0x00b6, TimeoutException -> 0x00ad }
            o1.k$a r7 = (p190o1.C5917k.C5918a) r7     // Catch:{ InterruptedException -> 0x00bf }
            r14.mo21904a(r7)     // Catch:{ InterruptedException -> 0x00bf }
            android.graphics.Typeface r2 = r7.f19005a     // Catch:{ InterruptedException -> 0x00bf }
            goto L_0x015c
        L_0x00ad:
            java.lang.InterruptedException r7 = new java.lang.InterruptedException     // Catch:{ InterruptedException -> 0x00bf }
            java.lang.String r8 = "timeout"
            r7.<init>(r8)     // Catch:{ InterruptedException -> 0x00bf }
            throw r7     // Catch:{ InterruptedException -> 0x00bf }
        L_0x00b6:
            r7 = move-exception
            throw r7     // Catch:{ InterruptedException -> 0x00bf }
        L_0x00b8:
            r7 = move-exception
            java.lang.RuntimeException r8 = new java.lang.RuntimeException     // Catch:{ InterruptedException -> 0x00bf }
            r8.<init>(r7)     // Catch:{ InterruptedException -> 0x00bf }
            throw r8     // Catch:{ InterruptedException -> 0x00bf }
        L_0x00bf:
            km.c r7 = r14.f18982a
            android.os.Handler r8 = r14.f18983b
            o1.b r14 = new o1.b
            r14.<init>(r7, r1)
            r8.post(r14)
            goto L_0x015c
        L_0x00cd:
            s0.f<java.lang.String, android.graphics.Typeface> r15 = p190o1.C5917k.f19001a
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r0 = r8.f18990e
            r15.append(r0)
            java.lang.String r0 = "-"
            r15.append(r0)
            r15.append(r13)
            java.lang.String r15 = r15.toString()
            s0.f<java.lang.String, android.graphics.Typeface> r0 = p190o1.C5917k.f19001a
            java.lang.Object r0 = r0.get(r15)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            if (r0 == 0) goto L_0x00f9
            o1.a r7 = new o1.a
            r7.<init>(r5, r0)
            r4.post(r7)
            r2 = r0
            goto L_0x015c
        L_0x00f9:
            o1.h r0 = new o1.h
            r0.<init>(r14)
            java.lang.Object r3 = p190o1.C5917k.f19003c
            monitor-enter(r3)
            s0.h<java.lang.String, java.util.ArrayList<r1.a<o1.k$a>>> r14 = p190o1.C5917k.f19004d     // Catch:{ all -> 0x0146 }
            java.lang.Object r1 = r14.getOrDefault(r15, r2)     // Catch:{ all -> 0x0146 }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x0146 }
            if (r1 == 0) goto L_0x0110
            r1.add(r0)     // Catch:{ all -> 0x0146 }
            monitor-exit(r3)     // Catch:{ all -> 0x0146 }
            goto L_0x015c
        L_0x0110:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0146 }
            r1.<init>()     // Catch:{ all -> 0x0146 }
            r1.add(r0)     // Catch:{ all -> 0x0146 }
            r14.put(r15, r1)     // Catch:{ all -> 0x0146 }
            monitor-exit(r3)     // Catch:{ all -> 0x0146 }
            o1.i r14 = new o1.i
            r14.<init>(r15, r7, r8, r13)
            java.util.concurrent.ThreadPoolExecutor r7 = p190o1.C5917k.f19002b
            o1.j r8 = new o1.j
            r8.<init>(r15)
            android.os.Looper r15 = android.os.Looper.myLooper()
            if (r15 != 0) goto L_0x0138
            android.os.Handler r15 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r15.<init>(r0)
            goto L_0x013d
        L_0x0138:
            android.os.Handler r15 = new android.os.Handler
            r15.<init>()
        L_0x013d:
            o1.o r0 = new o1.o
            r0.<init>(r15, r14, r8)
            r7.execute(r0)
            goto L_0x015c
        L_0x0146:
            r7 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0146 }
            throw r7
        L_0x0149:
            j1.l r15 = f17653a
            i1.d$c r8 = (p116i1.C5240d.C5243c) r8
            android.graphics.Typeface r2 = r15.mo21135a(r7, r8, r9, r13)
            if (r14 == 0) goto L_0x015c
            if (r2 == 0) goto L_0x0159
            r14.mo21013b(r2)
            goto L_0x015c
        L_0x0159:
            r14.mo21012a(r1)
        L_0x015c:
            if (r2 == 0) goto L_0x0167
            s0.f<java.lang.String, android.graphics.Typeface> r7 = f17654b
            java.lang.String r8 = m13431b(r9, r10, r11, r12, r13)
            r7.put(r8, r2)
        L_0x0167:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p129j1.C5355e.m13430a(android.content.Context, i1.d$b, android.content.res.Resources, int, java.lang.String, int, int, i1.f$e, boolean):android.graphics.Typeface");
    }

    /* renamed from: b */
    public static String m13431b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
