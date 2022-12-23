package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.Set;

public final class zzeql implements zzetb {
    private final zzfvk zza;
    private final ViewGroup zzb;
    private final Context zzc;
    private final Set zzd;

    public zzeql(zzfvk zzfvk, ViewGroup viewGroup, Context context, Set set) {
        this.zza = zzfvk;
        this.zzd = set;
        this.zzb = viewGroup;
        this.zzc = context;
    }

    public final int zza() {
        return 22;
    }

    public final zzfvj zzb() {
        return this.zza.zzb(new zzeqk(this));
    }

    public final /* synthetic */ zzeqm zzc() throws Exception {
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzeQ)).booleanValue() && this.zzb != null && this.zzd.contains("banner")) {
            return new zzeqm(Boolean.valueOf(this.zzb.isHardwareAccelerated()));
        }
        Boolean bool = null;
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzeR)).booleanValue() && this.zzd.contains("native")) {
            Context context = this.zzc;
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                Window window = activity.getWindow();
                if (window == null || (window.getAttributes().flags & 16777216) == 0) {
                    try {
                        boolean z = false;
                        if ((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & 512) != 0) {
                            z = true;
                        }
                        bool = Boolean.valueOf(z);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                } else {
                    bool = Boolean.TRUE;
                }
                return new zzeqm(bool);
            }
        }
        return new zzeqm((Boolean) null);
    }
}
