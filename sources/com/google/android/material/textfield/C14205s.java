package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0413h1;
import androidx.core.widget.C0801k;
import com.google.android.material.internal.C14083r;
import com.google.android.material.internal.CheckableImageButton;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6362h;
import p242s1.C6382p0;
import p355ac.C13403d;
import p355ac.C13405f;
import p355ac.C13407h;
import p355ac.C13411l;
import p742qc.C19099c;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.google.android.material.textfield.s */
public final class C14205s extends LinearLayout {

    /* renamed from: b */
    public final TextInputLayout f35661b;

    /* renamed from: c */
    public final AppCompatTextView f35662c;

    /* renamed from: d */
    public CharSequence f35663d;

    /* renamed from: e */
    public final CheckableImageButton f35664e;

    /* renamed from: f */
    public ColorStateList f35665f;

    /* renamed from: g */
    public PorterDuff.Mode f35666g;

    /* renamed from: h */
    public View.OnLongClickListener f35667h;

    /* renamed from: i */
    public boolean f35668i;

    public C14205s(TextInputLayout textInputLayout, C0413h1 h1Var) {
        super(textInputLayout.getContext());
        CharSequence k;
        this.f35661b = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(C13407h.design_text_input_start_icon, this, false);
        this.f35664e = checkableImageButton;
        CharSequence charSequence = null;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null);
        this.f35662c = appCompatTextView;
        if (C19099c.m46251e(getContext())) {
            C6362h.m15171g((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        View.OnLongClickListener onLongClickListener = this.f35667h;
        checkableImageButton.setOnClickListener((View.OnClickListener) null);
        C14194n.m35277c(checkableImageButton, onLongClickListener);
        this.f35667h = null;
        checkableImageButton.setOnLongClickListener((View.OnLongClickListener) null);
        C14194n.m35277c(checkableImageButton, (View.OnLongClickListener) null);
        int i = C13411l.TextInputLayout_startIconTint;
        if (h1Var.mo2098l(i)) {
            this.f35665f = C19099c.m46248b(getContext(), h1Var, i);
        }
        int i2 = C13411l.TextInputLayout_startIconTintMode;
        if (h1Var.mo2098l(i2)) {
            this.f35666g = C14083r.m35069e(h1Var.mo2094h(i2, -1), (PorterDuff.Mode) null);
        }
        int i3 = C13411l.TextInputLayout_startIconDrawable;
        if (h1Var.mo2098l(i3)) {
            mo42635a(h1Var.mo2091e(i3));
            int i4 = C13411l.TextInputLayout_startIconContentDescription;
            if (h1Var.mo2098l(i4) && checkableImageButton.getContentDescription() != (k = h1Var.mo2097k(i4))) {
                checkableImageButton.setContentDescription(k);
            }
            checkableImageButton.setCheckable(h1Var.mo2087a(C13411l.TextInputLayout_startIconCheckable, true));
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(C13405f.textinput_prefix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        C6333d0.C6340g.m15079f(appCompatTextView, 1);
        C0801k.m2424f(appCompatTextView, h1Var.mo2095i(C13411l.TextInputLayout_prefixTextAppearance, 0));
        int i5 = C13411l.TextInputLayout_prefixTextColor;
        if (h1Var.mo2098l(i5)) {
            appCompatTextView.setTextColor(h1Var.mo2088b(i5));
        }
        CharSequence k2 = h1Var.mo2097k(C13411l.TextInputLayout_prefixText);
        this.f35663d = !TextUtils.isEmpty(k2) ? k2 : charSequence;
        appCompatTextView.setText(k2);
        mo42638d();
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    /* renamed from: a */
    public final void mo42635a(Drawable drawable) {
        this.f35664e.setImageDrawable(drawable);
        if (drawable != null) {
            C14194n.m35275a(this.f35661b, this.f35664e, this.f35665f, this.f35666g);
            mo42636b(true);
            C14194n.m35276b(this.f35661b, this.f35664e, this.f35665f);
            return;
        }
        mo42636b(false);
        CheckableImageButton checkableImageButton = this.f35664e;
        View.OnLongClickListener onLongClickListener = this.f35667h;
        checkableImageButton.setOnClickListener((View.OnClickListener) null);
        C14194n.m35277c(checkableImageButton, onLongClickListener);
        this.f35667h = null;
        CheckableImageButton checkableImageButton2 = this.f35664e;
        checkableImageButton2.setOnLongClickListener((View.OnLongClickListener) null);
        C14194n.m35277c(checkableImageButton2, (View.OnLongClickListener) null);
        if (this.f35664e.getContentDescription() != null) {
            this.f35664e.setContentDescription((CharSequence) null);
        }
    }

    /* renamed from: b */
    public final void mo42636b(boolean z) {
        boolean z2;
        int i = 0;
        if (this.f35664e.getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 != z) {
            CheckableImageButton checkableImageButton = this.f35664e;
            if (!z) {
                i = 8;
            }
            checkableImageButton.setVisibility(i);
            mo42637c();
            mo42638d();
        }
    }

    /* renamed from: c */
    public final void mo42637c() {
        boolean z;
        EditText editText = this.f35661b.f35525f;
        if (editText != null) {
            int i = 0;
            if (this.f35664e.getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                i = C6333d0.C6338e.m15065f(editText);
            }
            AppCompatTextView appCompatTextView = this.f35662c;
            int compoundPaddingTop = editText.getCompoundPaddingTop();
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(C13403d.material_input_text_to_prefix_suffix_padding);
            int compoundPaddingBottom = editText.getCompoundPaddingBottom();
            WeakHashMap<View, C6382p0> weakHashMap2 = C6333d0.f19990a;
            C6333d0.C6338e.m15070k(appCompatTextView, i, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
        }
    }

    /* renamed from: d */
    public final void mo42638d() {
        int i;
        boolean z;
        int i2 = 8;
        if (this.f35663d == null || this.f35668i) {
            i = 8;
        } else {
            i = 0;
        }
        if (this.f35664e.getVisibility() == 0 || i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i2 = 0;
        }
        setVisibility(i2);
        this.f35662c.setVisibility(i);
        this.f35661b.mo42480q();
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        mo42637c();
    }
}
