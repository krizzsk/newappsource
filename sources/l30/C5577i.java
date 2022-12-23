package l30;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import b40.C1472a;
import b40.C1473b;
import b40.C1475c;
import b40.C1477e;
import c70.C13751d;
import c70.C13752e;
import ce0.C21100e;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitApplication;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.app.ads.C14753n;
import com.moovit.appdata.UserContextLoader;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.micromobility.ride.MicroMobilityRide;
import com.moovit.network.model.ServerId;
import com.moovit.request.UserRequestError;
import h60.C17327j1;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicReference;
import p172m9.C5720b;
import p646lz.C18299a;
import p824tp.C19722a0;
import p976zy.C20923d;
import w40.C25761d;

/* renamed from: l30.i */
public final class C5577i {

    /* renamed from: d */
    public static volatile C5577i f18275d;

    /* renamed from: e */
    public static final ThreadPoolExecutor f18276e = C5720b.m14033A(1, "m-mm");

    /* renamed from: a */
    public final MoovitApplication<?, ?, ?> f18277a;

    /* renamed from: b */
    public final AtomicReference<C1477e.C1478a> f18278b = new AtomicReference<>((Object) null);

    /* renamed from: c */
    public final AtomicReference<C1473b.C1474a> f18279c = new AtomicReference<>((Object) null);

    /* renamed from: l30.i$a */
    public class C5578a extends BroadcastReceiver {
        public C5578a() {
        }

        public final void onReceive(Context context, Intent intent) {
            C5577i.this.mo21404f();
        }
    }

    public C5577i(MoovitApplication<?, ?, ?> moovitApplication) {
        C21100e.m49373x(moovitApplication, "application");
        this.f18277a = moovitApplication;
        C25761d.m64300h(moovitApplication, new C5578a());
    }

    /* renamed from: a */
    public static C5577i m13786a() {
        C5577i iVar = f18275d;
        if (iVar != null) {
            return iVar;
        }
        throw new IllegalStateException("you must call initialize first");
    }

    /* renamed from: c */
    public static C13752e m13787c(MoovitApplication<?, ?, ?> moovitApplication) {
        C21100e.m49355o();
        if (UserContextLoader.m40004l(moovitApplication)) {
            C13752e l = moovitApplication.mo44560l();
            if (l.f33853b != null) {
                return l;
            }
            C18299a aVar = moovitApplication.f37321e;
            C19722a0 a0Var = (C19722a0) aVar.mo50695h("USER_CONTEXT", false);
            if (a0Var != null) {
                return new C13752e(moovitApplication, a0Var, (AnalyticsFlowKey) null);
            }
            StringBuilder k = C13555b.m33972k("Failed to load user context: ");
            k.append(aVar.mo50694g("USER_CONTEXT"));
            throw new ApplicationBugException(k.toString());
        }
        throw new ApplicationBugException("Missing user context!");
    }

    /* renamed from: e */
    public static synchronized void m13788e(MoovitApplication<?, ?, ?> moovitApplication) {
        synchronized (C5577i.class) {
            if (f18275d == null) {
                f18275d = new C5577i(moovitApplication);
            }
        }
    }

    /* renamed from: g */
    public static void m13789g(Exception exc) {
        int i = C13751d.f33851b;
        if (exc instanceof UserRequestError) {
            switch (((UserRequestError) exc).mo49160b()) {
                case 40101:
                case 40102:
                case 40104:
                case 40138:
                case 43003:
                    C25761d.m64299a().mo83591f();
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: b */
    public final Task<C1472a> mo21402b() {
        return Tasks.call(f18276e, new C1473b(this.f18277a, this.f18279c)).addOnFailureListener((Executor) MoovitExecutors.COMPUTATION, (OnFailureListener) new C20923d(1));
    }

    /* renamed from: d */
    public final Task<MicroMobilityRide> mo21403d(ServerId serverId) {
        Task call = Tasks.call(f18276e, new C1477e(this.f18277a, this.f18278b));
        ExecutorService executorService = MoovitExecutors.COMPUTATION;
        return call.addOnFailureListener((Executor) executorService, (OnFailureListener) new C5575g(0)).onSuccessTask(executorService, new C17327j1(serverId, 20)).continueWithTask(executorService, new C5565a(this, serverId, 0));
    }

    /* renamed from: f */
    public final void mo21404f() {
        Tasks.call(f18276e, new C1475c(this.f18277a, this.f18278b, this.f18279c)).addOnSuccessListener(MoovitExecutors.MAIN_THREAD, new C14753n(this, 6));
    }
}
