package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import androidx.core.widget.C0812p;
import p114i.C5215a;
import p127j.C5344a;

public class AppCompatRadioButton extends RadioButton implements C0812p {

    /* renamed from: b */
    public final C0404f f1157b;

    /* renamed from: c */
    public final C0392d f1158c;

    /* renamed from: d */
    public final C0468w f1159d;

    /* renamed from: e */
    public C0414i f1160e;

    public AppCompatRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5215a.radioButtonStyle);
    }

    private C0414i getEmojiTextViewHelper() {
        if (this.f1160e == null) {
            this.f1160e = new C0414i(this);
        }
        return this.f1160e;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0392d dVar = this.f1158c;
        if (dVar != null) {
            dVar.mo2054a();
        }
        C0468w wVar = this.f1159d;
        if (wVar != null) {
            wVar.mo2188b();
        }
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0404f fVar = this.f1157b;
        if (fVar != null) {
            fVar.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0392d dVar = this.f1158c;
        if (dVar != null) {
            return dVar.mo2055b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0392d dVar = this.f1158c;
        if (dVar != null) {
            return dVar.mo2056c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        C0404f fVar = this.f1157b;
        if (fVar != null) {
            return fVar.f1494b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0404f fVar = this.f1157b;
        if (fVar != null) {
            return fVar.f1495c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1159d.mo2189d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1159d.mo2190e();
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().mo2102c(z);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0392d dVar = this.f1158c;
        if (dVar != null) {
            dVar.mo2058e();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0392d dVar = this.f1158c;
        if (dVar != null) {
            dVar.mo2059f(i);
        }
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0404f fVar = this.f1157b;
        if (fVar == null) {
            return;
        }
        if (fVar.f1498f) {
            fVar.f1498f = false;
            return;
        }
        fVar.f1498f = true;
        fVar.mo2075a();
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0468w wVar = this.f1159d;
        if (wVar != null) {
            wVar.mo2188b();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0468w wVar = this.f1159d;
        if (wVar != null) {
            wVar.mo2188b();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().mo2103d(z);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().mo2100a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0392d dVar = this.f1158c;
        if (dVar != null) {
            dVar.mo2061h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0392d dVar = this.f1158c;
        if (dVar != null) {
            dVar.mo2062i(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0404f fVar = this.f1157b;
        if (fVar != null) {
            fVar.f1494b = colorStateList;
            fVar.f1496d = true;
            fVar.mo2075a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0404f fVar = this.f1157b;
        if (fVar != null) {
            fVar.f1495c = mode;
            fVar.f1497e = true;
            fVar.mo2075a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1159d.mo2196l(colorStateList);
        this.f1159d.mo2188b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1159d.mo2197m(mode);
        this.f1159d.mo2188b();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppCompatRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0403e1.m1011a(context);
        C0391c1.m972a(getContext(), this);
        C0404f fVar = new C0404f(this);
        this.f1157b = fVar;
        fVar.mo2076b(attributeSet, i);
        C0392d dVar = new C0392d(this);
        this.f1158c = dVar;
        dVar.mo2057d(attributeSet, i);
        C0468w wVar = new C0468w(this);
        this.f1159d = wVar;
        wVar.mo2191f(attributeSet, i);
        getEmojiTextViewHelper().mo2101b(attributeSet, i);
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(C5344a.m13397a(getContext(), i));
    }
}
