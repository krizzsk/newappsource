package com.google.android.gms.internal.contextmanager;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;

@SafeParcelable.Class(creator = "SnapshotRequestCreator")
@SafeParcelable.Reserved({1})
public final class zzao extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzao> CREATOR = new zzap();
    @SafeParcelable.Field(getter = "getContextType3P", mo65739id = 2)
    private final int zza;
    @SafeParcelable.Field(getter = "getBeaconTypes", mo65739id = 3)
    private final ArrayList<zzo> zzb;
    @SafeParcelable.Field(getter = "getContextName", mo65739id = 4)
    private final int zzc;

    public zzao(int i, ArrayList<zzo> arrayList) {
        this.zza = i;
        this.zzb = arrayList;
        this.zzc = 0;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzao)) {
            return false;
        }
        zzao zzao = (zzao) obj;
        if (this.zzc != zzao.zzc || this.zza != zzao.zza) {
            return false;
        }
        ArrayList<zzo> arrayList = zzao.zzb;
        ArrayList<zzo> arrayList2 = this.zzb;
        if (arrayList2 == null) {
            z = true;
        } else {
            z = false;
        }
        if (arrayList == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (arrayList2 != null) {
            if (arrayList2.size() != arrayList.size()) {
                return false;
            }
            ArrayList<zzo> arrayList3 = this.zzb;
            int size = arrayList3.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                if (!arrayList.contains(arrayList3.get(i))) {
                    return false;
                }
                i = i2;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i;
        ArrayList<zzo> arrayList = this.zzb;
        if (arrayList != null) {
            int size = arrayList.size();
            i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                i += arrayList.get(i2).hashCode() * 13;
            }
        } else {
            i = 0;
        }
        return Objects.hashCode(Integer.valueOf(this.zza), Integer.valueOf(i), Integer.valueOf(this.zzc));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zza);
        SafeParcelWriter.writeTypedList(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeInt(parcel, 4, this.zzc);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzao(@SafeParcelable.Param(mo65742id = 2) int i, @SafeParcelable.Param(mo65742id = 3) ArrayList<zzo> arrayList, @SafeParcelable.Param(mo65742id = 4) int i2) {
        this.zza = i;
        this.zzb = arrayList;
        this.zzc = i2;
    }
}
