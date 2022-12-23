package com.moovit.commons.view;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import android.widget.TextView;
import k00.C17989c;
import p977zz.C20943i;
import p977zz.C20944i0;

public class HorizontallyCenteredTextView extends TextView {

    /* renamed from: b */
    public Rect f41133b;

    /* renamed from: c */
    public Rect f41134c;

    /* renamed from: d */
    public boolean f41135d = true;

    public HorizontallyCenteredTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setGravity(1 | (getGravity() & -8));
        if (C20943i.m49051d(17)) {
            setTextAlignment(4);
        }
    }

    /* renamed from: a */
    public final C20944i0<Drawable, Drawable> mo47112a(InsetDrawable insetDrawable, Drawable drawable) {
        if (insetDrawable != null && drawable == null) {
            drawable = new C17989c();
        }
        InsetDrawable insetDrawable2 = drawable;
        if (insetDrawable2 != null && insetDrawable == null) {
            insetDrawable = new C17989c();
        }
        if (insetDrawable != null) {
            if (this.f41133b == null) {
                this.f41133b = new Rect();
                this.f41134c = new Rect();
            }
            insetDrawable.copyBounds(this.f41133b);
            insetDrawable2.copyBounds(this.f41134c);
            if (this.f41133b.width() > this.f41134c.width()) {
                InsetDrawable insetDrawable3 = new InsetDrawable(insetDrawable2, this.f41133b.width() - this.f41134c.width(), 0, 0, 0);
                Rect rect = this.f41134c;
                int i = rect.left;
                insetDrawable3.setBounds(i, rect.top, this.f41133b.width() + i, this.f41134c.bottom);
                insetDrawable2 = insetDrawable3;
            } else {
                InsetDrawable insetDrawable4 = new InsetDrawable(insetDrawable, 0, this.f41134c.width() - this.f41133b.width(), 0, 0);
                Rect rect2 = this.f41133b;
                int i2 = rect2.left;
                insetDrawable4.setBounds(i2, rect2.top, this.f41134c.width() + i2, this.f41133b.bottom);
                insetDrawable = insetDrawable4;
            }
        }
        return new C20944i0<>(insetDrawable, insetDrawable2);
    }

    public void setCenteredMode(boolean z) {
        this.f41135d = z;
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (this.f41135d) {
            C20944i0<Drawable, Drawable> a = mo47112a(drawable, drawable3);
            super.setCompoundDrawables((Drawable) a.f52692a, drawable2, (Drawable) a.f52693b, drawable4);
            return;
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (this.f41135d) {
            C20944i0<Drawable, Drawable> a = mo47112a(drawable, drawable3);
            super.setCompoundDrawablesRelative((Drawable) a.f52692a, drawable2, (Drawable) a.f52693b, drawable4);
            return;
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    public HorizontallyCenteredTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setGravity(1 | (getGravity() & -8));
        if (C20943i.m49051d(17)) {
            setTextAlignment(4);
        }
    }
}
