package com.google.android.gms.internal.p986firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.LibraryVersion;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwq */
public final class zzwq {
    private final int zza;

    public zzwq(String str) {
        int i = -1;
        try {
            List zzd = zzaf.zzc("[.-]").zzd(str);
            if (zzd.size() == 1) {
                i = Integer.parseInt(str);
            } else if (zzd.size() >= 3) {
                i = (Integer.parseInt((String) zzd.get(1)) * 1000) + (Integer.parseInt((String) zzd.get(0)) * 1000000) + Integer.parseInt((String) zzd.get(2));
            }
        } catch (IllegalArgumentException e) {
            if (Log.isLoggable("LibraryVersionContainer", 3)) {
                String.format("Version code parsing failed for: %s with exception %s.", new Object[]{str, e});
            }
        }
        this.zza = i;
    }

    public static zzwq zza() {
        String version = LibraryVersion.getInstance().getVersion("firebase-auth");
        if (TextUtils.isEmpty(version) || version.equals("UNKNOWN")) {
            version = "-1";
        }
        return new zzwq(version);
    }

    public final String zzb() {
        return String.format("X%s", new Object[]{Integer.toString(this.zza)});
    }
}
