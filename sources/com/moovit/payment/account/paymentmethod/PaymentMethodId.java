package com.moovit.payment.account.paymentmethod;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.payment.clearance.ClearanceProviderType;
import java.io.IOException;
import p583jk.C17884p;
import p810sz.C19577c;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class PaymentMethodId implements Parcelable {
    public static final Parcelable.Creator<PaymentMethodId> CREATOR = new C25689a();

    /* renamed from: d */
    public static final C25690b f64055d = new C25690b(PaymentMethodId.class);

    /* renamed from: b */
    public final ClearanceProviderType f64056b;

    /* renamed from: c */
    public final String f64057c;

    /* renamed from: com.moovit.payment.account.paymentmethod.PaymentMethodId$a */
    public class C25689a implements Parcelable.Creator<PaymentMethodId> {
        public final Object createFromParcel(Parcel parcel) {
            return (PaymentMethodId) C19612n.m46981v(parcel, PaymentMethodId.f64055d);
        }

        public final Object[] newArray(int i) {
            return new PaymentMethodId[i];
        }
    }

    /* renamed from: com.moovit.payment.account.paymentmethod.PaymentMethodId$b */
    public class C25690b extends C19619s<PaymentMethodId> {
        public C25690b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            C19577c<ClearanceProviderType> cVar = ClearanceProviderType.CODER;
            pVar.getClass();
            return new PaymentMethodId((ClearanceProviderType) cVar.read(pVar), pVar.mo51947p());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            PaymentMethodId paymentMethodId = (PaymentMethodId) obj;
            ClearanceProviderType clearanceProviderType = paymentMethodId.f64056b;
            C19577c<ClearanceProviderType> cVar = ClearanceProviderType.CODER;
            qVar.getClass();
            cVar.write(clearanceProviderType, qVar);
            qVar.mo51954p(paymentMethodId.f64057c);
        }
    }

    public PaymentMethodId(ClearanceProviderType clearanceProviderType, String str) {
        C21100e.m49373x(clearanceProviderType, "type");
        this.f64056b = clearanceProviderType;
        C21100e.m49373x(str, "id");
        this.f64057c = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentMethodId)) {
            return false;
        }
        PaymentMethodId paymentMethodId = (PaymentMethodId) obj;
        if (!this.f64056b.equals(paymentMethodId.f64056b) || !this.f64057c.equals(paymentMethodId.f64057c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f64056b), C17884p.m44335F(this.f64057c));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f64055d);
    }
}
