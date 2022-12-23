package com.moovit.app.tod.center;

import android.app.Application;
import androidx.lifecycle.C0989a;
import androidx.lifecycle.C1001d0;
import androidx.lifecycle.C1043v;
import com.moovit.app.tod.TodRidesProvider;
import com.moovit.app.tod.model.TodRide;
import com.moovit.app.tod.model.TodSubscription;
import ff0.C23349c;
import java.io.IOException;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import mf0.C24362h;
import o00.C18676l;
import p583jk.C17875h;
import p977zz.C20961r;
import wh0.C25177g;

/* renamed from: com.moovit.app.tod.center.a */
public final class C15489a extends C0989a {

    /* renamed from: c */
    public final C15490a f40208c;

    /* renamed from: d */
    public final TodRidesProvider f40209d;

    /* renamed from: e */
    public final C1043v<Boolean> f40210e;

    /* renamed from: f */
    public final C1043v<List<TodRidesCenterTab>> f40211f;

    /* renamed from: g */
    public final C1043v<C20961r<List<C18676l.C18678b<TodRide>>>> f40212g = new C1043v<>();

    /* renamed from: h */
    public final C1043v<C20961r<List<TodSubscription>>> f40213h = new C1043v<>();

    /* renamed from: com.moovit.app.tod.center.a$a */
    public static final class C15490a implements TodRidesProvider.C15458d {

        /* renamed from: b */
        public final /* synthetic */ C15489a f40214b;

        public C15490a(C15489a aVar) {
            this.f40214b = aVar;
        }

        /* renamed from: a0 */
        public final void mo46186a0() {
            C15489a aVar = this.f40214b;
            aVar.f40210e.setValue(Boolean.FALSE);
            C25177g.m63218b(C17875h.m44315z(aVar), (CoroutineContext) null, new TodCenterViewModel$onDataUpdate$1(aVar, (C23349c<? super TodCenterViewModel$onDataUpdate$1>) null), 3);
        }

        /* renamed from: q1 */
        public final void mo46187q1(String str) {
            this.f40214b.mo46288b(false);
        }

        /* renamed from: r */
        public final void mo46188r(IOException iOException) {
            C15489a aVar = this.f40214b;
            aVar.f40210e.setValue(Boolean.FALSE);
            aVar.f40212g.setValue(new C20961r((Exception) iOException));
            aVar.f40213h.setValue(new C20961r((Exception) iOException));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15489a(Application application, C1001d0 d0Var) {
        super(application);
        C24362h.m61211f(application, "app");
        C24362h.m61211f(d0Var, "savedState");
        C15490a aVar = new C15490a(this);
        this.f40208c = aVar;
        TodRidesProvider c = TodRidesProvider.m39561c();
        this.f40209d = c;
        c.f40036e.add(aVar);
        this.f40210e = d0Var.mo4294d(false, "refreshLiveData", (Object) null);
        this.f40211f = d0Var.mo4294d(false, "tabsLiveData", (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m39630a(com.moovit.app.tod.center.C15489a r7, ff0.C23349c r8) {
        /*
            r7.getClass()
            boolean r0 = r8 instanceof com.moovit.app.tod.center.TodCenterViewModel$calculateTabs$1
            if (r0 == 0) goto L_0x0016
            r0 = r8
            com.moovit.app.tod.center.TodCenterViewModel$calculateTabs$1 r0 = (com.moovit.app.tod.center.TodCenterViewModel$calculateTabs$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x001b
        L_0x0016:
            com.moovit.app.tod.center.TodCenterViewModel$calculateTabs$1 r0 = new com.moovit.app.tod.center.TodCenterViewModel$calculateTabs$1
            r0.<init>(r7, r8)
        L_0x001b:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            java.lang.String r3 = "singletonList(TodRidesCenterTab.RIDES)"
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0040
            if (r2 == r5) goto L_0x003c
            if (r2 != r4) goto L_0x0034
            java.lang.Object r7 = r0.L$0
            java.lang.String r7 = (java.lang.String) r7
            p584jl.C17885a.m44475z0(r8)
            goto L_0x009f
        L_0x0034:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003c:
            p584jl.C17885a.m44475z0(r8)
            goto L_0x0059
        L_0x0040:
            p584jl.C17885a.m44475z0(r8)
            android.app.Application r7 = r7.f3907b
            java.lang.String r8 = "getApplication()"
            mf0.C24362h.m61210e(r7, r8)
            lz.a r7 = ce0.C21100e.m49329X(r7)
            r0.label = r5
            java.lang.String r8 = "CONFIGURATION"
            java.lang.Object r8 = com.moovit.commons.appdata.AppDataManagerExtKt.m40161a(r7, r8, r0)
            if (r8 != r1) goto L_0x0059
            goto L_0x00c5
        L_0x0059:
            q00.a r8 = (q00.C19047a) r8
            r00.a r7 = p874vr.C20199a.f51299r1
            java.lang.Object r7 = r8.mo51505b(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            if (r7 != 0) goto L_0x0067
            r7 = 0
            goto L_0x006b
        L_0x0067:
            boolean r7 = r7.booleanValue()
        L_0x006b:
            if (r7 != 0) goto L_0x0077
            com.moovit.app.tod.center.TodRidesCenterTab r7 = com.moovit.app.tod.center.TodRidesCenterTab.RIDES
            java.util.List r1 = java.util.Collections.singletonList(r7)
            mf0.C24362h.m61210e(r1, r3)
            goto L_0x00c5
        L_0x0077:
            r00.h r7 = p874vr.C20199a.f51301s1
            java.lang.Object r7 = r8.mo51505b(r7)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L_0x0090
            com.moovit.app.tod.center.TodRidesCenterTab[] r7 = new com.moovit.app.tod.center.TodRidesCenterTab[r4]
            com.moovit.app.tod.center.TodRidesCenterTab r8 = com.moovit.app.tod.center.TodRidesCenterTab.RIDES
            r7[r6] = r8
            com.moovit.app.tod.center.TodRidesCenterTab r8 = com.moovit.app.tod.center.TodRidesCenterTab.SUBSCRIPTIONS
            r7[r5] = r8
            java.util.List r1 = p583jk.C17875h.m44281E(r7)
            goto L_0x00c5
        L_0x0090:
            w40.d r8 = w40.C25761d.m64299a()
            r0.L$0 = r7
            r0.label = r4
            java.lang.Object r8 = com.moovit.payment.C25599a.m63997a(r8, r0)
            if (r8 != r1) goto L_0x009f
            goto L_0x00c5
        L_0x009f:
            com.moovit.payment.account.model.PaymentAccount r8 = (com.moovit.payment.account.model.PaymentAccount) r8
            com.moovit.payment.account.model.PaymentAccountContextStatus[] r0 = new com.moovit.payment.account.model.PaymentAccountContextStatus[r5]
            com.moovit.payment.account.model.PaymentAccountContextStatus r1 = com.moovit.payment.account.model.PaymentAccountContextStatus.CONNECTED
            r0[r6] = r1
            boolean r7 = com.moovit.payment.account.model.PaymentAccount.m64175c(r8, r7, r0)
            if (r7 == 0) goto L_0x00bc
            com.moovit.app.tod.center.TodRidesCenterTab[] r7 = new com.moovit.app.tod.center.TodRidesCenterTab[r4]
            com.moovit.app.tod.center.TodRidesCenterTab r8 = com.moovit.app.tod.center.TodRidesCenterTab.RIDES
            r7[r6] = r8
            com.moovit.app.tod.center.TodRidesCenterTab r8 = com.moovit.app.tod.center.TodRidesCenterTab.SUBSCRIPTIONS
            r7[r5] = r8
            java.util.List r1 = p583jk.C17875h.m44281E(r7)
            goto L_0x00c5
        L_0x00bc:
            com.moovit.app.tod.center.TodRidesCenterTab r7 = com.moovit.app.tod.center.TodRidesCenterTab.RIDES
            java.util.List r1 = java.util.Collections.singletonList(r7)
            mf0.C24362h.m61210e(r1, r3)
        L_0x00c5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.tod.center.C15489a.m39630a(com.moovit.app.tod.center.a, ff0.c):java.lang.Object");
    }

    /* renamed from: b */
    public final void mo46288b(boolean z) {
        if (z) {
            this.f40209d.f40034c.f40043e = -1;
        }
        if (this.f40209d.mo46197f()) {
            this.f40210e.setValue(Boolean.TRUE);
            return;
        }
        this.f40210e.setValue(Boolean.FALSE);
        C25177g.m63218b(C17875h.m44315z(this), (CoroutineContext) null, new TodCenterViewModel$onDataUpdate$1(this, (C23349c<? super TodCenterViewModel$onDataUpdate$1>) null), 3);
    }

    public final void onCleared() {
        super.onCleared();
        this.f40209d.mo46196e(this.f40208c);
    }
}
