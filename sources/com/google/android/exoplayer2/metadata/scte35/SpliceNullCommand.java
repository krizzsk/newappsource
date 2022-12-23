package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;

public final class SpliceNullCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceNullCommand> CREATOR = new C3972a();

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceNullCommand$a */
    public class C3972a implements Parcelable.Creator<SpliceNullCommand> {
        public final Object createFromParcel(Parcel parcel) {
            return new SpliceNullCommand();
        }

        public final Object[] newArray(int i) {
            return new SpliceNullCommand[i];
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
    }
}
