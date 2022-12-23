package com.moovit.app.tod.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/moovit/app/tod/model/TodWeeklyShuttleSubscription;", "Lcom/moovit/app/tod/model/TodSubscription;", "App_moovitWorldRelease"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class TodWeeklyShuttleSubscription extends TodSubscription {
    public static final Parcelable.Creator<TodWeeklyShuttleSubscription> CREATOR = new C15523a();

    /* renamed from: c */
    public final String f40328c;

    /* renamed from: d */
    public final TodDaysOfWeek f40329d;

    /* renamed from: e */
    public final TodSubscriptionShuttleInfo f40330e;

    /* renamed from: com.moovit.app.tod.model.TodWeeklyShuttleSubscription$a */
    public static final class C15523a implements Parcelable.Creator<TodWeeklyShuttleSubscription> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            return new TodWeeklyShuttleSubscription(parcel.readString(), TodDaysOfWeek.CREATOR.createFromParcel(parcel), TodSubscriptionShuttleInfo.CREATOR.createFromParcel(parcel));
        }

        public final Object[] newArray(int i) {
            return new TodWeeklyShuttleSubscription[i];
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TodWeeklyShuttleSubscription(String str, TodDaysOfWeek todDaysOfWeek, TodSubscriptionShuttleInfo todSubscriptionShuttleInfo) {
        super(str);
        C24362h.m61211f(str, "id");
        C24362h.m61211f(todDaysOfWeek, "enrolledDays");
        C24362h.m61211f(todSubscriptionShuttleInfo, "shuttleInfo");
        this.f40328c = str;
        this.f40329d = todDaysOfWeek;
        this.f40330e = todSubscriptionShuttleInfo;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TodWeeklyShuttleSubscription)) {
            return false;
        }
        TodWeeklyShuttleSubscription todWeeklyShuttleSubscription = (TodWeeklyShuttleSubscription) obj;
        if (C24362h.m61206a(this.f40328c, todWeeklyShuttleSubscription.f40328c) && C24362h.m61206a(this.f40329d, todWeeklyShuttleSubscription.f40329d) && C24362h.m61206a(this.f40330e, todWeeklyShuttleSubscription.f40330e)) {
            return true;
        }
        return false;
    }

    public final String getId() {
        return this.f40328c;
    }

    public final int hashCode() {
        int hashCode = this.f40329d.hashCode();
        return this.f40330e.hashCode() + ((hashCode + (this.f40328c.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TodWeeklyShuttleSubscription(id=");
        k.append(this.f40328c);
        k.append(", enrolledDays=");
        k.append(this.f40329d);
        k.append(", shuttleInfo=");
        k.append(this.f40330e);
        k.append(')');
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeString(this.f40328c);
        this.f40329d.writeToParcel(parcel, i);
        this.f40330e.writeToParcel(parcel, i);
    }
}
