package com.google.android.gms.cloudmessaging;

import android.os.Handler;

public final /* synthetic */ class zzf implements Handler.Callback {
    public final /* synthetic */ zzm zza;

    public /* synthetic */ zzf(zzm zzm) {
        this.zza = zzm;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r5.getBoolean("unsupported", false) == false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        r2.zzc(new com.google.android.gms.cloudmessaging.zzq(4, "Not supported by GmsCore", (java.lang.Throwable) null));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        r2.zza(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        r5 = r5.getData();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r5) {
        /*
            r4 = this;
            com.google.android.gms.cloudmessaging.zzm r0 = r4.zza
            int r1 = r5.arg1
            monitor-enter(r0)
            android.util.SparseArray<com.google.android.gms.cloudmessaging.zzp<?>> r2 = r0.zze     // Catch:{ all -> 0x0039 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x0039 }
            com.google.android.gms.cloudmessaging.zzp r2 = (com.google.android.gms.cloudmessaging.zzp) r2     // Catch:{ all -> 0x0039 }
            if (r2 != 0) goto L_0x0011
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            goto L_0x0037
        L_0x0011:
            android.util.SparseArray<com.google.android.gms.cloudmessaging.zzp<?>> r3 = r0.zze     // Catch:{ all -> 0x0039 }
            r3.remove(r1)     // Catch:{ all -> 0x0039 }
            r0.zzf()     // Catch:{ all -> 0x0039 }
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            android.os.Bundle r5 = r5.getData()
            java.lang.String r0 = "unsupported"
            r1 = 0
            boolean r0 = r5.getBoolean(r0, r1)
            if (r0 == 0) goto L_0x0034
            com.google.android.gms.cloudmessaging.zzq r5 = new com.google.android.gms.cloudmessaging.zzq
            r0 = 4
            java.lang.String r1 = "Not supported by GmsCore"
            r3 = 0
            r5.<init>(r0, r1, r3)
            r2.zzc(r5)
            goto L_0x0037
        L_0x0034:
            r2.zza(r5)
        L_0x0037:
            r5 = 1
            return r5
        L_0x0039:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cloudmessaging.zzf.handleMessage(android.os.Message):boolean");
    }
}
