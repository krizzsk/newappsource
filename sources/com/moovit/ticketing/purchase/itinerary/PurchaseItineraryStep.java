package com.moovit.ticketing.purchase.itinerary;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.payment.gateway.paymentmethod.PurchaseVerificationType;
import com.moovit.ticketing.purchase.PurchaseStep;
import com.moovit.ticketing.purchase.PurchaseTicketActivity;
import com.moovit.ticketing.purchase.filter.PurchaseFilters;
import com.moovit.ticketing.purchase.itinerary.C7707a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import q80.C13036y;

public class PurchaseItineraryStep extends PurchaseStep {
    public static final Parcelable.Creator<PurchaseItineraryStep> CREATOR = new C7700a();

    /* renamed from: l */
    public static final C7701b f23391l = new C7701b(PurchaseItineraryStep.class);

    /* renamed from: e */
    public final String f23392e;

    /* renamed from: f */
    public final String f23393f;

    /* renamed from: g */
    public final List<TicketItineraryLegFare> f23394g;

    /* renamed from: h */
    public final PurchaseVerificationType f23395h;

    /* renamed from: i */
    public final PurchaseFilters f23396i;

    /* renamed from: j */
    public final String f23397j;

    /* renamed from: k */
    public final String f23398k;

    /* renamed from: com.moovit.ticketing.purchase.itinerary.PurchaseItineraryStep$a */
    public class C7700a implements Parcelable.Creator<PurchaseItineraryStep> {
        public final Object createFromParcel(Parcel parcel) {
            return (PurchaseItineraryStep) C19612n.m46981v(parcel, PurchaseItineraryStep.f23391l);
        }

        public final Object[] newArray(int i) {
            return new PurchaseItineraryStep[i];
        }
    }

    /* renamed from: com.moovit.ticketing.purchase.itinerary.PurchaseItineraryStep$b */
    public class C7701b extends C19619s<PurchaseItineraryStep> {
        public C7701b(Class cls) {
            super(4, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i >= 0 && i <= 4;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            C19615p pVar2 = pVar;
            int i2 = i;
            if (i2 == 1) {
                return new PurchaseItineraryStep("", pVar.mo51947p(), pVar.mo51947p(), pVar.mo51948t(), pVar.mo51948t(), pVar2.mo51959g(C13036y.f32248a), PurchaseVerificationType.CODER.read(pVar2), (PurchaseFilters) null, (String) null, "");
            }
            if (i2 == 2) {
                return new PurchaseItineraryStep("", pVar.mo51947p(), pVar.mo51947p(), pVar.mo51948t(), pVar.mo51948t(), pVar2.mo51959g(C13036y.f32248a), PurchaseVerificationType.CODER.read(pVar2), (PurchaseFilters) pVar2.mo51962q(PurchaseFilters.f23360d), pVar.mo51948t(), "");
            }
            if (i2 == 3) {
                return new PurchaseItineraryStep(pVar.mo51947p(), pVar.mo51947p(), pVar.mo51947p(), pVar.mo51948t(), pVar.mo51948t(), pVar2.mo51959g(C13036y.f32248a), PurchaseVerificationType.CODER.read(pVar2), (PurchaseFilters) pVar2.mo51962q(PurchaseFilters.f23360d), pVar.mo51948t(), "");
            }
            if (i2 == 4) {
                return new PurchaseItineraryStep(pVar.mo51947p(), pVar.mo51947p(), pVar.mo51947p(), pVar.mo51948t(), pVar.mo51948t(), pVar2.mo51959g(C13036y.f32248a), PurchaseVerificationType.CODER.read(pVar2), (PurchaseFilters) pVar2.mo51962q(PurchaseFilters.f23360d), pVar.mo51948t(), pVar.mo51947p());
            }
            String p = pVar.mo51947p();
            String p2 = pVar.mo51947p();
            String t = pVar.mo51948t();
            pVar.mo51924l();
            pVar.mo51947p();
            return new PurchaseItineraryStep("", p, p2, t, pVar.mo51948t(), pVar2.mo51959g(C13036y.f32248a), PurchaseVerificationType.CODER.read(pVar2), (PurchaseFilters) null, (String) null, "");
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            PurchaseItineraryStep purchaseItineraryStep = (PurchaseItineraryStep) obj;
            qVar.mo51954p(purchaseItineraryStep.f23392e);
            qVar.mo51954p(purchaseItineraryStep.f23246b);
            qVar.mo51954p(purchaseItineraryStep.f23247c);
            qVar.mo51955t(purchaseItineraryStep.f23248d);
            qVar.mo51954p(purchaseItineraryStep.f23393f);
            qVar.mo51965h(purchaseItineraryStep.f23394g, C13036y.f32248a);
            PurchaseVerificationType.CODER.write(purchaseItineraryStep.f23395h, qVar);
            qVar.mo51967q(purchaseItineraryStep.f23396i, PurchaseFilters.f23360d);
            qVar.mo51955t(purchaseItineraryStep.f23397j);
            qVar.mo51954p(purchaseItineraryStep.f23398k);
        }
    }

    public PurchaseItineraryStep(String str, String str2, String str3, String str4, String str5, ArrayList arrayList, PurchaseVerificationType purchaseVerificationType, PurchaseFilters purchaseFilters, String str6, String str7) {
        super(str2, str3, str4);
        C21100e.m49373x(str, "paymentContext");
        this.f23392e = str;
        C21100e.m49373x(str5, "itineraryId");
        this.f23393f = str5;
        C21100e.m49373x(arrayList, "legFares");
        this.f23394g = arrayList;
        C21100e.m49373x(purchaseVerificationType, "verificationType");
        this.f23395h = purchaseVerificationType;
        this.f23396i = purchaseFilters;
        this.f23397j = str6;
        C21100e.m49373x(str7, "paymentDescription");
        this.f23398k = str7;
    }

    /* renamed from: b */
    public final void mo24015b(PurchaseStep.C7645a aVar, String str) {
        PurchaseTicketActivity purchaseTicketActivity = (PurchaseTicketActivity) aVar;
        purchaseTicketActivity.getClass();
        C7707a.C7708a aVar2 = C7707a.f23404s;
        Bundle b = C25541a.m63872b("stepId", str);
        C7707a aVar3 = new C7707a();
        aVar3.setArguments(b);
        purchaseTicketActivity.mo24030y2(aVar3);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23391l);
    }
}
