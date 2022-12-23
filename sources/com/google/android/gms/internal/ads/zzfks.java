package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;
import java.util.concurrent.Executor;

public final class zzfks {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzf = 1;
    private final Context zzb;
    private final Executor zzc;
    private final Task zzd;
    private final boolean zze;

    public zzfks(Context context, Executor executor, Task task, boolean z) {
        this.zzb = context;
        this.zzc = executor;
        this.zzd = task;
        this.zze = z;
    }

    public static zzfks zza(Context context, Executor executor, boolean z) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (z) {
            executor.execute(new zzfko(context, taskCompletionSource));
        } else {
            executor.execute(new zzfkp(taskCompletionSource));
        }
        return new zzfks(context, executor, taskCompletionSource.getTask(), z);
    }

    public static void zzg(int i) {
        zzf = i;
    }

    private final Task zzh(int i, long j, Exception exc, String str, Map map, String str2) {
        if (!this.zze) {
            return this.zzd.continueWith(this.zzc, zzfkq.zza);
        }
        zzaku zza2 = zzaky.zza();
        zza2.zza(this.zzb.getPackageName());
        zza2.zze(j);
        zza2.zzg(zzf);
        if (exc != null) {
            zza2.zzf(zzfpi.zza(exc));
            zza2.zzd(exc.getClass().getName());
        }
        if (str2 != null) {
            zza2.zzb(str2);
        }
        if (str != null) {
            zza2.zzc(str);
        }
        return this.zzd.continueWith(this.zzc, new zzfkr(zza2, i));
    }

    public final Task zzb(int i, String str) {
        return zzh(i, 0, (Exception) null, (String) null, (Map) null, str);
    }

    public final Task zzc(int i, long j, Exception exc) {
        return zzh(i, j, exc, (String) null, (Map) null, (String) null);
    }

    public final Task zzd(int i, long j) {
        return zzh(i, j, (Exception) null, (String) null, (Map) null, (String) null);
    }

    public final Task zze(int i, long j, String str) {
        return zzh(i, j, (Exception) null, (String) null, (Map) null, str);
    }

    public final Task zzf(int i, long j, String str, Map map) {
        return zzh(i, j, (Exception) null, str, (Map) null, (String) null);
    }
}
