package com.veriff.sdk.internal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import mobi.lab.veriff.R$id;
import mobi.lab.veriff.R$layout;

/* renamed from: com.veriff.sdk.internal.vp */
public final class C22634vp {

    /* renamed from: a */
    public final C22635vq f57107a;

    /* renamed from: b */
    public final C22636vr f57108b;

    private C22634vp(ConstraintLayout constraintLayout, C22635vq vqVar, C22636vr vrVar) {
        this.f57107a = vqVar;
        this.f57108b = vrVar;
    }

    /* renamed from: a */
    public static C22634vp m55179a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R$layout.vrff_view_address, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m55180a(inflate);
    }

    /* renamed from: a */
    public static C22634vp m55180a(View view) {
        int i = R$id.address_capture;
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            C22635vq a = C22635vq.m55181a(findViewById);
            int i2 = R$id.address_intro;
            View findViewById2 = view.findViewById(i2);
            if (findViewById2 != null) {
                return new C22634vp((ConstraintLayout) view, a, C22636vr.m55182a(findViewById2));
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
