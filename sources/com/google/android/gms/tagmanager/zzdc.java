package com.google.android.gms.tagmanager;

import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzak;
import java.util.Locale;
import java.util.Map;

@ShowFirstParty
@VisibleForTesting
public final class zzdc extends zzbu {
    private static final String zza = zza.LANGUAGE.toString();

    public zzdc() {
        super(zza, new String[0]);
    }

    public final zzak zza(Map<String, zzak> map) {
        Locale locale = Locale.getDefault();
        if (locale == null) {
            return zzfv.zzb();
        }
        String language = locale.getLanguage();
        if (language == null) {
            return zzfv.zzb();
        }
        return zzfv.zzc(language.toLowerCase());
    }

    public final boolean zzb() {
        return false;
    }
}
