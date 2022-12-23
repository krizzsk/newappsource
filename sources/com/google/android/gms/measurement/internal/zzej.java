package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import p358af.C13437d;

public final class zzej {
    public static final AtomicReference zza = new AtomicReference();
    public static final AtomicReference zzb = new AtomicReference();
    public static final AtomicReference zzc = new AtomicReference();
    private final zzei zzd;

    public zzej(zzei zzei) {
        this.zzd = zzei;
    }

    private static final String zzg(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        boolean z;
        String str2;
        Preconditions.checkNotNull(strArr);
        Preconditions.checkNotNull(strArr2);
        Preconditions.checkNotNull(atomicReference);
        if (strArr.length == strArr2.length) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        for (int i = 0; i < strArr.length; i++) {
            String str3 = strArr[i];
            if (str == str3 || str.equals(str3)) {
                synchronized (atomicReference) {
                    String[] strArr3 = (String[]) atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    str2 = strArr3[i];
                    if (str2 == null) {
                        str2 = strArr2[i] + "(" + strArr[i] + ")";
                        strArr3[i] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String zza(Object[] objArr) {
        String str;
        if (objArr == null) {
            return "[]";
        }
        StringBuilder k = C13555b.m33972k("[");
        for (Bundle bundle : objArr) {
            if (bundle instanceof Bundle) {
                str = zzb(bundle);
            } else {
                str = String.valueOf(bundle);
            }
            if (str != null) {
                if (k.length() != 1) {
                    k.append(", ");
                }
                k.append(str);
            }
        }
        k.append("]");
        return k.toString();
    }

    public final String zzb(Bundle bundle) {
        String str;
        if (bundle == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return bundle.toString();
        }
        StringBuilder k = C13555b.m33972k("Bundle[{");
        for (String next : bundle.keySet()) {
            if (k.length() != 8) {
                k.append(", ");
            }
            k.append(zze(next));
            k.append("=");
            Object obj = bundle.get(next);
            if (obj instanceof Bundle) {
                str = zza(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                str = zza((Object[]) obj);
            } else if (obj instanceof ArrayList) {
                str = zza(((ArrayList) obj).toArray());
            } else {
                str = String.valueOf(obj);
            }
            k.append(str);
        }
        k.append("}]");
        return k.toString();
    }

    public final String zzc(zzaw zzaw) {
        String str;
        if (!this.zzd.zza()) {
            return zzaw.toString();
        }
        StringBuilder k = C13555b.m33972k("origin=");
        k.append(zzaw.zzc);
        k.append(",name=");
        k.append(zzd(zzaw.zza));
        k.append(",params=");
        zzau zzau = zzaw.zzb;
        if (zzau == null) {
            str = null;
        } else if (!this.zzd.zza()) {
            str = zzau.toString();
        } else {
            str = zzb(zzau.zzc());
        }
        k.append(str);
        return k.toString();
    }

    public final String zzd(String str) {
        if (str == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return str;
        }
        return zzg(str, zzgv.zzc, zzgv.zza, zza);
    }

    public final String zze(String str) {
        if (str == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return str;
        }
        return zzg(str, zzgw.zzb, zzgw.zza, zzb);
    }

    public final String zzf(String str) {
        if (str == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return str;
        }
        if (str.startsWith("_exp_")) {
            return C13437d.m33706k("experiment_id(", str, ")");
        }
        return zzg(str, zzgx.zzb, zzgx.zza, zzc);
    }
}
