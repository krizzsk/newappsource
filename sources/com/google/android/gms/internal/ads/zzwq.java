package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

final class zzwq extends HandlerThread implements Handler.Callback {
    private zzde zza;
    private Handler zzb;
    private Error zzc;
    private RuntimeException zzd;
    private zzws zze;

    public zzwq() {
        super("ExoPlayer:DummySurface");
    }

    public final boolean handleMessage(Message message) {
        boolean z;
        int i = message.what;
        if (i == 1) {
            try {
                int i2 = message.arg1;
                zzde zzde = this.zza;
                zzde.getClass();
                zzde.zzb(i2);
                SurfaceTexture zza2 = this.zza.zza();
                if (i2 != 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.zze = new zzws(this, zza2, z, (zzwr) null);
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e) {
                zzdn.zza("DummySurface", "Failed to initialize dummy surface", e);
                this.zzd = e;
                synchronized (this) {
                    notify();
                }
            } catch (Error e2) {
                try {
                    zzdn.zza("DummySurface", "Failed to initialize dummy surface", e2);
                    this.zzc = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (Throwable th) {
                    synchronized (this) {
                        notify();
                        throw th;
                    }
                }
            }
            return true;
        } else if (i != 2) {
            return true;
        } else {
            try {
                zzde zzde2 = this.zza;
                zzde2.getClass();
                zzde2.zzc();
            } catch (Throwable th2) {
                quit();
                throw th2;
            }
            quit();
            return true;
        }
    }

    public final zzws zza(int i) {
        boolean z;
        start();
        Handler handler = new Handler(getLooper(), this);
        this.zzb = handler;
        this.zza = new zzde(handler, (zzdd) null);
        synchronized (this) {
            z = false;
            this.zzb.obtainMessage(1, i, 0).sendToTarget();
            while (this.zze == null && this.zzd == null && this.zzc == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.zzd;
        if (runtimeException == null) {
            Error error = this.zzc;
            if (error == null) {
                zzws zzws = this.zze;
                zzws.getClass();
                return zzws;
            }
            throw error;
        }
        throw runtimeException;
    }

    public final void zzb() {
        Handler handler = this.zzb;
        handler.getClass();
        handler.sendEmptyMessage(2);
    }
}
