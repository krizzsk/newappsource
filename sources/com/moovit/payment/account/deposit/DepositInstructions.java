package com.moovit.payment.account.deposit;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.payment.account.paymentmethod.PaymentMethodId;
import com.moovit.payment.registration.steps.p419cc.CreditCardInstructions;
import com.moovit.util.CurrencyAmount;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class DepositInstructions implements Parcelable {
    public static final Parcelable.Creator<DepositInstructions> CREATOR = new C25641a();

    /* renamed from: g */
    public static final C25642b f63957g = new C25642b(DepositInstructions.class);

    /* renamed from: b */
    public final String f63958b;

    /* renamed from: c */
    public final CurrencyAmount f63959c;

    /* renamed from: d */
    public final List<PaymentMethodId> f63960d;

    /* renamed from: e */
    public final CreditCardInstructions f63961e;

    /* renamed from: f */
    public final boolean f63962f;

    /* renamed from: com.moovit.payment.account.deposit.DepositInstructions$a */
    public class C25641a implements Parcelable.Creator<DepositInstructions> {
        public final Object createFromParcel(Parcel parcel) {
            return (DepositInstructions) C19612n.m46981v(parcel, DepositInstructions.f63957g);
        }

        public final Object[] newArray(int i) {
            return new DepositInstructions[i];
        }
    }

    /* renamed from: com.moovit.payment.account.deposit.DepositInstructions$b */
    public class C25642b extends C19619s<DepositInstructions> {
        public C25642b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new DepositInstructions(pVar.mo51947p(), (CurrencyAmount) CurrencyAmount.f23843f.read(pVar), pVar.mo51959g(PaymentMethodId.f64055d), (CreditCardInstructions) CreditCardInstructions.f42772e.read(pVar), pVar.mo51919b());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            DepositInstructions depositInstructions = (DepositInstructions) obj;
            qVar.mo51954p(depositInstructions.f63958b);
            CurrencyAmount currencyAmount = depositInstructions.f63959c;
            CurrencyAmount.C7881b bVar = CurrencyAmount.f23843f;
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(currencyAmount, qVar);
            qVar.mo51965h(depositInstructions.f63960d, PaymentMethodId.f64055d);
            CreditCardInstructions creditCardInstructions = depositInstructions.f63961e;
            CreditCardInstructions.C16364b bVar2 = CreditCardInstructions.f42772e;
            qVar.mo51939l(bVar2.f49802v);
            bVar2.mo179c(creditCardInstructions, qVar);
            qVar.mo51934b(depositInstructions.f63962f);
        }
    }

    public DepositInstructions(String str, CurrencyAmount currencyAmount, ArrayList arrayList, CreditCardInstructions creditCardInstructions, boolean z) {
        C21100e.m49373x(str, "paymentContext");
        this.f63958b = str;
        C21100e.m49373x(currencyAmount, "depositAmount");
        this.f63959c = currencyAmount;
        C21100e.m49373x(arrayList, "paymentMethodIds");
        this.f63960d = arrayList;
        C21100e.m49373x(creditCardInstructions, "creditCardInstructions");
        this.f63961e = creditCardInstructions;
        this.f63962f = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DepositInstructions)) {
            return false;
        }
        DepositInstructions depositInstructions = (DepositInstructions) obj;
        if (!this.f63958b.equals(depositInstructions.f63958b) || !this.f63959c.equals(depositInstructions.f63959c) || !this.f63960d.equals(depositInstructions.f63960d) || !this.f63961e.equals(depositInstructions.f63961e) || this.f63962f != depositInstructions.f63962f) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f63958b), C17884p.m44335F(this.f63959c), C17884p.m44335F(this.f63960d), C17884p.m44335F(this.f63961e), this.f63962f);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f63957g);
    }
}
