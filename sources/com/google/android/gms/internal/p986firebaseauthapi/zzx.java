package com.google.android.gms.internal.p986firebaseauthapi;

import java.util.logging.Logger;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzx */
final class zzx {
    private static final Logger zza = Logger.getLogger(zzx.class.getName());
    private static final zzw zzb = new zzw((zzv) null);

    private zzx() {
    }

    public static zzq zza(String str) {
        return new zzt(Pattern.compile("[.-]"));
    }

    public static String zzb(String str) {
        return str == null ? "" : str;
    }

    public static boolean zzc(String str) {
        return str == null || str.isEmpty();
    }
}
