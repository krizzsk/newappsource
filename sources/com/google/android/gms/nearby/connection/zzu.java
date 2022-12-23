package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import p358af.C13437d;

@ShowFirstParty
@SafeParcelable.Class(creator = "UwbSenderInfoCreator")
@SafeParcelable.Reserved({1000})
public final class zzu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzu> CREATOR = new zzv();
    @SafeParcelable.Field(getter = "getAddress", mo65739id = 1)
    private byte[] zza;
    @SafeParcelable.Field(getter = "getChannel", mo65739id = 2)
    private int zzb;
    @SafeParcelable.Field(getter = "getPreambleIndex", mo65739id = 3)
    private int zzc;

    private zzu() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzu) {
            zzu zzu = (zzu) obj;
            if (!Arrays.equals(this.zza, zzu.zza) || !Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zzu.zzb)) || !Objects.equal(Integer.valueOf(this.zzc), Integer.valueOf(zzu.zzc))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(Arrays.hashCode(this.zza)), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc));
    }

    public final String toString() {
        String arrays = Arrays.toString(this.zza);
        int i = this.zzb;
        int i2 = this.zzc;
        StringBuilder sb = new StringBuilder();
        sb.append("UwbSenderInfo{address=");
        sb.append(arrays);
        sb.append(", channel=");
        sb.append(i);
        sb.append(", preambleIndex=");
        return C13437d.m33707l(sb, i2, "}");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 1, this.zza, false);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzu(@SafeParcelable.Param(mo65742id = 1) byte[] bArr, @SafeParcelable.Param(mo65742id = 2) int i, @SafeParcelable.Param(mo65742id = 3) int i2) {
        this.zza = bArr;
        this.zzb = i;
        this.zzc = i2;
    }
}
