package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.appboy.support.StringUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.messages.internal.zzc;
import java.util.Arrays;
import java.util.Locale;

@SafeParcelable.Class(creator = "DiscoveryOptionsCreator")
@SafeParcelable.Reserved({1000})
public final class DiscoveryOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DiscoveryOptions> CREATOR = new zzo();
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getStrategy", mo65739id = 1)
    public Strategy zza;
    /* access modifiers changed from: private */
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "false", getter = "getForwardUnrecognizedBluetoothDevices", mo65739id = 2)
    public boolean zzb;
    /* access modifiers changed from: private */
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableBluetooth", mo65739id = 3)
    public boolean zzc;
    /* access modifiers changed from: private */
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableBle", mo65739id = 4)
    public boolean zzd;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(defaultValue = "false", getter = "getLowPower", mo65739id = 5)
    public boolean zze;
    /* access modifiers changed from: private */
    @ShowFirstParty
    @SafeParcelable.Field(getter = "getFastAdvertisementServiceUuid", mo65739id = 6)
    public ParcelUuid zzf;
    /* access modifiers changed from: private */
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableWifiLan", mo65739id = 8)
    public boolean zzg;
    /* access modifiers changed from: private */
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableNfc", mo65739id = 9)
    public boolean zzh;
    /* access modifiers changed from: private */
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableWifiAware", mo65739id = 10)
    public boolean zzi;
    /* access modifiers changed from: private */
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "false", getter = "getEnableUwbRanging", mo65739id = 11)
    public boolean zzj;
    /* access modifiers changed from: private */
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "0", getter = "getUwbChannel", mo65739id = 12)
    public int zzk;
    /* access modifiers changed from: private */
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "0", getter = "getUwbPreambleIndex", mo65739id = 13)
    public int zzl;
    /* access modifiers changed from: private */
    @ShowFirstParty
    @SafeParcelable.Field(getter = "getUwbAddress", mo65739id = 14)
    public byte[] zzm;
    /* access modifiers changed from: private */
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "0", getter = "getFlowId", mo65739id = 15)
    public long zzn;
    /* access modifiers changed from: private */
    @ShowFirstParty
    @SafeParcelable.Field(getter = "getDiscoveryMediums", mo65739id = 16)
    public int[] zzo;
    /* access modifiers changed from: private */
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getAllowGattConnections", mo65739id = 17)
    public boolean zzp;

    @SafeParcelable.Reserved({1000})
    public static final class Builder {
        private final DiscoveryOptions zza;

        public Builder() {
            this.zza = new DiscoveryOptions((zzn) null);
        }

        public DiscoveryOptions build() {
            int[] zzG = this.zza.zzo;
            if (zzG != null && zzG.length > 0) {
                this.zza.zzd = false;
                this.zza.zzc = false;
                this.zza.zzh = false;
                this.zza.zzi = false;
                this.zza.zzg = false;
                for (int i : zzG) {
                    if (i == 2) {
                        this.zza.zzc = true;
                    } else if (i == 4) {
                        this.zza.zzd = true;
                    } else if (i == 5) {
                        this.zza.zzg = true;
                    } else if (i == 6) {
                        this.zza.zzi = true;
                    } else if (i == 7) {
                        this.zza.zzh = true;
                    }
                }
            }
            return this.zza;
        }

        public Builder setLowPower(boolean z) {
            this.zza.zze = z;
            return this;
        }

        public Builder setStrategy(Strategy strategy) {
            this.zza.zza = strategy;
            return this;
        }

        public Builder(DiscoveryOptions discoveryOptions) {
            DiscoveryOptions discoveryOptions2 = new DiscoveryOptions((zzn) null);
            this.zza = discoveryOptions2;
            discoveryOptions2.zza = discoveryOptions.zza;
            discoveryOptions2.zzb = discoveryOptions.zzb;
            discoveryOptions2.zzc = discoveryOptions.zzc;
            discoveryOptions2.zzd = discoveryOptions.zzd;
            discoveryOptions2.zze = discoveryOptions.zze;
            discoveryOptions2.zzf = discoveryOptions.zzf;
            discoveryOptions2.zzg = discoveryOptions.zzg;
            discoveryOptions2.zzh = discoveryOptions.zzh;
            discoveryOptions2.zzi = discoveryOptions.zzi;
            discoveryOptions2.zzj = discoveryOptions.zzj;
            discoveryOptions2.zzk = discoveryOptions.zzk;
            discoveryOptions2.zzl = discoveryOptions.zzl;
            discoveryOptions2.zzm = discoveryOptions.zzm;
            discoveryOptions2.zzn = discoveryOptions.zzn;
            discoveryOptions2.zzo = discoveryOptions.zzo;
            discoveryOptions2.zzp = discoveryOptions.zzp;
        }
    }

    private DiscoveryOptions() {
        this.zzb = false;
        this.zzc = true;
        this.zzd = true;
        this.zze = false;
        this.zzg = true;
        this.zzh = true;
        this.zzi = true;
        this.zzj = false;
        this.zzk = 0;
        this.zzl = 0;
        this.zzn = 0;
        this.zzp = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DiscoveryOptions) {
            DiscoveryOptions discoveryOptions = (DiscoveryOptions) obj;
            if (!Objects.equal(this.zza, discoveryOptions.zza) || !Objects.equal(Boolean.valueOf(this.zzb), Boolean.valueOf(discoveryOptions.zzb)) || !Objects.equal(Boolean.valueOf(this.zzc), Boolean.valueOf(discoveryOptions.zzc)) || !Objects.equal(Boolean.valueOf(this.zzd), Boolean.valueOf(discoveryOptions.zzd)) || !Objects.equal(Boolean.valueOf(this.zze), Boolean.valueOf(discoveryOptions.zze)) || !Objects.equal(this.zzf, discoveryOptions.zzf) || !Objects.equal(Boolean.valueOf(this.zzg), Boolean.valueOf(discoveryOptions.zzg)) || !Objects.equal(Boolean.valueOf(this.zzh), Boolean.valueOf(discoveryOptions.zzh)) || !Objects.equal(Boolean.valueOf(this.zzi), Boolean.valueOf(discoveryOptions.zzi)) || !Objects.equal(Boolean.valueOf(this.zzj), Boolean.valueOf(discoveryOptions.zzj)) || !Objects.equal(Integer.valueOf(this.zzk), Integer.valueOf(discoveryOptions.zzk)) || !Objects.equal(Integer.valueOf(this.zzl), Integer.valueOf(discoveryOptions.zzl)) || !Arrays.equals(this.zzm, discoveryOptions.zzm) || !Objects.equal(Long.valueOf(this.zzn), Long.valueOf(discoveryOptions.zzn)) || !Arrays.equals(this.zzo, discoveryOptions.zzo) || !Objects.equal(Boolean.valueOf(this.zzp), Boolean.valueOf(discoveryOptions.zzp))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean getLowPower() {
        return this.zze;
    }

    public Strategy getStrategy() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, Boolean.valueOf(this.zzb), Boolean.valueOf(this.zzc), Boolean.valueOf(this.zzd), Boolean.valueOf(this.zze), this.zzf, Boolean.valueOf(this.zzg), Boolean.valueOf(this.zzh), Boolean.valueOf(this.zzi), Boolean.valueOf(this.zzj), Integer.valueOf(this.zzk), Integer.valueOf(this.zzl), Integer.valueOf(Arrays.hashCode(this.zzm)), Long.valueOf(this.zzn), Integer.valueOf(Arrays.hashCode(this.zzo)), Boolean.valueOf(this.zzp));
    }

    public String toString() {
        String str;
        Locale locale = Locale.US;
        Object[] objArr = new Object[15];
        objArr[0] = this.zza;
        objArr[1] = Boolean.valueOf(this.zzb);
        objArr[2] = Boolean.valueOf(this.zzc);
        objArr[3] = Boolean.valueOf(this.zzd);
        objArr[4] = Boolean.valueOf(this.zze);
        objArr[5] = this.zzf;
        objArr[6] = Boolean.valueOf(this.zzg);
        objArr[7] = Boolean.valueOf(this.zzh);
        objArr[8] = Boolean.valueOf(this.zzi);
        objArr[9] = Boolean.valueOf(this.zzj);
        objArr[10] = Integer.valueOf(this.zzk);
        objArr[11] = Integer.valueOf(this.zzl);
        byte[] bArr = this.zzm;
        if (bArr == null) {
            str = StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
        } else {
            str = zzc.zzb(bArr);
        }
        objArr[12] = str;
        objArr[13] = Long.valueOf(this.zzn);
        objArr[14] = Boolean.valueOf(this.zzp);
        return String.format(locale, "DiscoveryOptions{strategy: %s, forwardUnrecognizedBluetoothDevices: %s, enableBluetooth: %s, enableBle: %s, lowPower: %s, fastAdvertisementServiceUuid: %s, enableWifiLan: %s, enableNfc: %s, enableWifiAware: %s, enableUwbRanging: %s, uwbChannel: %d, uwbPreambleIndex: %d, uwbAddress: %s, flowId: %d, allowGattConnections: %s}", objArr);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getStrategy(), i, false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        SafeParcelWriter.writeBoolean(parcel, 5, getLowPower());
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzg);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzh);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzi);
        SafeParcelWriter.writeBoolean(parcel, 11, this.zzj);
        SafeParcelWriter.writeInt(parcel, 12, this.zzk);
        SafeParcelWriter.writeInt(parcel, 13, this.zzl);
        SafeParcelWriter.writeByteArray(parcel, 14, this.zzm, false);
        SafeParcelWriter.writeLong(parcel, 15, this.zzn);
        SafeParcelWriter.writeIntArray(parcel, 16, this.zzo, false);
        SafeParcelWriter.writeBoolean(parcel, 17, this.zzp);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @ShowFirstParty
    public final boolean zzE() {
        return this.zzh;
    }

    public /* synthetic */ DiscoveryOptions(zzn zzn2) {
        this.zzb = false;
        this.zzc = true;
        this.zzd = true;
        this.zze = false;
        this.zzg = true;
        this.zzh = true;
        this.zzi = true;
        this.zzj = false;
        this.zzk = 0;
        this.zzl = 0;
        this.zzn = 0;
        this.zzp = true;
    }

    @Deprecated
    public DiscoveryOptions(Strategy strategy) {
        this.zzb = false;
        this.zzc = true;
        this.zzd = true;
        this.zze = false;
        this.zzg = true;
        this.zzh = true;
        this.zzi = true;
        this.zzj = false;
        this.zzk = 0;
        this.zzl = 0;
        this.zzn = 0;
        this.zzp = true;
        this.zza = strategy;
    }

    @SafeParcelable.Constructor
    public DiscoveryOptions(@SafeParcelable.Param(mo65742id = 1) Strategy strategy, @SafeParcelable.Param(mo65742id = 2) boolean z, @SafeParcelable.Param(mo65742id = 3) boolean z2, @SafeParcelable.Param(mo65742id = 4) boolean z3, @SafeParcelable.Param(mo65742id = 5) boolean z4, @SafeParcelable.Param(mo65742id = 6) ParcelUuid parcelUuid, @SafeParcelable.Param(mo65742id = 8) boolean z5, @SafeParcelable.Param(mo65742id = 9) boolean z6, @SafeParcelable.Param(mo65742id = 10) boolean z7, @SafeParcelable.Param(mo65742id = 11) boolean z8, @SafeParcelable.Param(mo65742id = 12) int i, @SafeParcelable.Param(mo65742id = 13) int i2, @SafeParcelable.Param(mo65742id = 14) byte[] bArr, @SafeParcelable.Param(mo65742id = 15) long j, @SafeParcelable.Param(mo65742id = 16) int[] iArr, @SafeParcelable.Param(mo65742id = 17) boolean z9) {
        this.zzp = true;
        this.zza = strategy;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = z3;
        this.zze = z4;
        this.zzf = parcelUuid;
        this.zzg = z5;
        this.zzh = z6;
        this.zzi = z7;
        this.zzj = z8;
        this.zzk = i;
        this.zzl = i2;
        this.zzm = bArr;
        this.zzn = j;
        this.zzo = iArr;
    }
}
