package androidx.appcompat.app;

import android.view.View;

/* renamed from: androidx.appcompat.app.f */
public final class C0247f implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ View f729b;

    /* renamed from: c */
    public final /* synthetic */ View f730c;

    /* renamed from: d */
    public final /* synthetic */ AlertController f731d;

    public C0247f(AlertController alertController, View view, View view2) {
        this.f731d = alertController;
        this.f729b = view;
        this.f730c = view2;
    }

    public final void run() {
        AlertController.m381c(this.f731d.f576g, this.f729b, this.f730c);
    }
}
