package com.google.android.gms.internal.p986firebaseauthapi;

import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznh */
public final class zznh extends zzach implements zzadn {
    /* access modifiers changed from: private */
    public static final zznh zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzacm zzf = zzach.zzy();

    static {
        zznh zznh = new zznh();
        zzb = zznh;
        zzach.zzE(zznh.class, zznh);
    }

    private zznh() {
    }

    public static zzne zzc() {
        return (zzne) zzb.zzt();
    }

    public static zznh zzf(byte[] bArr, zzabu zzabu) throws zzacp {
        return (zznh) zzach.zzx(zzb, bArr, zzabu);
    }

    public static /* synthetic */ void zzi(zznh zznh, zzng zzng) {
        zzng.getClass();
        zzacm zzacm = zznh.zzf;
        if (!zzacm.zzc()) {
            zznh.zzf = zzach.zzz(zzacm);
        }
        zznh.zzf.add(zzng);
    }

    public final int zza() {
        return this.zzf.size();
    }

    public final int zzb() {
        return this.zze;
    }

    public final zzng zzd(int i) {
        return (zzng) this.zzf.get(i);
    }

    public final List zzg() {
        return this.zzf;
    }

    public final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzach.zzD(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", zzng.class});
        } else if (i2 == 3) {
            return new zznh();
        } else {
            if (i2 == 4) {
                return new zzne((zznd) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
