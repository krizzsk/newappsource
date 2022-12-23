package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.appcompat.widget.AppCompatSpinner;
import p188o.C5901f;

/* renamed from: androidx.appcompat.widget.u */
public final class C0463u extends C0438n0 {

    /* renamed from: k */
    public final /* synthetic */ AppCompatSpinner.C0339g f1626k;

    /* renamed from: l */
    public final /* synthetic */ AppCompatSpinner f1627l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0463u(AppCompatSpinner appCompatSpinner, View view, AppCompatSpinner.C0339g gVar) {
        super(view);
        this.f1627l = appCompatSpinner;
        this.f1626k = gVar;
    }

    /* renamed from: b */
    public final C5901f mo1028b() {
        return this.f1626k;
    }

    @SuppressLint({"SyntheticAccessor"})
    /* renamed from: c */
    public final boolean mo1029c() {
        if (this.f1627l.getInternalPopup().mo1615a()) {
            return true;
        }
        AppCompatSpinner appCompatSpinner = this.f1627l;
        appCompatSpinner.f1169g.mo1624j(AppCompatSpinner.C0335c.m810b(appCompatSpinner), AppCompatSpinner.C0335c.m809a(appCompatSpinner));
        return true;
    }
}
