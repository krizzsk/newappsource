package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

abstract class zzftx extends zzfuq implements Runnable {
    public static final /* synthetic */ int zzc = 0;
    public zzfvj zza;
    public Object zzb;

    public zzftx(zzfvj zzfvj, Object obj) {
        zzfvj.getClass();
        this.zza = zzfvj;
        obj.getClass();
        this.zzb = obj;
    }

    public final void run() {
        boolean z;
        zzfvj zzfvj = this.zza;
        Object obj = this.zzb;
        boolean isCancelled = isCancelled();
        boolean z2 = true;
        if (zzfvj == null) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = isCancelled | z;
        if (obj != null) {
            z2 = false;
        }
        if (!z3 && !z2) {
            this.zza = null;
            if (zzfvj.isCancelled()) {
                zzt(zzfvj);
                return;
            }
            try {
                try {
                    Object zzf = zzf(obj, zzfva.zzp(zzfvj));
                    this.zzb = null;
                    zzg(zzf);
                } catch (Throwable th) {
                    this.zzb = null;
                    throw th;
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e) {
                zze(e.getCause());
            } catch (RuntimeException e2) {
                zze(e2);
            } catch (Error e3) {
                zze(e3);
            }
        }
    }

    public final String zza() {
        String str;
        zzfvj zzfvj = this.zza;
        Object obj = this.zzb;
        String zza2 = super.zza();
        if (zzfvj != null) {
            String obj2 = zzfvj.toString();
            str = C13715c.m34245k(new StringBuilder(obj2.length() + 16), "inputFuture=[", obj2, "], ");
        } else {
            str = "";
        }
        if (obj != null) {
            String obj3 = obj.toString();
            return C13715c.m34246l(new StringBuilder(obj3.length() + str.length() + 11), str, "function=[", obj3, "]");
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
    }

    public abstract Object zzf(Object obj, Object obj2) throws Exception;

    public abstract void zzg(Object obj);
}
