package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;

final class zzazm implements ThreadFactory {
    public final /* synthetic */ String zza = "Loader:ExtractorMediaPeriod";

    public zzazm(String str) {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.zza);
    }
}
