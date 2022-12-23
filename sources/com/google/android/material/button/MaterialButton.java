package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.widget.C0801k;
import androidx.customview.view.AbsSavedState;
import ce0.C21100e;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p090g1.C4732a;
import p127j.C5344a;
import p141k1.C5450a;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p355ac.C13401b;
import p355ac.C13410k;
import p763rc.C19250a;
import p763rc.C19252b;
import p811tc.C19654k;
import p811tc.C19666o;

public class MaterialButton extends AppCompatButton implements Checkable, C19666o {

    /* renamed from: o */
    public static final int[] f34433o = {16842911};

    /* renamed from: p */
    public static final int[] f34434p = {16842912};

    /* renamed from: q */
    public static final int f34435q = C13410k.Widget_MaterialComponents_Button;

    /* renamed from: b */
    public final C13935a f34436b;

    /* renamed from: c */
    public final LinkedHashSet<C13928a> f34437c;

    /* renamed from: d */
    public C13929b f34438d;

    /* renamed from: e */
    public PorterDuff.Mode f34439e;

    /* renamed from: f */
    public ColorStateList f34440f;

    /* renamed from: g */
    public Drawable f34441g;

    /* renamed from: h */
    public int f34442h;

    /* renamed from: i */
    public int f34443i;

    /* renamed from: j */
    public int f34444j;

    /* renamed from: k */
    public int f34445k;

    /* renamed from: l */
    public boolean f34446l;

    /* renamed from: m */
    public boolean f34447m;

    /* renamed from: n */
    public int f34448n;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C13927a();

        /* renamed from: b */
        public boolean f34449b;

        /* renamed from: com.google.android.material.button.MaterialButton$SavedState$a */
        public class C13927a implements Parcelable.ClassLoaderCreator<SavedState> {
            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f34449b ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            this.f34449b = parcel.readInt() != 1 ? false : true;
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButton$a */
    public interface C13928a {
        /* renamed from: a */
        void mo41143a();
    }

    /* renamed from: com.google.android.material.button.MaterialButton$b */
    public interface C13929b {
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C13401b.materialButtonStyle);
    }

    private String getA11yClassName() {
        boolean z;
        Class cls;
        C13935a aVar = this.f34436b;
        if (aVar == null || !aVar.f34487q) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            cls = CompoundButton.class;
        } else {
            cls = Button.class;
        }
        return cls.getName();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (textAlignment != 4) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity == 1) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (gravity == 5 || gravity == 8388613) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_NORMAL;
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        return Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
    }

    /* renamed from: a */
    public final boolean mo41082a() {
        C13935a aVar = this.f34436b;
        if (aVar == null || aVar.f34485o) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo41083b() {
        boolean z;
        boolean z2;
        int i = this.f34448n;
        boolean z3 = false;
        if (i == 1 || i == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C0801k.C0803b.m2434e(this, this.f34441g, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        if (i == 3 || i == 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            C0801k.C0803b.m2434e(this, (Drawable) null, (Drawable) null, this.f34441g, (Drawable) null);
            return;
        }
        if (i == 16 || i == 32) {
            z3 = true;
        }
        if (z3) {
            C0801k.C0803b.m2434e(this, (Drawable) null, this.f34441g, (Drawable) null, (Drawable) null);
        }
    }

    /* renamed from: c */
    public final void mo41084c(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        Drawable drawable = this.f34441g;
        boolean z5 = true;
        if (drawable != null) {
            Drawable mutate = C5450a.m13604g(drawable).mutate();
            this.f34441g = mutate;
            C5450a.C5452b.m13617h(mutate, this.f34440f);
            PorterDuff.Mode mode = this.f34439e;
            if (mode != null) {
                C5450a.C5452b.m13618i(this.f34441g, mode);
            }
            int i = this.f34442h;
            if (i == 0) {
                i = this.f34441g.getIntrinsicWidth();
            }
            int i2 = this.f34442h;
            if (i2 == 0) {
                i2 = this.f34441g.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f34441g;
            int i3 = this.f34443i;
            int i4 = this.f34444j;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.f34441g.setVisible(true, z);
        }
        if (z) {
            mo41083b();
            return;
        }
        Drawable[] a = C0801k.C0803b.m2430a(this);
        Drawable drawable3 = a[0];
        Drawable drawable4 = a[1];
        Drawable drawable5 = a[2];
        int i5 = this.f34448n;
        if (i5 == 1 || i5 == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 || drawable3 == this.f34441g) {
            if (i5 == 3 || i5 == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3 || drawable5 == this.f34441g) {
                if (i5 == 16 || i5 == 32) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z4 || drawable4 == this.f34441g) {
                    z5 = false;
                }
            }
        }
        if (z5) {
            mo41083b();
        }
    }

    /* renamed from: d */
    public final void mo41085d(int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.f34441g != null && getLayout() != null) {
            int i3 = this.f34448n;
            boolean z4 = true;
            if (i3 == 1 || i3 == 2) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (i3 == 3 || i3 == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    if (!(i3 == 16 || i3 == 32)) {
                        z4 = false;
                    }
                    if (z4) {
                        this.f34443i = 0;
                        if (i3 == 16) {
                            this.f34444j = 0;
                            mo41084c(false);
                            return;
                        }
                        int i4 = this.f34442h;
                        if (i4 == 0) {
                            i4 = this.f34441g.getIntrinsicHeight();
                        }
                        int textHeight = (((((i2 - getTextHeight()) - getPaddingTop()) - i4) - this.f34445k) - getPaddingBottom()) / 2;
                        if (this.f34444j != textHeight) {
                            this.f34444j = textHeight;
                            mo41084c(false);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            this.f34444j = 0;
            Layout.Alignment actualTextAlignment = getActualTextAlignment();
            int i5 = this.f34448n;
            if (i5 == 1 || i5 == 3 || ((i5 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i5 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
                this.f34443i = 0;
                mo41084c(false);
                return;
            }
            int i6 = this.f34442h;
            if (i6 == 0) {
                i6 = this.f34441g.getIntrinsicWidth();
            }
            int textWidth = i - getTextWidth();
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            int e = (((textWidth - C6333d0.C6338e.m15064e(this)) - i6) - this.f34445k) - C6333d0.C6338e.m15065f(this);
            if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                e /= 2;
            }
            if (C6333d0.C6338e.m15063d(this) == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.f34448n != 4) {
                z4 = false;
            }
            if (z2 != z4) {
                e = -e;
            }
            if (this.f34443i != e) {
                this.f34443i = e;
                mo41084c(false);
            }
        }
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (mo41082a()) {
            return this.f34436b.f34477g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f34441g;
    }

    public int getIconGravity() {
        return this.f34448n;
    }

    public int getIconPadding() {
        return this.f34445k;
    }

    public int getIconSize() {
        return this.f34442h;
    }

    public ColorStateList getIconTint() {
        return this.f34440f;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f34439e;
    }

    public int getInsetBottom() {
        return this.f34436b.f34476f;
    }

    public int getInsetTop() {
        return this.f34436b.f34475e;
    }

    public ColorStateList getRippleColor() {
        if (mo41082a()) {
            return this.f34436b.f34482l;
        }
        return null;
    }

    public C19654k getShapeAppearanceModel() {
        if (mo41082a()) {
            return this.f34436b.f34472b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (mo41082a()) {
            return this.f34436b.f34481k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (mo41082a()) {
            return this.f34436b.f34478h;
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (mo41082a()) {
            return this.f34436b.f34480j;
        }
        return super.getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (mo41082a()) {
            return this.f34436b.f34479i;
        }
        return super.getSupportBackgroundTintMode();
    }

    public final boolean isChecked() {
        return this.f34446l;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (mo41082a()) {
            C21100e.m49299B0(this, this.f34436b.mo41165b(false));
        }
    }

    public final int[] onCreateDrawableState(int i) {
        boolean z;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        C13935a aVar = this.f34436b;
        if (aVar == null || !aVar.f34487q) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            View.mergeDrawableStates(onCreateDrawableState, f34433o);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f34434p);
        }
        return onCreateDrawableState;
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        C13935a aVar = this.f34436b;
        if (aVar == null || !aVar.f34487q) {
            z = false;
        } else {
            z = true;
        }
        accessibilityNodeInfo.setCheckable(z);
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C13935a aVar;
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT == 21 && (aVar = this.f34436b) != null) {
            int i5 = i4 - i2;
            int i6 = i3 - i;
            Drawable drawable = aVar.f34483m;
            if (drawable != null) {
                drawable.setBounds(aVar.f34473c, aVar.f34475e, i6 - aVar.f34474d, i5 - aVar.f34476f);
            }
        }
        mo41085d(getMeasuredWidth(), getMeasuredHeight());
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setChecked(savedState.f34449b);
    }

    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f34449b = this.f34446l;
        return savedState;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        mo41085d(getMeasuredWidth(), getMeasuredHeight());
    }

    public final boolean performClick() {
        toggle();
        return super.performClick();
    }

    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f34441g != null) {
            if (this.f34441g.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i) {
        if (mo41082a()) {
            C13935a aVar = this.f34436b;
            if (aVar.mo41165b(false) != null) {
                aVar.mo41165b(false).setTint(i);
                return;
            }
            return;
        }
        super.setBackgroundColor(i);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (!mo41082a()) {
            super.setBackgroundDrawable(drawable);
        } else if (drawable != getBackground()) {
            C13935a aVar = this.f34436b;
            aVar.f34485o = true;
            aVar.f34471a.setSupportBackgroundTintList(aVar.f34480j);
            aVar.f34471a.setSupportBackgroundTintMode(aVar.f34479i);
            super.setBackgroundDrawable(drawable);
        } else {
            getBackground().setState(drawable.getState());
        }
    }

    public void setBackgroundResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C5344a.m13397a(getContext(), i);
        } else {
            drawable = null;
        }
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (mo41082a()) {
            this.f34436b.f34487q = z;
        }
    }

    public void setChecked(boolean z) {
        boolean z2;
        C13935a aVar = this.f34436b;
        if (aVar == null || !aVar.f34487q) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2 && isEnabled() && this.f34446l != z) {
            this.f34446l = z;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z3 = this.f34446l;
                if (!materialButtonToggleGroup.f34456g) {
                    materialButtonToggleGroup.mo41146b(getId(), z3);
                }
            }
            if (!this.f34447m) {
                this.f34447m = true;
                Iterator<C13928a> it = this.f34437c.iterator();
                while (it.hasNext()) {
                    it.next().mo41143a();
                }
                this.f34447m = false;
            }
        }
    }

    public void setCornerRadius(int i) {
        if (mo41082a()) {
            C13935a aVar = this.f34436b;
            if (!aVar.f34486p || aVar.f34477g != i) {
                aVar.f34477g = i;
                aVar.f34486p = true;
                aVar.mo41166c(aVar.f34472b.mo52021g((float) i));
            }
        }
    }

    public void setCornerRadiusResource(int i) {
        if (mo41082a()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        if (mo41082a()) {
            this.f34436b.mo41165b(false).mo52003m(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f34441g != drawable) {
            this.f34441g = drawable;
            mo41084c(true);
            mo41085d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.f34448n != i) {
            this.f34448n = i;
            mo41085d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.f34445k != i) {
            this.f34445k = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C5344a.m13397a(getContext(), i);
        } else {
            drawable = null;
        }
        setIcon(drawable);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.f34442h != i) {
            this.f34442h = i;
            mo41084c(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f34440f != colorStateList) {
            this.f34440f = colorStateList;
            mo41084c(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f34439e != mode) {
            this.f34439e = mode;
            mo41084c(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(C4732a.getColorStateList(getContext(), i));
    }

    public void setInsetBottom(int i) {
        C13935a aVar = this.f34436b;
        aVar.mo41167d(aVar.f34475e, i);
    }

    public void setInsetTop(int i) {
        C13935a aVar = this.f34436b;
        aVar.mo41167d(i, aVar.f34476f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(C13929b bVar) {
        this.f34438d = bVar;
    }

    public void setPressed(boolean z) {
        C13929b bVar = this.f34438d;
        if (bVar != null) {
            MaterialButtonToggleGroup.this.invalidate();
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (mo41082a()) {
            C13935a aVar = this.f34436b;
            if (aVar.f34482l != colorStateList) {
                aVar.f34482l = colorStateList;
                boolean z = C13935a.f34469t;
                if (z && (aVar.f34471a.getBackground() instanceof RippleDrawable)) {
                    ((RippleDrawable) aVar.f34471a.getBackground()).setColor(C19252b.m46506c(colorStateList));
                } else if (!z && (aVar.f34471a.getBackground() instanceof C19250a)) {
                    ((C19250a) aVar.f34471a.getBackground()).setTintList(C19252b.m46506c(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (mo41082a()) {
            setRippleColor(C4732a.getColorStateList(getContext(), i));
        }
    }

    public void setShapeAppearanceModel(C19654k kVar) {
        if (mo41082a()) {
            this.f34436b.mo41166c(kVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (mo41082a()) {
            C13935a aVar = this.f34436b;
            aVar.f34484n = z;
            aVar.mo41169f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (mo41082a()) {
            C13935a aVar = this.f34436b;
            if (aVar.f34481k != colorStateList) {
                aVar.f34481k = colorStateList;
                aVar.mo41169f();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (mo41082a()) {
            setStrokeColor(C4732a.getColorStateList(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (mo41082a()) {
            C13935a aVar = this.f34436b;
            if (aVar.f34478h != i) {
                aVar.f34478h = i;
                aVar.mo41169f();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (mo41082a()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (mo41082a()) {
            C13935a aVar = this.f34436b;
            if (aVar.f34480j != colorStateList) {
                aVar.f34480j = colorStateList;
                if (aVar.mo41165b(false) != null) {
                    C5450a.C5452b.m13617h(aVar.mo41165b(false), aVar.f34480j);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (mo41082a()) {
            C13935a aVar = this.f34436b;
            if (aVar.f34479i != mode) {
                aVar.f34479i = mode;
                if (aVar.mo41165b(false) != null && aVar.f34479i != null) {
                    C5450a.C5452b.m13618i(aVar.mo41165b(false), aVar.f34479i);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        mo41085d(getMeasuredWidth(), getMeasuredHeight());
    }

    public final void toggle() {
        setChecked(!this.f34446l);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialButton(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r6 = f34435q
            android.content.Context r9 = p883wc.C20289a.m47861a(r9, r10, r11, r6)
            r8.<init>(r9, r10, r11)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.f34437c = r9
            r9 = 0
            r8.f34446l = r9
            r8.f34447m = r9
            android.content.Context r7 = r8.getContext()
            int[] r2 = p355ac.C13411l.MaterialButton
            int[] r5 = new int[r9]
            r0 = r7
            r1 = r10
            r3 = r11
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.C14077m.m35060d(r0, r1, r2, r3, r4, r5)
            int r1 = p355ac.C13411l.MaterialButton_iconPadding
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f34445k = r1
            int r1 = p355ac.C13411l.MaterialButton_iconTintMode
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r1 = com.google.android.material.internal.C14083r.m35069e(r1, r3)
            r8.f34439e = r1
            android.content.Context r1 = r8.getContext()
            int r3 = p355ac.C13411l.MaterialButton_iconTint
            android.content.res.ColorStateList r1 = p742qc.C19099c.m46247a(r1, r0, r3)
            r8.f34440f = r1
            android.content.Context r1 = r8.getContext()
            int r3 = p355ac.C13411l.MaterialButton_icon
            android.graphics.drawable.Drawable r1 = p742qc.C19099c.m46250d(r1, r0, r3)
            r8.f34441g = r1
            int r1 = p355ac.C13411l.MaterialButton_iconGravity
            r3 = 1
            int r1 = r0.getInteger(r1, r3)
            r8.f34448n = r1
            int r1 = p355ac.C13411l.MaterialButton_iconSize
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f34442h = r1
            tc.k$a r10 = p811tc.C19654k.m47124c(r7, r10, r11, r6)
            tc.k r11 = new tc.k
            r11.<init>(r10)
            com.google.android.material.button.a r10 = new com.google.android.material.button.a
            r10.<init>(r8, r11)
            r8.f34436b = r10
            int r11 = p355ac.C13411l.MaterialButton_android_insetLeft
            int r11 = r0.getDimensionPixelOffset(r11, r9)
            r10.f34473c = r11
            int r11 = p355ac.C13411l.MaterialButton_android_insetRight
            int r11 = r0.getDimensionPixelOffset(r11, r9)
            r10.f34474d = r11
            int r11 = p355ac.C13411l.MaterialButton_android_insetTop
            int r11 = r0.getDimensionPixelOffset(r11, r9)
            r10.f34475e = r11
            int r11 = p355ac.C13411l.MaterialButton_android_insetBottom
            int r11 = r0.getDimensionPixelOffset(r11, r9)
            r10.f34476f = r11
            int r11 = p355ac.C13411l.MaterialButton_cornerRadius
            boolean r1 = r0.hasValue(r11)
            if (r1 == 0) goto L_0x00af
            int r11 = r0.getDimensionPixelSize(r11, r2)
            r10.f34477g = r11
            tc.k r1 = r10.f34472b
            float r11 = (float) r11
            tc.k r11 = r1.mo52021g(r11)
            r10.mo41166c(r11)
            r10.f34486p = r3
        L_0x00af:
            int r11 = p355ac.C13411l.MaterialButton_strokeWidth
            int r11 = r0.getDimensionPixelSize(r11, r9)
            r10.f34478h = r11
            int r11 = p355ac.C13411l.MaterialButton_backgroundTintMode
            int r11 = r0.getInt(r11, r2)
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r11 = com.google.android.material.internal.C14083r.m35069e(r11, r1)
            r10.f34479i = r11
            android.content.Context r11 = r8.getContext()
            int r1 = p355ac.C13411l.MaterialButton_backgroundTint
            android.content.res.ColorStateList r11 = p742qc.C19099c.m46247a(r11, r0, r1)
            r10.f34480j = r11
            android.content.Context r11 = r8.getContext()
            int r1 = p355ac.C13411l.MaterialButton_strokeColor
            android.content.res.ColorStateList r11 = p742qc.C19099c.m46247a(r11, r0, r1)
            r10.f34481k = r11
            android.content.Context r11 = r8.getContext()
            int r1 = p355ac.C13411l.MaterialButton_rippleColor
            android.content.res.ColorStateList r11 = p742qc.C19099c.m46247a(r11, r0, r1)
            r10.f34482l = r11
            int r11 = p355ac.C13411l.MaterialButton_android_checkable
            boolean r11 = r0.getBoolean(r11, r9)
            r10.f34487q = r11
            int r11 = p355ac.C13411l.MaterialButton_elevation
            int r11 = r0.getDimensionPixelSize(r11, r9)
            r10.f34489s = r11
            java.util.WeakHashMap<android.view.View, s1.p0> r11 = p242s1.C6333d0.f19990a
            int r11 = p242s1.C6333d0.C6338e.m15065f(r8)
            int r1 = r8.getPaddingTop()
            int r2 = p242s1.C6333d0.C6338e.m15064e(r8)
            int r4 = r8.getPaddingBottom()
            int r5 = p355ac.C13411l.MaterialButton_android_background
            boolean r5 = r0.hasValue(r5)
            if (r5 == 0) goto L_0x0120
            r10.f34485o = r3
            android.content.res.ColorStateList r5 = r10.f34480j
            r8.setSupportBackgroundTintList(r5)
            android.graphics.PorterDuff$Mode r5 = r10.f34479i
            r8.setSupportBackgroundTintMode(r5)
            goto L_0x0123
        L_0x0120:
            r10.mo41168e()
        L_0x0123:
            int r5 = r10.f34473c
            int r11 = r11 + r5
            int r5 = r10.f34475e
            int r1 = r1 + r5
            int r5 = r10.f34474d
            int r2 = r2 + r5
            int r10 = r10.f34476f
            int r4 = r4 + r10
            p242s1.C6333d0.C6338e.m15070k(r8, r11, r1, r2, r4)
            r0.recycle()
            int r10 = r8.f34445k
            r8.setCompoundDrawablePadding(r10)
            android.graphics.drawable.Drawable r10 = r8.f34441g
            if (r10 == 0) goto L_0x013f
            r9 = 1
        L_0x013f:
            r8.mo41084c(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
