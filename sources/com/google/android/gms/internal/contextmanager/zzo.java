package com.google.android.gms.internal.contextmanager;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.appboy.support.StringUtils;
import com.google.android.gms.awareness.state.BeaconState;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import p001a0.C0017h;

@SafeParcelable.Class(creator = "TypeFilterImplCreator")
@SafeParcelable.Reserved({1})
public final class zzo extends BeaconState.TypeFilter {
    public static final Parcelable.Creator<zzo> CREATOR = new zzat();
    @SafeParcelable.Field(getter = "getTypeFilterAsBytes", mo65739id = 2, type = "byte[]")
    private final zzdj zza;

    public zzo(String str, String str2) {
        zzdi zza2 = zzdj.zza();
        zza2.zzb(Preconditions.checkNotEmpty(str));
        zza2.zzc(Preconditions.checkNotEmpty(str2));
        this.zza = (zzdj) zza2.zzs();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzo)) {
            return false;
        }
        zzo zzo = (zzo) obj;
        if (!TextUtils.equals(zzb(), zzo.zzb()) || !TextUtils.equals(zzc(), zzo.zzc()) || !Arrays.equals(zzd(), zzo.zzd())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object[] objArr = new Object[3];
        int i = 0;
        objArr[0] = zzb();
        objArr[1] = zzc();
        if (zzd() != null) {
            i = Arrays.hashCode(zzd());
        }
        objArr[2] = Integer.valueOf(i);
        return Objects.hashCode(objArr);
    }

    public final String toString() {
        String str;
        byte[] zzd = zzd();
        String zzb = zzb();
        String zzc = zzc();
        if (zzd == null) {
            str = StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
        } else {
            str = new String(zzd);
        }
        StringBuilder sb = new StringBuilder(C16530d.m42011d(String.valueOf(zzb).length(), 4, String.valueOf(zzc).length(), str.length()));
        C0017h.m61R(sb, "(", zzb, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, zzc);
        return C13715c.m34245k(sb, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, str, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 2, this.zza.zzt(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final zzdj zza() {
        return this.zza;
    }

    public final String zzb() {
        zzdj zzdj = this.zza;
        if (zzdj == null) {
            return null;
        }
        return zzdj.zze();
    }

    public final String zzc() {
        zzdj zzdj = this.zza;
        if (zzdj == null) {
            return null;
        }
        return zzdj.zzg();
    }

    public final byte[] zzd() {
        zzdj zzdj = this.zza;
        if (zzdj == null || zzdj.zzd().zzd() == 0) {
            return null;
        }
        return this.zza.zzd().zzq();
    }

    public zzo(String str, String str2, byte[] bArr) {
        zzdi zza2 = zzdj.zza();
        zza2.zzb(Preconditions.checkNotEmpty(str));
        zza2.zzc(Preconditions.checkNotEmpty(str2));
        zza2.zza(zzld.zzm(bArr));
        this.zza = (zzdj) zza2.zzs();
    }

    @SafeParcelable.Constructor
    public zzo(@SafeParcelable.Param(mo65742id = 2) byte[] bArr) {
        zzdj zzdj;
        try {
            zzdj = zzdj.zzc(bArr, zzlp.zzb());
        } catch (zzmp unused) {
            zzj.zza("BeaconStateImpl", "Could not deserialize BeaconFence.BeaconTypeFilter");
            zzdj = null;
        }
        this.zza = (zzdj) Preconditions.checkNotNull(zzdj);
    }
}
