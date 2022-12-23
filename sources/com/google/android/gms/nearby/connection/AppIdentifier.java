package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "AppIdentifierCreator")
@SafeParcelable.Reserved({1000})
@Deprecated
public final class AppIdentifier extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AppIdentifier> CREATOR = new zzc();
    @SafeParcelable.Field(getter = "getIdentifier", mo65739id = 1)
    private final String zza;

    @SafeParcelable.Constructor
    public AppIdentifier(@SafeParcelable.Param(mo65742id = 1) String str) {
        this.zza = Preconditions.checkNotEmpty(str, "Missing application identifier value");
    }

    public String getIdentifier() {
        return this.zza;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getIdentifier(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
