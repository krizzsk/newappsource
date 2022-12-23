package com.moovit.payment.registration.steps.profile.certificate;

import android.os.Parcelable;
import ce0.C21100e;

public abstract class ProfileCertificateData implements Parcelable {

    /* renamed from: b */
    public final String f42844b;

    /* renamed from: com.moovit.payment.registration.steps.profile.certificate.ProfileCertificateData$a */
    public interface C16395a<R> {
        /* renamed from: m0 */
        R mo49105m0(ProfileCertificateTextData profileCertificateTextData);

        /* renamed from: o */
        R mo49106o(ProfileCertificatePhotoData profileCertificatePhotoData);
    }

    public ProfileCertificateData(String str) {
        C21100e.m49373x(str, "id");
        this.f42844b = str;
    }

    /* renamed from: b */
    public abstract <R> R mo49104b(C16395a<R> aVar);
}
