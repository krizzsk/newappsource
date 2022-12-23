package com.google.android.gms.internal.contextmanager;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.awareness.fence.zza;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "UpdateFenceOperationCreator")
@SafeParcelable.Reserved({1})
public final class zzcc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcc> CREATOR = new zzcd();
    @SafeParcelable.Field(mo65739id = 2)
    public final int zza;
    @SafeParcelable.Field(mo65739id = 3)
    public final zzbh zzb;
    @SafeParcelable.Field(getter = "getListenerAsBinder", mo65739id = 4, type = "android.os.IBinder")
    public final zzbw zzc;
    public final zza zzd;
    @SafeParcelable.Field(mo65739id = 5)
    public final PendingIntent zze;
    @SafeParcelable.Field(mo65739id = 6)
    public final String zzf;
    @SafeParcelable.Field(mo65739id = 7)
    public final long zzg;
    @SafeParcelable.Field(mo65739id = 8)
    public final long zzh;

    @SafeParcelable.Constructor
    public zzcc(@SafeParcelable.Param(mo65742id = 2) int i, @SafeParcelable.Param(mo65742id = 3) zzbh zzbh, @SafeParcelable.Param(mo65742id = 4) IBinder iBinder, @SafeParcelable.Param(mo65742id = 5) PendingIntent pendingIntent, @SafeParcelable.Param(mo65742id = 6) String str, @SafeParcelable.Param(mo65742id = 7) long j, @SafeParcelable.Param(mo65742id = 8) long j2) {
        zzbw zzbw;
        this.zza = i;
        this.zzb = zzbh;
        if (iBinder == null) {
            zzbw = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.contextmanager.fence.internal.IContextFenceListener");
            if (queryLocalInterface instanceof zzbw) {
                zzbw = (zzbw) queryLocalInterface;
            } else {
                zzbw = new zzbu(iBinder);
            }
        }
        this.zzc = zzbw;
        this.zzd = null;
        this.zze = pendingIntent;
        this.zzf = str;
        this.zzg = j;
        this.zzh = j2;
    }

    public static final zzcc zza(String str, long j, zzbj zzbj, PendingIntent pendingIntent) {
        return new zzcc(2, new zzbh(Preconditions.checkNotEmpty(str), (zzbj) Preconditions.checkNotNull(zzbj), 0), (zza) null, pendingIntent, (String) null, -1, -1);
    }

    public static final zzcc zzb(PendingIntent pendingIntent) {
        return new zzcc(4, (zzbh) null, (zza) null, pendingIntent, (String) null, -1, -1);
    }

    public static final zzcc zzc(String str) {
        return new zzcc(5, (zzbh) null, (zza) null, (PendingIntent) null, str, -1, -1);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zza);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzb, i, false);
        zzbw zzbw = this.zzc;
        if (zzbw == null) {
            iBinder = null;
        } else {
            iBinder = zzbw.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 4, iBinder, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zze, i, false);
        SafeParcelWriter.writeString(parcel, 6, this.zzf, false);
        SafeParcelWriter.writeLong(parcel, 7, this.zzg);
        SafeParcelWriter.writeLong(parcel, 8, this.zzh);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private zzcc(int i, zzbh zzbh, zza zza2, PendingIntent pendingIntent, String str, long j, long j2) {
        this.zza = i;
        this.zzb = zzbh;
        this.zzc = null;
        this.zzd = null;
        this.zze = pendingIntent;
        this.zzf = str;
        this.zzg = -1;
        this.zzh = -1;
    }
}
