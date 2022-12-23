package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;
import p358af.C13437d;

public abstract class zzajb implements Comparable {
    /* access modifiers changed from: private */
    public final zzajm zza;
    private final int zzb;
    private final String zzc;
    private final int zzd;
    private final Object zze;
    private final zzajf zzf;
    private Integer zzg;
    private zzaje zzh;
    private boolean zzi;
    private zzaik zzj;
    private zzaja zzk;
    private final zzaip zzl;

    public zzajb(int i, String str, zzajf zzajf) {
        zzajm zzajm;
        Uri parse;
        String host;
        if (zzajm.zza) {
            zzajm = new zzajm();
        } else {
            zzajm = null;
        }
        this.zza = zzajm;
        this.zze = new Object();
        int i2 = 0;
        this.zzi = false;
        this.zzj = null;
        this.zzb = i;
        this.zzc = str;
        this.zzf = zzajf;
        this.zzl = new zzaip();
        if (!(TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || (host = parse.getHost()) == null)) {
            i2 = host.hashCode();
        }
        this.zzd = i2;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.zzg.intValue() - ((zzajb) obj).zzg.intValue();
    }

    public final String toString() {
        String hexString = Integer.toHexString(this.zzd);
        zzw();
        String str = this.zzc;
        Integer num = this.zzg;
        StringBuilder l = C13555b.m33973l("[ ] ", str, " ");
        l.append("0x".concat(String.valueOf(hexString)));
        l.append(" NORMAL ");
        l.append(num);
        return l.toString();
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzl.zzb();
    }

    public final int zzc() {
        return this.zzd;
    }

    public final zzaik zzd() {
        return this.zzj;
    }

    public final zzajb zze(zzaik zzaik) {
        this.zzj = zzaik;
        return this;
    }

    public final zzajb zzf(zzaje zzaje) {
        this.zzh = zzaje;
        return this;
    }

    public final zzajb zzg(int i) {
        this.zzg = Integer.valueOf(i);
        return this;
    }

    public abstract zzajh zzh(zzaix zzaix);

    public final String zzj() {
        String str = this.zzc;
        if (this.zzb != 0) {
            return C13437d.m33706k(Integer.toString(1), "-", str);
        }
        return str;
    }

    public final String zzk() {
        return this.zzc;
    }

    public Map zzl() throws zzaij {
        return Collections.emptyMap();
    }

    public final void zzm(String str) {
        if (zzajm.zza) {
            this.zza.zza(str, Thread.currentThread().getId());
        }
    }

    public final void zzn(zzajk zzajk) {
        zzajf zzajf;
        synchronized (this.zze) {
            zzajf = this.zzf;
        }
        if (zzajf != null) {
            zzajf.zza(zzajk);
        }
    }

    public abstract void zzo(Object obj);

    public final void zzp(String str) {
        zzaje zzaje = this.zzh;
        if (zzaje != null) {
            zzaje.zzb(this);
        }
        if (zzajm.zza) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new zzaiz(this, str, id));
                return;
            }
            this.zza.zza(str, id);
            this.zza.zzb(toString());
        }
    }

    public final void zzq() {
        synchronized (this.zze) {
            this.zzi = true;
        }
    }

    public final void zzr() {
        zzaja zzaja;
        synchronized (this.zze) {
            zzaja = this.zzk;
        }
        if (zzaja != null) {
            zzaja.zza(this);
        }
    }

    public final void zzs(zzajh zzajh) {
        zzaja zzaja;
        synchronized (this.zze) {
            zzaja = this.zzk;
        }
        if (zzaja != null) {
            zzaja.zzb(this, zzajh);
        }
    }

    public final void zzt(int i) {
        zzaje zzaje = this.zzh;
        if (zzaje != null) {
            zzaje.zzc(this, i);
        }
    }

    public final void zzu(zzaja zzaja) {
        synchronized (this.zze) {
            this.zzk = zzaja;
        }
    }

    public final boolean zzv() {
        boolean z;
        synchronized (this.zze) {
            z = this.zzi;
        }
        return z;
    }

    public final boolean zzw() {
        synchronized (this.zze) {
        }
        return false;
    }

    public byte[] zzx() throws zzaij {
        return null;
    }

    public final zzaip zzy() {
        return this.zzl;
    }
}
