package p887wg;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm;

/* renamed from: wg.f */
public final class C20313f extends zzec implements zzfm {
    /* access modifiers changed from: private */
    public static final C20313f zza;
    private int zze;
    private int zzf;
    private int zzg;
    private byte zzh = 2;

    static {
        C20313f fVar = new C20313f();
        zza = fVar;
        zzec.zzS(C20313f.class, fVar);
    }

    /* renamed from: c */
    public static C20312e m47892c() {
        return (C20312e) zza.zzF();
    }

    /* renamed from: e */
    public static /* synthetic */ void m47894e(int i, C20313f fVar) {
        fVar.zze |= 1;
        fVar.zzf = i;
    }

    /* renamed from: f */
    public static /* synthetic */ void m47895f(int i, C20313f fVar) {
        fVar.zze |= 2;
        fVar.zzg = i;
    }

    /* renamed from: a */
    public final int mo52479a() {
        return this.zzf;
    }

    /* renamed from: b */
    public final int mo52480b() {
        return this.zzg;
    }

    public final Object zzg(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzh);
        }
        byte b = 1;
        if (i2 == 2) {
            return zzec.zzR(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔄ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C20313f();
        } else {
            if (i2 == 4) {
                return new C20312e(0);
            }
            if (i2 == 5) {
                return zza;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzh = b;
            return null;
        }
    }
}
