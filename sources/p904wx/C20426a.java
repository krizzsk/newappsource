package p904wx;

import com.moovit.MoovitApplication;
import com.moovit.app.useraccount.manager.UserAccountManager;
import com.moovit.appdata.UserContextLoader;
import p527gy.C17259d;
import p528gz.C17272g;
import p528gz.C17289h;
import p646lz.C18299a;

/* renamed from: wx.a */
public final class C20426a extends C17289h {
    public C20426a(MoovitApplication<?, ?, ?> moovitApplication) {
        super(moovitApplication);
    }

    public final void onSuccess(Object obj) {
        UserAccountManager userAccountManager;
        C17272g.C17277e eVar = (C17272g.C17277e) obj;
        MoovitApplication<?, ?, ?> moovitApplication = this.f44667b;
        C18299a aVar = moovitApplication.f37321e;
        if (UserContextLoader.m40004l(moovitApplication)) {
            userAccountManager = (UserAccountManager) aVar.mo50695h("USER_ACCOUNT", false);
        } else {
            userAccountManager = null;
        }
        if (userAccountManager != null) {
            C17259d e = userAccountManager.mo46575f().mo49805e();
            eVar.mo49818a(C17272g.f44654n, e.f44606e);
            eVar.mo49818a(C17272g.f44652l, e.f44602a);
            eVar.mo49818a(C17272g.f44653m, e.f44603b);
            eVar.mo49818a(C17272g.f44656p, e.f44607f);
        }
    }
}
