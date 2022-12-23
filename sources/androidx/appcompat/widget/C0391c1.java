package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import p090g1.C4732a;
import p114i.C5224j;
import p129j1.C5348a;

/* renamed from: androidx.appcompat.widget.c1 */
public final class C0391c1 {

    /* renamed from: a */
    public static final ThreadLocal<TypedValue> f1460a = new ThreadLocal<>();

    /* renamed from: b */
    public static final int[] f1461b = {-16842910};

    /* renamed from: c */
    public static final int[] f1462c = {16842908};

    /* renamed from: d */
    public static final int[] f1463d = {16842919};

    /* renamed from: e */
    public static final int[] f1464e = {16842912};

    /* renamed from: f */
    public static final int[] f1465f = new int[0];

    /* renamed from: g */
    public static final int[] f1466g = new int[1];

    /* renamed from: a */
    public static void m972a(Context context, View view) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C5224j.AppCompatTheme);
        try {
            if (!obtainStyledAttributes.hasValue(C5224j.AppCompatTheme_windowActionBar)) {
                view.getClass().toString();
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static int m973b(int i, Context context) {
        ColorStateList d = m975d(i, context);
        if (d != null && d.isStateful()) {
            return d.getColorForState(f1461b, d.getDefaultColor());
        }
        ThreadLocal<TypedValue> threadLocal = f1460a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        float f = typedValue.getFloat();
        int c = m974c(i, context);
        return C5348a.m13417m(c, Math.round(((float) Color.alpha(c)) * f));
    }

    /* renamed from: c */
    public static int m974c(int i, Context context) {
        int[] iArr = f1466g;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: d */
    public static ColorStateList m975d(int i, Context context) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f1466g;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = C4732a.getColorStateList(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
