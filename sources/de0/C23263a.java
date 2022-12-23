package de0;

import android.webkit.WebSettings;
import com.vungle.warren.C23219r1;
import com.vungle.warren.persistence.DatabaseHelper;
import od0.C24559j;
import p229r1.C6231a;

/* renamed from: de0.a */
public final class C23263a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C6231a f59015b;

    /* renamed from: c */
    public final /* synthetic */ C23264b f59016c;

    public C23263a(C23264b bVar, C23219r1 r1Var) {
        this.f59016c = bVar;
        this.f59015b = r1Var;
    }

    public final void run() {
        String defaultUserAgent = WebSettings.getDefaultUserAgent(this.f59016c.f59018b);
        this.f59015b.accept(defaultUserAgent);
        try {
            C23264b bVar = this.f59016c;
            bVar.getClass();
            C24559j jVar = new C24559j("userAgent");
            jVar.mo60827d(defaultUserAgent, "userAgent");
            bVar.f59019c.mo58288w(jVar);
        } catch (DatabaseHelper.DBException unused) {
            this.f59015b.accept(null);
        }
    }
}
