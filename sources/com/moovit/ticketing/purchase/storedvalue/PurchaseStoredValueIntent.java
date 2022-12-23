package com.moovit.ticketing.purchase.storedvalue;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.ticketing.purchase.PurchaseIntent;
import com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseIntent;
import com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseStoredValueIntent;
import p810sz.C19617r;
import q80.C13020i;
import q80.C13036y;

public class PurchaseStoredValueIntent implements PurchaseIntent {
    public static final Parcelable.Creator<PurchaseStoredValueIntent> CREATOR = new C7725a();

    /* renamed from: b */
    public final String f23437b;

    /* renamed from: com.moovit.ticketing.purchase.storedvalue.PurchaseStoredValueIntent$a */
    public class C7725a implements Parcelable.Creator<PurchaseStoredValueIntent> {
        public final Object createFromParcel(Parcel parcel) {
            return new PurchaseStoredValueIntent(parcel);
        }

        public final Object[] newArray(int i) {
            return new PurchaseStoredValueIntent[i];
        }
    }

    public PurchaseStoredValueIntent(String str) {
        this.f23437b = str;
    }

    /* renamed from: H1 */
    public final MVPurchaseIntent mo23996H1(PurchaseIntent.C7644a aVar) {
        ((C13020i) aVar).getClass();
        C19617r rVar = C13036y.f32248a;
        MVPurchaseStoredValueIntent mVPurchaseStoredValueIntent = new MVPurchaseStoredValueIntent();
        String str = this.f23437b;
        if (str != null) {
            mVPurchaseStoredValueIntent.agencyKey = str;
        }
        MVPurchaseIntent mVPurchaseIntent = new MVPurchaseIntent();
        mVPurchaseIntent.setField_ = MVPurchaseIntent._Fields.STORED_VALUE;
        mVPurchaseIntent.value_ = mVPurchaseStoredValueIntent;
        return mVPurchaseIntent;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f23437b);
    }

    public PurchaseStoredValueIntent(Parcel parcel) {
        this.f23437b = parcel.readString();
    }
}
