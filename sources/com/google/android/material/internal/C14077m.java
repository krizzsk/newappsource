package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.C0413h1;
import p355ac.C13401b;
import p355ac.C13411l;
import p358af.C13437d;

/* renamed from: com.google.android.material.internal.m */
public final class C14077m {

    /* renamed from: a */
    public static final int[] f35105a = {C13401b.colorPrimary};

    /* renamed from: b */
    public static final int[] f35106b = {C13401b.colorPrimaryVariant};

    /* renamed from: a */
    public static void m35057a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C13411l.ThemeEnforcement, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(C13411l.ThemeEnforcement_enforceMaterialTheme, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(C13401b.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m35059c(context, f35106b, "Theme.MaterialComponents");
            }
        }
        m35059c(context, f35105a, "Theme.AppCompat");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001d, code lost:
        if (r0.getResourceId(p355ac.C13411l.ThemeEnforcement_android_textAppearance, -1) != -1) goto L_0x003a;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m35058b(android.content.Context r4, android.util.AttributeSet r5, int[] r6, int r7, int r8, int... r9) {
        /*
            int[] r0 = p355ac.C13411l.ThemeEnforcement
            android.content.res.TypedArray r0 = r4.obtainStyledAttributes(r5, r0, r7, r8)
            int r1 = p355ac.C13411l.ThemeEnforcement_enforceTextAppearance
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 != 0) goto L_0x0013
            r0.recycle()
            return
        L_0x0013:
            r1 = -1
            int r3 = r9.length
            if (r3 != 0) goto L_0x0020
            int r4 = p355ac.C13411l.ThemeEnforcement_android_textAppearance
            int r4 = r0.getResourceId(r4, r1)
            if (r4 == r1) goto L_0x003b
            goto L_0x003a
        L_0x0020:
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r6, r7, r8)
            int r5 = r9.length
            r6 = 0
        L_0x0026:
            if (r6 >= r5) goto L_0x0037
            r7 = r9[r6]
            int r7 = r4.getResourceId(r7, r1)
            if (r7 != r1) goto L_0x0034
            r4.recycle()
            goto L_0x003b
        L_0x0034:
            int r6 = r6 + 1
            goto L_0x0026
        L_0x0037:
            r4.recycle()
        L_0x003a:
            r2 = 1
        L_0x003b:
            r0.recycle()
            if (r2 == 0) goto L_0x0041
            return
        L_0x0041:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant)."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.C14077m.m35058b(android.content.Context, android.util.AttributeSet, int[], int, int, int[]):void");
    }

    /* renamed from: c */
    public static void m35059c(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= iArr.length) {
                obtainStyledAttributes.recycle();
                z = true;
                break;
            } else if (!obtainStyledAttributes.hasValue(i)) {
                obtainStyledAttributes.recycle();
                break;
            } else {
                i++;
            }
        }
        if (!z) {
            throw new IllegalArgumentException(C13437d.m33706k("The style on this component requires your app theme to be ", str, " (or a descendant)."));
        }
    }

    /* renamed from: d */
    public static TypedArray m35060d(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m35057a(context, attributeSet, i, i2);
        m35058b(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    /* renamed from: e */
    public static C0413h1 m35061e(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m35057a(context, attributeSet, i, i2);
        m35058b(context, attributeSet, iArr, i, i2, iArr2);
        return new C0413h1(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }
}
