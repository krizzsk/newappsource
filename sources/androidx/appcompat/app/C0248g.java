package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

/* renamed from: androidx.appcompat.app.g */
public final class C0248g implements AdapterView.OnItemClickListener {

    /* renamed from: b */
    public final /* synthetic */ AlertController f732b;

    /* renamed from: c */
    public final /* synthetic */ AlertController.C0216b f733c;

    public C0248g(AlertController.C0216b bVar, AlertController alertController) {
        this.f733c = bVar;
        this.f732b = alertController;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f733c.f612n.onClick(this.f732b.f571b, i);
        if (!this.f733c.f614p) {
            this.f732b.f571b.dismiss();
        }
    }
}
