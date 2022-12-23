package com.moovit.app.home.dashboard;

import com.moovit.commons.utils.UiUtils;

/* renamed from: com.moovit.app.home.dashboard.c */
public final class C14934c implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C14935d f38200b;

    public C14934c(C14935d dVar) {
        this.f38200b = dVar;
    }

    public final void run() {
        C14935d dVar = this.f38200b;
        UiUtils.m40238F(0, dVar.f38203o, dVar.f38204p);
        dVar.f38204p.setOnClickListener(dVar.f38202n);
    }
}
