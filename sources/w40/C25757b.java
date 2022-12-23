package w40;

import android.content.SharedPreferences;
import c70.C13752e;
import ce0.C21100e;
import com.appboy.Appboy;
import com.braze.Braze;
import com.moovit.MoovitApplication;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.appdata.UserContextLoader;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.network.model.ServerId;
import com.moovit.payment.account.model.PaymentAccount;
import com.moovit.user.LocaleInfo;
import h60.C17302b0;
import h60.C17371y;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import k50.C25745b;
import p389bl.C13641g;
import p528gz.C17269d;
import p528gz.C17272g;
import p584jl.C17885a;
import p646lz.C18299a;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p824tp.C19722a0;
import p977zz.C20930c;
import p977zz.C20975x0;

/* renamed from: w40.b */
public final class C25757b implements Callable<PaymentAccount> {

    /* renamed from: e */
    public static final long f64254e = TimeUnit.HOURS.toMillis(6);

    /* renamed from: b */
    public final MoovitApplication<?, ?, ?> f64255b;

    /* renamed from: c */
    public final AtomicReference<C25758a> f64256c;

    /* renamed from: d */
    public final boolean f64257d;

    /* renamed from: w40.b$a */
    public static class C25758a {

        /* renamed from: e */
        public static final C25759a f64258e = new C25759a();

        /* renamed from: a */
        public final ServerId f64259a;

        /* renamed from: b */
        public final LocaleInfo f64260b;

        /* renamed from: c */
        public final PaymentAccount f64261c;

        /* renamed from: d */
        public final long f64262d;

        /* renamed from: w40.b$a$a */
        public class C25759a extends C19619s<C25758a> {
            public C25759a() {
                super(0, C25758a.class);
            }

            /* renamed from: a */
            public final boolean mo177a(int i) {
                return i == 0;
            }

            /* renamed from: b */
            public final Object mo178b(C19615p pVar, int i) throws IOException {
                pVar.getClass();
                return new C25758a(new ServerId(pVar.mo51924l()), (LocaleInfo) LocaleInfo.f23834e.read(pVar), (PaymentAccount) pVar.mo51962q(PaymentAccount.f64012k), pVar.mo51925m());
            }

            /* renamed from: c */
            public final void mo179c(Object obj, C19616q qVar) throws IOException {
                C25758a aVar = (C25758a) obj;
                ServerId serverId = aVar.f64259a;
                qVar.getClass();
                qVar.mo51939l(serverId.f15142b);
                LocaleInfo localeInfo = aVar.f64260b;
                LocaleInfo.C7877b bVar = LocaleInfo.f23834e;
                qVar.mo51939l(bVar.f49802v);
                bVar.mo179c(localeInfo, qVar);
                qVar.mo51967q(aVar.f64261c, PaymentAccount.f64012k);
                qVar.mo51940m(aVar.f64262d);
            }
        }

        public C25758a(ServerId serverId, LocaleInfo localeInfo, PaymentAccount paymentAccount, long j) {
            C21100e.m49373x(localeInfo, "locale");
            this.f64260b = localeInfo;
            C21100e.m49373x(serverId, "metroId");
            this.f64259a = serverId;
            this.f64261c = paymentAccount;
            this.f64262d = j;
        }
    }

    public C25757b(MoovitApplication<?, ?, ?> moovitApplication, AtomicReference<C25758a> atomicReference, boolean z) {
        C21100e.m49373x(moovitApplication, "application");
        this.f64255b = moovitApplication;
        C21100e.m49373x(atomicReference, "reference");
        this.f64256c = atomicReference;
        this.f64257d = z;
    }

    /* renamed from: a */
    public static C19722a0 m64294a(MoovitApplication<?, ?, ?> moovitApplication) {
        C21100e.m49355o();
        if (UserContextLoader.m40004l(moovitApplication)) {
            C18299a aVar = moovitApplication.f37321e;
            C19722a0 a0Var = (C19722a0) aVar.mo50695h("USER_CONTEXT", false);
            if (a0Var != null) {
                return a0Var;
            }
            StringBuilder k = C13555b.m33972k("Failed to load user context: ");
            k.append(aVar.mo50694g("USER_CONTEXT"));
            throw new ApplicationBugException(k.toString());
        }
        throw new ApplicationBugException("Missing user context!");
    }

    /* renamed from: b */
    public static boolean m64295b(ServerId serverId, LocaleInfo localeInfo, C25758a aVar, long j) {
        if (aVar != null && serverId.equals(aVar.f64259a) && aVar.f64260b.equals(localeInfo) && j - aVar.f64262d < f64254e) {
            return false;
        }
        return true;
    }

    public final Object call() throws Exception {
        C25758a aVar;
        C25758a aVar2;
        boolean z;
        ServerId serverId = m64294a(this.f64255b).f50160a.f32927c;
        LocaleInfo localeInfo = new LocaleInfo(C20930c.m49020b(this.f64255b));
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f64257d) {
            aVar = null;
        } else {
            aVar = this.f64256c.get();
        }
        if (m64295b(serverId, localeInfo, aVar, currentTimeMillis)) {
            if (this.f64257d) {
                aVar2 = null;
            } else {
                aVar2 = (C25758a) C13641g.m34133v(this.f64255b, "payment_account.dat", C25758a.f64258e);
            }
            if (m64295b(serverId, localeInfo, aVar2, currentTimeMillis)) {
                MoovitApplication<?, ?, ?> moovitApplication = this.f64255b;
                PaymentAccount paymentAccount = ((C17302b0) new C17371y(new C13752e(moovitApplication, m64294a(moovitApplication), (AnalyticsFlowKey) null)).mo52626J()).f44688m;
                C25758a aVar3 = new C25758a(serverId, localeInfo, paymentAccount, currentTimeMillis);
                if (C17269d.m43283a().f44638b) {
                    C17269d a = C17269d.m43283a();
                    C17272g gVar = a.f44640d;
                    if (paymentAccount == null) {
                        if (gVar.f44658a.getSharedPreferences("com.moovit.braze.profile", 0).getString("braze_user_id", (String) null) == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            Appboy.wipeData(a.f44637a);
                            a.f44640d.f44658a.getSharedPreferences("com.moovit.braze.profile", 0).edit().clear().apply();
                        }
                    } else {
                        String str = paymentAccount.f64013b;
                        SharedPreferences sharedPreferences = gVar.f44658a.getSharedPreferences("com.moovit.braze.profile", 0);
                        if (!C20975x0.m49118e(sharedPreferences.getString("braze_user_id", (String) null), str)) {
                            Braze.getInstance(gVar.f44658a).changeUser(str);
                            sharedPreferences.edit().clear().putString("braze_user_id", str).apply();
                        }
                        new C25745b(this.f64255b, paymentAccount).mo49820a();
                    }
                }
                C13641g.m34136y(this.f64255b, "payment_account.dat", aVar3, C25758a.f64258e);
                aVar2 = aVar3;
            }
            this.f64256c.set(aVar);
        }
        PaymentAccount paymentAccount2 = aVar.f64261c;
        if (paymentAccount2 == null) {
            C25761d a2 = C25761d.m64299a();
            SharedPreferences.Editor edit = a2.mo83589d().edit();
            C25761d.f64267d.mo49539b(edit);
            edit.remove(C25761d.f64266c.f43935a);
            edit.apply();
            C17885a.m44449m0(a2.f64271a, (String) null);
            a2.mo83592g("com.moovit.payment.account.action.deleted");
        }
        return paymentAccount2;
    }
}
