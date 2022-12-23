package p887wg;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm;

/* renamed from: wg.x */
public final class C20331x extends zzec implements zzfm {
    /* access modifiers changed from: private */
    public static final C20331x zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private C20329v zzk;
    private C20329v zzl;

    static {
        C20331x xVar = new C20331x();
        zza = xVar;
        zzec.zzS(C20331x.class, xVar);
    }

    /* renamed from: d */
    public static C20331x m47939d() {
        return zza;
    }

    /* renamed from: a */
    public final C20329v mo52519a() {
        C20329v vVar = this.zzl;
        return vVar == null ? C20329v.m47932f() : vVar;
    }

    /* renamed from: b */
    public final C20329v mo52520b() {
        C20329v vVar = this.zzk;
        return vVar == null ? C20329v.m47932f() : vVar;
    }

    public final String zze() {
        return this.zzg;
    }

    public final String zzf() {
        return this.zzh;
    }

    public final Object zzg(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzec.zzR(zza, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဉ\u0005\u0007ဉ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        } else if (i2 == 3) {
            return new C20331x();
        } else {
            if (i2 == 4) {
                return new C20330w();
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final String zzh() {
        return this.zzi;
    }

    public final String zzi() {
        return this.zzj;
    }

    public final String zzj() {
        return this.zzf;
    }
}
