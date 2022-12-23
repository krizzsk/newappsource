package com.google.android.gms.internal.measurement;

final class zzht extends zzia {
    public zzht(zzhx zzhx, String str, Long l, boolean z) {
        super(zzhx, str, l, true, (zzhz) null);
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
