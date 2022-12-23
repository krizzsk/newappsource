package com.google.android.gms.internal.contextmanager;

import java.io.IOException;

public class zzmp extends IOException {
    private zznn zza = null;

    public zzmp(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public static zzmo zza() {
        return new zzmo("Protocol message tag had invalid wire type.");
    }

    public static zzmp zzb() {
        return new zzmp("Protocol message contained an invalid tag (zero).");
    }

    public static zzmp zzc() {
        return new zzmp("Protocol message had invalid UTF-8.");
    }

    public static zzmp zzd() {
        return new zzmp("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static zzmp zze() {
        return new zzmp("Failed to parse the message.");
    }

    public static zzmp zzg() {
        return new zzmp("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final zzmp zzf(zznn zznn) {
        this.zza = zznn;
        return this;
    }

    public zzmp(String str) {
        super(str);
    }
}
