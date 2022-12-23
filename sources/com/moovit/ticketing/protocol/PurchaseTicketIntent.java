package com.moovit.ticketing.protocol;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.ticketing.purchase.PurchaseIntent;
import com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseIntent;
import com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketIntent;
import p810sz.C19617r;
import q80.C13020i;
import q80.C13036y;

public class PurchaseTicketIntent implements PurchaseIntent {
    public static final Parcelable.Creator<PurchaseTicketIntent> CREATOR = new C7642a();

    /* renamed from: b */
    public final String f23245b;

    /* renamed from: com.moovit.ticketing.protocol.PurchaseTicketIntent$a */
    public class C7642a implements Parcelable.Creator<PurchaseTicketIntent> {
        public final Object createFromParcel(Parcel parcel) {
            return new PurchaseTicketIntent(parcel);
        }

        public final Object[] newArray(int i) {
            return new PurchaseTicketIntent[i];
        }
    }

    public PurchaseTicketIntent(String str) {
        this.f23245b = str;
    }

    /* renamed from: H1 */
    public final MVPurchaseIntent mo23996H1(PurchaseIntent.C7644a aVar) {
        ((C13020i) aVar).getClass();
        C19617r rVar = C13036y.f32248a;
        MVPurchaseTicketIntent mVPurchaseTicketIntent = new MVPurchaseTicketIntent();
        String str = this.f23245b;
        if (str != null) {
            mVPurchaseTicketIntent.agencyKey = str;
        }
        MVPurchaseIntent mVPurchaseIntent = new MVPurchaseIntent();
        mVPurchaseIntent.setField_ = MVPurchaseIntent._Fields.TICKET_VALUE;
        mVPurchaseIntent.value_ = mVPurchaseTicketIntent;
        return mVPurchaseIntent;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f23245b);
    }

    public PurchaseTicketIntent(Parcel parcel) {
        this.f23245b = parcel.readString();
    }
}
