package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "MessageTypeCreator")
public final class zzac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzac> CREATOR = new zzad();
    @SafeParcelable.VersionField(mo65748id = 1000)
    public final int zza;
    @SafeParcelable.Field(mo65739id = 1)
    public final String zzb;
    @SafeParcelable.Field(mo65739id = 2)
    public final String zzc;

    @SafeParcelable.Constructor
    public zzac(@SafeParcelable.Param(mo65742id = 1000) int i, @SafeParcelable.Param(mo65742id = 1) String str, @SafeParcelable.Param(mo65742id = 2) String str2) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof zzac) && hashCode() == obj.hashCode()) {
            zzac zzac = (zzac) obj;
            if (!Objects.equal(this.zzb, zzac.zzb) || !Objects.equal(this.zzc, zzac.zzc)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzb, this.zzc);
    }

    public final String toString() {
        return C25541a.m63882l("namespace=", this.zzb, ", type=", this.zzc);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzc, false);
        SafeParcelWriter.writeInt(parcel, 1000, this.zza);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzac(String str, String str2) {
        this(1, str, str2);
    }
}
