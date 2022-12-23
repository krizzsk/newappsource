package p977zz;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import p090g1.C4732a;
import p127j.C5344a;

/* renamed from: zz.h */
public final class C20941h {
    /* renamed from: a */
    public static int m49038a(Context context, TypedArray typedArray, int i, int i2) {
        ColorStateList b = m49039b(context, typedArray, i);
        if (b != null) {
            return b.getDefaultColor();
        }
        return m49043f(i2, context);
    }

    /* renamed from: b */
    public static ColorStateList m49039b(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateList;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateList = C4732a.getColorStateList(context, resourceId)) == null) {
            return typedArray.getColorStateList(i);
        }
        return colorStateList;
    }

    /* renamed from: c */
    public static int m49040c(Context context, TypedArray typedArray, int i) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelOffset(i, 0);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        try {
            return obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: d */
    public static int m49041d(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        try {
            return obtainStyledAttributes.getDimensionPixelSize(0, i2);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: e */
    public static Drawable m49042e(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable a;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (a = C5344a.m13397a(context, resourceId)) == null) {
            return typedArray.getDrawable(i);
        }
        return a;
    }

    /* renamed from: f */
    public static int m49043f(int i, Context context) {
        return m49046i(i, context).data;
    }

    /* renamed from: g */
    public static ColorStateList m49044g(int i, Context context) {
        return C4732a.getColorStateList(context, m49047j(i, context));
    }

    /* renamed from: h */
    public static Drawable m49045h(int i, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        try {
            return m49042e(context, obtainStyledAttributes, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: i */
    public static TypedValue m49046i(int i, Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        StringBuilder k = C13555b.m33972k("Unable to resolve the specified attribute resource: ");
        k.append(context.getResources().getResourceName(i));
        throw new IllegalArgumentException(k.toString());
    }

    /* renamed from: j */
    public static int m49047j(int i, Context context) {
        return m49046i(i, context).resourceId;
    }
}
