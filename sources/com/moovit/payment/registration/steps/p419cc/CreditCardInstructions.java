package com.moovit.payment.registration.steps.p419cc;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.payment.clearance.model.ClearanceProviderInstructions;
import com.moovit.payment.clearance.model.CreditCardFields;
import java.io.IOException;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p977zz.C20975x0;

/* renamed from: com.moovit.payment.registration.steps.cc.CreditCardInstructions */
public class CreditCardInstructions implements Parcelable {
    public static final Parcelable.Creator<CreditCardInstructions> CREATOR = new C16363a();

    /* renamed from: e */
    public static C16364b f42772e = new C16364b(CreditCardInstructions.class);

    /* renamed from: b */
    public final String f42773b;

    /* renamed from: c */
    public final ClearanceProviderInstructions f42774c;

    /* renamed from: d */
    public final CreditCardFields f42775d;

    /* renamed from: com.moovit.payment.registration.steps.cc.CreditCardInstructions$a */
    public class C16363a implements Parcelable.Creator<CreditCardInstructions> {
        public final Object createFromParcel(Parcel parcel) {
            return (CreditCardInstructions) C19612n.m46981v(parcel, CreditCardInstructions.f42772e);
        }

        public final Object[] newArray(int i) {
            return new CreditCardInstructions[i];
        }
    }

    /* renamed from: com.moovit.payment.registration.steps.cc.CreditCardInstructions$b */
    public class C16364b extends C19619s<CreditCardInstructions> {
        public C16364b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new CreditCardInstructions(pVar.mo51948t(), (ClearanceProviderInstructions) ClearanceProviderInstructions.f42603e.read(pVar), (CreditCardFields) pVar.mo51962q(CreditCardFields.f42607f));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            CreditCardInstructions creditCardInstructions = (CreditCardInstructions) obj;
            qVar.mo51955t(creditCardInstructions.f42773b);
            ClearanceProviderInstructions clearanceProviderInstructions = creditCardInstructions.f42774c;
            ClearanceProviderInstructions.C16305b bVar = ClearanceProviderInstructions.f42603e;
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(clearanceProviderInstructions, qVar);
            qVar.mo51967q(creditCardInstructions.f42775d, CreditCardFields.f42607f);
        }
    }

    public CreditCardInstructions(String str, ClearanceProviderInstructions clearanceProviderInstructions, CreditCardFields creditCardFields) {
        this.f42773b = str;
        C21100e.m49373x(clearanceProviderInstructions, "clearanceProviderInstructions");
        this.f42774c = clearanceProviderInstructions;
        this.f42775d = creditCardFields;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreditCardInstructions)) {
            return false;
        }
        CreditCardInstructions creditCardInstructions = (CreditCardInstructions) obj;
        if (!C20975x0.m49118e(this.f42773b, creditCardInstructions.f42773b) || !this.f42774c.equals(creditCardInstructions.f42774c) || !C20975x0.m49118e(this.f42775d, creditCardInstructions.f42775d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f42773b), C17884p.m44335F(this.f42774c), C17884p.m44335F(this.f42775d));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f42772e);
    }
}
