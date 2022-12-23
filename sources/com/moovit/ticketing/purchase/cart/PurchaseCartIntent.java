package com.moovit.ticketing.purchase.cart;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.ticketing.purchase.PurchaseIntent;
import com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseCartIntent;
import com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseIntent;
import p810sz.C19617r;
import q80.C13020i;
import q80.C13036y;

public class PurchaseCartIntent implements PurchaseIntent {
    public static final Parcelable.Creator<PurchaseCartIntent> CREATOR = new C7654a();

    /* renamed from: b */
    public final String f23276b;

    /* renamed from: com.moovit.ticketing.purchase.cart.PurchaseCartIntent$a */
    public class C7654a implements Parcelable.Creator<PurchaseCartIntent> {
        public final Object createFromParcel(Parcel parcel) {
            return new PurchaseCartIntent(parcel);
        }

        public final Object[] newArray(int i) {
            return new PurchaseCartIntent[i];
        }
    }

    public PurchaseCartIntent(String str) {
        C21100e.m49373x(str, "cartContextId");
        this.f23276b = str;
    }

    /* renamed from: H1 */
    public final MVPurchaseIntent mo23996H1(PurchaseIntent.C7644a aVar) {
        ((C13020i) aVar).getClass();
        C19617r rVar = C13036y.f32248a;
        String str = this.f23276b;
        MVPurchaseCartIntent mVPurchaseCartIntent = new MVPurchaseCartIntent();
        mVPurchaseCartIntent.cartContextId = str;
        MVPurchaseIntent mVPurchaseIntent = new MVPurchaseIntent();
        mVPurchaseIntent.setField_ = MVPurchaseIntent._Fields.CART;
        mVPurchaseIntent.value_ = mVPurchaseCartIntent;
        return mVPurchaseIntent;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f23276b);
    }

    public PurchaseCartIntent(Parcel parcel) {
        String readString = parcel.readString();
        C21100e.m49373x(readString, "cartContextId");
        this.f23276b = readString;
    }
}
