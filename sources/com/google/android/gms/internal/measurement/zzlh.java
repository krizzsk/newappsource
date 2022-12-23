package com.google.android.gms.internal.measurement;

final class zzlh {
    private static final zzlg zza;
    private static final zzlg zzb = new zzlg();

    static {
        zzlg zzlg;
        try {
            zzlg = (zzlg) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzlg = null;
        }
        zza = zzlg;
    }

    public static zzlg zza() {
        return zza;
    }

    public static zzlg zzb() {
        return zzb;
    }
}
