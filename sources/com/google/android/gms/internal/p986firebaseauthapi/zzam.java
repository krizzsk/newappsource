package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzam */
final class zzam extends zzal {
    public static final zzal zza = new zzam(new Object[0], 0);
    public final transient Object[] zzb;

    public zzam(Object[] objArr, int i) {
        this.zzb = objArr;
    }

    public final Object get(int i) {
        zzy.zza(i, 0, "index");
        Object obj = this.zzb[i];
        obj.getClass();
        return obj;
    }

    public final int size() {
        return 0;
    }

    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzb, 0, objArr, 0, 0);
        return 0;
    }

    public final int zzb() {
        return 0;
    }

    public final int zzc() {
        return 0;
    }

    public final Object[] zze() {
        return this.zzb;
    }
}
