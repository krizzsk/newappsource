package h60;

import c70.C13749c;
import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.moovit.payment.registration.steps.profile.certificate.ProfileCertificateData;
import com.moovit.payment.registration.steps.profile.certificate.ProfileCertificatePhotoData;
import com.moovit.payment.registration.steps.profile.certificate.ProfileCertificateTextData;
import com.tranzmate.moovit.protocol.payments.MVInputFieldValue;
import com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationSetProfileRequiredInfoRequest;
import com.tranzmate.moovit.protocol.payments.MVProfileCertificateInfo;
import com.tranzmate.moovit.protocol.payments.MVProfileRequiredInfoValue;
import v40.C25754i;

/* renamed from: h60.c0 */
public final class C17305c0 extends C13778r<C17305c0, C17308d0, MVPaymentRegistrationSetProfileRequiredInfoRequest> implements ProfileCertificateData.C16395a<MVProfileRequiredInfoValue> {

    /* renamed from: w */
    public final ProfileCertificateData f44690w;

    public C17305c0(C13752e eVar, ProfileCertificateData profileCertificateData) {
        super(eVar, C25754i.server_path_app_server_secured_url, C25754i.api_path_payment_account_set_certificate_request, C17308d0.class);
        C21100e.m49373x(profileCertificateData, "certificateData");
        this.f44690w = profileCertificateData;
        RO mVPaymentRegistrationSetProfileRequiredInfoRequest = new MVPaymentRegistrationSetProfileRequiredInfoRequest();
        mVPaymentRegistrationSetProfileRequiredInfoRequest.value = (MVProfileRequiredInfoValue) profileCertificateData.mo49104b(this);
        this.f33922v = mVPaymentRegistrationSetProfileRequiredInfoRequest;
    }

    /* renamed from: m0 */
    public final Object mo49105m0(ProfileCertificateTextData profileCertificateTextData) {
        MVInputFieldValue q = C13749c.m34331q(profileCertificateTextData.f42848c);
        MVProfileRequiredInfoValue mVProfileRequiredInfoValue = new MVProfileRequiredInfoValue();
        mVProfileRequiredInfoValue.setField_ = MVProfileRequiredInfoValue._Fields.INPUT_FIELD_VALUE;
        mVProfileRequiredInfoValue.value_ = q;
        return mVProfileRequiredInfoValue;
    }

    /* renamed from: o */
    public final Object mo49106o(ProfileCertificatePhotoData profileCertificatePhotoData) {
        MVProfileCertificateInfo mVProfileCertificateInfo = new MVProfileCertificateInfo(profileCertificatePhotoData.f42844b);
        MVProfileRequiredInfoValue mVProfileRequiredInfoValue = new MVProfileRequiredInfoValue();
        mVProfileRequiredInfoValue.setField_ = MVProfileRequiredInfoValue._Fields.CERTIFICATE_INFO;
        mVProfileRequiredInfoValue.value_ = mVProfileCertificateInfo;
        return mVProfileRequiredInfoValue;
    }
}
