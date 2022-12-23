package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p001a0.C0016g;

public final class zzabx extends zzacc {
    public static final Parcelable.Creator<zzabx> CREATOR = new zzabw();
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final byte[] zzd;

    public zzabx(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        int i = zzeg.zza;
        this.zza = readString;
        this.zzb = parcel.readString();
        this.zzc = parcel.readString();
        this.zzd = (byte[]) zzeg.zzG(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzabx.class == obj.getClass()) {
            zzabx zzabx = (zzabx) obj;
            if (!zzeg.zzS(this.zza, zzabx.zza) || !zzeg.zzS(this.zzb, zzabx.zzb) || !zzeg.zzS(this.zzc, zzabx.zzc) || !Arrays.equals(this.zzd, zzabx.zzd)) {
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
        return Arrays.hashCode(this.zzd) + ((i5 + i3) * 31);
    }

    public final String toString() {
        String str = this.zzf;
        String str2 = this.zza;
        String str3 = this.zzb;
        return C0016g.m31o(C16759e.m42352h(str, ": mimeType=", str2, ", filename=", str3), ", description=", this.zzc);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeByteArray(this.zzd);
    }

    public zzabx(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = bArr;
    }
}
