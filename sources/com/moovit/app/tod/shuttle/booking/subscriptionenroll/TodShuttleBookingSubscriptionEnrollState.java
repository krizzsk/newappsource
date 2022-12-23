package com.moovit.app.tod.shuttle.booking.subscriptionenroll;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.app.tod.shuttle.booking.TodShuttleBookingInfo;
import com.moovit.app.tod.shuttle.model.TodSubscriptionEnroll;
import com.moovit.app.tod.shuttle.model.TodTripOrder;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/moovit/app/tod/shuttle/booking/subscriptionenroll/TodShuttleBookingSubscriptionEnrollState;", "Landroid/os/Parcelable;", "App_moovitWorldRelease"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class TodShuttleBookingSubscriptionEnrollState implements Parcelable {
    public static final Parcelable.Creator<TodShuttleBookingSubscriptionEnrollState> CREATOR = new C15553a();

    /* renamed from: b */
    public final TodShuttleBookingInfo f40414b;

    /* renamed from: c */
    public final TodTripOrder f40415c;

    /* renamed from: d */
    public final TodSubscriptionEnroll f40416d;

    /* renamed from: com.moovit.app.tod.shuttle.booking.subscriptionenroll.TodShuttleBookingSubscriptionEnrollState$a */
    public static final class C15553a implements Parcelable.Creator<TodShuttleBookingSubscriptionEnrollState> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            return new TodShuttleBookingSubscriptionEnrollState((TodShuttleBookingInfo) parcel.readParcelable(TodShuttleBookingSubscriptionEnrollState.class.getClassLoader()), (TodTripOrder) parcel.readParcelable(TodShuttleBookingSubscriptionEnrollState.class.getClassLoader()), (TodSubscriptionEnroll) parcel.readParcelable(TodShuttleBookingSubscriptionEnrollState.class.getClassLoader()));
        }

        public final Object[] newArray(int i) {
            return new TodShuttleBookingSubscriptionEnrollState[i];
        }
    }

    public TodShuttleBookingSubscriptionEnrollState(TodShuttleBookingInfo todShuttleBookingInfo, TodTripOrder todTripOrder, TodSubscriptionEnroll todSubscriptionEnroll) {
        C24362h.m61211f(todShuttleBookingInfo, "bookingInfo");
        C24362h.m61211f(todTripOrder, "tripOrder");
        this.f40414b = todShuttleBookingInfo;
        this.f40415c = todTripOrder;
        this.f40416d = todSubscriptionEnroll;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeParcelable(this.f40414b, i);
        parcel.writeParcelable(this.f40415c, i);
        parcel.writeParcelable(this.f40416d, i);
    }
}
