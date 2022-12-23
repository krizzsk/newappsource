package d40;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.IBinder;
import ce0.C21100e;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.navigation.C4226a;
import com.moovit.navigation.Navigable;
import com.moovit.navigation.NavigationService;
import com.moovit.navigation.event.NavigableUpdateEvent;
import com.moovit.navigation.event.NavigationDeviationEvent;
import com.moovit.navigation.event.NavigationEvent;
import com.moovit.navigation.event.NavigationProgressEvent;
import com.moovit.navigation.event.NavigationReturnEvent;
import com.moovit.navigation.event.NavigationStartEvent;
import com.moovit.navigation.event.NavigationStopEvent;
import com.usebutton.sdk.internal.api.AppActionRequest;
import e40.C4553a;
import java.util.ArrayList;
import java.util.Iterator;
import p130j2.C5367a;
import p241s0.C6302b;
import p435de.C16596f;
import p810sz.C19617r;

/* renamed from: d40.j */
public class C4360j extends ContextWrapper {

    /* renamed from: g */
    public static final Class<NavigationService> f15349g = NavigationService.class;

    /* renamed from: a */
    public NavigationService f15350a;

    /* renamed from: b */
    public final C6302b f15351b = new C6302b();

    /* renamed from: c */
    public boolean f15352c = false;

    /* renamed from: d */
    public final C4361a f15353d = new C4361a();

    /* renamed from: e */
    public final C4362b f15354e = new C4362b();

    /* renamed from: f */
    public final C4363c f15355f = new C4363c();

    /* renamed from: d40.j$a */
    public class C4361a implements ServiceConnection {
        public C4361a() {
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            ArrayList arrayList;
            if (C4360j.this.f15352c && componentName.getPackageName().equals(C4360j.this.getPackageName()) && componentName.getClassName().equals(C4360j.f15349g.getName())) {
                C4364k kVar = (C4364k) iBinder;
                C4360j.this.f15350a = (NavigationService) kVar.f44367b;
                C4359i iVar = new C4359i(this);
                synchronized (kVar) {
                    NavigationService navigationService = (NavigationService) kVar.f44367b;
                    if (navigationService.f37337j.get()) {
                        iVar.mo19875a(navigationService);
                    } else {
                        kVar.f15359c.add(iVar);
                    }
                }
                C4360j jVar = C4360j.this;
                NavigationService navigationService2 = jVar.f15350a;
                C4362b bVar = jVar.f15354e;
                synchronized (navigationService2) {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("com.moovit.navigation_event.action.navigation_start");
                    intentFilter.addAction("com.moovit.navigation_event.action.navigation_stop");
                    intentFilter.addAction("com.moovit.navigation_event.action.navigation_update");
                    intentFilter.addAction("com.moovit.navigation_event.action.navigation_progress");
                    intentFilter.addAction("com.moovit.navigation_event.action.navigation_deviation");
                    intentFilter.addAction("com.moovit.navigation_event.action.navigation_return");
                    C5367a.m13473a(jVar).mo21146b(bVar, intentFilter);
                    arrayList = new ArrayList();
                    for (C4351g gVar : navigationService2.f15073o.values()) {
                        if (gVar.f15327d) {
                            arrayList.add(new NavigationStartEvent(gVar.f15325b.mo19639e0()));
                            C4226a aVar = gVar.f15328e;
                            NavigationProgressEvent navigationProgressEvent = aVar.f15101f;
                            if (navigationProgressEvent != null) {
                                arrayList.add(navigationProgressEvent);
                            }
                            NavigationDeviationEvent navigationDeviationEvent = aVar.f15102g;
                            if (navigationDeviationEvent != null) {
                                arrayList.add(navigationDeviationEvent);
                            }
                        }
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((NavigationEvent) it.next()).mo19717b(C4360j.this.f15355f);
                }
            }
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            if (C4360j.this.f15350a != null && componentName.getPackageName().equals(C4360j.this.getPackageName()) && componentName.getClassName().equals(C4360j.f15349g.getName())) {
                C4360j jVar = C4360j.this;
                C4362b bVar = jVar.f15354e;
                C19617r.C19618a<Navigable> aVar = NavigationService.f15071s;
                C5367a.m13473a(jVar).mo21148d(bVar);
                C4360j.this.mo19878c();
                C4360j jVar2 = C4360j.this;
                jVar2.f15350a = null;
                jVar2.f15351b.clear();
            }
        }
    }

    /* renamed from: d40.j$b */
    public class C4362b extends BroadcastReceiver {
        public C4362b() {
        }

        public final void onReceive(Context context, Intent intent) {
            if (C4360j.this.f15352c) {
                ((NavigationEvent) intent.getParcelableExtra("com.moovit.navigation_event.event_obj")).mo19717b(C4360j.this.f15355f);
            }
        }
    }

    /* renamed from: d40.j$c */
    public class C4363c implements C4553a {
        public C4363c() {
        }

        /* renamed from: a */
        public final void mo19864a(NavigationProgressEvent navigationProgressEvent) {
            Navigable navigable = (Navigable) C4360j.this.f15351b.getOrDefault(navigationProgressEvent.f15109b, null);
            if (navigable != null) {
                C4360j.this.mo19881f(navigable, navigationProgressEvent);
            }
        }

        /* renamed from: b */
        public final void mo19865b(NavigableUpdateEvent navigableUpdateEvent) {
            Navigable navigable = (Navigable) C4360j.this.f15351b.getOrDefault(navigableUpdateEvent.f15109b, null);
            if (navigable != null) {
                C4360j.this.mo19879d(navigable);
            }
        }

        /* renamed from: c */
        public final void mo19866c(NavigationStopEvent navigationStopEvent) {
            String str = navigationStopEvent.f15109b;
            Navigable navigable = (Navigable) C4360j.this.f15351b.getOrDefault(str, null);
            if (navigable != null) {
                C4360j.this.mo19884i(navigable, navigationStopEvent);
                C4360j.this.f15351b.remove(str);
            }
        }

        /* renamed from: d */
        public final void mo19867d(NavigationStartEvent navigationStartEvent) {
            String str = navigationStartEvent.f15109b;
            Navigable v = C4360j.this.f15350a.mo19687v(str);
            if (v != null && C4360j.this.mo19876a(v)) {
                C4360j.this.f15351b.put(str, v);
                C4360j.this.mo19883h(v, navigationStartEvent);
            }
        }

        /* renamed from: e */
        public final void mo19868e(NavigationDeviationEvent navigationDeviationEvent) {
            Navigable navigable = (Navigable) C4360j.this.f15351b.getOrDefault(navigationDeviationEvent.f15109b, null);
            if (navigable != null) {
                C4360j.this.mo19880e(navigable, navigationDeviationEvent);
            }
        }

        /* renamed from: f */
        public final void mo19869f(NavigationReturnEvent navigationReturnEvent) {
            Navigable navigable = (Navigable) C4360j.this.f15351b.getOrDefault(navigationReturnEvent.f15109b, null);
            if (navigable != null) {
                C4360j.this.mo19882g(navigable);
            }
        }
    }

    public C4360j(Context context) {
        super(context);
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
    }

    /* renamed from: a */
    public boolean mo19876a(Navigable navigable) {
        return true;
    }

    /* renamed from: b */
    public void mo19877b(NavigationService navigationService) {
    }

    /* renamed from: c */
    public void mo19878c() {
    }

    /* renamed from: d */
    public void mo19879d(Navigable navigable) {
    }

    /* renamed from: e */
    public void mo19880e(Navigable navigable, NavigationDeviationEvent navigationDeviationEvent) {
    }

    /* renamed from: f */
    public void mo19881f(Navigable navigable, NavigationProgressEvent navigationProgressEvent) {
    }

    /* renamed from: g */
    public void mo19882g(Navigable navigable) {
    }

    /* renamed from: h */
    public void mo19883h(Navigable navigable, NavigationStartEvent navigationStartEvent) {
        throw null;
    }

    /* renamed from: i */
    public void mo19884i(Navigable navigable, NavigationStopEvent navigationStopEvent) {
        throw null;
    }

    /* renamed from: j */
    public final void mo19885j() {
        if (!this.f15352c) {
            this.f15352c = true;
            if (!bindService(new Intent(this, NavigationService.class), this.f15353d, 65)) {
                C16596f.m42113a().mo49364c(new ApplicationBugException(C25541a.m63880j("Unable to bind to service ", NavigationService.class)));
            }
        }
    }

    /* renamed from: k */
    public final void mo19886k() {
        if (this.f15352c) {
            this.f15352c = false;
            C4362b bVar = this.f15354e;
            C19617r.C19618a<Navigable> aVar = NavigationService.f15071s;
            C5367a.m13473a(this).mo21148d(bVar);
            unbindService(this.f15353d);
        }
    }
}
