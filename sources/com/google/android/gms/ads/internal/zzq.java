package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import com.google.android.gms.internal.ads.zzaoc;
import com.google.android.gms.internal.ads.zzcfi;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

final class zzq extends AsyncTask {
    public final /* synthetic */ zzs zza;

    public /* synthetic */ zzq(zzs zzs, zzp zzp) {
        this.zza = zzs;
    }

    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        zzs zzs = this.zza;
        if (zzs.zzf != null && str != null) {
            zzs.zzf.loadUrl(str);
        }
    }

    /* renamed from: zza */
    public final String doInBackground(Void... voidArr) {
        try {
            zzs zzs = this.zza;
            zzs.zzh = (zzaoc) zzs.zzc.get(1000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException e) {
            zzcfi.zzk("", e);
        } catch (TimeoutException e2) {
            zzcfi.zzk("", e2);
        }
        return this.zza.zzp();
    }
}
