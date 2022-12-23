package com.google.android.material.appbar;

import android.view.View;
import p242s1.C6333d0;

/* renamed from: com.google.android.material.appbar.i */
public final class C13894i {

    /* renamed from: a */
    public final View f34235a;

    /* renamed from: b */
    public int f34236b;

    /* renamed from: c */
    public int f34237c;

    /* renamed from: d */
    public int f34238d;

    public C13894i(View view) {
        this.f34235a = view;
    }

    /* renamed from: a */
    public final void mo40976a() {
        View view = this.f34235a;
        C6333d0.m15023k(this.f34238d - (view.getTop() - this.f34236b), view);
        View view2 = this.f34235a;
        C6333d0.m15022j(0 - (view2.getLeft() - this.f34237c), view2);
    }

    /* renamed from: b */
    public final boolean mo40977b(int i) {
        if (this.f34238d == i) {
            return false;
        }
        this.f34238d = i;
        mo40976a();
        return true;
    }
}
