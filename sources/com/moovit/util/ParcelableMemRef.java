package com.moovit.util;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import java.util.UUID;
import p241s0.C6302b;
import p988j$.util.DesugarCollections;

@SuppressLint({"UseSparseArrays"})
public class ParcelableMemRef<T> implements Parcelable {
    public static final Parcelable.Creator<ParcelableMemRef<?>> CREATOR = new C7891a();

    /* renamed from: d */
    public static final Map<String, Object> f23861d = DesugarCollections.synchronizedMap(new C6302b());

    /* renamed from: b */
    public final String f23862b;

    /* renamed from: c */
    public T f23863c;

    /* renamed from: com.moovit.util.ParcelableMemRef$a */
    public class C7891a implements Parcelable.Creator<ParcelableMemRef<?>> {
        public final Object createFromParcel(Parcel parcel) {
            return new ParcelableMemRef(parcel);
        }

        public final Object[] newArray(int i) {
            return new ParcelableMemRef[i];
        }
    }

    public ParcelableMemRef(T t) {
        this.f23862b = UUID.randomUUID().toString();
        this.f23863c = t;
    }

    /* renamed from: b */
    public final T mo24562b() {
        if (this.f23863c == null) {
            this.f23863c = f23861d.remove(this.f23862b);
        }
        return this.f23863c;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        f23861d.put(this.f23862b, this.f23863c);
        parcel.writeString(this.f23862b);
    }

    public ParcelableMemRef(Parcel parcel) {
        this.f23862b = parcel.readString();
        this.f23863c = null;
    }
}
