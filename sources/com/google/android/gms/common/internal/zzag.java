package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.wrappers.Wrappers;

public final class zzag {
    private static final Object zza = new Object();
    private static boolean zzb;
    private static String zzc;
    private static int zzd;

    public static int zza(Context context) {
        zzc(context);
        return zzd;
    }

    public static String zzb(Context context) {
        zzc(context);
        return zzc;
    }

    private static void zzc(Context context) {
        synchronized (zza) {
            if (!zzb) {
                zzb = true;
                try {
                    Bundle bundle = Wrappers.packageManager(context).getApplicationInfo(context.getPackageName(), RecyclerView.C1119a0.FLAG_IGNORE).metaData;
                    if (bundle != null) {
                        zzc = bundle.getString("com.google.app.id");
                        zzd = bundle.getInt("com.google.android.gms.version");
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e);
                }
            }
        }
    }
}
