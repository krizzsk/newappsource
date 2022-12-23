package com.facebook.internal;

import android.content.DialogInterface;
import mf0.C24362h;

/* renamed from: com.facebook.internal.h0 */
public final /* synthetic */ class C2403h0 implements DialogInterface.OnCancelListener {

    /* renamed from: b */
    public final /* synthetic */ C2410j0 f8642b;

    public /* synthetic */ C2403h0(C2410j0 j0Var) {
        this.f8642b = j0Var;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        C2410j0 j0Var = this.f8642b;
        C24362h.m61211f(j0Var, "this$0");
        j0Var.cancel();
    }
}
