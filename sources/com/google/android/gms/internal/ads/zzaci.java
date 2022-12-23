package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p358af.C13437d;

public final class zzaci extends zzacc {
    public static final Parcelable.Creator<zzaci> CREATOR = new zzach();
    public final String zza;
    public final byte[] zzb;

    public zzaci(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i = zzeg.zza;
        this.zza = readString;
        this.zzb = (byte[]) zzeg.zzG(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaci.class == obj.getClass()) {
            zzaci zzaci = (zzaci) obj;
            if (!zzeg.zzS(this.zza, zzaci.zza) || !Arrays.equals(this.zzb, zzaci.zzb)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        String str = this.zza;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return Arrays.hashCode(this.zzb) + ((i + 527) * 31);
    }

    public final String toString() {
        return C13437d.m33706k(this.zzf, ": owner=", this.zza);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeByteArray(this.zzb);
    }

    public zzaci(String str, byte[] bArr) {
        super("PRIV");
        this.zza = str;
        this.zzb = bArr;
    }
}
