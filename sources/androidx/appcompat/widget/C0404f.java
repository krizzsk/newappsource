package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import androidx.core.widget.C0786c;
import p141k1.C5450a;

/* renamed from: androidx.appcompat.widget.f */
public final class C0404f {

    /* renamed from: a */
    public final CompoundButton f1493a;

    /* renamed from: b */
    public ColorStateList f1494b = null;

    /* renamed from: c */
    public PorterDuff.Mode f1495c = null;

    /* renamed from: d */
    public boolean f1496d = false;

    /* renamed from: e */
    public boolean f1497e = false;

    /* renamed from: f */
    public boolean f1498f;

    public C0404f(CompoundButton compoundButton) {
        this.f1493a = compoundButton;
    }

    /* renamed from: a */
    public final void mo2075a() {
        Drawable a = C0786c.m2389a(this.f1493a);
        if (a == null) {
            return;
        }
        if (this.f1496d || this.f1497e) {
            Drawable mutate = C5450a.m13604g(a).mutate();
            if (this.f1496d) {
                C5450a.C5452b.m13617h(mutate, this.f1494b);
            }
            if (this.f1497e) {
                C5450a.C5452b.m13618i(mutate, this.f1495c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f1493a.getDrawableState());
            }
            this.f1493a.setButtonDrawable(mutate);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c A[SYNTHETIC, Splitter:B:12:0x003c] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005f A[Catch:{ all -> 0x0083 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0070 A[Catch:{ all -> 0x0083 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2076b(android.util.AttributeSet r9, int r10) {
        /*
            r8 = this;
            android.widget.CompoundButton r0 = r8.f1493a
            android.content.Context r0 = r0.getContext()
            int[] r3 = p114i.C5224j.CompoundButton
            androidx.appcompat.widget.h1 r0 = androidx.appcompat.widget.C0413h1.m1063m(r0, r9, r3, r10)
            android.widget.CompoundButton r1 = r8.f1493a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.f1515b
            r7 = 0
            r4 = r9
            r6 = r10
            p242s1.C6333d0.m15028p(r1, r2, r3, r4, r5, r6, r7)
            int r9 = p114i.C5224j.CompoundButton_buttonCompat     // Catch:{ all -> 0x0083 }
            boolean r10 = r0.mo2098l(r9)     // Catch:{ all -> 0x0083 }
            r1 = 0
            if (r10 == 0) goto L_0x0039
            int r9 = r0.mo2095i(r9, r1)     // Catch:{ all -> 0x0083 }
            if (r9 == 0) goto L_0x0039
            android.widget.CompoundButton r10 = r8.f1493a     // Catch:{ NotFoundException -> 0x0038 }
            android.content.Context r2 = r10.getContext()     // Catch:{ NotFoundException -> 0x0038 }
            android.graphics.drawable.Drawable r9 = p127j.C5344a.m13397a(r2, r9)     // Catch:{ NotFoundException -> 0x0038 }
            r10.setButtonDrawable(r9)     // Catch:{ NotFoundException -> 0x0038 }
            r9 = 1
            goto L_0x003a
        L_0x0038:
        L_0x0039:
            r9 = 0
        L_0x003a:
            if (r9 != 0) goto L_0x0057
            int r9 = p114i.C5224j.CompoundButton_android_button     // Catch:{ all -> 0x0083 }
            boolean r10 = r0.mo2098l(r9)     // Catch:{ all -> 0x0083 }
            if (r10 == 0) goto L_0x0057
            int r9 = r0.mo2095i(r9, r1)     // Catch:{ all -> 0x0083 }
            if (r9 == 0) goto L_0x0057
            android.widget.CompoundButton r10 = r8.f1493a     // Catch:{ all -> 0x0083 }
            android.content.Context r1 = r10.getContext()     // Catch:{ all -> 0x0083 }
            android.graphics.drawable.Drawable r9 = p127j.C5344a.m13397a(r1, r9)     // Catch:{ all -> 0x0083 }
            r10.setButtonDrawable(r9)     // Catch:{ all -> 0x0083 }
        L_0x0057:
            int r9 = p114i.C5224j.CompoundButton_buttonTint     // Catch:{ all -> 0x0083 }
            boolean r10 = r0.mo2098l(r9)     // Catch:{ all -> 0x0083 }
            if (r10 == 0) goto L_0x0068
            android.widget.CompoundButton r10 = r8.f1493a     // Catch:{ all -> 0x0083 }
            android.content.res.ColorStateList r9 = r0.mo2088b(r9)     // Catch:{ all -> 0x0083 }
            androidx.core.widget.C0786c.C0787a.m2392c(r10, r9)     // Catch:{ all -> 0x0083 }
        L_0x0068:
            int r9 = p114i.C5224j.CompoundButton_buttonTintMode     // Catch:{ all -> 0x0083 }
            boolean r10 = r0.mo2098l(r9)     // Catch:{ all -> 0x0083 }
            if (r10 == 0) goto L_0x007f
            android.widget.CompoundButton r10 = r8.f1493a     // Catch:{ all -> 0x0083 }
            r1 = -1
            int r9 = r0.mo2094h(r9, r1)     // Catch:{ all -> 0x0083 }
            r1 = 0
            android.graphics.PorterDuff$Mode r9 = androidx.appcompat.widget.C0418j0.m1109c(r9, r1)     // Catch:{ all -> 0x0083 }
            androidx.core.widget.C0786c.C0787a.m2393d(r10, r9)     // Catch:{ all -> 0x0083 }
        L_0x007f:
            r0.mo2099n()
            return
        L_0x0083:
            r9 = move-exception
            r0.mo2099n()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0404f.mo2076b(android.util.AttributeSet, int):void");
    }
}
