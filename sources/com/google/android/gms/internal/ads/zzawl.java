package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

public final class zzawl extends zzawj {
    public static final Parcelable.Creator<zzawl> CREATOR = new zzawk();
    public final String zza;
    public final String zzb;

    public zzawl(Parcel parcel) {
        super(parcel.readString());
        this.zza = parcel.readString();
        this.zzb = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzawl.class == obj.getClass()) {
            zzawl zzawl = (zzawl) obj;
            if (!this.zze.equals(zzawl.zze) || !zzazn.zzo(this.zza, zzawl.zza) || !zzazn.zzo(this.zzb, zzawl.zzb)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int d = C13715c.m34238d(this.zze, 527, 31);
        String str = this.zza;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = (d + i) * 31;
        String str2 = this.zzb;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zze);
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
    }

    public zzawl(String str, String str2, String str3) {
        super(str);
        this.zza = null;
        this.zzb = str3;
    }
}
