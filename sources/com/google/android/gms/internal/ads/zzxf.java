package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Display;
import android.view.Surface;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

public final class zzxf {
    private final zzwu zza = new zzwu();
    private final zzxb zzb;
    private final zzxe zzc;
    private boolean zzd;
    private Surface zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private float zzi;
    private int zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;

    public zzxf(Context context) {
        zzxb zzxb;
        zzxe zzxe = null;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            int i = zzeg.zza;
            zzxb = zzxd.zzc(applicationContext);
            if (zzxb == null) {
                zzxb = zzxc.zzc(applicationContext);
            }
        } else {
            zzxb = null;
        }
        this.zzb = zzxb;
        this.zzc = zzxb != null ? zzxe.zza() : zzxe;
        this.zzk = -9223372036854775807L;
        this.zzl = -9223372036854775807L;
        this.zzf = -1.0f;
        this.zzi = 1.0f;
        this.zzj = 0;
    }

    public static /* synthetic */ void zzb(zzxf zzxf, Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            zzxf.zzk = refreshRate;
            zzxf.zzl = (refreshRate * 80) / 100;
            return;
        }
        zzxf.zzk = -9223372036854775807L;
        zzxf.zzl = -9223372036854775807L;
    }

    private final void zzk() {
        Surface surface;
        if (zzeg.zza >= 30 && (surface = this.zze) != null && this.zzj != Integer.MIN_VALUE && this.zzh != BitmapDescriptorFactory.HUE_RED) {
            this.zzh = BitmapDescriptorFactory.HUE_RED;
            zzxa.zza(surface, BitmapDescriptorFactory.HUE_RED);
        }
    }

    private final void zzl() {
        this.zzm = 0;
        this.zzp = -1;
        this.zzn = -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0055, code lost:
        if (java.lang.Math.abs(r0 - r10.zzg) >= r2) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0060, code lost:
        if (r10.zza.zzb() >= 30) goto L_0x0064;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzm() {
        /*
            r10 = this;
            int r0 = com.google.android.gms.internal.ads.zzeg.zza
            r1 = 30
            if (r0 < r1) goto L_0x006d
            android.view.Surface r0 = r10.zze
            if (r0 != 0) goto L_0x000b
            goto L_0x006d
        L_0x000b:
            com.google.android.gms.internal.ads.zzwu r0 = r10.zza
            boolean r0 = r0.zzg()
            if (r0 == 0) goto L_0x001a
            com.google.android.gms.internal.ads.zzwu r0 = r10.zza
            float r0 = r0.zza()
            goto L_0x001c
        L_0x001a:
            float r0 = r10.zzf
        L_0x001c:
            float r2 = r10.zzg
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 != 0) goto L_0x0023
            return
        L_0x0023:
            r3 = 1
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0058
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0058
            com.google.android.gms.internal.ads.zzwu r1 = r10.zza
            boolean r1 = r1.zzg()
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L_0x004b
            com.google.android.gms.internal.ads.zzwu r1 = r10.zza
            long r6 = r1.zzd()
            r8 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 < 0) goto L_0x004b
            r2 = 1017370378(0x3ca3d70a, float:0.02)
        L_0x004b:
            float r1 = r10.zzg
            float r1 = r0 - r1
            float r1 = java.lang.Math.abs(r1)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L_0x0063
            goto L_0x0064
        L_0x0058:
            if (r6 != 0) goto L_0x0068
            com.google.android.gms.internal.ads.zzwu r2 = r10.zza
            int r2 = r2.zzb()
            if (r2 < r1) goto L_0x0063
            goto L_0x0064
        L_0x0063:
            r3 = 0
        L_0x0064:
            if (r3 == 0) goto L_0x0067
            goto L_0x0068
        L_0x0067:
            return
        L_0x0068:
            r10.zzg = r0
            r10.zzn(r5)
        L_0x006d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxf.zzm():void");
    }

    private final void zzn(boolean z) {
        Surface surface;
        if (zzeg.zza >= 30 && (surface = this.zze) != null && this.zzj != Integer.MIN_VALUE) {
            boolean z2 = this.zzd;
            float f = BitmapDescriptorFactory.HUE_RED;
            if (z2) {
                float f2 = this.zzg;
                if (f2 != -1.0f) {
                    f = this.zzi * f2;
                }
            }
            if (z || this.zzh != f) {
                this.zzh = f;
                zzxa.zza(surface, f);
            }
        }
    }

    public final long zza(long j) {
        long j2;
        if (this.zzp != -1 && this.zza.zzg()) {
            long zzc2 = this.zzq + ((long) (((float) ((this.zzm - this.zzp) * this.zza.zzc())) / this.zzi));
            if (Math.abs(j - zzc2) <= 20000000) {
                j = zzc2;
            } else {
                zzl();
            }
        }
        this.zzn = this.zzm;
        this.zzo = j;
        zzxe zzxe = this.zzc;
        if (zzxe == null || this.zzk == -9223372036854775807L) {
            return j;
        }
        long j3 = zzxe.zza;
        if (j3 == -9223372036854775807L) {
            return j;
        }
        long j4 = this.zzk;
        long j5 = (((j - j3) / j4) * j4) + j3;
        if (j <= j5) {
            j2 = j5 - j4;
        } else {
            j2 = j5;
            j5 = j4 + j5;
        }
        if (j5 - j >= j - j2) {
            j5 = j2;
        }
        return j5 - this.zzl;
    }

    public final void zzc(float f) {
        this.zzf = f;
        this.zza.zzf();
        zzm();
    }

    public final void zzd(long j) {
        long j2 = this.zzn;
        if (j2 != -1) {
            this.zzp = j2;
            this.zzq = this.zzo;
        }
        this.zzm++;
        this.zza.zze(j * 1000);
        zzm();
    }

    public final void zze(float f) {
        this.zzi = f;
        zzl();
        zzn(false);
    }

    public final void zzf() {
        zzl();
    }

    public final void zzg() {
        this.zzd = true;
        zzl();
        if (this.zzb != null) {
            zzxe zzxe = this.zzc;
            zzxe.getClass();
            zzxe.zzb();
            this.zzb.zzb(new zzwz(this));
        }
        zzn(false);
    }

    public final void zzh() {
        this.zzd = false;
        zzxb zzxb = this.zzb;
        if (zzxb != null) {
            zzxb.zza();
            zzxe zzxe = this.zzc;
            zzxe.getClass();
            zzxe.zzc();
        }
        zzk();
    }

    public final void zzi(Surface surface) {
        if (true == (surface instanceof zzws)) {
            surface = null;
        }
        if (this.zze != surface) {
            zzk();
            this.zze = surface;
            zzn(true);
        }
    }

    public final void zzj(int i) {
        if (this.zzj != i) {
            this.zzj = i;
            zzn(true);
        }
    }
}
