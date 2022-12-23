package com.google.android.gms.nearby.uwb;

import android.annotation.SuppressLint;

public class UwbDevice {
    private final UwbAddress zza;

    private UwbDevice(UwbAddress uwbAddress) {
        this.zza = uwbAddress;
    }

    public static UwbDevice createForAddress(String str) {
        return new UwbDevice(new UwbAddress(str));
    }

    @SuppressLint({"NewApi"})
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UwbDevice)) {
            return false;
        }
        UwbAddress uwbAddress = this.zza;
        UwbAddress uwbAddress2 = ((UwbDevice) obj).zza;
        if (uwbAddress == uwbAddress2 || uwbAddress.equals(uwbAddress2)) {
            return true;
        }
        return false;
    }

    public UwbAddress getAddress() {
        return this.zza;
    }

    @SuppressLint({"NewApi"})
    public int hashCode() {
        return this.zza.hashCode();
    }

    public String toString() {
        return String.format("UwbDevice {%s}", new Object[]{this.zza});
    }

    public static UwbDevice createForAddress(byte[] bArr) {
        return new UwbDevice(new UwbAddress(bArr));
    }
}
