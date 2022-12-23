package p600kd;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzek;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm;

/* renamed from: kd.e */
public final class C18022e extends zzec implements zzfm {
    /* access modifiers changed from: private */
    public static final C18022e zza;
    private zzek zze = zzec.zzO();

    static {
        C18022e eVar = new C18022e();
        zza = eVar;
        zzec.zzS(C18022e.class, eVar);
    }

    /* renamed from: a */
    public static C18021d m44690a() {
        return (C18021d) zza.zzF();
    }

    /* renamed from: c */
    public static /* synthetic */ void m44692c(C18022e eVar, C18020c cVar) {
        cVar.getClass();
        zzek zzek = eVar.zze;
        if (!zzek.zzc()) {
            eVar.zze = zzec.zzP(zzek);
        }
        eVar.zze.add(cVar);
    }

    public final Object zzg(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzec.zzR(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", C18020c.class});
        } else if (i2 == 3) {
            return new C18022e();
        } else {
            if (i2 == 4) {
                return new C18021d(0);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
