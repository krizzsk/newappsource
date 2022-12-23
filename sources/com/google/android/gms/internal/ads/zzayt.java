package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.appboy.models.InAppMessageBase;
import java.io.IOException;

@SuppressLint({"HandlerLeak"})
final class zzayt extends Handler implements Runnable {
    public final int zza;
    public final /* synthetic */ zzayw zzb;
    private final zzayu zzc;
    private final zzays zzd;
    private final long zze;
    private IOException zzf;
    private int zzg;
    private volatile Thread zzh;
    private volatile boolean zzi;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzayt(zzayw zzayw, Looper looper, zzayu zzayu, zzays zzays, int i, long j) {
        super(looper);
        this.zzb = zzayw;
        this.zzc = zzayu;
        this.zzd = zzays;
        this.zza = i;
        this.zze = j;
    }

    private final void zzd() {
        this.zzf = null;
        zzayw zzayw = this.zzb;
        zzayw.zza.execute(zzayw.zzb);
    }

    public final void handleMessage(Message message) {
        if (!this.zzi) {
            int i = message.what;
            if (i == 0) {
                zzd();
            } else if (i != 4) {
                this.zzb.zzb = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = elapsedRealtime - this.zze;
                if (this.zzc.zze()) {
                    this.zzd.zzt(this.zzc, elapsedRealtime, j, false);
                    return;
                }
                int i2 = message.what;
                int i3 = 1;
                if (i2 == 1) {
                    this.zzd.zzt(this.zzc, elapsedRealtime, j, false);
                } else if (i2 == 2) {
                    this.zzd.zzu(this.zzc, elapsedRealtime, j);
                } else if (i2 == 3) {
                    IOException iOException = (IOException) message.obj;
                    this.zzf = iOException;
                    int zzd2 = this.zzd.zzd(this.zzc, elapsedRealtime, j, iOException);
                    if (zzd2 == 3) {
                        this.zzb.zzc = this.zzf;
                    } else if (zzd2 != 2) {
                        if (zzd2 != 1) {
                            i3 = 1 + this.zzg;
                        }
                        this.zzg = i3;
                        zzc((long) Math.min((i3 - 1) * 1000, InAppMessageBase.INAPP_MESSAGE_DURATION_DEFAULT_MILLIS));
                    }
                }
            } else {
                throw ((Error) message.obj);
            }
        }
    }

    public final void run() {
        try {
            this.zzh = Thread.currentThread();
            if (!this.zzc.zze()) {
                String simpleName = this.zzc.getClass().getSimpleName();
                zzazl.zza("load:" + simpleName);
                this.zzc.zzc();
                zzazl.zzb();
            }
            if (!this.zzi) {
                sendEmptyMessage(2);
            }
        } catch (IOException e) {
            if (!this.zzi) {
                obtainMessage(3, e).sendToTarget();
            }
        } catch (InterruptedException unused) {
            zzayy.zze(this.zzc.zze());
            if (!this.zzi) {
                sendEmptyMessage(2);
            }
        } catch (Exception e2) {
            if (!this.zzi) {
                obtainMessage(3, new zzayv(e2)).sendToTarget();
            }
        } catch (OutOfMemoryError e3) {
            if (!this.zzi) {
                obtainMessage(3, new zzayv(e3)).sendToTarget();
            }
        } catch (Error e4) {
            if (!this.zzi) {
                obtainMessage(4, e4).sendToTarget();
            }
            throw e4;
        } catch (Throwable th) {
            zzazl.zzb();
            throw th;
        }
    }

    public final void zza(boolean z) {
        this.zzi = z;
        this.zzf = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
                return;
            }
        } else {
            this.zzc.zzb();
            if (this.zzh != null) {
                this.zzh.interrupt();
            }
            if (!z) {
                return;
            }
        }
        this.zzb.zzb = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.zzd.zzt(this.zzc, elapsedRealtime, elapsedRealtime - this.zze, true);
    }

    public final void zzb(int i) throws IOException {
        IOException iOException = this.zzf;
        if (iOException != null && this.zzg > i) {
            throw iOException;
        }
    }

    public final void zzc(long j) {
        boolean z;
        if (this.zzb.zzb == null) {
            z = true;
        } else {
            z = false;
        }
        zzayy.zze(z);
        this.zzb.zzb = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            zzd();
        }
    }
}
