package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

public class AppCompatImageView extends ImageView {
    private final C0392d mBackgroundTintHelper;
    private boolean mHasLevel;
    private final C0417j mImageHelper;

    public AppCompatImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0392d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.mo2054a();
        }
        C0417j jVar = this.mImageHelper;
        if (jVar != null) {
            jVar.mo2137a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0392d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            return dVar.mo2055b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0392d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            return dVar.mo2056c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C0406f1 f1Var;
        C0417j jVar = this.mImageHelper;
        if (jVar == null || (f1Var = jVar.f1522b) == null) {
            return null;
        }
        return f1Var.f1499a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C0406f1 f1Var;
        C0417j jVar = this.mImageHelper;
        if (jVar == null || (f1Var = jVar.f1522b) == null) {
            return null;
        }
        return f1Var.f1500b;
    }

    public boolean hasOverlappingRendering() {
        if (!(!(this.mImageHelper.f1521a.getBackground() instanceof RippleDrawable)) || !super.hasOverlappingRendering()) {
            return false;
        }
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0392d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.mo2058e();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0392d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.mo2059f(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0417j jVar = this.mImageHelper;
        if (jVar != null) {
            jVar.mo2137a();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        C0417j jVar = this.mImageHelper;
        if (!(jVar == null || drawable == null || this.mHasLevel)) {
            jVar.f1524d = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        C0417j jVar2 = this.mImageHelper;
        if (jVar2 != null) {
            jVar2.mo2137a();
            if (!this.mHasLevel) {
                C0417j jVar3 = this.mImageHelper;
                if (jVar3.f1521a.getDrawable() != null) {
                    jVar3.f1521a.getDrawable().setLevel(jVar3.f1524d);
                }
            }
        }
    }

    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.mHasLevel = true;
    }

    public void setImageResource(int i) {
        C0417j jVar = this.mImageHelper;
        if (jVar != null) {
            jVar.mo2139c(i);
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0417j jVar = this.mImageHelper;
        if (jVar != null) {
            jVar.mo2137a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0392d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.mo2061h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0392d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.mo2062i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0417j jVar = this.mImageHelper;
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
        C0417j jVar = this.mImageHelper;
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

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0403e1.m1011a(context);
        this.mHasLevel = false;
        C0391c1.m972a(getContext(), this);
        C0392d dVar = new C0392d(this);
        this.mBackgroundTintHelper = dVar;
        dVar.mo2057d(attributeSet, i);
        C0417j jVar = new C0417j(this);
        this.mImageHelper = jVar;
        jVar.mo2138b(attributeSet, i);
    }
}
