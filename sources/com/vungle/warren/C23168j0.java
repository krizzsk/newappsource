package com.vungle.warren;

import ce0.C21102g;
import com.vungle.warren.persistence.C23192a;
import com.vungle.warren.persistence.DatabaseHelper;
import od0.C24559j;

/* renamed from: com.vungle.warren.j0 */
public final class C23168j0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Boolean f58816b;

    /* renamed from: c */
    public final /* synthetic */ PrivacyManager f58817c;

    public C23168j0(PrivacyManager privacyManager, Boolean bool) {
        this.f58817c = privacyManager;
        this.f58816b = bool;
    }

    public final void run() {
        C23192a aVar = this.f58817c.f58511a;
        Boolean bool = this.f58816b;
        int i = C21102g.f52949a;
        C24559j jVar = (C24559j) aVar.mo58281p(C24559j.class, "coppa_cookie").get();
        if (jVar == null) {
            jVar = new C24559j("coppa_cookie");
        }
        jVar.mo60827d(bool, "is_coppa");
        try {
            aVar.mo58288w(jVar);
        } catch (DatabaseHelper.DBException unused) {
        }
    }
}
