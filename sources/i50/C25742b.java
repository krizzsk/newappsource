package i50;

import c70.C13780t;
import com.moovit.payment.account.subscription.model.PaymentAccountSubscription;
import com.tranzmate.moovit.protocol.payments.MVPaymentAccountSubscriptionResponse;
import java.util.List;
import kotlin.collections.EmptyList;

/* renamed from: i50.b */
public final class C25742b extends C13780t<C25741a, C25742b, MVPaymentAccountSubscriptionResponse> {

    /* renamed from: m */
    public List<PaymentAccountSubscription> f64177m = EmptyList.f60173b;

    public C25742b() {
        super(MVPaymentAccountSubscriptionResponse.class);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v6, resolved type: kotlin.collections.EmptyList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5816m(c70.C13746a r13, org.apache.thrift.TBase r14) {
        /*
            r12 = this;
            i50.a r13 = (i50.C25741a) r13
            com.tranzmate.moovit.protocol.payments.MVPaymentAccountSubscriptionResponse r14 = (com.tranzmate.moovit.protocol.payments.MVPaymentAccountSubscriptionResponse) r14
            java.lang.String r0 = "request"
            mf0.C24362h.m61211f(r13, r0)
            java.lang.String r13 = "response"
            mf0.C24362h.m61211f(r14, r13)
            java.util.List<com.tranzmate.moovit.protocol.payments.MVPaymentAccountSubscription> r13 = r14.subscriptions
            if (r13 == 0) goto L_0x00b9
            java.util.ArrayList r14 = new java.util.ArrayList
            r0 = 10
            int r0 = cf0.C21136j.m49436X(r13, r0)
            r14.<init>(r0)
            java.util.Iterator r13 = r13.iterator()
        L_0x0021:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x00bb
            java.lang.Object r0 = r13.next()
            com.tranzmate.moovit.protocol.payments.MVPaymentAccountSubscription r0 = (com.tranzmate.moovit.protocol.payments.MVPaymentAccountSubscription) r0
            java.lang.String r1 = "it"
            mf0.C24362h.m61210e(r0, r1)
            boolean r1 = r0.mo30189m()
            r2 = 0
            if (r1 == 0) goto L_0x003d
            java.lang.String r1 = r0.title
            r5 = r1
            goto L_0x003e
        L_0x003d:
            r5 = r2
        L_0x003e:
            boolean r1 = r0.mo30188l()
            if (r1 == 0) goto L_0x0048
            java.lang.String r1 = r0.subtitle
            r6 = r1
            goto L_0x0049
        L_0x0048:
            r6 = r2
        L_0x0049:
            boolean r1 = r0.mo30185i()
            if (r1 == 0) goto L_0x0057
            com.tranzmate.moovit.protocol.common.MVPriceInfo r1 = r0.priceInfo
            com.moovit.util.PriceInfo r1 = c70.C13749c.m34326l(r1)
            r7 = r1
            goto L_0x0058
        L_0x0057:
            r7 = r2
        L_0x0058:
            boolean r1 = r0.mo30186j()
            if (r1 == 0) goto L_0x007f
            com.tranzmate.moovit.protocol.payments.MVPaymentAccountSubscriptionProgress r1 = r0.progress
            java.lang.String r3 = "getProgress()"
            mf0.C24362h.m61210e(r1, r3)
            boolean r3 = r1.mo30196f()
            if (r3 == 0) goto L_0x006e
            java.lang.String r3 = r1.accessiblityLabel
            goto L_0x006f
        L_0x006e:
            r3 = r2
        L_0x006f:
            com.moovit.payment.account.subscription.model.PaymentAccountSubscriptionProgress r4 = new com.moovit.payment.account.subscription.model.PaymentAccountSubscriptionProgress
            java.lang.String r8 = r1.label
            java.lang.String r9 = "getLabel()"
            mf0.C24362h.m61210e(r8, r9)
            int r1 = r1.percentValue
            r4.<init>(r8, r3, r1)
            r8 = r4
            goto L_0x0080
        L_0x007f:
            r8 = r2
        L_0x0080:
            boolean r1 = r0.mo30182g()
            if (r1 == 0) goto L_0x008e
            com.tranzmate.moovit.protocol.common.MVInfoBoxData r1 = r0.disclaimer
            com.moovit.util.InfoBoxData r1 = c70.C13749c.m34320f(r1)
            r9 = r1
            goto L_0x008f
        L_0x008e:
            r9 = r2
        L_0x008f:
            boolean r1 = r0.mo30181f()
            if (r1 == 0) goto L_0x0099
            java.lang.String r1 = r0.detailsHtml
            r10 = r1
            goto L_0x009a
        L_0x0099:
            r10 = r2
        L_0x009a:
            boolean r1 = r0.mo30187k()
            if (r1 == 0) goto L_0x00a6
            long r1 = r0.startTime
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
        L_0x00a6:
            r11 = r2
            com.moovit.payment.account.subscription.model.PaymentAccountSubscription r1 = new com.moovit.payment.account.subscription.model.PaymentAccountSubscription
            java.lang.String r4 = r0.identifier
            java.lang.String r0 = "getIdentifier()"
            mf0.C24362h.m61210e(r4, r0)
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r14.add(r1)
            goto L_0x0021
        L_0x00b9:
            kotlin.collections.EmptyList r14 = kotlin.collections.EmptyList.f60173b
        L_0x00bb:
            r12.f64177m = r14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i50.C25742b.mo5816m(c70.a, org.apache.thrift.TBase):void");
    }
}
