package com.google.android.gms.internal.measurement;

import java.io.IOException;

public class zzko extends IOException {
    public zzko(String str) {
        super(str);
    }

    public static zzkn zza() {
        return new zzkn("Protocol message tag had invalid wire type.");
    }

    public static zzko zzb() {
        return new zzko("Protocol message contained an invalid tag (zero).");
    }

    public static zzko zzc() {
        return new zzko("Protocol message had invalid UTF-8.");
    }

    public static zzko zzd() {
        return new zzko("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static zzko zze() {
        return new zzko("Failed to parse the message.");
    }

    public static zzko zzf() {
        return new zzko("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
