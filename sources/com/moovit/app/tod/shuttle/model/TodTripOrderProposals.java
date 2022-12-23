package com.moovit.app.tod.shuttle.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/moovit/app/tod/shuttle/model/TodTripOrderProposals;", "Landroid/os/Parcelable;", "App_moovitWorldRelease"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class TodTripOrderProposals implements Parcelable {
    public static final Parcelable.Creator<TodTripOrderProposals> CREATOR = new C15565a();

    /* renamed from: b */
    public final TodSubscriptionProposal f40441b;

    /* renamed from: com.moovit.app.tod.shuttle.model.TodTripOrderProposals$a */
    public static final class C15565a implements Parcelable.Creator<TodTripOrderProposals> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            return new TodTripOrderProposals((TodSubscriptionProposal) parcel.readParcelable(TodTripOrderProposals.class.getClassLoader()));
        }

        public final Object[] newArray(int i) {
            return new TodTripOrderProposals[i];
        }
    }

    public TodTripOrderProposals(TodSubscriptionProposal todSubscriptionProposal) {
        this.f40441b = todSubscriptionProposal;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TodTripOrderProposals) && C24362h.m61206a(this.f40441b, ((TodTripOrderProposals) obj).f40441b);
    }

    public final int hashCode() {
        TodSubscriptionProposal todSubscriptionProposal = this.f40441b;
        if (todSubscriptionProposal == null) {
            return 0;
        }
        return todSubscriptionProposal.hashCode();
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TodTripOrderProposals(subscriptionProposal=");
        k.append(this.f40441b);
        k.append(')');
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeParcelable(this.f40441b, i);
    }
}
