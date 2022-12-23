package p785ry;

import android.os.SystemClock;
import c70.C13752e;
import ce0.C21100e;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitApplication;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.app.wondo.tickets.model.WondoCampaign;
import com.moovit.app.wondo.tickets.model.WondoRewards;
import com.moovit.appdata.UserContextLoader;
import com.moovit.commons.utils.ApplicationBugException;
import g30.C4776h;
import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p054d0.C4314v;
import p646lz.C18299a;
import p824tp.C19722a0;
import p824tp.C19728f;
import p874vr.C20199a;
import p881vy.C20247a;
import p881vy.C20248b;
import p977zz.C20944i0;
import q00.C19047a;

/* renamed from: ry.e */
public final class C19385e {

    /* renamed from: b */
    public static final long f49314b = TimeUnit.MINUTES.toMillis(5);

    /* renamed from: c */
    public static final C19385e f49315c = new C19385e();

    /* renamed from: a */
    public final AtomicReference<C20944i0<Long, C19381a>> f49316a = new AtomicReference<>((Object) null);

    /* renamed from: ry.e$a */
    public class C19386a implements Callable<C19381a> {
        public C19386a() {
        }

        /* renamed from: a */
        public static boolean m46668a(C4776h hVar, C20944i0 i0Var) {
            boolean z;
            if (i0Var == null) {
                return true;
            }
            if (SystemClock.elapsedRealtime() - ((Long) i0Var.f52692a).longValue() >= C19385e.f49314b) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
            return !hVar.f16126a.equals(((C19381a) i0Var.f52693b).f49303a);
        }

        public final Object call() throws Exception {
            MoovitApplication<?, ?, ?> moovitApplication = MoovitApplication.f37317k;
            C21100e.m49355o();
            if (UserContextLoader.m40004l(moovitApplication)) {
                C18299a aVar = moovitApplication.f37321e;
                C19722a0 a0Var = (C19722a0) aVar.mo50695h("USER_CONTEXT", false);
                if (a0Var != null) {
                    C21100e.m49355o();
                    C18299a aVar2 = moovitApplication.f37321e;
                    C19047a aVar3 = (C19047a) aVar2.mo50695h("CONFIGURATION", false);
                    if (aVar3 == null) {
                        StringBuilder k = C13555b.m33972k("Failed to load metro context: ");
                        k.append(aVar2.mo50694g("CONFIGURATION"));
                        throw new ApplicationBugException(k.toString());
                    } else if (!((Boolean) aVar3.mo51505b(C20199a.f51307y0)).booleanValue()) {
                        return new C19381a(a0Var.f50160a.f32927c, Collections.emptyList(), Collections.emptyList(), new WondoRewards(Collections.emptyList(), (String) null), Collections.emptyMap(), (C20944i0<String, String>) null);
                    } else {
                        C21100e.m49355o();
                        C18299a aVar4 = moovitApplication.f37321e;
                        C19728f fVar = (C19728f) aVar4.mo50695h("METRO_CONTEXT", false);
                        if (fVar != null) {
                            C20944i0 i0Var = C19385e.this.f49316a.get();
                            if (m46668a(fVar.f50165a, i0Var)) {
                                synchronized (C19385e.this.f49316a) {
                                    i0Var = C19385e.this.f49316a.get();
                                    if (m46668a(fVar.f50165a, i0Var)) {
                                        C20944i0 i0Var2 = new C20944i0(Long.valueOf(SystemClock.elapsedRealtime()), ((C20248b) new C20247a(new C13752e(moovitApplication, a0Var, (AnalyticsFlowKey) null)).mo52626J()).f51353m);
                                        C19385e.this.f49316a.set(i0Var2);
                                        i0Var = i0Var2;
                                    }
                                }
                            }
                            return (C19381a) i0Var.f52693b;
                        }
                        StringBuilder k2 = C13555b.m33972k("Failed to load metro context: ");
                        k2.append(aVar4.mo50694g("METRO_CONTEXT"));
                        throw new ApplicationBugException(k2.toString());
                    }
                } else {
                    StringBuilder k3 = C13555b.m33972k("Failed to load user context: ");
                    k3.append(aVar.mo50694g("USER_CONTEXT"));
                    throw new ApplicationBugException(k3.toString());
                }
            } else {
                throw new ApplicationBugException("Missing user context!");
            }
        }
    }

    /* renamed from: a */
    public final Task<WondoCampaign> mo51791a(String str) {
        return mo51792b().onSuccessTask(MoovitExecutors.COMPUTATION, new C4314v(str, 11));
    }

    /* renamed from: b */
    public final Task<C19381a> mo51792b() {
        return Tasks.call(MoovitExecutors.f37327IO, new C19386a()).addOnFailureListener((Executor) MoovitExecutors.COMPUTATION, (OnFailureListener) new C19382b(0));
    }
}
