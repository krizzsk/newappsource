package p887wg;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm;

/* renamed from: wg.v */
public final class C20329v extends zzec implements zzfm {
    /* access modifiers changed from: private */
    public static final C20329v zza;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private boolean zzl;

    static {
        C20329v vVar = new C20329v();
        zza = vVar;
        zzec.zzS(C20329v.class, vVar);
    }

    /* renamed from: f */
    public static C20329v m47932f() {
        return zza;
    }

    /* renamed from: a */
    public final int mo52512a() {
        return this.zzh;
    }

    /* renamed from: b */
    public final int mo52513b() {
        return this.zzi;
    }

    /* renamed from: c */
    public final int mo52514c() {
        return this.zzk;
    }

    /* renamed from: d */
    public final int mo52515d() {
        return this.zzf;
    }

    /* renamed from: g */
    public final boolean mo52516g() {
        return this.zzl;
    }

    public final int zzc() {
        return this.zzj;
    }

    public final int zzd() {
        return this.zzg;
    }

    public final Object zzg(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzec.zzR(zza, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007ဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        } else if (i2 == 3) {
            return new C20329v();
        } else {
            if (i2 == 4) {
                return new C20328u();
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
