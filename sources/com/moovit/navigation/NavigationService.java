package com.moovit.navigation;

import a10.C13386a;
import aa0.C7537i;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import androidx.lifecycle.C1031o;
import androidx.lifecycle.C1045x;
import androidx.lifecycle.C1047z;
import androidx.lifecycle.Lifecycle;
import c00.C13717b;
import c00.C13729j;
import c00.C13734o;
import com.moovit.MoovitLooperService;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.commons.utils.service.LooperService;
import com.moovit.location.C16202a;
import com.moovit.mock.MockLocationsMode;
import com.moovit.navigation.event.NavigationStartEvent;
import d40.C4351g;
import d40.C4364k;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p269u2.C6677a;
import p304x.C7082o;
import p304x.C7099r1;
import p435de.C16596f;
import p543hq.C17474b;
import p669mz.C18482c;
import p810sz.C19617r;
import p824tp.C19731i;
import p977zz.C20943i;
import p977zz.C20944i0;
import p977zz.C20975x0;

public class NavigationService extends MoovitLooperService implements C1031o {

    /* renamed from: s */
    public static final C19617r.C19618a<Navigable> f15071s = new C19617r.C19618a<>();

    /* renamed from: n */
    public final C4364k f15072n = new C4364k(this);

    /* renamed from: o */
    public final HashMap f15073o = new HashMap();

    /* renamed from: p */
    public final HashSet f15074p = new HashSet();

    /* renamed from: q */
    public final AtomicBoolean f15075q = new AtomicBoolean();

    /* renamed from: r */
    public C7537i<NavigationState> f15076r;

    public NavigationService() {
        this.f41044e = 2;
    }

    /* renamed from: D */
    public static void m11305D(ContextWrapper contextWrapper, String str) {
        Intent intent = new Intent(contextWrapper, NavigationService.class);
        intent.setAction("com.moovit.navigation_service.action.resume_navigation");
        intent.putExtra("com.moovit.navigation_service.navigable_id_extra", str);
        contextWrapper.startService(intent);
    }

    /* renamed from: G */
    public static void m11306G(Context context) {
        Intent intent = new Intent(context, NavigationService.class);
        intent.setAction("com.moovit.navigation_service.action.stop_all_navigation");
        intent.putExtra("com.moovit.navigation_service.close_navigable_extra", true);
        context.startService(intent);
    }

    /* renamed from: s */
    public static void m11307s(NavigationService navigationService) {
        synchronized (navigationService) {
            for (C4351g c : navigationService.f15073o.values()) {
                c.mo19853c();
            }
        }
    }

    /* renamed from: u */
    public static synchronized C19617r m11308u() {
        C19617r<Navigable> b;
        synchronized (NavigationService.class) {
            b = f15071s.mo51970b();
        }
        return b;
    }

    /* renamed from: z */
    public static Intent m11309z(Context context, String str, String str2) {
        Intent intent = new Intent(context, NavigationService.class);
        intent.setAction("com.moovit.navigation_service.action.stop_navigation");
        intent.putExtra("com.moovit.navigation_service.navigable_id_extra", str);
        intent.putExtra("com.moovit.navigation_service.close_navigable_extra", true);
        intent.putExtra("com.moovit.navigation_service.close_navigable_reason_extra", str2);
        return intent;
    }

    /* renamed from: A */
    public final void mo19668A(Intent intent) {
        String stringExtra = intent.getStringExtra("com.moovit.navigation_service.navigable_id_extra");
        for (NavigationState next : mo19690y()) {
            if (stringExtra.equals(next.f15079b.mo19639e0())) {
                mo19672F(new C4351g(this, next));
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.RESUME_NAVIGATION);
                aVar.mo49939g(AnalyticsAttributeKey.NAVIGABLE_ID, next.f15079b.mo19639e0());
                mo19671E(aVar.mo49933a());
                MockLocationsMode mockLocationsMode = (MockLocationsMode) C13386a.f33223c.f43936b;
                MockLocationsMode mockLocationsMode2 = MockLocationsMode.NONE;
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003f, code lost:
        if (r0.exists() == false) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
        r0.delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0044, code lost:
        if (r4 != null) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0046, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        r0 = f40.C4681a.f15949a;
        mo19672F(new d40.C4351g(r3, r4));
        mo19674I();
        r0 = new p543hq.C17474b.C17475a(com.moovit.analytics.AnalyticsEventKey.NAVIGATION_STARTED);
        r0.mo49939g(com.moovit.analytics.AnalyticsAttributeKey.NAVIGABLE_ID, r4.mo19639e0());
        r0.mo49935c(com.moovit.analytics.AnalyticsAttributeKey.BATTERY_CONSUMPTION, (int) p977zz.C20975x0.m49120g(r3));
        mo19671E(r0.mo49933a());
        r4 = (com.moovit.mock.MockLocationsMode) a10.C13386a.f33223c.f43936b;
        r4 = com.moovit.mock.MockLocationsMode.NONE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x002b, code lost:
        if (r0.exists() != false) goto L_0x0041;
     */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19669B(android.content.Intent r4) {
        /*
            r3 = this;
            java.lang.String r0 = "com.moovit.navigation_service.navigable_temp_filename_extra"
            java.lang.String r4 = r4.getStringExtra(r0)
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            sz.r r4 = m11308u()
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0039, all -> 0x002e }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0039, all -> 0x002e }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0039, all -> 0x002e }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0039, all -> 0x002e }
            sz.d r2 = new sz.d     // Catch:{ IOException -> 0x0039, all -> 0x002e }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0039, all -> 0x002e }
            java.lang.Object r4 = r2.mo51962q(r4)     // Catch:{ IOException -> 0x0039, all -> 0x002e }
            com.moovit.navigation.Navigable r4 = (com.moovit.navigation.Navigable) r4     // Catch:{ IOException -> 0x0039, all -> 0x002e }
            r1.close()     // Catch:{ IOException -> 0x0039, all -> 0x002e }
            boolean r1 = r0.exists()
            if (r1 == 0) goto L_0x0044
            goto L_0x0041
        L_0x002e:
            r4 = move-exception
            boolean r1 = r0.exists()
            if (r1 == 0) goto L_0x0038
            r0.delete()
        L_0x0038:
            throw r4
        L_0x0039:
            r4 = 0
            boolean r1 = r0.exists()
            if (r1 == 0) goto L_0x0044
        L_0x0041:
            r0.delete()
        L_0x0044:
            if (r4 != 0) goto L_0x0047
            return
        L_0x0047:
            int r0 = f40.C4681a.f15949a
            d40.g r0 = new d40.g
            r0.<init>((com.moovit.navigation.NavigationService) r3, (com.moovit.navigation.Navigable) r4)
            r3.mo19672F(r0)
            r3.mo19674I()
            hq.b$a r0 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r1 = com.moovit.analytics.AnalyticsEventKey.NAVIGATION_STARTED
            r0.<init>(r1)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.NAVIGABLE_ID
            java.lang.String r4 = r4.mo19639e0()
            r0.mo49939g(r1, r4)
            com.moovit.analytics.AnalyticsAttributeKey r4 = com.moovit.analytics.AnalyticsAttributeKey.BATTERY_CONSUMPTION
            float r1 = p977zz.C20975x0.m49120g(r3)
            int r1 = (int) r1
            r0.mo49935c(r4, r1)
            hq.b r4 = r0.mo49933a()
            r3.mo19671E(r4)
            f00.g$b r4 = a10.C13386a.f33223c
            T r4 = r4.f43936b
            com.moovit.mock.MockLocationsMode r4 = (com.moovit.mock.MockLocationsMode) r4
            com.moovit.mock.MockLocationsMode r4 = com.moovit.mock.MockLocationsMode.NONE
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.navigation.NavigationService.mo19669B(android.content.Intent):void");
    }

    /* renamed from: C */
    public final void mo19670C(String str, int i, boolean z) {
        Iterator it = new HashSet(this.f15073o.keySet()).iterator();
        while (it.hasNext()) {
            mo19673H((String) it.next(), str, z);
        }
        for (NavigationState navigationState : mo19690y()) {
            mo19673H(navigationState.f15079b.mo19639e0(), str, z);
        }
        if (this.f15073o.isEmpty()) {
            stopForeground(true);
            stopSelf(i);
        }
    }

    /* renamed from: E */
    public final void mo19671E(C17474b bVar) {
        C6677a aVar = C19731i.m47197a(this).f50173c;
        aVar.getClass();
        C6677a.m15759j(this, AnalyticsFlowKey.NAVIGATION_SERVICE, false, bVar);
    }

    /* renamed from: F */
    public final void mo19672F(C4351g gVar) {
        this.f15073o.put(gVar.f15325b.mo19639e0(), gVar);
        gVar.f15325b.mo19639e0();
        gVar.f15327d = true;
        Handler handler = new Handler(gVar.f15324a.f41041b);
        C4351g.C4352a aVar = gVar.f15333j;
        Uri build = C4351g.f15323p.buildUpon().appendPath(gVar.f15325b.mo19639e0()).build();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.moovit.navigable_manager.action.critical_area_triggered");
        intentFilter.addDataScheme(build.getScheme());
        intentFilter.addDataAuthority(build.getHost(), (String) null);
        intentFilter.addDataPath(build.getPath(), 0);
        gVar.registerReceiver(aVar, intentFilter, (String) null, handler);
        gVar.registerReceiver(gVar.f15334k, new IntentFilter("com.moovit.navigable_manager.action.update_navigable"), (String) null, handler);
        C4351g.C4355d dVar = gVar.f15336m;
        IntentFilter intentFilter2 = new IntentFilter();
        if (C20943i.m49051d(19)) {
            intentFilter2.addAction("android.location.MODE_CHANGED");
        } else {
            intentFilter2.addAction("android.location.PROVIDERS_CHANGED");
        }
        gVar.registerReceiver(dVar, intentFilter2, (String) null, handler);
        C16202a.registerPassiveBroadcastReceiver(gVar, gVar.f15337n, handler);
        gVar.mo19857g(new NavigationStartEvent(gVar.f15325b.mo19639e0()));
        gVar.mo19855e();
        gVar.mo19854d();
        gVar.mo19861k();
    }

    /* renamed from: H */
    public final void mo19673H(String str, String str2, boolean z) {
        boolean z2;
        C4351g gVar = (C4351g) this.f15073o.get(str);
        if (gVar != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            gVar.mo19859i(z);
            this.f15073o.remove(str);
        }
        C7537i<NavigationState> iVar = this.f15076r;
        iVar.mo51499b();
        ListIterator<T> listIterator = iVar.f48432b.listIterator();
        while (true) {
            C13729j jVar = (C13729j) listIterator;
            if (!jVar.hasNext()) {
                break;
            } else if (str.equals(((NavigationState) jVar.next()).f15079b.mo19639e0())) {
                if (z) {
                    ((C13734o) listIterator).remove();
                } else if (z2) {
                    ((C13734o) listIterator).set(gVar.f15326c);
                }
            }
        }
        this.f15076r.mo51500c();
        this.f15074p.remove(new C20944i0(str, Boolean.valueOf(z)));
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.NAVIGATION_ENDED);
        aVar.mo49939g(AnalyticsAttributeKey.NAVIGABLE_ID, str);
        aVar.mo49934b(AnalyticsAttributeKey.BATTERY_CONSUMPTION, C20975x0.m49120g(this));
        aVar.mo49941i(AnalyticsAttributeKey.CLOSE_NAVIGABLE, z);
        AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.REASON;
        if (str2 == null) {
            str2 = "";
        }
        aVar.mo49939g(analyticsAttributeKey, str2);
        mo19671E(aVar.mo49933a());
        MockLocationsMode mockLocationsMode = (MockLocationsMode) C13386a.f33223c.f43936b;
        MockLocationsMode mockLocationsMode2 = MockLocationsMode.NONE;
    }

    /* renamed from: I */
    public final void mo19674I() {
        mo19686t();
        HashSet hashSet = new HashSet(this.f15073o.keySet());
        C7537i<NavigationState> iVar = this.f15076r;
        iVar.mo51499b();
        ListIterator<T> listIterator = iVar.f48432b.listIterator();
        while (true) {
            C13729j jVar = (C13729j) listIterator;
            if (!jVar.hasNext()) {
                break;
            }
            String e0 = ((NavigationState) jVar.next()).f15079b.mo19639e0();
            C4351g gVar = (C4351g) this.f15073o.get(e0);
            if (gVar != null) {
                ((C13734o) listIterator).set(gVar.f15326c);
                hashSet.remove(e0);
            }
        }
        C7537i<NavigationState> iVar2 = this.f15076r;
        iVar2.mo51499b();
        C18482c<T> cVar = iVar2.f48432b;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            cVar.add(((C4351g) this.f15073o.get((String) it.next())).f15326c);
        }
        this.f15076r.mo51500c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00be, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo19675d(int r9, android.content.Intent r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            if (r10 == 0) goto L_0x0008
            java.lang.String r0 = r10.getAction()     // Catch:{ all -> 0x00b2 }
            goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            if (r0 != 0) goto L_0x001b
            de.f r9 = p435de.C16596f.m42113a()     // Catch:{ all -> 0x00b2 }
            com.moovit.commons.utils.ApplicationBugException r10 = new com.moovit.commons.utils.ApplicationBugException     // Catch:{ all -> 0x00b2 }
            java.lang.String r0 = "Null intent/action in NavigationService.onHandledIntent"
            r10.<init>((java.lang.String) r0)     // Catch:{ all -> 0x00b2 }
            r9.mo49364c(r10)     // Catch:{ all -> 0x00b2 }
            monitor-exit(r8)
            return
        L_0x001b:
            java.lang.String r1 = "com.moovit.navigation_service.navigable_id_extra"
            java.lang.String r1 = r10.getStringExtra(r1)     // Catch:{ all -> 0x00b2 }
            java.util.HashMap r2 = r8.f15073o     // Catch:{ all -> 0x00b2 }
            java.lang.Object r1 = r2.get(r1)     // Catch:{ all -> 0x00b2 }
            d40.g r1 = (d40.C4351g) r1     // Catch:{ all -> 0x00b2 }
            r2 = -1
            int r3 = r0.hashCode()     // Catch:{ all -> 0x00b2 }
            r4 = 0
            r5 = 2
            r6 = 3
            r7 = 1
            switch(r3) {
                case 479318606: goto L_0x0054;
                case 905594405: goto L_0x004a;
                case 1091287410: goto L_0x0040;
                case 1505846000: goto L_0x0036;
                default: goto L_0x0035;
            }     // Catch:{ all -> 0x00b2 }
        L_0x0035:
            goto L_0x005d
        L_0x0036:
            java.lang.String r3 = "com.moovit.navigation_service.action.stop_navigation"
            boolean r3 = r0.equals(r3)     // Catch:{ all -> 0x00b2 }
            if (r3 == 0) goto L_0x005d
            r2 = 2
            goto L_0x005d
        L_0x0040:
            java.lang.String r3 = "com.moovit.navigation_service.action.start_navigation"
            boolean r3 = r0.equals(r3)     // Catch:{ all -> 0x00b2 }
            if (r3 == 0) goto L_0x005d
            r2 = 0
            goto L_0x005d
        L_0x004a:
            java.lang.String r3 = "com.moovit.navigation_service.action.resume_navigation"
            boolean r3 = r0.equals(r3)     // Catch:{ all -> 0x00b2 }
            if (r3 == 0) goto L_0x005d
            r2 = 1
            goto L_0x005d
        L_0x0054:
            java.lang.String r3 = "com.moovit.navigation_service.action.stop_all_navigation"
            boolean r3 = r0.equals(r3)     // Catch:{ all -> 0x00b2 }
            if (r3 == 0) goto L_0x005d
            r2 = 3
        L_0x005d:
            if (r2 == 0) goto L_0x00ba
            if (r2 == r7) goto L_0x00b4
            if (r2 == r5) goto L_0x008c
            if (r2 != r6) goto L_0x0075
            java.lang.String r0 = "com.moovit.navigation_service.close_navigable_extra"
            boolean r0 = r10.getBooleanExtra(r0, r4)     // Catch:{ all -> 0x00b2 }
            java.lang.String r1 = "com.moovit.navigation_service.close_navigable_reason_extra"
            java.lang.String r10 = r10.getStringExtra(r1)     // Catch:{ all -> 0x00b2 }
            r8.mo19670C(r10, r9, r0)     // Catch:{ all -> 0x00b2 }
            goto L_0x00bd
        L_0x0075:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00b2 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b2 }
            r10.<init>()     // Catch:{ all -> 0x00b2 }
            java.lang.String r1 = "Unknown command action: "
            r10.append(r1)     // Catch:{ all -> 0x00b2 }
            r10.append(r0)     // Catch:{ all -> 0x00b2 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x00b2 }
            r9.<init>(r10)     // Catch:{ all -> 0x00b2 }
            throw r9     // Catch:{ all -> 0x00b2 }
        L_0x008c:
            if (r1 == 0) goto L_0x00bd
            java.lang.String r0 = "com.moovit.navigation_service.navigable_id_extra"
            java.lang.String r0 = r10.getStringExtra(r0)     // Catch:{ all -> 0x00b2 }
            java.lang.String r1 = "com.moovit.navigation_service.close_navigable_extra"
            boolean r1 = r10.getBooleanExtra(r1, r4)     // Catch:{ all -> 0x00b2 }
            java.lang.String r2 = "com.moovit.navigation_service.close_navigable_reason_extra"
            java.lang.String r10 = r10.getStringExtra(r2)     // Catch:{ all -> 0x00b2 }
            r8.mo19673H(r0, r10, r1)     // Catch:{ all -> 0x00b2 }
            java.util.HashMap r10 = r8.f15073o     // Catch:{ all -> 0x00b2 }
            boolean r10 = r10.isEmpty()     // Catch:{ all -> 0x00b2 }
            if (r10 == 0) goto L_0x00bd
            r8.stopForeground(r7)     // Catch:{ all -> 0x00b2 }
            r8.stopSelf(r9)     // Catch:{ all -> 0x00b2 }
            goto L_0x00bd
        L_0x00b2:
            r9 = move-exception
            goto L_0x00bf
        L_0x00b4:
            if (r1 != 0) goto L_0x00bd
            r8.mo19668A(r10)     // Catch:{ all -> 0x00b2 }
            goto L_0x00bd
        L_0x00ba:
            r8.mo19669B(r10)     // Catch:{ all -> 0x00b2 }
        L_0x00bd:
            monitor-exit(r8)
            return
        L_0x00bf:
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.navigation.NavigationService.mo19675d(int, android.content.Intent):void");
    }

    /* renamed from: h */
    public final void mo19676h(Message message) {
        if (message.obj == null) {
            C16596f.m42113a().mo49363b("NavigationService.onStartMessage called with null intent");
        }
        super.mo19676h(message);
    }

    /* renamed from: k */
    public final Set<String> mo19677k() {
        Set<String> k = super.mo19677k();
        ((HashSet) k).add("NAVIGATION_STATE_STORE");
        return k;
    }

    /* renamed from: m */
    public final void mo19678m(Object obj, String str) {
    }

    /* renamed from: n */
    public final void mo19679n() {
        super.mo19679n();
        for (C4351g gVar : this.f15073o.values()) {
            m11305D(this, gVar.f15325b.mo19639e0());
        }
    }

    @C1045x(Lifecycle.Event.ON_START)
    public void onApplicationStart() {
        this.f15073o.size();
        this.f15075q.set(true);
        LooperService.C15783a aVar = this.f41042c;
        if (aVar != null) {
            aVar.post(new C7082o(this, 18));
        }
    }

    @C1045x(Lifecycle.Event.ON_STOP)
    public void onApplicationStop() {
        this.f15073o.size();
        this.f15075q.set(false);
        LooperService.C15783a aVar = this.f41042c;
        if (aVar != null) {
            aVar.post(new C7099r1(this, 12));
        }
    }

    public final IBinder onBind(Intent intent) {
        return this.f15072n;
    }

    public final void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
        stopSelf();
    }

    /* renamed from: p */
    public final synchronized void mo19684p() {
        super.mo19684p();
        C1047z.f3987j.f3993g.mo4226c(this);
        mo19674I();
        this.f15076r = null;
        Iterator it = this.f15073o.values().iterator();
        while (it.hasNext()) {
            ((C4351g) it.next()).mo19859i(false);
            it.remove();
        }
    }

    /* renamed from: q */
    public final void mo19685q() {
        super.mo19685q();
        this.f15076r = (C7537i) mo44584j("NAVIGATION_STATE_STORE");
        C4364k kVar = this.f15072n;
        synchronized (kVar) {
            NavigationService navigationService = (NavigationService) kVar.f44367b;
            Iterator it = kVar.f15359c.iterator();
            while (it.hasNext()) {
                ((C4364k.C4365a) it.next()).mo19875a(navigationService);
                it.remove();
            }
        }
        C1047z.f3987j.f3993g.mo4224a(this);
    }

    /* renamed from: t */
    public final void mo19686t() {
        C7537i<NavigationState> iVar = this.f15076r;
        iVar.mo51499b();
        C18482c<T> cVar = iVar.f48432b;
        if (!C13717b.m34258e(cVar)) {
            Iterator<T> it = cVar.iterator();
            while (true) {
                C13729j jVar = (C13729j) it;
                if (!jVar.hasNext()) {
                    return;
                }
                if (((NavigationState) jVar.next()).f15079b.getExpirationTime() < System.currentTimeMillis()) {
                    ((C18482c.C18483a) it).remove();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        return null;
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.moovit.navigation.Navigable mo19687v(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.HashSet r0 = r4.f15074p     // Catch:{ all -> 0x0032 }
            zz.i0 r1 = new zz.i0     // Catch:{ all -> 0x0032 }
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0032 }
            r1.<init>(r5, r2)     // Catch:{ all -> 0x0032 }
            boolean r0 = r0.contains(r1)     // Catch:{ all -> 0x0032 }
            java.util.HashSet r1 = r4.f15074p     // Catch:{ all -> 0x0032 }
            zz.i0 r2 = new zz.i0     // Catch:{ all -> 0x0032 }
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0032 }
            r2.<init>(r5, r3)     // Catch:{ all -> 0x0032 }
            boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x0032 }
            r2 = 0
            if (r0 != 0) goto L_0x0030
            if (r1 == 0) goto L_0x0021
            goto L_0x0030
        L_0x0021:
            java.util.HashMap r0 = r4.f15073o     // Catch:{ all -> 0x0032 }
            java.lang.Object r5 = r0.get(r5)     // Catch:{ all -> 0x0032 }
            d40.g r5 = (d40.C4351g) r5     // Catch:{ all -> 0x0032 }
            if (r5 != 0) goto L_0x002c
            goto L_0x002e
        L_0x002c:
            com.moovit.navigation.Navigable r2 = r5.f15325b     // Catch:{ all -> 0x0032 }
        L_0x002e:
            monitor-exit(r4)
            return r2
        L_0x0030:
            monitor-exit(r4)
            return r2
        L_0x0032:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.navigation.NavigationService.mo19687v(java.lang.String):com.moovit.navigation.Navigable");
    }

    /* renamed from: w */
    public final synchronized HashSet mo19688w() {
        HashSet hashSet;
        hashSet = new HashSet();
        for (C4351g gVar : this.f15073o.values()) {
            String e0 = gVar.f15325b.mo19639e0();
            boolean contains = this.f15074p.contains(new C20944i0(e0, Boolean.TRUE));
            boolean contains2 = this.f15074p.contains(new C20944i0(e0, Boolean.FALSE));
            if (!contains && !contains2) {
                hashSet.add(gVar.f15325b);
            }
        }
        return hashSet;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        return null;
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized d40.C4346b mo19689x(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.HashSet r0 = r4.f15074p     // Catch:{ all -> 0x0034 }
            zz.i0 r1 = new zz.i0     // Catch:{ all -> 0x0034 }
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0034 }
            r1.<init>(r5, r2)     // Catch:{ all -> 0x0034 }
            boolean r0 = r0.contains(r1)     // Catch:{ all -> 0x0034 }
            java.util.HashSet r1 = r4.f15074p     // Catch:{ all -> 0x0034 }
            zz.i0 r2 = new zz.i0     // Catch:{ all -> 0x0034 }
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0034 }
            r2.<init>(r5, r3)     // Catch:{ all -> 0x0034 }
            boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x0034 }
            r2 = 0
            if (r0 != 0) goto L_0x0032
            if (r1 == 0) goto L_0x0021
            goto L_0x0032
        L_0x0021:
            java.util.HashMap r0 = r4.f15073o     // Catch:{ all -> 0x0034 }
            java.lang.Object r5 = r0.get(r5)     // Catch:{ all -> 0x0034 }
            d40.g r5 = (d40.C4351g) r5     // Catch:{ all -> 0x0034 }
            if (r5 != 0) goto L_0x002c
            goto L_0x0030
        L_0x002c:
            d40.b r2 = r5.mo19852b()     // Catch:{ all -> 0x0034 }
        L_0x0030:
            monitor-exit(r4)
            return r2
        L_0x0032:
            monitor-exit(r4)
            return r2
        L_0x0034:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.navigation.NavigationService.mo19689x(java.lang.String):d40.b");
    }

    /* renamed from: y */
    public final synchronized Set<NavigationState> mo19690y() {
        if (this.f15076r == null) {
            return Collections.emptySet();
        }
        mo19686t();
        HashSet hashSet = new HashSet();
        C7537i<NavigationState> iVar = this.f15076r;
        iVar.mo51499b();
        Iterator<T> it = iVar.f48432b.iterator();
        while (true) {
            C13729j jVar = (C13729j) it;
            if (!jVar.hasNext()) {
                return hashSet;
            }
            NavigationState navigationState = (NavigationState) jVar.next();
            String e0 = navigationState.f15079b.mo19639e0();
            boolean containsKey = this.f15073o.containsKey(e0);
            boolean contains = this.f15074p.contains(new C20944i0(e0, Boolean.TRUE));
            boolean contains2 = this.f15074p.contains(new C20944i0(e0, Boolean.FALSE));
            if ((!containsKey || contains2) && !contains) {
                hashSet.add(navigationState);
            }
        }
    }
}
