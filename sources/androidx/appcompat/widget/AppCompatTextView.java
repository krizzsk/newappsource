package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.appcompat.widget.C0465v;
import androidx.core.widget.C0785b;
import androidx.core.widget.C0801k;
import androidx.core.widget.C0812p;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import mf0.C24361g;
import p127j.C5344a;
import p129j1.C5355e;
import p129j1.C5363l;
import p172m9.C5720b;
import p216q1.C6135c;

public class AppCompatTextView extends TextView implements C0812p, C0785b {

    /* renamed from: b */
    public final C0392d f1189b;

    /* renamed from: c */
    public final C0468w f1190c;

    /* renamed from: d */
    public final C0465v f1191d;

    /* renamed from: e */
    public C0414i f1192e;

    /* renamed from: f */
    public boolean f1193f;

    /* renamed from: g */
    public Future<C6135c> f1194g;

    public AppCompatTextView() {
        throw null;
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    private C0414i getEmojiTextViewHelper() {
        if (this.f1192e == null) {
            this.f1192e = new C0414i(this);
        }
        return this.f1192e;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0392d dVar = this.f1189b;
        if (dVar != null) {
            dVar.mo2054a();
        }
        C0468w wVar = this.f1190c;
        if (wVar != null) {
            wVar.mo2188b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (C0785b.f3418V) {
            return super.getAutoSizeMaxTextSize();
        }
        C0468w wVar = this.f1190c;
        if (wVar != null) {
            return Math.round(wVar.f1640i.f1485e);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (C0785b.f3418V) {
            return super.getAutoSizeMinTextSize();
        }
        C0468w wVar = this.f1190c;
        if (wVar != null) {
            return Math.round(wVar.f1640i.f1484d);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (C0785b.f3418V) {
            return super.getAutoSizeStepGranularity();
        }
        C0468w wVar = this.f1190c;
        if (wVar != null) {
            return Math.round(wVar.f1640i.f1483c);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (C0785b.f3418V) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0468w wVar = this.f1190c;
        if (wVar != null) {
            return wVar.f1640i.f1486f;
        }
        return new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (!C0785b.f3418V) {
            C0468w wVar = this.f1190c;
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

    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0392d dVar = this.f1189b;
        if (dVar != null) {
            return dVar.mo2055b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0392d dVar = this.f1189b;
        if (dVar != null) {
            return dVar.mo2056c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1190c.mo2189d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1190c.mo2190e();
    }

    public CharSequence getText() {
        Future<C6135c> future = this.f1194g;
        if (future != null) {
            try {
                this.f1194g = null;
                C0801k.m2423e(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    public TextClassifier getTextClassifier() {
        C0465v vVar;
        if (Build.VERSION.SDK_INT >= 28 || (vVar = this.f1191d) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = vVar.f1630b;
        if (textClassifier == null) {
            return C0465v.C0466a.m1285a(vVar.f1629a);
        }
        return textClassifier;
    }

    public C6135c.C6136a getTextMetricsParamsCompat() {
        return C0801k.m2419a(this);
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1190c.getClass();
        C0468w.m1287h(this, onCreateInputConnection, editorInfo);
        C5720b.m14035C(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0468w wVar = this.f1190c;
        if (wVar != null && !C0785b.f3418V) {
            wVar.f1640i.mo2066a();
        }
    }

    public void onMeasure(int i, int i2) {
        Future<C6135c> future = this.f1194g;
        if (future != null) {
            try {
                this.f1194g = null;
                C0801k.m2423e(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        super.onTextChanged(charSequence, i, i2, i3);
        C0468w wVar = this.f1190c;
        if (wVar != null && !C0785b.f3418V) {
            C0396e0 e0Var = wVar.f1640i;
            if (!e0Var.mo2071h() || e0Var.f1481a == 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                this.f1190c.f1640i.mo2066a();
            }
        }
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().mo2102c(z);
    }

    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (C0785b.f3418V) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0468w wVar = this.f1190c;
        if (wVar != null) {
            wVar.mo2193i(i, i2, i3, i4);
        }
    }

    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws IllegalArgumentException {
        if (C0785b.f3418V) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0468w wVar = this.f1190c;
        if (wVar != null) {
            wVar.mo2194j(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C0785b.f3418V) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0468w wVar = this.f1190c;
        if (wVar != null) {
            wVar.mo2195k(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0392d dVar = this.f1189b;
        if (dVar != null) {
            dVar.mo2058e();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0392d dVar = this.f1189b;
        if (dVar != null) {
            dVar.mo2059f(i);
        }
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0468w wVar = this.f1190c;
        if (wVar != null) {
            wVar.mo2188b();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0468w wVar = this.f1190c;
        if (wVar != null) {
            wVar.mo2188b();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0468w wVar = this.f1190c;
        if (wVar != null) {
            wVar.mo2188b();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0468w wVar = this.f1190c;
        if (wVar != null) {
            wVar.mo2188b();
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

    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            C0801k.m2421c(this, i);
        }
    }

    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            C0801k.m2422d(this, i);
        }
    }

    public void setLineHeight(int i) {
        C24361g.m61181q(i);
        int fontMetricsInt = getPaint().getFontMetricsInt((Paint.FontMetricsInt) null);
        if (i != fontMetricsInt) {
            setLineSpacing((float) (i - fontMetricsInt), 1.0f);
        }
    }

    public void setPrecomputedText(C6135c cVar) {
        C0801k.m2423e(this, cVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0392d dVar = this.f1189b;
        if (dVar != null) {
            dVar.mo2061h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0392d dVar = this.f1189b;
        if (dVar != null) {
            dVar.mo2062i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1190c.mo2196l(colorStateList);
        this.f1190c.mo2188b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1190c.mo2197m(mode);
        this.f1190c.mo2188b();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0468w wVar = this.f1190c;
        if (wVar != null) {
            wVar.mo2192g(i, context);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        C0465v vVar;
        if (Build.VERSION.SDK_INT >= 28 || (vVar = this.f1191d) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            vVar.f1630b = textClassifier;
        }
    }

    public void setTextFuture(Future<C6135c> future) {
        this.f1194g = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C6135c.C6136a aVar) {
        int i = Build.VERSION.SDK_INT;
        TextDirectionHeuristic textDirectionHeuristic = aVar.f19498b;
        int i2 = 1;
        if (!(textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
                i2 = 2;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
                i2 = 3;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
                i2 = 4;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
                i2 = 5;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                i2 = 6;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
                i2 = 7;
            }
        }
        C0801k.C0803b.m2437h(this, i2);
        if (i < 23) {
            float textScaleX = aVar.f19497a.getTextScaleX();
            getPaint().set(aVar.f19497a);
            if (textScaleX == getTextScaleX()) {
                setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            setTextScaleX(textScaleX);
            return;
        }
        getPaint().set(aVar.f19497a);
        C0801k.C0804c.m2442e(this, aVar.f19499c);
        C0801k.C0804c.m2445h(this, aVar.f19500d);
    }

    public final void setTextSize(int i, float f) {
        boolean z;
        boolean z2 = C0785b.f3418V;
        if (z2) {
            super.setTextSize(i, f);
            return;
        }
        C0468w wVar = this.f1190c;
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

    public final void setTypeface(Typeface typeface, int i) {
        if (!this.f1193f) {
            Typeface typeface2 = null;
            if (typeface != null && i > 0) {
                Context context = getContext();
                C5363l lVar = C5355e.f17653a;
                if (context != null) {
                    typeface2 = Typeface.create(typeface, i);
                } else {
                    throw new IllegalArgumentException("Context cannot be null");
                }
            }
            this.f1193f = true;
            if (typeface2 != null) {
                typeface = typeface2;
            }
            try {
                super.setTypeface(typeface, i);
            } finally {
                this.f1193f = false;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0403e1.m1011a(context);
        this.f1193f = false;
        C0391c1.m972a(getContext(), this);
        C0392d dVar = new C0392d(this);
        this.f1189b = dVar;
        dVar.mo2057d(attributeSet, i);
        C0468w wVar = new C0468w(this);
        this.f1190c = wVar;
        wVar.mo2191f(attributeSet, i);
        wVar.mo2188b();
        this.f1191d = new C0465v(this);
        getEmojiTextViewHelper().mo2101b(attributeSet, i);
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable a = i != 0 ? C5344a.m13397a(context, i) : null;
        Drawable a2 = i2 != 0 ? C5344a.m13397a(context, i2) : null;
        Drawable a3 = i3 != 0 ? C5344a.m13397a(context, i3) : null;
        if (i4 != 0) {
            drawable = C5344a.m13397a(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(a, a2, a3, drawable);
        C0468w wVar = this.f1190c;
        if (wVar != null) {
            wVar.mo2188b();
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable a = i != 0 ? C5344a.m13397a(context, i) : null;
        Drawable a2 = i2 != 0 ? C5344a.m13397a(context, i2) : null;
        Drawable a3 = i3 != 0 ? C5344a.m13397a(context, i3) : null;
        if (i4 != 0) {
            drawable = C5344a.m13397a(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(a, a2, a3, drawable);
        C0468w wVar = this.f1190c;
        if (wVar != null) {
            wVar.mo2188b();
        }
    }
}
