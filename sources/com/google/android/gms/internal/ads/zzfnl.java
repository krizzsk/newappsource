package com.google.android.gms.internal.ads;

import java.net.URL;
import java.net.URLConnection;

public final /* synthetic */ class zzfnl implements zzfno {
    public final /* synthetic */ URL zza;

    public /* synthetic */ zzfnl(URL url) {
        this.zza = url;
    }

    public final URLConnection zza() {
        return this.zza.openConnection();
    }
}
