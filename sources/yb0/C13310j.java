package yb0;

import java.util.TimerTask;

/* renamed from: yb0.j */
public final class C13310j extends TimerTask {

    /* renamed from: b */
    public final /* synthetic */ C13308i f33048b;

    public C13310j(C13308i iVar) {
        this.f33048b = iVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0272  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01b4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r0 = r17
            ch.qos.logback.classic.Logger r1 = ac0.C7557a.f23040a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            yb0.i r3 = r0.f33048b
            java.lang.String r3 = r3.f33036c
            r2.append(r3)
            java.lang.String r3 = "_VIEWABILITY: Timer EXPIRED"
            r2.append(r3)
            yb0.i r3 = r0.f33048b
            java.lang.String r3 = r3.f33047n
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.mo6666c(r2)
            yb0.i r1 = r0.f33048b
            java.lang.ref.WeakReference<android.view.ViewGroup> r2 = r1.f33038e
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L_0x002c
            goto L_0x003d
        L_0x002c:
            java.lang.Object r2 = r2.get()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r2 != 0) goto L_0x0035
            goto L_0x003d
        L_0x0035:
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x003d
            r2 = 1
            goto L_0x003e
        L_0x003d:
            r2 = 0
        L_0x003e:
            if (r2 == 0) goto L_0x007d
            java.lang.ref.WeakReference<android.view.ViewGroup> r2 = r1.f33038e
            if (r2 != 0) goto L_0x0045
            goto L_0x005d
        L_0x0045:
            java.lang.Object r2 = r2.get()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r2 != 0) goto L_0x004e
            goto L_0x005d
        L_0x004e:
            android.view.View r2 = r2.getRootView()
            if (r2 != 0) goto L_0x0055
            goto L_0x005d
        L_0x0055:
            boolean r2 = r2.hasFocus()
            if (r2 != r3) goto L_0x005d
            r2 = 1
            goto L_0x005e
        L_0x005d:
            r2 = 0
        L_0x005e:
            if (r2 == 0) goto L_0x007b
            java.lang.ref.WeakReference<android.view.ViewGroup> r2 = r1.f33038e
            if (r2 != 0) goto L_0x0065
            goto L_0x007d
        L_0x0065:
            java.lang.Object r2 = r2.get()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r2 != 0) goto L_0x006e
            goto L_0x007d
        L_0x006e:
            android.view.View r2 = r2.getRootView()
            if (r2 != 0) goto L_0x0075
            goto L_0x007d
        L_0x0075:
            boolean r2 = r2.hasWindowFocus()
            if (r2 != r3) goto L_0x007d
        L_0x007b:
            r2 = 1
            goto L_0x007e
        L_0x007d:
            r2 = 0
        L_0x007e:
            ch.qos.logback.classic.Logger r5 = ac0.C7557a.f23040a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r1.f33036c
            r6.append(r7)
            java.lang.String r7 = "_VIEWABILITY: Is AdView Active: "
            r6.append(r7)
            r6.append(r2)
            java.lang.String r7 = r1.f33047n
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.mo6666c(r6)
            android.view.View r5 = r1.f33046m
            if (r5 != 0) goto L_0x00a3
            goto L_0x00b2
        L_0x00a3:
            android.graphics.Rect r6 = new android.graphics.Rect
            int r7 = r5.getWidth()
            int r5 = r5.getHeight()
            r6.<init>(r4, r4, r7, r5)
            r1.f33042i = r6
        L_0x00b2:
            r5 = 2
            int[] r5 = new int[r5]
            java.lang.ref.WeakReference<android.view.ViewGroup> r6 = r1.f33038e
            if (r6 != 0) goto L_0x00ba
            goto L_0x00c6
        L_0x00ba:
            java.lang.Object r6 = r6.get()
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            if (r6 != 0) goto L_0x00c3
            goto L_0x00c6
        L_0x00c3:
            r6.getLocationInWindow(r5)
        L_0x00c6:
            r4 = r5[r4]
            r5 = r5[r3]
            java.lang.ref.WeakReference<android.view.ViewGroup> r6 = r1.f33038e
            if (r6 != 0) goto L_0x00cf
            goto L_0x00d7
        L_0x00cf:
            java.lang.Object r6 = r6.get()
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            if (r6 != 0) goto L_0x00d9
        L_0x00d7:
            r6 = 0
            goto L_0x00dd
        L_0x00d9:
            int r6 = r6.getWidth()
        L_0x00dd:
            java.lang.ref.WeakReference<android.view.ViewGroup> r7 = r1.f33038e
            if (r7 != 0) goto L_0x00e2
            goto L_0x00ea
        L_0x00e2:
            java.lang.Object r7 = r7.get()
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            if (r7 != 0) goto L_0x00ec
        L_0x00ea:
            r7 = 0
            goto L_0x00f0
        L_0x00ec:
            int r7 = r7.getHeight()
        L_0x00f0:
            boolean r8 = r1.f33037d
            if (r8 == 0) goto L_0x0107
            android.graphics.Rect r6 = r1.f33042i
            if (r6 != 0) goto L_0x00fa
            r7 = 0
            goto L_0x00fc
        L_0x00fa:
            int r7 = r6.right
        L_0x00fc:
            if (r6 != 0) goto L_0x0100
            r6 = 0
            goto L_0x0102
        L_0x0100:
            int r6 = r6.bottom
        L_0x0102:
            r16 = r7
            r7 = r6
            r6 = r16
        L_0x0107:
            kotlin.Pair r8 = new kotlin.Pair
            android.content.res.Resources r9 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            java.lang.String r10 = "getSystem().displayMetrics"
            mf0.C24362h.m61210e(r9, r10)
            float r6 = (float) r6
            float r9 = r9.density
            float r6 = r6 / r9
            r9 = 1056964608(0x3f000000, float:0.5)
            float r6 = r6 + r9
            int r6 = (int) r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            android.content.res.Resources r11 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            mf0.C24362h.m61210e(r11, r10)
            float r7 = (float) r7
            float r10 = r11.density
            float r7 = r7 / r10
            float r7 = r7 + r9
            int r7 = (int) r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8.<init>(r6, r7)
            java.lang.Object r6 = r8.mo59068c()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            java.lang.Object r7 = r8.mo59069d()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            android.graphics.Rect r8 = r1.f33042i
            if (r8 != 0) goto L_0x0154
            r9 = 0
            goto L_0x0156
        L_0x0154:
            int r9 = r8.right
        L_0x0156:
            if (r8 != 0) goto L_0x015a
            r10 = 0
            goto L_0x015c
        L_0x015a:
            int r10 = r8.bottom
        L_0x015c:
            if (r8 != 0) goto L_0x0160
            r11 = 0
            goto L_0x0162
        L_0x0160:
            int r11 = r8.left
        L_0x0162:
            if (r8 != 0) goto L_0x0166
            r8 = 0
            goto L_0x0168
        L_0x0166:
            int r8 = r8.top
        L_0x0168:
            ch.qos.logback.classic.Logger r12 = ac0.C7557a.f23040a
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = r1.f33036c
            r13.append(r14)
            java.lang.String r14 = "_VIEWABILITY: {{ AdContainerView, AdView (X, Y, W, H) }}: ["
            r13.append(r14)
            r13.append(r11)
            java.lang.String r14 = ", "
            r13.append(r14)
            p001a0.C0016g.m41y(r13, r8, r14, r9, r14)
            java.lang.String r15 = "], ["
            p001a0.C0016g.m41y(r13, r10, r15, r4, r14)
            p001a0.C0016g.m41y(r13, r5, r14, r6, r14)
            r13.append(r7)
            r14 = 93
            r13.append(r14)
            java.lang.String r14 = r1.f33047n
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            r12.mo6666c(r13)
            int r12 = r4 - r11
            int r13 = r5 - r8
            int r14 = r11 - r6
            if (r14 > r4) goto L_0x01d7
            int r14 = r11 + r9
            if (r14 < r4) goto L_0x01d7
            int r15 = r8 - r7
            if (r15 > r5) goto L_0x01d7
            int r15 = r8 + r10
            if (r15 < r5) goto L_0x01d7
            if (r13 < 0) goto L_0x01be
            int r15 = r15 - r5
            if (r15 >= 0) goto L_0x01ba
            r15 = 0
        L_0x01ba:
            if (r15 <= r7) goto L_0x01c5
            r15 = r7
            goto L_0x01c5
        L_0x01be:
            int r5 = r5 + r7
            int r5 = r5 - r8
            if (r5 <= r10) goto L_0x01c3
            goto L_0x01c4
        L_0x01c3:
            r10 = r5
        L_0x01c4:
            r15 = r10
        L_0x01c5:
            if (r12 < 0) goto L_0x01cf
            int r14 = r14 - r4
            if (r14 >= 0) goto L_0x01cb
            r14 = 0
        L_0x01cb:
            if (r14 <= r6) goto L_0x01d9
            r14 = r6
            goto L_0x01d9
        L_0x01cf:
            int r4 = r4 + r6
            int r4 = r4 - r11
            if (r4 <= r9) goto L_0x01d4
            goto L_0x01d5
        L_0x01d4:
            r9 = r4
        L_0x01d5:
            r14 = r9
            goto L_0x01d9
        L_0x01d7:
            r14 = 0
            r15 = 0
        L_0x01d9:
            int r4 = r14 * r15
            float r4 = (float) r4
            int r6 = r6 * r7
            float r5 = (float) r6
            float r4 = r4 / r5
            r5 = 100
            float r5 = (float) r5
            float r4 = r4 * r5
            int r4 = (int) r4
            ch.qos.logback.classic.Logger r5 = ac0.C7557a.f23040a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r1.f33036c
            r6.append(r7)
            java.lang.String r7 = "_VIEWABILITY: Viewable Percentage: "
            r6.append(r7)
            r6.append(r4)
            java.lang.String r7 = " (ViewableW: "
            r6.append(r7)
            r6.append(r14)
            java.lang.String r7 = ", ViewableH: "
            r6.append(r7)
            r6.append(r15)
            r7 = 41
            r6.append(r7)
            java.lang.String r7 = r1.f33047n
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.mo6666c(r6)
            java.lang.String r5 = "..."
            java.lang.String r6 = " milliseconds]"
            if (r2 == 0) goto L_0x0272
            int r2 = r1.f33040g
            if (r4 < r2) goto L_0x0272
            long r7 = r1.f33045l
            long r9 = r1.f33044k
            long r7 = r7 + r9
            r1.f33045l = r7
            ch.qos.logback.classic.Logger r2 = ac0.C7557a.f23040a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = r1.f33036c
            r4.append(r7)
            java.lang.String r7 = "_VIEWABILITY: Ad continuously viewed for ["
            r4.append(r7)
            long r7 = r1.f33045l
            r4.append(r7)
            r4.append(r6)
            java.lang.String r6 = r1.f33047n
            r4.append(r6)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r2.mo6666c(r4)
            long r4 = r1.f33045l
            long r6 = r1.f33041h
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x029e
            r1.mo40216a(r3)
            yb0.i$a r2 = r1.f33039f
            if (r2 != 0) goto L_0x0264
            goto L_0x029e
        L_0x0264:
            java.lang.String r1 = r1.f33034a
            yb0.d r2 = (yb0.C13295d) r2
            java.lang.String r3 = "spotId"
            mf0.C24362h.m61211f(r1, r3)
            r3 = 0
            r2.mo40191o0(r1, r3)
            goto L_0x029e
        L_0x0272:
            ch.qos.logback.classic.Logger r2 = ac0.C7557a.f23040a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r1.f33036c
            r3.append(r4)
            java.lang.String r4 = "_VIEWABILITY: Resetting Ad Visibility State after being continuously viewed for ["
            r3.append(r4)
            long r7 = r1.f33045l
            r3.append(r7)
            r3.append(r6)
            java.lang.String r4 = r1.f33047n
            r3.append(r4)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r2.mo6666c(r3)
            r2 = 0
            r1.f33045l = r2
        L_0x029e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yb0.C13310j.run():void");
    }
}
