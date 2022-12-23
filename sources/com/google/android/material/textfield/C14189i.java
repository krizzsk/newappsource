package com.google.android.material.textfield;

import android.widget.AutoCompleteTextView;

/* renamed from: com.google.android.material.textfield.i */
public final class C14189i implements AutoCompleteTextView.OnDismissListener {

    /* renamed from: a */
    public final /* synthetic */ C14178h f35616a;

    public C14189i(C14178h hVar) {
        this.f35616a = hVar;
    }

    public final void onDismiss() {
        C14178h hVar = this.f35616a;
        hVar.f35596l = true;
        hVar.f35598n = System.currentTimeMillis();
        this.f35616a.mo42608g(false);
    }
}
