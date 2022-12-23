package com.google.android.gms.internal.auth;

import android.net.Uri;
import p241s0.C6313h;

public final class zzci {
    private final C6313h zza;

    public zzci(C6313h hVar) {
        this.zza = hVar;
    }

    public final String zza(Uri uri, String str, String str2, String str3) {
        if (uri == null) {
            return null;
        }
        C6313h hVar = (C6313h) this.zza.getOrDefault(uri.toString(), null);
        if (hVar == null) {
            return null;
        }
        return (String) hVar.getOrDefault("".concat(String.valueOf(str3)), null);
    }
}
