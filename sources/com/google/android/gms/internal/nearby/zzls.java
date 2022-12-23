package com.google.android.gms.internal.nearby;

import java.io.InputStream;
import java.io.OutputStream;

final class zzls implements Runnable {
    public final /* synthetic */ InputStream zza;
    public final /* synthetic */ OutputStream zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ OutputStream zzd;
    public final /* synthetic */ zzlt zze;

    public zzls(zzlt zzlt, InputStream inputStream, OutputStream outputStream, long j, OutputStream outputStream2) {
        this.zze = zzlt;
        this.zza = inputStream;
        this.zzb = outputStream;
        this.zzc = j;
        this.zzd = outputStream2;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0030 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            com.google.android.gms.internal.nearby.zzlt r0 = r7.zze
            java.io.InputStream r1 = r7.zza
            r0.zzb = r1
            r0 = 0
            r1 = 1
            r2 = 0
            java.io.InputStream r3 = r7.zza     // Catch:{ IOException -> 0x0030, all -> 0x002c }
            java.io.OutputStream r4 = r7.zzb     // Catch:{ IOException -> 0x0030, all -> 0x002c }
            r5 = 65536(0x10000, float:9.18355E-41)
            com.google.android.gms.common.util.IOUtils.copyStream(r3, r4, r2, r5)     // Catch:{ IOException -> 0x0030, all -> 0x002c }
            java.io.InputStream r1 = r7.zza
            com.google.android.gms.common.util.IOUtils.closeQuietly((java.io.Closeable) r1)
            com.google.android.gms.internal.nearby.zzlt r1 = r7.zze
            java.io.OutputStream r3 = r7.zzd
            long r4 = r7.zzc
            com.google.android.gms.internal.nearby.zzlt.zzb(r1, r3, r2, r4)
        L_0x0021:
            java.io.OutputStream r1 = r7.zzb
            com.google.android.gms.common.util.IOUtils.closeQuietly((java.io.Closeable) r1)
            com.google.android.gms.internal.nearby.zzlt r1 = r7.zze
            r1.zzb = r0
            return
        L_0x002c:
            r1 = move-exception
            r2 = r1
            r1 = 0
            goto L_0x0067
        L_0x0030:
            com.google.android.gms.internal.nearby.zzlt r3 = r7.zze     // Catch:{ all -> 0x0066 }
            boolean r3 = r3.zzc     // Catch:{ all -> 0x0066 }
            if (r3 != 0) goto L_0x0048
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ all -> 0x0066 }
            long r4 = r7.zzc     // Catch:{ all -> 0x0066 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0066 }
            r3[r2] = r4     // Catch:{ all -> 0x0066 }
            java.lang.String r2 = "Exception copying stream for Payload %d"
            java.lang.String.format(r2, r3)     // Catch:{ all -> 0x0066 }
            goto L_0x0057
        L_0x0048:
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ all -> 0x0066 }
            long r4 = r7.zzc     // Catch:{ all -> 0x0066 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0066 }
            r3[r2] = r4     // Catch:{ all -> 0x0066 }
            java.lang.String r2 = "Terminating copying stream for Payload %d due to shutdown of OutgoingPayloadStreamer."
            java.lang.String.format(r2, r3)     // Catch:{ all -> 0x0066 }
        L_0x0057:
            java.io.InputStream r2 = r7.zza
            com.google.android.gms.common.util.IOUtils.closeQuietly((java.io.Closeable) r2)
            com.google.android.gms.internal.nearby.zzlt r2 = r7.zze
            java.io.OutputStream r3 = r7.zzd
            long r4 = r7.zzc
            com.google.android.gms.internal.nearby.zzlt.zzb(r2, r3, r1, r4)
            goto L_0x0021
        L_0x0066:
            r2 = move-exception
        L_0x0067:
            java.io.InputStream r3 = r7.zza
            com.google.android.gms.common.util.IOUtils.closeQuietly((java.io.Closeable) r3)
            com.google.android.gms.internal.nearby.zzlt r3 = r7.zze
            java.io.OutputStream r4 = r7.zzd
            long r5 = r7.zzc
            com.google.android.gms.internal.nearby.zzlt.zzb(r3, r4, r1, r5)
            java.io.OutputStream r1 = r7.zzb
            com.google.android.gms.common.util.IOUtils.closeQuietly((java.io.Closeable) r1)
            com.google.android.gms.internal.nearby.zzlt r1 = r7.zze
            r1.zzb = r0
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.nearby.zzls.run():void");
    }
}
