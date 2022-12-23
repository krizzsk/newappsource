package com.google.android.gms.internal.ads;

public final class zzgnh extends RuntimeException {
    public zzgnh(zzgly zzgly) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzgla zza() {
        return new zzgla(getMessage());
    }
}
