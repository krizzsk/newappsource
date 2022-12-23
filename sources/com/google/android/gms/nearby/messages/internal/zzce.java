package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "UnpublishRequestCreator")
public final class zzce extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzce> CREATOR = new zzcf();
    @SafeParcelable.VersionField(mo65748id = 1)
    public final int zza;
    @SafeParcelable.Field(mo65739id = 2)
    public final zzae zzb;
    @SafeParcelable.Field(getter = "getCallbackAsBinder", mo65739id = 3, type = "android.os.IBinder")
    public final zzr zzc;
    @SafeParcelable.Field(mo65739id = 4)
    @Deprecated
    public final String zzd;
    @SafeParcelable.Field(mo65739id = 5)
    @Deprecated
    public final String zze;
    @SafeParcelable.Field(mo65739id = 6)
    @Deprecated
    public final boolean zzf;
    @SafeParcelable.Field(mo65739id = 7)
    @Deprecated
    public final ClientAppContext zzg;

    @SafeParcelable.Constructor
    public zzce(@SafeParcelable.Param(mo65742id = 1) int i, @SafeParcelable.Param(mo65742id = 2) zzae zzae, @SafeParcelable.Param(mo65742id = 3) IBinder iBinder, @SafeParcelable.Param(mo65742id = 4) String str, @SafeParcelable.Param(mo65742id = 5) String str2, @SafeParcelable.Param(mo65742id = 6) boolean z, @SafeParcelable.Param(mo65742id = 7) ClientAppContext clientAppContext) {
        zzr zzr;
        this.zza = i;
        this.zzb = zzae;
        if (iBinder == null) {
            zzr = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            if (queryLocalInterface instanceof zzr) {
                zzr = (zzr) queryLocalInterface;
            } else {
                zzr = new zzp(iBinder);
            }
        }
        this.zzc = zzr;
        this.zzd = str;
        this.zze = str2;
        this.zzf = z;
        this.zzg = ClientAppContext.zza(clientAppContext, str2, str, z);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        SafeParcelWriter.writeIBinder(parcel, 3, this.zzc.asBinder(), false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        SafeParcelWriter.writeBoolean(parcel, 6, this.zzf);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzg, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
