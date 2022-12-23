package com.google.android.material.card;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;
import ce0.C21100e;
import com.appboy.support.ValidationUtils;
import p090g1.C4732a;
import p127j.C5344a;
import p141k1.C5450a;
import p355ac.C13401b;
import p355ac.C13410k;
import p481fc.C16949b;
import p811tc.C19648g;
import p811tc.C19654k;
import p811tc.C19666o;

public class MaterialCardView extends CardView implements Checkable, C19666o {

    /* renamed from: m */
    public static final int[] f34490m = {16842911};

    /* renamed from: n */
    public static final int[] f34491n = {16842912};

    /* renamed from: o */
    public static final int[] f34492o = {C13401b.state_dragged};

    /* renamed from: p */
    public static final int f34493p = C13410k.Widget_MaterialComponents_CardView;

    /* renamed from: i */
    public final C16949b f34494i;

    /* renamed from: j */
    public boolean f34495j;

    /* renamed from: k */
    public boolean f34496k;

    /* renamed from: l */
    public boolean f34497l;

    /* renamed from: com.google.android.material.card.MaterialCardView$a */
    public interface C13936a {
        /* renamed from: a */
        void mo41213a();
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C13401b.materialCardViewStyle);
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f34494i.f43967c.getBounds());
        return rectF;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r8.f34494i;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo41170f() {
        /*
            r8 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 <= r1) goto L_0x002a
            fc.b r0 = r8.f34494i
            android.graphics.drawable.RippleDrawable r1 = r0.f43979o
            if (r1 == 0) goto L_0x002a
            android.graphics.Rect r1 = r1.getBounds()
            int r2 = r1.bottom
            android.graphics.drawable.RippleDrawable r3 = r0.f43979o
            int r4 = r1.left
            int r5 = r1.top
            int r6 = r1.right
            int r7 = r2 + -1
            r3.setBounds(r4, r5, r6, r7)
            android.graphics.drawable.RippleDrawable r0 = r0.f43979o
            int r3 = r1.left
            int r4 = r1.top
            int r1 = r1.right
            r0.setBounds(r3, r4, r1, r2)
        L_0x002a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.card.MaterialCardView.mo41170f():void");
    }

    public ColorStateList getCardBackgroundColor() {
        return this.f34494i.f43967c.f49837b.f49863c;
    }

    public ColorStateList getCardForegroundColor() {
        return this.f34494i.f43968d.f49837b.f49863c;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f34494i.f43974j;
    }

    public int getCheckedIconGravity() {
        return this.f34494i.f43971g;
    }

    public int getCheckedIconMargin() {
        return this.f34494i.f43969e;
    }

    public int getCheckedIconSize() {
        return this.f34494i.f43970f;
    }

    public ColorStateList getCheckedIconTint() {
        return this.f34494i.f43976l;
    }

    public int getContentPaddingBottom() {
        return this.f34494i.f43966b.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f34494i.f43966b.left;
    }

    public int getContentPaddingRight() {
        return this.f34494i.f43966b.right;
    }

    public int getContentPaddingTop() {
        return this.f34494i.f43966b.top;
    }

    public float getProgress() {
        return this.f34494i.f43967c.f49837b.f49870j;
    }

    public float getRadius() {
        return this.f34494i.f43967c.mo52000j();
    }

    public ColorStateList getRippleColor() {
        return this.f34494i.f43975k;
    }

    public C19654k getShapeAppearanceModel() {
        return this.f34494i.f43977m;
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.f34494i.f43978n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f34494i.f43978n;
    }

    public int getStrokeWidth() {
        return this.f34494i.f43972h;
    }

    public final boolean isChecked() {
        return this.f34496k;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C21100e.m49299B0(this, this.f34494i.f43967c);
    }

    public final int[] onCreateDrawableState(int i) {
        boolean z;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        C16949b bVar = this.f34494i;
        if (bVar == null || !bVar.f43983s) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            View.mergeDrawableStates(onCreateDrawableState, f34490m);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f34491n);
        }
        if (this.f34497l) {
            View.mergeDrawableStates(onCreateDrawableState, f34492o);
        }
        return onCreateDrawableState;
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        C16949b bVar = this.f34494i;
        if (bVar == null || !bVar.f43983s) {
            z = false;
        } else {
            z = true;
        }
        accessibilityNodeInfo.setCheckable(z);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f34494i.mo49570e(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f34495j) {
            C16949b bVar = this.f34494i;
            if (!bVar.f43982r) {
                bVar.f43982r = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setCardBackgroundColor(int i) {
        C16949b bVar = this.f34494i;
        bVar.f43967c.mo52005n(ColorStateList.valueOf(i));
    }

    public void setCardElevation(float f) {
        super.setCardElevation(f);
        C16949b bVar = this.f34494i;
        bVar.f43967c.mo52003m(bVar.f43965a.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        C19648g gVar = this.f34494i.f43968d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        gVar.mo52005n(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.f34494i.f43983s = z;
    }

    public void setChecked(boolean z) {
        if (this.f34496k != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f34494i.mo49571f(drawable);
    }

    public void setCheckedIconGravity(int i) {
        C16949b bVar = this.f34494i;
        if (bVar.f43971g != i) {
            bVar.f43971g = i;
            bVar.mo49570e(bVar.f43965a.getMeasuredWidth(), bVar.f43965a.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(int i) {
        this.f34494i.f43969e = i;
    }

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.f34494i.f43969e = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconResource(int i) {
        this.f34494i.mo49571f(C5344a.m13397a(getContext(), i));
    }

    public void setCheckedIconSize(int i) {
        this.f34494i.f43970f = i;
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.f34494i.f43970f = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C16949b bVar = this.f34494i;
        bVar.f43976l = colorStateList;
        Drawable drawable = bVar.f43974j;
        if (drawable != null) {
            C5450a.C5452b.m13617h(drawable, colorStateList);
        }
    }

    public void setClickable(boolean z) {
        Drawable drawable;
        super.setClickable(z);
        C16949b bVar = this.f34494i;
        if (bVar != null) {
            Drawable drawable2 = bVar.f43973i;
            if (bVar.f43965a.isClickable()) {
                drawable = bVar.mo49568c();
            } else {
                drawable = bVar.f43968d;
            }
            bVar.f43973i = drawable;
            if (drawable2 == drawable) {
                return;
            }
            if (Build.VERSION.SDK_INT < 23 || !(bVar.f43965a.getForeground() instanceof InsetDrawable)) {
                bVar.f43965a.setForeground(bVar.mo49569d(drawable));
            } else {
                ((InsetDrawable) bVar.f43965a.getForeground()).setDrawable(drawable);
            }
        }
    }

    public void setDragged(boolean z) {
        if (this.f34497l != z) {
            this.f34497l = z;
            refreshDrawableState();
            mo41170f();
            invalidate();
        }
    }

    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.f34494i.mo49575j();
    }

    public void setOnCheckedChangeListener(C13936a aVar) {
    }

    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        this.f34494i.mo49575j();
        this.f34494i.mo49574i();
    }

    public void setProgress(float f) {
        C16949b bVar = this.f34494i;
        bVar.f43967c.mo52006o(f);
        C19648g gVar = bVar.f43968d;
        if (gVar != null) {
            gVar.mo52006o(f);
        }
        C19648g gVar2 = bVar.f43981q;
        if (gVar2 != null) {
            gVar2.mo52006o(f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        if (r3 != false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setRadius(float r3) {
        /*
            r2 = this;
            super.setRadius(r3)
            fc.b r0 = r2.f34494i
            tc.k r1 = r0.f43977m
            tc.k r3 = r1.mo52021g(r3)
            r0.mo49572g(r3)
            android.graphics.drawable.Drawable r3 = r0.f43973i
            r3.invalidateSelf()
            boolean r3 = r0.mo49573h()
            if (r3 != 0) goto L_0x002e
            com.google.android.material.card.MaterialCardView r3 = r0.f43965a
            boolean r3 = r3.getPreventCornerOverlap()
            if (r3 == 0) goto L_0x002b
            tc.g r3 = r0.f43967c
            boolean r3 = r3.mo52002l()
            if (r3 != 0) goto L_0x002b
            r3 = 1
            goto L_0x002c
        L_0x002b:
            r3 = 0
        L_0x002c:
            if (r3 == 0) goto L_0x0031
        L_0x002e:
            r0.mo49574i()
        L_0x0031:
            boolean r3 = r0.mo49573h()
            if (r3 == 0) goto L_0x003a
            r0.mo49575j()
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.card.MaterialCardView.setRadius(float):void");
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C16949b bVar = this.f34494i;
        bVar.f43975k = colorStateList;
        RippleDrawable rippleDrawable = bVar.f43979o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        C16949b bVar = this.f34494i;
        ColorStateList colorStateList = C4732a.getColorStateList(getContext(), i);
        bVar.f43975k = colorStateList;
        RippleDrawable rippleDrawable = bVar.f43979o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setShapeAppearanceModel(C19654k kVar) {
        setClipToOutline(kVar.mo52020f(getBoundsAsRectF()));
        this.f34494i.mo49572g(kVar);
    }

    public void setStrokeColor(int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public void setStrokeWidth(int i) {
        C16949b bVar = this.f34494i;
        if (i != bVar.f43972h) {
            bVar.f43972h = i;
            C19648g gVar = bVar.f43968d;
            ColorStateList colorStateList = bVar.f43978n;
            gVar.f49837b.f49871k = (float) i;
            gVar.invalidateSelf();
            gVar.mo52011s(colorStateList);
        }
        invalidate();
    }

    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        this.f34494i.mo49575j();
        this.f34494i.mo49574i();
    }

    public final void toggle() {
        boolean z;
        C16949b bVar = this.f34494i;
        int i = 0;
        if (bVar == null || !bVar.f43983s) {
            z = false;
        } else {
            z = true;
        }
        if (z && isEnabled()) {
            this.f34496k = !this.f34496k;
            refreshDrawableState();
            mo41170f();
            C16949b bVar2 = this.f34494i;
            boolean z2 = this.f34496k;
            Drawable drawable = bVar2.f43974j;
            if (drawable != null) {
                if (z2) {
                    i = ValidationUtils.APPBOY_STRING_MAX_LENGTH;
                }
                drawable.setAlpha(i);
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialCardView(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = f34493p
            android.content.Context r7 = p883wc.C20289a.m47861a(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            r7 = 0
            r6.f34496k = r7
            r6.f34497l = r7
            r0 = 1
            r6.f34495j = r0
            android.content.Context r0 = r6.getContext()
            int[] r2 = p355ac.C13411l.MaterialCardView
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r0 = com.google.android.material.internal.C14077m.m35060d(r0, r1, r2, r3, r4, r5)
            fc.b r1 = new fc.b
            r1.<init>(r6, r8, r9)
            r6.f34494i = r1
            android.content.res.ColorStateList r8 = super.getCardBackgroundColor()
            tc.g r9 = r1.f43967c
            r9.mo52005n(r8)
            int r8 = super.getContentPaddingLeft()
            int r9 = super.getContentPaddingTop()
            int r2 = super.getContentPaddingRight()
            int r3 = super.getContentPaddingBottom()
            android.graphics.Rect r4 = r1.f43966b
            r4.set(r8, r9, r2, r3)
            r1.mo49574i()
            com.google.android.material.card.MaterialCardView r8 = r1.f43965a
            android.content.Context r8 = r8.getContext()
            int r9 = p355ac.C13411l.MaterialCardView_strokeColor
            android.content.res.ColorStateList r8 = p742qc.C19099c.m46247a(r8, r0, r9)
            r1.f43978n = r8
            if (r8 != 0) goto L_0x005e
            r8 = -1
            android.content.res.ColorStateList r8 = android.content.res.ColorStateList.valueOf(r8)
            r1.f43978n = r8
        L_0x005e:
            int r8 = p355ac.C13411l.MaterialCardView_strokeWidth
            int r8 = r0.getDimensionPixelSize(r8, r7)
            r1.f43972h = r8
            int r8 = p355ac.C13411l.MaterialCardView_android_checkable
            boolean r8 = r0.getBoolean(r8, r7)
            r1.f43983s = r8
            com.google.android.material.card.MaterialCardView r9 = r1.f43965a
            r9.setLongClickable(r8)
            com.google.android.material.card.MaterialCardView r8 = r1.f43965a
            android.content.Context r8 = r8.getContext()
            int r9 = p355ac.C13411l.MaterialCardView_checkedIconTint
            android.content.res.ColorStateList r8 = p742qc.C19099c.m46247a(r8, r0, r9)
            r1.f43976l = r8
            com.google.android.material.card.MaterialCardView r8 = r1.f43965a
            android.content.Context r8 = r8.getContext()
            int r9 = p355ac.C13411l.MaterialCardView_checkedIcon
            android.graphics.drawable.Drawable r8 = p742qc.C19099c.m46250d(r8, r0, r9)
            r1.mo49571f(r8)
            int r8 = p355ac.C13411l.MaterialCardView_checkedIconSize
            int r8 = r0.getDimensionPixelSize(r8, r7)
            r1.f43970f = r8
            int r8 = p355ac.C13411l.MaterialCardView_checkedIconMargin
            int r8 = r0.getDimensionPixelSize(r8, r7)
            r1.f43969e = r8
            int r8 = p355ac.C13411l.MaterialCardView_checkedIconGravity
            r9 = 8388661(0x800035, float:1.1755018E-38)
            int r8 = r0.getInteger(r8, r9)
            r1.f43971g = r8
            com.google.android.material.card.MaterialCardView r8 = r1.f43965a
            android.content.Context r8 = r8.getContext()
            int r9 = p355ac.C13411l.MaterialCardView_rippleColor
            android.content.res.ColorStateList r8 = p742qc.C19099c.m46247a(r8, r0, r9)
            r1.f43975k = r8
            if (r8 != 0) goto L_0x00c9
            com.google.android.material.card.MaterialCardView r8 = r1.f43965a
            int r9 = p355ac.C13401b.colorControlHighlight
            int r8 = com.google.android.play.core.assetpacks.C14256d1.m35485c(r9, r8)
            android.content.res.ColorStateList r8 = android.content.res.ColorStateList.valueOf(r8)
            r1.f43975k = r8
        L_0x00c9:
            com.google.android.material.card.MaterialCardView r8 = r1.f43965a
            android.content.Context r8 = r8.getContext()
            int r9 = p355ac.C13411l.MaterialCardView_cardForegroundColor
            android.content.res.ColorStateList r8 = p742qc.C19099c.m46247a(r8, r0, r9)
            tc.g r9 = r1.f43968d
            if (r8 != 0) goto L_0x00dd
            android.content.res.ColorStateList r8 = android.content.res.ColorStateList.valueOf(r7)
        L_0x00dd:
            r9.mo52005n(r8)
            android.graphics.drawable.RippleDrawable r7 = r1.f43979o
            if (r7 == 0) goto L_0x00e9
            android.content.res.ColorStateList r8 = r1.f43975k
            r7.setColor(r8)
        L_0x00e9:
            tc.g r7 = r1.f43967c
            com.google.android.material.card.MaterialCardView r8 = r1.f43965a
            float r8 = r8.getCardElevation()
            r7.mo52003m(r8)
            tc.g r7 = r1.f43968d
            int r8 = r1.f43972h
            float r8 = (float) r8
            android.content.res.ColorStateList r9 = r1.f43978n
            tc.g$b r2 = r7.f49837b
            r2.f49871k = r8
            r7.invalidateSelf()
            r7.mo52011s(r9)
            com.google.android.material.card.MaterialCardView r7 = r1.f43965a
            tc.g r8 = r1.f43967c
            fc.a r8 = r1.mo49569d(r8)
            r7.setBackgroundInternal(r8)
            com.google.android.material.card.MaterialCardView r7 = r1.f43965a
            boolean r7 = r7.isClickable()
            if (r7 == 0) goto L_0x011d
            android.graphics.drawable.LayerDrawable r7 = r1.mo49568c()
            goto L_0x011f
        L_0x011d:
            tc.g r7 = r1.f43968d
        L_0x011f:
            r1.f43973i = r7
            com.google.android.material.card.MaterialCardView r8 = r1.f43965a
            fc.a r7 = r1.mo49569d(r7)
            r8.setForeground(r7)
            r0.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.card.MaterialCardView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        C16949b bVar = this.f34494i;
        if (bVar.f43978n != colorStateList) {
            bVar.f43978n = colorStateList;
            C19648g gVar = bVar.f43968d;
            gVar.f49837b.f49871k = (float) bVar.f43972h;
            gVar.invalidateSelf();
            gVar.mo52011s(colorStateList);
        }
        invalidate();
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f34494i.f43967c.mo52005n(colorStateList);
    }
}
