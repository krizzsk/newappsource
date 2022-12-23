package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "AddressParcelCreator")
public final class zzao extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzao> CREATOR = new zzan();
    @SafeParcelable.Field(getter = "getType", mo65739id = 1)
    private final int zza;
    @SafeParcelable.Field(getter = "getAddressLines", mo65739id = 2)
    private final String[] zzb;

    @SafeParcelable.Constructor
    public zzao(@SafeParcelable.Param(mo65742id = 1) int i, @SafeParcelable.Param(mo65742id = 2) String[] strArr) {
        this.zza = i;
        this.zzb = strArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeStringArray(parcel, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
