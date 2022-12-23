package com.moovit.ticketing.purchase.storedvalue;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.network.model.ServerId;
import com.moovit.ticketing.purchase.PurchaseIntent;
import com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseIntent;
import com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseStoredValueAutoLoadIntent;
import p810sz.C19617r;
import q80.C13020i;
import q80.C13036y;

public class PurchaseStoredValueAutoLoadIntent implements PurchaseIntent {
    public static final Parcelable.Creator<PurchaseStoredValueAutoLoadIntent> CREATOR = new C7724a();

    /* renamed from: b */
    public final ServerId f23434b;

    /* renamed from: c */
    public final String f23435c;

    /* renamed from: com.moovit.ticketing.purchase.storedvalue.PurchaseStoredValueAutoLoadIntent$a */
    public class C7724a implements Parcelable.Creator<PurchaseStoredValueAutoLoadIntent> {
        public final Object createFromParcel(Parcel parcel) {
            return new PurchaseStoredValueAutoLoadIntent((ServerId) parcel.readParcelable(ServerId.class.getClassLoader()), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new PurchaseStoredValueAutoLoadIntent[i];
        }
    }

    public PurchaseStoredValueAutoLoadIntent(ServerId serverId, String str) {
        C21100e.m49373x(serverId, "providerId");
        this.f23434b = serverId;
        C21100e.m49373x(str, "agencyKey");
        this.f23435c = str;
    }

    /* renamed from: H1 */
    public final MVPurchaseIntent mo23996H1(PurchaseIntent.C7644a aVar) {
        ((C13020i) aVar).getClass();
        C19617r rVar = C13036y.f32248a;
        MVPurchaseStoredValueAutoLoadIntent mVPurchaseStoredValueAutoLoadIntent = new MVPurchaseStoredValueAutoLoadIntent();
        mVPurchaseStoredValueAutoLoadIntent.providerId = this.f23434b.f15142b;
        mVPurchaseStoredValueAutoLoadIntent.mo32772h();
        mVPurchaseStoredValueAutoLoadIntent.agencyKey = this.f23435c;
        MVPurchaseIntent mVPurchaseIntent = new MVPurchaseIntent();
        mVPurchaseIntent.setField_ = MVPurchaseIntent._Fields.AUTO_LOAD_INTENT;
        mVPurchaseIntent.value_ = mVPurchaseStoredValueAutoLoadIntent;
        return mVPurchaseIntent;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f23434b, i);
        parcel.writeString(this.f23435c);
    }
}
