package com.google.android.gms.internal.p986firebaseauthapi;

import android.text.TextUtils;
import com.google.firebase.auth.zze;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsw */
final class zzsw implements zzxi {
    public final /* synthetic */ zzxh zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ Boolean zzd;
    public final /* synthetic */ zze zze;
    public final /* synthetic */ zzwc zzf;
    public final /* synthetic */ zzza zzg;

    public zzsw(zzuh zzuh, zzxh zzxh, String str, String str2, Boolean bool, zze zze2, zzwc zzwc, zzza zzza) {
        this.zza = zzxh;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = bool;
        this.zze = zze2;
        this.zzf = zzwc;
        this.zzg = zzza;
    }

    public final void zza(String str) {
        this.zza.zza(str);
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List list;
        List zzb2 = ((zzyr) obj).zzb();
        if (zzb2 == null || zzb2.isEmpty()) {
            this.zza.zza("No users.");
            return;
        }
        int i = 0;
        zzyt zzyt = (zzyt) zzb2.get(0);
        zzzi zzl = zzyt.zzl();
        if (zzl != null) {
            list = zzl.zzc();
        } else {
            list = null;
        }
        if (list != null && !list.isEmpty()) {
            if (!TextUtils.isEmpty(this.zzb)) {
                while (true) {
                    if (i >= list.size()) {
                        break;
                    } else if (((zzzg) list.get(i)).zzf().equals(this.zzb)) {
                        ((zzzg) list.get(i)).zzh(this.zzc);
                        break;
                    } else {
                        i++;
                    }
                }
            } else {
                ((zzzg) list.get(0)).zzh(this.zzc);
            }
        }
        zzyt.zzh(this.zzd.booleanValue());
        zzyt.zze(this.zze);
        this.zzf.zzi(this.zzg, zzyt);
    }
}
