package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicLong;

public class Counter implements Parcelable {
    public static final Parcelable.Creator<Counter> CREATOR = new C14479a();

    /* renamed from: b */
    public final String f36635b;

    /* renamed from: c */
    public final AtomicLong f36636c;

    /* renamed from: com.google.firebase.perf.metrics.Counter$a */
    public class C14479a implements Parcelable.Creator<Counter> {
        public final Object createFromParcel(Parcel parcel) {
            return new Counter(parcel);
        }

        public final Object[] newArray(int i) {
            return new Counter[i];
        }
    }

    public Counter(String str) {
        this.f36635b = str;
        this.f36636c = new AtomicLong(0);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f36635b);
        parcel.writeLong(this.f36636c.get());
    }

    public Counter(Parcel parcel) {
        this.f36635b = parcel.readString();
        this.f36636c = new AtomicLong(parcel.readLong());
    }
}
