package com.moovit.payment.account.actions.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/moovit/payment/account/actions/model/DeepLinkActionIntent;", "Lcom/moovit/payment/account/actions/model/AccountActionIntent;", "Payment_release"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class DeepLinkActionIntent extends AccountActionIntent {
    public static final Parcelable.Creator<DeepLinkActionIntent> CREATOR = new C25616a();

    /* renamed from: b */
    public final Uri f63873b;

    /* renamed from: com.moovit.payment.account.actions.model.DeepLinkActionIntent$a */
    public static final class C25616a implements Parcelable.Creator<DeepLinkActionIntent> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            return new DeepLinkActionIntent((Uri) parcel.readParcelable(DeepLinkActionIntent.class.getClassLoader()));
        }

        public final Object[] newArray(int i) {
            return new DeepLinkActionIntent[i];
        }
    }

    public DeepLinkActionIntent(Uri uri) {
        C24362h.m61211f(uri, "uri");
        this.f63873b = uri;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeParcelable(this.f63873b, i);
    }
}
