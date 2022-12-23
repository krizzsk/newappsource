package com.moovit.app.reports.service;

import a00.C13382a;
import android.animation.Animator;
import com.moovit.app.reports.service.ReportBarView;
import com.tranzmate.R;
import j00.C17682a;
import p054d0.C4273c0;

/* renamed from: com.moovit.app.reports.service.h */
public final class C15227h extends C17682a {

    /* renamed from: a */
    public final /* synthetic */ ReportBarView f39256a;

    public C15227h(ReportBarView reportBarView) {
        this.f39256a = reportBarView;
    }

    public final void onAnimationEnd(Animator animator) {
        ReportBarView reportBarView = this.f39256a;
        ReportBarView.C15217b bVar = reportBarView.f39233m;
        if (bVar != null) {
            int i = reportBarView.f39228h;
            C4273c0 c0Var = (C4273c0) bVar;
            C15230k kVar = (C15230k) c0Var.f15189c;
            String[] strArr = (String[]) c0Var.f15190d;
            if (kVar.f39260h != i) {
                kVar.f39260h = i;
                kVar.f39243b.setSubtitle((CharSequence) strArr[i]);
                C13382a.m33665a(kVar.f39243b, kVar.getContext().getString(R.string.voiceover_selected, new Object[]{strArr[i]}));
            }
        }
    }
}
