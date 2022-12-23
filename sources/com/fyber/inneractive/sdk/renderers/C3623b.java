package com.fyber.inneractive.sdk.renderers;

import android.graphics.Rect;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.response.C3648e;
import com.fyber.inneractive.sdk.util.C3702j;
import com.fyber.inneractive.sdk.util.C3714n;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.fyber.inneractive.sdk.renderers.b */
public class C3623b {

    /* renamed from: a */
    public C3702j<Rect> f12645a;

    /* renamed from: b */
    public final C3648e f12646b;

    /* renamed from: c */
    public final FrameLayout f12647c;

    /* renamed from: d */
    public float f12648d = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: e */
    public int f12649e = 1;

    /* renamed from: f */
    public float f12650f = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: g */
    public long f12651g = 0;

    /* renamed from: h */
    public boolean f12652h = false;

    /* renamed from: i */
    public boolean f12653i = false;

    /* renamed from: j */
    public final C3626c f12654j;

    /* renamed from: k */
    public final Runnable f12655k = new C3624a();

    /* renamed from: com.fyber.inneractive.sdk.renderers.b$a */
    public class C3624a implements Runnable {
        public C3624a() {
        }

        public void run() {
            C3623b.this.mo15261a();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.renderers.b$b */
    public class C3625b implements C3702j.C3703a<Rect> {
        public C3625b(C3623b bVar) {
        }

        /* renamed from: a */
        public Object mo15265a() {
            return new Rect();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.renderers.b$c */
    public interface C3626c {
    }

    public C3623b(C3648e eVar, FrameLayout frameLayout, C3626c cVar) {
        this.f12646b = eVar;
        this.f12647c = frameLayout;
        this.f12654j = cVar;
        this.f12645a = new C3702j<>(4, new C3625b(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00de  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo15261a() {
        /*
            r10 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "IAVisibilityTracker: onCheckVisibility"
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r2, r1)
            int r1 = r10.f12649e
            float r1 = (float) r1
            r2 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r2
            com.fyber.inneractive.sdk.util.j<android.graphics.Rect> r2 = r10.f12645a
            java.lang.Object r2 = r2.mo15362a()
            android.graphics.Rect r2 = (android.graphics.Rect) r2
            android.widget.FrameLayout r3 = r10.f12647c
            android.view.ViewParent r4 = r3.getParent()
            if (r4 == 0) goto L_0x0048
            boolean r4 = r3.isShown()
            if (r4 == 0) goto L_0x0048
            boolean r4 = r3.hasWindowFocus()
            if (r4 == 0) goto L_0x0048
            boolean r4 = r3.getGlobalVisibleRect(r2)
            if (r4 == 0) goto L_0x0048
            int r4 = r2.height()
            int r5 = r2.width()
            int r5 = r5 * r4
            float r4 = (float) r5
            int r5 = r3.getHeight()
            int r3 = r3.getWidth()
            int r3 = r3 * r5
            float r3 = (float) r3
            float r4 = r4 / r3
            goto L_0x0049
        L_0x0048:
            r4 = 0
        L_0x0049:
            com.fyber.inneractive.sdk.util.j<android.graphics.Rect> r3 = r10.f12645a
            java.util.Queue<T> r3 = r3.f12882a
            r3.offer(r2)
            r10.f12648d = r4
            r2 = 0
            r5 = 1
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 < 0) goto L_0x0071
            float r4 = r10.f12650f
            r6 = 1148846080(0x447a0000, float:1000.0)
            float r4 = r4 * r6
            long r6 = java.lang.System.currentTimeMillis()
            long r8 = r10.f12651g
            long r6 = r6 - r8
            float r6 = (float) r6
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L_0x0071
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0071
            r4 = 1
            goto L_0x0072
        L_0x0071:
            r4 = 0
        L_0x0072:
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
            r6[r0] = r7
            java.lang.Float r7 = java.lang.Float.valueOf(r1)
            r6[r5] = r7
            java.lang.String r7 = "BannerVisibilityTracker | visible = %s, minVis = %f"
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r7, r6)
            if (r4 == 0) goto L_0x00de
            boolean r4 = r10.f12652h
            if (r4 == 0) goto L_0x00de
            com.fyber.inneractive.sdk.renderers.b$c r1 = r10.f12654j
            if (r1 == 0) goto L_0x0109
            boolean r1 = r10.f12653i
            if (r1 != 0) goto L_0x0109
            r10.f12653i = r5
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "BannerVisibilityTracker | firing viewable"
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r2, r1)
            com.fyber.inneractive.sdk.renderers.b$c r1 = r10.f12654j
            com.fyber.inneractive.sdk.renderers.d r1 = (com.fyber.inneractive.sdk.renderers.C3628d) r1
            com.fyber.inneractive.sdk.renderers.g r1 = r1.f12658a
            r1.getClass()
            AdContent r2 = r1.f9598b     // Catch:{ Exception -> 0x0109 }
            if (r2 == 0) goto L_0x0109
            r3 = r2
            com.fyber.inneractive.sdk.flow.u r3 = (com.fyber.inneractive.sdk.flow.C2794u) r3     // Catch:{ Exception -> 0x0109 }
            T r3 = r3.f9591b     // Catch:{ Exception -> 0x0109 }
            if (r3 == 0) goto L_0x0109
            com.fyber.inneractive.sdk.flow.u r2 = (com.fyber.inneractive.sdk.flow.C2794u) r2     // Catch:{ Exception -> 0x0109 }
            T r2 = r2.f9591b     // Catch:{ Exception -> 0x0109 }
            com.fyber.inneractive.sdk.response.f r2 = (com.fyber.inneractive.sdk.response.C3649f) r2     // Catch:{ Exception -> 0x0109 }
            java.lang.String r2 = r2.f12764v     // Catch:{ Exception -> 0x0109 }
            if (r2 == 0) goto L_0x0109
            java.lang.String r3 = r2.trim()     // Catch:{ Exception -> 0x0109 }
            int r3 = r3.length()     // Catch:{ Exception -> 0x0109 }
            if (r3 <= 0) goto L_0x0109
            java.lang.String r3 = "%sfiring banner mrc visibility impression!"
            java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0109 }
            java.lang.String r6 = com.fyber.inneractive.sdk.util.IAlog.m9899a((java.lang.Object) r1)     // Catch:{ Exception -> 0x0109 }
            r4[r0] = r6     // Catch:{ Exception -> 0x0109 }
            com.fyber.inneractive.sdk.util.IAlog.m9905d(r3, r4)     // Catch:{ Exception -> 0x0109 }
            r3 = 0
            java.lang.String r4 = "MRC_VISIBILITY_IMPRESSION"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0109 }
            com.fyber.inneractive.sdk.util.IAlog.m9900a(r5, r3, r4, r0)     // Catch:{ Exception -> 0x0109 }
            r1.mo13554b((java.lang.String) r2)     // Catch:{ Exception -> 0x0109 }
            goto L_0x0109
        L_0x00de:
            boolean r0 = r10.f12652h
            if (r0 == 0) goto L_0x0109
            float r0 = r10.f12648d
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 >= 0) goto L_0x00eb
            r10.f12651g = r2
            goto L_0x00fb
        L_0x00eb:
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00fb
            long r0 = r10.f12651g
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x00fb
            long r0 = java.lang.System.currentTimeMillis()
            r10.f12651g = r0
        L_0x00fb:
            android.os.Handler r0 = com.fyber.inneractive.sdk.util.C3714n.f12902b
            java.lang.Runnable r1 = r10.f12655k
            r0.removeCallbacks(r1)
            java.lang.Runnable r1 = r10.f12655k
            r2 = 50
            r0.postDelayed(r1, r2)
        L_0x0109:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.renderers.C3623b.mo15261a():void");
    }

    /* renamed from: b */
    public void mo15262b() {
        if (!this.f12653i && !this.f12652h && this.f12651g != 0) {
            this.f12651g = 0;
            this.f12652h = true;
            mo15261a();
        }
    }

    /* renamed from: c */
    public void mo15263c() {
        this.f12652h = false;
        C3714n.f12902b.removeCallbacks(this.f12655k);
    }
}
