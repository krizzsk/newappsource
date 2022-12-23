package com.google.android.gms.internal.contextmanager;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.awareness.fence.FenceUpdateRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;

@SafeParcelable.Class(creator = "FenceUpdateRequestImplCreator")
@SafeParcelable.Reserved({1})
public final class zzbs extends AbstractSafeParcelable implements FenceUpdateRequest {
    public static final Parcelable.Creator<zzbs> CREATOR = new zzbt();
    @SafeParcelable.Field(mo65739id = 2)
    public final ArrayList<zzcc> zza;

    @Deprecated
    public zzbs() {
        this.zza = new ArrayList<>();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 2, this.zza, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzbs(@SafeParcelable.Param(mo65742id = 2) ArrayList<zzcc> arrayList) {
        this.zza = arrayList;
    }
}
