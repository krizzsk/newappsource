package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p001a0.C0017h;

public final class zzabn extends zzacc {
    public static final Parcelable.Creator<zzabn> CREATOR = new zzabm();
    public final String zza;
    public final String zzb;
    public final int zzc;
    public final byte[] zzd;

    public zzabn(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i = zzeg.zza;
        this.zza = readString;
        this.zzb = parcel.readString();
        this.zzc = parcel.readInt();
        this.zzd = (byte[]) zzeg.zzG(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzabn.class == obj.getClass()) {
            zzabn zzabn = (zzabn) obj;
            if (this.zzc != zzabn.zzc || !zzeg.zzS(this.zza, zzabn.zza) || !zzeg.zzS(this.zzb, zzabn.zzb) || !Arrays.equals(this.zzd, zzabn.zzd)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = (this.zzc + 527) * 31;
        String str = this.zza;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (i2 + i) * 31;
        String str2 = this.zzb;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return Arrays.hashCode(this.zzd) + ((i4 + i3) * 31);
    }

    public final String toString() {
        return C0017h.m56M(this.zzf, ": mimeType=", this.zza, ", description=", this.zzb);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeByteArray(this.zzd);
    }

    public final void zza(zzbf zzbf) {
        zzbf.zza(this.zzd, this.zzc);
    }

    public zzabn(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = bArr;
    }
}
