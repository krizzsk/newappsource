package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzbhw implements SharedPreferences.OnSharedPreferenceChangeListener {
    @VisibleForTesting
    public volatile boolean zza = false;
    private final Object zzb = new Object();
    private final ConditionVariable zzc = new ConditionVariable();
    private volatile boolean zzd = false;
    /* access modifiers changed from: private */
    public SharedPreferences zze = null;
    private Bundle zzf = new Bundle();
    private Context zzg;
    private JSONObject zzh = new JSONObject();

    private final void zzf() {
        if (this.zze != null) {
            try {
                this.zzh = new JSONObject((String) zzbia.zza(new zzbhu(this)));
            } catch (JSONException unused) {
            }
        }
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            zzf();
        }
    }

    public final Object zzb(zzbhq zzbhq) {
        if (!this.zzc.block(InstallSheetPresenter.LOADING_TIMER_DELAY_IN_MILLIS)) {
            synchronized (this.zzb) {
                if (!this.zza) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.zzd || this.zze == null) {
            synchronized (this.zzb) {
                if (this.zzd) {
                    if (this.zze == null) {
                    }
                }
                Object zzm = zzbhq.zzm();
                return zzm;
            }
        }
        if (zzbhq.zze() == 2) {
            Bundle bundle = this.zzf;
            if (bundle == null) {
                return zzbhq.zzm();
            }
            return zzbhq.zzb(bundle);
        } else if (zzbhq.zze() != 1 || !this.zzh.has(zzbhq.zzn())) {
            return zzbia.zza(new zzbht(this, zzbhq));
        } else {
            return zzbhq.zza(this.zzh);
        }
    }

    public final /* synthetic */ Object zzc(zzbhq zzbhq) {
        return zzbhq.zzc(this.zze);
    }

    public final /* synthetic */ String zzd() {
        return this.zze.getString("flag_configuration", "{}");
    }

    public final void zze(Context context) {
        Context context2;
        if (!this.zzd) {
            synchronized (this.zzb) {
                if (!this.zzd) {
                    if (!this.zza) {
                        this.zza = true;
                    }
                    if (context.getApplicationContext() == null) {
                        context2 = context;
                    } else {
                        context2 = context.getApplicationContext();
                    }
                    this.zzg = context2;
                    try {
                        this.zzf = Wrappers.packageManager(context2).getApplicationInfo(this.zzg.getPackageName(), RecyclerView.C1119a0.FLAG_IGNORE).metaData;
                    } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                    }
                    try {
                        Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
                        if (!(remoteContext == null && (remoteContext = context.getApplicationContext()) == null)) {
                            context = remoteContext;
                        }
                        if (context != null) {
                            zzay.zzb();
                            SharedPreferences zza2 = zzbhs.zza(context);
                            this.zze = zza2;
                            if (zza2 != null) {
                                zza2.registerOnSharedPreferenceChangeListener(this);
                            }
                            zzbkf.zzc(new zzbhv(this));
                            zzf();
                            this.zzd = true;
                            this.zza = false;
                            this.zzc.open();
                        }
                    } finally {
                        this.zza = false;
                        this.zzc.open();
                    }
                }
            }
        }
    }
}
