package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ContactInfoCreator")
@SafeParcelable.Reserved({1})
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new zzu();
    @SafeParcelable.Field(mo65739id = 2)
    public zzl zza;
    @SafeParcelable.Field(mo65739id = 3)
    public String zzb;
    @SafeParcelable.Field(mo65739id = 4)
    public String zzc;
    @SafeParcelable.Field(mo65739id = 5)
    public zzm[] zzd;
    @SafeParcelable.Field(mo65739id = 6)
    public zzj[] zze;
    @SafeParcelable.Field(mo65739id = 7)
    public String[] zzf;
    @SafeParcelable.Field(mo65739id = 8)
    public zze[] zzg;

    public zzh() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zza, i, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        SafeParcelWriter.writeTypedArray(parcel, 5, this.zzd, i, false);
        SafeParcelWriter.writeTypedArray(parcel, 6, this.zze, i, false);
        SafeParcelWriter.writeStringArray(parcel, 7, this.zzf, false);
        SafeParcelWriter.writeTypedArray(parcel, 8, this.zzg, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzh(@SafeParcelable.Param(mo65742id = 2) zzl zzl, @SafeParcelable.Param(mo65742id = 3) String str, @SafeParcelable.Param(mo65742id = 4) String str2, @SafeParcelable.Param(mo65742id = 5) zzm[] zzmArr, @SafeParcelable.Param(mo65742id = 6) zzj[] zzjArr, @SafeParcelable.Param(mo65742id = 7) String[] strArr, @SafeParcelable.Param(mo65742id = 8) zze[] zzeArr) {
        this.zza = zzl;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzmArr;
        this.zze = zzjArr;
        this.zzf = strArr;
        this.zzg = zzeArr;
    }
}
