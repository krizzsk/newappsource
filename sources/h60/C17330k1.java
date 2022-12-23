package h60;

import c00.C13720d;
import c00.C13722f;
import c70.C13749c;
import c70.C13752e;
import c70.C13778r;
import com.moovit.payment.registration.steps.profile.PaymentProfile;
import com.moovit.payment.registration.steps.profile.certificate.ProfileCertificateData;
import com.moovit.payment.registration.steps.profile.certificate.ProfileCertificatePhotoData;
import com.moovit.payment.registration.steps.profile.certificate.ProfileCertificateTextData;
import com.tranzmate.moovit.protocol.payments.MVInputFieldValue;
import com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationSetProfileRequest;
import com.tranzmate.moovit.protocol.payments.MVProfileCertificateInfo;
import com.tranzmate.moovit.protocol.payments.MVProfileRequiredInfoValue;
import java.util.ArrayList;
import java.util.List;
import p066e0.C4454r0;
import v40.C25754i;

/* renamed from: h60.k1 */
public final class C17330k1 extends C13778r<C17330k1, C17333l1, MVPaymentRegistrationSetProfileRequest> implements ProfileCertificateData.C16395a<MVProfileRequiredInfoValue> {

    /* renamed from: x */
    public static final /* synthetic */ int f44719x = 0;

    /* renamed from: w */
    public final List<ProfileCertificateData> f44720w;

    public C17330k1(C13752e eVar, List<PaymentProfile> list, List<ProfileCertificateData> list2) {
        super(eVar, C25754i.server_path_app_server_secured_url, C25754i.api_path_payment_update_profiles, C17333l1.class);
        this.f44720w = list2;
        ArrayList<O> c = C13720d.m34273c(list, (C13722f) null, new C4454r0(20));
        ArrayList<O> c2 = C13720d.m34273c(list2, (C13722f) null, new C17327j1(this, 0));
        RO mVPaymentRegistrationSetProfileRequest = new MVPaymentRegistrationSetProfileRequest();
        mVPaymentRegistrationSetProfileRequest.profiles = c;
        mVPaymentRegistrationSetProfileRequest.requiredInfosValues = c2;
        this.f33922v = mVPaymentRegistrationSetProfileRequest;
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
