package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.concurrent.LinkedBlockingQueue;

final class zzcc extends Thread {
    private static zzcc zza;
    private final LinkedBlockingQueue<Runnable> zzb = new LinkedBlockingQueue<>();
    private volatile boolean zzc = false;
    private volatile boolean zzd = false;
    /* access modifiers changed from: private */
    public volatile zzcd zze;
    /* access modifiers changed from: private */
    public final Context zzf;

    private zzcc(Context context) {
        super("GAThread");
        if (context != null) {
            this.zzf = context.getApplicationContext();
        } else {
            this.zzf = null;
        }
        start();
    }

    public static zzcc zzb(Context context) {
        if (zza == null) {
            zza = new zzcc(context);
        }
        return zza;
    }

    public final void run() {
        String str;
        while (true) {
            try {
                Runnable take = this.zzb.take();
                if (!this.zzc) {
                    take.run();
                }
            } catch (InterruptedException e) {
                try {
                    zzdh.zzb.zzb(e.toString());
                } catch (Exception e2) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    PrintStream printStream = new PrintStream(byteArrayOutputStream);
                    e2.printStackTrace(printStream);
                    printStream.flush();
                    String str2 = new String(byteArrayOutputStream.toByteArray());
                    if (str2.length() != 0) {
                        str = "Error on Google TagManager Thread: ".concat(str2);
                    } else {
                        str = new String("Error on Google TagManager Thread: ");
                    }
                    zzdh.zza(str);
                    zzdh.zza("Google TagManager is shutting down.");
                    this.zzc = true;
                }
            }
        }
    }

    public final void zze(Runnable runnable) {
        this.zzb.add(runnable);
    }

    @VisibleForTesting
    public final void zzf(String str, long j) {
        this.zzb.add(new zzcb(this, this, j, str, (byte[]) null));
    }
}
