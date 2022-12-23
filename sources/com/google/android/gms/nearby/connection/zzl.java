package com.google.android.gms.nearby.connection;

import android.bluetooth.BluetoothDevice;

public final class zzl {
    private String zza;
    private String zzb;
    private BluetoothDevice zzc;
    private byte[] zzd;

    public final zzl zza(BluetoothDevice bluetoothDevice) {
        this.zzc = bluetoothDevice;
        this.zzb = "__UNRECOGNIZED_BLUETOOTH_DEVICE__";
        this.zzd = "__UNRECOGNIZED_BLUETOOTH_DEVICE__".getBytes();
        return this;
    }

    public final zzl zzb(byte[] bArr) {
        this.zzd = bArr;
        return this;
    }

    public final zzl zzc(String str) {
        this.zzb = str;
        return this;
    }

    public final zzl zzd(String str) {
        this.zza = str;
        return this;
    }

    public final DiscoveredEndpointInfo zze() {
        return new DiscoveredEndpointInfo(this.zza, this.zzb, this.zzc, this.zzd, (zzm) null);
    }
}
