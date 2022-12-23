package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import p355ac.C13401b;
import p718pc.C18893c;

public final class LinearProgressIndicatorSpec extends C18893c {

    /* renamed from: g */
    public int f35228g;

    /* renamed from: h */
    public int f35229h;

    /* renamed from: i */
    public boolean f35230i;

    public LinearProgressIndicatorSpec(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C13401b.linearProgressIndicatorStyle);
    }

    /* renamed from: a */
    public final void mo42099a() {
        if (this.f35228g != 0) {
            return;
        }
        if (this.f48083b > 0) {
            throw new IllegalArgumentException("Rounded corners are not supported in contiguous indeterminate animation.");
        } else if (this.f48084c.length < 3) {
            throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LinearProgressIndicatorSpec(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = com.google.android.material.progressindicator.LinearProgressIndicator.f35227o
            r6.<init>(r7, r8, r9, r4)
            int[] r2 = p355ac.C13411l.LinearProgressIndicator
            int r3 = p355ac.C13401b.linearProgressIndicatorStyle
            r9 = 0
            int[] r5 = new int[r9]
            r0 = r7
            r1 = r8
            android.content.res.TypedArray r7 = com.google.android.material.internal.C14077m.m35060d(r0, r1, r2, r3, r4, r5)
            int r8 = p355ac.C13411l.LinearProgressIndicator_indeterminateAnimationType
            r0 = 1
            int r8 = r7.getInt(r8, r0)
            r6.f35228g = r8
            int r8 = p355ac.C13411l.LinearProgressIndicator_indicatorDirectionLinear
            int r8 = r7.getInt(r8, r9)
            r6.f35229h = r8
            r7.recycle()
            r6.mo42099a()
            int r7 = r6.f35229h
            if (r7 != r0) goto L_0x002e
            r9 = 1
        L_0x002e:
            r6.f35230i = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.progressindicator.LinearProgressIndicatorSpec.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
