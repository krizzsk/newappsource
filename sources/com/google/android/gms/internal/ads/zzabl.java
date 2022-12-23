package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

public final class zzabl implements zzbk {
    public static final Parcelable.Creator<zzabl> CREATOR = new zzabk();
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final boolean zze;
    public final int zzf;

    public zzabl(int i, String str, String str2, String str3, boolean z, int i2) {
        boolean z2 = true;
        if (i2 != -1 && i2 <= 0) {
            z2 = false;
        }
        zzcw.zzd(z2);
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = z;
        this.zzf = i2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzabl.class == obj.getClass()) {
            zzabl zzabl = (zzabl) obj;
            if (this.zza != zzabl.zza || !zzeg.zzS(this.zzb, zzabl.zzb) || !zzeg.zzS(this.zzc, zzabl.zzc) || !zzeg.zzS(this.zzd, zzabl.zzd) || this.zze != zzabl.zze || this.zzf != zzabl.zzf) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = (this.zza + 527) * 31;
        String str = this.zzb;
        int i4 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i5 = (i3 + i) * 31;
        String str2 = this.zzc;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        String str3 = this.zzd;
        if (str3 != null) {
            i4 = str3.hashCode();
        }
        return ((((i6 + i4) * 31) + (this.zze ? 1 : 0)) * 31) + this.zzf;
    }

    public final String toString() {
        String str = this.zzc;
        String str2 = this.zzb;
        int i = this.zza;
        int i2 = this.zzf;
        StringBuilder h = C16759e.m42352h("IcyHeaders: name=\"", str, "\", genre=\"", str2, "\", bitrate=");
        h.append(i);
        h.append(", metadataInterval=");
        h.append(i2);
        return h.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeString(this.zzd);
        zzeg.zzR(parcel, this.zze);
        parcel.writeInt(this.zzf);
    }

    public final void zza(zzbf zzbf) {
        String str = this.zzc;
        if (str != null) {
            zzbf.zzq(str);
        }
        String str2 = this.zzb;
        if (str2 != null) {
            zzbf.zzj(str2);
        }
    }

    public zzabl(Parcel parcel) {
        this.zza = parcel.readInt();
        this.zzb = parcel.readString();
        this.zzc = parcel.readString();
        this.zzd = parcel.readString();
        this.zze = zzeg.zzY(parcel);
        this.zzf = parcel.readInt();
    }
}
