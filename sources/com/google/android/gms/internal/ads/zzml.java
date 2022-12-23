package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

final class zzml {
    private final zzcf zza;
    /* access modifiers changed from: private */
    public zzfrh zzb = zzfrh.zzo();
    private zzfrk zzc = zzfrk.zzd();
    private zzsb zzd;
    private zzsb zze;
    private zzsb zzf;

    public zzml(zzcf zzcf) {
        this.zza = zzcf;
    }

    private static zzsb zzj(zzcb zzcb, zzfrh zzfrh, zzsb zzsb, zzcf zzcf) {
        Object obj;
        int i;
        zzci zzn = zzcb.zzn();
        int zzg = zzcb.zzg();
        if (zzn.zzo()) {
            obj = null;
        } else {
            obj = zzn.zzf(zzg);
        }
        if (zzcb.zzs() || zzn.zzo()) {
            i = -1;
        } else {
            i = zzn.zzd(zzg, zzcf, false).zzc(zzeg.zzv(zzcb.zzl()));
        }
        for (int i2 = 0; i2 < zzfrh.size(); i2++) {
            zzsb zzsb2 = (zzsb) zzfrh.get(i2);
            if (zzm(zzsb2, obj, zzcb.zzs(), zzcb.zzd(), zzcb.zze(), i)) {
                return zzsb2;
            }
        }
        if (zzfrh.isEmpty() && zzsb != null) {
            if (zzm(zzsb, obj, zzcb.zzs(), zzcb.zzd(), zzcb.zze(), i)) {
                return zzsb;
            }
        }
        return null;
    }

    private final void zzk(zzfrj zzfrj, zzsb zzsb, zzci zzci) {
        if (zzsb != null) {
            if (zzci.zza(zzsb.zza) != -1) {
                zzfrj.zza(zzsb, zzci);
                return;
            }
            zzci zzci2 = (zzci) this.zzc.get(zzsb);
            if (zzci2 != null) {
                zzfrj.zza(zzsb, zzci2);
            }
        }
    }

    private final void zzl(zzci zzci) {
        zzfrj zzfrj = new zzfrj();
        if (this.zzb.isEmpty()) {
            zzk(zzfrj, this.zze, zzci);
            if (!zzfoo.zza(this.zzf, this.zze)) {
                zzk(zzfrj, this.zzf, zzci);
            }
            if (!zzfoo.zza(this.zzd, this.zze) && !zzfoo.zza(this.zzd, this.zzf)) {
                zzk(zzfrj, this.zzd, zzci);
            }
        } else {
            for (int i = 0; i < this.zzb.size(); i++) {
                zzk(zzfrj, (zzsb) this.zzb.get(i), zzci);
            }
            if (!this.zzb.contains(this.zzd)) {
                zzk(zzfrj, this.zzd, zzci);
            }
        }
        this.zzc = zzfrj.zzc();
    }

    private static boolean zzm(zzsb zzsb, Object obj, boolean z, int i, int i2, int i3) {
        if (!zzsb.zza.equals(obj)) {
            return false;
        }
        if (z) {
            if (!(zzsb.zzb == i && zzsb.zzc == i2)) {
                return false;
            }
        } else if (!(zzsb.zzb == -1 && zzsb.zze == i3)) {
            return false;
        }
        return true;
    }

    public final zzci zza(zzsb zzsb) {
        return (zzci) this.zzc.get(zzsb);
    }

    public final zzsb zzb() {
        return this.zzd;
    }

    public final zzsb zzc() {
        Object obj;
        Object next;
        if (this.zzb.isEmpty()) {
            return null;
        }
        zzfrh zzfrh = this.zzb;
        if (!(zzfrh instanceof List)) {
            Iterator it = zzfrh.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            obj = next;
        } else if (!zzfrh.isEmpty()) {
            obj = zzfrh.get(zzfrh.size() - 1);
        } else {
            throw new NoSuchElementException();
        }
        return (zzsb) obj;
    }

    public final zzsb zzd() {
        return this.zze;
    }

    public final zzsb zze() {
        return this.zzf;
    }

    public final void zzg(zzcb zzcb) {
        this.zzd = zzj(zzcb, this.zzb, this.zze, this.zza);
    }

    public final void zzh(List list, zzsb zzsb, zzcb zzcb) {
        this.zzb = zzfrh.zzm(list);
        if (!list.isEmpty()) {
            this.zze = (zzsb) list.get(0);
            zzsb.getClass();
            this.zzf = zzsb;
        }
        if (this.zzd == null) {
            this.zzd = zzj(zzcb, this.zzb, this.zze, this.zza);
        }
        zzl(zzcb.zzn());
    }

    public final void zzi(zzcb zzcb) {
        this.zzd = zzj(zzcb, this.zzb, this.zze, this.zza);
        zzl(zzcb.zzn());
    }
}
