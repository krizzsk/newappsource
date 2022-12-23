package p600kd;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm;

/* renamed from: kd.a */
public final class C18018a extends zzec<C18018a, C18025h> implements zzfm {
    /* access modifiers changed from: private */
    public static final C18018a zza;
    private int zze;
    private C18024g zzf;
    private C18027j zzg;

    static {
        C18018a aVar = new C18018a();
        zza = aVar;
        zzec.zzS(C18018a.class, aVar);
    }

    /* renamed from: a */
    public static C18025h m44680a() {
        return (C18025h) zza.zzF();
    }

    /* renamed from: c */
    public static /* synthetic */ void m44682c(C18018a aVar, C18024g gVar) {
        gVar.getClass();
        aVar.zzf = gVar;
        aVar.zze |= 1;
    }

    /* renamed from: d */
    public static /* synthetic */ void m44683d(C18018a aVar, C18027j jVar) {
        jVar.getClass();
        aVar.zzg = jVar;
        aVar.zze |= 2;
    }

    public final Object zzg(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzec.zzR(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C18018a();
        } else {
            if (i2 == 4) {
                return new C18025h(0);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
