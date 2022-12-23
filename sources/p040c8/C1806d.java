package p040c8;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import p262t8.C6606a;
import p316y.C7219n;

/* renamed from: c8.d */
public final class C1806d implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: f */
    public static final HashMap f6298f = new HashMap();

    /* renamed from: b */
    public final LinkedHashSet f6299b = new LinkedHashSet();

    /* renamed from: c */
    public final Handler f6300c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    public final WeakReference<Activity> f6301d;

    /* renamed from: e */
    public final AtomicBoolean f6302e;

    /* renamed from: c8.d$a */
    public static final class C1807a {
        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0042, code lost:
            if (r4.equals("r5") == false) goto L_0x0082;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
            if (r4.equals("r4") == false) goto L_0x0082;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x004e, code lost:
            r5 = new kotlin.text.Regex("[^a-z]+").mo60284c(r5, "");
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static final void m5120a(java.util.HashMap r3, java.lang.String r4, java.lang.String r5) {
            /*
                java.util.HashMap r0 = p040c8.C1806d.f6298f
                int r0 = r4.hashCode()
                switch(r0) {
                    case 3585: goto L_0x005c;
                    case 3586: goto L_0x0045;
                    case 3587: goto L_0x003c;
                    case 3588: goto L_0x000b;
                    default: goto L_0x0009;
                }
            L_0x0009:
                goto L_0x0082
            L_0x000b:
                java.lang.String r0 = "r6"
                boolean r0 = r4.equals(r0)
                if (r0 != 0) goto L_0x0015
                goto L_0x0082
            L_0x0015:
                java.lang.String r0 = "-"
                r1 = 0
                boolean r2 = kotlin.text.C24179b.m60559G(r5, r0, r1)
                if (r2 == 0) goto L_0x0082
                kotlin.text.Regex r2 = new kotlin.text.Regex
                r2.<init>((java.lang.String) r0)
                java.util.List r5 = r2.mo60285d(r5)
                java.lang.String[] r0 = new java.lang.String[r1]
                java.lang.Object[] r5 = r5.toArray(r0)
                if (r5 == 0) goto L_0x0034
                java.lang.String[] r5 = (java.lang.String[]) r5
                r5 = r5[r1]
                goto L_0x0082
            L_0x0034:
                java.lang.NullPointerException r3 = new java.lang.NullPointerException
                java.lang.String r4 = "null cannot be cast to non-null type kotlin.Array<T>"
                r3.<init>(r4)
                throw r3
            L_0x003c:
                java.lang.String r0 = "r5"
                boolean r0 = r4.equals(r0)
                if (r0 != 0) goto L_0x004e
                goto L_0x0082
            L_0x0045:
                java.lang.String r0 = "r4"
                boolean r0 = r4.equals(r0)
                if (r0 != 0) goto L_0x004e
                goto L_0x0082
            L_0x004e:
                kotlin.text.Regex r0 = new kotlin.text.Regex
                java.lang.String r1 = "[^a-z]+"
                r0.<init>((java.lang.String) r1)
                java.lang.String r1 = ""
                java.lang.String r5 = r0.mo60284c(r5, r1)
                goto L_0x0082
            L_0x005c:
                java.lang.String r0 = "r3"
                boolean r0 = r4.equals(r0)
                if (r0 != 0) goto L_0x0065
                goto L_0x0082
            L_0x0065:
                java.lang.String r0 = "m"
                boolean r1 = uh0.C25081h.m62835F(r5, r0)
                if (r1 != 0) goto L_0x0081
                java.lang.String r1 = "b"
                boolean r1 = uh0.C25081h.m62835F(r5, r1)
                if (r1 != 0) goto L_0x0081
                java.lang.String r1 = "ge"
                boolean r5 = uh0.C25081h.m62835F(r5, r1)
                if (r5 == 0) goto L_0x007e
                goto L_0x0081
            L_0x007e:
                java.lang.String r5 = "f"
                goto L_0x0082
            L_0x0081:
                r5 = r0
            L_0x0082:
                r3.put(r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c8.C1806d.C1807a.m5120a(java.util.HashMap, java.lang.String, java.lang.String):void");
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0039 A[SYNTHETIC, Splitter:B:12:0x0039] */
        /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x0026  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void m5121b(android.app.Activity r3) {
            /*
                java.lang.String r0 = "activity"
                mf0.C24362h.m61211f(r3, r0)
                int r0 = r3.hashCode()
                java.lang.Class<c8.d> r1 = p040c8.C1806d.class
                boolean r1 = p262t8.C6606a.m15601b(r1)
                if (r1 == 0) goto L_0x0012
                goto L_0x001b
            L_0x0012:
                java.util.HashMap r1 = p040c8.C1806d.f6298f     // Catch:{ all -> 0x0015 }
                goto L_0x001c
            L_0x0015:
                r1 = move-exception
                java.lang.Class<c8.d> r2 = p040c8.C1806d.class
                p262t8.C6606a.m15600a(r2, r1)
            L_0x001b:
                r1 = 0
            L_0x001c:
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                java.lang.Object r2 = r1.get(r0)
                if (r2 != 0) goto L_0x002e
                c8.d r2 = new c8.d
                r2.<init>(r3)
                r1.put(r0, r2)
            L_0x002e:
                c8.d r2 = (p040c8.C1806d) r2
                java.lang.Class<c8.d> r3 = p040c8.C1806d.class
                boolean r3 = p262t8.C6606a.m15601b(r3)
                if (r3 == 0) goto L_0x0039
                goto L_0x0074
            L_0x0039:
                boolean r3 = p262t8.C6606a.m15601b(r2)     // Catch:{ all -> 0x006e }
                if (r3 == 0) goto L_0x0040
                goto L_0x0074
            L_0x0040:
                java.util.concurrent.atomic.AtomicBoolean r3 = r2.f6302e     // Catch:{ all -> 0x0069 }
                r0 = 1
                boolean r3 = r3.getAndSet(r0)     // Catch:{ all -> 0x0069 }
                if (r3 == 0) goto L_0x004a
                goto L_0x0074
            L_0x004a:
                int r3 = p135j8.C5398d.f17731a     // Catch:{ all -> 0x0069 }
                java.lang.ref.WeakReference<android.app.Activity> r3 = r2.f6301d     // Catch:{ all -> 0x0069 }
                java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x0069 }
                android.app.Activity r3 = (android.app.Activity) r3     // Catch:{ all -> 0x0069 }
                android.view.View r3 = p135j8.C5398d.m13501b(r3)     // Catch:{ all -> 0x0069 }
                if (r3 != 0) goto L_0x005b
                goto L_0x0074
            L_0x005b:
                android.view.ViewTreeObserver r3 = r3.getViewTreeObserver()     // Catch:{ all -> 0x0069 }
                boolean r0 = r3.isAlive()     // Catch:{ all -> 0x0069 }
                if (r0 == 0) goto L_0x0074
                r3.addOnGlobalFocusChangeListener(r2)     // Catch:{ all -> 0x0069 }
                goto L_0x0074
            L_0x0069:
                r3 = move-exception
                p262t8.C6606a.m15600a(r2, r3)     // Catch:{ all -> 0x006e }
                goto L_0x0074
            L_0x006e:
                r3 = move-exception
                java.lang.Class<c8.d> r0 = p040c8.C1806d.class
                p262t8.C6606a.m15600a(r0, r3)
            L_0x0074:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c8.C1806d.C1807a.m5121b(android.app.Activity):void");
        }
    }

    static {
        new C1807a();
    }

    public C1806d(Activity activity) {
        this.f6301d = new WeakReference<>(activity);
        this.f6302e = new AtomicBoolean(false);
    }

    /* renamed from: a */
    public final void mo6619a(View view) {
        if (!C6606a.m15601b(this)) {
            try {
                C7219n nVar = new C7219n(4, view, this);
                if (!C6606a.m15601b(this)) {
                    if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                        nVar.run();
                    } else {
                        this.f6300c.post(nVar);
                    }
                }
            } catch (Throwable th) {
                C6606a.m15600a(this, th);
            }
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a2 A[Catch:{ all -> 0x0097, all -> 0x013d }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a4 A[Catch:{ all -> 0x0097, all -> 0x013d }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a7 A[Catch:{ all -> 0x0097, all -> 0x013d }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00d8 A[Catch:{ all -> 0x0097, all -> 0x013d }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00e3 A[SYNTHETIC, Splitter:B:61:0x00e3] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00f6 A[Catch:{ all -> 0x0097, all -> 0x013d }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00ff A[Catch:{ all -> 0x0097, all -> 0x013d }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0120 A[Catch:{ all -> 0x0097, all -> 0x013d }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0065 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6620b(android.view.View r14) {
        /*
            r13 = this;
            boolean r0 = p262t8.C6606a.m15601b(r13)
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            r0 = r14
            android.widget.EditText r0 = (android.widget.EditText) r0     // Catch:{ all -> 0x013d }
            android.text.Editable r0 = r0.getText()     // Catch:{ all -> 0x013d }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x013d }
            if (r0 == 0) goto L_0x0135
            java.lang.CharSequence r0 = kotlin.text.C24179b.m60585g0(r0)     // Catch:{ all -> 0x013d }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x013d }
            if (r0 == 0) goto L_0x012d
            java.lang.String r0 = r0.toLowerCase()     // Catch:{ all -> 0x013d }
            java.lang.String r1 = "(this as java.lang.String).toLowerCase()"
            mf0.C24362h.m61210e(r0, r1)     // Catch:{ all -> 0x013d }
            int r1 = r0.length()     // Catch:{ all -> 0x013d }
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0031
            r1 = 1
            goto L_0x0032
        L_0x0031:
            r1 = 0
        L_0x0032:
            if (r1 != 0) goto L_0x012c
            java.util.LinkedHashSet r1 = r13.f6299b     // Catch:{ all -> 0x013d }
            boolean r1 = r1.contains(r0)     // Catch:{ all -> 0x013d }
            if (r1 != 0) goto L_0x012c
            int r1 = r0.length()     // Catch:{ all -> 0x013d }
            r4 = 100
            if (r1 <= r4) goto L_0x0046
            goto L_0x012c
        L_0x0046:
            java.util.LinkedHashSet r1 = r13.f6299b     // Catch:{ all -> 0x013d }
            r1.add(r0)     // Catch:{ all -> 0x013d }
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ all -> 0x013d }
            r1.<init>()     // Catch:{ all -> 0x013d }
            java.util.ArrayList r4 = p040c8.C1803b.m5112b(r14)     // Catch:{ all -> 0x013d }
            java.util.concurrent.CopyOnWriteArraySet r5 = p040c8.C1804c.f6294d     // Catch:{ all -> 0x013d }
            java.util.HashSet r5 = new java.util.HashSet     // Catch:{ all -> 0x013d }
            java.util.concurrent.CopyOnWriteArraySet r6 = p040c8.C1804c.m5115a()     // Catch:{ all -> 0x013d }
            r5.<init>(r6)     // Catch:{ all -> 0x013d }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x013d }
            r6 = 0
            r7 = r6
        L_0x0065:
            boolean r8 = r5.hasNext()     // Catch:{ all -> 0x013d }
            if (r8 == 0) goto L_0x0129
            java.lang.Object r8 = r5.next()     // Catch:{ all -> 0x013d }
            c8.c r8 = (p040c8.C1804c) r8     // Catch:{ all -> 0x013d }
            java.lang.String r9 = r8.mo6618b()     // Catch:{ all -> 0x013d }
            java.lang.String r10 = "r2"
            boolean r9 = mf0.C24362h.m61206a(r10, r9)     // Catch:{ all -> 0x013d }
            if (r9 == 0) goto L_0x008b
            kotlin.text.Regex r9 = new kotlin.text.Regex     // Catch:{ all -> 0x013d }
            java.lang.String r10 = "[^\\d.]"
            r9.<init>((java.lang.String) r10)     // Catch:{ all -> 0x013d }
            java.lang.String r10 = ""
            java.lang.String r9 = r9.mo60284c(r0, r10)     // Catch:{ all -> 0x013d }
            goto L_0x008c
        L_0x008b:
            r9 = r0
        L_0x008c:
            boolean r10 = p262t8.C6606a.m15601b(r8)     // Catch:{ all -> 0x013d }
            if (r10 == 0) goto L_0x0094
        L_0x0092:
            r10 = r6
            goto L_0x009c
        L_0x0094:
            java.lang.String r10 = r8.f6296b     // Catch:{ all -> 0x0097 }
            goto L_0x009c
        L_0x0097:
            r10 = move-exception
            p262t8.C6606a.m15600a(r8, r10)     // Catch:{ all -> 0x013d }
            goto L_0x0092
        L_0x009c:
            int r10 = r10.length()     // Catch:{ all -> 0x013d }
            if (r10 <= 0) goto L_0x00a4
            r10 = 1
            goto L_0x00a5
        L_0x00a4:
            r10 = 0
        L_0x00a5:
            if (r10 == 0) goto L_0x00d9
            c8.b r10 = p040c8.C1803b.f6293a     // Catch:{ all -> 0x013d }
            boolean r10 = p262t8.C6606a.m15601b(r8)     // Catch:{ all -> 0x013d }
            if (r10 == 0) goto L_0x00b1
        L_0x00af:
            r10 = r6
            goto L_0x00b9
        L_0x00b1:
            java.lang.String r10 = r8.f6296b     // Catch:{ all -> 0x00b4 }
            goto L_0x00b9
        L_0x00b4:
            r10 = move-exception
            p262t8.C6606a.m15600a(r8, r10)     // Catch:{ all -> 0x013d }
            goto L_0x00af
        L_0x00b9:
            java.lang.Class<c8.b> r11 = p040c8.C1803b.class
            boolean r12 = p262t8.C6606a.m15601b(r11)     // Catch:{ all -> 0x013d }
            if (r12 == 0) goto L_0x00c2
            goto L_0x00d5
        L_0x00c2:
            java.lang.String r12 = "rule"
            mf0.C24362h.m61211f(r10, r12)     // Catch:{ all -> 0x00d1 }
            kotlin.text.Regex r12 = new kotlin.text.Regex     // Catch:{ all -> 0x00d1 }
            r12.<init>((java.lang.String) r10)     // Catch:{ all -> 0x00d1 }
            boolean r10 = r12.mo60283b(r9)     // Catch:{ all -> 0x00d1 }
            goto L_0x00d6
        L_0x00d1:
            r10 = move-exception
            p262t8.C6606a.m15600a(r11, r10)     // Catch:{ all -> 0x013d }
        L_0x00d5:
            r10 = 0
        L_0x00d6:
            if (r10 != 0) goto L_0x00d9
            goto L_0x0065
        L_0x00d9:
            c8.b r10 = p040c8.C1803b.f6293a     // Catch:{ all -> 0x013d }
            boolean r10 = p262t8.C6606a.m15601b(r8)     // Catch:{ all -> 0x013d }
            if (r10 == 0) goto L_0x00e3
        L_0x00e1:
            r10 = r6
            goto L_0x00f0
        L_0x00e3:
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x00eb }
            java.util.List<java.lang.String> r11 = r8.f6297c     // Catch:{ all -> 0x00eb }
            r10.<init>(r11)     // Catch:{ all -> 0x00eb }
            goto L_0x00f0
        L_0x00eb:
            r10 = move-exception
            p262t8.C6606a.m15600a(r8, r10)     // Catch:{ all -> 0x013d }
            goto L_0x00e1
        L_0x00f0:
            boolean r10 = p040c8.C1803b.m5113d(r4, r10)     // Catch:{ all -> 0x013d }
            if (r10 == 0) goto L_0x00ff
            java.lang.String r8 = r8.mo6618b()     // Catch:{ all -> 0x013d }
            p040c8.C1806d.C1807a.m5120a(r1, r8, r9)     // Catch:{ all -> 0x013d }
            goto L_0x0065
        L_0x00ff:
            if (r7 != 0) goto L_0x0105
            java.util.ArrayList r7 = p040c8.C1803b.m5111a(r14)     // Catch:{ all -> 0x013d }
        L_0x0105:
            boolean r10 = p262t8.C6606a.m15601b(r8)     // Catch:{ all -> 0x013d }
            if (r10 == 0) goto L_0x010d
        L_0x010b:
            r10 = r6
            goto L_0x011a
        L_0x010d:
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x0115 }
            java.util.List<java.lang.String> r11 = r8.f6297c     // Catch:{ all -> 0x0115 }
            r10.<init>(r11)     // Catch:{ all -> 0x0115 }
            goto L_0x011a
        L_0x0115:
            r10 = move-exception
            p262t8.C6606a.m15600a(r8, r10)     // Catch:{ all -> 0x013d }
            goto L_0x010b
        L_0x011a:
            boolean r10 = p040c8.C1803b.m5113d(r7, r10)     // Catch:{ all -> 0x013d }
            if (r10 == 0) goto L_0x0065
            java.lang.String r8 = r8.mo6618b()     // Catch:{ all -> 0x013d }
            p040c8.C1806d.C1807a.m5120a(r1, r8, r9)     // Catch:{ all -> 0x013d }
            goto L_0x0065
        L_0x0129:
            com.facebook.appevents.C2351p.C2352a.m6242a(r1)     // Catch:{ all -> 0x013d }
        L_0x012c:
            return
        L_0x012d:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException     // Catch:{ all -> 0x013d }
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
            r14.<init>(r0)     // Catch:{ all -> 0x013d }
            throw r14     // Catch:{ all -> 0x013d }
        L_0x0135:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException     // Catch:{ all -> 0x013d }
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.CharSequence"
            r14.<init>(r0)     // Catch:{ all -> 0x013d }
            throw r14     // Catch:{ all -> 0x013d }
        L_0x013d:
            r14 = move-exception
            p262t8.C6606a.m15600a(r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c8.C1806d.mo6620b(android.view.View):void");
    }

    public final void onGlobalFocusChanged(View view, View view2) {
        if (!C6606a.m15601b(this)) {
            if (view != null) {
                try {
                    mo6619a(view);
                } catch (Throwable th) {
                    C6606a.m15600a(this, th);
                    return;
                }
            }
            if (view2 != null) {
                mo6619a(view2);
            }
        }
    }
}
