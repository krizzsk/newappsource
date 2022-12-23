package com.moovit.payment.registration.steps.profile.certificate;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.inputfields.InputFieldValue;
import com.moovit.payment.registration.steps.profile.certificate.ProfileCertificateData;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class ProfileCertificateTextData extends ProfileCertificateData {
    public static final Parcelable.Creator<ProfileCertificateTextData> CREATOR = new C16398a();

    /* renamed from: d */
    public static final C16399b f42847d = new C16399b(ProfileCertificateTextData.class);

    /* renamed from: c */
    public final InputFieldValue f42848c;

    /* renamed from: com.moovit.payment.registration.steps.profile.certificate.ProfileCertificateTextData$a */
    public class C16398a implements Parcelable.Creator<ProfileCertificateTextData> {
        public final Object createFromParcel(Parcel parcel) {
            return (ProfileCertificateTextData) C19612n.m46981v(parcel, ProfileCertificateTextData.f42847d);
        }

        public final Object[] newArray(int i) {
            return new ProfileCertificateTextData[i];
        }
    }

    /* renamed from: com.moovit.payment.registration.steps.profile.certificate.ProfileCertificateTextData$b */
    public class C16399b extends C19619s<ProfileCertificateTextData> {
        public C16399b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            InputFieldValue.C16067b bVar = InputFieldValue.f41836d;
            pVar.getClass();
            return new ProfileCertificateTextData((InputFieldValue) bVar.read(pVar));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            InputFieldValue inputFieldValue = ((ProfileCertificateTextData) obj).f42848c;
            InputFieldValue.C16067b bVar = InputFieldValue.f41836d;
            qVar.getClass();
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(inputFieldValue, qVar);
        }
    }

    public ProfileCertificateTextData(InputFieldValue inputFieldValue) {
        super(inputFieldValue.f41837b);
        this.f42848c = inputFieldValue;
    }

    /* renamed from: b */
    public final <R> R mo49104b(ProfileCertificateData.C16395a<R> aVar) {
        return aVar.mo49105m0(this);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f42847d);
    }
}
