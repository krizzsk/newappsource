package androidx.appcompat.app;

import p242s1.C6391t;

/* renamed from: androidx.appcompat.app.k */
public final class C0253k implements C6391t {

    /* renamed from: b */
    public final /* synthetic */ AppCompatDelegateImpl f740b;

    public C0253k(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.f740b = appCompatDelegateImpl;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d4, code lost:
        r9 = (android.view.ViewGroup.MarginLayoutParams) r9.getLayoutParams();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p242s1.C6396v0 onApplyWindowInsets(android.view.View r16, p242s1.C6396v0 r17) {
        /*
            r15 = this;
            int r0 = r17.mo22506e()
            r1 = r15
            androidx.appcompat.app.AppCompatDelegateImpl r2 = r1.f740b
            r2.getClass()
            int r3 = r17.mo22506e()
            androidx.appcompat.widget.ActionBarContextView r4 = r2.f662q
            r5 = 8
            r6 = 0
            if (r4 == 0) goto L_0x013e
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            boolean r4 = r4 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r4 == 0) goto L_0x013e
            androidx.appcompat.widget.ActionBarContextView r4 = r2.f662q
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            androidx.appcompat.widget.ActionBarContextView r7 = r2.f662q
            boolean r7 = r7.isShown()
            r8 = 1
            if (r7 == 0) goto L_0x012c
            android.graphics.Rect r7 = r2.f655l0
            if (r7 != 0) goto L_0x0040
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            r2.f655l0 = r7
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            r2.f657m0 = r7
        L_0x0040:
            android.graphics.Rect r7 = r2.f655l0
            android.graphics.Rect r9 = r2.f657m0
            int r10 = r17.mo22504c()
            int r11 = r17.mo22506e()
            int r12 = r17.mo22505d()
            int r13 = r17.mo22503b()
            r7.set(r10, r11, r12, r13)
            android.view.ViewGroup r10 = r2.f668w
            java.lang.reflect.Method r11 = androidx.appcompat.widget.C0453r1.f1613a
            if (r11 == 0) goto L_0x0069
            r12 = 2
            java.lang.Object[] r12 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x0068 }
            r12[r6] = r7     // Catch:{ Exception -> 0x0068 }
            r12[r8] = r9     // Catch:{ Exception -> 0x0068 }
            r11.invoke(r10, r12)     // Catch:{ Exception -> 0x0068 }
            goto L_0x0069
        L_0x0068:
        L_0x0069:
            int r9 = r7.top
            int r10 = r7.left
            int r7 = r7.right
            android.view.ViewGroup r11 = r2.f668w
            java.util.WeakHashMap<android.view.View, s1.p0> r12 = p242s1.C6333d0.f19990a
            int r12 = android.os.Build.VERSION.SDK_INT
            r13 = 23
            if (r12 < r13) goto L_0x007e
            s1.v0 r11 = p242s1.C6333d0.C6344j.m15110a(r11)
            goto L_0x0082
        L_0x007e:
            s1.v0 r11 = p242s1.C6333d0.C6342i.m15093j(r11)
        L_0x0082:
            if (r11 != 0) goto L_0x0086
            r12 = 0
            goto L_0x008a
        L_0x0086:
            int r12 = r11.mo22504c()
        L_0x008a:
            if (r11 != 0) goto L_0x008e
            r11 = 0
            goto L_0x0092
        L_0x008e:
            int r11 = r11.mo22505d()
        L_0x0092:
            int r13 = r4.topMargin
            if (r13 != r9) goto L_0x00a1
            int r13 = r4.leftMargin
            if (r13 != r10) goto L_0x00a1
            int r13 = r4.rightMargin
            if (r13 == r7) goto L_0x009f
            goto L_0x00a1
        L_0x009f:
            r7 = 0
            goto L_0x00a8
        L_0x00a1:
            r4.topMargin = r9
            r4.leftMargin = r10
            r4.rightMargin = r7
            r7 = 1
        L_0x00a8:
            if (r9 <= 0) goto L_0x00d0
            android.view.View r9 = r2.f670y
            if (r9 != 0) goto L_0x00d0
            android.view.View r9 = new android.view.View
            android.content.Context r10 = r2.f648f
            r9.<init>(r10)
            r2.f670y = r9
            r9.setVisibility(r5)
            android.widget.FrameLayout$LayoutParams r9 = new android.widget.FrameLayout$LayoutParams
            int r10 = r4.topMargin
            r13 = 51
            r14 = -1
            r9.<init>(r14, r10, r13)
            r9.leftMargin = r12
            r9.rightMargin = r11
            android.view.ViewGroup r10 = r2.f668w
            android.view.View r11 = r2.f670y
            r10.addView(r11, r14, r9)
            goto L_0x00f3
        L_0x00d0:
            android.view.View r9 = r2.f670y
            if (r9 == 0) goto L_0x00f3
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r9 = (android.view.ViewGroup.MarginLayoutParams) r9
            int r10 = r9.height
            int r13 = r4.topMargin
            if (r10 != r13) goto L_0x00e8
            int r10 = r9.leftMargin
            if (r10 != r12) goto L_0x00e8
            int r10 = r9.rightMargin
            if (r10 == r11) goto L_0x00f3
        L_0x00e8:
            r9.height = r13
            r9.leftMargin = r12
            r9.rightMargin = r11
            android.view.View r10 = r2.f670y
            r10.setLayoutParams(r9)
        L_0x00f3:
            android.view.View r9 = r2.f670y
            if (r9 == 0) goto L_0x00f9
            r10 = 1
            goto L_0x00fa
        L_0x00f9:
            r10 = 0
        L_0x00fa:
            if (r10 == 0) goto L_0x0124
            int r9 = r9.getVisibility()
            if (r9 == 0) goto L_0x0124
            android.view.View r9 = r2.f670y
            int r11 = p242s1.C6333d0.C6337d.m15047g(r9)
            r11 = r11 & 8192(0x2000, float:1.14794E-41)
            if (r11 == 0) goto L_0x010d
            goto L_0x010e
        L_0x010d:
            r8 = 0
        L_0x010e:
            if (r8 == 0) goto L_0x0119
            android.content.Context r8 = r2.f648f
            int r11 = p114i.C5217c.abc_decor_view_status_guard_light
            int r8 = p090g1.C4732a.getColor(r8, r11)
            goto L_0x0121
        L_0x0119:
            android.content.Context r8 = r2.f648f
            int r11 = p114i.C5217c.abc_decor_view_status_guard
            int r8 = p090g1.C4732a.getColor(r8, r11)
        L_0x0121:
            r9.setBackgroundColor(r8)
        L_0x0124:
            boolean r8 = r2.f626D
            if (r8 != 0) goto L_0x0136
            if (r10 == 0) goto L_0x0136
            r3 = 0
            goto L_0x0136
        L_0x012c:
            int r7 = r4.topMargin
            if (r7 == 0) goto L_0x0133
            r4.topMargin = r6
            goto L_0x0134
        L_0x0133:
            r8 = 0
        L_0x0134:
            r7 = r8
            r10 = 0
        L_0x0136:
            if (r7 == 0) goto L_0x013f
            androidx.appcompat.widget.ActionBarContextView r7 = r2.f662q
            r7.setLayoutParams(r4)
            goto L_0x013f
        L_0x013e:
            r10 = 0
        L_0x013f:
            android.view.View r2 = r2.f670y
            if (r2 == 0) goto L_0x0149
            if (r10 == 0) goto L_0x0146
            r5 = 0
        L_0x0146:
            r2.setVisibility(r5)
        L_0x0149:
            if (r0 == r3) goto L_0x0160
            int r0 = r17.mo22504c()
            int r2 = r17.mo22505d()
            int r4 = r17.mo22503b()
            r5 = r17
            s1.v0 r0 = r5.mo22508g(r0, r3, r2, r4)
            r2 = r16
            goto L_0x0165
        L_0x0160:
            r5 = r17
            r2 = r16
            r0 = r5
        L_0x0165:
            s1.v0 r0 = p242s1.C6333d0.m15024l(r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0253k.onApplyWindowInsets(android.view.View, s1.v0):s1.v0");
    }
}
