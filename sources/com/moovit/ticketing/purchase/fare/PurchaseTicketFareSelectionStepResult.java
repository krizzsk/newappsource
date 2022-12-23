package com.moovit.ticketing.purchase.fare;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.ticketing.purchase.PurchaseStepResult;
import com.moovit.ticketing.purchase.fare.TicketFare;
import com.moovit.ticketing.purchase.filter.PurchaseFilters;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class PurchaseTicketFareSelectionStepResult extends PurchaseStepResult {
    public static final Parcelable.Creator<PurchaseTicketFareSelectionStepResult> CREATOR = new C7665a();

    /* renamed from: e */
    public static final C7666b f23302e = new C7666b(PurchaseTicketFareSelectionStepResult.class);

    /* renamed from: c */
    public final TicketFare f23303c;

    /* renamed from: d */
    public final PurchaseFilters f23304d;

    /* renamed from: com.moovit.ticketing.purchase.fare.PurchaseTicketFareSelectionStepResult$a */
    public class C7665a implements Parcelable.Creator<PurchaseTicketFareSelectionStepResult> {
        public final Object createFromParcel(Parcel parcel) {
            return (PurchaseTicketFareSelectionStepResult) C19612n.m46981v(parcel, PurchaseTicketFareSelectionStepResult.f23302e);
        }

        public final Object[] newArray(int i) {
            return new PurchaseTicketFareSelectionStepResult[i];
        }
    }

    /* renamed from: com.moovit.ticketing.purchase.fare.PurchaseTicketFareSelectionStepResult$b */
    public class C7666b extends C19619s<PurchaseTicketFareSelectionStepResult> {
        public C7666b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new PurchaseTicketFareSelectionStepResult(pVar.mo51947p(), (TicketFare) TicketFare.f23325n.read(pVar), (PurchaseFilters) pVar.mo51962q(PurchaseFilters.f23360d));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            PurchaseTicketFareSelectionStepResult purchaseTicketFareSelectionStepResult = (PurchaseTicketFareSelectionStepResult) obj;
            qVar.mo51954p(purchaseTicketFareSelectionStepResult.f23249b);
            TicketFare ticketFare = purchaseTicketFareSelectionStepResult.f23303c;
            TicketFare.C7677b bVar = TicketFare.f23325n;
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(ticketFare, qVar);
            qVar.mo51967q(purchaseTicketFareSelectionStepResult.f23304d, PurchaseFilters.f23360d);
        }
    }

    public PurchaseTicketFareSelectionStepResult(String str, TicketFare ticketFare, PurchaseFilters purchaseFilters) {
        super(str);
        C21100e.m49373x(ticketFare, "ticketFare");
        this.f23303c = ticketFare;
        this.f23304d = purchaseFilters;
    }

    /* renamed from: b */
    public final <R, E extends Exception> R mo24018b(PurchaseStepResult.C7646a<R, E> aVar) throws Exception {
        return aVar.mo24019a(this);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23302e);
    }
}
