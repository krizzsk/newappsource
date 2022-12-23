package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.C0249h;
import androidx.appcompat.view.menu.C0288d;
import androidx.appcompat.view.menu.C0300j;

/* renamed from: androidx.appcompat.view.menu.g */
public final class C0294g implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, C0300j.C0301a {

    /* renamed from: b */
    public C0291f f946b;

    /* renamed from: c */
    public C0249h f947c;

    /* renamed from: d */
    public C0288d f948d;

    public C0294g(C0291f fVar) {
        this.f946b = fVar;
    }

    /* renamed from: b */
    public final void mo903b(C0291f fVar, boolean z) {
        C0249h hVar;
        if ((z || fVar == this.f946b) && (hVar = this.f947c) != null) {
            hVar.dismiss();
        }
    }

    /* renamed from: c */
    public final boolean mo904c(C0291f fVar) {
        return false;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C0291f fVar = this.f946b;
        C0288d dVar = this.f948d;
        if (dVar.f912h == null) {
            dVar.f912h = new C0288d.C0289a();
        }
        fVar.mo1125q(dVar.f912h.getItem(i), (C0300j) null, 0);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.f948d.mo1049b(this.f946b, true);
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f947c.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f947c.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f946b.mo1102c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f946b.performShortcut(i, keyEvent, 0);
    }
}
