package com.google.android.gms.internal.auth;

final class zzcx extends zzdc {
    public zzcx(zzcz zzcz, String str, Double d, boolean z) {
        super(zzcz, str, d, true, (zzdb) null);
    }

    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            super.zzc();
            String str = (String) obj;
            return null;
        }
    }
}
