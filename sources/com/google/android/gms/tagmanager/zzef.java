package com.google.android.gms.tagmanager;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzak;
import java.util.Map;

final class zzef extends zzbu {
    private static final String zza = zza.RESOLUTION.toString();
    private final Context zzb;

    public zzef(Context context) {
        super(zza, new String[0]);
        this.zzb = context;
    }

    public final zzak zza(Map<String, zzak> map) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) this.zzb.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        StringBuilder sb = new StringBuilder(23);
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        return zzfv.zzc(sb.toString());
    }

    public final boolean zzb() {
        return true;
    }
}
