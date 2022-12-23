package com.moovit.app.tod.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.transit.LocationDescriptor;
import com.moovit.util.time.DayTime;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/moovit/app/tod/model/TodSubscriptionJourneyInfo;", "Landroid/os/Parcelable;", "App_moovitWorldRelease"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class TodSubscriptionJourneyInfo implements Parcelable {
    public static final Parcelable.Creator<TodSubscriptionJourneyInfo> CREATOR = new C15520a();

    /* renamed from: b */
    public final LocationDescriptor f40316b;

    /* renamed from: c */
    public final DayTime f40317c;

    /* renamed from: d */
    public final LocationDescriptor f40318d;

    /* renamed from: e */
    public final DayTime f40319e;

    /* renamed from: com.moovit.app.tod.model.TodSubscriptionJourneyInfo$a */
    public static final class C15520a implements Parcelable.Creator<TodSubscriptionJourneyInfo> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            return new TodSubscriptionJourneyInfo((LocationDescriptor) parcel.readParcelable(TodSubscriptionJourneyInfo.class.getClassLoader()), (DayTime) parcel.readParcelable(TodSubscriptionJourneyInfo.class.getClassLoader()), (LocationDescriptor) parcel.readParcelable(TodSubscriptionJourneyInfo.class.getClassLoader()), (DayTime) parcel.readParcelable(TodSubscriptionJourneyInfo.class.getClassLoader()));
        }

        public final Object[] newArray(int i) {
            return new TodSubscriptionJourneyInfo[i];
        }
    }

    public TodSubscriptionJourneyInfo(LocationDescriptor locationDescriptor, DayTime dayTime, LocationDescriptor locationDescriptor2, DayTime dayTime2) {
        C24362h.m61211f(locationDescriptor, "pickup");
        C24362h.m61211f(locationDescriptor2, "dropOff");
        this.f40316b = locationDescriptor;
        this.f40317c = dayTime;
        this.f40318d = locationDescriptor2;
        this.f40319e = dayTime2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TodSubscriptionJourneyInfo)) {
            return false;
        }
        TodSubscriptionJourneyInfo todSubscriptionJourneyInfo = (TodSubscriptionJourneyInfo) obj;
        return C24362h.m61206a(this.f40316b, todSubscriptionJourneyInfo.f40316b) && C24362h.m61206a(this.f40317c, todSubscriptionJourneyInfo.f40317c) && C24362h.m61206a(this.f40318d, todSubscriptionJourneyInfo.f40318d) && C24362h.m61206a(this.f40319e, todSubscriptionJourneyInfo.f40319e);
    }

    public final int hashCode() {
        int hashCode = this.f40316b.hashCode() * 31;
        DayTime dayTime = this.f40317c;
        int i = 0;
        int hashCode2 = (this.f40318d.hashCode() + ((hashCode + (dayTime == null ? 0 : dayTime.hashCode())) * 31)) * 31;
        DayTime dayTime2 = this.f40319e;
        if (dayTime2 != null) {
            i = dayTime2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TodSubscriptionJourneyInfo(pickup=");
        k.append(this.f40316b);
        k.append(", pickupDayTime=");
        k.append(this.f40317c);
        k.append(", dropOff=");
        k.append(this.f40318d);
        k.append(", dropOffDayTime=");
        k.append(this.f40319e);
        k.append(')');
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeParcelable(this.f40316b, i);
        parcel.writeParcelable(this.f40317c, i);
        parcel.writeParcelable(this.f40318d, i);
        parcel.writeParcelable(this.f40319e, i);
    }
}
