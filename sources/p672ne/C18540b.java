package p672ne;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.moovit.payment.account.paymentmethod.PaymentMethod;
import com.moovit.payment.clearance.ClearanceProvider;
import com.moovit.payment.clearance.ClearanceProviderType;
import com.moovit.payment.registration.steps.profile.certificate.ProfileCertificatePhotoData;
import m50.C18331g;
import m60.C18341a;
import p237r9.C6274g;
import p531he.C17421w;
import p977zz.C20949l;
import t60.C19633c;
import t60.C19634d;

/* renamed from: ne.b */
public final /* synthetic */ class C18540b implements C6274g, SuccessContinuation, C20949l {

    /* renamed from: b */
    public final /* synthetic */ int f47206b;

    /* renamed from: c */
    public final /* synthetic */ Object f47207c;

    /* renamed from: d */
    public final /* synthetic */ Object f47208d;

    public /* synthetic */ C18540b(int i, Object obj, Object obj2) {
        this.f47206b = i;
        this.f47207c = obj;
        this.f47208d = obj2;
    }

    /* renamed from: d */
    public final void mo21004d(Exception exc) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f47207c;
        C17421w wVar = (C17421w) this.f47208d;
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
        } else {
            taskCompletionSource.trySetResult(wVar);
        }
    }

    public final boolean invoke(Object obj) {
        switch (this.f47206b) {
            case 2:
                int i = C18331g.f46746o;
                ((ClearanceProvider.C16293a) obj).mo48833U((ClearanceProviderType) this.f47207c, (String) this.f47208d);
                return true;
            case 3:
                int i2 = C18341a.f46767o;
                ((ClearanceProvider.C16293a) obj).mo48834o1((ClearanceProviderType) this.f47207c, (PaymentMethod) this.f47208d);
                return true;
            default:
                C19633c cVar = (C19633c) this.f47207c;
                int i3 = C19633c.f49816t;
                cVar.getClass();
                ((C19634d.C19635a) obj).mo51973P(new ProfileCertificatePhotoData(cVar.f49818q, (String) this.f47208d));
                return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0081, code lost:
        if (c00.C13717b.m34258e((java.util.Collection) r2.f52712b) == false) goto L_0x00b4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.tasks.Task then(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f47207c
            com.moovit.app.subscription.MoovitSubscriptionsManager r0 = (com.moovit.app.subscription.MoovitSubscriptionsManager) r0
            java.lang.Object r1 = r8.f47208d
            java.util.List r1 = (java.util.List) r1
            com.android.billingclient.api.b r9 = (com.android.billingclient.api.C1941b) r9
            java.util.HashSet r2 = com.moovit.app.subscription.MoovitSubscriptionsManager.f39757g
            r0.getClass()
            zz.q0 r0 = new zz.q0
            r0.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            com.android.billingclient.api.k r3 = new com.android.billingclient.api.k
            r3.<init>()
            java.lang.String r4 = "subs"
            r3.f6774a = r4
            r3.f6775b = r2
            d0.k0 r2 = new d0.k0
            r4 = 9
            r2.<init>(r0, r4)
            r9.mo9561d(r3, r2)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            r5 = 5
            long r2 = r2.toMillis(r5)
            zz.i0 r0 = r0.mo53033a(r2)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            F r3 = r0.f52692a
            boolean r2 = r2.equals(r3)
            r3 = 0
            if (r2 == 0) goto L_0x004a
            S r0 = r0.f52693b
            zz.r r0 = (p977zz.C20961r) r0
            goto L_0x004b
        L_0x004a:
            r0 = r3
        L_0x004b:
            if (r0 == 0) goto L_0x00fd
            boolean r2 = r0.f52711a
            if (r2 != 0) goto L_0x0053
            goto L_0x00fd
        L_0x0053:
            zz.q0 r2 = new zz.q0
            r2.<init>()
            au.e r3 = new au.e
            r3.<init>(r2, r4)
            r9.mo9560c(r3)
            r3 = 5000(0x1388, double:2.4703E-320)
            zz.i0 r2 = r2.mo53033a(r3)
            F r5 = r2.f52692a
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r6 = 0
            if (r5 == 0) goto L_0x0084
            S r2 = r2.f52693b
            zz.r r2 = (p977zz.C20961r) r2
            boolean r5 = r2.f52711a
            if (r5 == 0) goto L_0x0084
            T r2 = r2.f52712b
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = c00.C13717b.m34258e(r2)
            if (r2 != 0) goto L_0x0084
            goto L_0x00b4
        L_0x0084:
            zz.q0 r2 = new zz.q0
            r2.<init>()
            x.d0 r5 = new x.d0
            r7 = 11
            r5.<init>(r2, r7)
            r9.mo9559b(r5)
            zz.i0 r9 = r2.mo53033a(r3)
            F r2 = r9.f52692a
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x00b4
            S r9 = r9.f52693b
            zz.r r9 = (p977zz.C20961r) r9
            boolean r2 = r9.f52711a
            if (r2 == 0) goto L_0x00b4
            T r9 = r9.f52712b
            java.util.Collection r9 = (java.util.Collection) r9
            boolean r9 = c00.C13717b.m34258e(r9)
            if (r9 == 0) goto L_0x00b4
            r6 = 1
        L_0x00b4:
            T r9 = r0.f52712b
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            vs.e r0 = new vs.e
            r2 = 6
            r0.<init>(r2)
            fw.d r2 = new fw.d
            r2.<init>(r6)
            java.util.HashMap r9 = c00.C13720d.m34274d(r9, r0, r2)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r2 = r1.size()
            r0.<init>(r2)
            java.util.Iterator r1 = r1.iterator()
        L_0x00d4:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00f8
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r9.get(r2)
            com.moovit.app.subscription.model.SubscriptionDetails r3 = (com.moovit.app.subscription.model.SubscriptionDetails) r3
            if (r3 == 0) goto L_0x00ec
            r0.add(r3)
            goto L_0x00d4
        L_0x00ec:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r0 = "Unable to retrieve sku details. sku="
            java.lang.String r0 = p379.C25541a.m63881k(r0, r2)
            r9.<init>(r0)
            throw r9
        L_0x00f8:
            com.google.android.gms.tasks.Task r9 = com.google.android.gms.tasks.Tasks.forResult(r0)
            return r9
        L_0x00fd:
            if (r0 == 0) goto L_0x0101
            java.lang.Exception r3 = r0.f52713c
        L_0x0101:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r0 = "Unable to retrieve sku details."
            r9.<init>(r0, r3)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p672ne.C18540b.then(java.lang.Object):com.google.android.gms.tasks.Task");
    }
}
