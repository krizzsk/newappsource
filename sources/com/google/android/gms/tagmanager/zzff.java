package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.VisibleForTesting;

@ShowFirstParty
@VisibleForTesting
final class zzff extends zzey {
    /* access modifiers changed from: private */
    public static final Object zza = new Object();
    private static zzff zzb;
    /* access modifiers changed from: private */
    public Context zzc;
    /* access modifiers changed from: private */
    public zzcd zzd;
    private boolean zze = true;
    private boolean zzf = false;
    /* access modifiers changed from: private */
    public boolean zzg = true;
    private zzfb zzh;
    private zzdk zzi;
    private boolean zzj = false;
    private volatile zzcc zzk;
    private final zzez zzl = new zzez(this);

    private zzff() {
    }

    public static zzff zzg() {
        if (zzb == null) {
            zzb = new zzff();
        }
        return zzb;
    }

    /* access modifiers changed from: private */
    public final boolean zzm() {
        return this.zzj || !this.zzg;
    }

    public final synchronized void zza() {
        if (!this.zzf) {
            zzdh.zzb.zzd("Dispatch call queued. Dispatch will run once initialization is complete.");
            this.zze = true;
            return;
        }
        this.zzk.zze(new zzfa(this));
    }

    public final synchronized void zzb() {
        if (!zzm()) {
            this.zzh.zzb();
        }
    }

    public final synchronized void zzc(boolean z) {
        zzi(this.zzj, z);
    }

    public final synchronized zzcd zzf() {
        if (this.zzd == null) {
            Context context = this.zzc;
            if (context != null) {
                this.zzd = new zzdw(this.zzl, context, (byte[]) null);
            } else {
                throw new IllegalStateException("Cant get a store unless we have a context");
            }
        }
        if (this.zzh == null) {
            zzfe zzfe = new zzfe(this, (zzfd) null);
            this.zzh = zzfe;
            zzfe.zzc(1800000);
        }
        this.zzf = true;
        if (this.zze) {
            zza();
            this.zze = false;
        }
        if (this.zzi == null) {
            zzdk zzdk = new zzdk(this);
            this.zzi = zzdk;
            Context context2 = this.zzc;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            context2.registerReceiver(zzdk, intentFilter);
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("com.google.analytics.RADIO_POWERED");
            intentFilter2.addCategory(context2.getPackageName());
            context2.registerReceiver(zzdk, intentFilter2);
        }
        return this.zzd;
    }

    @VisibleForTesting
    public final synchronized void zzi(boolean z, boolean z2) {
        boolean zzm = zzm();
        this.zzj = z;
        this.zzg = z2;
        if (zzm() == zzm) {
            return;
        }
        if (zzm()) {
            this.zzh.zza();
            zzdh.zzb.zzd("PowerSaveMode initiated.");
            return;
        }
        this.zzh.zzc(1800000);
        zzdh.zzb.zzd("PowerSaveMode terminated.");
    }

    public final synchronized void zzl(Context context, zzcc zzcc) {
        if (this.zzc == null) {
            this.zzc = context.getApplicationContext();
            if (this.zzk == null) {
                this.zzk = zzcc;
            }
        }
    }
}
