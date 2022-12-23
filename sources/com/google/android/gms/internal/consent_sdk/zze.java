package com.google.android.gms.internal.consent_sdk;

import android.text.TextUtils;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import org.json.JSONException;
import org.json.JSONObject;

public final /* synthetic */ class zze implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzg[] zzc;

    public /* synthetic */ zze(String str, String str2, zzg[] zzgArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzgArr;
    }

    public final void run() {
        JSONObject jSONObject;
        String str = this.zza;
        String str2 = this.zzb;
        zzg[] zzgArr = this.zzc;
        if (!TextUtils.isEmpty(str)) {
            String lowerCase = str.toLowerCase();
            if (TextUtils.isEmpty(str2)) {
                jSONObject = new JSONObject();
            } else {
                try {
                    jSONObject = new JSONObject(str2);
                } catch (JSONException unused) {
                    new StringBuilder(String.valueOf(lowerCase).length() + 32 + String.valueOf(str2).length());
                    return;
                }
            }
            String valueOf = String.valueOf(jSONObject);
            new StringBuilder(String.valueOf(lowerCase).length() + 10 + valueOf.length());
            int length = zzgArr.length;
            int i = 0;
            while (i < length) {
                zzg zzg = zzgArr[i];
                FutureTask futureTask = new FutureTask(new zzf(zzg, lowerCase, jSONObject));
                zzg.zza().execute(futureTask);
                try {
                    if (!((Boolean) futureTask.get()).booleanValue()) {
                        i++;
                    } else {
                        return;
                    }
                } catch (ExecutionException e) {
                    new StringBuilder(String.valueOf(lowerCase).length() + 24);
                    e.getCause();
                } catch (InterruptedException unused2) {
                    new StringBuilder(String.valueOf(lowerCase).length() + 33);
                }
            }
        }
    }
}
