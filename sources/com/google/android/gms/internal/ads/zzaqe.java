package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

public final class zzaqe extends zzaqm {
    private final StackTraceElement[] zzi;

    public zzaqe(zzapc zzapc, String str, String str2, zzali zzali, int i, int i2, StackTraceElement[] stackTraceElementArr) {
        super(zzapc, "kMXyn5TCo9Bebr+VtNQhQbsedp0AgYXwXzhxSBLRAfdMLXXtz9tGq6347jNKG6EM", "Ltrx5Q9/za/YLPniDoPXToLTIAd9/kkkFMmYpsE8Gx0=", zzali, i, 45);
        this.zzi = stackTraceElementArr;
    }

    public final void zza() throws IllegalAccessException, InvocationTargetException {
        Object obj = this.zzi;
        if (obj != null) {
            int i = 1;
            zzaou zzaou = new zzaou((String) this.zzf.invoke((Object) null, new Object[]{obj}));
            synchronized (this.zze) {
                this.zze.zzC(zzaou.zza.longValue());
                if (zzaou.zzb.booleanValue()) {
                    zzali zzali = this.zze;
                    if (true != zzaou.zzc.booleanValue()) {
                        i = 2;
                    }
                    zzali.zzZ(i);
                } else {
                    this.zze.zzZ(3);
                }
            }
        }
    }
}
