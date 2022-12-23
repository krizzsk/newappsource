package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.messages.Strategy;

@SafeParcelable.Class(creator = "PublishRequestCreator")
public final class zzbz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbz> CREATOR = new zzca();
    @SafeParcelable.VersionField(mo65748id = 1)
    public final int zza;
    @SafeParcelable.Field(mo65739id = 2)
    public final zzae zzb;
    @SafeParcelable.Field(mo65739id = 3)
    public final Strategy zzc;
    @SafeParcelable.Field(getter = "getCallbackAsBinder", mo65739id = 4, type = "android.os.IBinder")
    public final zzr zzd;
    @SafeParcelable.Field(mo65739id = 5)
    @Deprecated
    public final String zze;
    @SafeParcelable.Field(mo65739id = 6)
    @Deprecated
    public final String zzf;
    @SafeParcelable.Field(mo65739id = 7)
    @Deprecated
    public final boolean zzg;
    @SafeParcelable.Field(getter = "getPublishCallbackAsBinder", mo65739id = 8, type = "android.os.IBinder")
    public final zzv zzh;
    @SafeParcelable.Field(mo65739id = 9)
    @Deprecated
    public final boolean zzi;
    @SafeParcelable.Field(mo65739id = 10)
    @Deprecated
    public final ClientAppContext zzj;
    @SafeParcelable.Field(mo65739id = 11)
    public final int zzk;

    @SafeParcelable.Constructor
    public zzbz(@SafeParcelable.Param(mo65742id = 1) int i, @SafeParcelable.Param(mo65742id = 2) zzae zzae, @SafeParcelable.Param(mo65742id = 3) Strategy strategy, @SafeParcelable.Param(mo65742id = 4) IBinder iBinder, @SafeParcelable.Param(mo65742id = 5) String str, @SafeParcelable.Param(mo65742id = 6) String str2, @SafeParcelable.Param(mo65742id = 7) boolean z, @SafeParcelable.Param(mo65742id = 8) IBinder iBinder2, @SafeParcelable.Param(mo65742id = 9) boolean z2, @SafeParcelable.Param(mo65742id = 10) ClientAppContext clientAppContext, @SafeParcelable.Param(mo65742id = 11) int i2) {
        zzr zzr;
        this.zza = i;
        this.zzb = zzae;
        this.zzc = strategy;
        zzv zzv = null;
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
        this.zzd = zzr;
        this.zze = str;
        this.zzf = str2;
        this.zzg = z;
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IPublishCallback");
            if (queryLocalInterface2 instanceof zzv) {
                zzv = (zzv) queryLocalInterface2;
            } else {
                zzv = new zzt(iBinder2);
            }
        }
        this.zzh = zzv;
        this.zzi = z2;
        this.zzj = ClientAppContext.zza(clientAppContext, str2, str, z2);
        this.zzk = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i, false);
        SafeParcelWriter.writeIBinder(parcel, 4, this.zzd.asBinder(), false);
        SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        SafeParcelWriter.writeString(parcel, 6, this.zzf, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zzg);
        zzv zzv = this.zzh;
        if (zzv == null) {
            iBinder = null;
        } else {
            iBinder = zzv.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 8, iBinder, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzi);
        SafeParcelWriter.writeParcelable(parcel, 10, this.zzj, i, false);
        SafeParcelWriter.writeInt(parcel, 11, this.zzk);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
