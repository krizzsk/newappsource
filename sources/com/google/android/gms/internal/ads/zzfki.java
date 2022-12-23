package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

public final class zzfki extends zzfke {
    public zzfki(zzfjx zzfjx, HashSet hashSet, JSONObject jSONObject, long j, byte[] bArr) {
        super(zzfjx, hashSet, jSONObject, j, (byte[]) null);
    }

    private final void zzc(String str) {
        zzfja zza = zzfja.zza();
        if (zza != null) {
            for (zzfip zzfip : zza.zzc()) {
                if (this.zza.contains(zzfip.zzh())) {
                    zzfip.zzg().zzd(str, this.zzc);
                }
            }
        }
    }

    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.zzb.toString();
    }

    public final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        zzc(str);
        super.onPostExecute(str);
    }

    public final void zza(String str) {
        zzc(str);
        super.onPostExecute(str);
    }
}
