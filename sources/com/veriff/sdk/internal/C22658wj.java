package com.veriff.sdk.internal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import mobi.lab.veriff.R$id;
import mobi.lab.veriff.R$layout;

/* renamed from: com.veriff.sdk.internal.wj */
public final class C22658wj {

    /* renamed from: a */
    public final C22630vl f57307a;

    /* renamed from: b */
    public final C22631vm f57308b;

    private C22658wj(RelativeLayout relativeLayout, C22630vl vlVar, C22631vm vmVar) {
        this.f57307a = vlVar;
        this.f57308b = vmVar;
    }

    /* renamed from: a */
    public static C22658wj m55227a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R$layout.vrff_view_upload, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m55228a(inflate);
    }

    /* renamed from: a */
    public static C22658wj m55228a(View view) {
        int i = R$id.upload_failed_container;
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            C22630vl a = C22630vl.m55170a(findViewById);
            int i2 = R$id.upload_uploading_container;
            View findViewById2 = view.findViewById(i2);
            if (findViewById2 != null) {
                return new C22658wj((RelativeLayout) view, a, C22631vm.m55172a(findViewById2));
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
