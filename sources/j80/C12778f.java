package j80;

import android.content.ComponentCallbacks;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.SystemClock;
import c00.C13717b;
import c70.C13752e;
import ce0.C21100e;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitApplication;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.appdata.UserContextLoader;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.database.DbEntityRef;
import com.moovit.metroentities.MetroEntityType;
import com.moovit.network.model.ServerId;
import com.moovit.servicealerts.LineServiceAlertDigest;
import com.moovit.servicealerts.ServiceAlert;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitStop;
import f00.C16918f;
import f00.C16919g;
import g30.C4776h;
import i30.C5267c;
import i30.C5269e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import k80.C12806a;
import k80.C12807b;
import k80.C12811e;
import k80.C12812f;
import k80.C12815i;
import k80.C12816j;
import p028ba.C1510d;
import p646lz.C18299a;
import p693nz.C18659h;
import p824tp.C19722a0;
import p824tp.C19728f;
import p977zz.C20944i0;
import q00.C19047a;

/* renamed from: j80.f */
public final class C12778f {

    /* renamed from: e */
    public static final long f31583e = TimeUnit.MINUTES.toMillis(5);

    /* renamed from: f */
    public static final long f31584f = TimeUnit.DAYS.toMillis(60);

    /* renamed from: g */
    public static final /* synthetic */ int f31585g = 0;

    /* renamed from: a */
    public final MoovitApplication<?, ?, ?> f31586a;

    /* renamed from: b */
    public final SharedPreferences f31587b;

    /* renamed from: c */
    public final AtomicReference<C20944i0<Long, C12773b>> f31588c = new AtomicReference<>((Object) null);

    /* renamed from: d */
    public final C18659h<String, ServiceAlert> f31589d = new C18659h<>(10);

    /* renamed from: j80.f$a */
    public class C12779a implements ComponentCallbacks {
        public C12779a() {
        }

        public final void onConfigurationChanged(Configuration configuration) {
            C12778f.this.f31588c.set((Object) null);
        }

        public final void onLowMemory() {
            C12778f.this.f31588c.set((Object) null);
        }
    }

    /* renamed from: j80.f$b */
    public class C12780b implements Callable<C12773b> {

        /* renamed from: b */
        public final boolean f31591b;

        public C12780b(boolean z) {
            this.f31591b = z;
        }

        /* renamed from: b */
        public static boolean m32588b(C4776h hVar, C20944i0 i0Var) {
            boolean z;
            if (i0Var == null) {
                return true;
            }
            if (SystemClock.elapsedRealtime() - ((Long) i0Var.f52692a).longValue() >= C12778f.f31583e) {
                z = true;
            } else {
                z = false;
            }
            if (!z && hVar.f16126a.equals(((C12773b) i0Var.f52693b).f31565a) && hVar.f16127b == ((C12773b) i0Var.f52693b).f31566b) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public final void mo39628a() {
            long currentTimeMillis = System.currentTimeMillis();
            SharedPreferences.Editor edit = C12778f.this.f31587b.edit();
            boolean z = false;
            for (String next : C12778f.this.f31587b.getAll().keySet()) {
                long j = C12778f.this.f31587b.getLong(next, -1);
                if (j != -1 && currentTimeMillis - j >= C12778f.f31584f) {
                    z = true;
                    edit.remove(next);
                }
            }
            if (z) {
                edit.apply();
            }
        }

        public final Object call() throws Exception {
            C13752e a = C12778f.m32583a(C12778f.this.f31586a);
            C19728f b = C12778f.m32584b(C12778f.this.f31586a);
            MoovitApplication<?, ?, ?> moovitApplication = C12778f.this.f31586a;
            C21100e.m49355o();
            C18299a aVar = moovitApplication.f37321e;
            C19047a aVar2 = (C19047a) aVar.mo50695h("CONFIGURATION", false);
            if (aVar2 != null) {
                C20944i0 i0Var = C12778f.this.f31588c.get();
                if (this.f31591b || m32588b(b.f50165a, i0Var)) {
                    synchronized (C12778f.this) {
                        i0Var = C12778f.this.f31588c.get();
                        if (this.f31591b || m32588b(b.f50165a, i0Var)) {
                            i0Var = new C20944i0(Long.valueOf(SystemClock.elapsedRealtime()), ((C12807b) new C12806a(b, aVar2, a).mo52626J()).f31672m);
                            C12778f.this.f31588c.set(i0Var);
                            mo39628a();
                        }
                    }
                }
                return (C12773b) i0Var.f52693b;
            }
            StringBuilder k = C13555b.m33972k("Failed to load metro context: ");
            k.append(aVar.mo50694g("CONFIGURATION"));
            throw new ApplicationBugException(k.toString());
        }
    }

    /* renamed from: j80.f$c */
    public class C12781c implements Callable<ServiceAlert> {

        /* renamed from: b */
        public final String f31593b;

        public C12781c(String str) {
            C21100e.m49373x(str, "alertId");
            this.f31593b = str;
        }

        public final Object call() throws Exception {
            ServiceAlert serviceAlert = C12778f.this.f31589d.get(this.f31593b);
            if (serviceAlert == null && (serviceAlert = ((C12812f) new C12811e(C12778f.m32583a(C12778f.this.f31586a), this.f31593b).mo52626J()).f31676m) != null) {
                C12778f.this.f31589d.put(this.f31593b, serviceAlert);
            }
            return serviceAlert;
        }
    }

    /* renamed from: j80.f$d */
    public class C12782d implements Callable<Map<String, ServiceAlert>> {

        /* renamed from: b */
        public final List<String> f31595b;

        public C12782d(ArrayList arrayList) {
            C21100e.m49373x(arrayList, "alertIds");
            this.f31595b = arrayList;
        }

        public final Object call() throws Exception {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            for (String next : this.f31595b) {
                ServiceAlert serviceAlert = C12778f.this.f31589d.get(next);
                if (serviceAlert != null) {
                    hashMap.put(serviceAlert.f23190b, serviceAlert);
                } else {
                    arrayList.add(next);
                }
            }
            if (!arrayList.isEmpty()) {
                List<ServiceAlert> list = ((C12816j) new C12815i(C12778f.m32583a(C12778f.this.f31586a), this.f31595b).mo52626J()).f31679m;
                if (!C13717b.m34258e(list)) {
                    for (ServiceAlert next2 : list) {
                        C12778f.this.f31589d.put(next2.f23190b, next2);
                        hashMap.put(next2.f23190b, next2);
                    }
                }
            }
            return hashMap;
        }
    }

    /* renamed from: j80.f$e */
    public class C12783e implements Callable<C12775d> {

        /* renamed from: b */
        public final ServerId f31597b;

        /* renamed from: c */
        public final C12773b f31598c;

        public C12783e(ServerId serverId, C12773b bVar) {
            C21100e.m49373x(serverId, "lineGroupId");
            this.f31597b = serverId;
            C21100e.m49373x(bVar, "metroServiceAlerts");
            this.f31598c = bVar;
        }

        public final Object call() throws Exception {
            List list = this.f31598c.f31571g.get(this.f31597b);
            if (C13717b.m34258e(list)) {
                return null;
            }
            LineServiceAlertDigest lineServiceAlertDigest = (LineServiceAlertDigest) Collections.min(list, new C12772a());
            C12778f fVar = C12778f.this;
            fVar.getClass();
            String str = lineServiceAlertDigest.f23187d.get(0);
            return new C12775d(str, lineServiceAlertDigest.f23186c, fVar.mo39623c(str));
        }
    }

    /* renamed from: j80.f$f */
    public static class C12784f implements Callable<Map<ServerId, LineServiceAlertDigest>> {

        /* renamed from: b */
        public final C12773b f31600b;

        public C12784f(C12773b bVar) {
            C21100e.m49373x(bVar, "metroServiceAlerts");
            this.f31600b = bVar;
        }

        public final Object call() throws Exception {
            Map<ServerId, List<LineServiceAlertDigest>> map = this.f31600b.f31571g;
            if (C13717b.m34259f(map)) {
                return null;
            }
            C12772a aVar = new C12772a();
            HashMap hashMap = new HashMap(map.size());
            for (Map.Entry next : map.entrySet()) {
                hashMap.put((ServerId) next.getKey(), (LineServiceAlertDigest) Collections.min((Collection) next.getValue(), aVar));
            }
            return hashMap;
        }
    }

    /* renamed from: j80.f$g */
    public class C12785g implements Callable<Map<ServerId, C12775d>> {

        /* renamed from: b */
        public final ServerId f31601b;

        /* renamed from: c */
        public final C12773b f31602c;

        public C12785g(ServerId serverId, C12773b bVar) {
            C21100e.m49373x(serverId, "stopId");
            this.f31601b = serverId;
            C21100e.m49373x(bVar, "metroServiceAlerts");
            this.f31602c = bVar;
        }

        public final Object call() throws Exception {
            C13752e a = C12778f.m32583a(C12778f.this.f31586a);
            C4776h hVar = C12778f.m32584b(C12778f.this.f31586a).f50165a;
            C5269e d = C16759e.m42348d(hVar, "metroInfo");
            ServerId serverId = this.f31601b;
            MetroEntityType metroEntityType = MetroEntityType.TRANSIT_STOP;
            d.mo21066a(metroEntityType, serverId);
            d.mo21067b(metroEntityType);
            TransitStop c = new C5267c(a, "ServiceAlertsPreviewMapByStopId", hVar, d).mo21062P().mo21064c(this.f31601b);
            HashMap hashMap = new HashMap();
            Map<ServerId, List<LineServiceAlertDigest>> map = this.f31602c.f31571g;
            for (DbEntityRef<TransitLine> dbEntityRef : c.f23735g) {
                TransitLine transitLine = (TransitLine) dbEntityRef.get();
                List list = map.get(transitLine.mo24369b().f23694b);
                if (!C13717b.m34258e(list)) {
                    LineServiceAlertDigest lineServiceAlertDigest = (LineServiceAlertDigest) Collections.min(list, new C12772a());
                    ServerId serverId2 = transitLine.f23687c;
                    C12778f fVar = C12778f.this;
                    fVar.getClass();
                    String str = lineServiceAlertDigest.f23187d.get(0);
                    hashMap.put(serverId2, new C12775d(str, lineServiceAlertDigest.f23186c, fVar.mo39623c(str)));
                }
            }
            return hashMap;
        }
    }

    public C12778f(MoovitApplication<?, ?, ?> moovitApplication) {
        C21100e.m49373x(moovitApplication, "application");
        this.f31586a = moovitApplication;
        this.f31587b = moovitApplication.getSharedPreferences("service_alerts", 0);
        moovitApplication.registerComponentCallbacks(new C12779a());
    }

    /* renamed from: a */
    public static C13752e m32583a(MoovitApplication moovitApplication) throws Exception {
        C21100e.m49355o();
        if (UserContextLoader.m40004l(moovitApplication)) {
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

    /* renamed from: b */
    public static C19728f m32584b(MoovitApplication moovitApplication) throws Exception {
        C21100e.m49355o();
        C18299a aVar = moovitApplication.f37321e;
        C19728f fVar = (C19728f) aVar.mo50695h("METRO_CONTEXT", false);
        if (fVar != null) {
            return fVar;
        }
        StringBuilder k = C13555b.m33972k("Failed to load metro context: ");
        k.append(aVar.mo50694g("METRO_CONTEXT"));
        throw new ApplicationBugException(k.toString());
    }

    /* renamed from: c */
    public final C16918f<Long> mo39623c(String str) {
        return new C16918f<>(this.f31587b, new C16919g.C16925f(C25541a.m63881k("alert_id_", str), -1));
    }

    /* renamed from: d */
    public final Task<C12773b> mo39624d(boolean z) {
        return Tasks.call(MoovitExecutors.f37327IO, new C12780b(z));
    }

    /* renamed from: e */
    public final Task<C12775d> mo39625e(ServerId serverId) {
        return mo39624d(false).onSuccessTask(MoovitExecutors.COMPUTATION, new C1510d(4, this, serverId));
    }
}
