package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
import p001a0.C0017h;

@KeepForSdk
@SafeParcelable.Class(creator = "WakeLockEventCreator")
@Deprecated
public final class WakeLockEvent extends StatsEvent {
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new zza();
    @SafeParcelable.VersionField(mo65748id = 1)
    public final int zza;
    @SafeParcelable.Field(getter = "getTimeMillis", mo65739id = 2)
    private final long zzb;
    @SafeParcelable.Field(getter = "getEventType", mo65739id = 11)
    private int zzc;
    @SafeParcelable.Field(getter = "getWakeLockName", mo65739id = 4)
    private final String zzd;
    @SafeParcelable.Field(getter = "getSecondaryWakeLockName", mo65739id = 10)
    private final String zze;
    @SafeParcelable.Field(getter = "getCodePackage", mo65739id = 17)
    private final String zzf;
    @SafeParcelable.Field(getter = "getWakeLockType", mo65739id = 5)
    private final int zzg;
    @SafeParcelable.Field(getter = "getCallingPackages", mo65739id = 6)
    private final List zzh;
    @SafeParcelable.Field(getter = "getEventKey", mo65739id = 12)
    private final String zzi;
    @SafeParcelable.Field(getter = "getElapsedRealtime", mo65739id = 8)
    private final long zzj;
    @SafeParcelable.Field(getter = "getDeviceState", mo65739id = 14)
    private int zzk;
    @SafeParcelable.Field(getter = "getHostPackage", mo65739id = 13)
    private final String zzl;
    @SafeParcelable.Field(getter = "getBeginPowerPercentage", mo65739id = 15)
    private final float zzm;
    @SafeParcelable.Field(getter = "getTimeout", mo65739id = 16)
    private final long zzn;
    @SafeParcelable.Field(getter = "getAcquiredWithTimeout", mo65739id = 18)
    private final boolean zzo;
    private long zzp = -1;

    @SafeParcelable.Constructor
    public WakeLockEvent(@SafeParcelable.Param(mo65742id = 1) int i, @SafeParcelable.Param(mo65742id = 2) long j, @SafeParcelable.Param(mo65742id = 11) int i2, @SafeParcelable.Param(mo65742id = 4) String str, @SafeParcelable.Param(mo65742id = 5) int i3, @SafeParcelable.Param(mo65742id = 6) List list, @SafeParcelable.Param(mo65742id = 12) String str2, @SafeParcelable.Param(mo65742id = 8) long j2, @SafeParcelable.Param(mo65742id = 14) int i4, @SafeParcelable.Param(mo65742id = 10) String str3, @SafeParcelable.Param(mo65742id = 13) String str4, @SafeParcelable.Param(mo65742id = 15) float f, @SafeParcelable.Param(mo65742id = 16) long j3, @SafeParcelable.Param(mo65742id = 17) String str5, @SafeParcelable.Param(mo65742id = 18) boolean z) {
        this.zza = i;
        this.zzb = j;
        this.zzc = i2;
        this.zzd = str;
        this.zze = str3;
        this.zzf = str5;
        this.zzg = i3;
        this.zzh = list;
        this.zzi = str2;
        this.zzj = j2;
        this.zzk = i4;
        this.zzl = str4;
        this.zzm = f;
        this.zzn = j3;
        this.zzo = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeInt(parcel, 5, this.zzg);
        SafeParcelWriter.writeStringList(parcel, 6, this.zzh, false);
        SafeParcelWriter.writeLong(parcel, 8, this.zzj);
        SafeParcelWriter.writeString(parcel, 10, this.zze, false);
        SafeParcelWriter.writeInt(parcel, 11, this.zzc);
        SafeParcelWriter.writeString(parcel, 12, this.zzi, false);
        SafeParcelWriter.writeString(parcel, 13, this.zzl, false);
        SafeParcelWriter.writeInt(parcel, 14, this.zzk);
        SafeParcelWriter.writeFloat(parcel, 15, this.zzm);
        SafeParcelWriter.writeLong(parcel, 16, this.zzn);
        SafeParcelWriter.writeString(parcel, 17, this.zzf, false);
        SafeParcelWriter.writeBoolean(parcel, 18, this.zzo);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zza() {
        return this.zzc;
    }

    public final long zzb() {
        return this.zzp;
    }

    public final long zzc() {
        return this.zzb;
    }

    public final String zzd() {
        String str;
        List list = this.zzh;
        String str2 = this.zzd;
        int i = this.zzg;
        String str3 = "";
        if (list == null) {
            str = str3;
        } else {
            str = TextUtils.join(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, list);
        }
        int i2 = this.zzk;
        String str4 = this.zze;
        if (str4 == null) {
            str4 = str3;
        }
        String str5 = this.zzl;
        if (str5 == null) {
            str5 = str3;
        }
        float f = this.zzm;
        String str6 = this.zzf;
        if (str6 != null) {
            str3 = str6;
        }
        boolean z = this.zzo;
        StringBuilder sb = new StringBuilder();
        sb.append("\t");
        sb.append(str2);
        sb.append("\t");
        sb.append(i);
        sb.append("\t");
        sb.append(str);
        sb.append("\t");
        sb.append(i2);
        sb.append("\t");
        C0017h.m61R(sb, str4, "\t", str5, "\t");
        sb.append(f);
        sb.append("\t");
        sb.append(str3);
        sb.append("\t");
        sb.append(z);
        return sb.toString();
    }
}
