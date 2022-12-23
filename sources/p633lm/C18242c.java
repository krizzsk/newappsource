package p633lm;

import ce0.C21100e;
import com.masabi.justride.sdk.exception.JustRideSdkException;
import com.masabi.justride.sdk.jobs.purchase.payment.PaymentDataException;
import p358af.C13437d;
import p413co.C13869o;
import p413co.C13872r;
import p705on.C18799g;
import p705on.C18807m;
import p705on.C18808n;
import p843uk.C19917a;
import p843uk.C19943m;
import p843uk.C19949s;

/* renamed from: lm.c */
public final class C18242c {

    /* renamed from: a */
    public final C13869o f46540a;

    public C18242c(C13869o oVar) {
        this.f46540a = oVar;
    }

    /* renamed from: a */
    public static C19949s m44973a(C18799g gVar) throws PaymentDataException {
        return new C19943m(gVar.f47861a, gVar.f47862b, gVar.f47863c, gVar.f47864d, new C19917a(gVar.f47865e), gVar.f47867g.booleanValue());
    }

    /* renamed from: b */
    public final void mo50654b(C18799g gVar, String str) throws PaymentDataException {
        if (gVar instanceof C18807m) {
            C18807m mVar = (C18807m) gVar;
            C13872r<String> b = this.f46540a.mo40793b(str);
            if (b.mo40817a()) {
                throw new PaymentDataException(C13437d.m33706k("Cannot extract secure payment card number for finalisedOrderId ", str, "."));
            } else if (!C21100e.m49352m0((CharSequence) b.f34119a)) {
                String str2 = (String) b.f34119a;
                mo50655c(str);
                throw new JustRideSdkException("Card holder name required");
            } else {
                throw new PaymentDataException(C13437d.m33706k("Secure payment card number is null for finalisedOrderId ", str, "."));
            }
        } else if (gVar instanceof C18808n) {
            C18808n nVar = (C18808n) gVar;
            mo50655c(str);
            throw new JustRideSdkException("Token required");
        } else {
            throw new PaymentDataException("Cannot convert " + C18799g.class + " (secure) to non secure PaymentData.");
        }
    }

    /* renamed from: c */
    public final void mo50655c(String str) throws PaymentDataException {
        C13872r<String> c = this.f46540a.mo40794c(str);
        if (c.mo40817a()) {
            throw new PaymentDataException(C13437d.m33706k("Cannot extract secure security code for finalisedOrderId ", str, "."));
        } else if (!C21100e.m49352m0((CharSequence) c.f34119a)) {
            String str2 = (String) c.f34119a;
        } else {
            throw new PaymentDataException(C13437d.m33706k("Secure security code is null for finalisedOrderId ", str, "."));
        }
    }
}
