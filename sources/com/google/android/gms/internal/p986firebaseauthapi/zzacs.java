package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacs */
public class zzacs {
    private static final zzabu zzb = zzabu.zza;
    public volatile zzadm zza;
    private volatile zzabe zzc;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzacs)) {
            return false;
        }
        zzacs zzacs = (zzacs) obj;
        zzadm zzadm = this.zza;
        zzadm zzadm2 = zzacs.zza;
        if (zzadm == null && zzadm2 == null) {
            return zzb().equals(zzacs.zzb());
        }
        if (zzadm != null && zzadm2 != null) {
            return zzadm.equals(zzadm2);
        }
        if (zzadm != null) {
            zzacs.zzc(zzadm.zzH());
            return zzadm.equals(zzacs.zza);
        }
        zzc(zzadm2.zzH());
        return this.zza.equals(zzadm2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzc != null) {
            return ((zzabb) this.zzc).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzs();
        }
        return 0;
    }

    public final zzabe zzb() {
        if (this.zzc != null) {
            return this.zzc;
        }
        synchronized (this) {
            if (this.zzc != null) {
                zzabe zzabe = this.zzc;
                return zzabe;
            }
            if (this.zza == null) {
                this.zzc = zzabe.zzb;
            } else {
                this.zzc = this.zza.zzo();
            }
            zzabe zzabe2 = this.zzc;
            return zzabe2;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0011 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzc(com.google.android.gms.internal.p986firebaseauthapi.zzadm r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.firebase-auth-api.zzadm r0 = r1.zza
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r1)
            com.google.android.gms.internal.firebase-auth-api.zzadm r0 = r1.zza     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.zza = r2     // Catch:{ zzacp -> 0x0011 }
            com.google.android.gms.internal.firebase-auth-api.zzabe r0 = com.google.android.gms.internal.p986firebaseauthapi.zzabe.zzb     // Catch:{ zzacp -> 0x0011 }
            r1.zzc = r0     // Catch:{ zzacp -> 0x0011 }
            goto L_0x0017
        L_0x0011:
            r1.zza = r2     // Catch:{ all -> 0x001b }
            com.google.android.gms.internal.firebase-auth-api.zzabe r2 = com.google.android.gms.internal.p986firebaseauthapi.zzabe.zzb     // Catch:{ all -> 0x001b }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p986firebaseauthapi.zzacs.zzc(com.google.android.gms.internal.firebase-auth-api.zzadm):void");
    }
}
