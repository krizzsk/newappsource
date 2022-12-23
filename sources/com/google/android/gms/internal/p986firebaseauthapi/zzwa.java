package com.google.android.gms.internal.p986firebaseauthapi;

import android.app.Activity;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.auth.internal.zzag;
import com.google.firebase.auth.internal.zzt;
import com.google.firebase.auth.internal.zzx;
import com.google.firebase.auth.internal.zzz;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import p357ae.C13416c;
import p357ae.C13417d;
import p382be.C13601i;
import p382be.C13612t;
import p382be.C13616x;
import p583jk.C17884p;
import p743qd.C19107d;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwa */
public final class zzwa extends zzxg {
    public zzwa(C19107d dVar) {
        this.zza = new zzwd(dVar);
        this.zzb = Executors.newCachedThreadPool();
    }

    @VisibleForTesting
    public static zzx zzN(C19107d dVar, zzyt zzyt) {
        Preconditions.checkNotNull(dVar);
        Preconditions.checkNotNull(zzyt);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new zzt(zzyt));
        List zzr = zzyt.zzr();
        if (zzr != null && !zzr.isEmpty()) {
            for (int i = 0; i < zzr.size(); i++) {
                arrayList.add(new zzt((zzzg) zzr.get(i)));
            }
        }
        zzx zzx = new zzx(dVar, arrayList);
        zzx.f36458j = new zzz(zzyt.zzb(), zzyt.zza());
        zzx.f36459k = zzyt.zzt();
        zzx.f36460l = zzyt.zzd();
        zzx.mo43289s2(C17884p.m44367f0(zzyt.zzq()));
        return zzx;
    }

    public final Task zzA(C19107d dVar, String str, String str2, String str3, C13616x xVar) {
        zzvl zzvl = new zzvl(str, str2, str3);
        zzvl.zzf(dVar);
        zzvl.zzd(xVar);
        return zzP(zzvl);
    }

    public final Task zzB(C19107d dVar, EmailAuthCredential emailAuthCredential, C13616x xVar) {
        zzvm zzvm = new zzvm(emailAuthCredential);
        zzvm.zzf(dVar);
        zzvm.zzd(xVar);
        return zzP(zzvm);
    }

    public final Task zzC(C19107d dVar, PhoneAuthCredential phoneAuthCredential, String str, C13616x xVar) {
        zzxr.zzc();
        zzvn zzvn = new zzvn(phoneAuthCredential, str);
        zzvn.zzf(dVar);
        zzvn.zzd(xVar);
        return zzP(zzvn);
    }

    public final Task zzD(zzag zzag, String str, String str2, long j, boolean z, boolean z2, String str3, String str4, boolean z3, C13416c cVar, Executor executor, Activity activity) {
        zzvo zzvo = new zzvo(zzag, str, str2, j, z, z2, str3, str4, z3);
        String str5 = str;
        zzvo.zzh(cVar, activity, executor, str);
        return zzP(zzvo);
    }

    public final Task zzE(zzag zzag, PhoneMultiFactorInfo phoneMultiFactorInfo, String str, long j, boolean z, boolean z2, String str2, String str3, boolean z3, C13416c cVar, Executor executor, Activity activity) {
        zzvp zzvp = new zzvp(phoneMultiFactorInfo, Preconditions.checkNotEmpty(zzag.f36433c), str, j, z, z2, str2, str3, z3);
        Activity activity2 = activity;
        zzvp.zzh(cVar, activity2, executor, phoneMultiFactorInfo.f36405b);
        return zzP(zzvp);
    }

    public final Task zzF(C19107d dVar, FirebaseUser firebaseUser, String str, C13612t tVar) {
        zzvq zzvq = new zzvq(firebaseUser.zzf(), str);
        zzvq.zzf(dVar);
        zzvq.zzg(firebaseUser);
        zzvq.zzd(tVar);
        zzvq.zze(tVar);
        return zzP(zzvq);
    }

    public final Task zzG(C19107d dVar, FirebaseUser firebaseUser, String str, C13612t tVar) {
        char c;
        Preconditions.checkNotNull(dVar);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(firebaseUser);
        Preconditions.checkNotNull(tVar);
        List zzg = firebaseUser.zzg();
        if ((zzg != null && !zzg.contains(str)) || firebaseUser.mo43283m2()) {
            return Tasks.forException(zzwe.zza(new Status(17016, str)));
        }
        if (str.hashCode() == 1216985755 && str.equals("password")) {
            c = 0;
        } else {
            c = 65535;
        }
        if (c != 0) {
            zzvs zzvs = new zzvs(str);
            zzvs.zzf(dVar);
            zzvs.zzg(firebaseUser);
            zzvs.zzd(tVar);
            zzvs.zze(tVar);
            return zzP(zzvs);
        }
        zzvr zzvr = new zzvr();
        zzvr.zzf(dVar);
        zzvr.zzg(firebaseUser);
        zzvr.zzd(tVar);
        zzvr.zze(tVar);
        return zzP(zzvr);
    }

    public final Task zzH(C19107d dVar, FirebaseUser firebaseUser, String str, C13612t tVar) {
        zzvt zzvt = new zzvt(str);
        zzvt.zzf(dVar);
        zzvt.zzg(firebaseUser);
        zzvt.zzd(tVar);
        zzvt.zze(tVar);
        return zzP(zzvt);
    }

    public final Task zzI(C19107d dVar, FirebaseUser firebaseUser, String str, C13612t tVar) {
        zzvu zzvu = new zzvu(str);
        zzvu.zzf(dVar);
        zzvu.zzg(firebaseUser);
        zzvu.zzd(tVar);
        zzvu.zze(tVar);
        return zzP(zzvu);
    }

    public final Task zzJ(C19107d dVar, FirebaseUser firebaseUser, PhoneAuthCredential phoneAuthCredential, C13612t tVar) {
        zzxr.zzc();
        zzvv zzvv = new zzvv(phoneAuthCredential);
        zzvv.zzf(dVar);
        zzvv.zzg(firebaseUser);
        zzvv.zzd(tVar);
        zzvv.zze(tVar);
        return zzP(zzvv);
    }

    public final Task zzK(C19107d dVar, FirebaseUser firebaseUser, UserProfileChangeRequest userProfileChangeRequest, C13612t tVar) {
        zzvw zzvw = new zzvw(userProfileChangeRequest);
        zzvw.zzf(dVar);
        zzvw.zzg(firebaseUser);
        zzvw.zzd(tVar);
        zzvw.zze(tVar);
        return zzP(zzvw);
    }

    public final Task zzL(String str, String str2, ActionCodeSettings actionCodeSettings) {
        actionCodeSettings.f36373j = 7;
        return zzP(new zzvx(str, str2, actionCodeSettings));
    }

    public final Task zzM(C19107d dVar, String str, String str2) {
        zzvy zzvy = new zzvy(str, str2);
        zzvy.zzf(dVar);
        return zzP(zzvy);
    }

    public final void zzO(C19107d dVar, zzzn zzzn, C13416c cVar, Activity activity, Executor executor) {
        zzvz zzvz = new zzvz(zzzn);
        zzvz.zzf(dVar);
        zzvz.zzh(cVar, activity, executor, zzzn.zzd());
        zzP(zzvz);
    }

    public final Task zza(C19107d dVar, String str, String str2) {
        zzuj zzuj = new zzuj(str, str2);
        zzuj.zzf(dVar);
        return zzP(zzuj);
    }

    public final Task zzb(C19107d dVar, String str, String str2) {
        zzuk zzuk = new zzuk(str, str2);
        zzuk.zzf(dVar);
        return zzP(zzuk);
    }

    public final Task zzc(C19107d dVar, String str, String str2, String str3) {
        zzul zzul = new zzul(str, str2, str3);
        zzul.zzf(dVar);
        return zzP(zzul);
    }

    public final Task zzd(C19107d dVar, String str, String str2, String str3, C13616x xVar) {
        zzum zzum = new zzum(str, str2, str3);
        zzum.zzf(dVar);
        zzum.zzd(xVar);
        return zzP(zzum);
    }

    public final Task zze(FirebaseUser firebaseUser, C13601i iVar) {
        zzun zzun = new zzun();
        zzun.zzg(firebaseUser);
        zzun.zzd(iVar);
        zzun.zze(iVar);
        return zzP(zzun);
    }

    public final Task zzf(C19107d dVar, String str, String str2) {
        zzuo zzuo = new zzuo(str, str2);
        zzuo.zzf(dVar);
        return zzP(zzuo);
    }

    public final Task zzg(C19107d dVar, C13417d dVar2, FirebaseUser firebaseUser, String str, C13616x xVar) {
        zzxr.zzc();
        zzup zzup = new zzup(dVar2, firebaseUser.zzf(), str);
        zzup.zzf(dVar);
        zzup.zzd(xVar);
        return zzP(zzup);
    }

    public final Task zzh(C19107d dVar, FirebaseUser firebaseUser, C13417d dVar2, String str, C13616x xVar) {
        zzxr.zzc();
        zzuq zzuq = new zzuq(dVar2, str);
        zzuq.zzf(dVar);
        zzuq.zzd(xVar);
        if (firebaseUser != null) {
            zzuq.zzg(firebaseUser);
        }
        return zzP(zzuq);
    }

    public final Task zzi(C19107d dVar, FirebaseUser firebaseUser, String str, C13612t tVar) {
        zzur zzur = new zzur(str);
        zzur.zzf(dVar);
        zzur.zzg(firebaseUser);
        zzur.zzd(tVar);
        zzur.zze(tVar);
        return zzP(zzur);
    }

    public final Task zzj(C19107d dVar, FirebaseUser firebaseUser, AuthCredential authCredential, C13612t tVar) {
        Preconditions.checkNotNull(dVar);
        Preconditions.checkNotNull(authCredential);
        Preconditions.checkNotNull(firebaseUser);
        Preconditions.checkNotNull(tVar);
        List zzg = firebaseUser.zzg();
        if (zzg != null && zzg.contains(authCredential.mo43266i2())) {
            return Tasks.forException(zzwe.zza(new Status(17015)));
        }
        if (authCredential instanceof EmailAuthCredential) {
            EmailAuthCredential emailAuthCredential = (EmailAuthCredential) authCredential;
            if (!(!TextUtils.isEmpty(emailAuthCredential.f36377d))) {
                zzus zzus = new zzus(emailAuthCredential);
                zzus.zzf(dVar);
                zzus.zzg(firebaseUser);
                zzus.zzd(tVar);
                zzus.zze(tVar);
                return zzP(zzus);
            }
            zzuv zzuv = new zzuv(emailAuthCredential);
            zzuv.zzf(dVar);
            zzuv.zzg(firebaseUser);
            zzuv.zzd(tVar);
            zzuv.zze(tVar);
            return zzP(zzuv);
        } else if (authCredential instanceof PhoneAuthCredential) {
            zzxr.zzc();
            zzuu zzuu = new zzuu((PhoneAuthCredential) authCredential);
            zzuu.zzf(dVar);
            zzuu.zzg(firebaseUser);
            zzuu.zzd(tVar);
            zzuu.zze(tVar);
            return zzP(zzuu);
        } else {
            Preconditions.checkNotNull(dVar);
            Preconditions.checkNotNull(authCredential);
            Preconditions.checkNotNull(firebaseUser);
            Preconditions.checkNotNull(tVar);
            zzut zzut = new zzut(authCredential);
            zzut.zzf(dVar);
            zzut.zzg(firebaseUser);
            zzut.zzd(tVar);
            zzut.zze(tVar);
            return zzP(zzut);
        }
    }

    public final Task zzk(C19107d dVar, FirebaseUser firebaseUser, AuthCredential authCredential, String str, C13612t tVar) {
        zzuw zzuw = new zzuw(authCredential, str);
        zzuw.zzf(dVar);
        zzuw.zzg(firebaseUser);
        zzuw.zzd(tVar);
        zzuw.zze(tVar);
        return zzP(zzuw);
    }

    public final Task zzl(C19107d dVar, FirebaseUser firebaseUser, AuthCredential authCredential, String str, C13612t tVar) {
        zzux zzux = new zzux(authCredential, str);
        zzux.zzf(dVar);
        zzux.zzg(firebaseUser);
        zzux.zzd(tVar);
        zzux.zze(tVar);
        return zzP(zzux);
    }

    public final Task zzm(C19107d dVar, FirebaseUser firebaseUser, EmailAuthCredential emailAuthCredential, C13612t tVar) {
        zzuy zzuy = new zzuy(emailAuthCredential);
        zzuy.zzf(dVar);
        zzuy.zzg(firebaseUser);
        zzuy.zzd(tVar);
        zzuy.zze(tVar);
        return zzP(zzuy);
    }

    public final Task zzn(C19107d dVar, FirebaseUser firebaseUser, EmailAuthCredential emailAuthCredential, C13612t tVar) {
        zzuz zzuz = new zzuz(emailAuthCredential);
        zzuz.zzf(dVar);
        zzuz.zzg(firebaseUser);
        zzuz.zzd(tVar);
        zzuz.zze(tVar);
        return zzP(zzuz);
    }

    public final Task zzo(C19107d dVar, FirebaseUser firebaseUser, String str, String str2, String str3, C13612t tVar) {
        zzva zzva = new zzva(str, str2, str3);
        zzva.zzf(dVar);
        zzva.zzg(firebaseUser);
        zzva.zzd(tVar);
        zzva.zze(tVar);
        return zzP(zzva);
    }

    public final Task zzp(C19107d dVar, FirebaseUser firebaseUser, String str, String str2, String str3, C13612t tVar) {
        zzvb zzvb = new zzvb(str, str2, str3);
        zzvb.zzf(dVar);
        zzvb.zzg(firebaseUser);
        zzvb.zzd(tVar);
        zzvb.zze(tVar);
        return zzP(zzvb);
    }

    public final Task zzq(C19107d dVar, FirebaseUser firebaseUser, PhoneAuthCredential phoneAuthCredential, String str, C13612t tVar) {
        zzxr.zzc();
        zzvc zzvc = new zzvc(phoneAuthCredential, str);
        zzvc.zzf(dVar);
        zzvc.zzg(firebaseUser);
        zzvc.zzd(tVar);
        zzvc.zze(tVar);
        return zzP(zzvc);
    }

    public final Task zzr(C19107d dVar, FirebaseUser firebaseUser, PhoneAuthCredential phoneAuthCredential, String str, C13612t tVar) {
        zzxr.zzc();
        zzvd zzvd = new zzvd(phoneAuthCredential, str);
        zzvd.zzf(dVar);
        zzvd.zzg(firebaseUser);
        zzvd.zzd(tVar);
        zzvd.zze(tVar);
        return zzP(zzvd);
    }

    public final Task zzs(C19107d dVar, FirebaseUser firebaseUser, C13612t tVar) {
        zzve zzve = new zzve();
        zzve.zzf(dVar);
        zzve.zzg(firebaseUser);
        zzve.zzd(tVar);
        zzve.zze(tVar);
        return zzP(zzve);
    }

    public final Task zzt(C19107d dVar, ActionCodeSettings actionCodeSettings, String str) {
        zzvf zzvf = new zzvf(str, actionCodeSettings);
        zzvf.zzf(dVar);
        return zzP(zzvf);
    }

    public final Task zzu(C19107d dVar, String str, ActionCodeSettings actionCodeSettings, String str2) {
        actionCodeSettings.f36373j = 1;
        zzvg zzvg = new zzvg(str, actionCodeSettings, str2, "sendPasswordResetEmail");
        zzvg.zzf(dVar);
        return zzP(zzvg);
    }

    public final Task zzv(C19107d dVar, String str, ActionCodeSettings actionCodeSettings, String str2) {
        actionCodeSettings.f36373j = 6;
        zzvg zzvg = new zzvg(str, actionCodeSettings, str2, "sendSignInLinkToEmail");
        zzvg.zzf(dVar);
        return zzP(zzvg);
    }

    public final Task zzw(String str) {
        return zzP(new zzvh(str));
    }

    public final Task zzx(C19107d dVar, C13616x xVar, String str) {
        zzvi zzvi = new zzvi(str);
        zzvi.zzf(dVar);
        zzvi.zzd(xVar);
        return zzP(zzvi);
    }

    public final Task zzy(C19107d dVar, AuthCredential authCredential, String str, C13616x xVar) {
        zzvj zzvj = new zzvj(authCredential, str);
        zzvj.zzf(dVar);
        zzvj.zzd(xVar);
        return zzP(zzvj);
    }

    public final Task zzz(C19107d dVar, String str, String str2, C13616x xVar) {
        zzvk zzvk = new zzvk(str, str2);
        zzvk.zzf(dVar);
        zzvk.zzd(xVar);
        return zzP(zzvk);
    }
}
