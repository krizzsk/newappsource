package p633lm;

import com.masabi.justride.sdk.jobs.purchase.payment.PaymentDataException;
import java.util.ArrayList;
import p705on.C18804k;
import p705on.C18810p;
import p752qn.C19148f;
import p843uk.C19936i0;
import p843uk.C19943m;
import p843uk.C19947q;
import p843uk.C19949s;

/* renamed from: lm.f */
public final class C18245f {

    /* renamed from: a */
    public C19148f f46546a;

    /* renamed from: b */
    public ArrayList f46547b = new ArrayList();

    /* renamed from: c */
    public C18804k f46548c;

    /* renamed from: d */
    public String f46549d;

    /* renamed from: e */
    public C18810p f46550e;

    /* renamed from: a */
    public final C18245f mo50657a(C19148f fVar, C19949s sVar) throws PaymentDataException {
        if (sVar instanceof C19943m) {
            this.f46547b.add(new C19947q(fVar.f48695b, (C19943m) sVar));
            return this;
        } else if (sVar instanceof C19936i0) {
            this.f46547b.add(new C19947q(fVar.f48695b, (C19936i0) sVar));
            return this;
        } else {
            StringBuilder k = C13555b.m33972k("Unsupported payment with class ");
            k.append(sVar.getClass());
            k.append(" to the request.");
            throw new PaymentDataException(k.toString());
        }
    }
}
