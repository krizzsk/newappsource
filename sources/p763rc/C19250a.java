package p763rc;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import p141k1.C5455c;
import p811tc.C19648g;
import p811tc.C19654k;
import p811tc.C19666o;

/* renamed from: rc.a */
public final class C19250a extends Drawable implements C19666o, C5455c {

    /* renamed from: b */
    public C19251a f48891b;

    public C19250a(C19654k kVar) {
        this(new C19251a(new C19648g(kVar)));
    }

    public final void draw(Canvas canvas) {
        C19251a aVar = this.f48891b;
        if (aVar.f48893b) {
            aVar.f48892a.draw(canvas);
        }
    }

    public final Drawable.ConstantState getConstantState() {
        return this.f48891b;
    }

    public final int getOpacity() {
        return this.f48891b.f48892a.getOpacity();
    }

    public final boolean isStateful() {
        return true;
    }

    public final Drawable mutate() {
        this.f48891b = new C19251a(this.f48891b);
        return this;
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f48891b.f48892a.setBounds(rect);
    }

    public final boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f48891b.f48892a.setState(iArr)) {
            onStateChange = true;
        }
        boolean d = C19252b.m46507d(iArr);
        C19251a aVar = this.f48891b;
        if (aVar.f48893b == d) {
            return onStateChange;
        }
        aVar.f48893b = d;
        return true;
    }

    public final void setAlpha(int i) {
        this.f48891b.f48892a.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f48891b.f48892a.setColorFilter(colorFilter);
    }

    public final void setShapeAppearanceModel(C19654k kVar) {
        this.f48891b.f48892a.setShapeAppearanceModel(kVar);
    }

    public final void setTint(int i) {
        this.f48891b.f48892a.setTint(i);
    }

    public final void setTintList(ColorStateList colorStateList) {
        this.f48891b.f48892a.setTintList(colorStateList);
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        this.f48891b.f48892a.setTintMode(mode);
    }

    public C19250a(C19251a aVar) {
        this.f48891b = aVar;
    }

    /* renamed from: rc.a$a */
    public static final class C19251a extends Drawable.ConstantState {

        /* renamed from: a */
        public C19648g f48892a;

        /* renamed from: b */
        public boolean f48893b;

        public C19251a(C19648g gVar) {
            this.f48892a = gVar;
            this.f48893b = false;
        }

        public final int getChangingConfigurations() {
            return 0;
        }

        public final Drawable newDrawable() {
            return new C19250a(new C19251a(this));
        }

        public C19251a(C19251a aVar) {
            this.f48892a = (C19648g) aVar.f48892a.f49837b.newDrawable();
            this.f48893b = aVar.f48893b;
        }
    }
}
