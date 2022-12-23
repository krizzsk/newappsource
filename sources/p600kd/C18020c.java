package p600kd;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm;

/* renamed from: kd.c */
public final class C18020c extends zzec implements zzfm {
    /* access modifiers changed from: private */
    public static final C18020c zza;
    private int zze;
    private zzeh zzf = zzec.zzL();
    private zzeh zzg = zzec.zzL();
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;

    static {
        C18020c cVar = new C18020c();
        zza = cVar;
        zzec.zzS(C18020c.class, cVar);
    }

    /* renamed from: a */
    public static C18019b m44684a() {
        return (C18019b) zza.zzF();
    }

    /* renamed from: c */
    public static /* synthetic */ void m44686c(C18020c cVar, int i) {
        cVar.zze |= 2;
        cVar.zzi = i;
    }

    /* renamed from: d */
    public static /* synthetic */ void m44687d(C18020c cVar, float f) {
        zzeh zzeh = cVar.zzf;
        if (!zzeh.zzc()) {
            cVar.zzf = zzec.zzM(zzeh);
        }
        cVar.zzf.zzg(f);
    }

    /* renamed from: e */
    public static /* synthetic */ void m44688e(C18020c cVar, float f) {
        zzeh zzeh = cVar.zzg;
        if (!zzeh.zzc()) {
            cVar.zzg = zzec.zzM(zzeh);
        }
        cVar.zzg.zzg(f);
    }

    /* renamed from: f */
    public static /* synthetic */ void m44689f(C18020c cVar, int i) {
        cVar.zze |= 1;
        cVar.zzh = i;
    }

    public final Object zzg(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzec.zzR(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u0013\u0002\u0013\u0003ဋ\u0000\u0004ဋ\u0001\u0005ဋ\u0002\u0006ဋ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        } else if (i2 == 3) {
            return new C18020c();
        } else {
            if (i2 == 4) {
                return new C18019b(0);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
