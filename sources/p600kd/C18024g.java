package p600kd;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhj;

/* renamed from: kd.g */
public final class C18024g extends zzec implements zzfm {
    /* access modifiers changed from: private */
    public static final C18024g zza;
    private int zze;
    private String zzf = "";
    private zzdb zzg = zzdb.zzb;
    private int zzh = 10;
    private float zzi = 0.5f;
    private float zzj = 0.05f;
    private C18022e zzk;
    private zzeh zzl = zzec.zzL();
    private int zzm = 1;
    private zzhj zzn;
    private int zzo = 320;
    private int zzp = 4;
    private int zzq = 2;

    static {
        C18024g gVar = new C18024g();
        zza = gVar;
        zzec.zzS(C18024g.class, gVar);
    }

    /* renamed from: a */
    public static C18023f m44693a() {
        return (C18023f) zza.zzF();
    }

    /* renamed from: c */
    public static /* synthetic */ void m44695c(C18024g gVar, C18022e eVar) {
        eVar.getClass();
        gVar.zzk = eVar;
        gVar.zze |= 32;
    }

    /* renamed from: d */
    public static /* synthetic */ void m44696d(C18024g gVar, zzdb zzdb) {
        zzdb.getClass();
        gVar.zze |= 2;
        gVar.zzg = zzdb;
    }

    public final Object zzg(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzec.zzR(zza, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဋ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ဉ\u0005\u0007\u0013\bင\u0006\tဉ\u0007\nင\b\u000bင\t\fင\n", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq"});
        } else if (i2 == 3) {
            return new C18024g();
        } else {
            if (i2 == 4) {
                return new C18023f(0);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
