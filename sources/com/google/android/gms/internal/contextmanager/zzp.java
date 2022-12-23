package com.google.android.gms.internal.contextmanager;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.awareness.state.BeaconState;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

@SafeParcelable.Class(creator = "BeaconStateImplCreator")
@SafeParcelable.Reserved({1})
public final class zzp extends AbstractSafeParcelable implements BeaconState {
    public static final Parcelable.Creator<zzp> CREATOR = new zzq();
    @SafeParcelable.Field(getter = "getBeaconInfoInternal", mo65739id = 2)
    private final ArrayList<zzn> zza;

    @SafeParcelable.Constructor
    public zzp(@SafeParcelable.Param(mo65742id = 2) ArrayList<zzn> arrayList) {
        this.zza = arrayList;
    }

    public final List<BeaconState.BeaconInfo> getBeaconInfo() {
        return this.zza;
    }

    public final String toString() {
        ArrayList<zzn> arrayList = this.zza;
        if (arrayList == null || arrayList.isEmpty()) {
            return "BeaconState: empty";
        }
        StringBuilder k = C13555b.m33972k("BeaconState: ");
        ArrayList<zzn> arrayList2 = this.zza;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            k.append(arrayList2.get(i));
        }
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 2, this.zza, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
