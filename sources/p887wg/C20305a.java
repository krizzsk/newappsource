package p887wg;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzek;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzen;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm;

/* renamed from: wg.a */
public final class C20305a extends zzec<C20305a, C20326s> implements zzfm {
    /* access modifiers changed from: private */
    public static final C20305a zza;
    private int zze;
    private zzek zzf = zzec.zzO();
    private int zzg;
    private String zzh = "";
    private zzdb zzi = zzdb.zzb;
    private byte zzj = 2;

    static {
        C20305a aVar = new C20305a();
        zza = aVar;
        zzec.zzS(C20305a.class, aVar);
    }

    /* renamed from: b */
    public static C20305a m47882b(byte[] bArr, zzdn zzdn) throws zzen {
        return (C20305a) zzec.zzJ(zza, bArr, zzdn);
    }

    /* renamed from: c */
    public final zzek mo52471c() {
        return this.zzf;
    }

    public final Object zzg(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzj);
        }
        byte b = 1;
        if (i2 == 2) {
            return zzec.zzR(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001Л\u0002ᔌ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zze", "zzf", C20323p.class, "zzg", C20316i.f51492a, "zzh", "zzi"});
        } else if (i2 == 3) {
            return new C20305a();
        } else {
            if (i2 == 4) {
                return new C20326s();
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
