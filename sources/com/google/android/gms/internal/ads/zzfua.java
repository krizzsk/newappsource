package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

abstract class zzfua extends zzfuf {
    private static final Logger zza = Logger.getLogger(zzfua.class.getName());
    private zzfrc zzb;
    private final boolean zzc;
    private final boolean zze;

    public zzfua(zzfrc zzfrc, boolean z, boolean z2) {
        super(zzfrc.size());
        this.zzb = zzfrc;
        this.zzc = z;
        this.zze = z2;
    }

    private final void zzG(int i, Future future) {
        try {
            zzg(i, zzfva.zzp(future));
        } catch (ExecutionException e) {
            zzI(e.getCause());
        } catch (Throwable th) {
            zzI(th);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: zzH */
    public final void zzy(zzfrc zzfrc) {
        boolean z;
        int zzB = zzB();
        int i = 0;
        if (zzB >= 0) {
            z = true;
        } else {
            z = false;
        }
        zzfos.zzi(z, "Less than 0 remaining futures");
        if (zzB == 0) {
            if (zzfrc != null) {
                zzftg zze2 = zzfrc.iterator();
                while (zze2.hasNext()) {
                    Future future = (Future) zze2.next();
                    if (!future.isCancelled()) {
                        zzG(i, future);
                    }
                    i++;
                }
            }
            zzF();
            zzv();
            zzz(2);
        }
    }

    private final void zzI(Throwable th) {
        th.getClass();
        if (this.zzc && !zze(th) && zzK(zzE(), th)) {
            zzJ(th);
        } else if (th instanceof Error) {
            zzJ(th);
        }
    }

    private static void zzJ(Throwable th) {
        String str;
        if (true != (th instanceof Error)) {
            str = "Got more than one input Future failure. Logging failures after the first";
        } else {
            str = "Input Future failed with Error";
        }
        zza.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", str, th);
    }

    private static boolean zzK(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    public final String zza() {
        zzfrc zzfrc = this.zzb;
        if (zzfrc != null) {
            return "futures=".concat(zzfrc.toString());
        }
        return super.zza();
    }

    public final void zzb() {
        zzfrc zzfrc = this.zzb;
        boolean z = true;
        zzz(1);
        boolean isCancelled = isCancelled();
        if (zzfrc == null) {
            z = false;
        }
        if (z && isCancelled) {
            boolean zzu = zzu();
            zzftg zze2 = zzfrc.iterator();
            while (zze2.hasNext()) {
                ((Future) zze2.next()).cancel(zzu);
            }
        }
    }

    public final void zzf(Set set) {
        set.getClass();
        if (!isCancelled()) {
            Throwable zzp = zzp();
            zzp.getClass();
            zzK(set, zzp);
        }
    }

    public abstract void zzg(int i, Object obj);

    public abstract void zzv();

    public final void zzw() {
        zzfrc zzfrc;
        zzfrc zzfrc2 = this.zzb;
        zzfrc2.getClass();
        if (zzfrc2.isEmpty()) {
            zzv();
        } else if (this.zzc) {
            zzftg zze2 = this.zzb.iterator();
            int i = 0;
            while (zze2.hasNext()) {
                zzfvj zzfvj = (zzfvj) zze2.next();
                zzfvj.zzc(new zzfty(this, zzfvj, i), zzfuo.INSTANCE);
                i++;
            }
        } else {
            if (this.zze) {
                zzfrc = this.zzb;
            } else {
                zzfrc = null;
            }
            zzftz zzftz = new zzftz(this, zzfrc);
            zzftg zze3 = this.zzb.iterator();
            while (zze3.hasNext()) {
                ((zzfvj) zze3.next()).zzc(zzftz, zzfuo.INSTANCE);
            }
        }
    }

    public final /* synthetic */ void zzx(zzfvj zzfvj, int i) {
        try {
            if (zzfvj.isCancelled()) {
                this.zzb = null;
                cancel(false);
            } else {
                zzG(i, zzfvj);
            }
        } finally {
            zzy((zzfrc) null);
        }
    }

    public void zzz(int i) {
        this.zzb = null;
    }
}
