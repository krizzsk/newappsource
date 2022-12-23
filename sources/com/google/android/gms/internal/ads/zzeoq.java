package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;

public final /* synthetic */ class zzeoq implements zzfoi {
    public static final /* synthetic */ zzeoq zza = new zzeoq();

    private /* synthetic */ zzeoq() {
    }

    public final Object apply(Object obj) {
        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
        return new zzeou(appSetIdInfo.getId(), appSetIdInfo.getScope());
    }
}
