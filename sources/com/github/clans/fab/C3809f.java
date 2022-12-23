package com.github.clans.fab;

import com.github.clans.fab.FloatingActionMenu;
import com.moovit.app.editing.EditStopOverviewActivity;

/* renamed from: com.github.clans.fab.f */
public final class C3809f implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ FloatingActionMenu f13244b;

    public C3809f(FloatingActionMenu floatingActionMenu) {
        this.f13244b = floatingActionMenu;
    }

    public final void run() {
        FloatingActionMenu floatingActionMenu = this.f13244b;
        floatingActionMenu.f13179k = true;
        FloatingActionMenu.C3801c cVar = floatingActionMenu.f13185n0;
        if (cVar != null) {
            ((EditStopOverviewActivity.C14851e) cVar).mo44937a(true);
        }
    }
}
