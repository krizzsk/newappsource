package com.google.android.gms.internal.p986firebaseauthapi;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.firebase.auth.PhoneAuthCredential;
import p743qd.C19107d;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwd */
public final class zzwd {
    private static final Logger zza = new Logger("FirebaseAuth", "FirebaseAuthFallback:");
    private final zzuh zzb;
    private final zzxx zzc;

    public zzwd(C19107d dVar) {
        Preconditions.checkNotNull(dVar);
        dVar.mo51535a();
        Context context = dVar.f48568a;
        Preconditions.checkNotNull(context);
        this.zzb = new zzuh(new zzwr(dVar, zzwq.zza(), (zzxo) null, (zzwl) null, (zzwm) null));
        this.zzc = new zzxx(context);
    }

    private static boolean zzG(long j, boolean z) {
        if (j > 0 && z) {
            return true;
        }
        zza.mo65859w("App hash will not be appended to the request.", new Object[0]);
        return false;
    }

    public final void zzA(zzsa zzsa, zzwb zzwb) {
        Preconditions.checkNotNull(zzsa);
        Preconditions.checkNotNull(zzwb);
        String str = zzsa.zzb().f36408e;
        zzwc zzwc = new zzwc(zzwb, zza);
        if (this.zzc.zzl(str)) {
            if (zzsa.zzg()) {
                this.zzc.zzj(str);
            } else {
                this.zzc.zzi(zzwc, str);
                return;
            }
        }
        long zza2 = zzsa.zza();
        boolean zzh = zzsa.zzh();
        zzzw zzb2 = zzzw.zzb(zzsa.zzd(), zzsa.zzb().f36405b, zzsa.zzb().f36408e, zzsa.zzc(), zzsa.zze(), zzsa.zzf());
        if (zzG(zza2, zzh)) {
            zzb2.zzd(new zzyc(this.zzc.zzc()));
        }
        this.zzc.zzk(str, zzwc, zza2, zzh);
        this.zzb.zzG(zzb2, new zzxu(this.zzc, zzwc, str));
    }

    public final void zzB(zzsc zzsc, zzwb zzwb) {
        Preconditions.checkNotNull(zzsc);
        Preconditions.checkNotNull(zzwb);
        this.zzb.zzH(zzsc.zza(), zzsc.zzb(), new zzwc(zzwb, zza));
    }

    public final void zzC(zzse zzse, zzwb zzwb) {
        Preconditions.checkNotNull(zzse);
        Preconditions.checkNotEmpty(zzse.zza());
        Preconditions.checkNotNull(zzwb);
        this.zzb.zzI(zzse.zza(), new zzwc(zzwb, zza));
    }

    public final void zzD(zzsg zzsg, zzwb zzwb) {
        Preconditions.checkNotNull(zzsg);
        Preconditions.checkNotEmpty(zzsg.zzb());
        Preconditions.checkNotEmpty(zzsg.zza());
        Preconditions.checkNotNull(zzwb);
        this.zzb.zzJ(zzsg.zzb(), zzsg.zza(), new zzwc(zzwb, zza));
    }

    public final void zzE(zzsi zzsi, zzwb zzwb) {
        Preconditions.checkNotNull(zzsi);
        Preconditions.checkNotEmpty(zzsi.zzb());
        Preconditions.checkNotNull(zzsi.zza());
        Preconditions.checkNotNull(zzwb);
        this.zzb.zzK(zzsi.zzb(), zzsi.zza(), new zzwc(zzwb, zza));
    }

    public final void zzF(zzsk zzsk, zzwb zzwb) {
        Preconditions.checkNotNull(zzsk);
        this.zzb.zzL(zzyx.zzc(zzsk.zza(), zzsk.zzb(), zzsk.zzc()), new zzwc(zzwb, zza));
    }

    public final void zza(zzqa zzqa, zzwb zzwb) {
        Preconditions.checkNotNull(zzqa);
        Preconditions.checkNotEmpty(zzqa.zza());
        Preconditions.checkNotNull(zzwb);
        this.zzb.zzg(zzqa.zza(), zzqa.zzb(), new zzwc(zzwb, zza));
    }

    public final void zzb(zzqc zzqc, zzwb zzwb) {
        Preconditions.checkNotNull(zzqc);
        Preconditions.checkNotEmpty(zzqc.zza());
        Preconditions.checkNotEmpty(zzqc.zzb());
        Preconditions.checkNotNull(zzwb);
        this.zzb.zzh(zzqc.zza(), zzqc.zzb(), new zzwc(zzwb, zza));
    }

    public final void zzc(zzqe zzqe, zzwb zzwb) {
        Preconditions.checkNotNull(zzqe);
        Preconditions.checkNotEmpty(zzqe.zza());
        Preconditions.checkNotEmpty(zzqe.zzb());
        Preconditions.checkNotNull(zzwb);
        this.zzb.zzi(zzqe.zza(), zzqe.zzb(), new zzwc(zzwb, zza));
    }

    public final void zzd(zzqg zzqg, zzwb zzwb) {
        Preconditions.checkNotNull(zzqg);
        Preconditions.checkNotEmpty(zzqg.zza());
        Preconditions.checkNotNull(zzwb);
        this.zzb.zzj(zzqg.zza(), zzqg.zzb(), new zzwc(zzwb, zza));
    }

    public final void zze(zzqi zzqi, zzwb zzwb) {
        Preconditions.checkNotNull(zzqi);
        Preconditions.checkNotEmpty(zzqi.zza());
        Preconditions.checkNotEmpty(zzqi.zzb());
        Preconditions.checkNotNull(zzwb);
        this.zzb.zzk(zzqi.zza(), zzqi.zzb(), zzqi.zzc(), new zzwc(zzwb, zza));
    }

    public final void zzf(zzqk zzqk, zzwb zzwb) {
        Preconditions.checkNotNull(zzqk);
        Preconditions.checkNotEmpty(zzqk.zza());
        Preconditions.checkNotEmpty(zzqk.zzb());
        Preconditions.checkNotNull(zzwb);
        this.zzb.zzl(zzqk.zza(), zzqk.zzb(), zzqk.zzc(), new zzwc(zzwb, zza));
    }

    public final void zzg(zzqm zzqm, zzwb zzwb) {
        Preconditions.checkNotNull(zzqm);
        Preconditions.checkNotEmpty(zzqm.zza());
        Preconditions.checkNotNull(zzwb);
        this.zzb.zzm(zzqm.zza(), new zzwc(zzwb, zza));
    }

    public final void zzh(zzqo zzqo, zzwb zzwb) {
        Preconditions.checkNotNull(zzqo);
        Preconditions.checkNotNull(zzwb);
        this.zzb.zzn(zzyk.zzb(zzqo.zzb(), (String) Preconditions.checkNotNull(zzqo.zza().f36398b), (String) Preconditions.checkNotNull(zzqo.zza().f36399c), zzqo.zzc()), zzqo.zzb(), new zzwc(zzwb, zza));
    }

    public final void zzi(zzqq zzqq, zzwb zzwb) {
        Preconditions.checkNotNull(zzqq);
        Preconditions.checkNotNull(zzwb);
        this.zzb.zzo(zzym.zzb(zzqq.zzb(), (String) Preconditions.checkNotNull(zzqq.zza().f36398b), (String) Preconditions.checkNotNull(zzqq.zza().f36399c)), new zzwc(zzwb, zza));
    }

    public final void zzj(zzqs zzqs, zzwb zzwb) {
        Preconditions.checkNotNull(zzqs);
        Preconditions.checkNotNull(zzwb);
        Preconditions.checkNotEmpty(zzqs.zza());
        this.zzb.zzp(zzqs.zza(), new zzwc(zzwb, zza));
    }

    public final void zzk(zzqu zzqu, zzwb zzwb) {
        Preconditions.checkNotNull(zzqu);
        Preconditions.checkNotEmpty(zzqu.zza());
        this.zzb.zzq(zzqu.zza(), zzqu.zzb(), new zzwc(zzwb, zza));
    }

    public final void zzl(zzqw zzqw, zzwb zzwb) {
        Preconditions.checkNotNull(zzqw);
        Preconditions.checkNotEmpty(zzqw.zzb());
        Preconditions.checkNotEmpty(zzqw.zzc());
        Preconditions.checkNotEmpty(zzqw.zza());
        Preconditions.checkNotNull(zzwb);
        this.zzb.zzr(zzqw.zzb(), zzqw.zzc(), zzqw.zza(), new zzwc(zzwb, zza));
    }

    public final void zzm(zzqy zzqy, zzwb zzwb) {
        Preconditions.checkNotNull(zzqy);
        Preconditions.checkNotEmpty(zzqy.zzb());
        Preconditions.checkNotNull(zzqy.zza());
        Preconditions.checkNotNull(zzwb);
        this.zzb.zzs(zzqy.zzb(), zzqy.zza(), new zzwc(zzwb, zza));
    }

    public final void zzn(zzra zzra, zzwb zzwb) {
        Preconditions.checkNotNull(zzwb);
        Preconditions.checkNotNull(zzra);
        this.zzb.zzt(Preconditions.checkNotEmpty(zzra.zzb()), zzxn.zza((PhoneAuthCredential) Preconditions.checkNotNull(zzra.zza())), new zzwc(zzwb, zza));
    }

    public final void zzo(zzrc zzrc, zzwb zzwb) {
        Preconditions.checkNotNull(zzrc);
        Preconditions.checkNotEmpty(zzrc.zza());
        Preconditions.checkNotNull(zzwb);
        this.zzb.zzu(zzrc.zza(), new zzwc(zzwb, zza));
    }

    public final void zzp(zzre zzre, zzwb zzwb) {
        Preconditions.checkNotNull(zzre);
        Preconditions.checkNotEmpty(zzre.zzb());
        Preconditions.checkNotNull(zzwb);
        this.zzb.zzv(zzre.zzb(), zzre.zza(), new zzwc(zzwb, zza));
    }

    public final void zzq(zzrg zzrg, zzwb zzwb) {
        Preconditions.checkNotNull(zzrg);
        Preconditions.checkNotEmpty(zzrg.zzb());
        Preconditions.checkNotNull(zzwb);
        this.zzb.zzw(zzrg.zzb(), zzrg.zza(), zzrg.zzc(), new zzwc(zzwb, zza));
    }

    public final void zzr(zzri zzri, zzwb zzwb) {
        Preconditions.checkNotNull(zzwb);
        Preconditions.checkNotNull(zzri);
        zzzn zzzn = (zzzn) Preconditions.checkNotNull(zzri.zza());
        String zzd = zzzn.zzd();
        zzwc zzwc = new zzwc(zzwb, zza);
        if (this.zzc.zzl(zzd)) {
            if (zzzn.zzf()) {
                this.zzc.zzj(zzd);
            } else {
                this.zzc.zzi(zzwc, zzd);
                return;
            }
        }
        long zzb2 = zzzn.zzb();
        boolean zzg = zzzn.zzg();
        if (zzG(zzb2, zzg)) {
            zzzn.zze(new zzyc(this.zzc.zzc()));
        }
        this.zzc.zzk(zzd, zzwc, zzb2, zzg);
        this.zzb.zzx(zzzn, new zzxu(this.zzc, zzwc, zzd));
    }

    public final void zzs(zzrk zzrk, zzwb zzwb) {
        Preconditions.checkNotNull(zzrk);
        Preconditions.checkNotNull(zzwb);
        this.zzb.zzy(zzrk.zza(), new zzwc(zzwb, zza));
    }

    public final void zzt(zzrm zzrm, zzwb zzwb) {
        Preconditions.checkNotNull(zzrm);
        Preconditions.checkNotNull(zzwb);
        this.zzb.zzz(zzrm.zza(), new zzwc(zzwb, zza));
    }

    public final void zzu(zzro zzro, zzwb zzwb) {
        Preconditions.checkNotNull(zzro);
        Preconditions.checkNotNull(zzro.zza());
        Preconditions.checkNotNull(zzwb);
        this.zzb.zzA(zzro.zza(), new zzwc(zzwb, zza));
    }

    public final void zzv(zzrq zzrq, zzwb zzwb) {
        Preconditions.checkNotNull(zzrq);
        Preconditions.checkNotEmpty(zzrq.zzb());
        Preconditions.checkNotNull(zzwb);
        this.zzb.zzB(new zzaad(zzrq.zzb(), zzrq.zza()), new zzwc(zzwb, zza));
    }

    public final void zzw(zzrs zzrs, zzwb zzwb) {
        Preconditions.checkNotNull(zzrs);
        Preconditions.checkNotEmpty(zzrs.zza());
        Preconditions.checkNotEmpty(zzrs.zzb());
        Preconditions.checkNotNull(zzwb);
        this.zzb.zzC(zzrs.zza(), zzrs.zzb(), zzrs.zzc(), new zzwc(zzwb, zza));
    }

    public final void zzx(zzru zzru, zzwb zzwb) {
        Preconditions.checkNotNull(zzru);
        Preconditions.checkNotNull(zzru.zza());
        Preconditions.checkNotNull(zzwb);
        this.zzb.zzD(zzru.zza(), new zzwc(zzwb, zza));
    }

    public final void zzy(zzrw zzrw, zzwb zzwb) {
        Preconditions.checkNotNull(zzwb);
        Preconditions.checkNotNull(zzrw);
        this.zzb.zzE(zzxn.zza((PhoneAuthCredential) Preconditions.checkNotNull(zzrw.zza())), new zzwc(zzwb, zza));
    }

    public final void zzz(zzry zzry, zzwb zzwb) {
        Preconditions.checkNotNull(zzry);
        Preconditions.checkNotNull(zzwb);
        String zzd = zzry.zzd();
        zzwc zzwc = new zzwc(zzwb, zza);
        if (this.zzc.zzl(zzd)) {
            if (zzry.zzg()) {
                this.zzc.zzj(zzd);
            } else {
                this.zzc.zzi(zzwc, zzd);
                return;
            }
        }
        long zza2 = zzry.zza();
        boolean zzh = zzry.zzh();
        zzzu zzb2 = zzzu.zzb(zzry.zzb(), zzry.zzd(), zzry.zzc(), zzry.zze(), zzry.zzf());
        if (zzG(zza2, zzh)) {
            zzb2.zzd(new zzyc(this.zzc.zzc()));
        }
        this.zzc.zzk(zzd, zzwc, zza2, zzh);
        this.zzb.zzF(zzb2, new zzxu(this.zzc, zzwc, zzd));
    }
}
