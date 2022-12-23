package com.google.android.gms.measurement.internal;

import android.util.Log;
import p001a0.C0016g;

final class zzel implements Runnable {
    public final /* synthetic */ int zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ Object zzc;
    public final /* synthetic */ Object zzd;
    public final /* synthetic */ Object zze;
    public final /* synthetic */ zzeo zzf;

    public zzel(zzeo zzeo, int i, String str, Object obj, Object obj2, Object obj3) {
        this.zzf = zzeo;
        this.zza = i;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        this.zze = obj3;
    }

    public final void run() {
        zzfd zzm = this.zzf.zzs.zzm();
        if (zzm.zzx()) {
            zzeo zzeo = this.zzf;
            if (zzeo.zza == 0) {
                if (zzeo.zzs.zzf().zzy()) {
                    zzeo zzeo2 = this.zzf;
                    zzeo2.zzs.zzaw();
                    zzeo2.zza = 'C';
                } else {
                    zzeo zzeo3 = this.zzf;
                    zzeo3.zzs.zzaw();
                    zzeo3.zza = 'c';
                }
            }
            zzeo zzeo4 = this.zzf;
            if (zzeo4.zzb < 0) {
                zzeo4.zzs.zzf().zzh();
                zzeo4.zzb = 73000;
            }
            char charAt = "01VDIWEA?".charAt(this.zza);
            zzeo zzeo5 = this.zzf;
            char zza2 = zzeo5.zza;
            long zzb2 = zzeo5.zzb;
            String zzo = zzeo.zzo(true, this.zzb, this.zzc, this.zzd, this.zze);
            StringBuilder sb = new StringBuilder();
            sb.append("2");
            sb.append(charAt);
            sb.append(zza2);
            sb.append(zzb2);
            String o = C0016g.m31o(sb, ":", zzo);
            if (o.length() > 1024) {
                o = this.zzb.substring(0, 1024);
            }
            zzfb zzfb = zzm.zzb;
            if (zzfb != null) {
                zzfb.zzb(o, 1);
                return;
            }
            return;
        }
        Log.println(6, this.zzf.zzq(), "Persisted config not initialized. Not logging error/warn");
    }
}
