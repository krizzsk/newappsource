package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import com.appboy.models.outgoing.TwitterUser;
import com.google.android.gms.analytics.zzj;
import com.google.android.gms.common.internal.ShowFirstParty;
import java.util.HashMap;

@ShowFirstParty
public final class zzbd extends zzj<zzbd> {
    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put(TwitterUser.DESCRIPTION_KEY, (Object) null);
        hashMap.put("fatal", Boolean.FALSE);
        return zzj.zza(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzc(zzj zzj) {
        zzbd zzbd = (zzbd) zzj;
        TextUtils.isEmpty((CharSequence) null);
    }
}
