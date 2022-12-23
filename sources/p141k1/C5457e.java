package p141k1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import p141k1.C5450a;

/* renamed from: k1.e */
public class C5457e extends Drawable implements Drawable.Callback, C5456d, C5455c {

    /* renamed from: h */
    public static final PorterDuff.Mode f17969h = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    public int f17970b;

    /* renamed from: c */
    public PorterDuff.Mode f17971c;

    /* renamed from: d */
    public boolean f17972d;

    /* renamed from: e */
    public C5459g f17973e;

    /* renamed from: f */
    public boolean f17974f;

    /* renamed from: g */
    public Drawable f17975g;

    public C5457e(C5459g gVar, Resources resources) {
        Drawable.ConstantState constantState;
        this.f17973e = gVar;
        if (gVar != null && (constantState = gVar.f17978b) != null) {
            mo21302b(constantState.newDrawable(resources));
        }
    }

    /* renamed from: a */
    public final Drawable mo21301a() {
        return this.f17975g;
    }

    /* renamed from: b */
    public final void mo21302b(Drawable drawable) {
        Drawable drawable2 = this.f17975g;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f17975g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            C5459g gVar = this.f17973e;
            if (gVar != null) {
                gVar.f17978b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    /* renamed from: c */
    public boolean mo21303c() {
        throw null;
    }

    /* renamed from: d */
    public final boolean mo21304d(int[] iArr) {
        if (!mo21303c()) {
            return false;
        }
        C5459g gVar = this.f17973e;
        ColorStateList colorStateList = gVar.f17979c;
        PorterDuff.Mode mode = gVar.f17980d;
        if (colorStateList == null || mode == null) {
            this.f17972d = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.f17972d && colorForState == this.f17970b && mode == this.f17971c)) {
                setColorFilter(colorForState, mode);
                this.f17970b = colorForState;
                this.f17971c = mode;
                this.f17972d = true;
                return true;
            }
        }
        return false;
    }

    public final void draw(Canvas canvas) {
        this.f17975g.draw(canvas);
    }

    public final int getChangingConfigurations() {
        int i;
        int changingConfigurations = super.getChangingConfigurations();
        C5459g gVar = this.f17973e;
        if (gVar != null) {
            i = gVar.getChangingConfigurations();
        } else {
            i = 0;
        }
        return changingConfigurations | i | this.f17975g.getChangingConfigurations();
    }

    public final Drawable.ConstantState getConstantState() {
        boolean z;
        C5459g gVar = this.f17973e;
        if (gVar == null) {
            return null;
        }
        if (gVar.f17978b != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return null;
        }
        gVar.f17977a = getChangingConfigurations();
        return this.f17973e;
    }

    public final Drawable getCurrent() {
        return this.f17975g.getCurrent();
    }

    public final int getIntrinsicHeight() {
        return this.f17975g.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        return this.f17975g.getIntrinsicWidth();
    }

    public final int getLayoutDirection() {
        return C5450a.m13599b(this.f17975g);
    }

    public final int getMinimumHeight() {
        return this.f17975g.getMinimumHeight();
    }

    public final int getMinimumWidth() {
        return this.f17975g.getMinimumWidth();
    }

    public final int getOpacity() {
        return this.f17975g.getOpacity();
    }

    public final boolean getPadding(Rect rect) {
        return this.f17975g.getPadding(rect);
    }

    public final int[] getState() {
        return this.f17975g.getState();
    }

    public final Region getTransparentRegion() {
        return this.f17975g.getTransparentRegion();
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final boolean isAutoMirrored() {
        return C5450a.C5451a.m13608d(this.f17975g);
    }

    public final boolean isStateful() {
        ColorStateList colorStateList;
        C5459g gVar;
        if (!mo21303c() || (gVar = this.f17973e) == null) {
            colorStateList = null;
        } else {
            colorStateList = gVar.f17979c;
        }
        if ((colorStateList == null || !colorStateList.isStateful()) && !this.f17975g.isStateful()) {
            return false;
        }
        return true;
    }

    public final void jumpToCurrentState() {
        this.f17975g.jumpToCurrentState();
    }

    public final Drawable mutate() {
        Drawable.ConstantState constantState;
        if (!this.f17974f && super.mutate() == this) {
            this.f17973e = new C5459g(this.f17973e);
            Drawable drawable = this.f17975g;
            if (drawable != null) {
                drawable.mutate();
            }
            C5459g gVar = this.f17973e;
            if (gVar != null) {
                Drawable drawable2 = this.f17975g;
                if (drawable2 != null) {
                    constantState = drawable2.getConstantState();
                } else {
                    constantState = null;
                }
                gVar.f17978b = constantState;
            }
            this.f17974f = true;
        }
        return this;
    }

    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f17975g;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public final boolean onLayoutDirectionChanged(int i) {
        return C5450a.m13600c(this.f17975g, i);
    }

    public final boolean onLevelChange(int i) {
        return this.f17975g.setLevel(i);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public final void setAlpha(int i) {
        this.f17975g.setAlpha(i);
    }

    public final void setAutoMirrored(boolean z) {
        C5450a.C5451a.m13609e(this.f17975g, z);
    }

    public final void setChangingConfigurations(int i) {
        this.f17975g.setChangingConfigurations(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f17975g.setColorFilter(colorFilter);
    }

    public final void setDither(boolean z) {
        this.f17975g.setDither(z);
    }

    public final void setFilterBitmap(boolean z) {
        this.f17975g.setFilterBitmap(z);
    }

    public boolean setState(int[] iArr) {
        boolean state = this.f17975g.setState(iArr);
        if (mo21304d(iArr) || state) {
            return true;
        }
        return false;
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f17973e.f17979c = colorStateList;
        mo21304d(getState());
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f17973e.f17980d = mode;
        mo21304d(getState());
    }

    public final boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f17975g.setVisible(z, z2);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public C5457e(Drawable drawable) {
        this.f17973e = new C5459g(this.f17973e);
        mo21302b(drawable);
    }
}
