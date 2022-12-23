package com.google.android.material.circularreveal.coordinatorlayout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.circularreveal.C13948b;
import com.google.android.material.circularreveal.C13950c;

public class CircularRevealCoordinatorLayout extends CoordinatorLayout implements C13950c {

    /* renamed from: A */
    public final C13948b f34620A = new C13948b(this);

    public CircularRevealCoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo41445a() {
        this.f34620A.getClass();
    }

    /* renamed from: b */
    public final void mo41446b() {
        this.f34620A.getClass();
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
        C13948b bVar = this.f34620A;
        if (bVar != null) {
            bVar.mo41466a(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.f34620A.f34611e;
    }

    public int getCircularRevealScrimColor() {
        return this.f34620A.mo41467b();
    }

    public C13950c.C13954d getRevealInfo() {
        return this.f34620A.mo41468c();
    }

    public final boolean isOpaque() {
        C13948b bVar = this.f34620A;
        if (bVar != null) {
            return bVar.mo41469d();
        }
        return super.isOpaque();
    }

    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f34620A.mo41470e(drawable);
    }

    public void setCircularRevealScrimColor(int i) {
        this.f34620A.mo41471f(i);
    }

    public void setRevealInfo(C13950c.C13954d dVar) {
        this.f34620A.mo41472g(dVar);
    }
}
