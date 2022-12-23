package com.google.android.gms.analytics;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzbs;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.android.gms.internal.gtm.zzfr;
import java.util.HashMap;
import p001a0.C0016g;

final class zzv extends zzbs {
    public final /* synthetic */ Tracker zza;
    private boolean zzb;
    private int zzc;
    private long zzd = -1;
    private boolean zze;
    private long zzf;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzv(Tracker tracker, zzbv zzbv) {
        super(zzbv);
        this.zza = tracker;
    }

    private final void zzg() {
        if (this.zzd >= 0 || this.zzb) {
            zzp().zzk(this.zza.zze);
        } else {
            zzp().zzl(this.zza.zze);
        }
    }

    public final void zza(Activity activity) {
        String str;
        if (this.zzc == 0) {
            if (zzC().elapsedRealtime() >= Math.max(1000, this.zzd) + this.zzf) {
                this.zze = true;
            }
        }
        this.zzc++;
        if (this.zzb) {
            Intent intent = activity.getIntent();
            if (intent != null) {
                this.zza.setCampaignParamsOnNextHit(intent.getData());
            }
            HashMap u = C0016g.m37u("&t", "screenview");
            Tracker tracker = this.zza;
            if (tracker.zzg != null) {
                zzfr zzl = this.zza.zzg;
                str = activity.getClass().getCanonicalName();
                String str2 = zzl.zzg.get(str);
                if (str2 != null) {
                    str = str2;
                }
            } else {
                str = activity.getClass().getCanonicalName();
            }
            tracker.set("&cd", str);
            if (TextUtils.isEmpty((CharSequence) u.get("&dr"))) {
                Preconditions.checkNotNull(activity);
                Intent intent2 = activity.getIntent();
                String str3 = null;
                if (intent2 != null) {
                    String stringExtra = intent2.getStringExtra("android.intent.extra.REFERRER_NAME");
                    if (!TextUtils.isEmpty(stringExtra)) {
                        str3 = stringExtra;
                    }
                }
                if (!TextUtils.isEmpty(str3)) {
                    u.put("&dr", str3);
                }
            }
            this.zza.send(u);
        }
    }

    public final void zzb(Activity activity) {
        int i = this.zzc - 1;
        this.zzc = i;
        int max = Math.max(0, i);
        this.zzc = max;
        if (max == 0) {
            this.zzf = zzC().elapsedRealtime();
        }
    }

    public final void zzc(boolean z) {
        this.zzb = z;
        zzg();
    }

    public final void zzd() {
    }

    public final void zze(long j) {
        this.zzd = j;
        zzg();
    }

    public final synchronized boolean zzf() {
        boolean z;
        z = this.zze;
        this.zze = false;
        return z;
    }
}
