package com.moovit.ticketing.purchase.massabi;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.ticketing.purchase.PurchaseStepResult;
import com.moovit.ticketing.purchase.massabi.PurchaseMasabiStep;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class PurchaseMasabiStepResult extends PurchaseStepResult {
    public static final Parcelable.Creator<PurchaseMasabiStepResult> CREATOR = new C7714a();

    /* renamed from: d */
    public static final C7715b f23416d = new C7715b(PurchaseMasabiStepResult.class);

    /* renamed from: c */
    public final PurchaseMasabiStep f23417c;

    /* renamed from: com.moovit.ticketing.purchase.massabi.PurchaseMasabiStepResult$a */
    public class C7714a implements Parcelable.Creator<PurchaseMasabiStepResult> {
        public final Object createFromParcel(Parcel parcel) {
            return (PurchaseMasabiStepResult) C19612n.m46981v(parcel, PurchaseMasabiStepResult.f23416d);
        }

        public final Object[] newArray(int i) {
            return new PurchaseMasabiStepResult[i];
        }
    }

    /* renamed from: com.moovit.ticketing.purchase.massabi.PurchaseMasabiStepResult$b */
    public class C7715b extends C19619s<PurchaseMasabiStepResult> {
        public C7715b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            PurchaseMasabiStep.C7713b bVar = PurchaseMasabiStep.f23411i;
            pVar.getClass();
            return new PurchaseMasabiStepResult((PurchaseMasabiStep) bVar.read(pVar));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            PurchaseMasabiStep purchaseMasabiStep = ((PurchaseMasabiStepResult) obj).f23417c;
            PurchaseMasabiStep.C7713b bVar = PurchaseMasabiStep.f23411i;
            qVar.getClass();
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(purchaseMasabiStep, qVar);
        }
    }

    public PurchaseMasabiStepResult(PurchaseMasabiStep purchaseMasabiStep) {
        super("com.masabi.wizard");
        C21100e.m49373x(purchaseMasabiStep, "step");
        this.f23417c = purchaseMasabiStep;
    }

    /* renamed from: b */
    public final <R, E extends Exception> R mo24018b(PurchaseStepResult.C7646a<R, E> aVar) throws Exception {
        return aVar.mo24024k(this);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23416d);
    }
}
