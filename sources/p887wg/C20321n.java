package p887wg;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm;

/* renamed from: wg.n */
public final class C20321n extends zzec implements zzfm {
    /* access modifiers changed from: private */
    public static final C20321n zza;
    private int zze;
    private String zzf = "";
    private int zzg;
    private String zzh = "";
    private boolean zzi;
    private byte zzj = 2;

    static {
        C20321n nVar = new C20321n();
        zza = nVar;
        zzec.zzS(C20321n.class, nVar);
    }

    /* renamed from: b */
    public static C20321n m47903b() {
        return zza;
    }

    /* renamed from: c */
    public final int mo52485c() {
        int i;
        int i2 = this.zzg;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                i = i2 != 2 ? i2 != 3 ? 0 : 4 : 3;
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
        return this.zzh;
    }

    public final String zzd() {
        return this.zzf;
    }

    public final Object zzg(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzj);
        }
        byte b = 1;
        if (i2 == 2) {
            return zzec.zzR(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᔈ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", C20320m.f51493a, "zzh", "zzi"});
        } else if (i2 == 3) {
            return new C20321n();
        } else {
            if (i2 == 4) {
                return new C20319l();
            }
            if (i2 == 5) {
                return zza;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzj = b;
            return null;
        }
    }
}
