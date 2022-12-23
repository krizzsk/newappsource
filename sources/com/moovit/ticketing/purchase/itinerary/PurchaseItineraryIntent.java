package com.moovit.ticketing.purchase.itinerary;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.ticketing.purchase.PurchaseIntent;
import com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseIntent;
import com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseItineraryIntent;
import java.io.IOException;
import java.util.ArrayList;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19617r;
import p810sz.C19619s;
import q80.C13020i;
import q80.C13036y;

public class PurchaseItineraryIntent implements PurchaseIntent {
    public static final Parcelable.Creator<PurchaseItineraryIntent> CREATOR = new C7692a();

    /* renamed from: c */
    public static final C7693b f23376c = new C7693b(PurchaseItineraryIntent.class);

    /* renamed from: b */
    public final Itinerary f23377b;

    /* renamed from: com.moovit.ticketing.purchase.itinerary.PurchaseItineraryIntent$a */
    public class C7692a implements Parcelable.Creator<PurchaseItineraryIntent> {
        public final Object createFromParcel(Parcel parcel) {
            return (PurchaseItineraryIntent) C19612n.m46981v(parcel, PurchaseItineraryIntent.f23376c);
        }

        public final Object[] newArray(int i) {
            return new PurchaseItineraryIntent[i];
        }
    }

    /* renamed from: com.moovit.ticketing.purchase.itinerary.PurchaseItineraryIntent$b */
    public class C7693b extends C19619s<PurchaseItineraryIntent> {
        public C7693b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            Itinerary.C16087c cVar = Itinerary.f41893g;
            pVar.getClass();
            return new PurchaseItineraryIntent((Itinerary) cVar.read(pVar));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            Itinerary itinerary = ((PurchaseItineraryIntent) obj).f23377b;
            Itinerary.C16086b bVar = Itinerary.f41892f;
            qVar.getClass();
            qVar.mo51939l(0);
            bVar.mo19622a(itinerary, qVar);
        }
    }

    public PurchaseItineraryIntent(Itinerary itinerary) {
        C21100e.m49373x(itinerary, "itinerary");
        this.f23377b = itinerary;
    }

    /* renamed from: H1 */
    public final MVPurchaseIntent mo23996H1(PurchaseIntent.C7644a aVar) {
        ((C13020i) aVar).getClass();
        C19617r rVar = C13036y.f32248a;
        C13036y.C13038b bVar = new C13036y.C13038b();
        for (Leg i0 : this.f23377b.mo48295u0()) {
            i0.mo48338i0(bVar);
        }
        ArrayList arrayList = bVar.f32260c;
        String str = this.f23377b.f41894b;
        MVPurchaseItineraryIntent mVPurchaseItineraryIntent = new MVPurchaseItineraryIntent();
        mVPurchaseItineraryIntent.legs = arrayList;
        mVPurchaseItineraryIntent.tripPlanItineraryGuid = str;
        MVPurchaseIntent mVPurchaseIntent = new MVPurchaseIntent();
        mVPurchaseIntent.setField_ = MVPurchaseIntent._Fields.ITINERARY_VALUE;
        mVPurchaseIntent.value_ = mVPurchaseItineraryIntent;
        return mVPurchaseIntent;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23376c);
    }
}
