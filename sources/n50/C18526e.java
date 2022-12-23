package n50;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.payment.clearance.CreditCard3DSException;
import com.moovit.payment.clearance.CreditCardToken;
import com.moovit.view.p340cc.C7959a;
import com.moovit.view.p340cc.CreditCardPreview;
import com.tranzmate.moovit.protocol.payments.MVTokenizeCreditCardEncryptedResponse;
import h60.C17353s0;
import java.io.IOException;
import org.apache.thrift.TBase;
import p977zz.C20964s0;

/* renamed from: n50.e */
public final class C18526e extends C13780t<C18525d, C18526e, MVTokenizeCreditCardEncryptedResponse> {

    /* renamed from: m */
    public CreditCardToken f47155m;

    /* renamed from: n */
    public String f47156n;

    public C18526e() {
        super(MVTokenizeCreditCardEncryptedResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C18525d dVar = (C18525d) aVar;
        MVTokenizeCreditCardEncryptedResponse mVTokenizeCreditCardEncryptedResponse = (MVTokenizeCreditCardEncryptedResponse) tBase;
        String str = mVTokenizeCreditCardEncryptedResponse.token;
        if (!C20964s0.m49090h(str)) {
            C7959a aVar2 = dVar.f47151w;
            this.f47155m = new CreditCardToken(str, new CreditCardPreview(aVar2.f24092a, aVar2.mo24845a(), aVar2.f24094c, aVar2.f24095d));
            String str2 = mVTokenizeCreditCardEncryptedResponse.paymentToken;
            this.f47156n = str2;
            if (dVar.f47149B == null || str2 != null) {
                String str3 = mVTokenizeCreditCardEncryptedResponse.verificationUrl;
                if (str3 != null) {
                    throw new CreditCard3DSException(str3, this.f47155m, C17353s0.m43402p(mVTokenizeCreditCardEncryptedResponse.returnUrls), this.f47156n);
                }
                return;
            }
            throw new BadResponseException("Payment token can't be null when payment instructions not null");
        }
        throw new BadResponseException("Token can't be null");
    }
}
