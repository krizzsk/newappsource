package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

public final class zzapz extends zzaqm {
    private static volatile String zzi;
    private static final Object zzj = new Object();

    public zzapz(zzapc zzapc, String str, String str2, zzali zzali, int i, int i2) {
        super(zzapc, "yAAnOyC41KY/eL6CMAojoxxQ2iiLx6vx3Hn+A3WrzJkepsJehbcbUfsfqGMngMgj", "0sUnM0f6jlJ2HFtGqy6I2XKbpiW5H3xN4OJ+XAaaX74=", zzali, i, 1);
    }

    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzy("E");
        if (zzi == null) {
            synchronized (zzj) {
                if (zzi == null) {
                    zzi = (String) this.zzf.invoke((Object) null, new Object[0]);
                }
            }
        }
        synchronized (this.zze) {
            this.zze.zzy(zzi);
        }
    }
}
