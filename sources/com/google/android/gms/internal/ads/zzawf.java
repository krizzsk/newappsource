package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class zzawf extends zzawj {
    public static final Parcelable.Creator<zzawf> CREATOR = new zzawe();
    public final String zza;
    public final String zzb;
    public final int zzc;
    public final byte[] zzd;

    public zzawf(Parcel parcel) {
        super("APIC");
        this.zza = parcel.readString();
        this.zzb = parcel.readString();
        this.zzc = parcel.readInt();
        this.zzd = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzawf.class == obj.getClass()) {
            zzawf zzawf = (zzawf) obj;
            if (this.zzc != zzawf.zzc || !zzazn.zzo(this.zza, zzawf.zza) || !zzazn.zzo(this.zzb, zzawf.zzb) || !Arrays.equals(this.zzd, zzawf.zzd)) {
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

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeByteArray(this.zzd);
    }

    public zzawf(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.zza = str;
        this.zzb = null;
        this.zzc = 3;
        this.zzd = bArr;
    }
}
