package n50;

import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.moovit.commons.request.ServerException;
import com.moovit.payment.clearance.ClearanceProviderPaymentInstructions;
import com.moovit.view.p340cc.C7959a;
import com.tranzmate.moovit.protocol.payments.MVCardType;
import com.tranzmate.moovit.protocol.payments.MVClearanceProviderType;
import com.tranzmate.moovit.protocol.payments.MVTokenizeCreditCardEncryptedRequest;
import com.tranzmate.moovit.protocol.payments.MVTokenizeReturnUrls;
import com.usebutton.sdk.internal.models.Widget;
import h60.C17353s0;
import java.io.IOException;
import v40.C25754i;

/* renamed from: n50.d */
public final class C18525d extends C13778r<C18525d, C18526e, MVTokenizeCreditCardEncryptedRequest> {

    /* renamed from: A */
    public final String f47148A;

    /* renamed from: B */
    public final ClearanceProviderPaymentInstructions f47149B;

    /* renamed from: C */
    public final boolean f47150C;

    /* renamed from: w */
    public final C7959a f47151w;

    /* renamed from: x */
    public final String f47152x;

    /* renamed from: y */
    public final String f47153y;

    /* renamed from: z */
    public final String f47154z;

    public C18525d(C13752e eVar, C7959a aVar, String str, String str2, String str3, String str4, ClearanceProviderPaymentInstructions clearanceProviderPaymentInstructions, boolean z) {
        super(eVar, C25754i.server_path_app_server_secured_url, C25754i.api_path_payment_tokenize_buckaroo_credit_card, C18526e.class);
        C21100e.m49373x(aVar, Widget.VIEW_TYPE_CARD);
        this.f47151w = aVar;
        C21100e.m49373x(str, "successUrl");
        this.f47152x = str;
        C21100e.m49373x(str2, "failureUrl");
        this.f47153y = str2;
        C21100e.m49373x(str3, "rejectedUrl");
        this.f47154z = str3;
        C21100e.m49373x(str4, "cancelUrl");
        this.f47148A = str4;
        this.f47149B = clearanceProviderPaymentInstructions;
        this.f47150C = z;
    }

    /* renamed from: H */
    public final void mo5818H() throws IOException, ServerException {
        MVTokenizeReturnUrls mVTokenizeReturnUrls = new MVTokenizeReturnUrls(this.f47152x, this.f47153y, this.f47154z, this.f47148A);
        MVCardType r = C17353s0.m43404r(this.f47151w.f24092a);
        C7959a aVar = this.f47151w;
        String c = C18522a.m45411c(aVar.f24093b + AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR + aVar.f24095d + AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR + aVar.f24094c + AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR + aVar.f24096e + AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR + aVar.f24097f);
        MVClearanceProviderType mVClearanceProviderType = MVClearanceProviderType.BUCKAROO;
        RO mVTokenizeCreditCardEncryptedRequest = new MVTokenizeCreditCardEncryptedRequest();
        mVTokenizeCreditCardEncryptedRequest.clearanceProvider = mVClearanceProviderType;
        mVTokenizeCreditCardEncryptedRequest.returnUrls = mVTokenizeReturnUrls;
        mVTokenizeCreditCardEncryptedRequest.encryptedData = c;
        mVTokenizeCreditCardEncryptedRequest.cardType = r;
        ClearanceProviderPaymentInstructions clearanceProviderPaymentInstructions = this.f47149B;
        if (clearanceProviderPaymentInstructions != null) {
            mVTokenizeCreditCardEncryptedRequest.paymentProperties = C17353s0.m43406t(clearanceProviderPaymentInstructions, this.f47150C);
        }
        this.f33922v = mVTokenizeCreditCardEncryptedRequest;
        super.mo5818H();
    }
}
