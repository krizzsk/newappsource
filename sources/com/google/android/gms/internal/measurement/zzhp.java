package com.google.android.gms.internal.measurement;

import android.net.Uri;
import p241s0.C6302b;

public final class zzhp {
    private static final C6302b zza = new C6302b();

    public static synchronized Uri zza(String str) {
        synchronized (zzhp.class) {
            C6302b bVar = zza;
            Uri uri = (Uri) bVar.getOrDefault("com.google.android.gms.measurement", null);
            if (uri != null) {
                return uri;
            }
            Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
            bVar.put("com.google.android.gms.measurement", parse);
            return parse;
        }
    }
}
