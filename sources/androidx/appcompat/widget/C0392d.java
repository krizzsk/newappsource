package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6382p0;

/* renamed from: androidx.appcompat.widget.d */
public final class C0392d {

    /* renamed from: a */
    public final View f1467a;

    /* renamed from: b */
    public final C0407g f1468b;

    /* renamed from: c */
    public int f1469c = -1;

    /* renamed from: d */
    public C0406f1 f1470d;

    /* renamed from: e */
    public C0406f1 f1471e;

    /* renamed from: f */
    public C0406f1 f1472f;

    public C0392d(View view) {
        this.f1467a = view;
        this.f1468b = C0407g.m1025a();
    }

    /* renamed from: a */
    public final void mo2054a() {
        boolean z;
        Drawable background = this.f1467a.getBackground();
        if (background != null) {
            int i = Build.VERSION.SDK_INT;
            boolean z2 = true;
            if (i <= 21 ? i != 21 : this.f1470d == null) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                if (this.f1472f == null) {
                    this.f1472f = new C0406f1();
                }
                C0406f1 f1Var = this.f1472f;
                f1Var.f1499a = null;
                f1Var.f1502d = false;
                f1Var.f1500b = null;
                f1Var.f1501c = false;
                View view = this.f1467a;
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                ColorStateList g = C6333d0.C6342i.m15090g(view);
                if (g != null) {
                    f1Var.f1502d = true;
                    f1Var.f1499a = g;
                }
                PorterDuff.Mode h = C6333d0.C6342i.m15091h(this.f1467a);
                if (h != null) {
                    f1Var.f1501c = true;
                    f1Var.f1500b = h;
                }
                if (f1Var.f1502d || f1Var.f1501c) {
                    C0407g.m1028e(background, f1Var, this.f1467a.getDrawableState());
                } else {
                    z2 = false;
                }
                if (z2) {
                    return;
                }
            }
            C0406f1 f1Var2 = this.f1471e;
            if (f1Var2 != null) {
                C0407g.m1028e(background, f1Var2, this.f1467a.getDrawableState());
                return;
            }
            C0406f1 f1Var3 = this.f1470d;
            if (f1Var3 != null) {
                C0407g.m1028e(background, f1Var3, this.f1467a.getDrawableState());
            }
        }
    }

    /* renamed from: b */
    public final ColorStateList mo2055b() {
        C0406f1 f1Var = this.f1471e;
        if (f1Var != null) {
            return f1Var.f1499a;
        }
        return null;
    }

    /* renamed from: c */
    public final PorterDuff.Mode mo2056c() {
        C0406f1 f1Var = this.f1471e;
        if (f1Var != null) {
            return f1Var.f1500b;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009d, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009e, code lost:
        r0.mo2099n();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a1, code lost:
        throw r9;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008f A[Catch:{ all -> 0x009d }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2057d(android.util.AttributeSet r9, int r10) {
        /*
            r8 = this;
            android.view.View r0 = r8.f1467a
            android.content.Context r0 = r0.getContext()
            int[] r3 = p114i.C5224j.ViewBackgroundHelper
            androidx.appcompat.widget.h1 r0 = androidx.appcompat.widget.C0413h1.m1063m(r0, r9, r3, r10)
            android.view.View r1 = r8.f1467a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.f1515b
            r7 = 0
            r4 = r9
            r6 = r10
            p242s1.C6333d0.m15028p(r1, r2, r3, r4, r5, r6, r7)
            int r9 = p114i.C5224j.ViewBackgroundHelper_android_background     // Catch:{ all -> 0x009d }
            boolean r10 = r0.mo2098l(r9)     // Catch:{ all -> 0x009d }
            r1 = -1
            if (r10 == 0) goto L_0x0044
            int r9 = r0.mo2095i(r9, r1)     // Catch:{ all -> 0x009d }
            r8.f1469c = r9     // Catch:{ all -> 0x009d }
            androidx.appcompat.widget.g r9 = r8.f1468b     // Catch:{ all -> 0x009d }
            android.view.View r10 = r8.f1467a     // Catch:{ all -> 0x009d }
            android.content.Context r10 = r10.getContext()     // Catch:{ all -> 0x009d }
            int r2 = r8.f1469c     // Catch:{ all -> 0x009d }
            monitor-enter(r9)     // Catch:{ all -> 0x009d }
            androidx.appcompat.widget.x0 r3 = r9.f1505a     // Catch:{ all -> 0x0041 }
            android.content.res.ColorStateList r10 = r3.mo2209i(r2, r10)     // Catch:{ all -> 0x0041 }
            monitor-exit(r9)     // Catch:{ all -> 0x009d }
            if (r10 == 0) goto L_0x0044
            r8.mo2060g(r10)     // Catch:{ all -> 0x009d }
            goto L_0x0044
        L_0x0041:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x009d }
            throw r10     // Catch:{ all -> 0x009d }
        L_0x0044:
            int r9 = p114i.C5224j.ViewBackgroundHelper_backgroundTint     // Catch:{ all -> 0x009d }
            boolean r10 = r0.mo2098l(r9)     // Catch:{ all -> 0x009d }
            if (r10 == 0) goto L_0x0055
            android.view.View r10 = r8.f1467a     // Catch:{ all -> 0x009d }
            android.content.res.ColorStateList r9 = r0.mo2088b(r9)     // Catch:{ all -> 0x009d }
            p242s1.C6333d0.m15032t(r10, r9)     // Catch:{ all -> 0x009d }
        L_0x0055:
            int r9 = p114i.C5224j.ViewBackgroundHelper_backgroundTintMode     // Catch:{ all -> 0x009d }
            boolean r10 = r0.mo2098l(r9)     // Catch:{ all -> 0x009d }
            if (r10 == 0) goto L_0x0099
            android.view.View r10 = r8.f1467a     // Catch:{ all -> 0x009d }
            int r9 = r0.mo2094h(r9, r1)     // Catch:{ all -> 0x009d }
            r1 = 0
            android.graphics.PorterDuff$Mode r9 = androidx.appcompat.widget.C0418j0.m1109c(r9, r1)     // Catch:{ all -> 0x009d }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x009d }
            p242s1.C6333d0.C6342i.m15101r(r10, r9)     // Catch:{ all -> 0x009d }
            r9 = 21
            if (r1 != r9) goto L_0x0099
            android.graphics.drawable.Drawable r9 = r10.getBackground()     // Catch:{ all -> 0x009d }
            android.content.res.ColorStateList r1 = p242s1.C6333d0.C6342i.m15090g(r10)     // Catch:{ all -> 0x009d }
            if (r1 != 0) goto L_0x0084
            android.graphics.PorterDuff$Mode r1 = p242s1.C6333d0.C6342i.m15091h(r10)     // Catch:{ all -> 0x009d }
            if (r1 == 0) goto L_0x0082
            goto L_0x0084
        L_0x0082:
            r1 = 0
            goto L_0x0085
        L_0x0084:
            r1 = 1
        L_0x0085:
            if (r9 == 0) goto L_0x0099
            if (r1 == 0) goto L_0x0099
            boolean r1 = r9.isStateful()     // Catch:{ all -> 0x009d }
            if (r1 == 0) goto L_0x0096
            int[] r1 = r10.getDrawableState()     // Catch:{ all -> 0x009d }
            r9.setState(r1)     // Catch:{ all -> 0x009d }
        L_0x0096:
            p242s1.C6333d0.C6337d.m15057q(r10, r9)     // Catch:{ all -> 0x009d }
        L_0x0099:
            r0.mo2099n()
            return
        L_0x009d:
            r9 = move-exception
            r0.mo2099n()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0392d.mo2057d(android.util.AttributeSet, int):void");
    }

    /* renamed from: e */
    public final void mo2058e() {
        this.f1469c = -1;
        mo2060g((ColorStateList) null);
        mo2054a();
    }

    /* renamed from: f */
    public final void mo2059f(int i) {
        ColorStateList colorStateList;
        this.f1469c = i;
        C0407g gVar = this.f1468b;
        if (gVar != null) {
            Context context = this.f1467a.getContext();
            synchronized (gVar) {
                colorStateList = gVar.f1505a.mo2209i(i, context);
            }
        } else {
            colorStateList = null;
        }
        mo2060g(colorStateList);
        mo2054a();
    }

    /* renamed from: g */
    public final void mo2060g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1470d == null) {
                this.f1470d = new C0406f1();
            }
            C0406f1 f1Var = this.f1470d;
            f1Var.f1499a = colorStateList;
            f1Var.f1502d = true;
        } else {
            this.f1470d = null;
        }
        mo2054a();
    }

    /* renamed from: h */
    public final void mo2061h(ColorStateList colorStateList) {
        if (this.f1471e == null) {
            this.f1471e = new C0406f1();
        }
        C0406f1 f1Var = this.f1471e;
        f1Var.f1499a = colorStateList;
        f1Var.f1502d = true;
        mo2054a();
    }

    /* renamed from: i */
    public final void mo2062i(PorterDuff.Mode mode) {
        if (this.f1471e == null) {
            this.f1471e = new C0406f1();
        }
        C0406f1 f1Var = this.f1471e;
        f1Var.f1500b = mode;
        f1Var.f1501c = true;
        mo2054a();
    }
}
