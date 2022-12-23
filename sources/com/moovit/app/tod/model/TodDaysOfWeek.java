package com.moovit.app.tod.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import mf0.C24362h;
import p988j$.time.DayOfWeek;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/moovit/app/tod/model/TodDaysOfWeek;", "Landroid/os/Parcelable;", "App_moovitWorldRelease"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class TodDaysOfWeek implements Parcelable {
    public static final Parcelable.Creator<TodDaysOfWeek> CREATOR = new C15503a();

    /* renamed from: b */
    public final Set<DayOfWeek> f40238b;

    /* renamed from: com.moovit.app.tod.model.TodDaysOfWeek$a */
    public static final class C15503a implements Parcelable.Creator<TodDaysOfWeek> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            int readInt = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
            for (int i = 0; i != readInt; i++) {
                linkedHashSet.add(DayOfWeek.valueOf(parcel.readString()));
            }
            return new TodDaysOfWeek(linkedHashSet);
        }

        public final Object[] newArray(int i) {
            return new TodDaysOfWeek[i];
        }
    }

    public TodDaysOfWeek(Set<? extends DayOfWeek> set) {
        C24362h.m61211f(set, "includedDays");
        this.f40238b = set;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TodDaysOfWeek) && C24362h.m61206a(this.f40238b, ((TodDaysOfWeek) obj).f40238b);
    }

    public final int hashCode() {
        return this.f40238b.hashCode();
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TodDaysOfWeek(includedDays=");
        k.append(this.f40238b);
        k.append(')');
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        Set<DayOfWeek> set = this.f40238b;
        parcel.writeInt(set.size());
        for (DayOfWeek name : set) {
            parcel.writeString(name.name());
        }
    }
}
