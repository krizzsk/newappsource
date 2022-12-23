package p887wg;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm;

/* renamed from: wg.b0 */
public final class C20308b0 extends zzec implements zzfm {
    /* access modifiers changed from: private */
    public static final C20308b0 zza;
    private int zze;
    private int zzf;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        C20308b0 b0Var = new C20308b0();
        zza = b0Var;
        zzec.zzS(C20308b0.class, b0Var);
    }

    /* renamed from: b */
    public static C20308b0 m47886b() {
        return zza;
    }

    /* renamed from: c */
    public final int mo52473c() {
        int i;
        int i2 = this.zzf;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                i = i2 != 2 ? 0 : 3;
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final String zzc() {
        return this.zzg;
    }

    public final String zzd() {
        return this.zzi;
    }

    public final String zze() {
        return this.zzh;
    }

    public final Object zzg(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzec.zzR(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", C20306a0.f51491a, "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new C20308b0();
        } else {
            if (i2 == 4) {
                return new C20317j(1);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
