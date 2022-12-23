package com.google.android.gms.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class(creator = "RemoveGeofencingRequestCreator")
@SafeParcelable.Reserved({1000})
public final class zzbx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbx> CREATOR = new zzby();
    @SafeParcelable.Field(getter = "getGeofenceIds", mo65739id = 1)
    private final List zza;
    @SafeParcelable.Field(getter = "getPendingIntent", mo65739id = 2)
    private final PendingIntent zzb;
    @SafeParcelable.Field(defaultValue = "", getter = "getTag", mo65739id = 3)
    private final String zzc;

    @SafeParcelable.Constructor
    public zzbx(@SafeParcelable.Param(mo65742id = 1) List list, @SafeParcelable.Param(mo65742id = 2) PendingIntent pendingIntent, @SafeParcelable.Param(mo65742id = 3) String str) {
        com.google.android.gms.internal.location.zzbx zzbx;
        if (list == null) {
            zzbx = com.google.android.gms.internal.location.zzbx.zzk();
        } else {
            zzbx = com.google.android.gms.internal.location.zzbx.zzj(list);
        }
        this.zza = zzbx;
        this.zzb = pendingIntent;
        this.zzc = str;
    }

    public static zzbx zza(List list) {
        Preconditions.checkNotNull(list, "geofence can't be null.");
        Preconditions.checkArgument(!list.isEmpty(), "Geofences must contains at least one id.");
        return new zzbx(list, (PendingIntent) null, "");
    }

    public static zzbx zzb(PendingIntent pendingIntent) {
        Preconditions.checkNotNull(pendingIntent, "PendingIntent can not be null.");
        return new zzbx((List) null, pendingIntent, "");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringList(parcel, 1, this.zza, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
