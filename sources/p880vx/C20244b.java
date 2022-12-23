package p880vx;

import android.content.Context;
import com.moovit.MoovitExecutors;
import com.moovit.app.ads.MobileAdsManager;
import com.moovit.app.datacollection.ForegroundWifiScanner;
import com.moovit.appdata.UserContextLoader;
import p054d0.C4268a1;
import p172m9.C5720b;
import p626lf.C18201b;
import p824tp.C19722a0;

/* renamed from: vx.b */
public final class C20244b extends C20243a {
    /* renamed from: n */
    public final void mo46742n(Context context, C19722a0 a0Var) {
        super.mo46742n(context, a0Var);
        C5720b.m14039G(context);
        MobileAdsManager.m37073h().mo44712n("user_creation", 0, true);
        int i = ForegroundWifiScanner.f37916f;
        if (UserContextLoader.m40004l(context)) {
            MoovitExecutors.MAIN_THREAD.execute(new C4268a1(context, 10));
        }
        C18201b.m44928z(context, a0Var.f50160a.f32925a);
    }
}
