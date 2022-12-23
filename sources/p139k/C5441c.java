package p139k;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import p141k1.C5450a;

/* renamed from: k.c */
public class C5441c extends Drawable implements Drawable.Callback {

    /* renamed from: b */
    public Drawable f17947b;

    public C5441c(Drawable drawable) {
        Drawable drawable2 = this.f17947b;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f17947b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.f17947b.draw(canvas);
    }

    public final int getChangingConfigurations() {
        return this.f17947b.getChangingConfigurations();
    }

    public final Drawable getCurrent() {
        return this.f17947b.getCurrent();
    }

    public final int getIntrinsicHeight() {
        return this.f17947b.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        return this.f17947b.getIntrinsicWidth();
    }

    public final int getMinimumHeight() {
        return this.f17947b.getMinimumHeight();
    }

    public final int getMinimumWidth() {
        return this.f17947b.getMinimumWidth();
    }

    public final int getOpacity() {
        return this.f17947b.getOpacity();
    }

    public final boolean getPadding(Rect rect) {
        return this.f17947b.getPadding(rect);
    }

    public final int[] getState() {
        return this.f17947b.getState();
    }

    public final Region getTransparentRegion() {
        return this.f17947b.getTransparentRegion();
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final boolean isAutoMirrored() {
        return C5450a.C5451a.m13608d(this.f17947b);
    }

    public final boolean isStateful() {
        return this.f17947b.isStateful();
    }

    public final void jumpToCurrentState() {
        this.f17947b.jumpToCurrentState();
    }

    public final void onBoundsChange(Rect rect) {
        this.f17947b.setBounds(rect);
    }

    public final boolean onLevelChange(int i) {
        return this.f17947b.setLevel(i);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public final void setAlpha(int i) {
        this.f17947b.setAlpha(i);
    }

    public final void setAutoMirrored(boolean z) {
        C5450a.C5451a.m13609e(this.f17947b, z);
    }

    public final void setChangingConfigurations(int i) {
        this.f17947b.setChangingConfigurations(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f17947b.setColorFilter(colorFilter);
    }

    public final void setDither(boolean z) {
        this.f17947b.setDither(z);
    }

    public final void setFilterBitmap(boolean z) {
        this.f17947b.setFilterBitmap(z);
    }

    public void setHotspot(float f, float f2) {
        C5450a.C5452b.m13614e(this.f17947b, f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        C5450a.C5452b.m13615f(this.f17947b, i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        return this.f17947b.setState(iArr);
    }

    public final void setTint(int i) {
        C5450a.C5452b.m13616g(this.f17947b, i);
    }

    public final void setTintList(ColorStateList colorStateList) {
        C5450a.C5452b.m13617h(this.f17947b, colorStateList);
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        C5450a.C5452b.m13618i(this.f17947b, mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f17947b.setVisible(z, z2);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
