package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.internal.client.zzfg;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "NativeAdOptionsParcelCreator")
public final class zzbko extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbko> CREATOR = new zzbkp();
    @SafeParcelable.Field(mo65739id = 1)
    public final int zza;
    @SafeParcelable.Field(mo65739id = 2)
    public final boolean zzb;
    @SafeParcelable.Field(mo65739id = 3)
    public final int zzc;
    @SafeParcelable.Field(mo65739id = 4)
    public final boolean zzd;
    @SafeParcelable.Field(mo65739id = 5)
    public final int zze;
    @SafeParcelable.Field(mo65739id = 6)
    public final zzfg zzf;
    @SafeParcelable.Field(mo65739id = 7)
    public final boolean zzg;
    @SafeParcelable.Field(mo65739id = 8)
    public final int zzh;

    @SafeParcelable.Constructor
    public zzbko(@SafeParcelable.Param(mo65742id = 1) int i, @SafeParcelable.Param(mo65742id = 2) boolean z, @SafeParcelable.Param(mo65742id = 3) int i2, @SafeParcelable.Param(mo65742id = 4) boolean z2, @SafeParcelable.Param(mo65742id = 5) int i3, @SafeParcelable.Param(mo65742id = 6) zzfg zzfg, @SafeParcelable.Param(mo65742id = 7) boolean z3, @SafeParcelable.Param(mo65742id = 8) int i4) {
        this.zza = i;
        this.zzb = z;
        this.zzc = i2;
        this.zzd = z2;
        this.zze = i3;
        this.zzf = zzfg;
        this.zzg = z3;
        this.zzh = i4;
    }

    public static NativeAdOptions zza(zzbko zzbko) {
        NativeAdOptions.Builder builder = new NativeAdOptions.Builder();
        if (zzbko == null) {
            return builder.build();
        }
        int i = zzbko.zza;
        if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    builder.setRequestCustomMuteThisAd(zzbko.zzg);
                    builder.setMediaAspectRatio(zzbko.zzh);
                }
                builder.setReturnUrlsForImageAssets(zzbko.zzb);
                builder.setRequestMultipleImages(zzbko.zzd);
                return builder.build();
            }
            zzfg zzfg = zzbko.zzf;
            if (zzfg != null) {
                builder.setVideoOptions(new VideoOptions(zzfg));
            }
        }
        builder.setAdChoicesPlacement(zzbko.zze);
        builder.setReturnUrlsForImageAssets(zzbko.zzb);
        builder.setRequestMultipleImages(zzbko.zzd);
        return builder.build();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        SafeParcelWriter.writeInt(parcel, 5, this.zze);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zzg);
        SafeParcelWriter.writeInt(parcel, 8, this.zzh);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public zzbko(com.google.android.gms.ads.formats.NativeAdOptions nativeAdOptions) {
        this(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), nativeAdOptions.getImageOrientation(), nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new zzfg(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zza(), nativeAdOptions.getMediaAspectRatio());
    }
}
