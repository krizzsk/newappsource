package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.appboy.models.MessageButton;

public final /* synthetic */ class zzfi implements zzfot {
    public static final /* synthetic */ zzfi zza = new zzfi();

    private /* synthetic */ zzfi() {
    }

    public final boolean zza(Object obj) {
        String str = (String) obj;
        if (str == null) {
            return false;
        }
        String zza2 = zzfoa.zza(str);
        if (TextUtils.isEmpty(zza2)) {
            return false;
        }
        if ((!zza2.contains(MessageButton.TEXT) || zza2.contains("text/vtt")) && !zza2.contains("html") && !zza2.contains("xml")) {
            return true;
        }
        return false;
    }
}
