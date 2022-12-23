package com.moovit.ticketing.purchase.fare;

import a90.C7519b;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.ticketing.purchase.PurchaseStep;
import com.moovit.ticketing.purchase.PurchaseTicketActivity;
import com.moovit.ticketing.purchase.fare.TicketFare;
import com.moovit.ticketing.purchase.filter.PurchaseFilters;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class PurchaseFareStep extends PurchaseStep {
    public static final Parcelable.Creator<PurchaseFareStep> CREATOR = new C7660a();

    /* renamed from: h */
    public static final C7661b f23290h = new C7661b(PurchaseFareStep.class);

    /* renamed from: e */
    public final TicketFare f23291e;

    /* renamed from: f */
    public final PurchaseFilters f23292f;

    /* renamed from: g */
    public final String f23293g;

    /* renamed from: com.moovit.ticketing.purchase.fare.PurchaseFareStep$a */
    public class C7660a implements Parcelable.Creator<PurchaseFareStep> {
        public final Object createFromParcel(Parcel parcel) {
            return (PurchaseFareStep) C19612n.m46981v(parcel, PurchaseFareStep.f23290h);
        }

        public final Object[] newArray(int i) {
            return new PurchaseFareStep[i];
        }
    }

    /* renamed from: com.moovit.ticketing.purchase.fare.PurchaseFareStep$b */
    public class C7661b extends C19619s<PurchaseFareStep> {
        public C7661b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new PurchaseFareStep(pVar.mo51947p(), pVar.mo51947p(), (TicketFare) TicketFare.f23325n.read(pVar), (PurchaseFilters) pVar.mo51962q(PurchaseFilters.f23360d), pVar.mo51948t());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            PurchaseFareStep purchaseFareStep = (PurchaseFareStep) obj;
            qVar.mo51954p(purchaseFareStep.f23246b);
            qVar.mo51954p(purchaseFareStep.f23247c);
            TicketFare ticketFare = purchaseFareStep.f23291e;
            TicketFare.C7677b bVar = TicketFare.f23325n;
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(ticketFare, qVar);
            qVar.mo51967q(purchaseFareStep.f23292f, PurchaseFilters.f23360d);
            qVar.mo51955t(purchaseFareStep.f23293g);
        }
    }

    public PurchaseFareStep(String str, String str2, TicketFare ticketFare, PurchaseFilters purchaseFilters, String str3) {
        super(str, str2, (String) null);
        C21100e.m49373x(ticketFare, "fare");
        this.f23291e = ticketFare;
        this.f23292f = purchaseFilters;
        this.f23293g = str3;
    }

    /* renamed from: b */
    public final void mo24015b(PurchaseStep.C7645a aVar, String str) {
        PurchaseTicketActivity purchaseTicketActivity = (PurchaseTicketActivity) aVar;
        purchaseTicketActivity.getClass();
        int i = C7519b.f22988r;
        Bundle b = C25541a.m63872b("stepId", str);
        C7519b bVar = new C7519b();
        bVar.setArguments(b);
        purchaseTicketActivity.mo24030y2(bVar);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23290h);
    }
}
