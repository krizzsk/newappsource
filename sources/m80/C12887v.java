package m80;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import c70.C13751d;
import c70.C13752e;
import ce0.C21100e;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitApplication;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.appdata.UserContextLoader;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.network.model.ServerId;
import com.moovit.request.UserRequestError;
import com.moovit.ticketing.ticket.TicketId;
import j90.C12789b;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicReference;
import l30.C5589r;
import m90.C12890b;
import p130j2.C5367a;
import p172m9.C5720b;
import p501fw.C17103b;
import p646lz.C18299a;
import p735pt.C18983d;
import p785ry.C19383c;
import p80.C12991b;
import p824tp.C19722a0;
import s90.C13072a;
import s90.C13073b;
import s90.C13075c;
import s90.C13076d;
import s90.C13081g;
import w40.C25761d;

/* renamed from: m80.v */
public final class C12887v {

    /* renamed from: d */
    public static final ThreadPoolExecutor f31893d = C5720b.m14033A(1, "m-tm");

    /* renamed from: e */
    public static volatile C12887v f31894e;

    /* renamed from: a */
    public final MoovitApplication<?, ?, ?> f31895a;

    /* renamed from: b */
    public final AtomicReference<C13081g.C13082a> f31896b = new AtomicReference<>((Object) null);

    /* renamed from: c */
    public final AtomicReference<C13073b.C13074a> f31897c = new AtomicReference<>((Object) null);

    /* renamed from: m80.v$a */
    public class C12888a extends BroadcastReceiver {
        public C12888a() {
        }

        public final void onReceive(Context context, Intent intent) {
            C12887v.this.mo39737i();
        }
    }

    public C12887v(MoovitApplication<?, ?, ?> moovitApplication) {
        C21100e.m49373x(moovitApplication, "application");
        this.f31895a = moovitApplication;
        C25761d.m64300h(moovitApplication, new C12888a());
    }

    /* renamed from: b */
    public static C12887v m32668b() {
        C12887v vVar = f31894e;
        if (vVar != null) {
            return vVar;
        }
        throw new IllegalStateException("you must call initialize first");
    }

    /* renamed from: d */
    public static C13752e m32669d(MoovitApplication<?, ?, ?> moovitApplication) {
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

    /* renamed from: f */
    public static C12991b m32670f(MoovitApplication<?, ?, ?> moovitApplication) {
        C21100e.m49355o();
        C18299a aVar = moovitApplication.f37321e;
        C12991b bVar = (C12991b) aVar.mo50695h("TICKETING_CONFIGURATION", false);
        if (bVar != null) {
            return bVar;
        }
        StringBuilder k = C13555b.m33972k("Failed to load Ticketing Provider Configuration: ");
        k.append(aVar.mo50694g("TICKETING_CONFIGURATION"));
        throw new ApplicationBugException(k.toString());
    }

    /* renamed from: h */
    public static synchronized void m32671h(MoovitApplication<?, ?, ?> moovitApplication) {
        synchronized (C12887v.class) {
            if (f31894e == null) {
                f31894e = new C12887v(moovitApplication);
            }
        }
    }

    /* renamed from: j */
    public static void m32672j(Exception exc) {
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

    /* renamed from: k */
    public static void m32673k(Context context, BroadcastReceiver broadcastReceiver) {
        C5367a.m13473a(context).mo21146b(broadcastReceiver, new IntentFilter("com.moovit.ticketing.action.updated"));
    }

    /* renamed from: l */
    public static void m32674l(Context context, BroadcastReceiver broadcastReceiver) {
        C5367a.m13473a(context).mo21148d(broadcastReceiver);
    }

    /* renamed from: a */
    public final Task<C13072a> mo39733a(boolean z) {
        return Tasks.call(f31893d, new C13073b(this.f31895a, this.f31897c, z)).addOnFailureListener((Executor) MoovitExecutors.COMPUTATION, (OnFailureListener) new C18983d(2));
    }

    /* renamed from: c */
    public final Task<C12789b> mo39734c(ServerId serverId) {
        return mo39736g(false).onSuccessTask(MoovitExecutors.COMPUTATION, new C19383c(1, serverId));
    }

    /* renamed from: e */
    public final Task<C12890b> mo39735e(TicketId ticketId) {
        ExecutorService executorService = MoovitExecutors.COMPUTATION;
        return Tasks.call(executorService, new C17103b(this, 2)).onSuccessTask(executorService, new C12882q(ticketId)).addOnFailureListener((Executor) executorService, (OnFailureListener) new C5589r(this, 3));
    }

    /* renamed from: g */
    public final Task<C13076d> mo39736g(boolean z) {
        return Tasks.call(f31893d, new C13081g(this.f31895a, this.f31896b, z)).addOnFailureListener((Executor) MoovitExecutors.COMPUTATION, (OnFailureListener) new C12877l());
    }

    /* renamed from: i */
    public final void mo39737i() {
        Tasks.call(f31893d, new C13075c(this.f31895a, this.f31896b, this.f31897c)).addOnSuccessListener(MoovitExecutors.MAIN_THREAD, new C12878m(this, 0));
    }
}
