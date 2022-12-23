package com.google.android.material.textfield;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;

/* renamed from: com.google.android.material.textfield.m */
public abstract class C14193m {

    /* renamed from: a */
    public TextInputLayout f35621a;

    /* renamed from: b */
    public Context f35622b;

    /* renamed from: c */
    public CheckableImageButton f35623c;

    /* renamed from: d */
    public final int f35624d;

    public C14193m(TextInputLayout textInputLayout, int i) {
        this.f35621a = textInputLayout;
        this.f35622b = textInputLayout.getContext();
        this.f35623c = textInputLayout.getEndIconView();
        this.f35624d = i;
    }

    /* renamed from: a */
    public abstract void mo42590a();

    /* renamed from: b */
    public boolean mo42605b(int i) {
        return true;
    }

    /* renamed from: c */
    public void mo42591c(boolean z) {
    }
}
