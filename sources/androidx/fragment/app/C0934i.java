package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;

/* renamed from: androidx.fragment.app.i */
public final class C0934i implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C0954o0 f3797b;

    /* renamed from: c */
    public final /* synthetic */ View f3798c;

    /* renamed from: d */
    public final /* synthetic */ Rect f3799d;

    public C0934i(C0954o0 o0Var, View view, Rect rect) {
        this.f3797b = o0Var;
        this.f3798c = view;
        this.f3799d = rect;
    }

    public final void run() {
        C0954o0 o0Var = this.f3797b;
        View view = this.f3798c;
        Rect rect = this.f3799d;
        o0Var.getClass();
        C0954o0.m2769g(view, rect);
    }
}
