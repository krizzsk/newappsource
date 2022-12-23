package com.moovit.ticketing.purchase.station;

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

public class PurchaseStationSelectionStepResult extends PurchaseStepResult {
    public static final Parcelable.Creator<PurchaseStationSelectionStepResult> CREATOR = new C7720a();

    /* renamed from: e */
    public static final C7721b f23426e = new C7721b(PurchaseStationSelectionStepResult.class);

    /* renamed from: c */
    public final String f23427c;

    /* renamed from: d */
    public final String f23428d;

    /* renamed from: com.moovit.ticketing.purchase.station.PurchaseStationSelectionStepResult$a */
    public class C7720a implements Parcelable.Creator<PurchaseStationSelectionStepResult> {
        public final Object createFromParcel(Parcel parcel) {
            return (PurchaseStationSelectionStepResult) C19612n.m46981v(parcel, PurchaseStationSelectionStepResult.f23426e);
        }

        public final Object[] newArray(int i) {
            return new PurchaseStationSelectionStepResult[i];
        }
    }

    /* renamed from: com.moovit.ticketing.purchase.station.PurchaseStationSelectionStepResult$b */
    public class C7721b extends C19619s<PurchaseStationSelectionStepResult> {
        public C7721b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new PurchaseStationSelectionStepResult(pVar.mo51947p(), pVar.mo51947p(), pVar.mo51947p());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            PurchaseStationSelectionStepResult purchaseStationSelectionStepResult = (PurchaseStationSelectionStepResult) obj;
            qVar.mo51954p(purchaseStationSelectionStepResult.f23249b);
            qVar.mo51954p(purchaseStationSelectionStepResult.f23427c);
            qVar.mo51954p(purchaseStationSelectionStepResult.f23428d);
        }
    }

    public PurchaseStationSelectionStepResult(String str, String str2, String str3) {
        super(str);
        C21100e.m49373x(str2, "type");
        this.f23427c = str2;
        C21100e.m49373x(str3, "selectedStationId");
        this.f23428d = str3;
    }

    /* renamed from: b */
    public final <R, E extends Exception> R mo24018b(PurchaseStepResult.C7646a<R, E> aVar) throws Exception {
        return aVar.mo24020b(this);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23426e);
    }
}
