package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import p001a0.C0016g;
import p001a0.C0017h;

public final class zzbbb {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final boolean zzd;
    private final zzbbq zze;
    private final zzbby zzf;
    private final Object zzg = new Object();
    private final ArrayList zzh = new ArrayList();
    private final ArrayList zzi = new ArrayList();
    private final ArrayList zzj = new ArrayList();
    private int zzk = 0;
    private int zzl = 0;
    private int zzm = 0;
    private int zzn;
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";

    public zzbbb(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = z;
        this.zze = new zzbbq(i4);
        this.zzf = new zzbby(i5, i6, i7);
    }

    private final void zzp(String str, boolean z, float f, float f2, float f3, float f4) {
        if (str != null && str.length() >= this.zzc) {
            synchronized (this.zzg) {
                this.zzh.add(str);
                this.zzk += str.length();
                if (z) {
                    this.zzi.add(str);
                    this.zzj.add(new zzbbm(f, f2, f3, f4, this.zzi.size() - 1));
                }
            }
        }
    }

    private static final String zzq(ArrayList arrayList, int i) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            sb.append((String) arrayList.get(i2));
            sb.append(' ');
            i2++;
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        String sb2 = sb.toString();
        if (sb2.length() < 100) {
            return sb2;
        }
        return sb2.substring(0, 100);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbbb)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((zzbbb) obj).zzo;
        if (str == null || !str.equals(this.zzo)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.zzo.hashCode();
    }

    public final String toString() {
        int i = this.zzl;
        int i2 = this.zzn;
        int i3 = this.zzk;
        String zzq2 = zzq(this.zzh, 100);
        String zzq3 = zzq(this.zzi, 100);
        String str = this.zzo;
        String str2 = this.zzp;
        String str3 = this.zzq;
        StringBuilder s = C0016g.m35s("ActivityContent fetchId: ", i, " score:", i2, " total_length:");
        s.append(i3);
        s.append("\n text: ");
        s.append(zzq2);
        s.append("\n viewableText");
        C0017h.m61R(s, zzq3, "\n signture: ", str, "\n viewableSignture: ");
        return C13715c.m34245k(s, str2, "\n viewableSignatureForVertical: ", str3);
    }

    @VisibleForTesting
    public final int zza(int i, int i2) {
        if (this.zzd) {
            return this.zzb;
        }
        return (i2 * this.zzb) + (i * this.zza);
    }

    public final int zzb() {
        return this.zzn;
    }

    @VisibleForTesting
    public final int zzc() {
        return this.zzk;
    }

    public final String zzd() {
        return this.zzo;
    }

    public final String zze() {
        return this.zzp;
    }

    public final String zzf() {
        return this.zzq;
    }

    public final void zzg() {
        synchronized (this.zzg) {
            this.zzm--;
        }
    }

    public final void zzh() {
        synchronized (this.zzg) {
            this.zzm++;
        }
    }

    public final void zzi() {
        synchronized (this.zzg) {
            this.zzn -= 100;
        }
    }

    public final void zzj(int i) {
        this.zzl = i;
    }

    public final void zzk(String str, boolean z, float f, float f2, float f3, float f4) {
        zzp(str, z, f, f2, f3, f4);
    }

    public final void zzl(String str, boolean z, float f, float f2, float f3, float f4) {
        zzp(str, z, f, f2, f3, f4);
        synchronized (this.zzg) {
            if (this.zzm < 0) {
                zzcfi.zze("ActivityContent: negative number of WebViews.");
            }
            zzm();
        }
    }

    public final void zzm() {
        synchronized (this.zzg) {
            int zza2 = zza(this.zzk, this.zzl);
            if (zza2 > this.zzn) {
                this.zzn = zza2;
                if (!zzt.zzo().zzh().zzM()) {
                    this.zzo = this.zze.zza(this.zzh);
                    this.zzp = this.zze.zza(this.zzi);
                }
                if (!zzt.zzo().zzh().zzN()) {
                    this.zzq = this.zzf.zza(this.zzi, this.zzj);
                }
            }
        }
    }

    public final void zzn() {
        synchronized (this.zzg) {
            int zza2 = zza(this.zzk, this.zzl);
            if (zza2 > this.zzn) {
                this.zzn = zza2;
            }
        }
    }

    public final boolean zzo() {
        boolean z;
        synchronized (this.zzg) {
            if (this.zzm == 0) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }
}
