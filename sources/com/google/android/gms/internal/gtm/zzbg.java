package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import com.appsflyer.ServerParameters;
import com.google.android.gms.analytics.zzj;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.usebutton.sdk.internal.events.Events;
import java.util.HashMap;

@ShowFirstParty
public final class zzbg extends zzj<zzbg> {
    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put(ServerParameters.NETWORK, (Object) null);
        hashMap.put(Events.PROPERTY_ACTION, (Object) null);
        hashMap.put("target", (Object) null);
        return zzj.zza(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzc(zzj zzj) {
        zzbg zzbg = (zzbg) zzj;
        TextUtils.isEmpty((CharSequence) null);
        TextUtils.isEmpty((CharSequence) null);
        TextUtils.isEmpty((CharSequence) null);
    }
}
