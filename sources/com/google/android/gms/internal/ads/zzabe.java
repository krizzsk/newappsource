package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class zzabe implements zzbk {
    public static final Parcelable.Creator<zzabe> CREATOR = new zzabd();
    private static final zzad zzf;
    private static final zzad zzg;
    public final String zza;
    public final String zzb;
    public final long zzc;
    public final long zzd;
    public final byte[] zze;
    private int zzh;

    static {
        zzab zzab = new zzab();
        zzab.zzS("application/id3");
        zzf = zzab.zzY();
        zzab zzab2 = new zzab();
        zzab2.zzS("application/x-scte35");
        zzg = zzab2.zzY();
    }

    public zzabe(Parcel parcel) {
        String readString = parcel.readString();
        int i = zzeg.zza;
        this.zza = readString;
        this.zzb = parcel.readString();
        this.zzc = parcel.readLong();
        this.zzd = parcel.readLong();
        this.zze = (byte[]) zzeg.zzG(parcel.createByteArray());
    }

    public zzabe(String str, String str2, long j, long j2, byte[] bArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j;
        this.zzd = j2;
        this.zze = bArr;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzabe.class == obj.getClass()) {
            zzabe zzabe = (zzabe) obj;
            if (this.zzc != zzabe.zzc || this.zzd != zzabe.zzd || !zzeg.zzS(this.zza, zzabe.zza) || !zzeg.zzS(this.zzb, zzabe.zzb) || !Arrays.equals(this.zze, zzabe.zze)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = this.zzh;
        if (i2 != 0) {
            return i2;
        }
        String str = this.zza;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (i + 527) * 31;
        String str2 = this.zzb;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        long j = this.zzc;
        long j2 = this.zzd;
        int hashCode = ((((((i4 + i3) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + Arrays.hashCode(this.zze);
        this.zzh = hashCode;
        return hashCode;
    }

    public final String toString() {
        String str = this.zza;
        long j = this.zzd;
        long j2 = this.zzc;
        String str2 = this.zzb;
        return "EMSG: scheme=" + str + ", id=" + j + ", durationMs=" + j2 + ", value=" + str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeLong(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeByteArray(this.zze);
    }

    public final /* synthetic */ void zza(zzbf zzbf) {
    }
}
