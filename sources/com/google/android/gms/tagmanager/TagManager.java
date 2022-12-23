package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.ConcurrentMap;
import p988j$.util.concurrent.ConcurrentHashMap;

@VisibleForTesting
public class TagManager {
    private static TagManager zza;
    private final zzfp zzb;
    private final Context zzc;
    private final DataLayer zzd;
    private final zzey zze;
    private final ConcurrentMap<String, zzaa> zzf = new ConcurrentHashMap();
    private final zzap zzg;

    @VisibleForTesting
    public TagManager(Context context, zzfp zzfp, DataLayer dataLayer, zzey zzey) {
        Context applicationContext = context.getApplicationContext();
        this.zzc = applicationContext;
        this.zze = zzey;
        this.zzb = zzfp;
        this.zzd = dataLayer;
        dataLayer.zzg(new zzfm(this));
        dataLayer.zzg(new zzg(applicationContext));
        this.zzg = new zzap();
        Preconditions.checkNotNull(applicationContext);
        applicationContext.registerComponentCallbacks(new zzfo(this));
        Preconditions.checkNotNull(applicationContext);
        zzd.zzb(applicationContext);
    }

    public static TagManager getInstance(Context context) {
        TagManager tagManager;
        synchronized (TagManager.class) {
            if (zza == null) {
                if (context != null) {
                    zza = new TagManager(context, new zzfn(), new DataLayer(new zzbe(context)), zzff.zzg());
                } else {
                    zzdh.zza("TagManager.getInstance requires non-null context.");
                    throw null;
                }
            }
            tagManager = zza;
        }
        return tagManager;
    }

    public static /* bridge */ /* synthetic */ void zzb(TagManager tagManager, String str) {
        Preconditions.checkNotNull(tagManager.zzf);
        for (zzaa zzd2 : tagManager.zzf.values()) {
            zzd2.zzd(str);
        }
    }

    public void dispatch() {
        this.zze.zza();
    }

    public DataLayer getDataLayer() {
        return this.zzd;
    }

    public PendingResult<ContainerHolder> loadContainerDefaultOnly(String str, int i) {
        zzal zzal = new zzal(this.zzc, this, (Looper) null, str, i, this.zzg);
        zzal.zzl();
        return zzal;
    }

    public PendingResult<ContainerHolder> loadContainerPreferFresh(String str, int i) {
        zzal zzal = new zzal(this.zzc, this, (Looper) null, str, i, this.zzg);
        zzal.zzm();
        return zzal;
    }

    public PendingResult<ContainerHolder> loadContainerPreferNonDefault(String str, int i) {
        zzal zzal = new zzal(this.zzc, this, (Looper) null, str, i, this.zzg);
        zzal.zzn();
        return zzal;
    }

    public void setVerboseLoggingEnabled(boolean z) {
        int i = true != z ? 5 : 2;
        zzdh.zza = i;
        zzdh.zzb.zzc(i);
    }

    @VisibleForTesting
    public final int zza(zzaa zzaa) {
        this.zzf.put(zzaa.zza(), zzaa);
        return this.zzf.size();
    }

    @VisibleForTesting
    public final boolean zzc(zzaa zzaa) {
        return this.zzf.remove(zzaa.zza()) != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006e, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean zzd(android.net.Uri r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            com.google.android.gms.tagmanager.zzea r0 = com.google.android.gms.tagmanager.zzea.zza()     // Catch:{ all -> 0x0073 }
            boolean r7 = r0.zzd(r7)     // Catch:{ all -> 0x0073 }
            if (r7 == 0) goto L_0x0070
            java.lang.String r7 = r0.zzc()     // Catch:{ all -> 0x0073 }
            int r1 = r0.zze()     // Catch:{ all -> 0x0073 }
            int r2 = r1 + -1
            r3 = 0
            if (r1 == 0) goto L_0x006f
            r1 = 1
            if (r2 == 0) goto L_0x005d
            if (r2 == r1) goto L_0x0021
            r4 = 2
            if (r2 == r4) goto L_0x0021
            goto L_0x006d
        L_0x0021:
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.android.gms.tagmanager.zzaa> r2 = r6.zzf     // Catch:{ all -> 0x0073 }
            java.util.Set r2 = r2.keySet()     // Catch:{ all -> 0x0073 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0073 }
        L_0x002b:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x0073 }
            if (r4 == 0) goto L_0x006d
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x0073 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0073 }
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.android.gms.tagmanager.zzaa> r5 = r6.zzf     // Catch:{ all -> 0x0073 }
            java.lang.Object r5 = r5.get(r4)     // Catch:{ all -> 0x0073 }
            com.google.android.gms.tagmanager.zzaa r5 = (com.google.android.gms.tagmanager.zzaa) r5     // Catch:{ all -> 0x0073 }
            boolean r4 = r4.equals(r7)     // Catch:{ all -> 0x0073 }
            if (r4 == 0) goto L_0x0050
            java.lang.String r4 = r0.zzb()     // Catch:{ all -> 0x0073 }
            r5.zze(r4)     // Catch:{ all -> 0x0073 }
            r5.refresh()     // Catch:{ all -> 0x0073 }
            goto L_0x002b
        L_0x0050:
            java.lang.String r4 = r5.zzb()     // Catch:{ all -> 0x0073 }
            if (r4 == 0) goto L_0x002b
            r5.zze(r3)     // Catch:{ all -> 0x0073 }
            r5.refresh()     // Catch:{ all -> 0x0073 }
            goto L_0x002b
        L_0x005d:
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.android.gms.tagmanager.zzaa> r0 = r6.zzf     // Catch:{ all -> 0x0073 }
            java.lang.Object r7 = r0.get(r7)     // Catch:{ all -> 0x0073 }
            com.google.android.gms.tagmanager.zzaa r7 = (com.google.android.gms.tagmanager.zzaa) r7     // Catch:{ all -> 0x0073 }
            if (r7 == 0) goto L_0x006d
            r7.zze(r3)     // Catch:{ all -> 0x0073 }
            r7.refresh()     // Catch:{ all -> 0x0073 }
        L_0x006d:
            monitor-exit(r6)
            return r1
        L_0x006f:
            throw r3     // Catch:{ all -> 0x0073 }
        L_0x0070:
            r7 = 0
            monitor-exit(r6)
            return r7
        L_0x0073:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.TagManager.zzd(android.net.Uri):boolean");
    }

    public PendingResult<ContainerHolder> loadContainerDefaultOnly(String str, int i, Handler handler) {
        zzal zzal = new zzal(this.zzc, this, handler.getLooper(), str, i, this.zzg);
        zzal.zzl();
        return zzal;
    }

    public PendingResult<ContainerHolder> loadContainerPreferFresh(String str, int i, Handler handler) {
        zzal zzal = new zzal(this.zzc, this, handler.getLooper(), str, i, this.zzg);
        zzal.zzm();
        return zzal;
    }

    public PendingResult<ContainerHolder> loadContainerPreferNonDefault(String str, int i, Handler handler) {
        zzal zzal = new zzal(this.zzc, this, handler.getLooper(), str, i, this.zzg);
        zzal.zzn();
        return zzal;
    }
}
