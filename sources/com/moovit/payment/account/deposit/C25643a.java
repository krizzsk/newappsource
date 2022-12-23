package com.moovit.payment.account.deposit;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.C0989a;
import androidx.lifecycle.C1001d0;
import androidx.lifecycle.C1040t;
import androidx.lifecycle.C1043v;
import b50.C25550g;
import c00.C13717b;
import c70.C13752e;
import ce0.C21100e;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.moovit.MoovitApplication;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.appdata.UserContextLoader;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.payment.account.balance.BalancePaymentMethod;
import com.moovit.payment.account.bank.BankPaymentMethod;
import com.moovit.payment.account.creditcard.CreditCardPaymentMethod;
import com.moovit.payment.account.externalpayment.ExternalPaymentMethod;
import com.moovit.payment.account.model.PaymentAccount;
import com.moovit.payment.account.paymentmethod.PaymentMethod;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import mf0.C24361g;
import p304x.C7121y;
import p376ax.C13543e;
import p376ax.C13545g;
import p394br.C13660f;
import p578jf.C17843u;
import p646lz.C18299a;
import p824tp.C19722a0;
import w40.C25761d;

/* renamed from: com.moovit.payment.account.deposit.a */
public final class C25643a extends C0989a {

    /* renamed from: c */
    public final C25644a f63963c;

    /* renamed from: d */
    public final C25645b f63964d = new C25645b();

    /* renamed from: e */
    public final C1043v<DepositInstructions> f63965e;

    /* renamed from: f */
    public final C1040t<List<PaymentMethod>> f63966f;

    /* renamed from: g */
    public final C1040t f63967g;

    /* renamed from: h */
    public final C1043v<PaymentMethod> f63968h;

    /* renamed from: i */
    public final C1040t<PaymentMethod> f63969i;

    /* renamed from: com.moovit.payment.account.deposit.a$a */
    public class C25644a extends BroadcastReceiver {
        public C25644a() {
        }

        public final void onReceive(Context context, Intent intent) {
            C25643a aVar = C25643a.this;
            aVar.mo83449b(aVar.f63965e.getValue());
        }
    }

    /* renamed from: com.moovit.payment.account.deposit.a$b */
    public class C25645b implements PaymentMethod.C25688a<Void, C25646c> {
        /* renamed from: C1 */
        public final Object mo48923C1(CreditCardPaymentMethod creditCardPaymentMethod, Object obj) {
            Void voidR = (Void) obj;
            return new C25646c(creditCardPaymentMethod);
        }

        /* renamed from: K0 */
        public final /* bridge */ /* synthetic */ Object mo48924K0(ExternalPaymentMethod externalPaymentMethod, Object obj) {
            Void voidR = (Void) obj;
            return null;
        }

        /* renamed from: u */
        public final /* bridge */ /* synthetic */ Object mo48929u(BalancePaymentMethod balancePaymentMethod, Object obj) {
            Void voidR = (Void) obj;
            return null;
        }

        /* renamed from: z0 */
        public final /* bridge */ /* synthetic */ Object mo48930z0(BankPaymentMethod bankPaymentMethod, Object obj) {
            Void voidR = (Void) obj;
            return null;
        }
    }

    /* renamed from: com.moovit.payment.account.deposit.a$c */
    public static class C25646c {

        /* renamed from: a */
        public final CreditCardPaymentMethod f63971a;

        public C25646c(CreditCardPaymentMethod creditCardPaymentMethod) {
            this.f63971a = creditCardPaymentMethod;
        }
    }

    public C25643a(Application application, C1001d0 d0Var) {
        super(application);
        C25644a aVar = new C25644a();
        this.f63963c = aVar;
        C21100e.m49373x(d0Var, "savedState");
        C1043v<DepositInstructions> d = d0Var.mo4294d(false, "depositInstructions", (Object) null);
        this.f63965e = d;
        C1040t<List<PaymentMethod>> tVar = new C1040t<>();
        this.f63966f = tVar;
        tVar.addSource(C24361g.m61135E(d), new C13545g(this, 3));
        this.f63967g = C24361g.m61159c0(C24361g.m61135E(d), new C13660f(1));
        C1043v<PaymentMethod> d2 = d0Var.mo4294d(false, "userPaymentMethodSelection", (Object) null);
        this.f63968h = d2;
        C1040t<PaymentMethod> tVar2 = new C1040t<>();
        this.f63969i = tVar2;
        tVar2.addSource(C24361g.m61135E(tVar), new C7121y(this, 6));
        tVar2.addSource(C24361g.m61135E(d2), new C13543e(this, 2));
        C25761d.m64300h(application, aVar);
    }

    /* renamed from: a */
    public static C13752e m64099a(MoovitApplication<?, ?, ?> moovitApplication) {
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

    /* renamed from: b */
    public final void mo83449b(DepositInstructions depositInstructions) {
        if (depositInstructions == null || depositInstructions.f63960d.isEmpty()) {
            this.f63966f.setValue(null);
            return;
        }
        Task<PaymentAccount> b = C25761d.m64299a().mo83587b(false);
        ExecutorService executorService = MoovitExecutors.COMPUTATION;
        Task<TContinuationResult> continueWith = b.continueWith(executorService, new C25550g(depositInstructions));
        C1040t<List<PaymentMethod>> tVar = this.f63966f;
        Objects.requireNonNull(tVar);
        continueWith.addOnSuccessListener((Executor) executorService, (OnSuccessListener<? super TContinuationResult>) new C17843u(tVar, 10));
    }

    /* renamed from: c */
    public final void mo83450c(List<PaymentMethod> list, PaymentMethod paymentMethod) {
        if (C13717b.m34258e(list)) {
            this.f63969i.setValue(null);
        } else if (paymentMethod == null || !list.contains(paymentMethod)) {
            this.f63969i.setValue(list.get(0));
        } else {
            this.f63969i.setValue(paymentMethod);
        }
    }

    public final void onCleared() {
        super.onCleared();
        C25761d.m64301k(this.f3907b, this.f63963c);
    }
}
