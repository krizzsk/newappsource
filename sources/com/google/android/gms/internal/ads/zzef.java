package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;

public final /* synthetic */ class zzef implements ThreadFactory {
    public final /* synthetic */ String zza = "ExoPlayer:Loader:ProgressiveMediaPeriod";

    public /* synthetic */ zzef(String str) {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.zza);
    }
}
