package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class zzacg extends zzacc {
    public static final Parcelable.Creator<zzacg> CREATOR = new zzacf();
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int[] zzd;
    public final int[] zze;

    public zzacg(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = iArr;
        this.zze = iArr2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzacg.class == obj.getClass()) {
            zzacg zzacg = (zzacg) obj;
            if (this.zza == zzacg.zza && this.zzb == zzacg.zzb && this.zzc == zzacg.zzc && Arrays.equals(this.zzd, zzacg.zzd) && Arrays.equals(this.zze, zzacg.zze)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.zzd);
        return Arrays.hashCode(this.zze) + ((hashCode + ((((((this.zza + 527) * 31) + this.zzb) * 31) + this.zzc) * 31)) * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zza);
        parcel.writeInt(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeIntArray(this.zzd);
        parcel.writeIntArray(this.zze);
    }

    public zzacg(Parcel parcel) {
        super("MLLT");
        this.zza = parcel.readInt();
        this.zzb = parcel.readInt();
        this.zzc = parcel.readInt();
        this.zzd = (int[]) zzeg.zzG(parcel.createIntArray());
        this.zze = (int[]) zzeg.zzG(parcel.createIntArray());
    }
}
