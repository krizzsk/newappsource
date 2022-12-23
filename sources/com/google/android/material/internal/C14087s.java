package com.google.android.material.internal;

import android.view.View;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6382p0;

/* renamed from: com.google.android.material.internal.s */
public final class C14087s implements View.OnAttachStateChangeListener {
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        C6333d0.C6341h.m15083c(view);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
