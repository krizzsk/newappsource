package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzcfo;
import com.google.android.gms.internal.ads.zzesy;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;

final class zzr {
    private final Context zza;
    private final String zzb;
    private final Map zzc = new TreeMap();
    private String zzd;
    private String zze;
    private final String zzf;

    public zzr(Context context, String str) {
        String str2;
        this.zza = context.getApplicationContext();
        this.zzb = str;
        String packageName = context.getPackageName();
        try {
            str2 = packageName + "-" + Wrappers.packageManager(context).getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            zzcfi.zzh("Unable to get package version name for reporting", e);
            str2 = String.valueOf(packageName).concat("-missing");
        }
        this.zzf = str2;
    }

    public final String zza() {
        return this.zzf;
    }

    public final String zzb() {
        return this.zze;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zzd;
    }

    public final Map zze() {
        return this.zzc;
    }

    public final void zzf(zzl zzl, zzcfo zzcfo) {
        Bundle bundle;
        this.zzd = zzl.zzj.zza;
        Bundle bundle2 = zzl.zzm;
        if (bundle2 != null) {
            bundle = bundle2.getBundle(AdMobAdapter.class.getName());
        } else {
            bundle = null;
        }
        if (bundle != null) {
            String str = (String) zzbjc.zzc.zze();
            for (String next : bundle.keySet()) {
                if (str.equals(next)) {
                    this.zze = bundle.getString(next);
                } else if (next.startsWith("csa_")) {
                    this.zzc.put(next.substring(4), bundle.getString(next));
                }
            }
            this.zzc.put("SDKVersion", zzcfo.zza);
            if (((Boolean) zzbjc.zza.zze()).booleanValue()) {
                try {
                    Bundle zzc2 = zzesy.zzc(this.zza, new JSONArray((String) zzbjc.zzb.zze()));
                    for (String next2 : zzc2.keySet()) {
                        this.zzc.put(next2, zzc2.get(next2).toString());
                    }
                } catch (JSONException e) {
                    zzcfi.zzh("Flag gads:afs:csa_tcf_data_to_collect not a valid JSON array", e);
                }
            }
        }
    }
}
