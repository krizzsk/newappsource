package com.google.android.gms.nearby.uwb;

import com.google.android.gms.common.internal.Objects;

public class UwbComplexChannel {
    private final int zza;
    private final int zzb;

    public static class Builder {
        private int zza;
        private int zzb;

        public UwbComplexChannel build() {
            return new UwbComplexChannel(this.zza, this.zzb, (zzb) null);
        }

        public Builder setChannel(int i) {
            this.zza = i;
            return this;
        }

        public Builder setPreambleIndex(int i) {
            this.zzb = i;
            return this;
        }
    }

    public /* synthetic */ UwbComplexChannel(int i, int i2, zzb zzb2) {
        this.zza = i;
        this.zzb = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UwbComplexChannel)) {
            return false;
        }
        UwbComplexChannel uwbComplexChannel = (UwbComplexChannel) obj;
        if (this.zza == uwbComplexChannel.zza && this.zzb == uwbComplexChannel.zzb) {
            return true;
        }
        return false;
    }

    public int getChannel() {
        return this.zza;
    }

    public int getPreambleIndex() {
        return this.zzb;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Integer.valueOf(this.zzb));
    }

    public String toString() {
        int i = this.zza;
        int i2 = this.zzb;
        return "UwbComplexChannel{channel=" + i + ", preambleIndex=" + i2 + "}";
    }
}
