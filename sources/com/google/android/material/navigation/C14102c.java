package com.google.android.material.navigation;

import android.content.Context;
import android.view.SubMenu;
import androidx.appcompat.view.menu.C0291f;
import androidx.appcompat.view.menu.C0295h;
import p358af.C13437d;

/* renamed from: com.google.android.material.navigation.c */
public final class C14102c extends C0291f {

    /* renamed from: A */
    public final int f35185A;

    /* renamed from: z */
    public final Class<?> f35186z;

    public C14102c(Context context, Class<?> cls, int i) {
        super(context);
        this.f35186z = cls;
        this.f35185A = i;
    }

    /* renamed from: a */
    public final C0295h mo1091a(int i, int i2, int i3, CharSequence charSequence) {
        if (size() + 1 <= this.f35185A) {
            mo1142z();
            C0295h a = super.mo1091a(i, i2, i3, charSequence);
            a.mo1152f(true);
            mo1141y();
            return a;
        }
        String simpleName = this.f35186z.getSimpleName();
        StringBuilder l = C13555b.m33973l("Maximum number of items supported by ", simpleName, " is ");
        l.append(this.f35185A);
        l.append(". Limit can be checked with ");
        l.append(simpleName);
        l.append("#getMaxItemCount()");
        throw new IllegalArgumentException(l.toString());
    }

    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        throw new UnsupportedOperationException(C13437d.m33705j(this.f35186z, new StringBuilder(), " does not support submenus"));
    }
}
