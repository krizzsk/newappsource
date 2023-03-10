package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.io.IOException;

public class zzen extends IOException {
    private zzfl zza = null;

    public zzen(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public static zzem zza() {
        return new zzem("Protocol message tag had invalid wire type.");
    }

    public static zzen zzb() {
        return new zzen("Protocol message contained an invalid tag (zero).");
    }

    public static zzen zzc() {
        return new zzen("Protocol message had invalid UTF-8.");
    }

    public static zzen zzd() {
        return new zzen("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static zzen zze() {
        return new zzen("Failed to parse the message.");
    }

    public static zzen zzg() {
        return new zzen("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final zzen zzf(zzfl zzfl) {
        this.zza = zzfl;
        return this;
    }

    public zzen(String str) {
        super(str);
    }
}
