package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import com.google.android.gms.analytics.zzj;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.usebutton.sdk.internal.events.Events;
import java.util.HashMap;

@ShowFirstParty
public final class zzbc extends zzj<zzbc> {
    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("category", (Object) null);
        hashMap.put(Events.PROPERTY_ACTION, (Object) null);
        hashMap.put("label", (Object) null);
        hashMap.put("value", 0L);
        return zzj.zza(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzc(zzj zzj) {
        zzbc zzbc = (zzbc) zzj;
        TextUtils.isEmpty((CharSequence) null);
        TextUtils.isEmpty((CharSequence) null);
        TextUtils.isEmpty((CharSequence) null);
    }
}
