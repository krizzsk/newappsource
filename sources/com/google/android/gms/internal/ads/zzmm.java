package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.google.android.gms.location.places.Place;
import java.io.IOException;
import java.util.List;

public final class zzmm implements zzki {
    private final zzcx zza;
    private final zzcf zzb;
    private final zzch zzc = new zzch();
    private final zzml zzd;
    private final SparseArray zze;
    private zzdm zzf;
    private zzcb zzg;
    private zzdg zzh;
    private boolean zzi;

    public zzmm(zzcx zzcx) {
        zzcx.getClass();
        this.zza = zzcx;
        this.zzf = new zzdm(zzeg.zzD(), zzcx, zzks.zza);
        zzcf zzcf = new zzcf();
        this.zzb = zzcf;
        this.zzd = new zzml(zzcf);
        this.zze = new SparseArray();
    }

    public static /* synthetic */ void zzW(zzmm zzmm) {
        zzkj zzU = zzmm.zzU();
        zzmm.zzZ(zzU, Place.TYPE_SUBPREMISE, new zzlg(zzU));
        zzmm.zzf.zze();
    }

    private final zzkj zzaa(zzsb zzsb) {
        zzci zzci;
        this.zzg.getClass();
        if (zzsb == null) {
            zzci = null;
        } else {
            zzci = this.zzd.zza(zzsb);
        }
        if (zzsb != null && zzci != null) {
            return zzV(zzci, zzci.zzn(zzsb.zza, this.zzb).zzd, zzsb);
        }
        int zzf2 = this.zzg.zzf();
        zzci zzn = this.zzg.zzn();
        if (zzf2 >= zzn.zzc()) {
            zzn = zzci.zza;
        }
        return zzV(zzn, zzf2, (zzsb) null);
    }

    private final zzkj zzab(int i, zzsb zzsb) {
        zzcb zzcb = this.zzg;
        zzcb.getClass();
        if (zzsb == null) {
            zzci zzn = zzcb.zzn();
            if (i >= zzn.zzc()) {
                zzn = zzci.zza;
            }
            return zzV(zzn, i, (zzsb) null);
        } else if (this.zzd.zza(zzsb) != null) {
            return zzaa(zzsb);
        } else {
            return zzV(zzci.zza, i, zzsb);
        }
    }

    private final zzkj zzac() {
        return zzaa(this.zzd.zzd());
    }

    private final zzkj zzad() {
        return zzaa(this.zzd.zze());
    }

    private final zzkj zzae(zzbr zzbr) {
        zzbi zzbi;
        if (!(zzbr instanceof zzgu) || (zzbi = ((zzgu) zzbr).zzj) == null) {
            return zzU();
        }
        return zzaa(new zzsb(zzbi));
    }

    public final void zzA(String str) {
        zzkj zzad = zzad();
        zzZ(zzad, Place.TYPE_POLITICAL, new zzmk(zzad, str));
    }

    public final void zzB(zzgm zzgm) {
        zzkj zzac = zzac();
        zzZ(zzac, Place.TYPE_POINT_OF_INTEREST, new zzma(zzac, zzgm));
    }

    public final void zzC(zzgm zzgm) {
        zzkj zzad = zzad();
        zzZ(zzad, 1007, new zzlo(zzad, zzgm));
    }

    public final void zzD(zzad zzad, zzgn zzgn) {
        zzkj zzad2 = zzad();
        zzZ(zzad2, Place.TYPE_LOCALITY, new zzlz(zzad2, zzad, zzgn));
    }

    public final void zzE(long j) {
        zzkj zzad = zzad();
        zzZ(zzad, Place.TYPE_NATURAL_FEATURE, new zzmc(zzad, j));
    }

    public final void zzF(Exception exc) {
        zzkj zzad = zzad();
        zzZ(zzad, Place.TYPE_POST_BOX, new zzkx(zzad, exc));
    }

    public final void zzG(int i, long j, long j2) {
        zzkj zzad = zzad();
        zzZ(zzad, Place.TYPE_NEIGHBORHOOD, new zzkp(zzad, i, j, j2));
    }

    public final void zzH(int i, long j) {
        zzkj zzac = zzac();
        zzZ(zzac, Place.TYPE_PREMISE, new zzlj(zzac, i, j));
    }

    public final void zzI(Object obj, long j) {
        zzkj zzad = zzad();
        zzZ(zzad, 26, new zzmg(zzad, obj, j));
    }

    public final void zzJ(Exception exc) {
        zzkj zzad = zzad();
        zzZ(zzad, Place.TYPE_TRANSIT_STATION, new zzkv(zzad, exc));
    }

    public final void zzK(String str, long j, long j2) {
        zzkj zzad = zzad();
        zzZ(zzad, Place.TYPE_POSTAL_CODE_PREFIX, new zzlf(zzad, str, j2, j));
    }

    public final void zzL(String str) {
        zzkj zzad = zzad();
        zzZ(zzad, Place.TYPE_ROOM, new zzko(zzad, str));
    }

    public final void zzM(zzgm zzgm) {
        zzkj zzac = zzac();
        zzZ(zzac, Place.TYPE_ROUTE, new zzmf(zzac, zzgm));
    }

    public final void zzN(zzgm zzgm) {
        zzkj zzad = zzad();
        zzZ(zzad, Place.TYPE_POSTAL_CODE, new zzlk(zzad, zzgm));
    }

    public final void zzO(long j, int i) {
        zzkj zzac = zzac();
        zzZ(zzac, Place.TYPE_STREET_ADDRESS, new zzky(zzac, j, i));
    }

    public final void zzP(zzad zzad, zzgn zzgn) {
        zzkj zzad2 = zzad();
        zzZ(zzad2, Place.TYPE_POSTAL_TOWN, new zzkn(zzad2, zzad, zzgn));
    }

    public final void zzQ() {
        zzdg zzdg = this.zzh;
        zzcw.zzb(zzdg);
        zzdg.zzg(new zzmb(this));
    }

    public final void zzR(zzkl zzkl) {
        this.zzf.zzf(zzkl);
    }

    public final void zzS(zzcb zzcb, Looper looper) {
        boolean z = true;
        if (this.zzg != null && !this.zzd.zzb.isEmpty()) {
            z = false;
        }
        zzcw.zzf(z);
        zzcb.getClass();
        this.zzg = zzcb;
        this.zzh = this.zza.zzb(looper, (Handler.Callback) null);
        this.zzf = this.zzf.zza(looper, new zzle(this, zzcb));
    }

    public final void zzT(List list, zzsb zzsb) {
        zzml zzml = this.zzd;
        zzcb zzcb = this.zzg;
        zzcb.getClass();
        zzml.zzh(list, zzsb, zzcb);
    }

    public final zzkj zzU() {
        return zzaa(this.zzd.zzb());
    }

    public final zzkj zzV(zzci zzci, int i, zzsb zzsb) {
        zzsb zzsb2;
        zzci zzci2 = zzci;
        int i2 = i;
        boolean z = true;
        if (true == zzci.zzo()) {
            zzsb2 = null;
        } else {
            zzsb2 = zzsb;
        }
        long zza2 = this.zza.zza();
        if (!zzci2.equals(this.zzg.zzn()) || i2 != this.zzg.zzf()) {
            z = false;
        }
        long j = 0;
        if (zzsb2 == null || !zzsb2.zzb()) {
            if (z) {
                j = this.zzg.zzk();
            } else if (!zzci.zzo()) {
                long j2 = zzci2.zze(i2, this.zzc, 0).zzm;
                j = zzeg.zzz(0);
            }
        } else if (z && this.zzg.zzd() == zzsb2.zzb && this.zzg.zze() == zzsb2.zzc) {
            j = this.zzg.zzl();
        }
        return new zzkj(zza2, zzci, i, zzsb2, j, this.zzg.zzn(), this.zzg.zzf(), this.zzd.zzb(), this.zzg.zzl(), this.zzg.zzm());
    }

    public final /* synthetic */ void zzX(zzcb zzcb, zzkl zzkl, zzy zzy) {
        zzkl.zzi(zzcb, new zzkk(zzy, this.zze));
    }

    public final void zzY(int i, long j, long j2) {
        zzkj zzaa = zzaa(this.zzd.zzc());
        zzZ(zzaa, Place.TYPE_FLOOR, new zzkw(zzaa, i, j, j2));
    }

    public final void zzZ(zzkj zzkj, int i, zzdj zzdj) {
        this.zze.put(i, zzkj);
        zzdm zzdm = this.zzf;
        zzdm.zzd(i, zzdj);
        zzdm.zzc();
    }

    public final void zza(zzbx zzbx) {
        zzkj zzU = zzU();
        zzZ(zzU, 13, new zzla(zzU, zzbx));
    }

    public final void zzaf(int i, zzsb zzsb, zzrx zzrx) {
        zzkj zzab = zzab(i, zzsb);
        zzZ(zzab, 1004, new zzku(zzab, zzrx));
    }

    public final void zzag(int i, zzsb zzsb, zzrs zzrs, zzrx zzrx) {
        zzkj zzab = zzab(i, zzsb);
        zzZ(zzab, 1002, new zzll(zzab, zzrs, zzrx));
    }

    public final void zzah(int i, zzsb zzsb, zzrs zzrs, zzrx zzrx) {
        zzkj zzab = zzab(i, zzsb);
        zzZ(zzab, 1001, new zzlv(zzab, zzrs, zzrx));
    }

    public final void zzai(int i, zzsb zzsb, zzrs zzrs, zzrx zzrx, IOException iOException, boolean z) {
        zzkj zzab = zzab(i, zzsb);
        zzZ(zzab, Place.TYPE_ADMINISTRATIVE_AREA_LEVEL_3, new zzlh(zzab, zzrs, zzrx, iOException, z));
    }

    public final void zzaj(int i, zzsb zzsb, zzrs zzrs, zzrx zzrx) {
        zzkj zzab = zzab(i, zzsb);
        zzZ(zzab, 1000, new zzlr(zzab, zzrs, zzrx));
    }

    public final void zzb(zzr zzr) {
        zzkj zzU = zzU();
        zzZ(zzU, 29, new zzlb(zzU, zzr));
    }

    public final void zzc(int i, boolean z) {
        zzkj zzU = zzU();
        zzZ(zzU, 30, new zzld(zzU, i, z));
    }

    public final void zzd(boolean z) {
        zzkj zzU = zzU();
        zzZ(zzU, 3, new zzmj(zzU, z));
    }

    public final void zze(boolean z) {
        zzkj zzU = zzU();
        zzZ(zzU, 7, new zzlq(zzU, z));
    }

    public final void zzf(zzbb zzbb, int i) {
        zzkj zzU = zzU();
        zzZ(zzU, 1, new zzlu(zzU, zzbb, i));
    }

    public final void zzg(zzbh zzbh) {
        zzkj zzU = zzU();
        zzZ(zzU, 14, new zzly(zzU, zzbh));
    }

    public final void zzh(boolean z, int i) {
        zzkj zzU = zzU();
        zzZ(zzU, 5, new zzlp(zzU, z, i));
    }

    public final void zzi(zzbt zzbt) {
        zzkj zzU = zzU();
        zzZ(zzU, 12, new zzkr(zzU, zzbt));
    }

    public final void zzj(int i) {
        zzkj zzU = zzU();
        zzZ(zzU, 4, new zzlt(zzU, i));
    }

    public final void zzk(int i) {
        zzkj zzU = zzU();
        zzZ(zzU, 6, new zzmi(zzU, i));
    }

    public final void zzl(zzbr zzbr) {
        zzkj zzae = zzae(zzbr);
        zzZ(zzae, 10, new zzlm(zzae, zzbr));
    }

    public final void zzm(zzbr zzbr) {
        zzkj zzae = zzae(zzbr);
        zzZ(zzae, 10, new zzlx(zzae, zzbr));
    }

    public final void zzn(boolean z, int i) {
        zzkj zzU = zzU();
        zzZ(zzU, -1, new zzkm(zzU, z, i));
    }

    public final void zzo(zzca zzca, zzca zzca2, int i) {
        if (i == 1) {
            this.zzi = false;
            i = 1;
        }
        zzml zzml = this.zzd;
        zzcb zzcb = this.zzg;
        zzcb.getClass();
        zzml.zzg(zzcb);
        zzkj zzU = zzU();
        zzZ(zzU, 11, new zzkz(zzU, i, zzca, zzca2));
    }

    public final void zzp() {
        zzkj zzU = zzU();
        zzZ(zzU, -1, new zzkt(zzU));
    }

    public final void zzq(boolean z) {
        zzkj zzad = zzad();
        zzZ(zzad, 23, new zzls(zzad, z));
    }

    public final void zzr(int i, int i2) {
        zzkj zzad = zzad();
        zzZ(zzad, 24, new zzmh(zzad, i, i2));
    }

    public final void zzs(zzci zzci, int i) {
        zzml zzml = this.zzd;
        zzcb zzcb = this.zzg;
        zzcb.getClass();
        zzml.zzi(zzcb);
        zzkj zzU = zzU();
        zzZ(zzU, 0, new zzli(zzU, i));
    }

    public final void zzt(zzct zzct) {
        zzkj zzU = zzU();
        zzZ(zzU, 2, new zzlw(zzU, zzct));
    }

    public final void zzu(zzcv zzcv) {
        zzkj zzad = zzad();
        zzZ(zzad, 25, new zzme(zzad, zzcv));
    }

    public final void zzv(float f) {
        zzkj zzad = zzad();
        zzZ(zzad, 22, new zzkq(zzad, f));
    }

    public final void zzw(zzkl zzkl) {
        this.zzf.zzb(zzkl);
    }

    public final void zzx() {
        if (!this.zzi) {
            zzkj zzU = zzU();
            this.zzi = true;
            zzZ(zzU, -1, new zzmd(zzU));
        }
    }

    public final void zzy(Exception exc) {
        zzkj zzad = zzad();
        zzZ(zzad, Place.TYPE_SYNTHETIC_GEOCODE, new zzlc(zzad, exc));
    }

    public final void zzz(String str, long j, long j2) {
        zzkj zzad = zzad();
        zzZ(zzad, Place.TYPE_INTERSECTION, new zzln(zzad, str, j2, j));
    }
}
