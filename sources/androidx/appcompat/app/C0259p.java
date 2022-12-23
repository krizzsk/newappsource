package androidx.appcompat.app;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0200h;
import p175n.C5765a;
import p242s1.C6359g;

/* renamed from: androidx.appcompat.app.p */
public class C0259p extends C0200h implements C0251i {

    /* renamed from: d */
    public AppCompatDelegateImpl f746d;

    /* renamed from: e */
    public final C0258o f747e;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0259p(android.content.Context r5, int r6) {
        /*
            r4 = this;
            r0 = 1
            if (r6 != 0) goto L_0x0014
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            android.content.res.Resources$Theme r2 = r5.getTheme()
            int r3 = p114i.C5215a.dialogTheme
            r2.resolveAttribute(r3, r1, r0)
            int r1 = r1.resourceId
            goto L_0x0015
        L_0x0014:
            r1 = r6
        L_0x0015:
            r4.<init>(r5, r1)
            androidx.appcompat.app.o r1 = new androidx.appcompat.app.o
            r1.<init>(r4)
            r4.f747e = r1
            androidx.appcompat.app.j r1 = r4.mo959c()
            if (r6 != 0) goto L_0x0035
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            int r2 = p114i.C5215a.dialogTheme
            r5.resolveAttribute(r2, r6, r0)
            int r6 = r6.resourceId
        L_0x0035:
            r5 = r1
            androidx.appcompat.app.AppCompatDelegateImpl r5 = (androidx.appcompat.app.AppCompatDelegateImpl) r5
            r5.f638P = r6
            r1.mo878n()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0259p.<init>(android.content.Context, int):void");
    }

    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo959c().mo867c(view, layoutParams);
    }

    /* renamed from: c */
    public final C0252j mo959c() {
        if (this.f746d == null) {
            int i = C0252j.f737b;
            this.f746d = new AppCompatDelegateImpl(getContext(), getWindow(), this, this);
        }
        return this.f746d;
    }

    /* renamed from: d */
    public final boolean mo960d(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void dismiss() {
        super.dismiss();
        mo959c().mo879o();
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C6359g.m15163b(this.f747e, getWindow().getDecorView(), this, keyEvent);
    }

    public final <T extends View> T findViewById(int i) {
        return mo959c().mo870f(i);
    }

    public final void invalidateOptionsMenu() {
        mo959c().mo876l();
    }

    public void onCreate(Bundle bundle) {
        mo959c().mo875k();
        super.onCreate(bundle);
        mo959c().mo878n();
    }

    public final void onStop() {
        super.onStop();
        mo959c().mo886t();
    }

    public final void onSupportActionModeFinished(C5765a aVar) {
    }

    public final void onSupportActionModeStarted(C5765a aVar) {
    }

    public final C5765a onWindowStartingSupportActionMode(C5765a.C5766a aVar) {
        return null;
    }

    public void setContentView(int i) {
        mo959c().mo888w(i);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        mo959c().mo845B(charSequence);
    }

    public void setContentView(View view) {
        mo959c().mo889x(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo959c().mo890y(view, layoutParams);
    }

    public final void setTitle(int i) {
        super.setTitle(i);
        mo959c().mo845B(getContext().getString(i));
    }
}
