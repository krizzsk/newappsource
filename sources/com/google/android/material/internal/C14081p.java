package com.google.android.material.internal;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* renamed from: com.google.android.material.internal.p */
public final class C14081p implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ View f35109b;

    public C14081p(EditText editText) {
        this.f35109b = editText;
    }

    public final void run() {
        ((InputMethodManager) this.f35109b.getContext().getSystemService("input_method")).showSoftInput(this.f35109b, 1);
    }
}
