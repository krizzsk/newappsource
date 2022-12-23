package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;

@SafeParcelable.Class(creator = "RegisterStatusCallbackRequestCreator")
public final class zzcb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcb> CREATOR = new zzcc();
    @SafeParcelable.VersionField(mo65748id = 1)
    public final int zza;
    @SafeParcelable.Field(getter = "getCallbackAsBinder", mo65739id = 2, type = "android.os.IBinder")
    public final zzr zzb;
    @SafeParcelable.Field(getter = "getStatusCallbackAsBinder", mo65739id = 3, type = "android.os.IBinder")
    public final zzy zzc;
    @SafeParcelable.Field(mo65739id = 4)
    public boolean zzd;
    @SafeParcelable.Field(mo65739id = 5)
    @Deprecated
    public String zze;
    @SafeParcelable.Field(mo65739id = 6)
    @Deprecated
    public final ClientAppContext zzf;

    @SafeParcelable.Constructor
    public zzcb(@SafeParcelable.Param(mo65742id = 1) int i, @SafeParcelable.Param(mo65742id = 2) IBinder iBinder, @SafeParcelable.Param(mo65742id = 3) IBinder iBinder2, @SafeParcelable.Param(mo65742id = 4) boolean z, @SafeParcelable.Param(mo65742id = 5) String str, @SafeParcelable.Param(mo65742id = 6) ClientAppContext clientAppContext) {
        zzr zzr;
        zzy zzy;
        this.zza = i;
        if (iBinder == null) {
            zzr = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            zzr = queryLocalInterface instanceof zzr ? (zzr) queryLocalInterface : new zzp(iBinder);
        }
        this.zzb = zzr;
        if (iBinder2 == null) {
            zzy = null;
        } else {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IStatusCallback");
            zzy = queryLocalInterface2 instanceof zzy ? (zzy) queryLocalInterface2 : new zzw(iBinder2);
        }
        this.zzc = zzy;
        this.zzd = z;
        this.zze = str;
        this.zzf = ClientAppContext.zza(clientAppContext, (String) null, str, false);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeIBinder(parcel, 2, this.zzb.asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 3, this.zzc.asBinder(), false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @VisibleForTesting
    public zzcb(IBinder iBinder, IBinder iBinder2) {
        this(1, iBinder, iBinder2, false, (String) null, (ClientAppContext) null);
    }
}
