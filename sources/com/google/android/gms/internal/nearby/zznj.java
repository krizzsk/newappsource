package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.messages.internal.zzc;
import com.google.android.gms.nearby.messages.internal.zzg;
import com.google.android.gms.nearby.messages.internal.zzl;
import java.util.UUID;

@SafeParcelable.Class(creator = "NearbyDeviceFilterCreator")
public final class zznj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zznj> CREATOR = new zznk();
    @SafeParcelable.VersionField(mo65748id = 1000)
    public final int zza;
    @SafeParcelable.Field(mo65739id = 1)
    public final int zzb;
    @SafeParcelable.Field(mo65739id = 2)
    public final byte[] zzc;
    @SafeParcelable.Field(mo65739id = 3)
    public final boolean zzd;

    @SafeParcelable.Constructor
    public zznj(@SafeParcelable.Param(mo65742id = 1000) int i, @SafeParcelable.Param(mo65742id = 1) int i2, @SafeParcelable.Param(mo65742id = 2) byte[] bArr, @SafeParcelable.Param(mo65742id = 3) boolean z) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = bArr;
        this.zzd = z;
    }

    public static zznj zza(String str, String str2) {
        if (str2 == null) {
            str2 = "";
        }
        return new zznj(2, new zzg(zzc.zzd(String.valueOf(str).concat(str2))).zzc());
    }

    public static zznj zzb(UUID uuid, Short sh, Short sh2) {
        return new zznj(3, new zzl(uuid, sh, sh2).zzc());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzb);
        SafeParcelWriter.writeByteArray(parcel, 2, this.zzc, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzd);
        SafeParcelWriter.writeInt(parcel, 1000, this.zza);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private zznj(int i, byte[] bArr) {
        this(1, i, bArr, false);
    }
}
