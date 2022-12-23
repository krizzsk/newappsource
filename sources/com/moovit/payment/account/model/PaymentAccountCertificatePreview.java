package com.moovit.payment.account.model;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
import com.moovit.payment.registration.steps.profile.certificate.PaymentCertificateStatus;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class PaymentAccountCertificatePreview implements Parcelable {
    public static final Parcelable.Creator<PaymentAccountCertificatePreview> CREATOR = new C25675a();

    /* renamed from: h */
    public static final C25676b f64022h = new C25676b(PaymentAccountCertificatePreview.class);

    /* renamed from: b */
    public final String f64023b;

    /* renamed from: c */
    public final Image f64024c;

    /* renamed from: d */
    public final String f64025d;

    /* renamed from: e */
    public final String f64026e;

    /* renamed from: f */
    public final String f64027f;

    /* renamed from: g */
    public final PaymentCertificateStatus f64028g;

    /* renamed from: com.moovit.payment.account.model.PaymentAccountCertificatePreview$a */
    public class C25675a implements Parcelable.Creator<PaymentAccountCertificatePreview> {
        public final Object createFromParcel(Parcel parcel) {
            return (PaymentAccountCertificatePreview) C19612n.m46981v(parcel, PaymentAccountCertificatePreview.f64022h);
        }

        public final Object[] newArray(int i) {
            return new PaymentAccountCertificatePreview[i];
        }
    }

    /* renamed from: com.moovit.payment.account.model.PaymentAccountCertificatePreview$b */
    public class C25676b extends C19619s<PaymentAccountCertificatePreview> {
        public C25676b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new PaymentAccountCertificatePreview(pVar.mo51948t(), (Image) pVar.mo51962q(C16019d.m40803a().f41718d), pVar.mo51948t(), pVar.mo51948t(), pVar.mo51948t(), (PaymentCertificateStatus) C13555b.m33968g(PaymentCertificateStatus.CODER, pVar));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            PaymentAccountCertificatePreview paymentAccountCertificatePreview = (PaymentAccountCertificatePreview) obj;
            qVar.mo51955t(paymentAccountCertificatePreview.f64023b);
            qVar.mo51967q(paymentAccountCertificatePreview.f64024c, C16019d.m40803a().f41718d);
            qVar.mo51955t(paymentAccountCertificatePreview.f64025d);
            qVar.mo51955t(paymentAccountCertificatePreview.f64026e);
            qVar.mo51955t(paymentAccountCertificatePreview.f64027f);
            PaymentCertificateStatus.CODER.write(paymentAccountCertificatePreview.f64028g, qVar);
        }
    }

    public PaymentAccountCertificatePreview(String str, Image image, String str2, String str3, String str4, PaymentCertificateStatus paymentCertificateStatus) {
        this.f64023b = str;
        this.f64024c = image;
        this.f64025d = str2;
        this.f64026e = str3;
        this.f64027f = str4;
        C21100e.m49373x(paymentCertificateStatus, "certificateStatus");
        this.f64028g = paymentCertificateStatus;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f64022h);
    }
}
