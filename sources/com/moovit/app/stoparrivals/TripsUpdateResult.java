package com.moovit.app.stoparrivals;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitPatternShape;
import com.moovit.transit.TransitStop;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/moovit/app/stoparrivals/TripsUpdateResult;", "Landroid/os/Parcelable;", "App_moovitWorldRelease"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class TripsUpdateResult implements Parcelable {
    public static final Parcelable.Creator<TripsUpdateResult> CREATOR = new C15321a();

    /* renamed from: b */
    public final TransitStop f39627b;

    /* renamed from: c */
    public final List<StopArrival> f39628c;

    /* renamed from: d */
    public final Map<ServerId, TransitPatternShape> f39629d;

    /* renamed from: e */
    public final Map<String, Integer> f39630e;

    /* renamed from: com.moovit.app.stoparrivals.TripsUpdateResult$a */
    public static final class C15321a implements Parcelable.Creator<TripsUpdateResult> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            TransitStop transitStop = (TransitStop) parcel.readParcelable(TripsUpdateResult.class.getClassLoader());
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(StopArrival.CREATOR.createFromParcel(parcel));
            }
            int readInt2 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                linkedHashMap.put(parcel.readParcelable(TripsUpdateResult.class.getClassLoader()), parcel.readParcelable(TripsUpdateResult.class.getClassLoader()));
            }
            int readInt3 = parcel.readInt();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt3);
            for (int i3 = 0; i3 != readInt3; i3++) {
                linkedHashMap2.put(parcel.readString(), Integer.valueOf(parcel.readInt()));
            }
            return new TripsUpdateResult(transitStop, arrayList, linkedHashMap, linkedHashMap2);
        }

        public final Object[] newArray(int i) {
            return new TripsUpdateResult[i];
        }
    }

    public TripsUpdateResult(TransitStop transitStop, List list, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        C24362h.m61211f(transitStop, "stop");
        C24362h.m61211f(list, "stopArrivals");
        this.f39627b = transitStop;
        this.f39628c = list;
        this.f39629d = linkedHashMap;
        this.f39630e = linkedHashMap2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TripsUpdateResult)) {
            return false;
        }
        TripsUpdateResult tripsUpdateResult = (TripsUpdateResult) obj;
        return C24362h.m61206a(this.f39627b, tripsUpdateResult.f39627b) && C24362h.m61206a(this.f39628c, tripsUpdateResult.f39628c) && C24362h.m61206a(this.f39629d, tripsUpdateResult.f39629d) && C24362h.m61206a(this.f39630e, tripsUpdateResult.f39630e);
    }

    public final int hashCode() {
        int hashCode = this.f39628c.hashCode();
        int hashCode2 = this.f39629d.hashCode();
        return this.f39630e.hashCode() + ((hashCode2 + ((hashCode + (this.f39627b.f23730b.f15142b * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TripsUpdateResult(stop=");
        k.append(this.f39627b);
        k.append(", stopArrivals=");
        k.append(this.f39628c);
        k.append(", shapeIdToSegments=");
        k.append(this.f39629d);
        k.append(", vehicleIdToPosition=");
        k.append(this.f39630e);
        k.append(')');
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeParcelable(this.f39627b, i);
        List<StopArrival> list = this.f39628c;
        parcel.writeInt(list.size());
        for (StopArrival writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        Map<ServerId, TransitPatternShape> map = this.f39629d;
        parcel.writeInt(map.size());
        for (Map.Entry next : map.entrySet()) {
            parcel.writeParcelable((Parcelable) next.getKey(), i);
            parcel.writeParcelable((Parcelable) next.getValue(), i);
        }
        Map<String, Integer> map2 = this.f39630e;
        parcel.writeInt(map2.size());
        for (Map.Entry next2 : map2.entrySet()) {
            parcel.writeString((String) next2.getKey());
            parcel.writeInt(((Number) next2.getValue()).intValue());
        }
    }
}
