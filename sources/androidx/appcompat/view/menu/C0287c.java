package androidx.appcompat.view.menu;

import android.view.MenuItem;
import androidx.appcompat.view.menu.C0282b;

/* renamed from: androidx.appcompat.view.menu.c */
public final class C0287c implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C0282b.C0286d f902b;

    /* renamed from: c */
    public final /* synthetic */ MenuItem f903c;

    /* renamed from: d */
    public final /* synthetic */ C0291f f904d;

    /* renamed from: e */
    public final /* synthetic */ C0282b.C0285c f905e;

    public C0287c(C0282b.C0285c cVar, C0282b.C0286d dVar, C0295h hVar, C0291f fVar) {
        this.f905e = cVar;
        this.f902b = dVar;
        this.f903c = hVar;
        this.f904d = fVar;
    }

    public final void run() {
        C0282b.C0286d dVar = this.f902b;
        if (dVar != null) {
            C0282b.this.f871B = true;
            dVar.f900b.mo1102c(false);
            C0282b.this.f871B = false;
        }
        if (this.f903c.isEnabled() && this.f903c.hasSubMenu()) {
            this.f904d.mo1125q(this.f903c, (C0300j) null, 4);
        }
    }
}
