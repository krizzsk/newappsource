package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.util.IOUtils;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p241s0.C6313h;

public final class zzlt {
    private final ExecutorService zza;
    /* access modifiers changed from: private */
    public volatile InputStream zzb = null;
    /* access modifiers changed from: private */
    public volatile boolean zzc = false;
    private final C6313h zzd = new C6313h();
    private final C6313h zze = new C6313h();

    public zzlt() {
        zzg.zza();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.zza = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    public static /* bridge */ /* synthetic */ void zzb(zzlt zzlt, OutputStream outputStream, boolean z, long j) {
        try {
            outputStream.write(z ? 1 : 0);
        } catch (IOException unused) {
            String.format("Unable to deliver status for Payload %d", new Object[]{Long.valueOf(j)});
        } finally {
            IOUtils.closeQuietly((Closeable) outputStream);
        }
    }

    public final synchronized void zzc(long j) {
        C6313h hVar = this.zzd;
        Long valueOf = Long.valueOf(j);
        IOUtils.closeQuietly((Closeable) hVar.getOrDefault(valueOf, null));
        this.zzd.remove(valueOf);
        zzmb zzmb = (zzmb) this.zze.remove(valueOf);
        if (zzmb != null) {
            IOUtils.closeQuietly(zzmb.zze());
            IOUtils.closeQuietly(zzmb.zzf());
        }
    }

    public final synchronized void zzd(InputStream inputStream, OutputStream outputStream, OutputStream outputStream2, zzmb zzmb, long j) {
        C6313h hVar = this.zzd;
        Long valueOf = Long.valueOf(j);
        hVar.put(valueOf, outputStream);
        this.zze.put(valueOf, zzmb);
        this.zza.execute(new zzls(this, inputStream, outputStream, j, outputStream2));
    }

    public final synchronized void zze() {
        C6313h hVar;
        this.zzc = true;
        this.zza.shutdownNow();
        IOUtils.closeQuietly((Closeable) this.zzb);
        int i = 0;
        int i2 = 0;
        while (true) {
            hVar = this.zzd;
            if (i2 >= hVar.f19969d) {
                break;
            }
            IOUtils.closeQuietly((Closeable) hVar.mo22422l(i2));
            i2++;
        }
        hVar.clear();
        while (true) {
            C6313h hVar2 = this.zze;
            if (i < hVar2.f19969d) {
                zzmb zzmb = (zzmb) hVar2.mo22422l(i);
                IOUtils.closeQuietly(zzmb.zze());
                IOUtils.closeQuietly(zzmb.zzf());
                i++;
            } else {
                hVar2.clear();
            }
        }
    }
}
