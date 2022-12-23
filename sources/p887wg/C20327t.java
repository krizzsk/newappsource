package p887wg;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzek;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm;

/* renamed from: wg.t */
public final class C20327t extends zzec implements zzfm {
    /* access modifiers changed from: private */
    public static final C20327t zza;
    private int zze;
    private String zzf = "";
    private zzek zzg = zzec.zzO();

    static {
        C20327t tVar = new C20327t();
        zza = tVar;
        zzec.zzS(C20327t.class, tVar);
    }

    public final Object zzg(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzec.zzR(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zze", "zzf", "zzg", C20307b.class});
        } else if (i2 == 3) {
            return new C20327t();
        } else {
            if (i2 == 4) {
                return new C20317j();
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
