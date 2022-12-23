package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import p277ub.C6774a0;

public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator<PrivateCommand> CREATOR = new C3969a();

    /* renamed from: b */
    public final long f13957b;

    /* renamed from: c */
    public final long f13958c;

    /* renamed from: d */
    public final byte[] f13959d;

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.PrivateCommand$a */
    public class C3969a implements Parcelable.Creator<PrivateCommand> {
        public final Object createFromParcel(Parcel parcel) {
            return new PrivateCommand(parcel);
        }

        public final Object[] newArray(int i) {
            return new PrivateCommand[i];
        }
    }

    public PrivateCommand(long j, byte[] bArr, long j2) {
        this.f13957b = j2;
        this.f13958c = j;
        this.f13959d = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f13957b);
        parcel.writeLong(this.f13958c);
        parcel.writeByteArray(this.f13959d);
    }

    public PrivateCommand(Parcel parcel) {
        this.f13957b = parcel.readLong();
        this.f13958c = parcel.readLong();
        byte[] createByteArray = parcel.createByteArray();
        int i = C6774a0.f20959a;
        this.f13959d = createByteArray;
    }
}
