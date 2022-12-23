package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

public final class zzfkj extends zzfke {
    public zzfkj(zzfjx zzfjx, HashSet hashSet, JSONObject jSONObject, long j, byte[] bArr) {
        super(zzfjx, hashSet, jSONObject, j, (byte[]) null);
    }

    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (zzfjr.zzi(this.zzb, this.zzd.zza())) {
            return null;
        }
        this.zzd.zze(this.zzb);
        return this.zzb.toString();
    }

    /* renamed from: zza */
    public final void onPostExecute(String str) {
        zzfja zza;
        if (!TextUtils.isEmpty(str) && (zza = zzfja.zza()) != null) {
            for (zzfip zzfip : zza.zzc()) {
                if (this.zza.contains(zzfip.zzh())) {
                    zzfip.zzg().zze(str, this.zzc);
                }
            }
        }
        super.onPostExecute(str);
    }
}
