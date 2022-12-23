package androidx.appcompat.app;

import android.view.View;

/* renamed from: androidx.appcompat.app.d */
public final class C0245d implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ View f724b;

    /* renamed from: c */
    public final /* synthetic */ View f725c;

    /* renamed from: d */
    public final /* synthetic */ AlertController f726d;

    public C0245d(AlertController alertController, View view, View view2) {
        this.f726d = alertController;
        this.f724b = view;
        this.f725c = view2;
    }

    public final void run() {
        AlertController.m381c(this.f726d.f592w, this.f724b, this.f725c);
    }
}
