package y00;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.moovit.commons.utils.UiUtils;
import p090g1.C4732a;
import p141k1.C5450a;
import p141k1.C5456d;
import p977zz.C20941h;

/* renamed from: y00.b */
public final class C20683b {

    /* renamed from: a */
    public final View f52252a;

    /* renamed from: b */
    public Drawable f52253b;

    /* renamed from: c */
    public ColorStateList f52254c;

    /* renamed from: d */
    public PorterDuff.Mode f52255d;

    public C20683b(View view, TypedArray typedArray, int i, int i2, int i3) {
        Context context = view.getContext();
        this.f52252a = view;
        this.f52253b = C20941h.m49042e(context, typedArray, i);
        this.f52254c = C20941h.m49039b(context, typedArray, i2);
        this.f52255d = UiUtils.m40257p(typedArray.getInt(i3, -1), PorterDuff.Mode.SRC_IN);
        mo52838f();
    }

    /* renamed from: a */
    public final void mo52833a() {
        Drawable drawable = this.f52253b;
        if (drawable != null && drawable.isStateful() && this.f52253b.setState(this.f52252a.getDrawableState())) {
            this.f52252a.invalidateDrawable(this.f52253b);
        }
    }

    /* renamed from: b */
    public final boolean mo52834b(Drawable drawable) {
        Drawable drawable2 = this.f52253b;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (drawable2 instanceof C5456d) {
            drawable2 = ((C5456d) drawable2).mo21301a();
        }
        if (drawable2 == drawable) {
            return false;
        }
        this.f52253b = drawable;
        mo52838f();
        return true;
    }

    /* renamed from: c */
    public final boolean mo52835c(int i) {
        return mo52836d(C4732a.getColorStateList(this.f52252a.getContext(), i));
    }

    /* renamed from: d */
    public final boolean mo52836d(ColorStateList colorStateList) {
        if (this.f52254c == colorStateList) {
            return false;
        }
        this.f52254c = colorStateList;
        mo52838f();
        return true;
    }

    /* renamed from: e */
    public final boolean mo52837e(PorterDuff.Mode mode) {
        if (this.f52255d == mode) {
            return false;
        }
        this.f52255d = mode;
        mo52838f();
        return true;
    }

    /* renamed from: f */
    public final void mo52838f() {
        Drawable drawable = this.f52253b;
        if (drawable != null) {
            Drawable g = C5450a.m13604g(drawable);
            this.f52253b = g;
            C5450a.C5452b.m13617h(g, this.f52254c);
            C5450a.C5452b.m13618i(this.f52253b, this.f52255d);
            if (this.f52253b.isStateful() && this.f52253b.setState(this.f52252a.getDrawableState())) {
                this.f52252a.invalidateDrawable(this.f52253b);
            }
        }
    }
}
