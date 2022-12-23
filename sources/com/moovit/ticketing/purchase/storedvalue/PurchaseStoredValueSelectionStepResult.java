package com.moovit.ticketing.purchase.storedvalue;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.ticketing.purchase.PurchaseStepResult;
import com.moovit.util.CurrencyAmount;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class PurchaseStoredValueSelectionStepResult extends PurchaseStepResult {
    public static final Parcelable.Creator<PurchaseStoredValueSelectionStepResult> CREATOR = new C7730a();

    /* renamed from: d */
    public static final C7731b f23451d = new C7731b(PurchaseStoredValueSelectionStepResult.class);

    /* renamed from: c */
    public final CurrencyAmount f23452c;

    /* renamed from: com.moovit.ticketing.purchase.storedvalue.PurchaseStoredValueSelectionStepResult$a */
    public class C7730a implements Parcelable.Creator<PurchaseStoredValueSelectionStepResult> {
        public final Object createFromParcel(Parcel parcel) {
            return (PurchaseStoredValueSelectionStepResult) C19612n.m46981v(parcel, PurchaseStoredValueSelectionStepResult.f23451d);
        }

        public final Object[] newArray(int i) {
            return new PurchaseStoredValueSelectionStepResult[i];
        }
    }

    /* renamed from: com.moovit.ticketing.purchase.storedvalue.PurchaseStoredValueSelectionStepResult$b */
    public class C7731b extends C19619s<PurchaseStoredValueSelectionStepResult> {
        public C7731b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new PurchaseStoredValueSelectionStepResult(pVar.mo51947p(), (CurrencyAmount) CurrencyAmount.f23843f.read(pVar));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            PurchaseStoredValueSelectionStepResult purchaseStoredValueSelectionStepResult = (PurchaseStoredValueSelectionStepResult) obj;
            qVar.mo51954p(purchaseStoredValueSelectionStepResult.f23249b);
            CurrencyAmount currencyAmount = purchaseStoredValueSelectionStepResult.f23452c;
            CurrencyAmount.C7881b bVar = CurrencyAmount.f23843f;
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(currencyAmount, qVar);
        }
    }

    public PurchaseStoredValueSelectionStepResult(String str, CurrencyAmount currencyAmount) {
        super(str);
        C21100e.m49373x(currencyAmount, "amount");
        this.f23452c = currencyAmount;
    }

    /* renamed from: b */
    public final <R, E extends Exception> R mo24018b(PurchaseStepResult.C7646a<R, E> aVar) throws Exception {
        return aVar.mo24026n(this);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23451d);
    }
}
