package com.moovit.app.tod.shuttle.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.app.tod.model.TodDaysOfWeek;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/moovit/app/tod/shuttle/model/TodWeeklySubscriptionEnroll;", "Lcom/moovit/app/tod/shuttle/model/TodSubscriptionEnroll;", "App_moovitWorldRelease"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class TodWeeklySubscriptionEnroll extends TodSubscriptionEnroll {
    public static final Parcelable.Creator<TodWeeklySubscriptionEnroll> CREATOR = new C15566a();

    /* renamed from: c */
    public final String f40442c;

    /* renamed from: d */
    public final TodDaysOfWeek f40443d;

    /* renamed from: com.moovit.app.tod.shuttle.model.TodWeeklySubscriptionEnroll$a */
    public static final class C15566a implements Parcelable.Creator<TodWeeklySubscriptionEnroll> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            return new TodWeeklySubscriptionEnroll(parcel.readString(), TodDaysOfWeek.CREATOR.createFromParcel(parcel));
        }

        public final Object[] newArray(int i) {
            return new TodWeeklySubscriptionEnroll[i];
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TodWeeklySubscriptionEnroll(String str, TodDaysOfWeek todDaysOfWeek) {
        super(str);
        C24362h.m61211f(str, "id");
        C24362h.m61211f(todDaysOfWeek, "selectedDays");
        this.f40442c = str;
        this.f40443d = todDaysOfWeek;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TodWeeklySubscriptionEnroll)) {
            return false;
        }
        TodWeeklySubscriptionEnroll todWeeklySubscriptionEnroll = (TodWeeklySubscriptionEnroll) obj;
        if (C24362h.m61206a(this.f40442c, todWeeklySubscriptionEnroll.f40442c) && C24362h.m61206a(this.f40443d, todWeeklySubscriptionEnroll.f40443d)) {
            return true;
        }
        return false;
    }

    public final String getId() {
        return this.f40442c;
    }

    public final int hashCode() {
        return this.f40443d.hashCode() + (this.f40442c.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TodWeeklySubscriptionEnroll(id=");
        k.append(this.f40442c);
        k.append(", selectedDays=");
        k.append(this.f40443d);
        k.append(')');
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeString(this.f40442c);
        this.f40443d.writeToParcel(parcel, i);
    }
}
