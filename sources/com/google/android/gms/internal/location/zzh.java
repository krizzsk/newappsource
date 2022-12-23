package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.location.zzw;
import java.util.Collections;
import java.util.List;
import p001a0.C0017h;

@SafeParcelable.Class(creator = "DeviceOrientationRequestInternalCreator")
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new zzi();
    @VisibleForTesting
    public static final List zza = Collections.emptyList();
    public static final zzw zzb = new zzw();
    @SafeParcelable.Field(defaultValueUnchecked = "DeviceOrientationRequestInternal.DEFAULT_DEVICE_ORIENTATION_REQUEST", mo65739id = 1)
    public final zzw zzc;
    @SafeParcelable.Field(defaultValueUnchecked = "DeviceOrientationRequestInternal.DEFAULT_CLIENTS", mo65739id = 2)
    public final List zzd;
    @SafeParcelable.Field(defaultValueUnchecked = "null", mo65739id = 3)
    public final String zze;

    @SafeParcelable.Constructor
    public zzh(@SafeParcelable.Param(mo65742id = 1) zzw zzw, @SafeParcelable.Param(mo65742id = 2) List list, @SafeParcelable.Param(mo65742id = 3) String str) {
        this.zzc = zzw;
        this.zzd = list;
        this.zze = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzh)) {
            return false;
        }
        zzh zzh = (zzh) obj;
        if (!Objects.equal(this.zzc, zzh.zzc) || !Objects.equal(this.zzd, zzh.zzd) || !Objects.equal(this.zze, zzh.zze)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.zzc.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzc);
        String valueOf2 = String.valueOf(this.zzd);
        String str = this.zze;
        StringBuilder sb = new StringBuilder(C16530d.m42011d(valueOf.length(), 77, valueOf2.length(), String.valueOf(str).length()));
        C0017h.m61R(sb, "DeviceOrientationRequestInternal{deviceOrientationRequest=", valueOf, ", clients=", valueOf2);
        return C13715c.m34245k(sb, ", tag='", str, "'}");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zzc, i, false);
        SafeParcelWriter.writeTypedList(parcel, 2, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 3, this.zze, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
