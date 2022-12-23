package com.moovit.ticketing.purchase.extrainfo.split;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.payment.clearance.model.CreditCardFields;
import com.moovit.payment.gateway.paymentmethod.PurchaseVerificationType;
import java.io.IOException;
import p810sz.C19584i;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class PurchaseSplitInstructions implements Parcelable {
    public static final Parcelable.Creator<PurchaseSplitInstructions> CREATOR = new C7658a();

    /* renamed from: d */
    public static C7659b f23287d = new C7659b(PurchaseSplitInstructions.class);

    /* renamed from: b */
    public final PurchaseVerificationType f23288b;

    /* renamed from: c */
    public final CreditCardFields f23289c;

    /* renamed from: com.moovit.ticketing.purchase.extrainfo.split.PurchaseSplitInstructions$a */
    public class C7658a implements Parcelable.Creator<PurchaseSplitInstructions> {
        public final Object createFromParcel(Parcel parcel) {
            return (PurchaseSplitInstructions) C19612n.m46981v(parcel, PurchaseSplitInstructions.f23287d);
        }

        public final Object[] newArray(int i) {
            return new PurchaseSplitInstructions[i];
        }
    }

    /* renamed from: com.moovit.ticketing.purchase.extrainfo.split.PurchaseSplitInstructions$b */
    public class C7659b extends C19619s<PurchaseSplitInstructions> {
        public C7659b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            C19584i<PurchaseVerificationType> iVar = PurchaseVerificationType.CODER;
            pVar.getClass();
            return new PurchaseSplitInstructions(iVar.read(pVar), (CreditCardFields) pVar.mo51962q(CreditCardFields.f42607f));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            PurchaseSplitInstructions purchaseSplitInstructions = (PurchaseSplitInstructions) obj;
            PurchaseVerificationType purchaseVerificationType = purchaseSplitInstructions.f23288b;
            C19584i<PurchaseVerificationType> iVar = PurchaseVerificationType.CODER;
            qVar.getClass();
            iVar.write(purchaseVerificationType, qVar);
            qVar.mo51967q(purchaseSplitInstructions.f23289c, CreditCardFields.f42607f);
        }
    }

    public PurchaseSplitInstructions(PurchaseVerificationType purchaseVerificationType, CreditCardFields creditCardFields) {
        C21100e.m49373x(purchaseVerificationType, "verificationType");
        this.f23288b = purchaseVerificationType;
        this.f23289c = creditCardFields;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23287d);
    }
}
