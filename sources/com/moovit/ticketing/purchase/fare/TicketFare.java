package com.moovit.ticketing.purchase.fare;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import ce0.C21100e;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
import com.moovit.network.model.ServerId;
import com.moovit.payment.gateway.paymentmethod.PurchaseVerificationType;
import com.moovit.ticketing.ticket.TicketAgency;
import com.moovit.util.CurrencyAmount;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.io.IOException;
import p583jk.C17884p;
import p810sz.C19589j;
import p810sz.C19600l;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p977zz.C20975x0;

public class TicketFare implements Parcelable {
    public static final Parcelable.Creator<TicketFare> CREATOR = new C7676a();

    /* renamed from: n */
    public static final C7677b f23325n = new C7677b(TicketFare.class);

    /* renamed from: b */
    public final String f23326b;

    /* renamed from: c */
    public final ServerId f23327c;

    /* renamed from: d */
    public final String f23328d;

    /* renamed from: e */
    public final String f23329e;

    /* renamed from: f */
    public final CurrencyAmount f23330f;

    /* renamed from: g */
    public final CurrencyAmount f23331g;

    /* renamed from: h */
    public final int f23332h;

    /* renamed from: i */
    public final TicketAgency f23333i;

    /* renamed from: j */
    public final String f23334j;

    /* renamed from: k */
    public final Image f23335k;

    /* renamed from: l */
    public final PurchaseVerificationType f23336l;

    /* renamed from: m */
    public final SparseArray<String> f23337m;

    /* renamed from: com.moovit.ticketing.purchase.fare.TicketFare$a */
    public class C7676a implements Parcelable.Creator<TicketFare> {
        public final Object createFromParcel(Parcel parcel) {
            return (TicketFare) C19612n.m46981v(parcel, TicketFare.f23325n);
        }

        public final Object[] newArray(int i) {
            return new TicketFare[i];
        }
    }

    /* renamed from: com.moovit.ticketing.purchase.fare.TicketFare$b */
    public class C7677b extends C19619s<TicketFare> {
        public C7677b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            String p = pVar.mo51947p();
            ServerId serverId = new ServerId(pVar.mo51924l());
            String p2 = pVar.mo51947p();
            String t = pVar.mo51948t();
            CurrencyAmount.C7881b bVar = CurrencyAmount.f23843f;
            return new TicketFare(p, serverId, p2, t, (CurrencyAmount) bVar.read(pVar), (CurrencyAmount) pVar.mo51962q(bVar), pVar.mo51924l(), (TicketAgency) TicketAgency.f23494g.read(pVar), pVar.mo51948t(), (Image) pVar.mo51962q(C16019d.m40803a().f41718d), PurchaseVerificationType.CODER.read(pVar), pVar.mo51963s(C19589j.f49779k));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            TicketFare ticketFare = (TicketFare) obj;
            qVar.mo51954p(ticketFare.f23326b);
            qVar.mo51939l(ticketFare.f23327c.f15142b);
            qVar.mo51954p(ticketFare.f23328d);
            qVar.mo51955t(ticketFare.f23329e);
            CurrencyAmount currencyAmount = ticketFare.f23330f;
            CurrencyAmount.C7881b bVar = CurrencyAmount.f23843f;
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(currencyAmount, qVar);
            qVar.mo51967q(ticketFare.f23331g, bVar);
            qVar.mo51939l(ticketFare.f23332h);
            TicketAgency ticketAgency = ticketFare.f23333i;
            TicketAgency.C7744b bVar2 = TicketAgency.f23494g;
            qVar.mo51939l(bVar2.f49802v);
            bVar2.mo179c(ticketAgency, qVar);
            qVar.mo51955t(ticketFare.f23334j);
            qVar.mo51967q(ticketFare.f23335k, C16019d.m40803a().f41718d);
            PurchaseVerificationType.CODER.write(ticketFare.f23336l, qVar);
            qVar.mo51968s(ticketFare.f23337m, C19600l.f49790t);
        }
    }

    public TicketFare(String str, ServerId serverId, String str2, String str3, CurrencyAmount currencyAmount, CurrencyAmount currencyAmount2, int i, TicketAgency ticketAgency, String str4, Image image, PurchaseVerificationType purchaseVerificationType, SparseArray<String> sparseArray) {
        C21100e.m49373x(str, "id");
        this.f23326b = str;
        C21100e.m49373x(serverId, "providerId");
        this.f23327c = serverId;
        C21100e.m49373x(str2, "name");
        this.f23328d = str2;
        this.f23329e = str3;
        C21100e.m49373x(currencyAmount, InAppPurchaseMetaData.KEY_PRICE);
        this.f23330f = currencyAmount;
        C21100e.m49373x(currencyAmount2, "fullPrice");
        this.f23331g = currencyAmount2;
        C21100e.m49375y(1, Integer.MAX_VALUE, "quantityLimit", i);
        this.f23332h = i;
        C21100e.m49373x(ticketAgency, "agency");
        this.f23333i = ticketAgency;
        this.f23334j = str4;
        this.f23335k = image;
        C21100e.m49373x(purchaseVerificationType, "purchaseVerificationType");
        this.f23336l = purchaseVerificationType;
        this.f23337m = sparseArray;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TicketFare ticketFare = (TicketFare) obj;
        if (!this.f23326b.equals(ticketFare.f23326b) || !C20975x0.m49118e(this.f23327c, ticketFare.f23327c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f23326b), C17884p.m44335F(this.f23327c));
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TicketFare{id='");
        C25541a.m63890u(k, this.f23326b, '\'', ", providerId=");
        k.append(this.f23327c);
        k.append(", name='");
        C25541a.m63890u(k, this.f23328d, '\'', ", description='");
        C25541a.m63890u(k, this.f23329e, '\'', ", price=");
        k.append(this.f23330f);
        k.append(", fullPrice=");
        k.append(this.f23331g);
        k.append(", quantityLimit=");
        k.append(this.f23332h);
        k.append(", agency=");
        k.append(this.f23333i);
        k.append('\'');
        k.append(", warningMessage='");
        C25541a.m63890u(k, this.f23334j, '\'', ", attributionImage=");
        k.append(this.f23335k);
        k.append(", purchaseVerificationType=");
        k.append(this.f23336l);
        k.append(", providerData=");
        k.append(this.f23337m);
        k.append('}');
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23325n);
    }
}
