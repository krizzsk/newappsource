package com.moovit.payment.registration.steps.mot.payment;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.payment.registration.steps.p419cc.CreditCardInstructions;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class MotPaymentMethodInstructions implements Parcelable {
    public static final Parcelable.Creator<MotPaymentMethodInstructions> CREATOR = new C16385a();

    /* renamed from: d */
    public static C16386b f42820d = new C16386b(MotPaymentMethodInstructions.class);

    /* renamed from: b */
    public final CreditCardInstructions f42821b;

    /* renamed from: c */
    public final MotPangoInstructions f42822c;

    /* renamed from: com.moovit.payment.registration.steps.mot.payment.MotPaymentMethodInstructions$a */
    public class C16385a implements Parcelable.Creator<MotPaymentMethodInstructions> {
        public final Object createFromParcel(Parcel parcel) {
            return (MotPaymentMethodInstructions) C19612n.m46981v(parcel, MotPaymentMethodInstructions.f42820d);
        }

        public final Object[] newArray(int i) {
            return new MotPaymentMethodInstructions[i];
        }
    }

    /* renamed from: com.moovit.payment.registration.steps.mot.payment.MotPaymentMethodInstructions$b */
    public class C16386b extends C19619s<MotPaymentMethodInstructions> {
        public C16386b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            CreditCardInstructions.C16364b bVar = CreditCardInstructions.f42772e;
            pVar.getClass();
            return new MotPaymentMethodInstructions((CreditCardInstructions) bVar.read(pVar), (MotPangoInstructions) pVar.mo51962q(MotPangoInstructions.f42818c));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            MotPaymentMethodInstructions motPaymentMethodInstructions = (MotPaymentMethodInstructions) obj;
            CreditCardInstructions creditCardInstructions = motPaymentMethodInstructions.f42821b;
            CreditCardInstructions.C16364b bVar = CreditCardInstructions.f42772e;
            qVar.getClass();
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(creditCardInstructions, qVar);
            qVar.mo51967q(motPaymentMethodInstructions.f42822c, MotPangoInstructions.f42818c);
        }
    }

    public MotPaymentMethodInstructions(CreditCardInstructions creditCardInstructions, MotPangoInstructions motPangoInstructions) {
        C21100e.m49373x(creditCardInstructions, "creditCardInstructions");
        this.f42821b = creditCardInstructions;
        this.f42822c = motPangoInstructions;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f42820d);
    }
}
