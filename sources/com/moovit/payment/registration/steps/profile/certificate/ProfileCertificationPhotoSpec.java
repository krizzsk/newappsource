package com.moovit.payment.registration.steps.profile.certificate;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import t60.C19632b;
import t60.C19633c;

public class ProfileCertificationPhotoSpec extends ProfileCertificationSpec {
    public static final Parcelable.Creator<ProfileCertificationPhotoSpec> CREATOR = new C16400a();

    /* renamed from: g */
    public static final C16401b f42849g = new C16401b(ProfileCertificationPhotoSpec.class);

    /* renamed from: d */
    public final String f42850d;

    /* renamed from: e */
    public final String f42851e;

    /* renamed from: f */
    public final Image f42852f;

    /* renamed from: com.moovit.payment.registration.steps.profile.certificate.ProfileCertificationPhotoSpec$a */
    public class C16400a implements Parcelable.Creator<ProfileCertificationPhotoSpec> {
        public final Object createFromParcel(Parcel parcel) {
            return (ProfileCertificationPhotoSpec) C19612n.m46981v(parcel, ProfileCertificationPhotoSpec.f42849g);
        }

        public final Object[] newArray(int i) {
            return new ProfileCertificationPhotoSpec[i];
        }
    }

    /* renamed from: com.moovit.payment.registration.steps.profile.certificate.ProfileCertificationPhotoSpec$b */
    public class C16401b extends C19619s<ProfileCertificationPhotoSpec> {
        public C16401b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new ProfileCertificationPhotoSpec(pVar.mo51947p(), (PaymentCertificateStatus) C13555b.m33968g(PaymentCertificateStatus.CODER, pVar), pVar.mo51947p(), pVar.mo51948t(), (Image) C16019d.m40803a().f41718d.read(pVar));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            ProfileCertificationPhotoSpec profileCertificationPhotoSpec = (ProfileCertificationPhotoSpec) obj;
            qVar.mo51954p(profileCertificationPhotoSpec.f42853b);
            qVar.mo51954p(profileCertificationPhotoSpec.f42850d);
            qVar.mo51955t(profileCertificationPhotoSpec.f42851e);
            C16019d.m40803a().f41718d.write(profileCertificationPhotoSpec.f42852f, qVar);
            PaymentCertificateStatus.CODER.write(profileCertificationPhotoSpec.f42854c, qVar);
        }
    }

    public ProfileCertificationPhotoSpec(String str, PaymentCertificateStatus paymentCertificateStatus, String str2, String str3, Image image) {
        super(str, paymentCertificateStatus);
        C21100e.m49373x(str2, "title");
        this.f42850d = str2;
        this.f42851e = str3;
        C21100e.m49373x(image, "icon");
        this.f42852f = image;
    }

    /* renamed from: b */
    public final Object mo49115b(C19632b bVar) {
        bVar.getClass();
        int i = C19633c.f49816t;
        Bundle bundle = new Bundle();
        bundle.putParcelable("certification", this);
        C19633c cVar = new C19633c();
        cVar.setArguments(bundle);
        return cVar;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f42849g);
    }
}
