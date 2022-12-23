package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.C0468w;
import p090g1.C4732a;
import p116i1.C5247f;
import p127j.C5344a;

/* renamed from: androidx.appcompat.widget.h1 */
public final class C0413h1 {

    /* renamed from: a */
    public final Context f1514a;

    /* renamed from: b */
    public final TypedArray f1515b;

    /* renamed from: c */
    public TypedValue f1516c;

    public C0413h1(Context context, TypedArray typedArray) {
        this.f1514a = context;
        this.f1515b = typedArray;
    }

    /* renamed from: m */
    public static C0413h1 m1063m(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new C0413h1(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    /* renamed from: a */
    public final boolean mo2087a(int i, boolean z) {
        return this.f1515b.getBoolean(i, z);
    }

    /* renamed from: b */
    public final ColorStateList mo2088b(int i) {
        int resourceId;
        ColorStateList colorStateList;
        if (!this.f1515b.hasValue(i) || (resourceId = this.f1515b.getResourceId(i, 0)) == 0 || (colorStateList = C4732a.getColorStateList(this.f1514a, resourceId)) == null) {
            return this.f1515b.getColorStateList(i);
        }
        return colorStateList;
    }

    /* renamed from: c */
    public final int mo2089c(int i, int i2) {
        return this.f1515b.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: d */
    public final int mo2090d(int i, int i2) {
        return this.f1515b.getDimensionPixelSize(i, i2);
    }

    /* renamed from: e */
    public final Drawable mo2091e(int i) {
        int resourceId;
        if (!this.f1515b.hasValue(i) || (resourceId = this.f1515b.getResourceId(i, 0)) == 0) {
            return this.f1515b.getDrawable(i);
        }
        return C5344a.m13397a(this.f1514a, resourceId);
    }

    /* renamed from: f */
    public final Drawable mo2092f(int i) {
        int resourceId;
        Drawable g;
        if (!this.f1515b.hasValue(i) || (resourceId = this.f1515b.getResourceId(i, 0)) == 0) {
            return null;
        }
        C0407g a = C0407g.m1025a();
        Context context = this.f1514a;
        synchronized (a) {
            g = a.f1505a.mo2208g(context, resourceId, true);
        }
        return g;
    }

    /* renamed from: g */
    public final Typeface mo2093g(int i, int i2, C0468w.C0469a aVar) {
        int resourceId = this.f1515b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1516c == null) {
            this.f1516c = new TypedValue();
        }
        Context context = this.f1514a;
        TypedValue typedValue = this.f1516c;
        ThreadLocal<TypedValue> threadLocal = C5247f.f17365a;
        if (context.isRestricted()) {
            return null;
        }
        return C5247f.m13263b(context, resourceId, typedValue, i2, aVar, true, false);
    }

    /* renamed from: h */
    public final int mo2094h(int i, int i2) {
        return this.f1515b.getInt(i, i2);
    }

    /* renamed from: i */
    public final int mo2095i(int i, int i2) {
        return this.f1515b.getResourceId(i, i2);
    }

    /* renamed from: j */
    public final String mo2096j(int i) {
        return this.f1515b.getString(i);
    }

    /* renamed from: k */
    public final CharSequence mo2097k(int i) {
        return this.f1515b.getText(i);
    }

    /* renamed from: l */
    public final boolean mo2098l(int i) {
        return this.f1515b.hasValue(i);
    }

    /* renamed from: n */
    public final void mo2099n() {
        this.f1515b.recycle();
    }
}
