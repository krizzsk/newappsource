package w40;

import android.content.Intent;
import b60.C13571b;
import com.google.android.gms.tasks.SuccessContinuation;
import com.moovit.payment.account.creditcard.CreditCardPaymentMethod;
import com.moovit.payment.account.paymentmethod.PaymentMethod;
import com.moovit.payment.clearance.ClearanceProvider;
import com.moovit.payment.clearance.ClearanceProviderType;
import com.moovit.ticketing.purchase.extrainfo.split.PurchaseSplitActivity;
import com.moovit.util.CurrencyAmount;
import com.moovit.util.ParcelableMemRef;
import m50.C18340m;
import p977zz.C20949l;
import z80.C13338a;
import z80.C13342c;

/* renamed from: w40.c */
public final /* synthetic */ class C25760c implements SuccessContinuation, C20949l {

    /* renamed from: b */
    public final /* synthetic */ int f64263b;

    /* renamed from: c */
    public final /* synthetic */ Object f64264c;

    /* renamed from: d */
    public final /* synthetic */ Object f64265d;

    public /* synthetic */ C25760c(int i, Object obj, Object obj2) {
        this.f64263b = i;
        this.f64264c = obj;
        this.f64265d = obj2;
    }

    public final boolean invoke(Object obj) {
        switch (this.f64263b) {
            case 1:
                int i = C18340m.f46765o;
                ((ClearanceProvider.C16293a) obj).mo48834o1((ClearanceProviderType) this.f64264c, (PaymentMethod) this.f64265d);
                return true;
            case 2:
                int i2 = C13571b.f33523k;
                ((C13571b.C13573b) obj).mo24144E0((CreditCardPaymentMethod) this.f64264c, (String) this.f64265d);
                return true;
            default:
                PurchaseSplitActivity purchaseSplitActivity = (PurchaseSplitActivity) obj;
                int i3 = C13338a.f33117x;
                C13342c cVar = new C13342c(purchaseSplitActivity.f23285Y, (CurrencyAmount) this.f64264c, purchaseSplitActivity.f23286Z, (CurrencyAmount) this.f64265d);
                Intent intent = new Intent();
                intent.putExtra("split_ref", new ParcelableMemRef(cVar));
                purchaseSplitActivity.setResult(-1, intent);
                purchaseSplitActivity.finish();
                return false;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: com.moovit.payment.account.paymentmethod.PaymentMethod} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.tasks.Task then(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.f64263b
            switch(r0) {
                case 0: goto L_0x0039;
                case 3: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            goto L_0x0077
        L_0x0006:
            java.lang.Object r0 = r5.f64264c
            y60.e r0 = (y60.C20709e) r0
            java.lang.Object r1 = r5.f64265d
            com.moovit.payment.wallet.WalletTab r1 = (com.moovit.payment.wallet.WalletTab) r1
            java.util.List r6 = (java.util.List) r6
            r0.getClass()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x001c:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L_0x002c
            java.lang.Object r3 = r6.next()
            java.util.List r3 = (java.util.List) r3
            r2.addAll(r3)
            goto L_0x001c
        L_0x002c:
            java.util.Collections.sort(r2)
            java.util.EnumMap r6 = r0.f52298e
            r6.put(r1, r2)
            com.google.android.gms.tasks.Task r6 = com.google.android.gms.tasks.Tasks.forResult(r2)
            return r6
        L_0x0039:
            java.lang.Object r0 = r5.f64264c
            com.moovit.payment.account.paymentmethod.PaymentMethodId r0 = (com.moovit.payment.account.paymentmethod.PaymentMethodId) r0
            java.lang.Object r1 = r5.f64265d
            c70.e r1 = (c70.C13752e) r1
            com.moovit.payment.account.model.PaymentAccount r6 = (com.moovit.payment.account.model.PaymentAccount) r6
            java.util.List<com.moovit.payment.account.paymentmethod.PaymentMethod> r2 = r6.f64016e
            tt.f r3 = new tt.f
            r4 = 3
            r3.<init>(r4)
            java.lang.Object r2 = c00.C13723g.m34286g(r2, r3)
            com.moovit.payment.account.paymentmethod.PaymentMethod r2 = (com.moovit.payment.account.paymentmethod.PaymentMethod) r2
            if (r2 != 0) goto L_0x005c
            java.util.List<com.moovit.payment.account.paymentmethod.PaymentMethod> r6 = r6.f64016e
            java.lang.Object r6 = c00.C13717b.m34256c(r6)
            r2 = r6
            com.moovit.payment.account.paymentmethod.PaymentMethod r2 = (com.moovit.payment.account.paymentmethod.PaymentMethod) r2
        L_0x005c:
            if (r2 == 0) goto L_0x0061
            com.moovit.payment.account.paymentmethod.PaymentMethodId r6 = r2.f64052b
            goto L_0x0062
        L_0x0061:
            r6 = 0
        L_0x0062:
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x0070
            h60.u1 r6 = new h60.u1
            r6.<init>(r1, r0)
            r6.mo52626J()
        L_0x0070:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            com.google.android.gms.tasks.Task r6 = com.google.android.gms.tasks.Tasks.forResult(r6)
            return r6
        L_0x0077:
            java.lang.Object r0 = r5.f64264c
            m80.v r0 = (m80.C12887v) r0
            java.lang.Object r1 = r5.f64265d
            d90.a r1 = (d90.C12607a) r1
            c70.e r6 = (c70.C13752e) r6
            java.util.concurrent.ThreadPoolExecutor r2 = m80.C12887v.f31893d
            r0.getClass()
            java.util.concurrent.ExecutorService r2 = com.moovit.MoovitExecutors.f37327IO
            q80.k r3 = new q80.k
            com.moovit.MoovitApplication<?, ?, ?> r0 = r0.f31895a
            p80.b r0 = m80.C12887v.m32670f(r0)
            r3.<init>(r6, r0, r1)
            com.google.android.gms.tasks.Task r6 = com.google.android.gms.tasks.Tasks.call(r2, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: w40.C25760c.then(java.lang.Object):com.google.android.gms.tasks.Task");
    }
}
