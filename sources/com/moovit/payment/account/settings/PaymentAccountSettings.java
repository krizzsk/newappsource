package com.moovit.payment.account.settings;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p977zz.C20975x0;

public class PaymentAccountSettings implements Parcelable {
    public static final Parcelable.Creator<PaymentAccountSettings> CREATOR = new C25707a();

    /* renamed from: c */
    public static final C25708b f64112c = new C25708b(PaymentAccountSettings.class);

    /* renamed from: b */
    public final Boolean f64113b;

    /* renamed from: com.moovit.payment.account.settings.PaymentAccountSettings$a */
    public class C25707a implements Parcelable.Creator<PaymentAccountSettings> {
        public final Object createFromParcel(Parcel parcel) {
            return (PaymentAccountSettings) C19612n.m46981v(parcel, PaymentAccountSettings.f64112c);
        }

        public final Object[] newArray(int i) {
            return new PaymentAccountSettings[i];
        }
    }

    /* renamed from: com.moovit.payment.account.settings.PaymentAccountSettings$b */
    public class C25708b extends C19619s<PaymentAccountSettings> {
        public C25708b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            Boolean bool;
            if (!pVar.mo51919b()) {
                bool = null;
            } else {
                bool = Boolean.valueOf(pVar.mo51919b());
            }
            return new PaymentAccountSettings(bool);
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            Boolean bool = ((PaymentAccountSettings) obj).f64113b;
            if (bool == null) {
                qVar.mo51934b(false);
                return;
            }
            qVar.mo51934b(true);
            qVar.mo51934b(bool.booleanValue());
        }
    }

    public PaymentAccountSettings(Boolean bool) {
        this.f64113b = bool;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentAccountSettings)) {
            return false;
        }
        return C20975x0.m49118e(this.f64113b, ((PaymentAccountSettings) obj).f64113b);
    }

    public final int hashCode() {
        return C17884p.m44335F(this.f64113b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f64112c);
    }
}
