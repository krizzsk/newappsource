package p742qc;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.appcompat.widget.C0413h1;
import p090g1.C4732a;
import p127j.C5344a;

/* renamed from: qc.c */
public final class C19099c {
    /* renamed from: a */
    public static ColorStateList m46247a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateList;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateList = C4732a.getColorStateList(context, resourceId)) == null) {
            return typedArray.getColorStateList(i);
        }
        return colorStateList;
    }

    /* renamed from: b */
    public static ColorStateList m46248b(Context context, C0413h1 h1Var, int i) {
        int i2;
        ColorStateList colorStateList;
        if (!h1Var.mo2098l(i) || (i2 = h1Var.mo2095i(i, 0)) == 0 || (colorStateList = C4732a.getColorStateList(context, i2)) == null) {
            return h1Var.mo2088b(i);
        }
        return colorStateList;
    }

    /* renamed from: c */
    public static int m46249c(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i2);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    /* renamed from: d */
    public static Drawable m46250d(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable a;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (a = C5344a.m13397a(context, resourceId)) == null) {
            return typedArray.getDrawable(i);
        }
        return a;
    }

    /* renamed from: e */
    public static boolean m46251e(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }
}
