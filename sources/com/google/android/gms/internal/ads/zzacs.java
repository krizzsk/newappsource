package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

public final class zzacs implements zzbk {
    public static final Parcelable.Creator<zzacs> CREATOR = new zzacq();
    public final long zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;

    public zzacs(long j, long j2, long j3, long j4, long j5) {
        this.zza = j;
        this.zzb = j2;
        this.zzc = j3;
        this.zzd = j4;
        this.zze = j5;
    }

    public /* synthetic */ zzacs(Parcel parcel, zzacr zzacr) {
        this.zza = parcel.readLong();
        this.zzb = parcel.readLong();
        this.zzc = parcel.readLong();
        this.zzd = parcel.readLong();
        this.zze = parcel.readLong();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzacs.class == obj.getClass()) {
            zzacs zzacs = (zzacs) obj;
            return this.zza == zzacs.zza && this.zzb == zzacs.zzb && this.zzc == zzacs.zzc && this.zzd == zzacs.zzd && this.zze == zzacs.zze;
        }
    }

    public final int hashCode() {
        long j = this.zza;
        long j2 = this.zzb;
        long j3 = this.zzc;
        long j4 = this.zzd;
        long j5 = this.zze;
        return ((((((((((int) (j ^ (j >>> 32))) + 527) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31) + ((int) ((j4 >>> 32) ^ j4))) * 31) + ((int) ((j5 >>> 32) ^ j5));
    }

    public final String toString() {
        long j = this.zza;
        long j2 = this.zzb;
        long j3 = this.zzc;
        long j4 = this.zzd;
        long j5 = this.zze;
        StringBuilder g = C16759e.m42351g("Motion photo metadata: photoStartPosition=", j, ", photoSize=");
        g.append(j2);
        g.append(", photoPresentationTimestampUs=");
        g.append(j3);
        g.append(", videoStartPosition=");
        g.append(j4);
        g.append(", videoSize=");
        g.append(j5);
        return g.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.zza);
        parcel.writeLong(this.zzb);
        parcel.writeLong(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeLong(this.zze);
    }

    public final /* synthetic */ void zza(zzbf zzbf) {
    }
}
