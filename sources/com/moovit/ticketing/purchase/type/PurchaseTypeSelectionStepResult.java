package com.moovit.ticketing.purchase.type;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.ticketing.purchase.PurchaseStepResult;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class PurchaseTypeSelectionStepResult extends PurchaseStepResult {
    public static final Parcelable.Creator<PurchaseTypeSelectionStepResult> CREATOR = new C7738a();

    /* renamed from: d */
    public static final C7739b f23467d = new C7739b(PurchaseTypeSelectionStepResult.class);

    /* renamed from: c */
    public final String f23468c;

    /* renamed from: com.moovit.ticketing.purchase.type.PurchaseTypeSelectionStepResult$a */
    public class C7738a implements Parcelable.Creator<PurchaseTypeSelectionStepResult> {
        public final Object createFromParcel(Parcel parcel) {
            return (PurchaseTypeSelectionStepResult) C19612n.m46981v(parcel, PurchaseTypeSelectionStepResult.f23467d);
        }

        public final Object[] newArray(int i) {
            return new PurchaseTypeSelectionStepResult[i];
        }
    }

    /* renamed from: com.moovit.ticketing.purchase.type.PurchaseTypeSelectionStepResult$b */
    public class C7739b extends C19619s<PurchaseTypeSelectionStepResult> {
        public C7739b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new PurchaseTypeSelectionStepResult(pVar.mo51947p(), pVar.mo51947p());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            PurchaseTypeSelectionStepResult purchaseTypeSelectionStepResult = (PurchaseTypeSelectionStepResult) obj;
            qVar.mo51954p(purchaseTypeSelectionStepResult.f23249b);
            qVar.mo51954p(purchaseTypeSelectionStepResult.f23468c);
        }
    }

    public PurchaseTypeSelectionStepResult(String str, String str2) {
        super(str);
        C21100e.m49373x(str2, "selectedTypeId");
        this.f23468c = str2;
    }

    /* renamed from: b */
    public final <R, E extends Exception> R mo24018b(PurchaseStepResult.C7646a<R, E> aVar) throws Exception {
        return aVar.mo24022g(this);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23467d);
    }
}
