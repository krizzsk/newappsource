package com.google.android.gms.internal.contextmanager;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;

@SafeParcelable.Class(creator = "WriteBatchImplCreator")
@SafeParcelable.Reserved({1})
@VisibleForTesting
public final class zzct extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzct> CREATOR = new zzcu();
    @SafeParcelable.Field(mo65739id = 3)
    public ArrayList<zzaw> zza;

    public zzct() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 3, this.zza, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzct(@SafeParcelable.Param(mo65742id = 3) ArrayList<zzaw> arrayList) {
        this.zza = arrayList;
    }
}
