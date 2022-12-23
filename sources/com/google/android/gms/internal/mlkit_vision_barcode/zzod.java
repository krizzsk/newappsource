package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "CalendarEventParcelCreator")
public final class zzod extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzod> CREATOR = new zzos();
    @SafeParcelable.Field(getter = "getSummary", mo65739id = 1)
    private final String zza;
    @SafeParcelable.Field(getter = "getDescription", mo65739id = 2)
    private final String zzb;
    @SafeParcelable.Field(getter = "getLocation", mo65739id = 3)
    private final String zzc;
    @SafeParcelable.Field(getter = "getOrganizer", mo65739id = 4)
    private final String zzd;
    @SafeParcelable.Field(getter = "getStatus", mo65739id = 5)
    private final String zze;
    @SafeParcelable.Field(getter = "getStart", mo65739id = 6)
    private final zzoc zzf;
    @SafeParcelable.Field(getter = "getEnd", mo65739id = 7)
    private final zzoc zzg;

    @SafeParcelable.Constructor
    public zzod(@SafeParcelable.Param(mo65742id = 1) String str, @SafeParcelable.Param(mo65742id = 2) String str2, @SafeParcelable.Param(mo65742id = 3) String str3, @SafeParcelable.Param(mo65742id = 4) String str4, @SafeParcelable.Param(mo65742id = 5) String str5, @SafeParcelable.Param(mo65742id = 6) zzoc zzoc, @SafeParcelable.Param(mo65742id = 7) zzoc zzoc2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = zzoc;
        this.zzg = zzoc2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzg, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final zzoc zza() {
        return this.zzg;
    }

    public final zzoc zzb() {
        return this.zzf;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zzc;
    }

    public final String zze() {
        return this.zzd;
    }

    public final String zzf() {
        return this.zze;
    }

    public final String zzg() {
        return this.zza;
    }
}
