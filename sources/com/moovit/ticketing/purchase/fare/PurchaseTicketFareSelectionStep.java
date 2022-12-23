package com.moovit.ticketing.purchase.fare;

import a90.C7520c;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.ticketing.purchase.PurchaseStep;
import com.moovit.ticketing.purchase.PurchaseTicketActivity;
import com.moovit.ticketing.purchase.filter.PurchaseFilters;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class PurchaseTicketFareSelectionStep extends PurchaseStep {
    public static final Parcelable.Creator<PurchaseTicketFareSelectionStep> CREATOR = new C7663a();

    /* renamed from: h */
    public static final C7664b f23298h = new C7664b(PurchaseTicketFareSelectionStep.class);

    /* renamed from: e */
    public final List<TicketFare> f23299e;

    /* renamed from: f */
    public final String f23300f;

    /* renamed from: g */
    public final PurchaseFilters f23301g;

    /* renamed from: com.moovit.ticketing.purchase.fare.PurchaseTicketFareSelectionStep$a */
    public class C7663a implements Parcelable.Creator<PurchaseTicketFareSelectionStep> {
        public final Object createFromParcel(Parcel parcel) {
            return (PurchaseTicketFareSelectionStep) C19612n.m46981v(parcel, PurchaseTicketFareSelectionStep.f23298h);
        }

        public final Object[] newArray(int i) {
            return new PurchaseTicketFareSelectionStep[i];
        }
    }

    /* renamed from: com.moovit.ticketing.purchase.fare.PurchaseTicketFareSelectionStep$b */
    public class C7664b extends C19619s<PurchaseTicketFareSelectionStep> {
        public C7664b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new PurchaseTicketFareSelectionStep(pVar.mo51947p(), pVar.mo51947p(), pVar.mo51959g(TicketFare.f23325n), pVar.mo51948t(), (PurchaseFilters) pVar.mo51962q(PurchaseFilters.f23360d), pVar.mo51948t());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            PurchaseTicketFareSelectionStep purchaseTicketFareSelectionStep = (PurchaseTicketFareSelectionStep) obj;
            qVar.mo51954p(purchaseTicketFareSelectionStep.f23246b);
            qVar.mo51954p(purchaseTicketFareSelectionStep.f23247c);
            qVar.mo51955t(purchaseTicketFareSelectionStep.f23248d);
            qVar.mo51965h(purchaseTicketFareSelectionStep.f23299e, TicketFare.f23325n);
            qVar.mo51955t(purchaseTicketFareSelectionStep.f23300f);
            qVar.mo51967q(purchaseTicketFareSelectionStep.f23301g, PurchaseFilters.f23360d);
        }
    }

    public PurchaseTicketFareSelectionStep(String str, String str2, ArrayList arrayList, String str3, PurchaseFilters purchaseFilters, String str4) {
        super(str, str2, str4);
        C21100e.m49373x(arrayList, "fares");
        this.f23299e = arrayList;
        this.f23300f = str3;
        this.f23301g = purchaseFilters;
    }

    /* renamed from: b */
    public final void mo24015b(PurchaseStep.C7645a aVar, String str) {
        PurchaseTicketActivity purchaseTicketActivity = (PurchaseTicketActivity) aVar;
        purchaseTicketActivity.getClass();
        int i = C7520c.f22991t;
        Bundle b = C25541a.m63872b("stepId", str);
        C7520c cVar = new C7520c();
        cVar.setArguments(b);
        purchaseTicketActivity.mo24030y2(cVar);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23298h);
    }
}
