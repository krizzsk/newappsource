package sd0;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.view.WindowManager;
import com.vungle.warren.C23181n1;
import com.vungle.warren.session.SessionAttribute;
import com.vungle.warren.session.SessionEvent;
import od0.C24573q;
import p258t4.C6587a;
import p359ag.C13452i;
import p361ai.C13466b;
import p361ai.C13469d;
import p361ai.C13471f;
import p406cg.C13815e;
import p407ci.C13836a;
import p626lf.C18201b;
import p912xh.C20525a;
import p912xh.C20527c;
import p936yh.C20729b;

/* renamed from: sd0.a */
public final class C24848a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C24849b f62843b;

    public C24848a(C24849b bVar) {
        this.f62843b = bVar;
    }

    public final void run() {
        C20527c cVar = C20525a.f51915a;
        if (!cVar.f51917a) {
            Context applicationContext = this.f62843b.f62845b.get().getApplicationContext();
            C18201b.m44912h(applicationContext, "Application Context cannot be null");
            if (!cVar.f51917a) {
                cVar.f51917a = true;
                C13471f a = C13471f.m33792a();
                a.f33346c.getClass();
                C6587a aVar = new C6587a();
                C13815e eVar = a.f33345b;
                Handler handler = new Handler();
                eVar.getClass();
                a.f33347d = new C20729b(handler, applicationContext, aVar, a);
                C13466b bVar = C13466b.f33335e;
                if (applicationContext instanceof Application) {
                    ((Application) applicationContext).registerActivityLifecycleCallbacks(bVar);
                }
                WindowManager windowManager = C13836a.f34047a;
                C13836a.f34049c = applicationContext.getResources().getDisplayMetrics().density;
                C13836a.f34047a = (WindowManager) applicationContext.getSystemService("window");
                C13469d.f33339b.f33340a = applicationContext.getApplicationContext();
            }
            C23181n1 b = C23181n1.m57208b();
            C13452i iVar = new C13452i();
            SessionEvent sessionEvent = SessionEvent.OM_SDK;
            iVar.mo40349F("event", sessionEvent.toString());
            iVar.mo40347D(SessionAttribute.ENABLED.toString(), Boolean.TRUE);
            iVar.mo40347D(SessionAttribute.SUCCESS.toString(), Boolean.valueOf(cVar.f51917a));
            b.mo58250d(new C24573q(sessionEvent, iVar));
        }
    }
}
