package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

public final class zzaj extends zzec implements zzfm {
    public static final zzea zza;
    private static final zzej zze = new zzag();
    /* access modifiers changed from: private */
    public static final zzaj zzf;
    private int zzg;
    private String zzh = "";
    private String zzi = "";
    private zzei zzj = zzec.zzN();
    private String zzk = "";
    private String zzl = "";
    private zzy zzm;
    private zzjh zzn;
    private byte zzo = 2;

    static {
        zzaj zzaj = new zzaj();
        zzf = zzaj;
        zzec.zzS(zzaj.class, zzaj);
        zza = zzec.zzH(zzjh.zzf(), zzaj, zzaj, (zzef) null, 308676116, zzhf.MESSAGE, zzaj.class);
    }

    private zzaj() {
    }

    public final Object zzg(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzo);
        }
        byte b = 1;
        if (i2 == 2) {
            return zzec.zzR(zzf, "\u0001\u0007\u0000\u0001\u0001Ǵ\u0007\u0000\u0001\u0002\u0001ᔈ\u0000\u0002ဈ\u0001\u0003\u001e\u0005ဈ\u0002\u0006ဈ\u0003\u000fᐉ\u0005Ǵဉ\u0004", new Object[]{"zzg", "zzh", "zzi", "zzj", zzai.zza, "zzk", "zzl", "zzn", "zzm"});
        } else if (i2 == 3) {
            return new zzaj();
        } else {
            if (i2 == 4) {
                return new zzah((zzaf) null);
            }
            if (i2 == 5) {
                return zzf;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzo = b;
            return null;
        }
    }
}
