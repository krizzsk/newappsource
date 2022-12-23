package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbnl;
import com.google.android.gms.internal.ads.zzbnn;
import com.google.android.gms.internal.ads.zzcfo;
import com.google.android.gms.internal.ads.zzcli;
import com.google.android.gms.internal.ads.zzdcf;
import com.google.android.gms.internal.ads.zzdjf;
import com.google.android.gms.internal.ads.zzdwg;
import com.google.android.gms.internal.ads.zzeen;
import com.google.android.gms.internal.ads.zzfgo;

@SafeParcelable.Class(creator = "AdOverlayInfoCreator")
@SafeParcelable.Reserved({1})
public final class AdOverlayInfoParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new zzn();
    @SafeParcelable.Field(mo65739id = 2)
    public final zzc zza;
    @SafeParcelable.Field(getter = "getAdClickListenerAsBinder", mo65739id = 3, type = "android.os.IBinder")
    public final zza zzb;
    @SafeParcelable.Field(getter = "getAdOverlayListenerAsBinder", mo65739id = 4, type = "android.os.IBinder")
    public final zzo zzc;
    @SafeParcelable.Field(getter = "getAdWebViewAsBinder", mo65739id = 5, type = "android.os.IBinder")
    public final zzcli zzd;
    @SafeParcelable.Field(getter = "getAppEventGmsgListenerAsBinder", mo65739id = 6, type = "android.os.IBinder")
    public final zzbnn zze;
    @SafeParcelable.Field(mo65739id = 7)
    public final String zzf;
    @SafeParcelable.Field(mo65739id = 8)
    public final boolean zzg;
    @SafeParcelable.Field(mo65739id = 9)
    public final String zzh;
    @SafeParcelable.Field(getter = "getLeaveApplicationListenerAsBinder", mo65739id = 10, type = "android.os.IBinder")
    public final zzw zzi;
    @SafeParcelable.Field(mo65739id = 11)
    public final int zzj;
    @SafeParcelable.Field(mo65739id = 12)
    public final int zzk;
    @SafeParcelable.Field(mo65739id = 13)
    public final String zzl;
    @SafeParcelable.Field(mo65739id = 14)
    public final zzcfo zzm;
    @SafeParcelable.Field(mo65739id = 16)
    public final String zzn;
    @SafeParcelable.Field(mo65739id = 17)
    public final zzj zzo;
    @SafeParcelable.Field(getter = "getAdMetadataGmsgListenerAsBinder", mo65739id = 18, type = "android.os.IBinder")
    public final zzbnl zzp;
    @SafeParcelable.Field(mo65739id = 19)
    public final String zzq;
    @SafeParcelable.Field(getter = "getOfflineDatabaseManagerAsBinder", mo65739id = 20, type = "android.os.IBinder")
    public final zzeen zzr;
    @SafeParcelable.Field(getter = "getCsiReporterAsBinder", mo65739id = 21, type = "android.os.IBinder")
    public final zzdwg zzs;
    @SafeParcelable.Field(getter = "getLoggerAsBinder", mo65739id = 22, type = "android.os.IBinder")
    public final zzfgo zzt;
    @SafeParcelable.Field(getter = "getWorkManagerUtilAsBinder", mo65739id = 23, type = "android.os.IBinder")
    public final zzbr zzu;
    @SafeParcelable.Field(mo65739id = 24)
    public final String zzv;
    @SafeParcelable.Field(mo65739id = 25)
    public final String zzw;
    @SafeParcelable.Field(getter = "getAdFailedToShowEventEmitterAsBinder", mo65739id = 26, type = "android.os.IBinder")
    public final zzdcf zzx;
    @SafeParcelable.Field(getter = "getPhysicalClickListenerAsBinder", mo65739id = 27, type = "android.os.IBinder")
    public final zzdjf zzy;

    public AdOverlayInfoParcel(zza zza2, zzo zzo2, zzbnl zzbnl, zzbnn zzbnn, zzw zzw2, zzcli zzcli, boolean z, int i, String str, zzcfo zzcfo, zzdjf zzdjf) {
        this.zza = null;
        this.zzb = zza2;
        this.zzc = zzo2;
        this.zzd = zzcli;
        this.zzp = zzbnl;
        this.zze = zzbnn;
        this.zzf = null;
        this.zzg = z;
        this.zzh = null;
        this.zzi = zzw2;
        this.zzj = i;
        this.zzk = 3;
        this.zzl = str;
        this.zzm = zzcfo;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzv = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzw = null;
        this.zzx = null;
        this.zzy = zzdjf;
    }

    public static AdOverlayInfoParcel zza(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception unused) {
            return null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zza, i, false);
        SafeParcelWriter.writeIBinder(parcel, 3, ObjectWrapper.wrap(this.zzb).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 4, ObjectWrapper.wrap(this.zzc).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 5, ObjectWrapper.wrap(this.zzd).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 6, ObjectWrapper.wrap(this.zze).asBinder(), false);
        SafeParcelWriter.writeString(parcel, 7, this.zzf, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzg);
        SafeParcelWriter.writeString(parcel, 9, this.zzh, false);
        SafeParcelWriter.writeIBinder(parcel, 10, ObjectWrapper.wrap(this.zzi).asBinder(), false);
        SafeParcelWriter.writeInt(parcel, 11, this.zzj);
        SafeParcelWriter.writeInt(parcel, 12, this.zzk);
        SafeParcelWriter.writeString(parcel, 13, this.zzl, false);
        SafeParcelWriter.writeParcelable(parcel, 14, this.zzm, i, false);
        SafeParcelWriter.writeString(parcel, 16, this.zzn, false);
        SafeParcelWriter.writeParcelable(parcel, 17, this.zzo, i, false);
        SafeParcelWriter.writeIBinder(parcel, 18, ObjectWrapper.wrap(this.zzp).asBinder(), false);
        SafeParcelWriter.writeString(parcel, 19, this.zzq, false);
        SafeParcelWriter.writeIBinder(parcel, 20, ObjectWrapper.wrap(this.zzr).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 21, ObjectWrapper.wrap(this.zzs).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 22, ObjectWrapper.wrap(this.zzt).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 23, ObjectWrapper.wrap(this.zzu).asBinder(), false);
        SafeParcelWriter.writeString(parcel, 24, this.zzv, false);
        SafeParcelWriter.writeString(parcel, 25, this.zzw, false);
        SafeParcelWriter.writeIBinder(parcel, 26, ObjectWrapper.wrap(this.zzx).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 27, ObjectWrapper.wrap(this.zzy).asBinder(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public AdOverlayInfoParcel(zza zza2, zzo zzo2, zzbnl zzbnl, zzbnn zzbnn, zzw zzw2, zzcli zzcli, boolean z, int i, String str, String str2, zzcfo zzcfo, zzdjf zzdjf) {
        this.zza = null;
        this.zzb = zza2;
        this.zzc = zzo2;
        this.zzd = zzcli;
        this.zzp = zzbnl;
        this.zze = zzbnn;
        this.zzf = str2;
        this.zzg = z;
        this.zzh = str;
        this.zzi = zzw2;
        this.zzj = i;
        this.zzk = 3;
        this.zzl = null;
        this.zzm = zzcfo;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzv = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzw = null;
        this.zzx = null;
        this.zzy = zzdjf;
    }

    public AdOverlayInfoParcel(zza zza2, zzo zzo2, zzw zzw2, zzcli zzcli, int i, zzcfo zzcfo, String str, zzj zzj2, String str2, String str3, String str4, zzdcf zzdcf) {
        this.zza = null;
        this.zzb = null;
        this.zzc = zzo2;
        this.zzd = zzcli;
        this.zzp = null;
        this.zze = null;
        this.zzg = false;
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzaC)).booleanValue()) {
            this.zzf = null;
            this.zzh = null;
        } else {
            this.zzf = str2;
            this.zzh = str3;
        }
        this.zzi = null;
        this.zzj = i;
        this.zzk = 1;
        this.zzl = null;
        this.zzm = zzcfo;
        this.zzn = str;
        this.zzo = zzj2;
        this.zzq = null;
        this.zzv = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzw = str4;
        this.zzx = zzdcf;
        this.zzy = null;
    }

    public AdOverlayInfoParcel(zza zza2, zzo zzo2, zzw zzw2, zzcli zzcli, boolean z, int i, zzcfo zzcfo, zzdjf zzdjf) {
        this.zza = null;
        this.zzb = zza2;
        this.zzc = zzo2;
        this.zzd = zzcli;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = z;
        this.zzh = null;
        this.zzi = zzw2;
        this.zzj = i;
        this.zzk = 2;
        this.zzl = null;
        this.zzm = zzcfo;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzv = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzw = null;
        this.zzx = null;
        this.zzy = zzdjf;
    }

    @SafeParcelable.Constructor
    public AdOverlayInfoParcel(@SafeParcelable.Param(mo65742id = 2) zzc zzc2, @SafeParcelable.Param(mo65742id = 3) IBinder iBinder, @SafeParcelable.Param(mo65742id = 4) IBinder iBinder2, @SafeParcelable.Param(mo65742id = 5) IBinder iBinder3, @SafeParcelable.Param(mo65742id = 6) IBinder iBinder4, @SafeParcelable.Param(mo65742id = 7) String str, @SafeParcelable.Param(mo65742id = 8) boolean z, @SafeParcelable.Param(mo65742id = 9) String str2, @SafeParcelable.Param(mo65742id = 10) IBinder iBinder5, @SafeParcelable.Param(mo65742id = 11) int i, @SafeParcelable.Param(mo65742id = 12) int i2, @SafeParcelable.Param(mo65742id = 13) String str3, @SafeParcelable.Param(mo65742id = 14) zzcfo zzcfo, @SafeParcelable.Param(mo65742id = 16) String str4, @SafeParcelable.Param(mo65742id = 17) zzj zzj2, @SafeParcelable.Param(mo65742id = 18) IBinder iBinder6, @SafeParcelable.Param(mo65742id = 19) String str5, @SafeParcelable.Param(mo65742id = 20) IBinder iBinder7, @SafeParcelable.Param(mo65742id = 21) IBinder iBinder8, @SafeParcelable.Param(mo65742id = 22) IBinder iBinder9, @SafeParcelable.Param(mo65742id = 23) IBinder iBinder10, @SafeParcelable.Param(mo65742id = 24) String str6, @SafeParcelable.Param(mo65742id = 25) String str7, @SafeParcelable.Param(mo65742id = 26) IBinder iBinder11, @SafeParcelable.Param(mo65742id = 27) IBinder iBinder12) {
        this.zza = zzc2;
        this.zzb = (zza) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder));
        this.zzc = (zzo) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder2));
        this.zzd = (zzcli) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder3));
        this.zzp = (zzbnl) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder6));
        this.zze = (zzbnn) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder4));
        this.zzf = str;
        this.zzg = z;
        this.zzh = str2;
        this.zzi = (zzw) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder5));
        this.zzj = i;
        this.zzk = i2;
        this.zzl = str3;
        this.zzm = zzcfo;
        this.zzn = str4;
        this.zzo = zzj2;
        this.zzq = str5;
        this.zzv = str6;
        this.zzr = (zzeen) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder7));
        this.zzs = (zzdwg) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder8));
        this.zzt = (zzfgo) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder9));
        this.zzu = (zzbr) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder10));
        this.zzw = str7;
        this.zzx = (zzdcf) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder11));
        this.zzy = (zzdjf) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder12));
    }

    public AdOverlayInfoParcel(zzc zzc2, zza zza2, zzo zzo2, zzw zzw2, zzcfo zzcfo, zzcli zzcli, zzdjf zzdjf) {
        this.zza = zzc2;
        this.zzb = zza2;
        this.zzc = zzo2;
        this.zzd = zzcli;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = zzw2;
        this.zzj = -1;
        this.zzk = 4;
        this.zzl = null;
        this.zzm = zzcfo;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzv = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzw = null;
        this.zzx = null;
        this.zzy = zzdjf;
    }

    public AdOverlayInfoParcel(zzo zzo2, zzcli zzcli, int i, zzcfo zzcfo) {
        this.zzc = zzo2;
        this.zzd = zzcli;
        this.zzj = 1;
        this.zzm = zzcfo;
        this.zza = null;
        this.zzb = null;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = null;
        this.zzk = 1;
        this.zzl = null;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzv = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzw = null;
        this.zzx = null;
        this.zzy = null;
    }

    public AdOverlayInfoParcel(zzcli zzcli, zzcfo zzcfo, zzbr zzbr, zzeen zzeen, zzdwg zzdwg, zzfgo zzfgo, String str, String str2, int i) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzcli;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = null;
        this.zzj = 14;
        this.zzk = 5;
        this.zzl = null;
        this.zzm = zzcfo;
        this.zzn = null;
        this.zzo = null;
        this.zzq = str;
        this.zzv = str2;
        this.zzr = zzeen;
        this.zzs = zzdwg;
        this.zzt = zzfgo;
        this.zzu = zzbr;
        this.zzw = null;
        this.zzx = null;
        this.zzy = null;
    }
}
