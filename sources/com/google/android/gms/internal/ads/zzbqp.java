package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "MediationConfigurationParcelCreator")
public final class zzbqp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbqp> CREATOR = new zzbqq();
    @SafeParcelable.Field(mo65739id = 1)
    public final String zza;
    @SafeParcelable.Field(mo65739id = 2)
    public final Bundle zzb;

    @SafeParcelable.Constructor
    public zzbqp(@SafeParcelable.Param(mo65742id = 1) String str, @SafeParcelable.Param(mo65742id = 2) Bundle bundle) {
        this.zza = str;
        this.zzb = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeBundle(parcel, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
