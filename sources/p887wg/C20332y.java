package p887wg;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcb;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcd;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzci;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzek;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm;

/* renamed from: wg.y */
public final class C20332y extends zzec implements zzfm {
    /* access modifiers changed from: private */
    public static final C20332y zza;
    private int zze;
    private zzcd zzf;
    private String zzg = "";
    private String zzh = "";
    private zzek zzi = zzec.zzO();
    private zzek zzj = zzec.zzO();
    private zzek zzk = zzec.zzO();
    private zzek zzl = zzec.zzO();
    private String zzm = "";
    private byte zzn = 2;

    static {
        C20332y yVar = new C20332y();
        zza = yVar;
        zzec.zzS(C20332y.class, yVar);
    }

    /* renamed from: b */
    public static C20332y m47943b() {
        return zza;
    }

    /* renamed from: c */
    public final zzek mo52526c() {
        return this.zzl;
    }

    /* renamed from: d */
    public final zzek mo52527d() {
        return this.zzj;
    }

    /* renamed from: e */
    public final zzek mo52528e() {
        return this.zzi;
    }

    /* renamed from: f */
    public final zzek mo52529f() {
        return this.zzk;
    }

    public final zzcd zza() {
        zzcd zzcd = this.zzf;
        return zzcd == null ? zzcd.zzb() : zzcd;
    }

    public final String zzd() {
        return this.zzg;
    }

    public final String zze() {
        return this.zzh;
    }

    public final Object zzg(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzn);
        }
        byte b = 0;
        if (i2 == 2) {
            return zzec.zzR(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0004\u0001\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001b\u0005\u001b\u0006\u001a\u0007Л\bဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", zzci.class, "zzj", C20308b0.class, "zzk", "zzl", zzcb.class, "zzm"});
        } else if (i2 == 3) {
            return new C20332y();
        } else {
            if (i2 == 4) {
                return new C20309c(1);
            }
            if (i2 == 5) {
                return zza;
            }
            if (obj != null) {
                b = 1;
            }
            this.zzn = b;
            return null;
        }
    }
}
