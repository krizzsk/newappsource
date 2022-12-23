package com.google.android.material.circularreveal.cardview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.circularreveal.C13948b;
import com.google.android.material.circularreveal.C13950c;

public class CircularRevealCardView extends MaterialCardView implements C13950c {

    /* renamed from: q */
    public final C13948b f34619q = new C13948b(this);

    public CircularRevealCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo41445a() {
        this.f34619q.getClass();
    }

    /* renamed from: b */
    public final void mo41446b() {
        this.f34619q.getClass();
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
        C13948b bVar = this.f34619q;
        if (bVar != null) {
            bVar.mo41466a(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.f34619q.f34611e;
    }

    public int getCircularRevealScrimColor() {
        return this.f34619q.mo41467b();
    }

    public C13950c.C13954d getRevealInfo() {
        return this.f34619q.mo41468c();
    }

    public final boolean isOpaque() {
        C13948b bVar = this.f34619q;
        if (bVar != null) {
            return bVar.mo41469d();
        }
        return super.isOpaque();
    }

    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f34619q.mo41470e(drawable);
    }

    public void setCircularRevealScrimColor(int i) {
        this.f34619q.mo41471f(i);
    }

    public void setRevealInfo(C13950c.C13954d dVar) {
        this.f34619q.mo41472g(dVar);
    }
}
