package k50;

import ce0.C21100e;
import com.moovit.MoovitApplication;
import p528gz.C17272g;
import p528gz.C17290i;

/* renamed from: k50.a */
public final class C25744a extends C17290i {

    /* renamed from: c */
    public final String f64181c;

    public C25744a(MoovitApplication<?, ?, ?> moovitApplication, String str) {
        super(moovitApplication);
        C21100e.m49373x(str, "email");
        this.f64181c = str;
    }

    /* renamed from: b */
    public final void onSuccess(C17272g.C17277e eVar) {
        super.onSuccess(eVar);
        eVar.mo49818a(C17272g.f44654n, this.f64181c);
    }
}
