package com.google.android.material.snackbar;

import android.view.View;

/* renamed from: com.google.android.material.snackbar.h */
public final class C14131h implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ View.OnClickListener f35351b;

    /* renamed from: c */
    public final /* synthetic */ Snackbar f35352c;

    public C14131h(Snackbar snackbar, View.OnClickListener onClickListener) {
        this.f35352c = snackbar;
        this.f35351b = onClickListener;
    }

    public final void onClick(View view) {
        this.f35351b.onClick(view);
        this.f35352c.mo42226c(1);
    }
}
