package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import p277ub.C6803r;

public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new C3976a();

    /* renamed from: b */
    public final long f13990b;

    /* renamed from: c */
    public final long f13991c;

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand$a */
    public class C3976a implements Parcelable.Creator<TimeSignalCommand> {
        public final Object createFromParcel(Parcel parcel) {
            return new TimeSignalCommand(parcel.readLong(), parcel.readLong());
        }

        public final Object[] newArray(int i) {
            return new TimeSignalCommand[i];
        }
    }

    public TimeSignalCommand(long j, long j2) {
        this.f13990b = j;
        this.f13991c = j2;
    }

    /* renamed from: b */
    public static long m10660b(long j, C6803r rVar) {
        long p = (long) rVar.mo22997p();
        if ((128 & p) != 0) {
            return 8589934591L & ((((p & 1) << 32) | rVar.mo22998q()) + j);
        }
        return -9223372036854775807L;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f13990b);
        parcel.writeLong(this.f13991c);
    }
}
