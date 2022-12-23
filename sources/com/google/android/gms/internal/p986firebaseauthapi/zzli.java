package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzli */
public final class zzli extends zzach implements zzadn {
    /* access modifiers changed from: private */
    public static final zzli zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzlc zzf;
    /* access modifiers changed from: private */
    public zzabe zzg;
    /* access modifiers changed from: private */
    public zzabe zzh;

    static {
        zzli zzli = new zzli();
        zzb = zzli;
        zzach.zzE(zzli.class, zzli);
    }

    private zzli() {
        zzabe zzabe = zzabe.zzb;
        this.zzg = zzabe;
        this.zzh = zzabe;
    }

    public static zzlh zzc() {
        return (zzlh) zzb.zzt();
    }

    public static zzli zze() {
        return zzb;
    }

    public static zzli zzf(zzabe zzabe, zzabu zzabu) throws zzacp {
        return (zzli) zzach.zzw(zzb, zzabe, zzabu);
    }

    public static /* synthetic */ void zzk(zzli zzli, zzlc zzlc) {
        zzlc.getClass();
        zzli.zzf = zzlc;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzlc zzb() {
        zzlc zzlc = this.zzf;
        return zzlc == null ? zzlc.zzd() : zzlc;
    }

    public final zzabe zzg() {
        return this.zzg;
    }

    public final zzabe zzh() {
        return this.zzh;
    }

    public final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzach.zzD(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new zzli();
        } else {
            if (i2 == 4) {
                return new zzlh((zzlg) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
