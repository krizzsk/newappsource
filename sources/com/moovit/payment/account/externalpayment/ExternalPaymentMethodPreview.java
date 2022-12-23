package com.moovit.payment.account.externalpayment;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19617r;
import p810sz.C19619s;

public class ExternalPaymentMethodPreview implements Parcelable {
    public static final Parcelable.Creator<ExternalPaymentMethodPreview> CREATOR = new C25670a();

    /* renamed from: e */
    public static final C25671b f64008e = new C25671b(ExternalPaymentMethodPreview.class);

    /* renamed from: b */
    public final Image f64009b;

    /* renamed from: c */
    public final String f64010c;

    /* renamed from: d */
    public final String f64011d;

    /* renamed from: com.moovit.payment.account.externalpayment.ExternalPaymentMethodPreview$a */
    public class C25670a implements Parcelable.Creator<ExternalPaymentMethodPreview> {
        public final Object createFromParcel(Parcel parcel) {
            return (ExternalPaymentMethodPreview) C19612n.m46981v(parcel, ExternalPaymentMethodPreview.f64008e);
        }

        public final Object[] newArray(int i) {
            return new ExternalPaymentMethodPreview[i];
        }
    }

    /* renamed from: com.moovit.payment.account.externalpayment.ExternalPaymentMethodPreview$b */
    public class C25671b extends C19619s<ExternalPaymentMethodPreview> {
        public C25671b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            C19617r rVar = C16019d.m40803a().f41718d;
            pVar.getClass();
            return new ExternalPaymentMethodPreview((Image) rVar.read(pVar), pVar.mo51948t(), pVar.mo51948t());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            ExternalPaymentMethodPreview externalPaymentMethodPreview = (ExternalPaymentMethodPreview) obj;
            Image image = externalPaymentMethodPreview.f64009b;
            C19617r rVar = C16019d.m40803a().f41718d;
            qVar.getClass();
            rVar.write(image, qVar);
            qVar.mo51955t(externalPaymentMethodPreview.f64010c);
            qVar.mo51955t(externalPaymentMethodPreview.f64011d);
        }
    }

    public ExternalPaymentMethodPreview(Image image, String str, String str2) {
        this.f64009b = image;
        this.f64010c = str;
        this.f64011d = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f64008e);
    }
}
