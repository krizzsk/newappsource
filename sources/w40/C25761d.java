package w40;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import c70.C13752e;
import ce0.C21100e;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitApplication;
import com.moovit.MoovitExecutors;
import com.moovit.payment.account.model.PaymentAccount;
import com.moovit.payment.gateway.PaymentGateway;
import com.moovit.payment.gateway.PaymentGatewayType;
import com.moovit.payment.gateway.paymentmethod.PaymentMethodGateway;
import com.moovit.payment.registration.AccountAuthType;
import f00.C16919g;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicReference;
import p130j2.C5367a;
import p172m9.C5720b;
import p584jl.C17885a;
import p664mu.C18459n;
import w40.C25757b;

/* renamed from: w40.d */
public final class C25761d {

    /* renamed from: c */
    public static final C16919g.C16928i f64266c = new C16919g.C16928i("account_id", (String) null);

    /* renamed from: d */
    public static final C16919g.C16921b f64267d = new C16919g.C16921b("account_auth_type", AccountAuthType.CODER, null);

    /* renamed from: e */
    public static final C16919g.C16921b f64268e = new C16919g.C16921b("default_payment_gateway_type", PaymentGatewayType.CODER, null);

    /* renamed from: f */
    public static final ThreadPoolExecutor f64269f = C5720b.m14033A(1, "m-pa");

    /* renamed from: g */
    public static volatile C25761d f64270g;

    /* renamed from: a */
    public final MoovitApplication<?, ?, ?> f64271a;

    /* renamed from: b */
    public final AtomicReference<C25757b.C25758a> f64272b = new AtomicReference<>((Object) null);

    public C25761d(MoovitApplication<?, ?, ?> moovitApplication) {
        C21100e.m49373x(moovitApplication, "application");
        this.f64271a = moovitApplication;
    }

    /* renamed from: a */
    public static C25761d m64299a() {
        C25761d dVar = f64270g;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalStateException("You must call initialize first!");
    }

    /* renamed from: h */
    public static void m64300h(Context context, BroadcastReceiver broadcastReceiver) {
        String[] strArr = {"com.moovit.payment.account.action.created", "com.moovit.payment.account.action.deleted", "com.moovit.payment.account.action.updated"};
        IntentFilter intentFilter = new IntentFilter();
        for (int i = 0; i < 3; i++) {
            intentFilter.addAction(strArr[i]);
        }
        C5367a.m13473a(context).mo21146b(broadcastReceiver, intentFilter);
    }

    /* renamed from: k */
    public static void m64301k(Context context, BroadcastReceiver broadcastReceiver) {
        C5367a.m13473a(context).mo21148d(broadcastReceiver);
    }

    /* renamed from: b */
    public final Task<PaymentAccount> mo83587b(boolean z) {
        if (!mo83590e()) {
            return Tasks.forResult(null);
        }
        return Tasks.call(f64269f, new C25757b(this.f64271a, this.f64272b, z));
    }

    /* renamed from: c */
    public final String mo83588c() {
        return f64266c.mo19759a(mo83589d());
    }

    /* renamed from: d */
    public final SharedPreferences mo83589d() {
        return this.f64271a.getSharedPreferences("payment_account_manager", 0);
    }

    /* renamed from: e */
    public final boolean mo83590e() {
        return mo83588c() != null;
    }

    /* renamed from: f */
    public final void mo83591f() {
        mo83592g("com.moovit.payment.account.action.updated");
    }

    /* renamed from: g */
    public final void mo83592g(String str) {
        Tasks.call(f64269f, new C25756a(this.f64271a, this.f64272b)).addOnSuccessListener(MoovitExecutors.MAIN_THREAD, new C18459n(2, this, str));
    }

    /* renamed from: i */
    public final void mo83593i(PaymentGatewayType paymentGatewayType, PaymentGateway paymentGateway) {
        if (paymentGatewayType.capabilities.contains(1)) {
            f64268e.mo49545d(mo83589d(), paymentGatewayType);
            if (PaymentGatewayType.PAYMENT_METHOD.equals(paymentGatewayType) && paymentGateway != null) {
                C13752e l = this.f64271a.mo44560l();
                mo83587b(false).onSuccessTask(MoovitExecutors.f37327IO, new C25760c(0, ((PaymentMethodGateway) paymentGateway).f42704b.f64052b, l));
            }
        }
    }

    /* renamed from: j */
    public final void mo83594j(AccountAuthType accountAuthType, String str) {
        SharedPreferences.Editor edit = mo83589d().edit();
        f64267d.mo19760c(edit, accountAuthType);
        f64266c.mo19760c(edit, str);
        edit.apply();
        C17885a.m44449m0(this.f64271a, str);
        mo83592g("com.moovit.payment.account.action.created");
    }
}
