package com.google.android.gms.internal.contextmanager;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.ActivityRecognitionResult;

@SafeParcelable.Class(creator = "SnapshotCreator")
@SafeParcelable.Reserved({1})
public final class zzz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzz> CREATOR = new zzan();
    @SafeParcelable.Field(getter = "getActivityRecognitionResult", mo65739id = 2)
    private final ActivityRecognitionResult zza;
    @SafeParcelable.Field(getter = "getBeaconState", mo65739id = 3)
    private final zzp zzb;
    @SafeParcelable.Field(getter = "getHeadphoneState", mo65739id = 4)
    private final zzr zzc;
    @SafeParcelable.Field(getter = "getLocation", mo65739id = 5)
    private final Location zzd;
    @SafeParcelable.Field(getter = "getNetworkState", mo65739id = 6)
    private final zzt zze;
    @SafeParcelable.Field(getter = "getPlacesData", mo65739id = 7)
    private final DataHolder zzf;
    @SafeParcelable.Field(getter = "getPowerState", mo65739id = 8)
    private final zzv zzg;
    @SafeParcelable.Field(getter = "getScreenState", mo65739id = 9)
    private final zzx zzh;
    @SafeParcelable.Field(getter = "getWeather", mo65739id = 10)
    private final zzau zzi;
    @SafeParcelable.Field(getter = "getTimeIntervals", mo65739id = 11)
    private final zzar zzj;
    @SafeParcelable.Field(getter = "getContextData", mo65739id = 12)
    private final zzaw zzk;

    @SafeParcelable.Constructor
    public zzz(@SafeParcelable.Param(mo65742id = 2) ActivityRecognitionResult activityRecognitionResult, @SafeParcelable.Param(mo65742id = 3) zzp zzp, @SafeParcelable.Param(mo65742id = 4) zzr zzr, @SafeParcelable.Param(mo65742id = 5) Location location, @SafeParcelable.Param(mo65742id = 6) zzt zzt, @SafeParcelable.Param(mo65742id = 7) DataHolder dataHolder, @SafeParcelable.Param(mo65742id = 8) zzv zzv, @SafeParcelable.Param(mo65742id = 9) zzx zzx, @SafeParcelable.Param(mo65742id = 10) zzau zzau, @SafeParcelable.Param(mo65742id = 11) zzar zzar, @SafeParcelable.Param(mo65742id = 12) zzaw zzaw) {
        this.zza = activityRecognitionResult;
        this.zzb = zzp;
        this.zzc = zzr;
        this.zzd = location;
        this.zze = zzt;
        this.zzf = dataHolder;
        this.zzg = zzv;
        this.zzh = zzx;
        this.zzi = zzau;
        this.zzj = zzar;
        this.zzk = zzaw;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zza, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzb, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzc, i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zzd, i, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zze, i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzf, i, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.zzg, i, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.zzh, i, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.zzi, i, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.zzj, i, false);
        SafeParcelWriter.writeParcelable(parcel, 12, this.zzk, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final Location zza() {
        return this.zzd;
    }

    public final zzp zzb() {
        return this.zzb;
    }

    public final zzr zzc() {
        return this.zzc;
    }

    public final zzar zzd() {
        return this.zzj;
    }

    public final ActivityRecognitionResult zze() {
        return this.zza;
    }
}
