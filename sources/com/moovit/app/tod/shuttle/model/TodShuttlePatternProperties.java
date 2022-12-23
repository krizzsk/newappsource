package com.moovit.app.tod.shuttle.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.commons.geo.Polygon;
import com.moovit.commons.utils.Color;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/moovit/app/tod/shuttle/model/TodShuttlePatternProperties;", "Landroid/os/Parcelable;", "App_moovitWorldRelease"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class TodShuttlePatternProperties implements Parcelable {
    public static final Parcelable.Creator<TodShuttlePatternProperties> CREATOR = new C15556a();

    /* renamed from: b */
    public final Color f40422b;

    /* renamed from: c */
    public final Polygon f40423c;

    /* renamed from: com.moovit.app.tod.shuttle.model.TodShuttlePatternProperties$a */
    public static final class C15556a implements Parcelable.Creator<TodShuttlePatternProperties> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            return new TodShuttlePatternProperties((Color) parcel.readParcelable(TodShuttlePatternProperties.class.getClassLoader()), (Polygon) parcel.readParcelable(TodShuttlePatternProperties.class.getClassLoader()));
        }

        public final Object[] newArray(int i) {
            return new TodShuttlePatternProperties[i];
        }
    }

    public TodShuttlePatternProperties(Color color, Polygon polygon) {
        C24362h.m61211f(color, "primaryColor");
        C24362h.m61211f(polygon, "polygon");
        this.f40422b = color;
        this.f40423c = polygon;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TodShuttlePatternProperties)) {
            return false;
        }
        TodShuttlePatternProperties todShuttlePatternProperties = (TodShuttlePatternProperties) obj;
        return C24362h.m61206a(this.f40422b, todShuttlePatternProperties.f40422b) && C24362h.m61206a(this.f40423c, todShuttlePatternProperties.f40423c);
    }

    public final int hashCode() {
        return this.f40423c.hashCode() + (this.f40422b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TodShuttlePatternProperties(primaryColor=");
        k.append(this.f40422b);
        k.append(", polygon=");
        k.append(this.f40423c);
        k.append(')');
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeParcelable(this.f40422b, i);
        parcel.writeParcelable(this.f40423c, i);
    }
}
