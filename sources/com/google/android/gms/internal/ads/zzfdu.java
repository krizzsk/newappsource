package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "PoolConfigurationCreator")
public final class zzfdu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfdu> CREATOR = new zzfdv();
    public final Context zza;
    public final zzfdr zzb;
    @SafeParcelable.Field(mo65739id = 2)
    public final int zzc;
    @SafeParcelable.Field(mo65739id = 3)
    public final int zzd;
    @SafeParcelable.Field(mo65739id = 4)
    public final int zze;
    @SafeParcelable.Field(mo65739id = 5)
    public final String zzf;
    public final int zzg;
    private final zzfdr[] zzh;
    @SafeParcelable.Field(getter = "getFormatInt", mo65739id = 1)
    private final int zzi;
    @SafeParcelable.Field(getter = "getPoolDiscardStrategyInt", mo65739id = 6)
    private final int zzj;
    @SafeParcelable.Field(getter = "getPrecacheStartTriggerInt", mo65739id = 7)
    private final int zzk;
    private final int[] zzl;
    private final int[] zzm;

    @SafeParcelable.Constructor
    public zzfdu(@SafeParcelable.Param(mo65742id = 1) int i, @SafeParcelable.Param(mo65742id = 2) int i2, @SafeParcelable.Param(mo65742id = 3) int i3, @SafeParcelable.Param(mo65742id = 4) int i4, @SafeParcelable.Param(mo65742id = 5) String str, @SafeParcelable.Param(mo65742id = 6) int i5, @SafeParcelable.Param(mo65742id = 7) int i6) {
        zzfdr[] values = zzfdr.values();
        this.zzh = values;
        int[] zza2 = zzfds.zza();
        this.zzl = zza2;
        int[] zza3 = zzfdt.zza();
        this.zzm = zza3;
        this.zza = null;
        this.zzi = i;
        this.zzb = values[i];
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = str;
        this.zzj = i5;
        this.zzg = zza2[i5];
        this.zzk = i6;
        int i7 = zza3[i6];
    }

    public static zzfdu zza(zzfdr zzfdr, Context context) {
        if (zzfdr == zzfdr.Rewarded) {
            return new zzfdu(context, zzfdr, ((Integer) zzay.zzc().zzb(zzbhy.zzfp)).intValue(), ((Integer) zzay.zzc().zzb(zzbhy.zzfv)).intValue(), ((Integer) zzay.zzc().zzb(zzbhy.zzfx)).intValue(), (String) zzay.zzc().zzb(zzbhy.zzfz), (String) zzay.zzc().zzb(zzbhy.zzfr), (String) zzay.zzc().zzb(zzbhy.zzft));
        } else if (zzfdr == zzfdr.Interstitial) {
            return new zzfdu(context, zzfdr, ((Integer) zzay.zzc().zzb(zzbhy.zzfq)).intValue(), ((Integer) zzay.zzc().zzb(zzbhy.zzfw)).intValue(), ((Integer) zzay.zzc().zzb(zzbhy.zzfy)).intValue(), (String) zzay.zzc().zzb(zzbhy.zzfA), (String) zzay.zzc().zzb(zzbhy.zzfs), (String) zzay.zzc().zzb(zzbhy.zzfu));
        } else if (zzfdr != zzfdr.AppOpen) {
            return null;
        } else {
            return new zzfdu(context, zzfdr, ((Integer) zzay.zzc().zzb(zzbhy.zzfD)).intValue(), ((Integer) zzay.zzc().zzb(zzbhy.zzfF)).intValue(), ((Integer) zzay.zzc().zzb(zzbhy.zzfG)).intValue(), (String) zzay.zzc().zzb(zzbhy.zzfB), (String) zzay.zzc().zzb(zzbhy.zzfC), (String) zzay.zzc().zzb(zzbhy.zzfE));
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzi);
        SafeParcelWriter.writeInt(parcel, 2, this.zzc);
        SafeParcelWriter.writeInt(parcel, 3, this.zzd);
        SafeParcelWriter.writeInt(parcel, 4, this.zze);
        SafeParcelWriter.writeString(parcel, 5, this.zzf, false);
        SafeParcelWriter.writeInt(parcel, 6, this.zzj);
        SafeParcelWriter.writeInt(parcel, 7, this.zzk);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private zzfdu(Context context, zzfdr zzfdr, int i, int i2, int i3, String str, String str2, String str3) {
        this.zzh = zzfdr.values();
        this.zzl = zzfds.zza();
        this.zzm = zzfdt.zza();
        this.zza = context;
        this.zzi = zzfdr.ordinal();
        this.zzb = zzfdr;
        this.zzc = i;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = str;
        int i4 = 2;
        if ("oldest".equals(str2)) {
            i4 = 1;
        } else if (!"lru".equals(str2) && "lfu".equals(str2)) {
            i4 = 3;
        }
        this.zzg = i4;
        this.zzj = i4 - 1;
        "onAdClosed".equals(str3);
        this.zzk = 0;
    }
}
