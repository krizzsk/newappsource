package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "SubstringEntityCreator")
@SafeParcelable.Reserved({1000})
public final class zzb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzb> CREATOR = new zzav();
    @SafeParcelable.Field(mo65739id = 2)
    public final int length;
    @SafeParcelable.Field(mo65739id = 1)
    public final int offset;

    @SafeParcelable.Constructor
    public zzb(@SafeParcelable.Param(mo65742id = 1) int i, @SafeParcelable.Param(mo65742id = 2) int i2) {
        this.offset = i;
        this.length = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzb)) {
            return false;
        }
        zzb zzb = (zzb) obj;
        if (!Objects.equal(Integer.valueOf(this.offset), Integer.valueOf(zzb.offset)) || !Objects.equal(Integer.valueOf(this.length), Integer.valueOf(zzb.length))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.offset), Integer.valueOf(this.length));
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("offset", Integer.valueOf(this.offset)).add("length", Integer.valueOf(this.length)).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.offset);
        SafeParcelWriter.writeInt(parcel, 2, this.length);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
