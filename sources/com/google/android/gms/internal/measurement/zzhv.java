package com.google.android.gms.internal.measurement;

final class zzhv extends zzia {
    public zzhv(zzhx zzhx, String str, Double d, boolean z) {
        super(zzhx, "measurement.test.double_flag", d, true, (zzhz) null);
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
