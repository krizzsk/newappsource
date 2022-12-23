package com.moovit.ticketing.purchase.itinerary;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.util.CurrencyAmount;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class PurchaseItineraryLegSelectionLegFare implements Parcelable {
    public static final Parcelable.Creator<PurchaseItineraryLegSelectionLegFare> CREATOR = new C7694a();

    /* renamed from: i */
    public static final C7695b f23378i = new C7695b(PurchaseItineraryLegSelectionLegFare.class);

    /* renamed from: b */
    public final String f23379b;

    /* renamed from: c */
    public final String f23380c;

    /* renamed from: d */
    public final CurrencyAmount f23381d;

    /* renamed from: e */
    public final CurrencyAmount f23382e;

    /* renamed from: f */
    public final String f23383f;

    /* renamed from: g */
    public final String f23384g;

    /* renamed from: h */
    public final String f23385h;

    /* renamed from: com.moovit.ticketing.purchase.itinerary.PurchaseItineraryLegSelectionLegFare$a */
    public class C7694a implements Parcelable.Creator<PurchaseItineraryLegSelectionLegFare> {
        public final Object createFromParcel(Parcel parcel) {
            return (PurchaseItineraryLegSelectionLegFare) C19612n.m46981v(parcel, PurchaseItineraryLegSelectionLegFare.f23378i);
        }

        public final Object[] newArray(int i) {
            return new PurchaseItineraryLegSelectionLegFare[i];
        }
    }

    /* renamed from: com.moovit.ticketing.purchase.itinerary.PurchaseItineraryLegSelectionLegFare$b */
    public class C7695b extends C19619s<PurchaseItineraryLegSelectionLegFare> {
        public C7695b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            String p = pVar.mo51947p();
            String p2 = pVar.mo51947p();
            CurrencyAmount.C7881b bVar = CurrencyAmount.f23843f;
            return new PurchaseItineraryLegSelectionLegFare(p, p2, (CurrencyAmount) pVar.mo51962q(bVar), (CurrencyAmount) pVar.mo51962q(bVar), pVar.mo51948t(), pVar.mo51948t(), pVar.mo51948t());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            PurchaseItineraryLegSelectionLegFare purchaseItineraryLegSelectionLegFare = (PurchaseItineraryLegSelectionLegFare) obj;
            qVar.mo51954p(purchaseItineraryLegSelectionLegFare.f23379b);
            qVar.mo51954p(purchaseItineraryLegSelectionLegFare.f23380c);
            CurrencyAmount currencyAmount = purchaseItineraryLegSelectionLegFare.f23381d;
            CurrencyAmount.C7881b bVar = CurrencyAmount.f23843f;
            qVar.mo51967q(currencyAmount, bVar);
            qVar.mo51967q(purchaseItineraryLegSelectionLegFare.f23382e, bVar);
            qVar.mo51955t(purchaseItineraryLegSelectionLegFare.f23383f);
            qVar.mo51955t(purchaseItineraryLegSelectionLegFare.f23384g);
            qVar.mo51955t(purchaseItineraryLegSelectionLegFare.f23385h);
        }
    }

    public PurchaseItineraryLegSelectionLegFare(String str, String str2, CurrencyAmount currencyAmount, CurrencyAmount currencyAmount2, String str3, String str4, String str5) {
        C21100e.m49373x(str, "id");
        this.f23379b = str;
        C21100e.m49373x(str2, "name");
        this.f23380c = str2;
        this.f23381d = currencyAmount;
        this.f23382e = currencyAmount2;
        this.f23383f = str3;
        this.f23384g = str4;
        this.f23385h = str5;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
    }
}
