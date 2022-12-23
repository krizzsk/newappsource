package p102h0;

import android.widget.TextView;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import c00.C13720d;
import c00.C13722f;
import c00.C13723g;
import c90.C7579b;
import com.android.billingclient.api.C1949f;
import com.android.billingclient.api.C1953i;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.appupdate.C14223a;
import com.google.android.play.core.appupdate.C14226d;
import com.google.firebase.remoteconfig.internal.C14535a;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.actions.livelocation.LiveLocationTransitStopChooserFragment;
import com.moovit.app.carpool.ridedetails.C14838d;
import com.moovit.app.intro.getstarted.GetStartedFirstTimeUseActivity;
import com.moovit.app.mot.purchase.MotStationEntranceActivationActivity;
import com.moovit.app.subscription.MoovitSubscriptionsManager;
import com.moovit.carpool.FutureCarpoolRide;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.design.view.NumericStepperView;
import com.moovit.location.C16202a;
import com.moovit.location.LocationSettingsFixer;
import com.moovit.ticketing.purchase.history.TransactionHistoryActivity;
import com.moovit.ticketing.ticket.Ticket;
import com.moovit.ticketing.ticket.TicketId;
import com.moovit.transit.LocationDescriptor;
import com.moovit.transit.TransitStop;
import com.veriff.sdk.internal.C22389rl;
import com.veriff.sdk.internal.C22392rm;
import d80.C12600c;
import ja0.C12791b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import m80.C12887v;
import mf0.C24362h;
import mobi.lab.veriff.util.C24454g;
import p028ba.C1513g;
import p126ib.C5334b;
import p126ib.C5341h;
import p137ja.C5415f;
import p435de.C16591a;
import p450dt.C16701b;
import p495fq.C17063g;
import p501fw.C17103b;
import p507ge.C17186b;
import p507ge.C17187c;
import p531he.C17414q;
import p543hq.C17474b;
import p554id.C17563b;
import p638lr.C18262i;
import p660mq.C18421e;
import p672ne.C18540b;
import p695od.C18728c;
import p886wf.C20299d;
import p910xf.C20482k;
import p910xf.C20485l;
import p910xf.C20488n;
import p977zz.C20949l;
import p977zz.C20960q0;
import s90.C13072a;
import z70.C13324c;

/* renamed from: h0.e */
public final /* synthetic */ class C5021e implements CallbackToFutureAdapter.C0674b, C5415f.C5416a, C17186b, SuccessContinuation, C20488n.C20489a, C17563b, C12791b.C12792a, C20949l, C16202a.C16205c, NumericStepperView.C15863a, C1953i, SwipeRefreshLayout.C1274f, C22389rl.C22391b, Continuation {

    /* renamed from: b */
    public final /* synthetic */ int f16990b;

    /* renamed from: c */
    public final /* synthetic */ Object f16991c;

    public /* synthetic */ C5021e(Object obj, int i) {
        this.f16990b = i;
        this.f16991c = obj;
    }

    /* renamed from: a */
    public void mo20737a(C5415f fVar) {
        C5334b bVar = (C5334b) this.f16991c;
        O o = (C5341h) fVar;
        synchronized (bVar.f17779b) {
            boolean z = false;
            o.f17757b = 0;
            o.f17626d = null;
            O[] oArr = bVar.f17783f;
            int i = bVar.f17785h;
            bVar.f17785h = i + 1;
            oArr[i] = o;
            if (!bVar.f17780c.isEmpty() && bVar.f17785h > 0) {
                z = true;
            }
            if (z) {
                bVar.f17779b.notify();
            }
        }
    }

    public Object attachCompleter(CallbackToFutureAdapter.C0673a aVar) {
        C18728c cVar = (C18728c) this.f16991c;
        C5023g.m12859g(false, cVar, aVar, C14226d.m35352s0());
        return "nonCancellationPropagating[" + cVar + "]";
    }

    /* renamed from: b */
    public void mo20738b(C17414q qVar) {
        C16591a aVar = (C16591a) this.f16991c;
        synchronized (aVar) {
            if (aVar.f43236b instanceof C17187c) {
                aVar.f43237c.add(qVar);
            }
            aVar.f43236b.mo20738b(qVar);
        }
    }

    /* renamed from: c */
    public void mo9575c(C1949f fVar, List list) {
        C20960q0 q0Var = (C20960q0) this.f16991c;
        if (fVar.f6770a != 0) {
            list = null;
        }
        q0Var.invoke(list);
    }

    /* renamed from: d */
    public void mo20739d(C24454g gVar) {
        ((C22392rm) this.f16991c).m54639a(gVar);
    }

    /* renamed from: e */
    public void mo19991e(Object obj, C20482k.C20483a aVar) {
        C20482k kVar = (C20482k) this.f16991c;
        HashMap<Integer, HashSet<Integer>> hashMap = C20482k.f51856j;
        kVar.getClass();
        C20485l.f51866c.mo52681a(kVar);
        ((OnCanceledListener) obj).onCanceled();
    }

    /* renamed from: f */
    public void mo20740f(List list, Object obj, int i) {
        LiveLocationTransitStopChooserFragment liveLocationTransitStopChooserFragment = (LiveLocationTransitStopChooserFragment) this.f16991c;
        TransitStop transitStop = (TransitStop) obj;
        int i2 = LiveLocationTransitStopChooserFragment.f37422j;
        C24362h.m61211f(liveLocationTransitStopChooserFragment, "this$0");
        C24362h.m61211f(list, "<anonymous parameter 0>");
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "choose_stop_clicked");
        aVar.mo49937e(AnalyticsAttributeKey.SELECTED_ID, transitStop.f23730b);
        aVar.mo49935c(AnalyticsAttributeKey.SELECTED_INDEX, i);
        liveLocationTransitStopChooserFragment.mo22564R1(aVar.mo49933a());
        liveLocationTransitStopChooserFragment.mo46753L1(C18421e.class, new C1513g(transitStop, 5));
        liveLocationTransitStopChooserFragment.dismissAllowingStateLoss();
    }

    /* renamed from: g */
    public void mo19812g(NumericStepperView numericStepperView, int i) {
        int i2;
        MotStationEntranceActivationActivity motStationEntranceActivationActivity = (MotStationEntranceActivationActivity) this.f16991c;
        TextView textView = motStationEntranceActivationActivity.f39040n0;
        if (i > 1) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        textView.setVisibility(i2);
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "tickets_counter_changed");
        aVar.mo49935c(AnalyticsAttributeKey.COUNT, i);
        motStationEntranceActivationActivity.mo44545v2(aVar.mo49933a());
    }

    /* renamed from: h */
    public void mo5770h(int i, Object obj) {
        switch (this.f16990b) {
            case 10:
                GetStartedFirstTimeUseActivity getStartedFirstTimeUseActivity = (GetStartedFirstTimeUseActivity) this.f16991c;
                MoovitActivity moovitActivity = (MoovitActivity) obj;
                int i2 = GetStartedFirstTimeUseActivity.f38453p0;
                getStartedFirstTimeUseActivity.getClass();
                GetStartedFirstTimeUseActivity.m37960B2();
                getStartedFirstTimeUseActivity.mo45245y2(true);
                return;
            default:
                ((LocationSettingsFixer) this.f16991c).mo48524e((MoovitActivity) obj, (C15682c<?>) null, i);
                return;
        }
    }

    public boolean invoke(Object obj) {
        FutureCarpoolRide futureCarpoolRide = ((C14838d) this.f16991c).f37891h;
        ((C14838d.C14839a) obj).mo44910p();
        return true;
    }

    public void onRefresh() {
        C7579b bVar = ((TransactionHistoryActivity) this.f16991c).f23373U;
        bVar.mo23841a(bVar.f23078d, true);
    }

    public void onSuccess(Object obj) {
        int i;
        C17063g gVar = (C17063g) this.f16991c;
        C14223a aVar = (C14223a) obj;
        gVar.f44230g = aVar;
        if (aVar != null) {
            i = aVar.f35739b;
        } else {
            i = 0;
        }
        gVar.f44231h = i;
        gVar.mo49522q(gVar.mo49514i());
    }

    public Task then(Object obj) {
        List<LocationDescriptor> list = null;
        switch (this.f16990b) {
            case 4:
                C20299d dVar = (C20299d) obj;
                int[] iArr = C14535a.f36685k;
                return Tasks.forResult((C14535a.C14536a) this.f16991c);
            case 12:
                MoovitSubscriptionsManager moovitSubscriptionsManager = (MoovitSubscriptionsManager) this.f16991c;
                HashSet hashSet = MoovitSubscriptionsManager.f39757g;
                moovitSubscriptionsManager.getClass();
                ArrayList c = C13720d.m34273c((List) obj, (C13722f) null, new C18262i(8));
                ExecutorService executorService = MoovitExecutors.COMPUTATION;
                return Tasks.call(executorService, new C17103b(moovitSubscriptionsManager, 0)).onSuccessTask(executorService, new C18540b(1, moovitSubscriptionsManager, c));
            case 15:
                LatLonE6 latLonE6 = (LatLonE6) this.f16991c;
                C12600c cVar = (C12600c) obj;
                if (cVar != null) {
                    list = cVar.f31149f;
                }
                return Tasks.forResult(new C13324c.C13325a(list, latLonE6));
            default:
                TicketId ticketId = (TicketId) this.f16991c;
                ThreadPoolExecutor threadPoolExecutor = C12887v.f31893d;
                Ticket ticket = (Ticket) C13723g.m34286g(((C13072a) obj).f32332a, new C16701b(ticketId, 3));
                if (ticket != null) {
                    return Tasks.forResult(ticket);
                }
                return Tasks.forException(new ApplicationBugException("Couldn't find history user wallet ticket with id: " + ticketId));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: j20.d} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b7 A[LOOP:0: B:22:0x00b7->B:25:0x00c2, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object then(com.google.android.gms.tasks.Task r12) {
        /*
            r11 = this;
            int r0 = r11.f16990b
            r1 = 0
            r2 = 1
            r3 = 0
            switch(r0) {
                case 0: goto L_0x00f8;
                case 1: goto L_0x005d;
                case 2: goto L_0x000a;
                default: goto L_0x0008;
            }
        L_0x0008:
            goto L_0x012c
        L_0x000a:
            java.lang.Object r0 = r11.f16991c
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = r12.isSuccessful()
            if (r2 == 0) goto L_0x0021
            java.lang.Object r3 = r12.getResult()
            if (r3 == 0) goto L_0x0021
            java.lang.Object r3 = r12.getResult()
            java.util.List r3 = (java.util.List) r3
            goto L_0x0025
        L_0x0021:
            java.util.List r3 = java.util.Collections.emptyList()
        L_0x0025:
            if (r2 == 0) goto L_0x002d
            ys.e$a r12 = new ys.e$a
            r12.<init>((java.lang.String) r0, (java.util.List) r3)
            goto L_0x0037
        L_0x002d:
            ys.e$a r3 = new ys.e$a
            java.lang.Exception r12 = r12.getException()
            r3.<init>((java.lang.String) r0, (java.lang.Exception) r12)
            r12 = r3
        L_0x0037:
            if (r2 == 0) goto L_0x005c
            java.util.List<zendesk.support.SimpleArticle> r2 = r12.f52401b
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x005c
            boolean r2 = p977zz.C20964s0.m49090h(r0)
            if (r2 == 0) goto L_0x005c
            ys.e$a r2 = new ys.e$a
            java.util.List<zendesk.support.SimpleArticle> r12 = r12.f52401b
            r3 = 5
            int r4 = r12.size()
            int r3 = java.lang.Math.min(r3, r4)
            java.util.List r12 = r12.subList(r1, r3)
            r2.<init>((java.lang.String) r0, (java.util.List) r12)
            r12 = r2
        L_0x005c:
            return r12
        L_0x005d:
            java.lang.Object r0 = r11.f16991c
            com.moovit.app.ads.MobileAdsManager r0 = (com.moovit.app.ads.MobileAdsManager) r0
            java.util.concurrent.atomic.AtomicBoolean r4 = r0.f37463e
            boolean r4 = r4.compareAndSet(r1, r2)
            if (r4 == 0) goto L_0x00f2
            boolean r4 = r0.f37462d
            if (r4 == 0) goto L_0x00f2
            com.moovit.MoovitApplication<?, ?, ?> r4 = r0.f37461c
            tp.i r4 = r4.mo44558j()
            u2.a r4 = r4.f50173c
            com.moovit.MoovitApplication<?, ?, ?> r5 = r0.f37461c
            com.moovit.analytics.AnalyticsFlowKey r6 = com.moovit.analytics.AnalyticsFlowKey.APP
            hq.b[] r7 = new p543hq.C17474b[r2]
            hq.b$a r8 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r9 = com.moovit.analytics.AnalyticsEventKey.AD
            r8.<init>(r9)
            com.moovit.analytics.AnalyticsAttributeKey r9 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r10 = "mobile_ads_initialization_start"
            r8.mo49939g(r9, r10)
            hq.b r8 = r8.mo49933a()
            r7[r1] = r8
            r4.getClass()
            p269u2.C6677a.m15759j(r5, r6, r1, r7)
            long r4 = android.os.SystemClock.elapsedRealtime()
            hf.b r1 = p532hf.C17427b.m43467a()
            r1.getClass()
            java.lang.String r1 = "ads_sdk_initialize"
            com.google.firebase.perf.metrics.Trace r1 = com.google.firebase.perf.metrics.Trace.m36075d(r1)
            r1.start()
            java.util.concurrent.atomic.AtomicReference<com.moovit.app.useraccount.manager.profile.UserAdsTargetingData> r6 = r0.f37472n
            com.moovit.MoovitApplication<?, ?, ?> r7 = r0.f37461c
            com.moovit.app.useraccount.manager.profile.UserAdsTargetingData$b r8 = com.moovit.app.useraccount.manager.profile.UserAdsTargetingData.f40605c
            java.lang.String r9 = "mobile_ads_manager_user_targeting_data.dat"
            java.lang.Object r7 = p389bl.C13641g.m34133v(r7, r9, r8)
            com.moovit.app.useraccount.manager.profile.UserAdsTargetingData r7 = (com.moovit.app.useraccount.manager.profile.UserAdsTargetingData) r7
        L_0x00b7:
            boolean r8 = r6.compareAndSet(r3, r7)
            if (r8 == 0) goto L_0x00be
            goto L_0x00c4
        L_0x00be:
            java.lang.Object r8 = r6.get()
            if (r8 == 0) goto L_0x00b7
        L_0x00c4:
            com.moovit.MoovitApplication<?, ?, ?> r3 = r0.f37461c
            com.moovit.app.ads.s r6 = new com.moovit.app.ads.s
            r6.<init>(r0, r1, r4)
            com.google.android.gms.ads.MobileAds.initialize(r3, r6)
            com.google.android.gms.ads.MobileAds.setAppMuted(r2)
            java.util.concurrent.ExecutorService r1 = com.moovit.MoovitExecutors.SINGLE
            d0.e0 r2 = new d0.e0
            r3 = 9
            r2.<init>(r0, r3)
            r1.execute(r2)
            com.moovit.MoovitApplication<?, ?, ?> r1 = r0.f37461c
            com.moovit.app.ads.u r2 = new com.moovit.app.ads.u
            r2.<init>(r0)
            j2.a r1 = p130j2.C5367a.m13473a(r1)
            android.content.IntentFilter r3 = new android.content.IntentFilter
            java.lang.String r4 = "com.moovit.subscriptions.action.updated"
            r3.<init>(r4)
            r1.mo21146b(r2, r3)
        L_0x00f2:
            android.os.ConditionVariable r0 = r0.f37464f
            r0.block()
            return r12
        L_0x00f8:
            java.lang.Object r0 = r11.f16991c
            vf.b r0 = (p862vf.C20118b) r0
            r0.getClass()
            boolean r3 = r12.isSuccessful()
            if (r3 == 0) goto L_0x0127
            wf.c r1 = r0.f51041c
            r1.mo52464b()
            java.lang.Object r1 = r12.getResult()
            if (r1 == 0) goto L_0x0126
            java.lang.Object r12 = r12.getResult()
            wf.d r12 = (p886wf.C20299d) r12
            org.json.JSONArray r12 = r12.f51472d
            rd.b r1 = r0.f51039a
            if (r1 != 0) goto L_0x011d
            goto L_0x0126
        L_0x011d:
            java.util.ArrayList r12 = p862vf.C20118b.m47698g(r12)     // Catch:{ AbtException | JSONException -> 0x0126 }
            rd.b r0 = r0.f51039a     // Catch:{ AbtException | JSONException -> 0x0126 }
            r0.mo51678b(r12)     // Catch:{ AbtException | JSONException -> 0x0126 }
        L_0x0126:
            r1 = 1
        L_0x0127:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r1)
            return r12
        L_0x012c:
            java.lang.Object r0 = r11.f16991c
            com.moovit.transit.LocationDescriptor r0 = (com.moovit.transit.LocationDescriptor) r0
            boolean r1 = r12.isSuccessful()
            if (r1 == 0) goto L_0x013d
            java.lang.Object r12 = r12.getResult()
            r3 = r12
            j20.d r3 = (j20.C17707d) r3
        L_0x013d:
            if (r3 != 0) goto L_0x0140
            goto L_0x0146
        L_0x0140:
            com.moovit.transit.LocationDescriptor r0 = r3.f45454e
            if (r0 != 0) goto L_0x0146
            com.moovit.transit.LocationDescriptor r0 = r3.f45450a
        L_0x0146:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p102h0.C5021e.then(com.google.android.gms.tasks.Task):java.lang.Object");
    }
}
