package h60;

import c00.C13720d;
import c00.C13722f;
import c70.C13746a;
import c70.C13749c;
import c70.C13780t;
import com.facebook.appevents.C2342l;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.payment.account.model.PaymentAccount;
import com.moovit.payment.account.model.PaymentAccountBadgeType;
import com.moovit.payment.account.model.PersonalDetails;
import com.moovit.payment.account.settings.PaymentAccountSettings;
import com.moovit.view.address.Address;
import com.tranzmate.moovit.protocol.common.MVUserAddress;
import com.tranzmate.moovit.protocol.payments.MVPaymentAccount;
import com.tranzmate.moovit.protocol.payments.MVPaymentAccountBadgeType;
import com.tranzmate.moovit.protocol.payments.MVPaymentAccountPersonalInfo;
import com.tranzmate.moovit.protocol.payments.MVPaymentAccountResponse;
import com.tranzmate.moovit.protocol.payments.MVPaymentAccountSettings;
import h60.C17353s0;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.apache.thrift.TBase;
import p009a8.C0112l;
import p054d0.C4303q;
import p066e0.C4454r0;
import p810sz.C19617r;
import p826tr.C19752b;
import p900wt.C20415e;
import p977zz.C20952m0;

/* renamed from: h60.b0 */
public final class C17302b0 extends C13780t<C17371y, C17302b0, MVPaymentAccountResponse> {

    /* renamed from: m */
    public PaymentAccount f44688m = null;

    public C17302b0() {
        super(MVPaymentAccountResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        List list;
        String str;
        String str2;
        String str3;
        String str4;
        List list2;
        long j;
        Address address;
        C13722f fVar;
        List list3;
        List list4;
        List list5;
        PaymentAccountBadgeType paymentAccountBadgeType;
        Boolean bool;
        List list6;
        PaymentAccountBadgeType paymentAccountBadgeType2;
        C17371y yVar = (C17371y) aVar;
        MVPaymentAccountResponse mVPaymentAccountResponse = (MVPaymentAccountResponse) tBase;
        PaymentAccount paymentAccount = null;
        if (mVPaymentAccountResponse.mo30167f()) {
            MVPaymentAccount mVPaymentAccount = mVPaymentAccountResponse.account;
            C19617r rVar = C17353s0.f44739a;
            String str5 = mVPaymentAccount.accountId;
            if (mVPaymentAccount.mo30097o()) {
                list = C13720d.m34273c(mVPaymentAccount.userPaymentContexts, (C13722f) null, new C0112l(16));
            } else {
                list = Collections.emptyList();
            }
            List list7 = list;
            MVPaymentAccountPersonalInfo mVPaymentAccountPersonalInfo = mVPaymentAccount.personalInfo;
            if (mVPaymentAccountPersonalInfo.mo30135i()) {
                str = mVPaymentAccountPersonalInfo.firstName;
            } else {
                str = null;
            }
            if (mVPaymentAccountPersonalInfo.mo30137k()) {
                str2 = mVPaymentAccountPersonalInfo.lastName;
            } else {
                str2 = null;
            }
            if (mVPaymentAccountPersonalInfo.mo30133h()) {
                str3 = mVPaymentAccountPersonalInfo.email;
            } else {
                str3 = null;
            }
            if (mVPaymentAccountPersonalInfo.mo30138l()) {
                str4 = mVPaymentAccountPersonalInfo.phoneNumber;
            } else {
                str4 = null;
            }
            if (mVPaymentAccountPersonalInfo.mo30136j()) {
                list2 = C13720d.m34273c(mVPaymentAccountPersonalInfo.ids, (C13722f) null, new C4454r0(19));
            } else {
                list2 = Collections.emptyList();
            }
            List list8 = list2;
            if (mVPaymentAccountPersonalInfo.mo30132g()) {
                j = mVPaymentAccountPersonalInfo.birthDate;
            } else {
                j = -1;
            }
            long j2 = j;
            if (mVPaymentAccountPersonalInfo.mo30131f()) {
                MVUserAddress mVUserAddress = mVPaymentAccountPersonalInfo.address;
                C20952m0<Integer> m0Var = C13749c.f33838a;
                address = new Address(mVUserAddress.streetAddress, mVUserAddress.streetAddress2, mVUserAddress.city, mVUserAddress.countryAlpha2Code, mVUserAddress.stateCode, mVUserAddress.postalCode);
            } else {
                address = null;
            }
            PersonalDetails personalDetails = new PersonalDetails(str, str2, str3, str4, list8, j2, address);
            if (mVPaymentAccount.mo30093j()) {
                fVar = null;
                list3 = C13720d.m34273c(mVPaymentAccount.paymentMethods, (C13722f) null, new C4303q(19));
            } else {
                fVar = null;
                list3 = Collections.emptyList();
            }
            if (mVPaymentAccount.mo30095l()) {
                list4 = C13720d.m34273c(mVPaymentAccount.profiles, fVar, new C20415e(13));
            } else {
                list4 = Collections.emptyList();
            }
            List list9 = list4;
            if (mVPaymentAccount.mo30092i()) {
                list5 = C13720d.m34273c(mVPaymentAccount.certificates, fVar, new C19752b(16));
            } else {
                list5 = Collections.emptyList();
            }
            List list10 = list5;
            if (mVPaymentAccount.mo30090h()) {
                MVPaymentAccountBadgeType mVPaymentAccountBadgeType = mVPaymentAccount.badge;
                int i = C17353s0.C17354a.f44747h[mVPaymentAccountBadgeType.ordinal()];
                if (i == 1) {
                    paymentAccountBadgeType2 = PaymentAccountBadgeType.INFO;
                } else if (i == 2) {
                    paymentAccountBadgeType2 = PaymentAccountBadgeType.POSITIVE;
                } else if (i == 3) {
                    paymentAccountBadgeType2 = PaymentAccountBadgeType.ALERT;
                } else if (i == 4) {
                    paymentAccountBadgeType2 = PaymentAccountBadgeType.CRITICAL;
                } else {
                    throw new IllegalStateException("Unknown badge type: " + mVPaymentAccountBadgeType);
                }
                paymentAccountBadgeType = paymentAccountBadgeType2;
            } else {
                paymentAccountBadgeType = null;
            }
            MVPaymentAccountSettings mVPaymentAccountSettings = mVPaymentAccount.settings;
            if (mVPaymentAccountSettings.mo30174f()) {
                bool = Boolean.valueOf(mVPaymentAccountSettings.marketingConsent);
            } else {
                bool = null;
            }
            PaymentAccountSettings paymentAccountSettings = new PaymentAccountSettings(bool);
            if (mVPaymentAccount.mo30089g()) {
                list6 = C13720d.m34273c(mVPaymentAccount.accountProducts, (C13722f) null, new C2342l(19));
            } else {
                list6 = Collections.emptyList();
            }
            paymentAccount = new PaymentAccount(str5, list7, personalDetails, list3, list9, list10, paymentAccountBadgeType, paymentAccountSettings, list6);
        }
        this.f44688m = paymentAccount;
    }
}
