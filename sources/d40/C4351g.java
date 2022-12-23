package d40;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.PowerManager;
import android.text.format.DateUtils;
import android.util.SparseArray;
import ce0.C21100e;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.google.android.gms.location.GeofencingClient;
import com.google.android.gms.location.GeofencingEvent;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.location.C16202a;
import com.moovit.navigation.C4226a;
import com.moovit.navigation.C4231d;
import com.moovit.navigation.Navigable;
import com.moovit.navigation.NavigationGeofence;
import com.moovit.navigation.NavigationService;
import com.moovit.navigation.NavigationState;
import com.moovit.navigation.event.NavigableUpdateEvent;
import com.moovit.navigation.event.NavigationDeviationEvent;
import com.moovit.navigation.event.NavigationEvent;
import com.moovit.navigation.event.NavigationProgressEvent;
import com.moovit.navigation.event.NavigationReturnEvent;
import com.moovit.navigation.event.NavigationStartEvent;
import com.moovit.navigation.event.NavigationStopEvent;
import e40.C4553a;
import i20.C17556r;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p130j2.C5367a;
import p389bl.C13641g;
import p484ff.C16978i0;
import p543hq.C17474b;
import p824tp.C19740r;
import p926xv.C20628i;
import p977zz.C20927a0;
import p977zz.C20934d0;
import p977zz.C20943i;

/* renamed from: d40.g */
public final class C4351g extends ContextWrapper {

    /* renamed from: p */
    public static final Uri f15323p = Uri.parse("moovit://criticalarea");

    /* renamed from: a */
    public final NavigationService f15324a;

    /* renamed from: b */
    public final Navigable f15325b;

    /* renamed from: c */
    public final NavigationState f15326c;

    /* renamed from: d */
    public boolean f15327d = false;

    /* renamed from: e */
    public final C4226a f15328e;

    /* renamed from: f */
    public C4231d<?> f15329f = null;

    /* renamed from: g */
    public PendingIntent f15330g = null;

    /* renamed from: h */
    public AsyncTask<?, ?, ?> f15331h = null;

    /* renamed from: i */
    public final HashSet f15332i = new HashSet();

    /* renamed from: j */
    public final C4352a f15333j = new C4352a();

    /* renamed from: k */
    public final C4353b f15334k = new C4353b();

    /* renamed from: l */
    public final C4354c f15335l = new C4354c();

    /* renamed from: m */
    public final C4355d f15336m = new C4355d();

    /* renamed from: n */
    public final C4356e f15337n = new C4356e();

    /* renamed from: o */
    public final PendingIntent f15338o;

    /* renamed from: d40.g$a */
    public class C4352a extends BroadcastReceiver {
        public C4352a() {
        }

        public final void onReceive(Context context, Intent intent) {
            C4351g gVar = C4351g.this;
            GeofencingEvent fromIntent = GeofencingEvent.fromIntent(intent);
            gVar.getClass();
            if (fromIntent.hasError()) {
                GeofenceStatusCodes.getStatusCodeString(fromIntent.getErrorCode());
                GeofenceStatusCodes.getStatusCodeString(fromIntent.getErrorCode());
                return;
            }
            List<Geofence> triggeringGeofences = fromIntent.getTriggeringGeofences();
            int geofenceTransition = fromIntent.getGeofenceTransition();
            for (Geofence requestId : triggeringGeofences) {
                String requestId2 = requestId.getRequestId();
                int parseInt = Integer.parseInt(requestId2.substring(requestId2.lastIndexOf(58) + 1));
                if (geofenceTransition == 1) {
                    gVar.f15332i.add(Integer.valueOf(parseInt));
                } else {
                    gVar.f15332i.remove(Integer.valueOf(parseInt));
                }
            }
            gVar.f15332i.size();
            gVar.f15332i.size();
            gVar.mo19861k();
        }
    }

    /* renamed from: d40.g$b */
    public class C4353b extends BroadcastReceiver {
        public C4353b() {
        }

        public final void onReceive(Context context, Intent intent) {
            String stringExtra = intent.getStringExtra("com.moovit.navigable_manager.navigable_id_extra");
            Navigable navigable = C4351g.this.f15325b;
            if (navigable != null && navigable.mo19639e0().equals(stringExtra)) {
                C4351g gVar = C4351g.this;
                PowerManager.WakeLock newWakeLock = ((PowerManager) gVar.getSystemService("power")).newWakeLock(1, C4351g.class.getSimpleName());
                newWakeLock.acquire(TimeUnit.MINUTES.toMillis(2));
                AsyncTask<?, ?, ?> asyncTask = gVar.f15331h;
                if (asyncTask != null) {
                    asyncTask.cancel(true);
                    gVar.f15331h = null;
                }
                LocationRequest interval = new LocationRequest().setPriority(100).setInterval(0);
                NavigationService navigationService = gVar.f15324a;
                C16202a aVar = C16202a.get(navigationService);
                NavigationService navigationService2 = gVar.f15324a;
                new C17556r(navigationService, aVar.createLocationSource(navigationService2, navigationService2.f41041b, interval)).mo50015m(new C4350f(gVar, newWakeLock));
            }
        }
    }

    /* renamed from: d40.g$c */
    public class C4354c implements C4553a {
        public C4354c() {
        }

        /* renamed from: a */
        public final void mo19864a(NavigationProgressEvent navigationProgressEvent) {
            C4351g.this.f15325b.mo19604a(navigationProgressEvent);
        }

        /* renamed from: b */
        public final void mo19865b(NavigableUpdateEvent navigableUpdateEvent) {
        }

        /* renamed from: c */
        public final void mo19866c(NavigationStopEvent navigationStopEvent) {
            C4351g.this.f15325b.mo19610y0();
        }

        /* renamed from: d */
        public final void mo19867d(NavigationStartEvent navigationStartEvent) {
            C4351g gVar = C4351g.this;
            gVar.f15325b.mo19601L0(gVar);
        }

        /* renamed from: e */
        public final void mo19868e(NavigationDeviationEvent navigationDeviationEvent) {
            C4351g.this.f15325b.mo19609o0();
        }

        /* renamed from: f */
        public final void mo19869f(NavigationReturnEvent navigationReturnEvent) {
            C4351g.this.f15325b.mo19603Z();
        }
    }

    /* renamed from: d40.g$d */
    public class C4355d extends BroadcastReceiver {
        public C4355d() {
        }

        public final void onReceive(Context context, Intent intent) {
            C4351g.this.mo19854d();
        }
    }

    /* renamed from: d40.g$e */
    public class C4356e extends BroadcastReceiver {
        public C4356e() {
        }

        public final void onReceive(Context context, Intent intent) {
            C4351g.this.mo19854d();
        }
    }

    /* renamed from: d40.g$f */
    public static /* synthetic */ class C4357f {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15344a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.moovit.navigation.RequestedNavigationMode[] r0 = com.moovit.navigation.RequestedNavigationMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15344a = r0
                com.moovit.navigation.RequestedNavigationMode r1 = com.moovit.navigation.RequestedNavigationMode.REGULAR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f15344a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.navigation.RequestedNavigationMode r1 = com.moovit.navigation.RequestedNavigationMode.ACCURATE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: d40.C4351g.C4357f.<clinit>():void");
        }
    }

    public C4351g(NavigationService navigationService, Navigable navigable) {
        super(navigationService);
        C21100e.m49373x(navigationService, "owner");
        this.f15324a = navigationService;
        this.f15325b = navigable;
        C4226a aVar = new C4226a(this, navigable, LocationRequest.create().setPriority(100).setInterval(InstallSheetPresenter.LOADING_TIMER_DELAY_IN_MILLIS).setFastestInterval(1000), (C4366l) null);
        this.f15328e = aVar;
        this.f15326c = new NavigationState(navigable, aVar.f15099d);
        this.f15338o = mo19851a(navigable);
    }

    /* renamed from: a */
    public final PendingIntent mo19851a(Navigable navigable) {
        return PendingIntent.getService(getApplicationContext(), 0, NavigationService.m11309z(this.f15324a, navigable.mo19639e0(), "expiration"), C20927a0.m49010e(268435456));
    }

    /* renamed from: b */
    public final C4346b mo19852b() {
        int d = this.f15328e.mo19707d();
        SparseArray sparseArray = new SparseArray(d);
        for (int i = 0; i < d; i++) {
            C4347c e = this.f15328e.mo19708e(i);
            int i2 = e.f15316a;
            NavigationGeofence navigationGeofence = e.f15317b;
            if (navigationGeofence != null) {
                int i3 = navigationGeofence.f15051g.f15029g;
            }
            sparseArray.append(i2, new C13641g());
        }
        NavigationState navigationState = this.f15326c;
        return new C4346b(navigationState.f15080c.f15362a, sparseArray, navigationState.f15081d);
    }

    /* renamed from: c */
    public final void mo19853c() {
        this.f15324a.f15075q.get();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.USER_VISIBILITY_STATE_CHANGED);
        aVar.mo49939g(AnalyticsAttributeKey.NAVIGABLE_ID, this.f15325b.mo19639e0());
        aVar.mo49941i(AnalyticsAttributeKey.IS_USER_VISIBLE, this.f15324a.f15075q.get());
        mo19856f(aVar.mo49933a());
        mo19861k();
    }

    /* renamed from: d */
    public final void mo19854d() {
        if (C20934d0.m49031b(this)) {
            List<com.moovit.commons.geo.Geofence> X = this.f15325b.mo19638X();
            if (!X.isEmpty()) {
                GeofencingRequest.Builder builder = new GeofencingRequest.Builder();
                for (int i = 0; i < X.size(); i++) {
                    com.moovit.commons.geo.Geofence geofence = X.get(i);
                    LatLonE6 latLonE6 = geofence.f40974b;
                    Geofence.Builder transitionTypes = new Geofence.Builder().setCircularRegion(latLonE6.mo46922k(), latLonE6.mo46926o(), geofence.f40975c).setExpirationDuration(-1).setTransitionTypes(3);
                    StringBuilder k = C13555b.m33972k("com.moovit.nav.CritArea-");
                    k.append(this.f15325b.mo19639e0());
                    k.append(":");
                    k.append(i);
                    builder.addGeofence(transitionTypes.setRequestId(k.toString()).build());
                }
                GeofencingClient geofencingClient = LocationServices.getGeofencingClient((Context) this);
                Intent intent = new Intent("com.moovit.navigable_manager.action.critical_area_triggered", f15323p.buildUpon().appendPath(this.f15325b.mo19639e0()).build());
                int i2 = 134217728;
                if (C20943i.m49051d(31)) {
                    i2 = 167772160;
                }
                geofencingClient.addGeofences(builder.build(), PendingIntent.getBroadcast(getApplicationContext(), 0, intent, i2)).addOnCompleteListener((Executor) MoovitExecutors.COMPUTATION, new C16978i0(this, 5));
            }
        }
    }

    /* renamed from: e */
    public final void mo19855e() {
        long T0 = this.f15325b.mo19602T0();
        if (T0 >= System.currentTimeMillis()) {
            if (this.f15330g != null) {
                ((AlarmManager) getSystemService("alarm")).cancel(this.f15330g);
                this.f15330g = null;
            }
            DateUtils.formatDateTime(this, T0, 17);
            Intent intent = new Intent("com.moovit.navigable_manager.action.update_navigable");
            intent.putExtra("com.moovit.navigable_manager.navigable_id_extra", this.f15325b.mo19639e0());
            intent.setPackage(getPackageName());
            int i = 1073741824;
            if (C20943i.m49051d(31)) {
                i = 1107296256;
            }
            this.f15330g = PendingIntent.getBroadcast(this, 0, intent, i);
            ((AlarmManager) getSystemService("alarm")).set(0, T0, this.f15330g);
        }
    }

    /* renamed from: f */
    public final void mo19856f(C17474b bVar) {
        this.f15324a.mo19671E(bVar);
    }

    /* renamed from: g */
    public final void mo19857g(NavigationEvent navigationEvent) {
        NavigationService navigationService = this.f15324a;
        navigationService.getClass();
        C5367a a = C5367a.m13473a(navigationService);
        Intent intent = new Intent(navigationEvent.mo19718c());
        intent.putExtra("com.moovit.navigation_event.event_obj", navigationEvent);
        a.mo21147c(intent);
        navigationEvent.mo19717b(this.f15335l);
    }

    /* renamed from: h */
    public final void mo19858h(C4226a aVar) {
        C4231d<?> dVar = this.f15329f;
        if (dVar != aVar) {
            if (dVar != null) {
                dVar.mo19714m(false);
            }
            this.f15329f = aVar;
            if (aVar != null) {
                aVar.mo19714m(true);
            }
            this.f15325b.mo19600J1(this.f15329f);
        }
    }

    /* renamed from: i */
    public final void mo19859i(boolean z) {
        this.f15325b.mo19639e0();
        this.f15327d = false;
        if (this.f15329f != null) {
            mo19858h((C4226a) null);
        }
        mo19857g(new NavigationStopEvent(this.f15325b.mo19639e0(), z));
        AsyncTask<?, ?, ?> asyncTask = this.f15331h;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.f15331h = null;
        }
        if (this.f15330g != null) {
            ((AlarmManager) getSystemService("alarm")).cancel(this.f15330g);
            this.f15330g = null;
        }
        this.f15332i.clear();
        GeofencingClient geofencingClient = LocationServices.getGeofencingClient((Context) this);
        Intent intent = new Intent("com.moovit.navigable_manager.action.critical_area_triggered", f15323p.buildUpon().appendPath(this.f15325b.mo19639e0()).build());
        int i = 134217728;
        if (C20943i.m49051d(31)) {
            i = 167772160;
        }
        geofencingClient.removeGeofences(PendingIntent.getBroadcast(getApplicationContext(), 0, intent, i)).addOnCompleteListener((Executor) MoovitExecutors.COMPUTATION, new C20628i(this, 3));
        if (z) {
            this.f15325b.mo19608g2();
        }
        unregisterReceiver(this.f15333j);
        unregisterReceiver(this.f15334k);
        unregisterReceiver(this.f15336m);
        C16202a.unregisterPassiveBroadcastReceiver(this, this.f15337n);
    }

    /* renamed from: j */
    public final void mo19860j() {
        if (this.f15327d) {
            this.f15324a.startForeground(C19740r.nav_notification, this.f15325b.mo19643r1());
            return;
        }
        this.f15324a.stopForeground(true);
    }

    /* renamed from: k */
    public final void mo19861k() {
        int i = C4357f.f15344a[this.f15325b.mo19636H0().ordinal()];
        if (i != 1) {
            if (i == 2) {
                mo19858h(this.f15328e);
            }
        } else if (this.f15324a.f15075q.get() || !this.f15332i.isEmpty()) {
            mo19858h(this.f15328e);
        } else {
            mo19858h((C4226a) null);
        }
    }

    public C4351g(NavigationService navigationService, NavigationState navigationState) {
        super(navigationService);
        C21100e.m49373x(navigationService, "owner");
        this.f15324a = navigationService;
        Navigable navigable = navigationState.f15079b;
        this.f15325b = navigable;
        this.f15328e = new C4226a(this, navigable, LocationRequest.create().setPriority(100).setInterval(InstallSheetPresenter.LOADING_TIMER_DELAY_IN_MILLIS).setFastestInterval(1000), navigationState.f15080c);
        this.f15326c = navigationState;
        this.f15338o = mo19851a(navigable);
    }
}
