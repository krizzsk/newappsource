package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

public class zzet {
    private static final zzdn zzb = zzdn.zza();
    public volatile zzfl zza;
    private volatile zzdb zzc;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzet)) {
            return false;
        }
        zzet zzet = (zzet) obj;
        zzfl zzfl = this.zza;
        zzfl zzfl2 = zzet.zza;
        if (zzfl == null && zzfl2 == null) {
            return zzb().equals(zzet.zzb());
        }
        if (zzfl != null && zzfl2 != null) {
            return zzfl.equals(zzfl2);
        }
        if (zzfl != null) {
            zzet.zzd(zzfl.zzX());
            return zzfl.equals(zzet.zza);
        }
        zzd(zzfl2.zzX());
        return this.zza.equals(zzfl2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzc != null) {
            return ((zzcz) this.zzc).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzE();
        }
        return 0;
    }

    public final zzdb zzb() {
        if (this.zzc != null) {
            return this.zzc;
        }
        synchronized (this) {
            if (this.zzc != null) {
                zzdb zzdb = this.zzc;
                return zzdb;
            }
            if (this.zza == null) {
                this.zzc = zzdb.zzb;
            } else {
                this.zzc = this.zza.zzC();
            }
            zzdb zzdb2 = this.zzc;
            return zzdb2;
        }
    }

    public final zzfl zzc(zzfl zzfl) {
        zzfl zzfl2 = this.zza;
        this.zzc = null;
        this.zza = zzfl;
        return zzfl2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0011 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzd(com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfl r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfl r0 = r1.zza
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r1)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfl r0 = r1.zza     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.zza = r2     // Catch:{ zzen -> 0x0011 }
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb r0 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb.zzb     // Catch:{ zzen -> 0x0011 }
            r1.zzc = r0     // Catch:{ zzen -> 0x0011 }
            goto L_0x0017
        L_0x0011:
            r1.zza = r2     // Catch:{ all -> 0x001b }
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb r2 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb.zzb     // Catch:{ all -> 0x001b }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzet.zzd(com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfl):void");
    }
}
