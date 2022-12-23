package com.google.android.material.appbar;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import p255t1.C6541k;

/* renamed from: com.google.android.material.appbar.c */
public final class C13888c implements C6541k {

    /* renamed from: a */
    public final /* synthetic */ CoordinatorLayout f34227a;

    /* renamed from: b */
    public final /* synthetic */ AppBarLayout f34228b;

    /* renamed from: c */
    public final /* synthetic */ View f34229c;

    /* renamed from: d */
    public final /* synthetic */ int f34230d;

    /* renamed from: e */
    public final /* synthetic */ AppBarLayout.BaseBehavior f34231e;

    public C13888c(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
        this.f34231e = baseBehavior;
        this.f34227a = coordinatorLayout;
        this.f34228b = appBarLayout;
        this.f34229c = view;
        this.f34230d = i;
    }

    /* renamed from: a */
    public final boolean mo3589a(View view) {
        this.f34231e.mo40871l(this.f34227a, this.f34228b, this.f34229c, this.f34230d, new int[]{0, 0});
        return true;
    }
}
