package com.moovit.app.tod.center.subscriptions;

import android.app.Application;
import android.os.SystemClock;
import androidx.lifecycle.C0989a;
import androidx.lifecycle.C1001d0;
import androidx.lifecycle.C1040t;
import androidx.lifecycle.C1043v;
import bf0.C21050d;
import com.moovit.app.tod.TodRidesProvider;
import com.moovit.app.tod.model.TodSubscription;
import com.moovit.commons.utils.ApplicationBugException;
import java.io.IOException;
import lf0.C24236l;
import mf0.C24361g;
import mf0.C24362h;
import p241s0.C6302b;
import p304x.C7074m0;
import p304x.C7121y;
import p435de.C16596f;
import p977zz.C20961r;

public final class TodSubscriptionDetailsViewModel extends C0989a {

    /* renamed from: c */
    public final C15496a f40222c;

    /* renamed from: d */
    public final C1043v<String> f40223d;

    /* renamed from: e */
    public final C1040t<C20961r<TodSubscription>> f40224e;

    /* renamed from: f */
    public final C1040t f40225f;

    /* renamed from: com.moovit.app.tod.center.subscriptions.TodSubscriptionDetailsViewModel$a */
    public static final class C15496a implements TodRidesProvider.C15458d {

        /* renamed from: b */
        public final /* synthetic */ TodSubscriptionDetailsViewModel f40226b;

        public C15496a(TodSubscriptionDetailsViewModel todSubscriptionDetailsViewModel) {
            this.f40226b = todSubscriptionDetailsViewModel;
        }

        /* renamed from: a0 */
        public final void mo46186a0() {
            TodSubscriptionDetailsViewModel todSubscriptionDetailsViewModel = this.f40226b;
            todSubscriptionDetailsViewModel.mo46293b(todSubscriptionDetailsViewModel.f40223d.getValue());
        }

        /* renamed from: q1 */
        public final void mo46187q1(String str) {
            TodSubscriptionDetailsViewModel todSubscriptionDetailsViewModel = this.f40226b;
            todSubscriptionDetailsViewModel.mo46293b(todSubscriptionDetailsViewModel.f40223d.getValue());
        }

        /* renamed from: r */
        public final void mo46188r(IOException iOException) {
            this.f40226b.f40224e.postValue(new C20961r((Exception) iOException));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TodSubscriptionDetailsViewModel(Application application, C1001d0 d0Var) {
        super(application);
        C24362h.m61211f(application, "app");
        C24362h.m61211f(d0Var, "savedState");
        C15496a aVar = new C15496a(this);
        this.f40222c = aVar;
        TodRidesProvider.m39561c().f40036e.add(aVar);
        C1043v<String> d = d0Var.mo4294d(false, "subscriptionIdLiveData", (Object) null);
        this.f40223d = d;
        C1040t<C20961r<TodSubscription>> tVar = new C1040t<>();
        this.f40224e = tVar;
        tVar.addSource(C24361g.m61135E(d), new C7121y(new C24236l<String, C21050d>(this) {
            public final /* synthetic */ TodSubscriptionDetailsViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final Object invoke(Object obj) {
                this.this$0.mo46293b((String) obj);
                return C21050d.f52856a;
            }
        }, 4));
        this.f40225f = C24361g.m61159c0(tVar, new C7074m0(2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0057 A[Catch:{ Exception -> 0x0061 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0058 A[Catch:{ Exception -> 0x0061 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m39648a(com.moovit.app.tod.center.subscriptions.TodSubscriptionDetailsViewModel r4, android.app.Application r5, java.lang.String r6, ff0.C23349c r7) {
        /*
            r4.getClass()
            boolean r0 = r7 instanceof com.moovit.app.tod.center.subscriptions.TodSubscriptionDetailsViewModel$sendCancelSubscriptionRequest$1
            if (r0 == 0) goto L_0x0016
            r0 = r7
            com.moovit.app.tod.center.subscriptions.TodSubscriptionDetailsViewModel$sendCancelSubscriptionRequest$1 r0 = (com.moovit.app.tod.center.subscriptions.TodSubscriptionDetailsViewModel$sendCancelSubscriptionRequest$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x001b
        L_0x0016:
            com.moovit.app.tod.center.subscriptions.TodSubscriptionDetailsViewModel$sendCancelSubscriptionRequest$1 r0 = new com.moovit.app.tod.center.subscriptions.TodSubscriptionDetailsViewModel$sendCancelSubscriptionRequest$1
            r0.<init>(r4, r7)
        L_0x001b:
            java.lang.Object r4 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r7 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L_0x0032
            if (r1 != r2) goto L_0x002a
            p584jl.C17885a.m44475z0(r4)     // Catch:{ Exception -> 0x0061 }
            goto L_0x0047
        L_0x002a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0032:
            p584jl.C17885a.m44475z0(r4)
            jx.e r4 = new jx.e     // Catch:{ Exception -> 0x0061 }
            c70.e r5 = ce0.C21100e.m49341g0(r5)     // Catch:{ Exception -> 0x0061 }
            r4.<init>(r5, r6)     // Catch:{ Exception -> 0x0061 }
            r0.label = r2     // Catch:{ Exception -> 0x0061 }
            java.lang.Object r4 = com.moovit.commons.request.C15752a.m40209a(r4, r0)     // Catch:{ Exception -> 0x0061 }
            if (r4 != r7) goto L_0x0047
            goto L_0x0068
        L_0x0047:
            jx.f r4 = (p596jx.C17957f) r4     // Catch:{ Exception -> 0x0061 }
            zz.r r5 = new zz.r     // Catch:{ Exception -> 0x0061 }
            int r4 = r4.f51774c     // Catch:{ Exception -> 0x0061 }
            wz.f$a r6 = p906wz.C20434f.f51772a     // Catch:{ Exception -> 0x0061 }
            r6 = -1
            if (r4 == r6) goto L_0x0058
            int r4 = r4 / 100
            r6 = 2
            if (r4 != r6) goto L_0x0058
            goto L_0x0059
        L_0x0058:
            r2 = 0
        L_0x0059:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)     // Catch:{ Exception -> 0x0061 }
            r5.<init>(r4)     // Catch:{ Exception -> 0x0061 }
            goto L_0x0067
        L_0x0061:
            r4 = move-exception
            zz.r r5 = new zz.r
            r5.<init>((java.lang.Exception) r4)
        L_0x0067:
            r7 = r5
        L_0x0068:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.tod.center.subscriptions.TodSubscriptionDetailsViewModel.m39648a(com.moovit.app.tod.center.subscriptions.TodSubscriptionDetailsViewModel, android.app.Application, java.lang.String, ff0.c):java.lang.Object");
    }

    /* renamed from: b */
    public final void mo46293b(String str) {
        boolean z;
        Object obj = null;
        if (str == null) {
            this.f40224e.postValue(new C20961r(null));
            return;
        }
        TodRidesProvider c = TodRidesProvider.m39561c();
        if (!c.mo46197f()) {
            TodRidesProvider.C15456b bVar = c.f40034c;
            C6302b bVar2 = bVar.f40042d;
            if (bVar.f40043e == -1 || SystemClock.elapsedRealtime() - bVar.f40043e >= TodRidesProvider.f40030g) {
                z = false;
            } else {
                z = true;
            }
            if (z && bVar2 != null) {
                obj = bVar2.getOrDefault(str, null);
            }
            TodSubscription todSubscription = (TodSubscription) obj;
            if (todSubscription != null) {
                this.f40224e.postValue(new C20961r(todSubscription));
                return;
            }
            ApplicationBugException applicationBugException = new ApplicationBugException(C25541a.m63881k("Missing subscription id: ", str));
            C16596f.m42113a().mo49364c(applicationBugException);
            this.f40224e.postValue(new C20961r((Exception) applicationBugException));
        }
    }

    public final void onCleared() {
        super.onCleared();
        TodRidesProvider.m39561c().mo46196e(this.f40222c);
    }
}
