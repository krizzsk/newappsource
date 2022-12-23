package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

@SafeParcelable.Class(creator = "PatternItemCreator")
@SafeParcelable.Reserved({1})
public class PatternItem extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PatternItem> CREATOR = new zzj();
    private static final String zza = "PatternItem";
    @SafeParcelable.Field(getter = "getType", mo65739id = 2)
    private final int zzb;
    @SafeParcelable.Field(getter = "getLength", mo65739id = 3)
    private final Float zzc;

    static {
        Class<PatternItem> cls = PatternItem.class;
    }

    @SafeParcelable.Constructor
    public PatternItem(@SafeParcelable.Param(mo65742id = 2) int i, @SafeParcelable.Param(mo65742id = 3) Float f) {
        boolean z = false;
        if (i == 1 || (f != null && f.floatValue() >= BitmapDescriptorFactory.HUE_RED)) {
            z = true;
        }
        String valueOf = String.valueOf(f);
        StringBuilder sb = new StringBuilder(valueOf.length() + 45);
        sb.append("Invalid PatternItem: type=");
        sb.append(i);
        sb.append(" length=");
        sb.append(valueOf);
        Preconditions.checkArgument(z, sb.toString());
        this.zzb = i;
        this.zzc = f;
    }

    public static List<PatternItem> zza(List<PatternItem> list) {
        PatternItem patternItem;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (PatternItem next : list) {
            if (next == null) {
                next = null;
            } else {
                int i = next.zzb;
                boolean z = false;
                if (i == 0) {
                    if (next.zzc != null) {
                        z = true;
                    }
                    Preconditions.checkState(z, "length must not be null.");
                    patternItem = new Dash(next.zzc.floatValue());
                } else if (i == 1) {
                    next = new Dot();
                } else if (i == 2) {
                    if (next.zzc != null) {
                        z = true;
                    }
                    Preconditions.checkState(z, "length must not be null.");
                    patternItem = new Gap(next.zzc.floatValue());
                }
                next = patternItem;
            }
            arrayList.add(next);
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PatternItem)) {
            return false;
        }
        PatternItem patternItem = (PatternItem) obj;
        if (this.zzb != patternItem.zzb || !Objects.equal(this.zzc, patternItem.zzc)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzb), this.zzc);
    }

    public String toString() {
        int i = this.zzb;
        String valueOf = String.valueOf(this.zzc);
        StringBuilder sb = new StringBuilder(valueOf.length() + 39);
        sb.append("[PatternItem: type=");
        sb.append(i);
        sb.append(" length=");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeFloatObject(parcel, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
