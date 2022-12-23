package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import p114i.C5215a;

public class AppCompatImageButton extends ImageButton {

    /* renamed from: b */
    public final C0392d f1150b;

    /* renamed from: c */
    public final C0417j f1151c;

    /* renamed from: d */
    public boolean f1152d;

    public AppCompatImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5215a.imageButtonStyle);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0392d dVar = this.f1150b;
        if (dVar != null) {
            dVar.mo2054a();
        }
        C0417j jVar = this.f1151c;
        if (jVar != null) {
            jVar.mo2137a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0392d dVar = this.f1150b;
        if (dVar != null) {
            return dVar.mo2055b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0392d dVar = this.f1150b;
        if (dVar != null) {
            return dVar.mo2056c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C0406f1 f1Var;
        C0417j jVar = this.f1151c;
        if (jVar == null || (f1Var = jVar.f1522b) == null) {
            return null;
        }
        return f1Var.f1499a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C0406f1 f1Var;
        C0417j jVar = this.f1151c;
        if (jVar == null || (f1Var = jVar.f1522b) == null) {
            return null;
        }
        return f1Var.f1500b;
    }

    public final boolean hasOverlappingRendering() {
        if (!(!(this.f1151c.f1521a.getBackground() instanceof RippleDrawable)) || !super.hasOverlappingRendering()) {
            return false;
        }
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0392d dVar = this.f1150b;
        if (dVar != null) {
            dVar.mo2058e();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0392d dVar = this.f1150b;
        if (dVar != null) {
            dVar.mo2059f(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0417j jVar = this.f1151c;
        if (jVar != null) {
            jVar.mo2137a();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        C0417j jVar = this.f1151c;
        if (!(jVar == null || drawable == null || this.f1152d)) {
            jVar.f1524d = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        C0417j jVar2 = this.f1151c;
        if (jVar2 != null) {
            jVar2.mo2137a();
            if (!this.f1152d) {
                C0417j jVar3 = this.f1151c;
                if (jVar3.f1521a.getDrawable() != null) {
                    jVar3.f1521a.getDrawable().setLevel(jVar3.f1524d);
                }
            }
        }
    }

    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f1152d = true;
    }

    public void setImageResource(int i) {
        this.f1151c.mo2139c(i);
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0417j jVar = this.f1151c;
        if (jVar != null) {
            jVar.mo2137a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0392d dVar = this.f1150b;
        if (dVar != null) {
            dVar.mo2061h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0392d dVar = this.f1150b;
        if (dVar != null) {
            dVar.mo2062i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0417j jVar = this.f1151c;
        if (jVar != null) {
            if (jVar.f1522b == null) {
                jVar.f1522b = new C0406f1();
            }
            C0406f1 f1Var = jVar.f1522b;
            f1Var.f1499a = colorStateList;
            f1Var.f1502d = true;
            jVar.mo2137a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0417j jVar = this.f1151c;
        if (jVar != null) {
            if (jVar.f1522b == null) {
                jVar.f1522b = new C0406f1();
            }
            C0406f1 f1Var = jVar.f1522b;
            f1Var.f1500b = mode;
            f1Var.f1501c = true;
            jVar.mo2137a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppCompatImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0403e1.m1011a(context);
        this.f1152d = false;
        C0391c1.m972a(getContext(), this);
        C0392d dVar = new C0392d(this);
        this.f1150b = dVar;
        dVar.mo2057d(attributeSet, i);
        C0417j jVar = new C0417j(this);
        this.f1151c = jVar;
        jVar.mo2138b(attributeSet, i);
    }
}
