package com.moovit.payment.registration.steps.mot.payment;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.view.p340cc.CreditCardPreview;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class MotPangoInstructions implements Parcelable {
    public static final Parcelable.Creator<MotPangoInstructions> CREATOR = new C16383a();

    /* renamed from: c */
    public static C16384b f42818c = new C16384b(MotPangoInstructions.class);

    /* renamed from: b */
    public final CreditCardPreview f42819b;

    /* renamed from: com.moovit.payment.registration.steps.mot.payment.MotPangoInstructions$a */
    public class C16383a implements Parcelable.Creator<MotPangoInstructions> {
        public final Object createFromParcel(Parcel parcel) {
            return (MotPangoInstructions) C19612n.m46981v(parcel, MotPangoInstructions.f42818c);
        }

        public final Object[] newArray(int i) {
            return new MotPangoInstructions[i];
        }
    }

    /* renamed from: com.moovit.payment.registration.steps.mot.payment.MotPangoInstructions$b */
    public class C16384b extends C19619s<MotPangoInstructions> {
        public C16384b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            CreditCardPreview.C7956b bVar = CreditCardPreview.f24081f;
            pVar.getClass();
            return new MotPangoInstructions((CreditCardPreview) bVar.read(pVar));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            CreditCardPreview creditCardPreview = ((MotPangoInstructions) obj).f42819b;
            CreditCardPreview.C7956b bVar = CreditCardPreview.f24081f;
            qVar.getClass();
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(creditCardPreview, qVar);
        }
    }

    public MotPangoInstructions(CreditCardPreview creditCardPreview) {
        C21100e.m49373x(creditCardPreview, "creditCardPreview");
        this.f42819b = creditCardPreview;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f42818c);
    }
}
