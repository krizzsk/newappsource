package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

public final class zzapo extends zzaqm {
    private static final zzaqn zzi = new zzaqn();
    private final Context zzj;

    public zzapo(zzapc zzapc, String str, String str2, zzali zzali, int i, int i2, Context context) {
        super(zzapc, "zvpJLhHcREzFwRQlrOzsvLoNpjh/NkRx1SzlprPtOYrQsQFy5mJhifaboWh6aFyp", "8ERWo9yFmc7LDwD3Ell224G1/aFiu9/+mVDz7d1kThk=", zzali, i, 29);
        this.zzj = context;
    }

    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzm("E");
        AtomicReference zza = zzi.zza(this.zzj.getPackageName());
        if (zza.get() == null) {
            synchronized (zza) {
                if (zza.get() == null) {
                    zza.set((String) this.zzf.invoke((Object) null, new Object[]{this.zzj}));
                }
            }
        }
        String str = (String) zza.get();
        synchronized (this.zze) {
            this.zze.zzm(zzamn.zza(str.getBytes(), true));
        }
    }
}
