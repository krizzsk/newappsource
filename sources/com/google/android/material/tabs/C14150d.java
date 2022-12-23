package com.google.android.material.tabs;

import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* renamed from: com.google.android.material.tabs.d */
public final class C14150d implements View.OnLayoutChangeListener {

    /* renamed from: b */
    public final /* synthetic */ View f35457b;

    /* renamed from: c */
    public final /* synthetic */ TabLayout.C14145i f35458c;

    public C14150d(TabLayout.C14145i iVar, View view) {
        this.f35458c = iVar;
        this.f35457b = view;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.f35457b.getVisibility() == 0) {
            this.f35458c.mo42368c(this.f35457b);
        }
    }
}
