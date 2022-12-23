package com.moovit.payment.registration.steps.profile.certificate;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.payment.registration.steps.profile.certificate.ProfileCertificateData;
import java.io.File;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p834tz.C19794a;

public class ProfileCertificatePhotoData extends ProfileCertificateData {
    public static final Parcelable.Creator<ProfileCertificatePhotoData> CREATOR = new C16396a();

    /* renamed from: d */
    public static final C16397b f42845d = new C16397b(ProfileCertificatePhotoData.class);

    /* renamed from: c */
    public final File f42846c;

    /* renamed from: com.moovit.payment.registration.steps.profile.certificate.ProfileCertificatePhotoData$a */
    public class C16396a implements Parcelable.Creator<ProfileCertificatePhotoData> {
        public final Object createFromParcel(Parcel parcel) {
            return (ProfileCertificatePhotoData) C19612n.m46981v(parcel, ProfileCertificatePhotoData.f42845d);
        }

        public final Object[] newArray(int i) {
            return new ProfileCertificatePhotoData[i];
        }
    }

    /* renamed from: com.moovit.payment.registration.steps.profile.certificate.ProfileCertificatePhotoData$b */
    public class C16397b extends C19619s<ProfileCertificatePhotoData> {
        public C16397b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new ProfileCertificatePhotoData((File) C19794a.f50327e.read(pVar), pVar.mo51947p());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            ProfileCertificatePhotoData profileCertificatePhotoData = (ProfileCertificatePhotoData) obj;
            qVar.mo51954p(profileCertificatePhotoData.f42844b);
            C19794a.f50327e.write(profileCertificatePhotoData.f42846c, qVar);
        }
    }

    public ProfileCertificatePhotoData(File file, String str) {
        super(str);
        C21100e.m49373x(file, "photo");
        this.f42846c = file;
    }

    /* renamed from: b */
    public final <R> R mo49104b(ProfileCertificateData.C16395a<R> aVar) {
        return aVar.mo49106o(this);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f42845d);
    }
}
