package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ConnectionInfoCreator")
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new zzk();
    @SafeParcelable.Field(mo65739id = 1)
    public Bundle zza;
    @SafeParcelable.Field(mo65739id = 2)
    public Feature[] zzb;
    @SafeParcelable.Field(defaultValue = "0", mo65739id = 3)
    public int zzc;
    @SafeParcelable.Field(mo65739id = 4)
    public ConnectionTelemetryConfiguration zzd;

    public zzj() {
    }

    @SafeParcelable.Constructor
    public zzj(@SafeParcelable.Param(mo65742id = 1) Bundle bundle, @SafeParcelable.Param(mo65742id = 2) Feature[] featureArr, @SafeParcelable.Param(mo65742id = 3) int i, @SafeParcelable.Param(mo65742id = 4) ConnectionTelemetryConfiguration connectionTelemetryConfiguration) {
        this.zza = bundle;
        this.zzb = featureArr;
        this.zzc = i;
        this.zzd = connectionTelemetryConfiguration;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 1, this.zza, false);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.zzb, i, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
