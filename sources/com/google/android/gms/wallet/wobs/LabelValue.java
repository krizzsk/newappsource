package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "LabelValueCreator")
@SafeParcelable.Reserved({1})
public final class LabelValue extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LabelValue> CREATOR = new zzd();
    @SafeParcelable.Field(mo65739id = 2)
    public String zza;
    @SafeParcelable.Field(mo65739id = 3)
    public String zzb;

    public LabelValue() {
    }

    public String getLabel() {
        return this.zza;
    }

    public String getValue() {
        return this.zzb;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public LabelValue(@SafeParcelable.Param(mo65742id = 2) String str, @SafeParcelable.Param(mo65742id = 3) String str2) {
        this.zza = str;
        this.zzb = str2;
    }
}
