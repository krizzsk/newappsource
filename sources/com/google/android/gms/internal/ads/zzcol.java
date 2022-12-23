package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

final class zzcol extends zzett {
    private final zzevf zza;
    private final zzcrb zzb;
    private final zzcol zzc = this;
    private final zzgqh zzd;
    private final zzgqh zze;
    private final zzgqh zzf;
    private final zzgqh zzg;
    private final zzgqh zzh;
    private final zzgqh zzi;
    private final zzgqh zzj;
    private final zzgqh zzk;
    private final zzgqh zzl;
    private final zzgqh zzm;
    private final zzgqh zzn;
    private final zzgqh zzo;
    private final zzgqh zzp;
    private final zzgqh zzq;
    private final zzgqh zzr;
    private final zzgqh zzs;
    private final zzgqh zzt;
    private final zzgqh zzu;
    private final zzgqh zzv;
    private final zzgqh zzw;
    private final zzgqh zzx;
    private final zzgqh zzy;
    private final zzgqh zzz;

    public /* synthetic */ zzcol(zzcrb zzcrb, zzevf zzevf, zzcok zzcok) {
        zzevf zzevf2 = zzevf;
        this.zzb = zzcrb;
        this.zza = zzevf2;
        this.zzd = zzgpt.zzc(new zzfhr(zzcrb.zzF));
        zzevh zzevh = new zzevh(zzevf2);
        this.zze = zzevh;
        this.zzf = new zzets(zzcsg.zza, zzcrb.zzh, zzcrb.zzn, zzfez.zza(), zzevh);
        zzevg zzevg = new zzevg(zzevf2);
        this.zzg = zzevg;
        this.zzh = new zzeub(zzcnw.zza, zzcrb.zzh, zzevg, zzfez.zza());
        this.zzi = new zzeum(zzcsg.zza, zzevh, zzcrb.zzh, zzcrb.zzac, zzcrb.zzn, zzfez.zza(), zzevg);
        this.zzj = new zzeuq(zzcsa.zza, zzfez.zza(), zzcrb.zzh);
        this.zzk = new zzeux(zzcsc.zza, zzfez.zza(), zzevg);
        this.zzl = new zzeve(zzcse.zza, zzcrb.zzn, zzcrb.zzh);
        this.zzm = new zzevv(zzfez.zza());
        zzevi zzevi = new zzevi(zzevf2);
        this.zzn = zzevi;
        zzevg zzevg2 = zzevg;
        this.zzo = new zzevr(zzcrb.zzac, zzevi, zzcsi.zza, zzfez.zza(), zzevg2, zzcrb.zzn);
        this.zzp = new zzeug(zzevg2, zzcry.zza, zzcrb.zzac, zzcrb.zzn, zzfez.zza());
        zzevj zzevj = new zzevj(zzevf2);
        this.zzq = zzevj;
        zzgqh zzc2 = zzgpt.zzc(zzdvf.zza());
        this.zzr = zzc2;
        zzgqh zzc3 = zzgpt.zzc(zzdvd.zza());
        this.zzs = zzc3;
        zzgqh zzc4 = zzgpt.zzc(zzdvh.zza());
        this.zzt = zzc4;
        zzgqh zzc5 = zzgpt.zzc(zzdvj.zza());
        this.zzu = zzc5;
        zzgpx zzc6 = zzgpy.zzc(4);
        zzc6.zzb(zzffy.GMS_SIGNALS, zzc2);
        zzc6.zzb(zzffy.BUILD_URL, zzc3);
        zzc6.zzb(zzffy.HTTP, zzc4);
        zzc6.zzb(zzffy.PRE_PROCESS, zzc5);
        zzgpy zzc7 = zzc6.zzc();
        this.zzv = zzc7;
        zzgqh zzc8 = zzgpt.zzc(new zzdvk(zzevj, zzcrb.zzh, zzfez.zza(), zzc7));
        this.zzw = zzc8;
        zzgqe zza2 = zzgqf.zza(0, 1);
        zza2.zza(zzc8);
        zzgqf zzc9 = zza2.zzc();
        this.zzx = zzc9;
        zzfgh zzfgh = new zzfgh(zzc9);
        this.zzy = zzfgh;
        this.zzz = zzgpt.zzc(new zzfgg(zzfez.zza(), zzcrb.zzn, zzfgh));
    }

    private final zzetw zze() {
        zzcei zzcei = new zzcei();
        zzfvk zzfvk = zzcfv.zza;
        zzgqc.zzb(zzfvk);
        String zzd2 = this.zza.zzd();
        zzgqc.zzb(zzd2);
        return new zzetw(zzcei, zzfvk, zzd2, this.zza.zzb(), this.zza.zza(), (byte[]) null);
    }

    private final zzeuz zzf() {
        zzbhj zzbhj = new zzbhj();
        zzfvk zzfvk = zzcfv.zza;
        zzgqc.zzb(zzfvk);
        List zzf2 = this.zza.zzf();
        zzgqc.zzb(zzf2);
        return new zzeuz(zzbhj, zzfvk, zzf2, (byte[]) null);
    }

    public final zzete zza() {
        Context zza2 = this.zzb.zza.zza();
        Context context = zza2;
        zzgqc.zzb(zza2);
        zzcef zzcef = r1;
        zzcef zzcef2 = new zzcef();
        zzceg zzceg = r1;
        zzceg zzceg2 = new zzceg();
        Object zzb2 = this.zzb.zzaA.zzb();
        zzetw zze2 = zze();
        zzeuz zzf2 = zzf();
        zzgpo zza3 = zzgpt.zza(this.zzf);
        zzgpo zza4 = zzgpt.zza(this.zzh);
        zzgpo zza5 = zzgpt.zza(this.zzi);
        zzgpo zza6 = zzgpt.zza(this.zzj);
        zzgpo zza7 = zzgpt.zza(this.zzk);
        zzgpo zza8 = zzgpt.zza(this.zzl);
        zzgpo zza9 = zzgpt.zza(this.zzm);
        zzgpo zza10 = zzgpt.zza(this.zzo);
        zzgpo zza11 = zzgpt.zza(this.zzp);
        zzfvk zzfvk = zzcfv.zza;
        zzgqc.zzb(zzfvk);
        return zzevm.zza(context, zzcef, zzceg, zzb2, zze2, zzf2, zza3, zza4, zza5, zza6, zza7, zza8, zza9, zza10, zza11, zzfvk, (zzfhq) this.zzd.zzb(), (zzdwg) this.zzb.zzV.zzb());
    }

    public final zzete zzb() {
        zzete zzete;
        Context zza2 = this.zzb.zza.zza();
        zzgqc.zzb(zza2);
        zzfvk zzfvk = zzcfv.zza;
        zzgqc.zzb(zzfvk);
        zzcef zzcef = new zzcef();
        zzgqc.zzb(zzfvk);
        String zzc2 = this.zza.zzc();
        zzgqc.zzb(zzc2);
        zzerm zzerm = new zzerm(new zzeuv(zzcef, zzfvk, zzc2, (byte[]) null), 0, (ScheduledExecutorService) this.zzb.zzn.zzb());
        Context zza3 = this.zzb.zza.zza();
        zzgqc.zzb(zza3);
        zzerm zzerm2 = new zzerm(new zzevc(new zzbxy(), (ScheduledExecutorService) this.zzb.zzn.zzb(), zza3, (byte[]) null), ((Long) zzay.zzc().zzb(zzbhy.zzde)).longValue(), (ScheduledExecutorService) this.zzb.zzn.zzb());
        zzcei zzcei = new zzcei();
        Context zza4 = this.zzb.zza.zza();
        zzgqc.zzb(zza4);
        zzgqc.zzb(zzfvk);
        zzerm zzerm3 = new zzerm(new zzetq(zzcei, zza4, (ScheduledExecutorService) this.zzb.zzn.zzb(), zzfvk, this.zza.zza(), (byte[]) null), 0, (ScheduledExecutorService) this.zzb.zzn.zzb());
        zzgqc.zzb(zzfvk);
        zzerm zzerm4 = new zzerm(new zzevt(zzfvk), 0, (ScheduledExecutorService) this.zzb.zzn.zzb());
        zzevk zzevk = zzevk.zza;
        Context zza5 = this.zzb.zza.zza();
        zzgqc.zzb(zza5);
        String zzc3 = this.zza.zzc();
        zzgqc.zzb(zzc3);
        zzgqc.zzb(zzfvk);
        zzetz zzetz = new zzetz((zzbzw) null, zza5, zzc3, zzfvk);
        zzbda zzbda = new zzbda();
        zzgqc.zzb(zzfvk);
        Context zza6 = this.zzb.zza.zza();
        zzgqc.zzb(zza6);
        zzcei zzcei2 = new zzcei();
        int zza7 = this.zza.zza();
        Context zza8 = this.zzb.zza.zza();
        zzgqc.zzb(zza8);
        zzgqc.zzb(zzfvk);
        String zzc4 = this.zza.zzc();
        zzgqc.zzb(zzc4);
        zzerm zzerm5 = zzerm3;
        String zzc5 = this.zza.zzc();
        zzgqc.zzb(zzc5);
        zzgqc.zzb(zzfvk);
        new zzete(zza2, zzfvk, zzfrm.zzm(zzerm, zzerm2, zzerm5, zzerm4, zzevk, zzetz, new zzeuo(zzbda, zzfvk, zza6, (byte[]) null), zzf(), zze(), new zzeuk(zzcei2, zza7, zza8, (zzcer) this.zzb.zzac.zzb(), (ScheduledExecutorService) this.zzb.zzn.zzb(), zzfvk, zzc4, (byte[]) null), (zzetb) this.zzb.zzaA.zzb(), zzeug.zza(zzc5, new zzbco(), (zzcer) this.zzb.zzac.zzb(), (ScheduledExecutorService) this.zzb.zzn.zzb(), zzfvk)), (zzfhq) this.zzd.zzb(), (zzdwg) this.zzb.zzV.zzb());
        return zzete;
    }

    public final zzfge zzc() {
        return (zzfge) this.zzz.zzb();
    }

    public final zzfhq zzd() {
        return (zzfhq) this.zzd.zzb();
    }
}
