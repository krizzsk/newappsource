package com.google.android.gms.internal.contextmanager;

public class zzmv {
    private static final zzlp zzb = zzlp.zza();
    public volatile zznn zza;
    private volatile zzld zzc;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzmv)) {
            return false;
        }
        zzmv zzmv = (zzmv) obj;
        zznn zznn = this.zza;
        zznn zznn2 = zzmv.zza;
        if (zznn == null && zznn2 == null) {
            return zzb().equals(zzmv.zzb());
        }
        if (zznn != null && zznn2 != null) {
            return zznn.equals(zznn2);
        }
        if (zznn != null) {
            zzmv.zzd(zznn.zzu());
            return zznn.equals(zzmv.zza);
        }
        zzd(zznn2.zzu());
        return this.zza.equals(zznn2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzc != null) {
            return ((zzlb) this.zzc).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzv();
        }
        return 0;
    }

    public final zzld zzb() {
        if (this.zzc != null) {
            return this.zzc;
        }
        synchronized (this) {
            if (this.zzc != null) {
                zzld zzld = this.zzc;
                return zzld;
            }
            if (this.zza == null) {
                this.zzc = zzld.zzb;
            } else {
                this.zzc = this.zza.zzq();
            }
            zzld zzld2 = this.zzc;
            return zzld2;
        }
    }

    public final zznn zzc(zznn zznn) {
        zznn zznn2 = this.zza;
        this.zzc = null;
        this.zza = zznn;
        return zznn2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0011 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzd(com.google.android.gms.internal.contextmanager.zznn r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.contextmanager.zznn r0 = r1.zza
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r1)
            com.google.android.gms.internal.contextmanager.zznn r0 = r1.zza     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.zza = r2     // Catch:{ zzmp -> 0x0011 }
            com.google.android.gms.internal.contextmanager.zzld r0 = com.google.android.gms.internal.contextmanager.zzld.zzb     // Catch:{ zzmp -> 0x0011 }
            r1.zzc = r0     // Catch:{ zzmp -> 0x0011 }
            goto L_0x0017
        L_0x0011:
            r1.zza = r2     // Catch:{ all -> 0x001b }
            com.google.android.gms.internal.contextmanager.zzld r2 = com.google.android.gms.internal.contextmanager.zzld.zzb     // Catch:{ all -> 0x001b }
            r1.zzc = r2     // Catch:{ all -> 0x001b }
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x0019:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.contextmanager.zzmv.zzd(com.google.android.gms.internal.contextmanager.zznn):void");
    }
}
