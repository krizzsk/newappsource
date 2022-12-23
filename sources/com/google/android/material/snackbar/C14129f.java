package com.google.android.material.snackbar;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* renamed from: com.google.android.material.snackbar.f */
public final class C14129f implements SwipeDismissBehavior.C13899b {

    /* renamed from: a */
    public final /* synthetic */ BaseTransientBottomBar f35349a;

    public C14129f(BaseTransientBottomBar baseTransientBottomBar) {
        this.f35349a = baseTransientBottomBar;
    }

    /* renamed from: a */
    public final void mo42272a(View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        this.f35349a.mo42226c(0);
    }
}
