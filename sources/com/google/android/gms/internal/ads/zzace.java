package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p001a0.C0017h;

public final class zzace extends zzacc {
    public static final Parcelable.Creator<zzace> CREATOR = new zzacd();
    public final String zza;
    public final String zzb;
    public final String zzc;

    public zzace(Parcel parcel) {
        super("----");
        String readString = parcel.readString();
        int i = zzeg.zza;
        this.zza = readString;
        this.zzb = parcel.readString();
        this.zzc = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzace.class == obj.getClass()) {
            zzace zzace = (zzace) obj;
            if (!zzeg.zzS(this.zzb, zzace.zzb) || !zzeg.zzS(this.zza, zzace.zza) || !zzeg.zzS(this.zzc, zzace.zzc)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
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
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str3 = this.zzc;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return i5 + i3;
    }

    public final String toString() {
        return C0017h.m56M(this.zzf, ": domain=", this.zza, ", description=", this.zzb);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzf);
        parcel.writeString(this.zza);
        parcel.writeString(this.zzc);
    }

    public zzace(String str, String str2, String str3) {
        super("----");
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }
}
