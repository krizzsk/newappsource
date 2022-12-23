package com.google.android.gms.internal.contextmanager;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.awareness.fence.FenceState;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;

@SafeParcelable.Class(creator = "FenceStateImplCreator")
@SafeParcelable.Reserved({1})
public final class zzbo extends FenceState {
    public static final Parcelable.Creator<zzbo> CREATOR = new zzbp();
    @SafeParcelable.Field(mo65739id = 2)
    public final int zza;
    @SafeParcelable.Field(mo65739id = 3)
    public final long zzb;
    @SafeParcelable.Field(mo65739id = 4)
    public final String zzc;
    @SafeParcelable.Field(mo65739id = 5)
    public final int zzd;
    @SafeParcelable.Field(mo65739id = 6)
    public final ArrayList<zzaw> zze;

    @SafeParcelable.Constructor
    public zzbo(@SafeParcelable.Param(mo65742id = 2) int i, @SafeParcelable.Param(mo65742id = 3) long j, @SafeParcelable.Param(mo65742id = 4) String str, @SafeParcelable.Param(mo65742id = 5) int i2, @SafeParcelable.Param(mo65742id = 6) ArrayList<zzaw> arrayList) {
        this.zza = i;
        this.zzb = j;
        this.zzc = str;
        this.zzd = i2;
        this.zze = arrayList;
    }

    public final int getCurrentState() {
        return this.zza;
    }

    public final String getFenceKey() {
        return this.zzc;
    }

    public final long getLastFenceUpdateTimeMillis() {
        return this.zzb;
    }

    public final int getPreviousState() {
        return this.zzd;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zza);
        SafeParcelWriter.writeLong(parcel, 3, this.zzb);
        SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        SafeParcelWriter.writeInt(parcel, 5, this.zzd);
        SafeParcelWriter.writeTypedList(parcel, 6, this.zze, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
