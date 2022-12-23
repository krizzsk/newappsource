package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

@ShowFirstParty
@SafeParcelable.Class(creator = "DeviceOrientationRequestCreator")
public final class zzw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzw> CREATOR = new zzx();
    @SafeParcelable.Field(defaultValueUnchecked = "DeviceOrientationRequest.DEFAULT_SHOULD_USE_MAG", mo65739id = 1)
    public boolean zza;
    @SafeParcelable.Field(defaultValueUnchecked = "DeviceOrientationRequest.DEFAULT_MINIMUM_SAMPLING_PERIOD_MS", mo65739id = 2)
    public long zzb;
    @SafeParcelable.Field(defaultValueUnchecked = "DeviceOrientationRequest.DEFAULT_SMALLEST_ANGLE_CHANGE_RADIANS", mo65739id = 3)
    public float zzc;
    @SafeParcelable.Field(defaultValueUnchecked = "DeviceOrientationRequest.DEFAULT_EXPIRE_AT_MS", mo65739id = 4)
    public long zzd;
    @SafeParcelable.Field(defaultValueUnchecked = "DeviceOrientationRequest.DEFAULT_NUM_UPDATES", mo65739id = 5)
    public int zze;

    public zzw() {
        this(true, 50, BitmapDescriptorFactory.HUE_RED, Long.MAX_VALUE, Integer.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzw)) {
            return false;
        }
        zzw zzw = (zzw) obj;
        if (this.zza == zzw.zza && this.zzb == zzw.zzb && Float.compare(this.zzc, zzw.zzc) == 0 && this.zzd == zzw.zzd && this.zze == zzw.zze) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.zza), Long.valueOf(this.zzb), Float.valueOf(this.zzc), Long.valueOf(this.zzd), Integer.valueOf(this.zze));
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("DeviceOrientationRequest[mShouldUseMag=");
        k.append(this.zza);
        k.append(" mMinimumSamplingPeriodMs=");
        k.append(this.zzb);
        k.append(" mSmallestAngleChangeRadians=");
        k.append(this.zzc);
        long j = this.zzd;
        if (j != Long.MAX_VALUE) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            k.append(" expireIn=");
            k.append(j - elapsedRealtime);
            k.append("ms");
        }
        if (this.zze != Integer.MAX_VALUE) {
            k.append(" num=");
            k.append(this.zze);
        }
        k.append(']');
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.zza);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeFloat(parcel, 3, this.zzc);
        SafeParcelWriter.writeLong(parcel, 4, this.zzd);
        SafeParcelWriter.writeInt(parcel, 5, this.zze);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzw(@SafeParcelable.Param(mo65742id = 1) boolean z, @SafeParcelable.Param(mo65742id = 2) long j, @SafeParcelable.Param(mo65742id = 3) float f, @SafeParcelable.Param(mo65742id = 4) long j2, @SafeParcelable.Param(mo65742id = 5) int i) {
        this.zza = z;
        this.zzb = j;
        this.zzc = f;
        this.zzd = j2;
        this.zze = i;
    }
}
