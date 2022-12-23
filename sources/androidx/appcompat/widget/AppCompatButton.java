package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.core.widget.C0785b;
import androidx.core.widget.C0801k;
import androidx.core.widget.C0812p;
import p114i.C5215a;

public class AppCompatButton extends Button implements C0785b, C0812p {
    private C0414i mAppCompatEmojiTextHelper;
    private final C0392d mBackgroundTintHelper;
    private final C0468w mTextHelper;

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5215a.buttonStyle);
    }

    private C0414i getEmojiTextViewHelper() {
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new C0414i(this);
        }
        return this.mAppCompatEmojiTextHelper;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0392d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.mo2054a();
        }
        C0468w wVar = this.mTextHelper;
        if (wVar != null) {
            wVar.mo2188b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (C0785b.f3418V) {
            return super.getAutoSizeMaxTextSize();
        }
        C0468w wVar = this.mTextHelper;
        if (wVar != null) {
            return Math.round(wVar.f1640i.f1485e);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (C0785b.f3418V) {
            return super.getAutoSizeMinTextSize();
        }
        C0468w wVar = this.mTextHelper;
        if (wVar != null) {
            return Math.round(wVar.f1640i.f1484d);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (C0785b.f3418V) {
            return super.getAutoSizeStepGranularity();
        }
        C0468w wVar = this.mTextHelper;
        if (wVar != null) {
            return Math.round(wVar.f1640i.f1483c);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (C0785b.f3418V) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0468w wVar = this.mTextHelper;
        if (wVar != null) {
            return wVar.f1640i.f1486f;
        }
        return new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (!C0785b.f3418V) {
            C0468w wVar = this.mTextHelper;
            if (wVar != null) {
                return wVar.f1640i.f1481a;
            }
            return 0;
        } else if (super.getAutoSizeTextType() == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C0801k.m2425g(super.getCustomSelectionActionModeCallback());
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

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.mo2189d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.mo2190e();
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0468w wVar = this.mTextHelper;
        if (wVar != null && !C0785b.f3418V) {
            wVar.f1640i.mo2066a();
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        super.onTextChanged(charSequence, i, i2, i3);
        C0468w wVar = this.mTextHelper;
        if (wVar != null && !C0785b.f3418V) {
            C0396e0 e0Var = wVar.f1640i;
            if (!e0Var.mo2071h() || e0Var.f1481a == 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                this.mTextHelper.f1640i.mo2066a();
            }
        }
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().mo2102c(z);
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (C0785b.f3418V) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0468w wVar = this.mTextHelper;
        if (wVar != null) {
            wVar.mo2193i(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws IllegalArgumentException {
        if (C0785b.f3418V) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0468w wVar = this.mTextHelper;
        if (wVar != null) {
            wVar.mo2194j(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C0785b.f3418V) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0468w wVar = this.mTextHelper;
        if (wVar != null) {
            wVar.mo2195k(i);
        }
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

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0801k.m2426h(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().mo2103d(z);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().mo2100a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        C0468w wVar = this.mTextHelper;
        if (wVar != null) {
            wVar.f1632a.setAllCaps(z);
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

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.mo2196l(colorStateList);
        this.mTextHelper.mo2188b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.mo2197m(mode);
        this.mTextHelper.mo2188b();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0468w wVar = this.mTextHelper;
        if (wVar != null) {
            wVar.mo2192g(i, context);
        }
    }

    public void setTextSize(int i, float f) {
        boolean z;
        boolean z2 = C0785b.f3418V;
        if (z2) {
            super.setTextSize(i, f);
            return;
        }
        C0468w wVar = this.mTextHelper;
        if (wVar != null && !z2) {
            C0396e0 e0Var = wVar.f1640i;
            if (!e0Var.mo2071h() || e0Var.f1481a == 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                wVar.f1640i.mo2068e(f, i);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0403e1.m1011a(context);
        C0391c1.m972a(getContext(), this);
        C0392d dVar = new C0392d(this);
        this.mBackgroundTintHelper = dVar;
        dVar.mo2057d(attributeSet, i);
        C0468w wVar = new C0468w(this);
        this.mTextHelper = wVar;
        wVar.mo2191f(attributeSet, i);
        wVar.mo2188b();
        getEmojiTextViewHelper().mo2101b(attributeSet, i);
    }
}
