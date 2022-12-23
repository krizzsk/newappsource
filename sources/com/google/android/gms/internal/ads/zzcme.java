package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzfg;
import com.google.android.gms.common.util.CollectionUtils;
import com.usebutton.sdk.internal.events.Events;
import com.usebutton.sdk.internal.util.DiskLruCache;
import java.util.HashMap;
import java.util.Map;

public final class zzcme extends zzdj {
    private final zzchr zza;
    private final Object zzb = new Object();
    private final boolean zzc;
    private final boolean zzd;
    private int zze;
    private zzdn zzf;
    private boolean zzg;
    private boolean zzh = true;
    private float zzi;
    private float zzj;
    private float zzk;
    private boolean zzl;
    private boolean zzm;
    private zzbmi zzn;

    public zzcme(zzchr zzchr, float f, boolean z, boolean z2) {
        this.zza = zzchr;
        this.zzi = f;
        this.zzc = z;
        this.zzd = z2;
    }

    private final void zzw(int i, int i2, boolean z, boolean z2) {
        zzcfv.zze.execute(new zzcmd(this, i, i2, z, z2));
    }

    private final void zzx(String str, Map map) {
        HashMap hashMap;
        if (map == null) {
            hashMap = new HashMap();
        } else {
            hashMap = new HashMap(map);
        }
        hashMap.put(Events.PROPERTY_ACTION, str);
        zzcfv.zze.execute(new zzcmc(this, hashMap));
    }

    public final void zzc(float f, float f2, int i, boolean z, float f3) {
        boolean z2;
        boolean z3;
        int i2;
        synchronized (this.zzb) {
            z2 = true;
            if (f2 == this.zzi) {
                if (f3 == this.zzk) {
                    z2 = false;
                }
            }
            this.zzi = f2;
            this.zzj = f;
            z3 = this.zzh;
            this.zzh = z;
            i2 = this.zze;
            this.zze = i;
            float f4 = this.zzk;
            this.zzk = f3;
            if (Math.abs(f3 - f4) > 1.0E-4f) {
                this.zza.zzH().invalidate();
            }
        }
        if (z2) {
            try {
                zzbmi zzbmi = this.zzn;
                if (zzbmi != null) {
                    zzbmi.zze();
                }
            } catch (RemoteException e) {
                zzcfi.zzl("#007 Could not call remote method.", e);
            }
        }
        zzw(i2, i, z3, z);
    }

    public final /* synthetic */ void zzd(int i, int i2, boolean z, boolean z2) {
        boolean z3;
        int i3;
        boolean z4;
        boolean z5;
        boolean z6;
        zzdn zzdn;
        zzdn zzdn2;
        zzdn zzdn3;
        synchronized (this.zzb) {
            boolean z7 = this.zzg;
            boolean z8 = false;
            if (z7 || i2 != 1) {
                i3 = i2;
                z3 = false;
            } else {
                i3 = 1;
                z3 = true;
            }
            if (i == i2 || i3 != 1) {
                z4 = false;
            } else {
                i3 = 1;
                z4 = true;
            }
            if (i == i2 || i3 != 2) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (i == i2 || i3 != 3) {
                z6 = false;
            } else {
                z6 = true;
            }
            if (z7 || z3) {
                z8 = true;
            }
            this.zzg = z8;
            if (z3) {
                try {
                    zzdn zzdn4 = this.zzf;
                    if (zzdn4 != null) {
                        zzdn4.zzi();
                    }
                } catch (RemoteException e) {
                    zzcfi.zzl("#007 Could not call remote method.", e);
                }
            }
            if (z4 && (zzdn3 = this.zzf) != null) {
                zzdn3.zzh();
            }
            if (z5 && (zzdn2 = this.zzf) != null) {
                zzdn2.zzg();
            }
            if (z6) {
                zzdn zzdn5 = this.zzf;
                if (zzdn5 != null) {
                    zzdn5.zze();
                }
                this.zza.zzy();
            }
            if (!(z == z2 || (zzdn = this.zzf) == null)) {
                zzdn.zzf(z2);
            }
        }
    }

    public final float zze() {
        float f;
        synchronized (this.zzb) {
            f = this.zzk;
        }
        return f;
    }

    public final float zzf() {
        float f;
        synchronized (this.zzb) {
            f = this.zzj;
        }
        return f;
    }

    public final float zzg() {
        float f;
        synchronized (this.zzb) {
            f = this.zzi;
        }
        return f;
    }

    public final int zzh() {
        int i;
        synchronized (this.zzb) {
            i = this.zze;
        }
        return i;
    }

    public final zzdn zzi() throws RemoteException {
        zzdn zzdn;
        synchronized (this.zzb) {
            zzdn = this.zzf;
        }
        return zzdn;
    }

    public final void zzj(boolean z) {
        zzx(true != z ? "unmute" : "mute", (Map) null);
    }

    public final void zzk() {
        zzx("pause", (Map) null);
    }

    public final void zzl() {
        zzx("play", (Map) null);
    }

    public final void zzm(zzdn zzdn) {
        synchronized (this.zzb) {
            this.zzf = zzdn;
        }
    }

    public final void zzn() {
        zzx("stop", (Map) null);
    }

    public final boolean zzo() {
        boolean z;
        boolean zzp = zzp();
        synchronized (this.zzb) {
            z = false;
            if (!zzp) {
                try {
                    if (this.zzm && this.zzd) {
                        z = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return z;
    }

    public final boolean zzp() {
        boolean z;
        synchronized (this.zzb) {
            z = false;
            if (this.zzc && this.zzl) {
                z = true;
            }
        }
        return z;
    }

    public final boolean zzq() {
        boolean z;
        synchronized (this.zzb) {
            z = this.zzh;
        }
        return z;
    }

    public final /* synthetic */ void zzr(Map map) {
        this.zza.zzd("pubVideoCmd", map);
    }

    public final void zzs(zzfg zzfg) {
        String str;
        String str2;
        String str3;
        boolean z = zzfg.zza;
        boolean z2 = zzfg.zzb;
        boolean z3 = zzfg.zzc;
        synchronized (this.zzb) {
            this.zzl = z2;
            this.zzm = z3;
        }
        if (true != z) {
            str = "0";
        } else {
            str = DiskLruCache.VERSION_1;
        }
        String str4 = str;
        if (true != z2) {
            str2 = "0";
        } else {
            str2 = DiskLruCache.VERSION_1;
        }
        String str5 = str2;
        if (true != z3) {
            str3 = "0";
        } else {
            str3 = DiskLruCache.VERSION_1;
        }
        zzx("initialState", CollectionUtils.mapOf("muteStart", str4, "customControlsRequested", str5, "clickToExpandRequested", str3));
    }

    public final void zzt(float f) {
        synchronized (this.zzb) {
            this.zzj = f;
        }
    }

    public final void zzu() {
        boolean z;
        int i;
        synchronized (this.zzb) {
            z = this.zzh;
            i = this.zze;
            this.zze = 3;
        }
        zzw(i, 3, z, z);
    }

    public final void zzv(zzbmi zzbmi) {
        synchronized (this.zzb) {
            this.zzn = zzbmi;
        }
    }
}
