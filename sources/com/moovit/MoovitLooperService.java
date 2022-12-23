package com.moovit;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import c70.C13752e;
import c70.C13756i;
import com.moovit.C14688a;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.car.operators.C15684a;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.commons.utils.service.LooperService;
import com.moovit.request.RequestOptions;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p130j2.C5367a;
import p435de.C16596f;
import p824tp.C19722a0;
import p824tp.C19725d;
import p906wz.C20431c;
import p906wz.C20436g;
import p977zz.C20932c0;

public abstract class MoovitLooperService extends LooperService implements C13756i.C13760d {

    /* renamed from: m */
    public static final /* synthetic */ int f37332m = 0;

    /* renamed from: f */
    public C14688a f37333f;

    /* renamed from: g */
    public final C14685a f37334g = new C14685a();

    /* renamed from: h */
    public final C14686b f37335h = new C14686b();

    /* renamed from: i */
    public final ArrayList f37336i = new ArrayList();

    /* renamed from: j */
    public final AtomicBoolean f37337j = new AtomicBoolean(false);

    /* renamed from: k */
    public C13756i f37338k;

    /* renamed from: l */
    public C19725d f37339l;

    /* renamed from: com.moovit.MoovitLooperService$a */
    public class C14685a extends BroadcastReceiver {
        public C14685a() {
        }

        public final void onReceive(Context context, Intent intent) {
            LooperService.C15783a aVar = MoovitLooperService.this.f41042c;
            if (aVar != null) {
                aVar.sendMessageAtFrontOfQueue(aVar.obtainMessage(2));
            }
        }
    }

    /* renamed from: com.moovit.MoovitLooperService$b */
    public class C14686b implements C14688a.C14690b {
        public C14686b() {
        }

        /* renamed from: a */
        public final void mo20300a() {
            MoovitLooperService moovitLooperService = MoovitLooperService.this;
            int i = MoovitLooperService.f37332m;
            moovitLooperService.mo44587r();
        }

        /* renamed from: c */
        public final void mo20301c(Object obj, String str) {
            MoovitLooperService.this.mo19678m(obj, str);
        }

        /* renamed from: d */
        public final void mo20302d(Object obj, String str) {
        }
    }

    /* renamed from: com.moovit.MoovitLooperService$c */
    public class C14687c implements Runnable {

        /* renamed from: b */
        public final ConditionVariable f37342b;

        public C14687c(ConditionVariable conditionVariable) {
            this.f37342b = conditionVariable;
        }

        public final void run() {
            boolean z;
            try {
                LooperService.C15783a aVar = MoovitLooperService.this.f41042c;
                if (aVar == null) {
                    z = true;
                } else {
                    z = false;
                }
                MoovitLooperService.this.getClass();
                MoovitLooperService.this.f37337j.get();
                C16596f a = C16596f.m42113a();
                a.mo49363b(MoovitLooperService.this.f41043d + ": ClearStateRunnable: isDestroyed=" + z + ", isReady=" + MoovitLooperService.this.f37337j.get());
                if (!z) {
                    MoovitLooperService moovitLooperService = MoovitLooperService.this;
                    C19725d dVar = moovitLooperService.f37339l;
                    moovitLooperService.f37339l = null;
                    aVar.removeMessages(1);
                    MoovitLooperService.this.f37336i.clear();
                    MoovitLooperService.this.f37333f.mo44596d();
                    if (MoovitLooperService.this.f37337j.get()) {
                        MoovitLooperService.this.mo19679n();
                        if (MoovitLooperService.this.f37337j.get()) {
                            MoovitLooperService.this.mo19684p();
                        } else if (dVar != null) {
                            dVar.mo52073b();
                        }
                    }
                    MoovitLooperService.this.m36969l();
                    MoovitLooperService.this.f37339l = dVar;
                }
            } catch (Exception e) {
                MoovitLooperService.this.getClass();
                String str = MoovitLooperService.this.f41043d;
                C16596f a2 = C16596f.m42113a();
                a2.mo49363b("Name: " + MoovitLooperService.this.f41043d);
                a2.mo49364c(new ApplicationBugException("Failed to clear service state.", e));
                MoovitLooperService.this.stopSelf();
            } catch (Throwable th) {
                this.f37342b.open();
                throw th;
            }
            this.f37342b.open();
        }
    }

    public MoovitLooperService() {
        super("NavigationService");
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m36969l() {
        C16596f a = C16596f.m42113a();
        a.mo49363b(this.f41043d + ": loadDataParts()");
        C14688a aVar = new C14688a(mo19677k(), this.f37335h);
        this.f37333f = aVar;
        if (aVar.mo44597e()) {
            mo44587r();
        }
    }

    /* renamed from: N */
    public final void mo40691N(C20431c cVar, ServerException serverException, boolean z) {
    }

    /* renamed from: Y */
    public final void mo40692Y(C20431c cVar, IOException iOException, boolean z) {
    }

    /* renamed from: a */
    public final void mo40693a() {
    }

    /* renamed from: c */
    public final void mo40694c(C20431c cVar, C20436g gVar) {
    }

    /* renamed from: g */
    public final void mo44582g(Message message) {
        if (message.what == 2) {
            mo44576o();
        } else {
            super.mo44582g(message);
        }
    }

    public Object getSystemService(String str) {
        C19725d dVar;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1817785029:
                if (str.equals("user_context")) {
                    c = 0;
                    break;
                }
                break;
            case -598704137:
                if (str.equals("car_operator_provider_service")) {
                    c = 1;
                    break;
                }
                break;
            case -493109629:
                if (str.equals("twitter_service_alerts_feeds")) {
                    c = 2;
                    break;
                }
                break;
            case -433561463:
                if (str.equals("metro_context")) {
                    c = 3;
                    break;
                }
                break;
            case -168568736:
                if (str.equals("ab_testing_manager")) {
                    c = 4;
                    break;
                }
                break;
            case 635108337:
                if (str.equals("gtfs_configuration")) {
                    c = 5;
                    break;
                }
                break;
            case 1422895613:
                if (str.equals("request_manager")) {
                    c = 6;
                    break;
                }
                break;
            case 1505637250:
                if (str.equals("user_configuration")) {
                    c = 7;
                    break;
                }
                break;
            case 2093653651:
                if (str.equals("destruction_notifier")) {
                    c = 8;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return mo44584j("USER_CONTEXT");
            case 1:
                return C15684a.m40087a();
            case 2:
                return mo44584j("TWITTER_SERVICE_ALERTS_FEEDS");
            case 3:
                return mo44584j("METRO_CONTEXT");
            case 4:
                return mo44584j("AB_TESTING_MANAGER");
            case 5:
                return mo44584j("GTFS_CONFIGURATION");
            case 6:
                return this.f37338k;
            case 7:
                return mo44584j("CONFIGURATION");
            case 8:
                synchronized (this) {
                    if (this.f37339l == null) {
                        this.f37339l = new C19725d(this);
                    }
                    dVar = this.f37339l;
                }
                return dVar;
            default:
                return super.getSystemService(str);
        }
    }

    /* renamed from: h */
    public void mo19676h(Message message) {
        boolean z;
        if (!this.f37337j.get()) {
            this.f37336i.add(message);
            C14688a aVar = this.f37333f;
            if (aVar.f37347d.size() + aVar.f37346c.size() == aVar.f37345b.size()) {
                z = true;
            } else {
                z = false;
            }
            if (z && !this.f37333f.mo44593a()) {
                C16596f a = C16596f.m42113a();
                a.mo49363b(this.f41043d + ": onStartMessage(), retry loading data parts.");
                this.f37333f.mo44596d();
                m36969l();
                return;
            }
            return;
        }
        super.mo19676h(message);
    }

    /* renamed from: j */
    public final <T> T mo44584j(String str) {
        return this.f37333f.mo44594b(str);
    }

    /* renamed from: k */
    public Set<String> mo19677k() {
        HashSet hashSet = new HashSet();
        hashSet.add("UPGRADER");
        hashSet.add("USER_CONTEXT");
        hashSet.add("USER_LOCALE_UPDATER");
        hashSet.add("METRO_CONTEXT");
        hashSet.add("CONFIGURATION");
        hashSet.add("GTFS_CONFIGURATION");
        return hashSet;
    }

    /* renamed from: m */
    public void mo19678m(Object obj, String str) {
    }

    /* renamed from: m0 */
    public final void mo40695m0(C20431c<?, ?> cVar, IOException iOException, boolean z) {
    }

    /* renamed from: n */
    public void mo19679n() {
        C16596f a = C16596f.m42113a();
        a.mo49363b(this.f41043d + ": onDataPartsReadyUpdated()");
    }

    /* renamed from: o */
    public void mo44576o() {
        C16596f a = C16596f.m42113a();
        a.mo49363b(this.f41043d + ": onDataPartsUpdated()");
        ConditionVariable conditionVariable = new ConditionVariable();
        new Handler(getMainLooper()).post(new C14687c(conditionVariable));
        conditionVariable.block();
    }

    /* renamed from: o0 */
    public final void mo40696o0(C20431c<?, ?> cVar, HttpURLConnection httpURLConnection, BadResponseException badResponseException) {
        cVar.getClass();
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        C16596f a = C16596f.m42113a();
        a.mo49363b(this.f41043d + ": onCreate()");
        C14685a aVar = this.f37334g;
        MoovitApplication<?, ?, ?> moovitApplication = MoovitApplication.f37317k;
        C5367a.m13473a(this).mo21146b(aVar, new IntentFilter("com.moovit.app.action.update_parts"));
        m36969l();
    }

    public final void onDestroy() {
        super.onDestroy();
        C16596f a = C16596f.m42113a();
        a.mo49363b(this.f41043d + ": onDestroy()");
        this.f37333f.mo44596d();
        if (this.f37337j.get()) {
            mo19684p();
        }
        C14685a aVar = this.f37334g;
        MoovitApplication<?, ?, ?> moovitApplication = MoovitApplication.f37317k;
        C5367a.m13473a(this).mo21148d(aVar);
    }

    /* renamed from: p */
    public void mo19684p() {
        C16596f a = C16596f.m42113a();
        a.mo49363b(this.f41043d + ": onDestroyReady()");
        this.f37337j.set(false);
        C19725d dVar = this.f37339l;
        if (dVar != null) {
            dVar.mo52073b();
        }
        this.f37338k.mo40683f();
        this.f37338k.mo40685h((C13752e) null);
    }

    /* renamed from: q */
    public void mo19685q() {
        C16596f a = C16596f.m42113a();
        a.mo49363b(this.f41043d + ": onReady()");
        this.f37338k.mo40685h(new C13752e(this, (C19722a0) MoovitApplication.f37317k.mo44557i("USER_CONTEXT"), (AnalyticsFlowKey) null));
    }

    /* renamed from: r */
    public final void mo44587r() {
        if (this.f41042c == null) {
            C16596f a = C16596f.m42113a();
            a.mo49363b(this.f41043d + ": setReady()");
            a.mo49364c(new ApplicationBugException("Moovit Service called setReady() after destruction."));
            return;
        }
        this.f37338k = new C13756i(new RequestOptions(), this, new Handler(this.f41041b), new C20932c0((String) null, 10));
        mo19685q();
        this.f37337j.set(true);
        Iterator it = this.f37336i.iterator();
        while (it.hasNext()) {
            mo19676h((Message) it.next());
        }
        this.f37336i.clear();
    }
}
