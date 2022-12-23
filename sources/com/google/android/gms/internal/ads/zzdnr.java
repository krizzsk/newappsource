package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import p241s0.C6313h;

public final class zzdnr {
    public static final zzdnr zza = new zzdnr(new zzdnp());
    private final zzbmb zzb;
    private final zzbly zzc;
    private final zzbmo zzd;
    private final zzbml zze;
    private final zzbra zzf;
    private final C6313h zzg;
    private final C6313h zzh;

    private zzdnr(zzdnp zzdnp) {
        this.zzb = zzdnp.zza;
        this.zzc = zzdnp.zzb;
        this.zzd = zzdnp.zzc;
        this.zzg = new C6313h(zzdnp.zzf);
        this.zzh = new C6313h(zzdnp.zzg);
        this.zze = zzdnp.zzd;
        this.zzf = zzdnp.zze;
    }

    public final zzbly zza() {
        return this.zzc;
    }

    public final zzbmb zzb() {
        return this.zzb;
    }

    public final zzbme zzc(String str) {
        return (zzbme) this.zzh.getOrDefault(str, null);
    }

    public final zzbmh zzd(String str) {
        return (zzbmh) this.zzg.getOrDefault(str, null);
    }

    public final zzbml zze() {
        return this.zze;
    }

    public final zzbmo zzf() {
        return this.zzd;
    }

    public final zzbra zzg() {
        return this.zzf;
    }

    public final ArrayList zzh() {
        ArrayList arrayList = new ArrayList(this.zzg.f19969d);
        int i = 0;
        while (true) {
            C6313h hVar = this.zzg;
            if (i >= hVar.f19969d) {
                return arrayList;
            }
            arrayList.add((String) hVar.mo22416h(i));
            i++;
        }
    }

    public final ArrayList zzi() {
        ArrayList arrayList = new ArrayList();
        if (this.zzd != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.zzb != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.zzc != null) {
            arrayList.add(Integer.toString(2));
        }
        if (!this.zzg.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (this.zzf != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }
}
