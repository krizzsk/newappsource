package com.google.android.material.datepicker;

import android.view.View;
import p242s1.C6391t;
import p242s1.C6396v0;

/* renamed from: com.google.android.material.datepicker.p */
public final class C13997p implements C6391t {

    /* renamed from: b */
    public final /* synthetic */ int f34746b;

    /* renamed from: c */
    public final /* synthetic */ View f34747c;

    /* renamed from: d */
    public final /* synthetic */ int f34748d;

    public C13997p(int i, View view, int i2) {
        this.f34746b = i;
        this.f34747c = view;
        this.f34748d = i2;
    }

    public final C6396v0 onApplyWindowInsets(View view, C6396v0 v0Var) {
        int i = v0Var.f20044a.mo22517f(7).f17647b;
        if (this.f34746b >= 0) {
            this.f34747c.getLayoutParams().height = this.f34746b + i;
            View view2 = this.f34747c;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        View view3 = this.f34747c;
        view3.setPadding(view3.getPaddingLeft(), this.f34748d + i, this.f34747c.getPaddingRight(), this.f34747c.getPaddingBottom());
        return v0Var;
    }
}
