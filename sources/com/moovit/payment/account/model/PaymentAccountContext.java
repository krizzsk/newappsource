package com.moovit.payment.account.model;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.appsflyer.ServerParameters;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class PaymentAccountContext implements Parcelable {
    public static final Parcelable.Creator<PaymentAccountContext> CREATOR = new C25677a();

    /* renamed from: d */
    public static final C25678b f64029d = new C25678b(PaymentAccountContext.class);

    /* renamed from: b */
    public final String f64030b;

    /* renamed from: c */
    public final PaymentAccountContextStatus f64031c;

    /* renamed from: com.moovit.payment.account.model.PaymentAccountContext$a */
    public class C25677a implements Parcelable.Creator<PaymentAccountContext> {
        public final Object createFromParcel(Parcel parcel) {
            return (PaymentAccountContext) C19612n.m46981v(parcel, PaymentAccountContext.f64029d);
        }

        public final Object[] newArray(int i) {
            return new PaymentAccountContext[i];
        }
    }

    /* renamed from: com.moovit.payment.account.model.PaymentAccountContext$b */
    public class C25678b extends C19619s<PaymentAccountContext> {
        public C25678b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new PaymentAccountContext(pVar.mo51948t(), (PaymentAccountContextStatus) PaymentAccountContextStatus.CODER.read(pVar));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            PaymentAccountContext paymentAccountContext = (PaymentAccountContext) obj;
            qVar.mo51955t(paymentAccountContext.f64030b);
            PaymentAccountContextStatus.CODER.write(paymentAccountContext.f64031c, qVar);
        }
    }

    public PaymentAccountContext(String str, PaymentAccountContextStatus paymentAccountContextStatus) {
        this.f64030b = str;
        C21100e.m49373x(paymentAccountContextStatus, ServerParameters.STATUS);
        this.f64031c = paymentAccountContextStatus;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f64029d);
    }
}
