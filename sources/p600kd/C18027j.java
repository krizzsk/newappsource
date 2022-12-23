package p600kd;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm;

/* renamed from: kd.j */
public final class C18027j extends zzec implements zzfm {
    /* access modifiers changed from: private */
    public static final C18027j zza;
    private int zze;
    private String zzf = "";
    private zzdb zzg;
    private String zzh;
    private zzdb zzi;
    private float zzj;
    private float zzk;
    private float zzl;
    private float zzm;
    private int zzn;

    static {
        C18027j jVar = new C18027j();
        zza = jVar;
        zzec.zzS(C18027j.class, jVar);
    }

    public C18027j() {
        zzdb zzdb = zzdb.zzb;
        this.zzg = zzdb;
        this.zzh = "";
        this.zzi = zzdb;
        this.zzj = 0.25f;
        this.zzk = 0.25f;
        this.zzl = 0.5f;
        this.zzm = 0.85f;
        this.zzn = 1;
    }

    /* renamed from: a */
    public static C18026i m44697a() {
        return (C18026i) zza.zzF();
    }

    /* renamed from: c */
    public static /* synthetic */ void m44699c(C18027j jVar, zzdb zzdb) {
        zzdb.getClass();
        jVar.zze |= 2;
        jVar.zzg = zzdb;
    }

    /* renamed from: d */
    public static /* synthetic */ void m44700d(C18027j jVar, zzdb zzdb) {
        zzdb.getClass();
        jVar.zze |= 8;
        jVar.zzi = zzdb;
    }

    public final Object zzg(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzec.zzR(zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ည\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\tင\b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn"});
        } else if (i2 == 3) {
            return new C18027j();
        } else {
            if (i2 == 4) {
                return new C18026i(0);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
