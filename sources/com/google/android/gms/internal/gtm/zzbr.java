package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.zzr;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;

public class zzbr {
    private final zzbv zza;

    public zzbr(zzbv zzbv) {
        Preconditions.checkNotNull(zzbv);
        this.zza = zzbv;
    }

    public static String zzD(String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String zza2 = zza(obj);
        String zza3 = zza(obj2);
        String zza4 = zza(obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(zza2)) {
            sb.append(str2);
            sb.append(zza2);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(zza3)) {
            sb.append(str2);
            sb.append(zza3);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(zza4)) {
            sb.append(str3);
            sb.append(zza4);
        }
        return sb.toString();
    }

    public static final boolean zzV() {
        return Log.isLoggable(zzeu.zzc.zzb(), 2);
    }

    private static String zza(Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Boolean) {
            if (obj == Boolean.TRUE) {
                return InneractiveMediationDefs.SHOW_HOUSE_AD_YES;
            }
            return "false";
        } else if (obj instanceof Throwable) {
            return ((Throwable) obj).toString();
        } else {
            return obj.toString();
        }
    }

    private final void zzb(int i, String str, Object obj, Object obj2, Object obj3) {
        zzfb zzfb;
        zzbv zzbv = this.zza;
        if (zzbv != null) {
            zzfb = zzbv.zzn();
        } else {
            zzfb = null;
        }
        zzfb zzfb2 = zzfb;
        if (zzfb2 != null) {
            String zzb = zzeu.zzc.zzb();
            if (Log.isLoggable(zzb, i)) {
                Log.println(i, zzb, zzD(str, obj, obj2, obj3));
            }
            if (i >= 5) {
                zzfb2.zze(i, str, obj, obj2, obj3);
                return;
            }
            return;
        }
        String zzb2 = zzeu.zzc.zzb();
        if (Log.isLoggable(zzb2, i)) {
            Log.println(i, zzb2, zzD(str, obj, obj2, obj3));
        }
    }

    public final zzfh zzA() {
        return this.zza.zzo();
    }

    public final zzft zzB() {
        return this.zza.zzq();
    }

    public final Clock zzC() {
        return this.zza.zzr();
    }

    public final void zzE() {
        this.zza.zzj();
    }

    public final void zzF(String str) {
        zzb(3, str, (Object) null, (Object) null, (Object) null);
    }

    public final void zzG(String str, Object obj) {
        zzb(3, str, obj, (Object) null, (Object) null);
    }

    public final void zzH(String str, Object obj, Object obj2) {
        zzb(3, str, obj, obj2, (Object) null);
    }

    public final void zzI(String str, Object obj, Object obj2, Object obj3) {
        zzb(3, "POST compressed size, ratio %, url", obj, obj2, obj3);
    }

    public final void zzJ(String str) {
        zzb(6, str, (Object) null, (Object) null, (Object) null);
    }

    public final void zzK(String str, Object obj) {
        zzb(6, str, obj, (Object) null, (Object) null);
    }

    public final void zzL(String str, Object obj, Object obj2) {
        zzb(6, str, obj, obj2, (Object) null);
    }

    public final void zzM(String str) {
        zzb(4, str, (Object) null, (Object) null, (Object) null);
    }

    public final void zzN(String str, Object obj) {
        zzb(4, str, obj, (Object) null, (Object) null);
    }

    public final void zzO(String str) {
        zzb(2, str, (Object) null, (Object) null, (Object) null);
    }

    public final void zzP(String str, Object obj) {
        zzb(2, str, obj, (Object) null, (Object) null);
    }

    public final void zzQ(String str, Object obj, Object obj2) {
        zzb(2, str, obj, obj2, (Object) null);
    }

    public final void zzR(String str) {
        zzb(5, str, (Object) null, (Object) null, (Object) null);
    }

    public final void zzS(String str, Object obj) {
        zzb(5, str, obj, (Object) null, (Object) null);
    }

    public final void zzT(String str, Object obj, Object obj2) {
        zzb(5, str, obj, obj2, (Object) null);
    }

    public final void zzU(String str, Object obj, Object obj2, Object obj3) {
        zzb(5, "Deleted fewer hits then expected", obj, obj2, obj3);
    }

    public final Context zzo() {
        return this.zza.zza();
    }

    public final GoogleAnalytics zzp() {
        return this.zza.zzc();
    }

    public final zzr zzq() {
        return this.zza.zzd();
    }

    public final zzbi zzr() {
        return this.zza.zze();
    }

    public final zzbq zzs() {
        return this.zza.zzf();
    }

    public final zzbv zzt() {
        return this.zza;
    }

    public final zzcf zzu() {
        return this.zza.zzh();
    }

    public final zzcn zzv() {
        return this.zza.zzi();
    }

    public final zzct zzw() {
        return this.zza.zzj();
    }

    public final zzcx zzx() {
        return this.zza.zzk();
    }

    public final zzcy zzy() {
        return this.zza.zzl();
    }

    public final zzfb zzz() {
        return this.zza.zzm();
    }
}
