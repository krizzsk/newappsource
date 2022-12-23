package com.google.android.gms.internal.contextmanager;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.awareness.fence.FenceQueryRequest;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@SafeParcelable.Class(creator = "FenceQueryRequestImplCreator")
@SafeParcelable.Reserved({1})
public final class zzbm extends FenceQueryRequest {
    public static final Parcelable.Creator<zzbm> CREATOR = new zzbn();
    @SafeParcelable.Field(mo65739id = 2)
    public final zzbl zza;

    public zzbm() {
        this.zza = new zzbl(1, (List<String>) null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zza, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzbm(@SafeParcelable.Param(mo65742id = 2) zzbl zzbl) {
        this.zza = zzbl;
    }

    public zzbm(Collection<String> collection) {
        this.zza = new zzbl(2, new ArrayList(collection));
    }

    public zzbm(String... strArr) {
        this.zza = new zzbl(2, Arrays.asList(strArr));
    }
}
