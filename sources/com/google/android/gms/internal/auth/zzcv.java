package com.google.android.gms.internal.auth;

final class zzcv extends zzdc {
    public zzcv(zzcz zzcz, String str, Long l, boolean z) {
        super(zzcz, str, l, true, (zzdb) null);
    }

    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            super.zzc();
            String str = (String) obj;
            return null;
        }
    }
}
