package com.moovit.payment.registration.steps.profile;

import android.os.Parcel;
import android.os.Parcelable;
import c00.C13717b;
import ce0.C21100e;
import com.moovit.network.model.ServerId;
import com.moovit.payment.registration.steps.profile.certificate.ProfileCertificationPhotoSpec;
import com.moovit.payment.registration.steps.profile.certificate.ProfileCertificationSpec;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import w40.C25765g;

public class PaymentProfile implements Parcelable {
    public static final Parcelable.Creator<PaymentProfile> CREATOR = new C16389a();

    /* renamed from: i */
    public static final C16390b f42827i = new C16390b(PaymentProfile.class);

    /* renamed from: b */
    public final ServerId f42828b;

    /* renamed from: c */
    public final String f42829c;

    /* renamed from: d */
    public final String f42830d;

    /* renamed from: e */
    public final String f42831e;

    /* renamed from: f */
    public final boolean f42832f;

    /* renamed from: g */
    public final List<ProfileCertificationSpec> f42833g;

    /* renamed from: h */
    public final String f42834h;

    /* renamed from: com.moovit.payment.registration.steps.profile.PaymentProfile$a */
    public class C16389a implements Parcelable.Creator<PaymentProfile> {
        public final Object createFromParcel(Parcel parcel) {
            return (PaymentProfile) C19612n.m46981v(parcel, PaymentProfile.f42827i);
        }

        public final Object[] newArray(int i) {
            return new PaymentProfile[i];
        }
    }

    /* renamed from: com.moovit.payment.registration.steps.profile.PaymentProfile$b */
    public class C16390b extends C19619s<PaymentProfile> {
        public C16390b(Class cls) {
            super(3, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i >= 0 && i <= 3;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            ArrayList arrayList;
            String str;
            boolean z;
            pVar.getClass();
            ServerId serverId = new ServerId(pVar.mo51924l());
            String p = pVar.mo51947p();
            String p2 = pVar.mo51947p();
            String p3 = pVar.mo51947p();
            if (i >= 2) {
                arrayList = pVar.mo51959g(C25765g.f64279a);
            } else {
                arrayList = pVar.mo51959g(ProfileCertificationPhotoSpec.f42849g);
            }
            ArrayList arrayList2 = arrayList;
            Boolean bool = null;
            if (i >= 1) {
                str = pVar.mo51948t();
            } else {
                str = null;
            }
            if (i >= 3) {
                if (!(!pVar.mo51919b())) {
                    bool = Boolean.valueOf(pVar.mo51919b());
                }
                z = bool.booleanValue();
            } else {
                z = C13717b.m34258e(arrayList2);
            }
            return new PaymentProfile(serverId, p, p2, p3, z, arrayList2, str);
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            PaymentProfile paymentProfile = (PaymentProfile) obj;
            ServerId serverId = paymentProfile.f42828b;
            qVar.getClass();
            qVar.mo51939l(serverId.f15142b);
            qVar.mo51954p(paymentProfile.f42829c);
            qVar.mo51954p(paymentProfile.f42830d);
            qVar.mo51954p(paymentProfile.f42831e);
            qVar.mo51965h(paymentProfile.f42833g, C25765g.f64279a);
            qVar.mo51955t(paymentProfile.f42834h);
            Boolean valueOf = Boolean.valueOf(paymentProfile.f42832f);
            if (valueOf == null) {
                qVar.mo51934b(false);
                return;
            }
            qVar.mo51934b(true);
            qVar.mo51934b(valueOf.booleanValue());
        }
    }

    public PaymentProfile(ServerId serverId, String str, String str2, String str3, boolean z, List<ProfileCertificationSpec> list, String str4) {
        this.f42828b = serverId;
        C21100e.m49373x(str, "mainProfileName");
        this.f42829c = str;
        C21100e.m49373x(str2, "profileName");
        this.f42830d = str2;
        C21100e.m49373x(str3, "profileDescription");
        this.f42831e = str3;
        this.f42832f = z;
        C21100e.m49373x(list, "requiredCertificatesSpecs");
        this.f42833g = Collections.unmodifiableList(list);
        this.f42834h = str4;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PaymentProfile)) {
            return false;
        }
        return this.f42828b.equals(((PaymentProfile) obj).f42828b);
    }

    public final int hashCode() {
        return C17884p.m44335F(this.f42828b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f42827i);
    }
}
