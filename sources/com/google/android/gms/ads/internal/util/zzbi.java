package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzaij;
import com.google.android.gms.internal.ads.zzajf;
import com.google.android.gms.internal.ads.zzajg;
import com.google.android.gms.internal.ads.zzakg;
import com.google.android.gms.internal.ads.zzcfh;
import java.util.Collections;
import java.util.Map;

final class zzbi extends zzakg {
    public final /* synthetic */ byte[] zza;
    public final /* synthetic */ Map zzb;
    public final /* synthetic */ zzcfh zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzbi(zzbo zzbo, int i, String str, zzajg zzajg, zzajf zzajf, byte[] bArr, Map map, zzcfh zzcfh) {
        super(i, str, zzajg, zzajf);
        this.zza = bArr;
        this.zzb = map;
        this.zzc = zzcfh;
    }

    public final Map zzl() throws zzaij {
        Map map = this.zzb;
        return map == null ? Collections.emptyMap() : map;
    }

    public final byte[] zzx() throws zzaij {
        byte[] bArr = this.zza;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    /* renamed from: zzz */
    public final void zzo(String str) {
        this.zzc.zzg(str);
        super.zzo(str);
    }
}
