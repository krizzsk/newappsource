package com.google.android.material.circularreveal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.material.circularreveal.C13950c;

public class CircularRevealFrameLayout extends FrameLayout implements C13950c {

    /* renamed from: b */
    public final C13948b f34603b = new C13948b(this);

    public CircularRevealFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo41445a() {
        this.f34603b.getClass();
    }

    /* renamed from: b */
    public final void mo41446b() {
        this.f34603b.getClass();
    }

    /* renamed from: c */
    public final void mo41447c(Canvas canvas) {
        super.draw(canvas);
    }

    /* renamed from: d */
    public final boolean mo41448d() {
        return super.isOpaque();
    }

    @SuppressLint({"MissingSuperCall"})
    public final void draw(Canvas canvas) {
        C13948b bVar = this.f34603b;
        if (bVar != null) {
            bVar.mo41466a(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.f34603b.f34611e;
    }

    public int getCircularRevealScrimColor() {
        return this.f34603b.mo41467b();
    }

    public C13950c.C13954d getRevealInfo() {
        return this.f34603b.mo41468c();
    }

    public final boolean isOpaque() {
        C13948b bVar = this.f34603b;
        if (bVar != null) {
            return bVar.mo41469d();
        }
        return super.isOpaque();
    }

    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f34603b.mo41470e(drawable);
    }

    public void setCircularRevealScrimColor(int i) {
        this.f34603b.mo41471f(i);
    }

    public void setRevealInfo(C13950c.C13954d dVar) {
        this.f34603b.mo41472g(dVar);
    }
}
