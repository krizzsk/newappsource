package com.moovit.ticketing.purchase.fare;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import ce0.C21100e;
import com.moovit.network.model.ServerId;
import com.moovit.ticketing.purchase.filter.PurchaseFilters;
import com.moovit.ticketing.ticket.TicketAgency;
import com.moovit.util.CurrencyAmount;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.io.IOException;
import p810sz.C19589j;
import p810sz.C19600l;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class SuggestedTicketFare implements Parcelable {
    public static final Parcelable.Creator<SuggestedTicketFare> CREATOR = new C7670a();

    /* renamed from: j */
    public static final C7671b f23312j = new C7671b(SuggestedTicketFare.class);

    /* renamed from: b */
    public final ServerId f23313b;

    /* renamed from: c */
    public final ServerId f23314c;

    /* renamed from: d */
    public final String f23315d;

    /* renamed from: e */
    public final String f23316e;

    /* renamed from: f */
    public final TicketAgency f23317f;

    /* renamed from: g */
    public final CurrencyAmount f23318g;

    /* renamed from: h */
    public final PurchaseFilters f23319h;

    /* renamed from: i */
    public final SparseArray<String> f23320i;

    /* renamed from: com.moovit.ticketing.purchase.fare.SuggestedTicketFare$a */
    public class C7670a implements Parcelable.Creator<SuggestedTicketFare> {
        public final Object createFromParcel(Parcel parcel) {
            return (SuggestedTicketFare) C19612n.m46981v(parcel, SuggestedTicketFare.f23312j);
        }

        public final Object[] newArray(int i) {
            return new SuggestedTicketFare[i];
        }
    }

    /* renamed from: com.moovit.ticketing.purchase.fare.SuggestedTicketFare$b */
    public class C7671b extends C19619s<SuggestedTicketFare> {
        public C7671b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            pVar.getClass();
            return new SuggestedTicketFare(new ServerId(pVar.mo51924l()), new ServerId(pVar.mo51924l()), pVar.mo51947p(), pVar.mo51947p(), (TicketAgency) TicketAgency.f23494g.read(pVar), (CurrencyAmount) CurrencyAmount.f23843f.read(pVar), (PurchaseFilters) pVar.mo51962q(PurchaseFilters.f23360d), pVar.mo51963s(C19589j.f49779k));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            SuggestedTicketFare suggestedTicketFare = (SuggestedTicketFare) obj;
            ServerId serverId = suggestedTicketFare.f23313b;
            qVar.getClass();
            qVar.mo51939l(serverId.f15142b);
            qVar.mo51939l(suggestedTicketFare.f23314c.f15142b);
            qVar.mo51954p(suggestedTicketFare.f23315d);
            qVar.mo51954p(suggestedTicketFare.f23316e);
            CurrencyAmount currencyAmount = suggestedTicketFare.f23318g;
            CurrencyAmount.C7881b bVar = CurrencyAmount.f23843f;
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(currencyAmount, qVar);
            TicketAgency ticketAgency = suggestedTicketFare.f23317f;
            TicketAgency.C7744b bVar2 = TicketAgency.f23494g;
            qVar.mo51939l(bVar2.f49802v);
            bVar2.mo179c(ticketAgency, qVar);
            qVar.mo51967q(suggestedTicketFare.f23319h, PurchaseFilters.f23360d);
            qVar.mo51968s(suggestedTicketFare.f23320i, C19600l.f49790t);
        }
    }

    public SuggestedTicketFare(ServerId serverId, ServerId serverId2, String str, String str2, TicketAgency ticketAgency, CurrencyAmount currencyAmount, PurchaseFilters purchaseFilters, SparseArray<String> sparseArray) {
        this.f23313b = serverId;
        this.f23314c = serverId2;
        C21100e.m49373x(str, "id");
        this.f23315d = str;
        C21100e.m49373x(str2, "name");
        this.f23316e = str2;
        C21100e.m49373x(ticketAgency, "agency");
        this.f23317f = ticketAgency;
        C21100e.m49373x(currencyAmount, InAppPurchaseMetaData.KEY_PRICE);
        this.f23318g = currencyAmount;
        this.f23319h = purchaseFilters;
        this.f23320i = sparseArray;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23312j);
    }
}
