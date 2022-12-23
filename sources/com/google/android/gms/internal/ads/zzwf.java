package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import com.appboy.models.InAppMessageBase;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

@SuppressLint({"HandlerLeak"})
final class zzwf extends Handler implements Runnable {
    public final /* synthetic */ zzwk zza;
    private final zzwg zzb;
    private final long zzc;
    private zzwc zzd;
    private IOException zze;
    private int zzf;
    private Thread zzg;
    private boolean zzh;
    private volatile boolean zzi;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzwf(zzwk zzwk, Looper looper, zzwg zzwg, zzwc zzwc, int i, long j) {
        super(looper);
        this.zza = zzwk;
        this.zzb = zzwg;
        this.zzd = zzwc;
        this.zzc = j;
    }

    private final void zzd() {
        this.zze = null;
        zzwk zzwk = this.zza;
        ExecutorService zzd2 = zzwk.zze;
        zzwf zzc2 = zzwk.zzf;
        zzc2.getClass();
        zzd2.execute(zzc2);
    }

    public final void handleMessage(Message message) {
        long j;
        if (!this.zzi) {
            int i = message.what;
            if (i == 0) {
                zzd();
            } else if (i != 3) {
                this.zza.zzf = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j2 = elapsedRealtime - this.zzc;
                zzwc zzwc = this.zzd;
                zzwc.getClass();
                if (this.zzh) {
                    zzwc.zzG(this.zzb, elapsedRealtime, j2, false);
                    return;
                }
                int i2 = message.what;
                if (i2 == 1) {
                    try {
                        zzwc.zzH(this.zzb, elapsedRealtime, j2);
                    } catch (RuntimeException e) {
                        zzdn.zza("LoadTask", "Unexpected exception handling load completed", e);
                        this.zza.zzg = new zzwj(e);
                    }
                } else if (i2 == 2) {
                    IOException iOException = (IOException) message.obj;
                    this.zze = iOException;
                    int i3 = this.zzf + 1;
                    this.zzf = i3;
                    zzwe zzt = zzwc.zzt(this.zzb, elapsedRealtime, j2, iOException, i3);
                    if (zzt.zza == 3) {
                        this.zza.zzg = this.zze;
                    } else if (zzt.zza != 2) {
                        if (zzt.zza == 1) {
                            this.zzf = 1;
                        }
                        if (zzt.zzb != -9223372036854775807L) {
                            j = zzt.zzb;
                        } else {
                            j = (long) Math.min((this.zzf - 1) * 1000, InAppMessageBase.INAPP_MESSAGE_DURATION_DEFAULT_MILLIS);
                        }
                        zzc(j);
                    }
                }
            } else {
                throw ((Error) message.obj);
            }
        }
    }

    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = !this.zzh;
                this.zzg = Thread.currentThread();
            }
            if (z) {
                int i = zzeg.zza;
                Trace.beginSection("load:" + this.zzb.getClass().getSimpleName());
                this.zzb.zzi();
                Trace.endSection();
            }
            synchronized (this) {
                this.zzg = null;
                Thread.interrupted();
            }
            if (!this.zzi) {
                sendEmptyMessage(1);
            }
        } catch (IOException e) {
            if (!this.zzi) {
                obtainMessage(2, e).sendToTarget();
            }
        } catch (Exception e2) {
            if (!this.zzi) {
                zzdn.zza("LoadTask", "Unexpected exception loading stream", e2);
                obtainMessage(2, new zzwj(e2)).sendToTarget();
            }
        } catch (OutOfMemoryError e3) {
            if (!this.zzi) {
                zzdn.zza("LoadTask", "OutOfMemory error loading stream", e3);
                obtainMessage(2, new zzwj(e3)).sendToTarget();
            }
        } catch (Error e4) {
            if (!this.zzi) {
                zzdn.zza("LoadTask", "Unexpected error loading stream", e4);
                obtainMessage(3, e4).sendToTarget();
            }
            throw e4;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final void zza(boolean z) {
        this.zzi = z;
        this.zze = null;
        if (hasMessages(0)) {
            this.zzh = true;
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                this.zzh = true;
                this.zzb.zzh();
                Thread thread = this.zzg;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z) {
            this.zza.zzf = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            zzwc zzwc = this.zzd;
            zzwc.getClass();
            zzwc.zzG(this.zzb, elapsedRealtime, elapsedRealtime - this.zzc, true);
            this.zzd = null;
        }
    }

    public final void zzb(int i) throws IOException {
        IOException iOException = this.zze;
        if (iOException != null && this.zzf > i) {
            throw iOException;
        }
    }

    public final void zzc(long j) {
        boolean z;
        if (this.zza.zzf == null) {
            z = true;
        } else {
            z = false;
        }
        zzcw.zzf(z);
        this.zza.zzf = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            zzd();
        }
    }
}
