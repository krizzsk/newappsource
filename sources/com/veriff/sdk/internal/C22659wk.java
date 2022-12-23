package com.veriff.sdk.internal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import mobi.lab.veriff.R$id;
import mobi.lab.veriff.R$layout;

/* renamed from: com.veriff.sdk.internal.wk */
public final class C22659wk {

    /* renamed from: a */
    public final C22628vj f57309a;

    /* renamed from: b */
    public final C22630vl f57310b;

    /* renamed from: c */
    private final RelativeLayout f57311c;

    private C22659wk(RelativeLayout relativeLayout, C22628vj vjVar, C22630vl vlVar) {
        this.f57311c = relativeLayout;
        this.f57309a = vjVar;
        this.f57310b = vlVar;
    }

    /* renamed from: a */
    public RelativeLayout mo57005a() {
        return this.f57311c;
    }

    /* renamed from: a */
    public static C22659wk m55229a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R$layout.vrff_view_upload_with_decision, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m55230a(inflate);
    }

    /* renamed from: a */
    public static C22659wk m55230a(View view) {
        int i = R$id.upload_decision_container;
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            C22628vj a = C22628vj.m55167a(findViewById);
            int i2 = R$id.upload_failed_container;
            View findViewById2 = view.findViewById(i2);
            if (findViewById2 != null) {
                return new C22659wk((RelativeLayout) view, a, C22630vl.m55170a(findViewById2));
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
