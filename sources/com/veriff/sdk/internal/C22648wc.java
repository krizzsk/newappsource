package com.veriff.sdk.internal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import mobi.lab.veriff.R$id;
import mobi.lab.veriff.R$layout;

/* renamed from: com.veriff.sdk.internal.wc */
public final class C22648wc {

    /* renamed from: a */
    public final C22649wd f57221a;

    /* renamed from: b */
    public final C22629vk f57222b;

    /* renamed from: c */
    private final RelativeLayout f57223c;

    private C22648wc(RelativeLayout relativeLayout, C22649wd wdVar, C22629vk vkVar) {
        this.f57223c = relativeLayout;
        this.f57221a = wdVar;
        this.f57222b = vkVar;
    }

    /* renamed from: a */
    public RelativeLayout mo56992a() {
        return this.f57223c;
    }

    /* renamed from: a */
    public static C22648wc m55208a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R$layout.vrff_view_inflow_at_end, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m55209a(inflate);
    }

    /* renamed from: a */
    public static C22648wc m55209a(View view) {
        int i = R$id.inflow_end_summary;
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            C22649wd a = C22649wd.m55211a(findViewById);
            int i2 = R$id.inflow_end_uploading;
            View findViewById2 = view.findViewById(i2);
            if (findViewById2 != null) {
                return new C22648wc((RelativeLayout) view, a, C22629vk.m55169a(findViewById2));
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
