package p887wg;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm;

/* renamed from: wg.d */
public final class C20311d extends zzec implements zzfm {
    /* access modifiers changed from: private */
    public static final C20311d zza;
    private int zze;
    private double zzf;
    private double zzg;
    private byte zzh = 2;

    static {
        C20311d dVar = new C20311d();
        zza = dVar;
        zzec.zzS(C20311d.class, dVar);
    }

    /* renamed from: d */
    public static C20311d m47889d() {
        return zza;
    }

    /* renamed from: a */
    public final double mo52477a() {
        return this.zzf;
    }

    /* renamed from: b */
    public final double mo52478b() {
        return this.zzg;
    }

    public final Object zzg(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzh);
        }
        byte b = 1;
        if (i2 == 2) {
            return zzec.zzR(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔀ\u0000\u0002ᔀ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C20311d();
        } else {
            if (i2 == 4) {
                return new C20309c(0);
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
