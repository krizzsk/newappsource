package h60;

import c70.C13746a;
import c70.C13749c;
import c70.C13780t;
import com.google.android.play.core.assetpacks.C14314s;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.commons.utils.LinkedText;
import com.moovit.payment.account.external.mot.MotPaymentMethodType;
import com.moovit.payment.account.model.PaymentAccountContextStatus;
import com.moovit.payment.registration.steps.p419cc.CreditCardInstructions;
import com.tranzmate.moovit.protocol.ptb.activations.MVPTBAccountContextStatus;
import com.tranzmate.moovit.protocol.ptb.activations.MVPTBAccountInfo;
import com.tranzmate.moovit.protocol.ptb.activations.MVPTBExternalAccountInfoResponse;
import com.tranzmate.moovit.protocol.ptb.activations.MVPTBPaymentMethodType;
import f60.C16947a;
import h60.C17353s0;
import java.io.IOException;
import org.apache.thrift.TBase;
import p551hy.C17517b;
import p810sz.C19617r;

/* renamed from: h60.r */
public final class C17349r extends C13780t<C17346q, C17349r, MVPTBExternalAccountInfoResponse> {

    /* renamed from: m */
    public C14314s f44734m;

    /* renamed from: n */
    public C17517b f44735n;

    /* renamed from: o */
    public CreditCardInstructions f44736o;

    public C17349r() {
        super(MVPTBExternalAccountInfoResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        MotPaymentMethodType motPaymentMethodType;
        String str;
        LinkedText linkedText;
        C17346q qVar = (C17346q) aVar;
        MVPTBExternalAccountInfoResponse mVPTBExternalAccountInfoResponse = (MVPTBExternalAccountInfoResponse) tBase;
        MVPTBAccountInfo mVPTBAccountInfo = mVPTBExternalAccountInfoResponse.info;
        C19617r rVar = C17353s0.f44739a;
        MVPTBPaymentMethodType mVPTBPaymentMethodType = mVPTBAccountInfo.type;
        int i = C17353s0.C17354a.f44754o[mVPTBPaymentMethodType.ordinal()];
        if (i == 1) {
            motPaymentMethodType = MotPaymentMethodType.PANGO;
        } else if (i == 2) {
            motPaymentMethodType = MotPaymentMethodType.BIT;
        } else {
            throw new IllegalStateException("Unknown payment method type: " + mVPTBPaymentMethodType);
        }
        C16947a o = C17353s0.m43401o(mVPTBAccountInfo.upcomingStatement);
        CreditCardInstructions creditCardInstructions = null;
        if (mVPTBAccountInfo.mo30795f()) {
            str = mVPTBAccountInfo.fourDigits;
        } else {
            str = null;
        }
        this.f44734m = new C14314s(motPaymentMethodType, o, str);
        MVPTBAccountContextStatus mVPTBAccountContextStatus = mVPTBExternalAccountInfoResponse.accountStatus;
        PaymentAccountContextStatus i2 = C17353s0.m43395i(mVPTBAccountContextStatus.status);
        if (mVPTBAccountContextStatus.mo30787f()) {
            linkedText = C13749c.m34323i(mVPTBAccountContextStatus.message);
        } else {
            linkedText = null;
        }
        this.f44735n = new C17517b(i2, linkedText);
        if (mVPTBExternalAccountInfoResponse.mo30907g()) {
            creditCardInstructions = C17353s0.m43389c("IsraelMot", mVPTBExternalAccountInfoResponse.changeCreditCardInstructions);
        }
        this.f44736o = creditCardInstructions;
    }
}
