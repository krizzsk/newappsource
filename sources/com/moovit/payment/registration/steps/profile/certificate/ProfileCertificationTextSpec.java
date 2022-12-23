package com.moovit.payment.registration.steps.profile.certificate;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
import com.moovit.inputfields.InputField;
import java.io.IOException;
import p810sz.C19577c;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import t60.C19632b;
import t60.C19636e;

public class ProfileCertificationTextSpec extends ProfileCertificationSpec {
    public static final Parcelable.Creator<ProfileCertificationTextSpec> CREATOR = new C16402a();

    /* renamed from: i */
    public static final C16403b f42855i = new C16403b(ProfileCertificationTextSpec.class);

    /* renamed from: d */
    public final String f42856d;

    /* renamed from: e */
    public final String f42857e;

    /* renamed from: f */
    public final Image f42858f;

    /* renamed from: g */
    public final InputField f42859g;

    /* renamed from: h */
    public final String f42860h;

    /* renamed from: com.moovit.payment.registration.steps.profile.certificate.ProfileCertificationTextSpec$a */
    public class C16402a implements Parcelable.Creator<ProfileCertificationTextSpec> {
        public final Object createFromParcel(Parcel parcel) {
            return (ProfileCertificationTextSpec) C19612n.m46981v(parcel, ProfileCertificationTextSpec.f42855i);
        }

        public final Object[] newArray(int i) {
            return new ProfileCertificationTextSpec[i];
        }
    }

    /* renamed from: com.moovit.payment.registration.steps.profile.certificate.ProfileCertificationTextSpec$b */
    public class C16403b extends C19619s<ProfileCertificationTextSpec> {
        public C16403b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            C19577c<PaymentCertificateStatus> cVar = PaymentCertificateStatus.CODER;
            pVar.getClass();
            cVar.getClass();
            return new ProfileCertificationTextSpec(cVar.mo51916a(pVar.mo51926r()), pVar.mo51947p(), pVar.mo51948t(), (Image) C16019d.m40803a().f41718d.read(pVar), (InputField) InputField.f41828i.read(pVar), pVar.mo51948t());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            ProfileCertificationTextSpec profileCertificationTextSpec = (ProfileCertificationTextSpec) obj;
            PaymentCertificateStatus paymentCertificateStatus = profileCertificationTextSpec.f42854c;
            C19577c<PaymentCertificateStatus> cVar = PaymentCertificateStatus.CODER;
            qVar.getClass();
            cVar.write(paymentCertificateStatus, qVar);
            qVar.mo51954p(profileCertificationTextSpec.f42856d);
            qVar.mo51955t(profileCertificationTextSpec.f42857e);
            C16019d.m40803a().f41718d.write(profileCertificationTextSpec.f42858f, qVar);
            InputField inputField = profileCertificationTextSpec.f42859g;
            InputField.C16065b bVar = InputField.f41828i;
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(inputField, qVar);
            qVar.mo51955t(profileCertificationTextSpec.f42860h);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ProfileCertificationTextSpec(com.moovit.payment.registration.steps.profile.certificate.PaymentCertificateStatus r3, java.lang.String r4, java.lang.String r5, com.moovit.image.model.Image r6, com.moovit.inputfields.InputField r7, java.lang.String r8) {
        /*
            r2 = this;
            java.lang.String r0 = "inputField"
            ce0.C21100e.m49373x(r7, r0)
            java.lang.String r0 = r7.f41829b
            java.lang.String r1 = "status"
            ce0.C21100e.m49373x(r3, r1)
            r2.<init>(r0, r3)
            java.lang.String r3 = "title"
            ce0.C21100e.m49373x(r4, r3)
            r2.f42856d = r4
            r2.f42857e = r5
            java.lang.String r3 = "icon"
            ce0.C21100e.m49373x(r6, r3)
            r2.f42858f = r6
            r2.f42859g = r7
            r2.f42860h = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.payment.registration.steps.profile.certificate.ProfileCertificationTextSpec.<init>(com.moovit.payment.registration.steps.profile.certificate.PaymentCertificateStatus, java.lang.String, java.lang.String, com.moovit.image.model.Image, com.moovit.inputfields.InputField, java.lang.String):void");
    }

    /* renamed from: b */
    public final Object mo49115b(C19632b bVar) {
        bVar.getClass();
        int i = C19636e.f49821r;
        Bundle bundle = new Bundle();
        bundle.putParcelable("certificateTextSpec", this);
        C19636e eVar = new C19636e();
        eVar.setArguments(bundle);
        return eVar;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f42855i);
    }
}
