package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;
import androidx.core.widget.C0812p;
import p114i.C5215a;
import p127j.C5344a;
import p172m9.C5720b;

public class AppCompatMultiAutoCompleteTextView extends MultiAutoCompleteTextView implements C0812p {

    /* renamed from: e */
    public static final int[] f1153e = {16843126};

    /* renamed from: b */
    public final C0392d f1154b;

    /* renamed from: c */
    public final C0468w f1155c;

    /* renamed from: d */
    public final C0411h f1156d;

    public AppCompatMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5215a.autoCompleteTextViewStyle);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0392d dVar = this.f1154b;
        if (dVar != null) {
            dVar.mo2054a();
        }
        C0468w wVar = this.f1155c;
        if (wVar != null) {
            wVar.mo2188b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0392d dVar = this.f1154b;
        if (dVar != null) {
            return dVar.mo2055b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0392d dVar = this.f1154b;
        if (dVar != null) {
            return dVar.mo2056c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1155c.mo2189d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1155c.mo2190e();
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C5720b.m14035C(this, editorInfo, onCreateInputConnection);
        return this.f1156d.mo2084f(onCreateInputConnection, editorInfo);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0392d dVar = this.f1154b;
        if (dVar != null) {
            dVar.mo2058e();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0392d dVar = this.f1154b;
        if (dVar != null) {
            dVar.mo2059f(i);
        }
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0468w wVar = this.f1155c;
        if (wVar != null) {
            wVar.mo2188b();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0468w wVar = this.f1155c;
        if (wVar != null) {
            wVar.mo2188b();
        }
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C5344a.m13397a(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f1156d.mo2085g(z);
    }

    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f1156d.mo2082d(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0392d dVar = this.f1154b;
        if (dVar != null) {
            dVar.mo2061h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0392d dVar = this.f1154b;
        if (dVar != null) {
            dVar.mo2062i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1155c.mo2196l(colorStateList);
        this.f1155c.mo2188b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1155c.mo2197m(mode);
        this.f1155c.mo2188b();
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0468w wVar = this.f1155c;
        if (wVar != null) {
            wVar.mo2192g(i, context);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppCompatMultiAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0403e1.m1011a(context);
        C0391c1.m972a(getContext(), this);
        C0413h1 m = C0413h1.m1063m(getContext(), attributeSet, f1153e, i);
        if (m.mo2098l(0)) {
            setDropDownBackgroundDrawable(m.mo2091e(0));
        }
        m.mo2099n();
        C0392d dVar = new C0392d(this);
        this.f1154b = dVar;
        dVar.mo2057d(attributeSet, i);
        C0468w wVar = new C0468w(this);
        this.f1155c = wVar;
        wVar.mo2191f(attributeSet, i);
        wVar.mo2188b();
        C0411h hVar = new C0411h((EditText) this);
        this.f1156d = hVar;
        hVar.mo2083e(attributeSet, i);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener d = hVar.mo2082d(keyListener);
            if (d != keyListener) {
                super.setKeyListener(d);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }
}
