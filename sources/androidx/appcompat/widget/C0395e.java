package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import p141k1.C5450a;

/* renamed from: androidx.appcompat.widget.e */
public final class C0395e {

    /* renamed from: a */
    public final CheckedTextView f1473a;

    /* renamed from: b */
    public ColorStateList f1474b = null;

    /* renamed from: c */
    public PorterDuff.Mode f1475c = null;

    /* renamed from: d */
    public boolean f1476d = false;

    /* renamed from: e */
    public boolean f1477e = false;

    /* renamed from: f */
    public boolean f1478f;

    public C0395e(CheckedTextView checkedTextView) {
        this.f1473a = checkedTextView;
    }

    /* renamed from: a */
    public final void mo2065a() {
        Drawable checkMarkDrawable = this.f1473a.getCheckMarkDrawable();
        if (checkMarkDrawable == null) {
            return;
        }
        if (this.f1476d || this.f1477e) {
            Drawable mutate = C5450a.m13604g(checkMarkDrawable).mutate();
            if (this.f1476d) {
                C5450a.C5452b.m13617h(mutate, this.f1474b);
            }
            if (this.f1477e) {
                C5450a.C5452b.m13618i(mutate, this.f1475c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f1473a.getDrawableState());
            }
            this.f1473a.setCheckMarkDrawable(mutate);
        }
    }
}
