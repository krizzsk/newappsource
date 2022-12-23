package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.measurement.zzbr;
import p358af.C13437d;

final class zzfe implements Runnable {
    public final /* synthetic */ zzbr zza;
    public final /* synthetic */ ServiceConnection zzb;
    public final /* synthetic */ zzff zzc;

    public zzfe(zzff zzff, zzbr zzbr, ServiceConnection serviceConnection) {
        this.zzc = zzff;
        this.zza = zzbr;
        this.zzb = serviceConnection;
    }

    public final void run() {
        zzff zzff = this.zzc;
        zzfg zzfg = zzff.zza;
        String zza2 = zzff.zzb;
        zzbr zzbr = this.zza;
        ServiceConnection serviceConnection = this.zzb;
        zzfg.zza.zzaz().zzg();
        Bundle bundle = new Bundle();
        bundle.putString("package_name", zza2);
        Bundle bundle2 = null;
        try {
            Bundle zzd = zzbr.zzd(bundle);
            if (zzd == null) {
                zzfg.zza.zzay().zzd().zza("Install Referrer Service returned a null response");
            } else {
                bundle2 = zzd;
            }
        } catch (Exception e) {
            zzfg.zza.zzay().zzd().zzb("Exception occurred while retrieving the Install Referrer", e.getMessage());
        }
        zzfg.zza.zzaz().zzg();
        zzfy.zzO();
        if (bundle2 != null) {
            long j = bundle2.getLong("install_begin_timestamp_seconds", 0) * 1000;
            if (j == 0) {
                C16759e.m42354j(zzfg.zza, "Service response is missing Install Referrer install timestamp");
            } else {
                String string = bundle2.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    C16530d.m42018k(zzfg.zza, "No referrer defined in Install Referrer response");
                } else {
                    zzfg.zza.zzay().zzj().zzb("InstallReferrer API result", string);
                    Bundle zzs = zzfg.zza.zzv().zzs(Uri.parse("?".concat(string)));
                    if (zzs == null) {
                        C16530d.m42018k(zzfg.zza, "No campaign params defined in Install Referrer result");
                    } else {
                        String string2 = zzs.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j2 = bundle2.getLong("referrer_click_timestamp_seconds", 0) * 1000;
                            if (j2 == 0) {
                                C16530d.m42018k(zzfg.zza, "Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                zzs.putLong("click_timestamp", j2);
                            }
                        }
                        if (j == zzfg.zza.zzm().zzd.zza()) {
                            C13437d.m33710p(zzfg.zza, "Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (zzfg.zza.zzJ()) {
                            zzfg.zza.zzm().zzd.zzb(j);
                            zzfg.zza.zzay().zzj().zzb("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            zzs.putString("_cis", "referrer API v2");
                            zzfg.zza.zzq().zzF("auto", "_cmp", zzs, zza2);
                        }
                    }
                }
            }
        }
        ConnectionTracker.getInstance().unbindService(zzfg.zza.zzau(), serviceConnection);
    }
}
