package com.google.android.material.internal;

import android.content.Context;
import android.view.SubMenu;
import androidx.appcompat.view.menu.C0291f;
import androidx.appcompat.view.menu.C0295h;

/* renamed from: com.google.android.material.internal.f */
public final class C14053f extends C0291f {
    public C14053f(Context context) {
        super(context);
    }

    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0295h a = mo1091a(i, i2, i3, charSequence);
        C14067h hVar = new C14067h(this.f922a, this, a);
        a.f966o = hVar;
        hVar.setHeaderTitle(a.f956e);
        return hVar;
    }
}
