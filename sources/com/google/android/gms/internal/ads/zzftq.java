package com.google.android.gms.internal.ads;

import p001a0.C0016g;
import p001a0.C0017h;

abstract class zzftq extends zzfuq implements Runnable {
    public zzfvj zza;
    public Class zzb;
    public Object zzc;

    public zzftq(zzfvj zzfvj, Class cls, Object obj) {
        zzfvj.getClass();
        this.zza = zzfvj;
        this.zzb = cls;
        obj.getClass();
        this.zzc = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.zzfvj r0 = r10.zza
            java.lang.Class r1 = r10.zzb
            java.lang.Object r2 = r10.zzc
            r3 = 1
            if (r0 != 0) goto L_0x000b
            r4 = 1
            goto L_0x000c
        L_0x000b:
            r4 = 0
        L_0x000c:
            if (r1 != 0) goto L_0x0010
            r5 = 1
            goto L_0x0011
        L_0x0010:
            r5 = 0
        L_0x0011:
            r4 = r4 | r5
            if (r2 != 0) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            r3 = r3 | r4
            if (r3 != 0) goto L_0x00a2
            boolean r3 = r10.isCancelled()
            if (r3 == 0) goto L_0x0021
            goto L_0x00a2
        L_0x0021:
            r3 = 0
            r10.zza = r3
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzfwb     // Catch:{ ExecutionException -> 0x003a, all -> 0x0038 }
            if (r4 == 0) goto L_0x0030
            r4 = r0
            com.google.android.gms.internal.ads.zzfwb r4 = (com.google.android.gms.internal.ads.zzfwb) r4     // Catch:{ ExecutionException -> 0x003a, all -> 0x0038 }
            java.lang.Throwable r4 = r4.zzp()     // Catch:{ ExecutionException -> 0x003a, all -> 0x0038 }
            goto L_0x0031
        L_0x0030:
            r4 = r3
        L_0x0031:
            if (r4 != 0) goto L_0x0077
            java.lang.Object r5 = com.google.android.gms.internal.ads.zzfva.zzp(r0)     // Catch:{ ExecutionException -> 0x003a, all -> 0x0038 }
            goto L_0x0078
        L_0x0038:
            r4 = move-exception
            goto L_0x0077
        L_0x003a:
            r4 = move-exception
            java.lang.Throwable r5 = r4.getCause()
            if (r5 != 0) goto L_0x0076
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.Class r6 = r0.getClass()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r7 = r6.length()
            int r8 = r4.length()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            int r7 = r7 + 35
            int r7 = r7 + r8
            r9.<init>(r7)
            java.lang.String r7 = "Future type "
            java.lang.String r8 = " threw "
            p001a0.C0017h.m61R(r9, r7, r6, r8, r4)
            java.lang.String r4 = " without a cause"
            r9.append(r4)
            java.lang.String r4 = r9.toString()
            r5.<init>(r4)
        L_0x0076:
            r4 = r5
        L_0x0077:
            r5 = r3
        L_0x0078:
            if (r4 != 0) goto L_0x007e
            r10.zzd(r5)
            return
        L_0x007e:
            boolean r1 = r1.isInstance(r4)
            if (r1 == 0) goto L_0x009f
            java.lang.Object r0 = r10.zzf(r2, r4)     // Catch:{ all -> 0x0090 }
            r10.zzb = r3
            r10.zzc = r3
            r10.zzg(r0)
            return
        L_0x0090:
            r0 = move-exception
            r10.zze(r0)     // Catch:{ all -> 0x0099 }
            r10.zzb = r3
            r10.zzc = r3
            return
        L_0x0099:
            r0 = move-exception
            r10.zzb = r3
            r10.zzc = r3
            throw r0
        L_0x009f:
            r10.zzt(r0)
        L_0x00a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzftq.run():void");
    }

    public final String zza() {
        String str;
        zzfvj zzfvj = this.zza;
        Class cls = this.zzb;
        Object obj = this.zzc;
        String zza2 = super.zza();
        if (zzfvj != null) {
            String obj2 = zzfvj.toString();
            str = C13715c.m34245k(new StringBuilder(obj2.length() + 16), "inputFuture=[", obj2, "], ");
        } else {
            str = "";
        }
        if (cls != null && obj != null) {
            String obj3 = cls.toString();
            String obj4 = obj.toString();
            StringBuilder sb = new StringBuilder(obj4.length() + obj3.length() + str.length() + 29);
            C0017h.m61R(sb, str, "exceptionType=[", obj3, "], fallback=[");
            return C0016g.m31o(sb, obj4, "]");
        } else if (zza2 == null) {
            return null;
        } else {
            if (zza2.length() != 0) {
                return str.concat(zza2);
            }
            return new String(str);
        }
    }

    public final void zzb() {
        zzs(this.zza);
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    public abstract Object zzf(Object obj, Throwable th) throws Exception;

    public abstract void zzg(Object obj);
}
