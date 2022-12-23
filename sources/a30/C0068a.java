package a30;

import android.app.Application;
import android.content.Context;
import b30.C1465a;
import b30.C1466b;
import b30.C1468d;
import b30.C1469e;
import c70.C13749c;
import c70.C13752e;
import ce0.C21100e;
import com.google.android.play.core.assetpacks.C14333w2;
import com.masabi.justride.sdk.jobs.purchase.payment.C14656a;
import com.masabi.justride.sdk.models.account.LoginResult;
import com.moovit.MoovitApplication;
import com.moovit.commons.request.ServerException;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.masabi.MasabiException;
import com.moovit.request.UserRequestError;
import com.moovit.util.CurrencyAmount;
import com.moovit.view.p340cc.C7959a;
import com.tranzmate.moovit.protocol.payments.MVMissingPaymentRegistrationSteps;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p366an.C13496c;
import p388bk.C13634a;
import p443dm.C16681f;
import p490fl.C17036d;
import p583jk.C17875h;
import p586jn.C17897c;
import p586jn.C17898d;
import p605ki.C18047b;
import p605ki.C18056j;
import p634ln.C18247a;
import p705on.C18794b;
import p705on.C18796d;
import p705on.C18799g;
import p705on.C18809o;
import p725pj.C18926a;
import p774rn.C19291a;
import p798sn.C19493a;
import p917xm.C20541d;

/* renamed from: a30.a */
public final class C0068a {

    /* renamed from: d */
    public static final HashMap f142d = new HashMap(2);

    /* renamed from: a */
    public final Application f143a;

    /* renamed from: b */
    public final Map<String, String> f144b;

    /* renamed from: c */
    public C18047b f145c = null;

    public C0068a(MoovitApplication moovitApplication, String str) {
        C21100e.m49373x(moovitApplication, "application");
        this.f143a = moovitApplication;
        C21100e.m49373x(str, "configuration");
        this.f144b = Collections.unmodifiableMap(Collections.singletonMap("conf", str));
    }

    /* renamed from: b */
    public static C0068a m120b(String str) {
        HashMap hashMap = f142d;
        C0068a aVar = (C0068a) hashMap.get(str);
        if (aVar == null) {
            synchronized (hashMap) {
                try {
                    aVar = (C0068a) hashMap.get(str);
                    if (aVar == null) {
                        aVar = new C0068a(MoovitApplication.f37317k, str);
                        hashMap.put(str, aVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return aVar;
    }

    /* renamed from: c */
    public static C0068a m121c(Map<String, String> map) {
        String str = map.get("conf");
        if (str != null) {
            return m120b(str);
        }
        throw new ApplicationBugException("Received non-masabi payload!");
    }

    /* renamed from: a */
    public final synchronized void mo160a(C19291a aVar) throws MasabiException, ServerException {
        if (mo163f()) {
            C13496c.C13497a aVar2 = (C13496c.C13497a) mo161d().f46178h.f46230a.mo49505a(C13496c.C13497a.class, (String) null);
            mo168k(new C14333w2(new C13496c(aVar2.f33397a, aVar2.f33398b, aVar2.f33399c, aVar).mo40394C()), "Failed to complete ticket activation");
        } else {
            throw new IllegalStateException("Activation confirmation ticket with anonymous user!");
        }
    }

    /* renamed from: d */
    public final C18047b mo161d() throws MasabiException, ServerException {
        C21100e.m49355o();
        if (this.f145c == null) {
            synchronized (this) {
                if (this.f145c == null) {
                    this.f145c = C0070b.m131a(this.f143a, this.f144b.get("conf"));
                }
            }
        }
        return this.f145c;
    }

    /* renamed from: e */
    public final synchronized C18247a mo162e(Integer num) throws ServerException {
        C14333w2 a;
        a = mo161d().f46175e.mo50527a(num.intValue());
        mo168k(a, "Failed to get station with id " + num);
        return (C18247a) a.f36107c;
    }

    /* renamed from: f */
    public final synchronized boolean mo163f() throws MasabiException, ServerException {
        C14333w2 w2Var;
        w2Var = new C14333w2(((C17036d) mo161d().f46176f.f46171a.mo49505a(C17036d.class, (String) null)).mo49645a());
        mo168k(w2Var, "Failed to check login status");
        return ((C17898d) w2Var.f36107c).f45931b;
    }

    /* renamed from: g */
    public final synchronized void mo164g(String str) throws MasabiException, ServerException {
        if (!mo163f()) {
            C14333w2 a = mo161d().f46176f.mo50523a(str);
            mo168k(a, "Failed to login user");
            LoginResult loginResult = ((C17897c) a.f36107c).f45928b;
            if (loginResult == LoginResult.SUCCESS) {
                mo167j();
                return;
            }
            throw new MasabiException("Failed to login user: " + loginResult);
        }
    }

    /* renamed from: h */
    public final C1469e mo165h(C18056j jVar, C13752e eVar, C18796d dVar, String str, CurrencyAmount currencyAmount, C0071c cVar) throws ServerException {
        try {
            C14333w2 d = jVar.mo50531d(dVar);
            mo168k(d, "Failed to get external payment request");
            C1469e eVar2 = (C1469e) new C1468d(eVar, str, (C18794b) d.f36107c, cVar, currencyAmount).mo52626J();
            if (eVar2.f5342m == null) {
                C14656a.C14657a aVar = (C14656a.C14657a) jVar.f46192a.mo49505a(C14656a.C14657a.class, (String) null);
                mo168k(new C14333w2(new C14656a(aVar.f37132a, aVar.f37133b, aVar.f37134c, aVar.f37135d, (C18794b) d.f36107c).mo40394C()), "Failed to complete external payment request order");
            }
            return eVar2;
        } catch (IOException e) {
            throw new MasabiException("Failed to purchase masabi ticket!", (Exception) e);
        }
    }

    /* renamed from: i */
    public final C1469e mo166i(C18056j jVar, C13752e eVar, String str, C18796d dVar, CurrencyAmount currencyAmount, C16681f fVar) throws ServerException {
        C14333w2 w2Var;
        String str2;
        C18809o oVar;
        C18799g v = C17875h.m44311v((C7959a) fVar.f43450a);
        long o = C13749c.m34329o(((CurrencyAmount) fVar.f43451b).f23845c);
        C18799g v2 = C17875h.m44311v((C7959a) fVar.f43452c);
        long o2 = C13749c.m34329o(((CurrencyAmount) fVar.f43453d).f23845c);
        UserRequestError userRequestError = null;
        if (o2 == 0) {
            try {
                w2Var = jVar.mo50528a(dVar, v);
            } catch (MasabiException e) {
                Context context = eVar.f33852a;
                C18926a b = e.mo19356b();
                if (b != null) {
                    int intValue = b.f48170b.intValue();
                    Integer num = C13634a.f33607K;
                    if (intValue == num.intValue() && (oVar = dVar.f47850c.f47891i) != null) {
                        userRequestError = new UserRequestError(num.intValue(), context.getString(C0075g.masabi_error_split_min_amount_violation_title), context.getString(C0075g.masabi_error_split_min_amount_violation_message, new Object[]{new CurrencyAmount(dVar.f47852e.f48694a, new BigDecimal(oVar.f47915a).movePointLeft(2)).toString()}));
                    }
                }
                if (userRequestError != null) {
                    throw userRequestError;
                }
                throw e;
            }
        } else if (o == 0) {
            w2Var = jVar.mo50528a(dVar, v2);
        } else {
            w2Var = jVar.mo50529b(dVar, v, o, v2, o2);
        }
        mo168k(w2Var, "Failed to split purchase!");
        try {
            str2 = ((C1466b) new C1465a(eVar, str, currencyAmount).mo52626J()).f5336m;
        } catch (Exception unused) {
            str2 = null;
        }
        return new C1469e(str2);
    }

    /* renamed from: j */
    public final synchronized void mo167j() throws MasabiException, ServerException {
        if (((C20541d) mo161d().f46177g.f46231a.mo49505a(C20541d.class, (String) null)).mo40394C().f33366b != null) {
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006b, code lost:
        if (r3.equals("ticket.access") == false) goto L_0x0079;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo168k(com.google.android.play.core.assetpacks.C14333w2 r8, java.lang.String r9) throws com.moovit.commons.request.ServerException {
        /*
            r7 = this;
            java.lang.Object r8 = r8.f36108d
            r0 = r8
            pj.a r0 = (p725pj.C18926a) r0
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x000b
            r0 = 1
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            if (r0 == 0) goto L_0x0135
            pj.a r8 = (p725pj.C18926a) r8
            java.lang.Integer r0 = r8.f48170b
            r8.mo51439b()
            android.app.Application r0 = r7.f143a
            java.lang.String r3 = r8.f48169a
            java.lang.Integer r4 = r8.f48170b
            int r4 = r4.intValue()
            r3.getClass()
            r5 = -1
            int r6 = r3.hashCode()
            switch(r6) {
                case -1935585176: goto L_0x006e;
                case -1477596538: goto L_0x0064;
                case -1177318867: goto L_0x0059;
                case -795192327: goto L_0x004d;
                case 172823864: goto L_0x0041;
                case 1639436035: goto L_0x0036;
                case 1743324417: goto L_0x002b;
                default: goto L_0x002a;
            }
        L_0x002a:
            goto L_0x0079
        L_0x002b:
            java.lang.String r1 = "purchase"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x0034
            goto L_0x0079
        L_0x0034:
            r1 = 6
            goto L_0x007a
        L_0x0036:
            java.lang.String r1 = "authentication.token"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x003f
            goto L_0x0079
        L_0x003f:
            r1 = 5
            goto L_0x007a
        L_0x0041:
            java.lang.String r1 = "ticket.activation"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x004b
            goto L_0x0079
        L_0x004b:
            r1 = 4
            goto L_0x007a
        L_0x004d:
            java.lang.String r1 = "wallet"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x0057
            goto L_0x0079
        L_0x0057:
            r1 = 3
            goto L_0x007a
        L_0x0059:
            java.lang.String r1 = "account"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x0062
            goto L_0x0079
        L_0x0062:
            r1 = 2
            goto L_0x007a
        L_0x0064:
            java.lang.String r6 = "ticket.access"
            boolean r3 = r3.equals(r6)
            if (r3 != 0) goto L_0x007a
            goto L_0x0079
        L_0x006e:
            java.lang.String r1 = "account.login"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x0077
            goto L_0x0079
        L_0x0077:
            r1 = 0
            goto L_0x007a
        L_0x0079:
            r1 = -1
        L_0x007a:
            r3 = 100
            r5 = 0
            switch(r1) {
                case 0: goto L_0x011e;
                case 1: goto L_0x0115;
                case 2: goto L_0x0108;
                case 3: goto L_0x00fb;
                case 4: goto L_0x00f0;
                case 5: goto L_0x00e5;
                case 6: goto L_0x0082;
                default: goto L_0x0080;
            }
        L_0x0080:
            goto L_0x012c
        L_0x0082:
            r1 = 103(0x67, float:1.44E-43)
            if (r4 == r1) goto L_0x00dc
            r1 = 111(0x6f, float:1.56E-43)
            if (r4 == r1) goto L_0x0098
            r1 = 200(0xc8, float:2.8E-43)
            if (r4 == r1) goto L_0x0090
            goto L_0x012c
        L_0x0090:
            int r1 = a30.C0075g.payment_general_error_message
            com.moovit.request.UserRequestError r5 = ce0.C21100e.m49317L(r0, r4, r2, r1)
            goto L_0x012c
        L_0x0098:
            java.lang.String r1 = r8.f48171c
            boolean r3 = p977zz.C20964s0.m49090h(r1)
            if (r3 == 0) goto L_0x00a8
            int r1 = a30.C0075g.payment_activation_failed_msg
            com.moovit.request.UserRequestError r5 = ce0.C21100e.m49317L(r0, r4, r2, r1)
            goto L_0x012c
        L_0x00a8:
            java.lang.String r2 = "DECLINED"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x00ba
            int r1 = a30.C0075g.payment_card_declined_error_title
            int r2 = a30.C0075g.payment_card_declined_error_subtitle
            com.moovit.request.UserRequestError r5 = ce0.C21100e.m49317L(r0, r4, r1, r2)
            goto L_0x012c
        L_0x00ba:
            java.lang.String r2 = "EXPIRED_CARD"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x00cb
            int r1 = a30.C0075g.payment_card_expired_error_title
            int r2 = a30.C0075g.payment_card_expired_error_subtitle
            com.moovit.request.UserRequestError r5 = ce0.C21100e.m49317L(r0, r4, r1, r2)
            goto L_0x012c
        L_0x00cb:
            java.lang.String r2 = "INSUFFICIENT_FUNDS"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x012c
            int r1 = a30.C0075g.payment_card_nofunds_error_title
            int r2 = a30.C0075g.payment_card_nofunds_error_subtitle
            com.moovit.request.UserRequestError r5 = ce0.C21100e.m49317L(r0, r4, r1, r2)
            goto L_0x012c
        L_0x00dc:
            int r1 = a30.C0075g.maximum_ticket_type_error_title
            int r2 = a30.C0075g.maximum_ticket_type_error_msg
            com.moovit.request.UserRequestError r5 = ce0.C21100e.m49317L(r0, r4, r1, r2)
            goto L_0x012c
        L_0x00e5:
            if (r4 != r3) goto L_0x012c
            int r1 = a30.C0075g.patmetnt_disconnected_error_title
            int r2 = a30.C0075g.patmetnt_disconnected_error_msg
            com.moovit.request.UserRequestError r5 = ce0.C21100e.m49317L(r0, r4, r1, r2)
            goto L_0x012c
        L_0x00f0:
            r1 = 101(0x65, float:1.42E-43)
            if (r4 != r1) goto L_0x012c
            int r1 = a30.C0075g.payment_activation_failed_msg
            com.moovit.request.UserRequestError r5 = ce0.C21100e.m49317L(r0, r4, r2, r1)
            goto L_0x012c
        L_0x00fb:
            r1 = 900(0x384, float:1.261E-42)
            if (r4 != r1) goto L_0x012c
            int r1 = a30.C0075g.payement_general_error_no_later
            int r2 = a30.C0075g.payment_contact_support_error
            com.moovit.request.UserRequestError r5 = ce0.C21100e.m49317L(r0, r4, r1, r2)
            goto L_0x012c
        L_0x0108:
            r1 = 106(0x6a, float:1.49E-43)
            if (r4 != r1) goto L_0x012c
            int r1 = a30.C0075g.patmetnt_disconnected_error_title
            int r2 = a30.C0075g.patmetnt_disconnected_error_msg
            com.moovit.request.UserRequestError r5 = ce0.C21100e.m49317L(r0, r4, r1, r2)
            goto L_0x012c
        L_0x0115:
            if (r4 != r3) goto L_0x012c
            int r1 = a30.C0075g.payment_general_error_message
            com.moovit.request.UserRequestError r5 = ce0.C21100e.m49317L(r0, r4, r2, r1)
            goto L_0x012c
        L_0x011e:
            r1 = 128(0x80, float:1.794E-43)
            if (r4 == r1) goto L_0x0126
            r1 = 134(0x86, float:1.88E-43)
            if (r4 != r1) goto L_0x012c
        L_0x0126:
            int r1 = a30.C0075g.payment_general_error_message
            com.moovit.request.UserRequestError r5 = ce0.C21100e.m49317L(r0, r4, r2, r1)
        L_0x012c:
            if (r5 == 0) goto L_0x012f
            throw r5
        L_0x012f:
            com.moovit.masabi.MasabiException r0 = new com.moovit.masabi.MasabiException
            r0.<init>((p725pj.C18926a) r8, (java.lang.String) r9)
            throw r0
        L_0x0135:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a30.C0068a.mo168k(com.google.android.play.core.assetpacks.w2, java.lang.String):void");
    }

    /* renamed from: a30.a$a */
    public static class C0069a {

        /* renamed from: a */
        public final List<C19493a> f146a;

        /* renamed from: b */
        public final String f147b;

        /* renamed from: c */
        public final MVMissingPaymentRegistrationSteps f148c;

        public C0069a(ArrayList arrayList, String str) {
            this.f146a = arrayList;
            this.f147b = str;
            this.f148c = null;
        }

        public C0069a(MVMissingPaymentRegistrationSteps mVMissingPaymentRegistrationSteps) {
            this.f146a = null;
            this.f147b = null;
            C21100e.m49373x(mVMissingPaymentRegistrationSteps, "mvMissingSteps");
            this.f148c = mVMissingPaymentRegistrationSteps;
        }
    }
}
