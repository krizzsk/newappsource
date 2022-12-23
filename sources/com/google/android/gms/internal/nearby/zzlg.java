package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "OnEndpointLostParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzlg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzlg> CREATOR = new zzlh();
    @SafeParcelable.Field(getter = "getEndpointId", mo65739id = 1)
    private String zza;

    private zzlg() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzlg) {
            return Objects.equal(this.zza, ((zzlg) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final String zza() {
        return this.zza;
    }

    @SafeParcelable.Constructor
    public zzlg(@SafeParcelable.Param(mo65742id = 1) String str) {
        this.zza = str;
    }
}
