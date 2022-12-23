package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "UnsubscribeRequestCreator")
public final class zzcg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcg> CREATOR = new zzch();
    @SafeParcelable.VersionField(mo65748id = 1)
    public final int zza;
    @SafeParcelable.Field(getter = "getMessageListenerAsBinder", mo65739id = 2, type = "android.os.IBinder")
    public final zzo zzb;
    @SafeParcelable.Field(getter = "getCallbackAsBinder", mo65739id = 3, type = "android.os.IBinder")
    public final zzr zzc;
    @SafeParcelable.Field(mo65739id = 4)
    public final PendingIntent zzd;
    @SafeParcelable.Field(mo65739id = 5)
    @Deprecated
    public final int zze;
    @SafeParcelable.Field(mo65739id = 6)
    @Deprecated
    public final String zzf;
    @SafeParcelable.Field(mo65739id = 7)
    @Deprecated
    public final String zzg;
    @SafeParcelable.Field(mo65739id = 8)
    @Deprecated
    public final boolean zzh;
    @SafeParcelable.Field(mo65739id = 9)
    @Deprecated
    public final ClientAppContext zzi;

    @SafeParcelable.Constructor
    public zzcg(@SafeParcelable.Param(mo65742id = 1) int i, @SafeParcelable.Param(mo65742id = 2) IBinder iBinder, @SafeParcelable.Param(mo65742id = 3) IBinder iBinder2, @SafeParcelable.Param(mo65742id = 4) PendingIntent pendingIntent, @SafeParcelable.Param(mo65742id = 5) int i2, @SafeParcelable.Param(mo65742id = 6) String str, @SafeParcelable.Param(mo65742id = 7) String str2, @SafeParcelable.Param(mo65742id = 8) boolean z, @SafeParcelable.Param(mo65742id = 9) ClientAppContext clientAppContext) {
        zzo zzo;
        this.zza = i;
        zzr zzr = null;
        if (iBinder == null) {
            zzo = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IMessageListener");
            zzo = queryLocalInterface instanceof zzo ? (zzo) queryLocalInterface : new zzm(iBinder);
        }
        this.zzb = zzo;
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            zzr = queryLocalInterface2 instanceof zzr ? (zzr) queryLocalInterface2 : new zzp(iBinder2);
        }
        this.zzc = zzr;
        this.zzd = pendingIntent;
        this.zze = i2;
        this.zzf = str;
        this.zzg = str2;
        this.zzh = z;
        this.zzi = ClientAppContext.zza(clientAppContext, str2, str, z);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        zzo zzo = this.zzb;
        if (zzo == null) {
            iBinder = null;
        } else {
            iBinder = zzo.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 2, iBinder, false);
        SafeParcelWriter.writeIBinder(parcel, 3, this.zzc.asBinder(), false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i, false);
        SafeParcelWriter.writeInt(parcel, 5, this.zze);
        SafeParcelWriter.writeString(parcel, 6, this.zzf, false);
        SafeParcelWriter.writeString(parcel, 7, this.zzg, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzh);
        SafeParcelWriter.writeParcelable(parcel, 9, this.zzi, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzcg(IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent) {
        this(1, iBinder, iBinder2, pendingIntent, 0, (String) null, (String) null, false, (ClientAppContext) null);
    }
}
