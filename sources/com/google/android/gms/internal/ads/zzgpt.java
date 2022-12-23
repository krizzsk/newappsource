package com.google.android.gms.internal.ads;

public final class zzgpt implements zzgqh, zzgpo {
    private static final Object zza = new Object();
    private volatile zzgqh zzb;
    private volatile Object zzc = zza;

    private zzgpt(zzgqh zzgqh) {
        this.zzb = zzgqh;
    }

    public static zzgpo zza(zzgqh zzgqh) {
        if (zzgqh instanceof zzgpo) {
            return (zzgpo) zzgqh;
        }
        zzgqh.getClass();
        return new zzgpt(zzgqh);
    }

    public static zzgqh zzc(zzgqh zzgqh) {
        zzgqh.getClass();
        if (zzgqh instanceof zzgpt) {
            return zzgqh;
        }
        return new zzgpt(zzgqh);
    }

    public final Object zzb() {
        Object obj = this.zzc;
        Object obj2 = zza;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.zzc;
                if (obj == obj2) {
                    obj = this.zzb.zzb();
                    Object obj3 = this.zzc;
                    if (obj3 != obj2) {
                        if (obj3 != obj) {
                            String valueOf = String.valueOf(obj3);
                            String valueOf2 = String.valueOf(obj);
                            StringBuilder sb = new StringBuilder(valueOf.length() + 118 + valueOf2.length());
                            sb.append("Scoped provider was invoked recursively returning different results: ");
                            sb.append(valueOf);
                            sb.append(" & ");
                            sb.append(valueOf2);
                            sb.append(". This is likely due to a circular dependency.");
                            throw new IllegalStateException(sb.toString());
                        }
                    }
                    this.zzc = obj;
                    this.zzb = null;
                }
            }
        }
        return obj;
    }
}
