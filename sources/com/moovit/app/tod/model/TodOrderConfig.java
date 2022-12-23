package com.moovit.app.tod.model;

import android.os.Parcel;
import android.os.Parcelable;
import c00.C13717b;
import com.moovit.network.model.ServerId;
import java.util.Map;
import p241s0.C6302b;

public class TodOrderConfig implements Parcelable {
    public static final Parcelable.Creator<TodOrderConfig> CREATOR = new C15507a();

    /* renamed from: b */
    public final Map<ServerId, Integer> f40256b;

    /* renamed from: c */
    public final int f40257c;

    /* renamed from: d */
    public final int f40258d;

    /* renamed from: com.moovit.app.tod.model.TodOrderConfig$a */
    public class C15507a implements Parcelable.Creator<TodOrderConfig> {
        public final Object createFromParcel(Parcel parcel) {
            return new TodOrderConfig(parcel);
        }

        public final Object[] newArray(int i) {
            return new TodOrderConfig[i];
        }
    }

    public TodOrderConfig(Map<ServerId, Integer> map, int i, int i2) {
        this.f40256b = map;
        this.f40257c = i;
        this.f40258d = i2;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TodOrderConfig{orderProfiles=");
        k.append(C13717b.m34270q(this.f40256b));
        k.append(", numberOfPassengers=");
        k.append(this.f40257c);
        k.append(", numberOfAccessiblePassengers=");
        return C16530d.m42014g(k, this.f40258d, '}');
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f40256b.size());
        parcel.writeMap(this.f40256b);
        parcel.writeInt(this.f40257c);
        parcel.writeInt(this.f40258d);
    }

    public TodOrderConfig(Parcel parcel) {
        C6302b bVar = new C6302b(parcel.readInt());
        this.f40256b = bVar;
        parcel.readMap(bVar, ServerId.class.getClassLoader());
        this.f40257c = parcel.readInt();
        this.f40258d = parcel.readInt();
    }
}
