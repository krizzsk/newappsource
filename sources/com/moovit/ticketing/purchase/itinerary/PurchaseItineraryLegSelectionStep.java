package com.moovit.ticketing.purchase.itinerary;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.ticketing.purchase.PurchaseStep;
import com.moovit.ticketing.purchase.PurchaseTicketActivity;
import d90.C12608b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class PurchaseItineraryLegSelectionStep extends PurchaseStep {
    public static final Parcelable.Creator<PurchaseItineraryLegSelectionStep> CREATOR = new C7696a();

    /* renamed from: g */
    public static final C7697b f23386g = new C7697b(PurchaseItineraryLegSelectionStep.class);

    /* renamed from: e */
    public final List<PurchaseItineraryLegSelectionLegFare> f23387e;

    /* renamed from: f */
    public String f23388f;

    /* renamed from: com.moovit.ticketing.purchase.itinerary.PurchaseItineraryLegSelectionStep$a */
    public class C7696a implements Parcelable.Creator<PurchaseItineraryLegSelectionStep> {
        public final Object createFromParcel(Parcel parcel) {
            return (PurchaseItineraryLegSelectionStep) C19612n.m46981v(parcel, PurchaseItineraryLegSelectionStep.f23386g);
        }

        public final Object[] newArray(int i) {
            return new PurchaseItineraryLegSelectionStep[i];
        }
    }

    /* renamed from: com.moovit.ticketing.purchase.itinerary.PurchaseItineraryLegSelectionStep$b */
    public class C7697b extends C19619s<PurchaseItineraryLegSelectionStep> {
        public C7697b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new PurchaseItineraryLegSelectionStep(pVar.mo51947p(), pVar.mo51947p(), pVar.mo51948t(), pVar.mo51948t(), pVar.mo51959g(PurchaseItineraryLegSelectionLegFare.f23378i));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            PurchaseItineraryLegSelectionStep purchaseItineraryLegSelectionStep = (PurchaseItineraryLegSelectionStep) obj;
            qVar.mo51954p(purchaseItineraryLegSelectionStep.f23246b);
            qVar.mo51954p(purchaseItineraryLegSelectionStep.f23247c);
            qVar.mo51955t(purchaseItineraryLegSelectionStep.f23248d);
            qVar.mo51965h(purchaseItineraryLegSelectionStep.f23387e, PurchaseItineraryLegSelectionLegFare.f23378i);
            qVar.mo51955t(purchaseItineraryLegSelectionStep.f23388f);
        }
    }

    public PurchaseItineraryLegSelectionStep(String str, String str2, String str3, String str4, ArrayList arrayList) {
        super(str, str2, str3);
        C21100e.m49373x(arrayList, "legsFares");
        this.f23387e = arrayList;
        this.f23388f = str4;
    }

    /* renamed from: b */
    public final void mo24015b(PurchaseStep.C7645a aVar, String str) {
        PurchaseTicketActivity purchaseTicketActivity = (PurchaseTicketActivity) aVar;
        purchaseTicketActivity.getClass();
        int i = C12608b.f31159r;
        Bundle b = C25541a.m63872b("stepId", str);
        C12608b bVar = new C12608b();
        bVar.setArguments(b);
        purchaseTicketActivity.mo24030y2(bVar);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23386g);
    }
}
