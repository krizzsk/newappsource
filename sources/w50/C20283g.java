package w50;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.C0989a;
import androidx.lifecycle.C1001d0;
import androidx.lifecycle.C1040t;
import androidx.lifecycle.C1043v;
import b50.C25549f;
import c00.C13717b;
import c00.C13720d;
import c00.C13722f;
import c00.C13723g;
import c70.C13752e;
import ce0.C21100e;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitApplication;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.appdata.UserContextLoader;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.payment.confirmation.options.PaymentOptions;
import com.moovit.payment.confirmation.summary.PaymentSummaryInfo;
import com.moovit.payment.confirmation.summary.discounts.Discount;
import com.moovit.payment.confirmation.summary.discounts.DiscountInfo;
import com.moovit.payment.gateway.PaymentGateway;
import com.moovit.payment.gateway.PaymentGatewayInfo;
import com.moovit.payment.gateway.PaymentGatewayInstructions;
import com.moovit.util.CurrencyAmount;
import com.usebutton.sdk.internal.api.AppActionRequest;
import h60.C17327j1;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import mf0.C24361g;
import p009a8.C0112l;
import p054d0.C4267a0;
import p054d0.C4303q;
import p122i7.C5297a;
import p304x.C7121y;
import p376ax.C13543e;
import p394br.C13659e;
import p394br.C13660f;
import p430cx.C16522d;
import p501fw.C17110h;
import p638lr.C18267n;
import p646lz.C18299a;
import p777rq.C19314d;
import p824tp.C19722a0;
import p923xs.C20566b;
import w40.C25761d;
import y50.C20703a;
import y50.C20704b;

/* renamed from: w50.g */
public final class C20283g extends C0989a {

    /* renamed from: r */
    public static final BigDecimal f51427r = new BigDecimal(-1);

    /* renamed from: s */
    public static final PaymentOptions f51428s = new PaymentOptions(1);

    /* renamed from: c */
    public final C20284a f51429c;

    /* renamed from: d */
    public final AtomicReference<UUID> f51430d = new AtomicReference<>((Object) null);

    /* renamed from: e */
    public final C1043v<Boolean> f51431e;

    /* renamed from: f */
    public final C1043v<Boolean> f51432f;

    /* renamed from: g */
    public final C1040t<Boolean> f51433g;

    /* renamed from: h */
    public final C1043v<PaymentOptions> f51434h;

    /* renamed from: i */
    public final C1043v<String> f51435i;

    /* renamed from: j */
    public final C1043v<CurrencyAmount> f51436j;

    /* renamed from: k */
    public final C1040t<C20703a> f51437k;

    /* renamed from: l */
    public final C1043v<PaymentGatewayInfo> f51438l;

    /* renamed from: m */
    public final C1040t<List<PaymentGateway>> f51439m;

    /* renamed from: n */
    public final C1043v<PaymentGateway> f51440n;

    /* renamed from: o */
    public final C1040t<PaymentGateway> f51441o;

    /* renamed from: p */
    public final C1043v<Boolean> f51442p;

    /* renamed from: q */
    public final C1040t<Boolean> f51443q;

    /* renamed from: w50.g$a */
    public class C20284a extends BroadcastReceiver {
        public C20284a() {
        }

        public final void onReceive(Context context, Intent intent) {
            C20283g gVar = C20283g.this;
            gVar.mo52457i(gVar.f51438l.getValue(), C20283g.this.f51434h.getValue(), C20283g.this.f51436j.getValue(), C20283g.this.f51435i.getValue());
        }
    }

    /* renamed from: w50.g$b */
    public static class C20285b implements Callable<List<PaymentGateway>> {

        /* renamed from: b */
        public final Context f51445b;

        /* renamed from: c */
        public final List<PaymentGateway> f51446c;

        /* renamed from: d */
        public final PaymentGatewayInfo f51447d;

        public C20285b(Application application, List list, PaymentGatewayInfo paymentGatewayInfo) {
            C21100e.m49373x(application, AppActionRequest.KEY_CONTEXT);
            this.f51445b = application;
            this.f51446c = list;
            this.f51447d = paymentGatewayInfo;
        }

        public final Object call() throws Exception {
            boolean z;
            if (C13717b.m34258e(this.f51446c)) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList(this.f51446c.size());
            for (PaymentGateway next : this.f51446c) {
                PaymentGatewayInfo paymentGatewayInfo = this.f51447d;
                C21100e.m49355o();
                try {
                    z = ((Boolean) Tasks.await(next.mo48903B1(this.f51445b, paymentGatewayInfo))).booleanValue();
                } catch (Exception unused) {
                    z = false;
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            return Collections.unmodifiableList(arrayList);
        }
    }

    public C20283g(Application application, C1001d0 d0Var) {
        super(application);
        C20284a aVar = new C20284a();
        this.f51429c = aVar;
        C21100e.m49373x(d0Var, "savedState");
        C1043v<Boolean> d = d0Var.mo4294d(true, "isActiveRequest", Boolean.FALSE);
        this.f51431e = d;
        C1043v<Boolean> d2 = d0Var.mo4294d(true, "isExternallyEnabled", Boolean.TRUE);
        this.f51432f = d2;
        C1040t<Boolean> tVar = new C1040t<>();
        this.f51433g = tVar;
        tVar.addSource(d, new C20278b(this, 0));
        tVar.addSource(d2, new C13543e(this, 3));
        C1043v<CurrencyAmount> d3 = d0Var.mo4294d(false, "itemPrice", (Object) null);
        this.f51436j = d3;
        C1043v<PaymentOptions> d4 = d0Var.mo4294d(false, "paymentOptions", (Object) null);
        this.f51434h = d4;
        C1043v<String> d5 = d0Var.mo4294d(false, "discountContextId", (Object) null);
        this.f51435i = d5;
        C1043v<PaymentGatewayInfo> d6 = d0Var.mo4294d(false, "paymentInfoLiveData", (Object) null);
        this.f51438l = d6;
        C1040t<C20703a> tVar2 = new C1040t<>();
        this.f51437k = tVar2;
        tVar2.addSource(C24361g.m61135E(d3), new C20566b(this, 1));
        tVar2.addSource(C24361g.m61135E(d4), new C16522d(this, 1));
        tVar2.addSource(C24361g.m61135E(d5), new C5297a(this, 6));
        tVar2.addSource(d6, new C17110h(this, 5));
        C1040t<List<PaymentGateway>> tVar3 = new C1040t<>();
        this.f51439m = tVar3;
        tVar3.addSource(C24361g.m61135E(tVar2), new C19314d(this, 3));
        C1043v<PaymentGateway> d7 = d0Var.mo4294d(false, "userPaymentGatewaySelection", (Object) null);
        this.f51440n = d7;
        C1040t<PaymentGateway> tVar4 = new C1040t<>();
        this.f51441o = tVar4;
        tVar4.addSource(tVar3, new C20278b(this, 1));
        tVar4.addSource(d7, new C20279c(this, 1));
        C1043v<Boolean> d8 = d0Var.mo4294d(false, "isTermsOfUseAgreed", (Object) null);
        this.f51442p = d8;
        C1040t<Boolean> tVar5 = new C1040t<>();
        this.f51443q = tVar5;
        tVar5.addSource(tVar, new C20280d(this, 1));
        tVar5.addSource(tVar2, new C20279c(this, 0));
        tVar5.addSource(d8, new C20280d(this, 0));
        C24361g.m61135E(C24361g.m61159c0(tVar2, new C13660f(2))).observeForever(new C7121y(this, 7));
        C25761d.m64300h(application, aVar);
    }

    /* renamed from: b */
    public static C20703a m47845b(PaymentOptions paymentOptions, PaymentSummaryInfo paymentSummaryInfo) {
        PaymentSummaryInfo paymentSummaryInfo2 = paymentSummaryInfo;
        if (paymentSummaryInfo2 == null) {
            return null;
        }
        DiscountInfo discountInfo = paymentSummaryInfo2.f42636c;
        PaymentGatewayInstructions paymentGatewayInstructions = paymentSummaryInfo2.f42635b;
        if (discountInfo == null) {
            return new C20703a(paymentOptions, paymentGatewayInstructions, (String) null, (ArrayList) null, paymentSummaryInfo2.f42637d, paymentSummaryInfo2.f42638e, paymentSummaryInfo2.f42639f, paymentSummaryInfo2.f42640g, paymentSummaryInfo2.f42641h);
        } else if (C13717b.m34258e(discountInfo.f42648c)) {
            return new C20703a(paymentOptions, paymentGatewayInstructions, discountInfo.f42647b, (ArrayList) null, paymentSummaryInfo2.f42637d, paymentSummaryInfo2.f42638e, paymentSummaryInfo2.f42639f, paymentSummaryInfo2.f42640g, paymentSummaryInfo2.f42641h);
        } else {
            HashMap h = C13720d.m34278h(discountInfo.f42648c, new C25541a(), new C0112l(15), C13720d.f33796a, new C4303q(18));
            ArrayList arrayList = new ArrayList(h.size());
            for (Map.Entry entry : h.entrySet()) {
                String str = (String) entry.getKey();
                List<Discount> list = (List) entry.getValue();
                if (!C13717b.m34258e(list)) {
                    if (list.size() == 1) {
                        str = ((Discount) list.get(0)).f42644d;
                    }
                    String str2 = str;
                    String str3 = discountInfo.f42647b;
                    ArrayList c = C13720d.m34273c(list, (C13722f) null, new C18267n(18));
                    BigDecimal bigDecimal = BigDecimal.ZERO;
                    for (Discount discount : list) {
                        bigDecimal = bigDecimal.add(discount.f42645e.f23845c);
                    }
                    arrayList.add(new C20704b(str3, c, !C13723g.m34280a(list, new C13659e(2)), str2, new CurrencyAmount(((Discount) C13717b.m34256c(list)).f42645e.f23844b, bigDecimal.multiply(f51427r))));
                }
            }
            return new C20703a(paymentOptions, paymentGatewayInstructions, discountInfo.f42647b, arrayList, paymentSummaryInfo2.f42637d, paymentSummaryInfo2.f42638e, paymentSummaryInfo2.f42639f, paymentSummaryInfo2.f42640g, paymentSummaryInfo2.f42641h);
        }
    }

    /* renamed from: f */
    public static C13752e m47846f(MoovitApplication<?, ?, ?> moovitApplication) {
        C21100e.m49355o();
        if (UserContextLoader.m40004l(moovitApplication)) {
            C13752e l = moovitApplication.mo44560l();
            if (l.f33853b != null) {
                return l;
            }
            C18299a aVar = moovitApplication.f37321e;
            C19722a0 a0Var = (C19722a0) aVar.mo50695h("USER_CONTEXT", false);
            if (a0Var != null) {
                return new C13752e(moovitApplication, a0Var, (AnalyticsFlowKey) null);
            }
            StringBuilder k = C13555b.m33972k("Failed to load user context: ");
            k.append(aVar.mo50694g("USER_CONTEXT"));
            throw new ApplicationBugException(k.toString());
        }
        throw new ApplicationBugException("Missing user context!");
    }

    /* renamed from: a */
    public final UUID mo52451a() {
        UUID randomUUID = UUID.randomUUID();
        this.f51430d.set(randomUUID);
        this.f51431e.postValue(Boolean.TRUE);
        return randomUUID;
    }

    /* renamed from: c */
    public final PaymentGatewayInstructions mo52452c() {
        C20703a value = this.f51437k.getValue();
        if (value != null) {
            return value.f52278b;
        }
        return null;
    }

    /* renamed from: d */
    public final PaymentOptions mo52453d() {
        PaymentOptions value = this.f51434h.getValue();
        if (value == null) {
            return f51428s;
        }
        return value;
    }

    /* renamed from: e */
    public final C20703a mo52454e() {
        return this.f51437k.getValue();
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.google.android.gms.tasks.Task<y50.a>, com.google.android.gms.tasks.Task] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo52455g(java.util.UUID r5, com.google.android.gms.tasks.Task<y50.C20703a> r6) {
        /*
            r4 = this;
            r6.getException()
            java.util.concurrent.atomic.AtomicReference<java.util.UUID> r0 = r4.f51430d
        L_0x0005:
            r1 = 0
            boolean r1 = r0.compareAndSet(r5, r1)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0010
            r5 = 1
            goto L_0x0017
        L_0x0010:
            java.lang.Object r1 = r0.get()
            if (r1 == r5) goto L_0x0005
            r5 = 0
        L_0x0017:
            if (r5 == 0) goto L_0x0021
            androidx.lifecycle.v<java.lang.Boolean> r5 = r4.f51431e
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r5.postValue(r0)
            goto L_0x0022
        L_0x0021:
            r2 = 0
        L_0x0022:
            if (r2 == 0) goto L_0x004c
            boolean r5 = r6.isCanceled()
            if (r5 == 0) goto L_0x002b
            goto L_0x004c
        L_0x002b:
            boolean r5 = r6.isSuccessful()
            if (r5 == 0) goto L_0x0036
            java.lang.Object r5 = r6.getResult()
            goto L_0x003c
        L_0x0036:
            androidx.lifecycle.t<y50.a> r5 = r4.f51437k
            java.lang.Object r5 = r5.getValue()
        L_0x003c:
            y50.a r5 = (y50.C20703a) r5
            androidx.lifecycle.t<y50.a> r6 = r4.f51437k
            r6.setValue(r5)
            if (r5 == 0) goto L_0x004c
            androidx.lifecycle.v<java.lang.String> r6 = r4.f51435i
            java.lang.String r5 = r5.f52279c
            r6.setValue(r5)
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w50.C20283g.mo52455g(java.util.UUID, com.google.android.gms.tasks.Task):void");
    }

    /* renamed from: h */
    public final void mo52456h(boolean z) {
        this.f51432f.postValue(Boolean.valueOf(z));
    }

    /* renamed from: i */
    public final void mo52457i(PaymentGatewayInfo paymentGatewayInfo, PaymentOptions paymentOptions, CurrencyAmount currencyAmount, String str) {
        if (paymentGatewayInfo == null) {
            this.f51437k.setValue(null);
            return;
        }
        UUID a = mo52451a();
        PaymentOptions d = mo52453d();
        C20277a aVar = new C20277a(paymentGatewayInfo.f42673b, currencyAmount, str, paymentOptions, paymentGatewayInfo.f42676e);
        ExecutorService executorService = MoovitExecutors.COMPUTATION;
        Tasks.call(executorService, new C25549f(this, 1)).onSuccessTask(executorService, new C4267a0(aVar, 15)).onSuccessTask(executorService, new C17327j1(d, 23)).addOnCompleteListener(MoovitExecutors.MAIN_THREAD, new C20281e(this, a));
    }

    /* renamed from: j */
    public final void mo52458j(Boolean bool, C20703a aVar, Boolean bool2) {
        Boolean bool3 = Boolean.TRUE;
        if (!bool3.equals(bool)) {
            this.f51443q.setValue(Boolean.FALSE);
        } else if (aVar == null || aVar.f52285i == null) {
            this.f51443q.setValue(bool3);
        } else {
            this.f51443q.setValue(Boolean.valueOf(bool3.equals(bool2)));
        }
    }

    /* renamed from: k */
    public final void mo52459k(List<PaymentGateway> list, PaymentGateway paymentGateway) {
        C20703a e = mo52454e();
        if (e != null && !e.f52283g) {
            this.f51441o.setValue(null);
        } else if (C13717b.m34258e(list)) {
            this.f51441o.setValue(null);
        } else if (paymentGateway == null || !list.contains(paymentGateway)) {
            PaymentGatewayInstructions c = mo52452c();
            if (c == null || c.mo48937b() == null) {
                this.f51441o.setValue(list.get(0));
                return;
            }
            this.f51441o.setValue(c.mo48937b());
        } else {
            this.f51441o.setValue(paymentGateway);
        }
    }

    public final void onCleared() {
        super.onCleared();
        C25761d.m64301k(this.f3907b, this.f51429c);
    }
}
