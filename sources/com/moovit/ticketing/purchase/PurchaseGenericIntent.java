package com.moovit.ticketing.purchase;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import c70.C13749c;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.location.C16202a;
import com.moovit.ticketing.purchase.PurchaseIntent;
import com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseGenericIntent;
import com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseIntent;
import p810sz.C19617r;
import q80.C13020i;
import q80.C13036y;

public class PurchaseGenericIntent implements PurchaseIntent {
    public static final Parcelable.Creator<PurchaseGenericIntent> CREATOR = new C7643a();

    /* renamed from: com.moovit.ticketing.purchase.PurchaseGenericIntent$a */
    public class C7643a implements Parcelable.Creator<PurchaseGenericIntent> {
        public final Object createFromParcel(Parcel parcel) {
            return new PurchaseGenericIntent();
        }

        public final Object[] newArray(int i) {
            return new PurchaseGenericIntent[i];
        }
    }

    /* renamed from: H1 */
    public final MVPurchaseIntent mo23996H1(PurchaseIntent.C7644a aVar) {
        Context context = ((C13020i) aVar).f51759b;
        C19617r rVar = C13036y.f32248a;
        MVPurchaseGenericIntent mVPurchaseGenericIntent = new MVPurchaseGenericIntent();
        LatLonE6 j = LatLonE6.m40177j(C16202a.get(context).getHighAccuracyFrequentUpdates().mo50014i());
        if (j != null) {
            mVPurchaseGenericIntent.location = C13749c.m34332r(j);
        }
        MVPurchaseIntent mVPurchaseIntent = new MVPurchaseIntent();
        mVPurchaseIntent.setField_ = MVPurchaseIntent._Fields.GENERIC;
        mVPurchaseIntent.value_ = mVPurchaseGenericIntent;
        return mVPurchaseIntent;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
    }
}
