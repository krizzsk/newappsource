package com.google.firebase.perf.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.TimeUnit;

public class Timer implements Parcelable {
    public static final Parcelable.Creator<Timer> CREATOR = new C14488a();

    /* renamed from: b */
    public long f36654b;

    /* renamed from: c */
    public long f36655c;

    /* renamed from: com.google.firebase.perf.util.Timer$a */
    public class C14488a implements Parcelable.Creator<Timer> {
        public final Object createFromParcel(Parcel parcel) {
            return new Timer(parcel);
        }

        public final Object[] newArray(int i) {
            return new Timer[i];
        }
    }

    public Timer() {
        this.f36654b = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        this.f36655c = System.nanoTime();
    }

    /* renamed from: b */
    public final long mo43519b() {
        return TimeUnit.NANOSECONDS.toMicros(System.nanoTime() - this.f36655c);
    }

    /* renamed from: c */
    public final long mo43520c(Timer timer) {
        return TimeUnit.NANOSECONDS.toMicros(timer.f36655c - this.f36655c);
    }

    /* renamed from: d */
    public final long mo43521d() {
        return this.f36654b;
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: f */
    public final void mo43523f() {
        this.f36654b = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        this.f36655c = System.nanoTime();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f36654b);
        parcel.writeLong(this.f36655c);
    }

    @VisibleForTesting
    public Timer(long j) {
        this.f36654b = j;
        this.f36655c = TimeUnit.MICROSECONDS.toNanos(j);
    }

    public Timer(Parcel parcel) {
        this.f36654b = parcel.readLong();
        this.f36655c = parcel.readLong();
    }
}
