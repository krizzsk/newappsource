package p141k1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import java.lang.reflect.Method;

/* renamed from: k1.f */
public final class C5458f extends C5457e {

    /* renamed from: i */
    public static Method f17976i;

    public C5458f(Drawable drawable) {
        super(drawable);
        if (f17976i == null) {
            try {
                f17976i = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: c */
    public final boolean mo21303c() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f17975g;
        if ((drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable)) {
            return true;
        }
        return false;
    }

    public final Rect getDirtyBounds() {
        return this.f17975g.getDirtyBounds();
    }

    public final void getOutline(Outline outline) {
        this.f17975g.getOutline(outline);
    }

    public final boolean isProjected() {
        Method method;
        Drawable drawable = this.f17975g;
        if (!(drawable == null || (method = f17976i) == null)) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public final void setHotspot(float f, float f2) {
        this.f17975g.setHotspot(f, f2);
    }

    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f17975g.setHotspotBounds(i, i2, i3, i4);
    }

    public final boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    public final void setTint(int i) {
        if (mo21303c()) {
            super.setTint(i);
        } else {
            this.f17975g.setTint(i);
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        if (mo21303c()) {
            super.setTintList(colorStateList);
        } else {
            this.f17975g.setTintList(colorStateList);
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        if (mo21303c()) {
            super.setTintMode(mode);
        } else {
            this.f17975g.setTintMode(mode);
        }
    }

    public C5458f(C5459g gVar, Resources resources) {
        super(gVar, resources);
        if (f17976i == null) {
            try {
                f17976i = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception unused) {
            }
        }
    }
}
