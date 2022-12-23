package p887wg;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm;

/* renamed from: wg.h */
public final class C20315h extends zzec implements zzfm {
    /* access modifiers changed from: private */
    public static final C20315h zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private byte zzh = 2;

    static {
        C20315h hVar = new C20315h();
        zza = hVar;
        zzec.zzS(C20315h.class, hVar);
    }

    /* renamed from: b */
    public static C20315h m47899b() {
        return zza;
    }

    public final String zzc() {
        return this.zzf;
    }

    public final String zzd() {
        return this.zzg;
    }

    public final Object zzg(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzh);
        }
        byte b = 1;
        if (i2 == 2) {
            return zzec.zzR(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᔈ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C20315h();
        } else {
            if (i2 == 4) {
                return new C20314g(0);
            }
            if (i2 == 5) {
                return zza;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzh = b;
            return null;
        }
    }
}
