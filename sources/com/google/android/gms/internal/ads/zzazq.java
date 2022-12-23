package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p001a0.C0016g;

public final class zzazq implements Parcelable {
    public static final Parcelable.Creator<zzazq> CREATOR = new zzazp();
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final byte[] zzd;
    private int zze;

    public zzazq(int i, int i2, int i3, byte[] bArr) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = bArr;
    }

    public zzazq(Parcel parcel) {
        byte[] bArr;
        this.zza = parcel.readInt();
        this.zzb = parcel.readInt();
        this.zzc = parcel.readInt();
        if (parcel.readInt() != 0) {
            bArr = parcel.createByteArray();
        } else {
            bArr = null;
        }
        this.zzd = bArr;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzazq.class == obj.getClass()) {
            zzazq zzazq = (zzazq) obj;
            if (this.zza == zzazq.zza && this.zzb == zzazq.zzb && this.zzc == zzazq.zzc && Arrays.equals(this.zzd, zzazq.zzd)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zze;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.zzd) + ((((((this.zza + 527) * 31) + this.zzb) * 31) + this.zzc) * 31);
        this.zze = hashCode;
        return hashCode;
    }

    public final String toString() {
        boolean z;
        int i = this.zza;
        int i2 = this.zzb;
        int i3 = this.zzc;
        if (this.zzd != null) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder s = C0016g.m35s("ColorInfo(", i, ", ", i2, ", ");
        s.append(i3);
        s.append(", ");
        s.append(z);
        s.append(")");
        return s.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeInt(this.zza);
        parcel.writeInt(this.zzb);
        parcel.writeInt(this.zzc);
        if (this.zzd != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        byte[] bArr = this.zzd;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }
}
