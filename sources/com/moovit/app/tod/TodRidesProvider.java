package com.moovit.app.tod;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.SystemClock;
import b00.C13556a;
import c70.C13756i;
import ce0.C21100e;
import ci0.C21211f;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitApplication;
import com.moovit.MoovitExecutors;
import com.moovit.app.MoovitAppApplication;
import com.moovit.app.ads.C14762w;
import com.moovit.app.tod.model.TodRide;
import com.moovit.app.tod.model.TodSubscription;
import com.moovit.gcm.GcmListenerService;
import com.moovit.gcm.payload.GcmPayload;
import com.moovit.request.RequestOptions;
import com.usebutton.sdk.internal.api.AppActionRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import mf0.C24361g;
import p130j2.C5367a;
import p241s0.C6302b;
import p596jx.C17952a0;
import p596jx.C17978z;
import p824tp.C19725d;
import p824tp.C19728f;
import p906wz.C20431c;
import p906wz.C20436g;
import p977zz.C20944i0;
import w40.C25761d;

public class TodRidesProvider extends BroadcastReceiver {

    /* renamed from: g */
    public static final long f40030g = TimeUnit.MINUTES.toMillis(5);

    /* renamed from: h */
    public static volatile TodRidesProvider f40031h;

    /* renamed from: a */
    public final C15455a f40032a = new C15455a();

    /* renamed from: b */
    public final MoovitApplication<?, ?, ?> f40033b;

    /* renamed from: c */
    public final C15456b f40034c = new C15456b();

    /* renamed from: d */
    public C13556a f40035d = null;

    /* renamed from: e */
    public final ArrayList f40036e = new ArrayList();

    /* renamed from: f */
    public final ArrayList f40037f = new ArrayList();

    /* renamed from: com.moovit.app.tod.TodRidesProvider$a */
    public class C15455a extends C21211f {
        public C15455a() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C17978z zVar = (C17978z) cVar;
            TodRidesProvider.this.f40035d = null;
        }

        /* renamed from: d */
        public final boolean mo316d(C20431c cVar, IOException iOException) {
            C17978z zVar = (C17978z) cVar;
            TodRidesProvider.m39560a(TodRidesProvider.this, iOException);
            return true;
        }

        /* renamed from: i */
        public final boolean mo319i(C20431c cVar, IOException iOException) {
            C17978z zVar = (C17978z) cVar;
            TodRidesProvider.m39560a(TodRidesProvider.this, iOException);
            return true;
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C17952a0 a0Var = (C17952a0) gVar;
            ArrayList arrayList = a0Var.f46020m;
            ArrayList arrayList2 = a0Var.f46021n;
            Tasks.call(MoovitExecutors.COMPUTATION, new C15460f(((C17978z) cVar).f51759b, arrayList, arrayList2)).addOnCompleteListener(MoovitExecutors.MAIN_THREAD, new C14762w(1, this, arrayList, arrayList2));
        }
    }

    /* renamed from: com.moovit.app.tod.TodRidesProvider$b */
    public static class C15456b {

        /* renamed from: a */
        public List<TodRide> f40039a;

        /* renamed from: b */
        public C6302b f40040b;

        /* renamed from: c */
        public List<TodSubscription> f40041c;

        /* renamed from: d */
        public C6302b f40042d;

        /* renamed from: e */
        public long f40043e = -1;
    }

    /* renamed from: com.moovit.app.tod.TodRidesProvider$c */
    public interface C15457c {
        /* renamed from: s */
        void mo46199s(Exception exc);

        /* renamed from: x */
        void mo46200x(TodRide todRide);
    }

    /* renamed from: com.moovit.app.tod.TodRidesProvider$d */
    public interface C15458d {
        /* renamed from: a0 */
        void mo46186a0();

        /* renamed from: q1 */
        void mo46187q1(String str);

        /* renamed from: r */
        void mo46188r(IOException iOException);
    }

    /* renamed from: com.moovit.app.tod.TodRidesProvider$e */
    public class C15459e implements C15458d, C19725d.C19726a {

        /* renamed from: b */
        public final Context f40044b;

        /* renamed from: c */
        public final String f40045c;

        /* renamed from: d */
        public final C15457c f40046d;

        public C15459e(Context context, String str, C15457c cVar) {
            C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
            this.f40044b = context;
            this.f40045c = str;
            C21100e.m49373x(cVar, WidgetMessageParser.KEY_CALLBACK);
            this.f40046d = cVar;
        }

        /* renamed from: a0 */
        public final void mo46186a0() {
            TodRidesProvider todRidesProvider = TodRidesProvider.this;
            String str = this.f40045c;
            C6302b bVar = todRidesProvider.f40034c.f40040b;
            Object obj = null;
            if (bVar != null) {
                obj = bVar.getOrDefault(str, null);
            }
            TodRide todRide = (TodRide) obj;
            if (todRide != null) {
                TodRidesProvider.this.mo46196e(this);
                C19725d.m47191a(this.f40044b).mo52074c(this);
                this.f40046d.mo46200x(todRide);
                return;
            }
            this.f40046d.mo46199s(new NoSuchElementException(String.format("ride not found. ride=%s", new Object[]{this.f40045c})));
        }

        /* renamed from: b */
        public final void mo44844b(Context context) {
            TodRidesProvider.this.mo46196e(this);
            C19725d.m47191a(this.f40044b).mo52074c(this);
        }

        /* renamed from: q1 */
        public final void mo46187q1(String str) {
        }

        /* renamed from: r */
        public final void mo46188r(IOException iOException) {
            TodRidesProvider.this.mo46196e(this);
            C19725d.m47191a(this.f40044b).mo52074c(this);
            this.f40046d.mo46199s(iOException);
        }
    }

    /* renamed from: com.moovit.app.tod.TodRidesProvider$f */
    public static class C15460f implements Callable<C20944i0<List<TodRide>, List<TodSubscription>>> {

        /* renamed from: b */
        public final Context f40048b;

        /* renamed from: c */
        public final List<TodRide> f40049c;

        /* renamed from: d */
        public final List<TodSubscription> f40050d;

        public C15460f(Context context, ArrayList arrayList, ArrayList arrayList2) {
            C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
            this.f40048b = context.getApplicationContext();
            C21100e.m49373x(arrayList, "rides");
            this.f40049c = arrayList;
            C21100e.m49373x(arrayList2, "subscriptions");
            this.f40050d = arrayList2;
        }

        public final Object call() throws Exception {
            C19728f a = C19728f.m47195a(this.f40048b);
            if (a != null) {
                try {
                    Tasks.await(Tasks.whenAll((Collection<? extends Task<?>>) C24361g.m61161e0(this.f40048b, a, this.f40049c)), 5, TimeUnit.SECONDS);
                } catch (Throwable unused) {
                }
                try {
                    Tasks.await(Tasks.whenAll((Collection<? extends Task<?>>) C24361g.m61162f0(this.f40048b, a, this.f40050d)), 5, TimeUnit.SECONDS);
                } catch (Throwable unused2) {
                }
            }
            return new C20944i0(this.f40049c, this.f40050d);
        }
    }

    public TodRidesProvider(MoovitApplication<?, ?, ?> moovitApplication) {
        C21100e.m49373x(moovitApplication, "application");
        this.f40033b = moovitApplication;
        GcmListenerService.m40504g(this, MoovitAppApplication.m37038x(), "tod_ride");
        C25761d.m64300h(moovitApplication, this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.moovit.tod_rides_provider.action.book");
        intentFilter.addAction("com.moovit.tod_rides_provider.action.cancel_ride");
        intentFilter.addAction("com.moovit.tod_rides_provider.action.login");
        intentFilter.addAction("com.moovit.tod_rides_provider.action.ride_status_change");
        intentFilter.addAction("com.moovit.tod_rides_provider.action.reassign");
        intentFilter.addAction("com.moovit.tod_rides_provider.action.ride_rating");
        intentFilter.addAction("com.moovit.tod_rides_provider.action.cancel_subscription");
        C5367a.m13473a(moovitApplication).mo21146b(this, intentFilter);
    }

    /* renamed from: a */
    public static void m39560a(TodRidesProvider todRidesProvider, IOException iOException) {
        todRidesProvider.f40037f.clear();
        todRidesProvider.f40037f.addAll(todRidesProvider.f40036e);
        Iterator it = todRidesProvider.f40037f.iterator();
        while (it.hasNext()) {
            C15458d dVar = (C15458d) it.next();
            if (iOException != null) {
                dVar.mo46188r(iOException);
            } else {
                dVar.mo46186a0();
            }
        }
    }

    /* renamed from: c */
    public static TodRidesProvider m39561c() {
        TodRidesProvider todRidesProvider = f40031h;
        if (todRidesProvider != null) {
            return todRidesProvider;
        }
        throw new IllegalStateException("you must call initialize first");
    }

    /* renamed from: d */
    public static void m39562d(Context context, String str) {
        C5367a.m13473a(context).mo21147c(new Intent(str));
    }

    /* renamed from: b */
    public final void mo46195b(C15458d dVar) {
        dVar.getClass();
        this.f40036e.add(dVar);
    }

    /* renamed from: e */
    public final void mo46196e(C15458d dVar) {
        dVar.getClass();
        this.f40036e.remove(dVar);
    }

    /* renamed from: f */
    public final boolean mo46197f() {
        boolean z;
        C15456b bVar = this.f40034c;
        boolean z2 = false;
        if (bVar.f40043e == -1 || SystemClock.elapsedRealtime() - bVar.f40043e >= f40030g) {
            z = false;
        } else {
            z = true;
        }
        boolean z3 = !z;
        if (z3 && this.f40035d == null) {
            z2 = true;
        }
        if (z2) {
            C17978z zVar = new C17978z(this.f40033b.mo44560l());
            C13756i iVar = this.f40033b.f37322f;
            RequestOptions c = iVar.mo40680c();
            c.f42909f = true;
            this.f40035d = iVar.mo40684g(C17978z.class.getName(), zVar, c, this.f40032a);
        }
        return z3;
    }

    public final void onReceive(Context context, Intent intent) {
        String str;
        intent.getAction();
        this.f40034c.f40043e = -1;
        Uri uri = GcmListenerService.f41490b;
        GcmPayload gcmPayload = (GcmPayload) intent.getParcelableExtra("payload");
        if (gcmPayload != null) {
            str = gcmPayload.mo47977c();
        } else {
            str = intent.getAction();
        }
        if (str != null) {
            this.f40037f.clear();
            this.f40037f.addAll(this.f40036e);
            Iterator it = this.f40037f.iterator();
            while (it.hasNext()) {
                ((C15458d) it.next()).mo46187q1(str);
            }
        }
    }
}
