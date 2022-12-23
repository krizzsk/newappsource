package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.messages.internal.zzc;
import java.util.Arrays;
import java.util.Locale;

@SafeParcelable.Class(creator = "ConnectionOptionsCreator")
@SafeParcelable.Reserved({1000})
public final class ConnectionOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionOptions> CREATOR = new zzj();
    /* access modifiers changed from: private */
    @SafeParcelable.Field(defaultValue = "false", getter = "getLowPower", mo65739id = 1)
    public boolean zza;
    /* access modifiers changed from: private */
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableBluetooth", mo65739id = 2)
    public boolean zzb;
    /* access modifiers changed from: private */
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableBle", mo65739id = 3)
    public boolean zzc;
    /* access modifiers changed from: private */
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableWifiLan", mo65739id = 4)
    public boolean zzd;
    /* access modifiers changed from: private */
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableNfc", mo65739id = 5)
    public boolean zze;
    /* access modifiers changed from: private */
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableWifiAware", mo65739id = 6)
    public boolean zzf;
    /* access modifiers changed from: private */
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableWifiHotspot", mo65739id = 7)
    public boolean zzg;
    /* access modifiers changed from: private */
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableWifiDirect", mo65739id = 8)
    public boolean zzh;
    /* access modifiers changed from: private */
    @ShowFirstParty
    @SafeParcelable.Field(getter = "getRemoteBluetoothMacAddress", mo65739id = 9)
    public byte[] zzi;
    /* access modifiers changed from: private */
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "false", getter = "getEnableWebRtc", mo65739id = 10)
    public boolean zzj;
    /* access modifiers changed from: private */
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnforceTopologyConstraints", mo65739id = 11)
    public boolean zzk;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(defaultValue = "true", getter = "getDisruptiveUpgrade", mo65739id = 12)
    @Deprecated
    public boolean zzl;
    /* access modifiers changed from: private */
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "0", getter = "getKeepAliveIntervalMillis", mo65739id = 13)
    public int zzm;
    /* access modifiers changed from: private */
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "0", getter = "getKeepAliveTimeoutMillis", mo65739id = 14)
    public int zzn;
    /* access modifiers changed from: private */
    @ShowFirstParty
    @SafeParcelable.Field(getter = "getUpgradeMediums", mo65739id = 15)
    public int[] zzo;
    /* access modifiers changed from: private */
    @ShowFirstParty
    @SafeParcelable.Field(getter = "getConnectionMediums", mo65739id = 16)
    public int[] zzp;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getDeviceInfo", mo65739id = 17)
    public byte[] zzq;
    /* access modifiers changed from: private */
    @ShowFirstParty
    @SafeParcelable.Field(getter = "getStrategy", mo65739id = 18)
    public Strategy zzr;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(defaultValue = "0", getter = "getConnectionType", mo65739id = 19)
    public int zzs;

    @SafeParcelable.Reserved({1000})
    public static final class Builder {
        private final ConnectionOptions zza;

        public Builder() {
            this.zza = new ConnectionOptions((zzi) null);
        }

        public ConnectionOptions build() {
            int[] zzK = this.zza.zzp;
            boolean z = false;
            if (zzK != null && zzK.length > 0) {
                this.zza.zzc = false;
                this.zza.zzb = false;
                this.zza.zze = false;
                this.zza.zzf = false;
                this.zza.zzd = false;
                this.zza.zzj = false;
                this.zza.zzh = false;
                this.zza.zzg = false;
                for (int i : zzK) {
                    switch (i) {
                        case 2:
                            this.zza.zzb = true;
                            break;
                        case 3:
                            this.zza.zzg = true;
                            break;
                        case 4:
                            this.zza.zzc = true;
                            break;
                        case 5:
                            this.zza.zzd = true;
                            break;
                        case 6:
                            this.zza.zzf = true;
                            break;
                        case 7:
                            this.zza.zze = true;
                            break;
                        case 8:
                            this.zza.zzh = true;
                            break;
                        case 9:
                            this.zza.zzj = true;
                            break;
                    }
                }
            }
            if (this.zza.zzs != 0) {
                ConnectionOptions connectionOptions = this.zza;
                if (connectionOptions.zzs == 1) {
                    z = true;
                }
                connectionOptions.zzl = z;
            } else if (!this.zza.zzl) {
                this.zza.zzs = 2;
            }
            return this.zza;
        }

        public Builder setConnectionType(int i) {
            this.zza.zzs = i;
            return this;
        }

        @Deprecated
        public Builder setDisruptiveUpgrade(boolean z) {
            this.zza.zzl = z;
            return this;
        }

        public Builder setLowPower(boolean z) {
            this.zza.zza = z;
            return this;
        }

        public Builder(ConnectionOptions connectionOptions) {
            ConnectionOptions connectionOptions2 = new ConnectionOptions((zzi) null);
            this.zza = connectionOptions2;
            connectionOptions2.zza = connectionOptions.zza;
            connectionOptions2.zzb = connectionOptions.zzb;
            connectionOptions2.zzc = connectionOptions.zzc;
            connectionOptions2.zzd = connectionOptions.zzd;
            connectionOptions2.zze = connectionOptions.zze;
            connectionOptions2.zzf = connectionOptions.zzf;
            connectionOptions2.zzg = connectionOptions.zzg;
            connectionOptions2.zzh = connectionOptions.zzh;
            connectionOptions2.zzi = connectionOptions.zzi;
            connectionOptions2.zzj = connectionOptions.zzj;
            connectionOptions2.zzk = connectionOptions.zzk;
            connectionOptions2.zzl = connectionOptions.zzl;
            connectionOptions2.zzm = connectionOptions.zzm;
            connectionOptions2.zzn = connectionOptions.zzn;
            connectionOptions2.zzo = connectionOptions.zzo;
            connectionOptions2.zzp = connectionOptions.zzp;
            connectionOptions2.zzq = connectionOptions.zzq;
            connectionOptions2.zzr = connectionOptions.zzr;
            connectionOptions2.zzs = connectionOptions.zzs;
        }
    }

    private ConnectionOptions() {
        this.zza = false;
        this.zzb = true;
        this.zzc = true;
        this.zzd = true;
        this.zze = true;
        this.zzf = true;
        this.zzg = true;
        this.zzh = true;
        this.zzj = false;
        this.zzk = true;
        this.zzl = true;
        this.zzm = 0;
        this.zzn = 0;
        this.zzs = 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConnectionOptions) {
            ConnectionOptions connectionOptions = (ConnectionOptions) obj;
            if (!Objects.equal(Boolean.valueOf(this.zza), Boolean.valueOf(connectionOptions.zza)) || !Objects.equal(Boolean.valueOf(this.zzb), Boolean.valueOf(connectionOptions.zzb)) || !Objects.equal(Boolean.valueOf(this.zzc), Boolean.valueOf(connectionOptions.zzc)) || !Objects.equal(Boolean.valueOf(this.zzd), Boolean.valueOf(connectionOptions.zzd)) || !Objects.equal(Boolean.valueOf(this.zze), Boolean.valueOf(connectionOptions.zze)) || !Objects.equal(Boolean.valueOf(this.zzf), Boolean.valueOf(connectionOptions.zzf)) || !Objects.equal(Boolean.valueOf(this.zzg), Boolean.valueOf(connectionOptions.zzg)) || !Objects.equal(Boolean.valueOf(this.zzh), Boolean.valueOf(connectionOptions.zzh)) || !Arrays.equals(this.zzi, connectionOptions.zzi) || !Objects.equal(Boolean.valueOf(this.zzj), Boolean.valueOf(connectionOptions.zzj)) || !Objects.equal(Boolean.valueOf(this.zzk), Boolean.valueOf(connectionOptions.zzk)) || !Objects.equal(Boolean.valueOf(this.zzl), Boolean.valueOf(connectionOptions.zzl)) || !Objects.equal(Integer.valueOf(this.zzm), Integer.valueOf(connectionOptions.zzm)) || !Objects.equal(Integer.valueOf(this.zzn), Integer.valueOf(connectionOptions.zzn)) || !Arrays.equals(this.zzo, connectionOptions.zzo) || !Arrays.equals(this.zzp, connectionOptions.zzp) || !Arrays.equals(this.zzq, connectionOptions.zzq) || !Objects.equal(this.zzr, connectionOptions.zzr) || !Objects.equal(Integer.valueOf(this.zzs), Integer.valueOf(connectionOptions.zzs))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int getConnectionType() {
        return this.zzs;
    }

    @Deprecated
    public boolean getDisruptiveUpgrade() {
        return this.zzl;
    }

    public boolean getLowPower() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.zza), Boolean.valueOf(this.zzb), Boolean.valueOf(this.zzc), Boolean.valueOf(this.zzd), Boolean.valueOf(this.zze), Boolean.valueOf(this.zzf), Boolean.valueOf(this.zzg), Boolean.valueOf(this.zzh), Integer.valueOf(Arrays.hashCode(this.zzi)), Boolean.valueOf(this.zzj), Boolean.valueOf(this.zzk), Boolean.valueOf(this.zzl), Integer.valueOf(this.zzm), Integer.valueOf(this.zzn), Integer.valueOf(Arrays.hashCode(this.zzo)), Integer.valueOf(Arrays.hashCode(this.zzp)), Integer.valueOf(Arrays.hashCode(this.zzq)), this.zzr, Integer.valueOf(this.zzs));
    }

    public String toString() {
        String str;
        Locale locale = Locale.US;
        Object[] objArr = new Object[15];
        objArr[0] = Boolean.valueOf(this.zza);
        objArr[1] = Boolean.valueOf(this.zzb);
        objArr[2] = Boolean.valueOf(this.zzc);
        objArr[3] = Boolean.valueOf(this.zzd);
        objArr[4] = Boolean.valueOf(this.zze);
        objArr[5] = Boolean.valueOf(this.zzf);
        objArr[6] = Boolean.valueOf(this.zzg);
        objArr[7] = Boolean.valueOf(this.zzh);
        byte[] bArr = this.zzi;
        String str2 = null;
        if (bArr == null) {
            str = null;
        } else {
            str = zzc.zzb(bArr);
        }
        objArr[8] = str;
        objArr[9] = Boolean.valueOf(this.zzj);
        objArr[10] = Boolean.valueOf(this.zzk);
        objArr[11] = Boolean.valueOf(this.zzl);
        byte[] bArr2 = this.zzq;
        if (bArr2 != null) {
            str2 = zzc.zzb(bArr2);
        }
        objArr[12] = str2;
        objArr[13] = this.zzr;
        objArr[14] = Integer.valueOf(this.zzs);
        return String.format(locale, "ConnectionOptions{lowPower: %s, enableBluetooth: %s, enableBle: %s, enableWifiLan: %s, enableNfc: %s, enableWifiAware: %s, enableWifiHotspot: %s, enableWifiDirect: %s, remoteBluetoothMacAddress: %s, enableWebRtc: %s, enforceTopologyConstraints: %s, disruptiveUpgrade: %s,deviceInfo: %s,strategy: %s,connectionType: %d}", objArr);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, getLowPower());
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zze);
        SafeParcelWriter.writeBoolean(parcel, 6, this.zzf);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zzg);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzh);
        SafeParcelWriter.writeByteArray(parcel, 9, this.zzi, false);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzj);
        SafeParcelWriter.writeBoolean(parcel, 11, this.zzk);
        SafeParcelWriter.writeBoolean(parcel, 12, getDisruptiveUpgrade());
        SafeParcelWriter.writeInt(parcel, 13, this.zzm);
        SafeParcelWriter.writeInt(parcel, 14, this.zzn);
        SafeParcelWriter.writeIntArray(parcel, 15, this.zzo, false);
        SafeParcelWriter.writeIntArray(parcel, 16, this.zzp, false);
        SafeParcelWriter.writeByteArray(parcel, 17, this.zzq, false);
        SafeParcelWriter.writeParcelable(parcel, 18, this.zzr, i, false);
        SafeParcelWriter.writeInt(parcel, 19, getConnectionType());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public /* synthetic */ ConnectionOptions(zzi zzi2) {
        this.zza = false;
        this.zzb = true;
        this.zzc = true;
        this.zzd = true;
        this.zze = true;
        this.zzf = true;
        this.zzg = true;
        this.zzh = true;
        this.zzj = false;
        this.zzk = true;
        this.zzl = true;
        this.zzm = 0;
        this.zzn = 0;
        this.zzs = 0;
    }

    @SafeParcelable.Constructor
    public ConnectionOptions(@SafeParcelable.Param(mo65742id = 1) boolean z, @SafeParcelable.Param(mo65742id = 2) boolean z2, @SafeParcelable.Param(mo65742id = 3) boolean z3, @SafeParcelable.Param(mo65742id = 4) boolean z4, @SafeParcelable.Param(mo65742id = 5) boolean z5, @SafeParcelable.Param(mo65742id = 6) boolean z6, @SafeParcelable.Param(mo65742id = 7) boolean z7, @SafeParcelable.Param(mo65742id = 8) boolean z8, @SafeParcelable.Param(mo65742id = 9) byte[] bArr, @SafeParcelable.Param(mo65742id = 10) boolean z9, @SafeParcelable.Param(mo65742id = 11) boolean z11, @SafeParcelable.Param(mo65742id = 12) boolean z12, @SafeParcelable.Param(mo65742id = 13) int i, @SafeParcelable.Param(mo65742id = 14) int i2, @SafeParcelable.Param(mo65742id = 15) int[] iArr, @SafeParcelable.Param(mo65742id = 16) int[] iArr2, @SafeParcelable.Param(mo65742id = 17) byte[] bArr2, @SafeParcelable.Param(mo65742id = 18) Strategy strategy, @SafeParcelable.Param(mo65742id = 19) int i3) {
        this.zza = z;
        this.zzb = z2;
        this.zzc = z3;
        this.zzd = z4;
        this.zze = z5;
        this.zzf = z6;
        this.zzg = z7;
        this.zzh = z8;
        this.zzi = bArr;
        this.zzj = z9;
        this.zzk = z11;
        this.zzl = z12;
        this.zzm = i;
        this.zzn = i2;
        this.zzo = iArr;
        this.zzp = iArr2;
        this.zzq = bArr2;
        this.zzr = strategy;
        this.zzs = i3;
    }
}
