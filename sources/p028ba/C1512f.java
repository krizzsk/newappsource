package p028ba;

import android.view.MenuItem;
import androidx.appcompat.widget.C0475w0;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import c00.C13717b;
import c70.C13752e;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.app.subscription.MoovitSubscriptionsManager;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.network.model.ServerId;
import com.moovit.payment.account.externalpayment.ExternalPaymentMethod;
import com.moovit.payment.account.paymentmethod.PaymentAccountPaymentMethodsFragment;
import com.moovit.payment.account.paymentmethod.PaymentMethod;
import com.moovit.payment.clearance.ClearanceProvider;
import com.moovit.payment.clearance.ClearanceProviderType;
import h60.C17310e;
import j80.C12773b;
import j80.C12778f;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import m50.C18331g;
import p063da.C4407a;
import p853uu.C19998h;
import p853uu.C20000j;
import p974zw.C20917c;
import p977zz.C20949l;
import v40.C25750e;
import w50.C20277a;
import w50.C20283g;
import z50.C20809a;

/* renamed from: ba.f */
public final /* synthetic */ class C1512f implements C4407a.C4408a, C20949l, SuccessContinuation, C0475w0.C0476a, CallbackToFutureAdapter.C0674b, Continuation {

    /* renamed from: b */
    public final /* synthetic */ int f5434b;

    /* renamed from: c */
    public final /* synthetic */ Object f5435c;

    /* renamed from: d */
    public final /* synthetic */ Object f5436d;

    public /* synthetic */ C1512f(int i, Object obj, Object obj2) {
        this.f5434b = i;
        this.f5435c = obj;
        this.f5436d = obj2;
    }

    /* renamed from: C */
    public Object mo309C() {
        ((C1515i) this.f5435c).f5444c.mo6646G((Iterable) this.f5436d);
        return null;
    }

    public Object attachCompleter(CallbackToFutureAdapter.C0673a aVar) {
        return ((AtomicReference) this.f5435c).set(aVar);
    }

    public boolean invoke(Object obj) {
        switch (this.f5434b) {
            case 1:
                int i = C19998h.f50842n;
                ((C20000j) obj).mo52272n2("inspection_qr_code_viewer", (String) this.f5435c, (ServerId) this.f5436d, false);
                return true;
            default:
                int i2 = C18331g.f46746o;
                ((ClearanceProvider.C16293a) obj).mo48834o1((ClearanceProviderType) this.f5435c, (PaymentMethod) this.f5436d);
                return true;
        }
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        PaymentAccountPaymentMethodsFragment.C25687c cVar = (PaymentAccountPaymentMethodsFragment.C25687c) this.f5435c;
        ExternalPaymentMethod externalPaymentMethod = (ExternalPaymentMethod) this.f5436d;
        cVar.getClass();
        if (menuItem.getItemId() != C25750e.action_delete) {
            return false;
        }
        PaymentAccountPaymentMethodsFragment.m64194n2(PaymentAccountPaymentMethodsFragment.this, externalPaymentMethod.f64052b);
        return false;
    }

    public Task then(Object obj) {
        switch (this.f5434b) {
            case 2:
                MoovitSubscriptionsManager moovitSubscriptionsManager = (MoovitSubscriptionsManager) this.f5435c;
                List list = (List) obj;
                HashSet hashSet = MoovitSubscriptionsManager.f39757g;
                moovitSubscriptionsManager.getClass();
                if (C13717b.m34258e((List) this.f5436d)) {
                    return Tasks.forResult(null);
                }
                return moovitSubscriptionsManager.mo45939i(list);
            case 3:
                return Tasks.call(MoovitExecutors.f37327IO, new C20917c((C13752e) obj, (Long) this.f5436d, (String) this.f5435c));
            case 7:
                BigDecimal bigDecimal = C20283g.f51427r;
                return Tasks.call(MoovitExecutors.f37327IO, new C17310e((C20277a) this.f5435c, (C20809a) this.f5436d, (C13752e) obj));
            default:
                C12778f fVar = (C12778f) this.f5435c;
                ServerId serverId = (ServerId) this.f5436d;
                C12773b bVar = (C12773b) obj;
                int i = C12778f.f31585g;
                fVar.getClass();
                if (bVar == null) {
                    return Tasks.forException(new ApplicationBugException("metroServiceAlerts must not be null"));
                }
                return Tasks.call(MoovitExecutors.COMPUTATION, new C12778f.C12785g(serverId, bVar));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object then(com.google.android.gms.tasks.Task r15) {
        /*
            r14 = this;
            int r0 = r14.f5434b
            r1 = 1
            switch(r0) {
                case 0: goto L_0x007d;
                case 1: goto L_0x0008;
                default: goto L_0x0006;
            }
        L_0x0006:
            goto L_0x00ad
        L_0x0008:
            java.lang.Object r0 = r14.f5435c
            com.google.firebase.remoteconfig.internal.a r0 = (com.google.firebase.remoteconfig.internal.C14535a) r0
            java.lang.Object r2 = r14.f5436d
            java.util.Date r2 = (java.util.Date) r2
            int[] r3 = com.google.firebase.remoteconfig.internal.C14535a.f36685k
            r0.getClass()
            boolean r3 = r15.isSuccessful()
            if (r3 == 0) goto L_0x003f
            com.google.firebase.remoteconfig.internal.b r0 = r0.f36693h
            java.lang.Object r3 = r0.f36701b
            monitor-enter(r3)
            android.content.SharedPreferences r0 = r0.f36700a     // Catch:{ all -> 0x003c }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x003c }
            java.lang.String r1 = "last_fetch_status"
            r4 = -1
            android.content.SharedPreferences$Editor r0 = r0.putInt(r1, r4)     // Catch:{ all -> 0x003c }
            java.lang.String r1 = "last_fetch_time_in_millis"
            long r4 = r2.getTime()     // Catch:{ all -> 0x003c }
            android.content.SharedPreferences$Editor r0 = r0.putLong(r1, r4)     // Catch:{ all -> 0x003c }
            r0.apply()     // Catch:{ all -> 0x003c }
            monitor-exit(r3)     // Catch:{ all -> 0x003c }
            goto L_0x0079
        L_0x003c:
            r15 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x003c }
            throw r15
        L_0x003f:
            java.lang.Exception r2 = r15.getException()
            if (r2 != 0) goto L_0x0046
            goto L_0x0079
        L_0x0046:
            boolean r2 = r2 instanceof com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException
            if (r2 == 0) goto L_0x0064
            com.google.firebase.remoteconfig.internal.b r0 = r0.f36693h
            java.lang.Object r2 = r0.f36701b
            monitor-enter(r2)
            android.content.SharedPreferences r0 = r0.f36700a     // Catch:{ all -> 0x0061 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x0061 }
            java.lang.String r1 = "last_fetch_status"
            r3 = 2
            android.content.SharedPreferences$Editor r0 = r0.putInt(r1, r3)     // Catch:{ all -> 0x0061 }
            r0.apply()     // Catch:{ all -> 0x0061 }
            monitor-exit(r2)     // Catch:{ all -> 0x0061 }
            goto L_0x0079
        L_0x0061:
            r15 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0061 }
            throw r15
        L_0x0064:
            com.google.firebase.remoteconfig.internal.b r0 = r0.f36693h
            java.lang.Object r2 = r0.f36701b
            monitor-enter(r2)
            android.content.SharedPreferences r0 = r0.f36700a     // Catch:{ all -> 0x007a }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x007a }
            java.lang.String r3 = "last_fetch_status"
            android.content.SharedPreferences$Editor r0 = r0.putInt(r3, r1)     // Catch:{ all -> 0x007a }
            r0.apply()     // Catch:{ all -> 0x007a }
            monitor-exit(r2)     // Catch:{ all -> 0x007a }
        L_0x0079:
            return r15
        L_0x007a:
            r15 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x007a }
            throw r15
        L_0x007d:
            java.lang.Object r0 = r14.f5435c
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r1 = r14.f5436d
            android.content.Intent r1 = (android.content.Intent) r1
            boolean r2 = com.google.android.gms.common.util.PlatformVersion.isAtLeastO()
            if (r2 == 0) goto L_0x00ac
            java.lang.Object r2 = r15.getResult()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = 402(0x192, float:5.63E-43)
            if (r2 == r3) goto L_0x009a
            goto L_0x00ac
        L_0x009a:
            com.google.android.gms.tasks.Task r15 = p484ff.C16981k.m42820a(r0, r1)
            ff.j r0 = new ff.j
            r0.<init>()
            af.d r1 = new af.d
            r1.<init>()
            com.google.android.gms.tasks.Task r15 = r15.continueWith(r0, r1)
        L_0x00ac:
            return r15
        L_0x00ad:
            java.lang.Object r0 = r14.f5435c
            r3 = r0
            com.moovit.app.ads.f r3 = (com.moovit.app.ads.C14738f) r3
            java.lang.Object r0 = r14.f5436d
            android.view.View r0 = (android.view.View) r0
            r3.getClass()
            android.content.Context r0 = r0.getContext()
            boolean r2 = r0 instanceof com.moovit.MoovitActivity
            r4 = 0
            if (r2 == 0) goto L_0x00c5
            com.moovit.MoovitActivity r0 = (com.moovit.MoovitActivity) r0
            goto L_0x00d7
        L_0x00c5:
            boolean r2 = r0 instanceof p175n.C5768c
            if (r2 == 0) goto L_0x00d6
            n.c r0 = (p175n.C5768c) r0
            android.content.Context r0 = r0.getBaseContext()
            boolean r2 = r0 instanceof com.moovit.MoovitActivity
            if (r2 == 0) goto L_0x00d6
            com.moovit.MoovitActivity r0 = (com.moovit.MoovitActivity) r0
            goto L_0x00d7
        L_0x00d6:
            r0 = r4
        L_0x00d7:
            if (r0 == 0) goto L_0x00de
            android.app.Application r2 = r0.getApplication()
            goto L_0x00df
        L_0x00de:
            r2 = r4
        L_0x00df:
            boolean r5 = r2 instanceof com.moovit.MoovitApplication
            if (r5 != 0) goto L_0x00f0
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "Not a moovit application"
            r15.<init>(r0)
            com.google.android.gms.tasks.Task r15 = com.google.android.gms.tasks.Tasks.forException(r15)
            goto L_0x01ea
        L_0x00f0:
            com.moovit.app.ads.AdSource r5 = r3.f37514i
            boolean r5 = com.moovit.app.ads.C14748l.m37129b(r2, r5)
            if (r5 != 0) goto L_0x0105
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "Not supported for accessibility"
            r15.<init>(r0)
            com.google.android.gms.tasks.Task r15 = com.google.android.gms.tasks.Tasks.forException(r15)
            goto L_0x01ea
        L_0x0105:
            boolean r5 = r15.isSuccessful()
            if (r5 == 0) goto L_0x0112
            java.lang.Object r15 = r15.getResult()
            r4 = r15
            java.lang.String r4 = (java.lang.String) r4
        L_0x0112:
            boolean r15 = p977zz.C20964s0.m49090h(r4)
            if (r15 == 0) goto L_0x0125
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "Ad unit id can not be empty"
            r15.<init>(r0)
            com.google.android.gms.tasks.Task r15 = com.google.android.gms.tasks.Tasks.forException(r15)
            goto L_0x01ea
        L_0x0125:
            long r5 = p977zz.C20930c.m49023e(r2)
            com.moovit.app.ads.AdSource r15 = r3.f37514i
            boolean r15 = com.moovit.app.ads.C14748l.m37130c(r15, r5)
            if (r15 != 0) goto L_0x013f
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "user age is not allowed"
            r15.<init>(r0)
            com.google.android.gms.tasks.Task r15 = com.google.android.gms.tasks.Tasks.forException(r15)
            goto L_0x01ea
        L_0x013f:
            com.moovit.app.ads.MobileAdsManager r15 = com.moovit.app.ads.MobileAdsManager.m37073h()
            com.moovit.app.ads.h r5 = r3.f37515j
            com.google.android.gms.ads.admanager.AdManagerAdRequest r15 = r15.mo44705a(r5)
            if (r15 != 0) goto L_0x0158
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "Ad request is not allowed"
            r15.<init>(r0)
            com.google.android.gms.tasks.Task r15 = com.google.android.gms.tasks.Tasks.forException(r15)
            goto L_0x01ea
        L_0x0158:
            r10 = r2
            com.moovit.MoovitApplication r10 = (com.moovit.MoovitApplication) r10
            com.moovit.app.ads.AdSource r11 = r3.f37514i
            com.google.android.gms.ads.AdView r12 = new com.google.android.gms.ads.AdView
            r12.<init>(r0)
            r2 = 393216(0x60000, float:5.51013E-40)
            r12.setDescendantFocusability(r2)
            r12.setAdUnitId(r4)
            com.google.android.gms.ads.AdSize r2 = com.google.android.gms.ads.AdSize.MEDIUM_RECTANGLE
            r12.setAdSize(r2)
            com.moovit.app.ads.g r13 = new com.moovit.app.ads.g
            boolean r6 = r15.isTestDevice(r10)
            java.lang.String r7 = r11.adUnitIdKey
            r2 = r13
            r4 = r10
            r5 = r0
            r8 = r12
            r9 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r12.setAdListener(r13)
            r12.loadAd(r15)
            com.moovit.app.ads.MobileAdsManager r15 = com.moovit.app.ads.MobileAdsManager.m37073h()
            java.lang.String r2 = r15.mo44709j()
            zz.i0 r15 = r15.mo44707d()
            tp.i r3 = r10.mo44558j()
            u2.a r3 = r3.f50173c
            com.moovit.analytics.AnalyticsFlowKey r4 = com.moovit.analytics.AnalyticsFlowKey.ADS
            hq.b[] r1 = new p543hq.C17474b[r1]
            hq.b$a r5 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r6 = com.moovit.analytics.AnalyticsEventKey.AD
            r5.<init>(r6)
            com.moovit.analytics.AnalyticsAttributeKey r6 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r7 = "ad_banner_initialization"
            r5.mo49939g(r6, r7)
            com.moovit.analytics.AnalyticsAttributeKey r6 = com.moovit.analytics.AnalyticsAttributeKey.AD_ID
            java.lang.String r7 = r12.getAdUnitId()
            r5.mo49939g(r6, r7)
            com.moovit.analytics.AnalyticsAttributeKey r6 = com.moovit.analytics.AnalyticsAttributeKey.AD_ID_KEY
            java.lang.String r7 = r11.adUnitIdKey
            r5.mo49939g(r6, r7)
            com.moovit.analytics.AnalyticsAttributeKey r6 = com.moovit.analytics.AnalyticsAttributeKey.ANALYTICS_FLOW_KEY_ID
            com.tranzmate.moovit.protocol.kinesis.MVAnalyticsFlowKey r0 = p172m9.C5720b.m14057h(r0)
            r5.mo49944l(r6, r0)
            com.moovit.analytics.AnalyticsAttributeKey r0 = com.moovit.analytics.AnalyticsAttributeKey.SESSION_ID
            r5.mo49945m(r0, r2)
            com.moovit.analytics.AnalyticsAttributeKey r0 = com.moovit.analytics.AnalyticsAttributeKey.AB_TESTING_VARIABLE_NAME
            F r2 = r15.f52692a
            java.lang.String r2 = (java.lang.String) r2
            r5.mo49945m(r0, r2)
            com.moovit.analytics.AnalyticsAttributeKey r0 = com.moovit.analytics.AnalyticsAttributeKey.AB_TESTING_VARIABLE_VALUE
            S r15 = r15.f52693b
            java.lang.String r15 = (java.lang.String) r15
            r5.mo49945m(r0, r15)
            hq.b r15 = r5.mo49933a()
            r0 = 0
            r1[r0] = r15
            r3.getClass()
            p269u2.C6677a.m15759j(r10, r4, r0, r1)
            com.google.android.gms.tasks.Task r15 = com.google.android.gms.tasks.Tasks.forResult(r12)
        L_0x01ea:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p028ba.C1512f.then(com.google.android.gms.tasks.Task):java.lang.Object");
    }
}
