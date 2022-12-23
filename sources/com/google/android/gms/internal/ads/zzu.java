package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;

public final class zzu implements Parcelable {
    public static final Parcelable.Creator<zzu> CREATOR = new zzt();
    public final UUID zza;
    public final String zzb;
    public final String zzc;
    public final byte[] zzd;
    private int zze;

    public zzu(Parcel parcel) {
        this.zza = new UUID(parcel.readLong(), parcel.readLong());
        this.zzb = parcel.readString();
        String readString = parcel.readString();
        int i = zzeg.zza;
        this.zzc = readString;
        this.zzd = parcel.createByteArray();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzu)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        zzu zzu = (zzu) obj;
        if (!zzeg.zzS(this.zzb, zzu.zzb) || !zzeg.zzS(this.zzc, zzu.zzc) || !zzeg.zzS(this.zza, zzu.zza) || !Arrays.equals(this.zzd, zzu.zzd)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2 = this.zze;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = this.zza.hashCode() * 31;
        String str = this.zzb;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int d = C13715c.m34238d(this.zzc, (hashCode + i) * 31, 31) + Arrays.hashCode(this.zzd);
        this.zze = d;
        return d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.zza.getMostSignificantBits());
        parcel.writeLong(this.zza.getLeastSignificantBits());
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeByteArray(this.zzd);
    }

    public zzu(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.zza = uuid;
        this.zzb = null;
        this.zzc = str2;
        this.zzd = bArr;
    }
}
