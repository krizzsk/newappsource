package com.google.android.material.circularreveal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.google.android.material.circularreveal.C13950c;

public class CircularRevealRelativeLayout extends RelativeLayout implements C13950c {

    /* renamed from: b */
    public final C13948b f34606b = new C13948b(this);

    public CircularRevealRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo41445a() {
        this.f34606b.getClass();
    }

    /* renamed from: b */
    public final void mo41446b() {
        this.f34606b.getClass();
    }

    /* renamed from: c */
    public final void mo41447c(Canvas canvas) {
        super.draw(canvas);
    }

    /* renamed from: d */
    public final boolean mo41448d() {
        return super.isOpaque();
    }

    public final void draw(Canvas canvas) {
        C13948b bVar = this.f34606b;
        if (bVar != null) {
            bVar.mo41466a(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.f34606b.f34611e;
    }

    public int getCircularRevealScrimColor() {
        return this.f34606b.mo41467b();
    }

    public C13950c.C13954d getRevealInfo() {
        return this.f34606b.mo41468c();
    }

    public final boolean isOpaque() {
        C13948b bVar = this.f34606b;
        if (bVar != null) {
            return bVar.mo41469d();
        }
        return super.isOpaque();
    }

    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f34606b.mo41470e(drawable);
    }

    public void setCircularRevealScrimColor(int i) {
        this.f34606b.mo41471f(i);
    }

    public void setRevealInfo(C13950c.C13954d dVar) {
        this.f34606b.mo41472g(dVar);
    }
}
