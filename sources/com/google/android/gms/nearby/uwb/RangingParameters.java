package com.google.android.gms.nearby.uwb;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;

public class RangingParameters {
    public static final int SESSION_ID_UNSET = 0;
    @UwbConfigId
    private final int zza;
    private final int zzb;
    private final byte[] zzc;
    private final UwbComplexChannel zzd;
    private final List zze;
    @RangingUpdateRate
    private final int zzf;

    public static class Builder {
        @RangingUpdateRate
        public int zza = 3;
        @UwbConfigId
        private int zzb = 0;
        private int zzc = 0;
        private byte[] zzd;
        private UwbComplexChannel zze;
        private final List zzf = new ArrayList();

        public Builder addPeerDevice(UwbDevice uwbDevice) {
            Preconditions.checkNotNull(uwbDevice, "peerDevice cannot be null.");
            this.zzf.add(uwbDevice);
            return this;
        }

        public RangingParameters build() {
            boolean z;
            boolean z2 = true;
            Preconditions.checkArgument(!this.zzf.isEmpty(), "At least 1 peer device must be set.");
            if (this.zzb != 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z);
            if (this.zza == 0) {
                z2 = false;
            }
            Preconditions.checkArgument(z2);
            return new RangingParameters(this.zzb, this.zzc, this.zzd, this.zze, this.zza, this.zzf, (zza) null);
        }

        public Builder setComplexChannel(UwbComplexChannel uwbComplexChannel) {
            this.zze = uwbComplexChannel;
            return this;
        }

        public Builder setRangingUpdateRate(@RangingUpdateRate int i) {
            this.zza = i;
            return this;
        }

        public Builder setSessionId(int i) {
            this.zzc = i;
            return this;
        }

        public Builder setSessionKeyInfo(byte[] bArr) {
            this.zzd = bArr;
            return this;
        }

        public Builder setUwbConfigId(@UwbConfigId int i) {
            this.zzb = i;
            return this;
        }
    }

    public @interface RangingUpdateRate {
        public static final int AUTOMATIC = 1;
        public static final int FREQUENT = 3;
        public static final int INFREQUENT = 2;
        public static final int UNKNOWN = 0;
    }

    public @interface UwbConfigId {
        public static final int CONFIG_ID_1 = 1;
        public static final int CONFIG_ID_2 = 2;
        public static final int CONFIG_ID_3 = 3;
    }

    public /* synthetic */ RangingParameters(int i, int i2, byte[] bArr, UwbComplexChannel uwbComplexChannel, int i3, List list, zza zza2) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = bArr;
        this.zzd = uwbComplexChannel;
        this.zzf = i3;
        this.zze = list;
    }

    public UwbComplexChannel getComplexChannel() {
        return this.zzd;
    }

    public List<UwbDevice> getPeerDevices() {
        return this.zze;
    }

    @RangingUpdateRate
    public int getRangingUpdateRate() {
        return this.zzf;
    }

    public int getSessionId() {
        return this.zzb;
    }

    public byte[] getSessionKeyInfo() {
        return this.zzc;
    }

    @UwbConfigId
    public int getUwbConfigId() {
        return this.zza;
    }
}
