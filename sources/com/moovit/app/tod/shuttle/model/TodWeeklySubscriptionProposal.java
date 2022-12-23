package com.moovit.app.tod.shuttle.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.app.tod.model.TodDaysOfWeek;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/moovit/app/tod/shuttle/model/TodWeeklySubscriptionProposal;", "Lcom/moovit/app/tod/shuttle/model/TodSubscriptionProposal;", "App_moovitWorldRelease"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class TodWeeklySubscriptionProposal extends TodSubscriptionProposal {
    public static final Parcelable.Creator<TodWeeklySubscriptionProposal> CREATOR = new C15567a();

    /* renamed from: c */
    public final String f40444c;

    /* renamed from: d */
    public final TodDaysOfWeek f40445d;

    /* renamed from: com.moovit.app.tod.shuttle.model.TodWeeklySubscriptionProposal$a */
    public static final class C15567a implements Parcelable.Creator<TodWeeklySubscriptionProposal> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            return new TodWeeklySubscriptionProposal(parcel.readString(), TodDaysOfWeek.CREATOR.createFromParcel(parcel));
        }

        public final Object[] newArray(int i) {
            return new TodWeeklySubscriptionProposal[i];
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TodWeeklySubscriptionProposal(String str, TodDaysOfWeek todDaysOfWeek) {
        super(str);
        C24362h.m61211f(str, "id");
        C24362h.m61211f(todDaysOfWeek, "availableDays");
        this.f40444c = str;
        this.f40445d = todDaysOfWeek;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TodWeeklySubscriptionProposal)) {
            return false;
        }
        TodWeeklySubscriptionProposal todWeeklySubscriptionProposal = (TodWeeklySubscriptionProposal) obj;
        if (C24362h.m61206a(this.f40444c, todWeeklySubscriptionProposal.f40444c) && C24362h.m61206a(this.f40445d, todWeeklySubscriptionProposal.f40445d)) {
            return true;
        }
        return false;
    }

    public final String getId() {
        return this.f40444c;
    }

    public final int hashCode() {
        return this.f40445d.hashCode() + (this.f40444c.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TodWeeklySubscriptionProposal(id=");
        k.append(this.f40444c);
        k.append(", availableDays=");
        k.append(this.f40445d);
        k.append(')');
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeString(this.f40444c);
        this.f40445d.writeToParcel(parcel, i);
    }
}
