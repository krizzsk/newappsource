package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.widget.C0794g;
import p114i.C5224j;
import p127j.C5344a;
import p242s1.C6333d0;

/* renamed from: androidx.appcompat.widget.j */
public final class C0417j {

    /* renamed from: a */
    public final ImageView f1521a;

    /* renamed from: b */
    public C0406f1 f1522b;

    /* renamed from: c */
    public C0406f1 f1523c;

    /* renamed from: d */
    public int f1524d = 0;

    public C0417j(ImageView imageView) {
        this.f1521a = imageView;
    }

    /* renamed from: a */
    public final void mo2137a() {
        boolean z;
        Drawable drawable = this.f1521a.getDrawable();
        if (drawable != null) {
            C0418j0.m1107a(drawable);
        }
        if (drawable != null) {
            int i = Build.VERSION.SDK_INT;
            boolean z2 = true;
            if (i <= 21 && i == 21) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (this.f1523c == null) {
                    this.f1523c = new C0406f1();
                }
                C0406f1 f1Var = this.f1523c;
                f1Var.f1499a = null;
                f1Var.f1502d = false;
                f1Var.f1500b = null;
                f1Var.f1501c = false;
                ColorStateList a = C0794g.C0795a.m2406a(this.f1521a);
                if (a != null) {
                    f1Var.f1502d = true;
                    f1Var.f1499a = a;
                }
                PorterDuff.Mode b = C0794g.C0795a.m2407b(this.f1521a);
                if (b != null) {
                    f1Var.f1501c = true;
                    f1Var.f1500b = b;
                }
                if (f1Var.f1502d || f1Var.f1501c) {
                    C0407g.m1028e(drawable, f1Var, this.f1521a.getDrawableState());
                } else {
                    z2 = false;
                }
                if (z2) {
                    return;
                }
            }
            C0406f1 f1Var2 = this.f1522b;
            if (f1Var2 != null) {
                C0407g.m1028e(drawable, f1Var2, this.f1521a.getDrawableState());
            }
        }
    }

    /* renamed from: b */
    public final void mo2138b(AttributeSet attributeSet, int i) {
        int i2;
        Context context = this.f1521a.getContext();
        int[] iArr = C5224j.AppCompatImageView;
        C0413h1 m = C0413h1.m1063m(context, attributeSet, iArr, i);
        ImageView imageView = this.f1521a;
        C6333d0.m15028p(imageView, imageView.getContext(), iArr, attributeSet, m.f1515b, i, 0);
        try {
            Drawable drawable = this.f1521a.getDrawable();
            if (!(drawable != null || (i2 = m.mo2095i(C5224j.AppCompatImageView_srcCompat, -1)) == -1 || (drawable = C5344a.m13397a(this.f1521a.getContext(), i2)) == null)) {
                this.f1521a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                C0418j0.m1107a(drawable);
            }
            int i3 = C5224j.AppCompatImageView_tint;
            if (m.mo2098l(i3)) {
                C0794g.m2404a(this.f1521a, m.mo2088b(i3));
            }
            int i4 = C5224j.AppCompatImageView_tintMode;
            if (m.mo2098l(i4)) {
                C0794g.m2405b(this.f1521a, C0418j0.m1109c(m.mo2094h(i4, -1), (PorterDuff.Mode) null));
            }
        } finally {
            m.mo2099n();
        }
    }

    /* renamed from: c */
    public final void mo2139c(int i) {
        if (i != 0) {
            Drawable a = C5344a.m13397a(this.f1521a.getContext(), i);
            if (a != null) {
                C0418j0.m1107a(a);
            }
            this.f1521a.setImageDrawable(a);
        } else {
            this.f1521a.setImageDrawable((Drawable) null);
        }
        mo2137a();
    }
}
