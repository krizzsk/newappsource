package com.moovit.payment.registration.steps.profile.certificate;

import android.os.Parcelable;
import ce0.C21100e;
import com.appsflyer.ServerParameters;
import t60.C19632b;

public abstract class ProfileCertificationSpec implements Parcelable {

    /* renamed from: b */
    public final String f42853b;

    /* renamed from: c */
    public final PaymentCertificateStatus f42854c;

    public ProfileCertificationSpec(String str, PaymentCertificateStatus paymentCertificateStatus) {
        C21100e.m49373x(str, "id");
        this.f42853b = str;
        C21100e.m49373x(paymentCertificateStatus, ServerParameters.STATUS);
        this.f42854c = paymentCertificateStatus;
    }

    /* renamed from: b */
    public abstract Object mo49115b(C19632b bVar);
}
