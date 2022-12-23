package com.moovit.ticketing.purchase.filter;

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

public class PurchaseFilterSelectionStepResult extends PurchaseStepResult {
    public static final Parcelable.Creator<PurchaseFilterSelectionStepResult> CREATOR = new C7684a();

    /* renamed from: e */
    public static final C7685b f23357e = new C7685b(PurchaseFilterSelectionStepResult.class);

    /* renamed from: c */
    public final String f23358c;

    /* renamed from: d */
    public final String f23359d;

    /* renamed from: com.moovit.ticketing.purchase.filter.PurchaseFilterSelectionStepResult$a */
    public class C7684a implements Parcelable.Creator<PurchaseFilterSelectionStepResult> {
        public final Object createFromParcel(Parcel parcel) {
            return (PurchaseFilterSelectionStepResult) C19612n.m46981v(parcel, PurchaseFilterSelectionStepResult.f23357e);
        }

        public final Object[] newArray(int i) {
            return new PurchaseFilterSelectionStepResult[i];
        }
    }

    /* renamed from: com.moovit.ticketing.purchase.filter.PurchaseFilterSelectionStepResult$b */
    public class C7685b extends C19619s<PurchaseFilterSelectionStepResult> {
        public C7685b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new PurchaseFilterSelectionStepResult(pVar.mo51947p(), pVar.mo51947p(), pVar.mo51947p());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            PurchaseFilterSelectionStepResult purchaseFilterSelectionStepResult = (PurchaseFilterSelectionStepResult) obj;
            qVar.mo51954p(purchaseFilterSelectionStepResult.f23249b);
            qVar.mo51954p(purchaseFilterSelectionStepResult.f23358c);
            qVar.mo51954p(purchaseFilterSelectionStepResult.f23359d);
        }
    }

    public PurchaseFilterSelectionStepResult(String str, String str2, String str3) {
        super(str);
        C21100e.m49373x(str2, "type");
        this.f23358c = str2;
        C21100e.m49373x(str3, "selectedFilterId");
        this.f23359d = str3;
    }

    /* renamed from: b */
    public final <R, E extends Exception> R mo24018b(PurchaseStepResult.C7646a<R, E> aVar) throws Exception {
        return aVar.mo24025m(this);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23357e);
    }
}
