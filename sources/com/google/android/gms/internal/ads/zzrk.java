package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;

public abstract class zzrk extends zzrc {
    private final HashMap zza = new HashMap();
    private Handler zzb;
    private zzft zzc;

    public final void zzj() {
        for (zzrj zzrj : this.zza.values()) {
            zzrj.zza.zzi(zzrj.zzb);
        }
    }

    public final void zzl() {
        for (zzrj zzrj : this.zza.values()) {
            zzrj.zza.zzk(zzrj.zzb);
        }
    }

    public void zzn(zzft zzft) {
        this.zzc = zzft;
        this.zzb = zzeg.zzC((Handler.Callback) null);
    }

    public void zzq() {
        for (zzrj zzrj : this.zza.values()) {
            zzrj.zza.zzp(zzrj.zzb);
            zzrj.zza.zzs(zzrj.zzc);
            zzrj.zza.zzr(zzrj.zzc);
        }
        this.zza.clear();
    }

    public zzsb zzv(Object obj, zzsb zzsb) {
        throw null;
    }

    public void zzw() throws IOException {
        for (zzrj zzrj : this.zza.values()) {
            zzrj.zza.zzw();
        }
    }

    public abstract void zzx(Object obj, zzsd zzsd, zzci zzci);

    public final void zzy(Object obj, zzsd zzsd) {
        zzcw.zzd(!this.zza.containsKey(obj));
        zzrh zzrh = new zzrh(this, obj);
        zzri zzri = new zzri(this, obj);
        this.zza.put(obj, new zzrj(zzsd, zzrh, zzri));
        Handler handler = this.zzb;
        handler.getClass();
        zzsd.zzh(handler, zzri);
        Handler handler2 = this.zzb;
        handler2.getClass();
        zzsd.zzg(handler2, zzri);
        zzsd.zzm(zzrh, this.zzc, zzb());
        if (!zzt()) {
            zzsd.zzi(zzrh);
        }
    }
}
