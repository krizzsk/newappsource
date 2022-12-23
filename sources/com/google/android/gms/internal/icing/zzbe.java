package com.google.android.gms.internal.icing;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import java.util.Iterator;
import java.util.Map;
import p241s0.C6302b;

public final class zzbe {
    public static final String[] zza = {LinksConfiguration.KEY_KEY, "value"};
    private static final Map<Uri, zzbe> zzb = new C6302b();
    private final ContentResolver zzc;
    private final ContentObserver zzd;

    public static synchronized void zza() {
        synchronized (zzbe.class) {
            Map<Uri, zzbe> map = zzb;
            Iterator<zzbe> it = map.values().iterator();
            if (!it.hasNext()) {
                map.clear();
            } else {
                ContentResolver contentResolver = it.next().zzc;
                throw null;
            }
        }
    }
}
