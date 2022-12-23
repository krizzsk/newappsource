package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@ShowFirstParty
@SafeParcelable.Class(creator = "ActivityRecognitionRequestCreator")
@SafeParcelable.Reserved({1000})
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new zzm();
    @SafeParcelable.Field(getter = "getIntervalMillis", mo65739id = 1)
    private final long zza;
    @SafeParcelable.Field(getter = "getTriggerUpdate", mo65739id = 2)
    private final boolean zzb;
    @SafeParcelable.Field(getter = "getWorkSource", mo65739id = 3)
    private final WorkSource zzc;
    @SafeParcelable.Field(getter = "getTag", mo65739id = 4)
    private final String zzd;
    @SafeParcelable.Field(getter = "getNondefaultActivities", mo65739id = 5)
    private final int[] zze;
    @SafeParcelable.Field(getter = "getRequestSensorData", mo65739id = 6)
    private final boolean zzf;
    @SafeParcelable.Field(getter = "getAccountName", mo65739id = 7)
    private final String zzg;
    @SafeParcelable.Field(defaultValueUnchecked = "ActivityRecognitionRequest.DEFAULT_MAX_REPORT_LATENCY_MILLIS", getter = "getMaxReportLatencyMillis", mo65739id = 8)
    private final long zzh;
    @SafeParcelable.Field(getter = "getContextAttributionTag", mo65739id = 9)
    private String zzi;

    @SafeParcelable.Constructor
    public zzl(@SafeParcelable.Param(mo65742id = 1) long j, @SafeParcelable.Param(mo65742id = 2) boolean z, @SafeParcelable.Param(mo65742id = 3) WorkSource workSource, @SafeParcelable.Param(mo65742id = 4) String str, @SafeParcelable.Param(mo65742id = 5) int[] iArr, @SafeParcelable.Param(mo65742id = 6) boolean z2, @SafeParcelable.Param(mo65742id = 7) String str2, @SafeParcelable.Param(mo65742id = 8) long j2, @SafeParcelable.Param(mo65742id = 9) String str3) {
        this.zza = j;
        this.zzb = z;
        this.zzc = workSource;
        this.zzd = str;
        this.zze = iArr;
        this.zzf = z2;
        this.zzg = str2;
        this.zzh = j2;
        this.zzi = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Preconditions.checkNotNull(parcel);
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, this.zza);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeIntArray(parcel, 5, this.zze, false);
        SafeParcelWriter.writeBoolean(parcel, 6, this.zzf);
        SafeParcelWriter.writeString(parcel, 7, this.zzg, false);
        SafeParcelWriter.writeLong(parcel, 8, this.zzh);
        SafeParcelWriter.writeString(parcel, 9, this.zzi, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final zzl zza(String str) {
        this.zzi = str;
        return this;
    }
}
