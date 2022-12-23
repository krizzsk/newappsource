package com.google.android.gms.internal.p986firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.auth.zze;
import p382be.C13597f;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuh */
public final class zzuh {
    /* access modifiers changed from: private */
    public final zzxj zza;

    public zzuh(zzxj zzxj) {
        this.zza = (zzxj) Preconditions.checkNotNull(zzxj);
    }

    private final void zzM(String str, zzxi zzxi) {
        Preconditions.checkNotNull(zzxi);
        Preconditions.checkNotEmpty(str);
        zzza zzd = zzza.zzd(str);
        if (zzd.zzj()) {
            zzxi.zzb(zzd);
            return;
        }
        this.zza.zzf(new zzyp(zzd.zzf()), new zzug(this, zzxi));
    }

    /* access modifiers changed from: private */
    public final void zzN(zzyi zzyi, zzwc zzwc) {
        Preconditions.checkNotNull(zzyi);
        Preconditions.checkNotNull(zzwc);
        this.zza.zzc(zzyi, new zzst(this, zzwc));
    }

    /* access modifiers changed from: private */
    public final void zzO(zzza zzza, String str, String str2, Boolean bool, zze zze, zzwc zzwc, zzxh zzxh) {
        Preconditions.checkNotNull(zzza);
        Preconditions.checkNotNull(zzxh);
        Preconditions.checkNotNull(zzwc);
        this.zza.zzg(new zzyq(zzza.zze()), new zzsw(this, zzxh, str2, str, bool, zze, zzwc, zzza));
    }

    private final void zzP(zzyx zzyx, zzwc zzwc) {
        Preconditions.checkNotNull(zzyx);
        Preconditions.checkNotNull(zzwc);
        this.zza.zzh(zzyx, new zztz(this, zzwc));
    }

    public static /* bridge */ /* synthetic */ void zzd(zzuh zzuh, zzaac zzaac, zzwc zzwc, zzxh zzxh) {
        Status status;
        if (zzaac.zzp()) {
            zze zzc = zzaac.zzc();
            String zzd = zzaac.zzd();
            String zzk = zzaac.zzk();
            if (zzaac.zzn()) {
                status = new Status(17012);
            } else {
                status = C13597f.m34015a(zzaac.zze());
            }
            zzwc.zze(new zzsm(status, zzc, zzd, zzk));
            return;
        }
        zzuh.zzO(new zzza(zzaac.zzj(), zzaac.zzf(), Long.valueOf(zzaac.zzb()), "Bearer"), zzaac.zzi(), zzaac.zzh(), Boolean.valueOf(zzaac.zzo()), zzaac.zzc(), zzwc, zzxh);
    }

    public static /* bridge */ /* synthetic */ void zze(zzuh zzuh, zzwc zzwc, zzza zzza, zzzq zzzq, zzxh zzxh) {
        Preconditions.checkNotNull(zzwc);
        Preconditions.checkNotNull(zzza);
        Preconditions.checkNotNull(zzzq);
        Preconditions.checkNotNull(zzxh);
        zzuh.zza.zzg(new zzyq(zzza.zze()), new zzsu(zzuh, zzxh, zzwc, zzza, zzzq));
    }

    public static /* bridge */ /* synthetic */ void zzf(zzuh zzuh, zzwc zzwc, zzza zzza, zzyt zzyt, zzzq zzzq, zzxh zzxh) {
        Preconditions.checkNotNull(zzwc);
        Preconditions.checkNotNull(zzza);
        Preconditions.checkNotNull(zzyt);
        Preconditions.checkNotNull(zzzq);
        Preconditions.checkNotNull(zzxh);
        zzuh.zza.zzl(zzzq, new zzsv(zzuh, zzzq, zzyt, zzwc, zzza, zzxh));
    }

    public final void zzA(zzaaa zzaaa, zzwc zzwc) {
        Preconditions.checkNotNull(zzaaa);
        Preconditions.checkNotNull(zzwc);
        zzaaa.zzd(true);
        this.zza.zzq(zzaaa, new zzua(this, zzwc));
    }

    public final void zzB(zzaad zzaad, zzwc zzwc) {
        Preconditions.checkNotNull(zzaad);
        Preconditions.checkNotNull(zzwc);
        this.zza.zzr(zzaad, new zztp(this, zzwc));
    }

    public final void zzC(String str, String str2, String str3, zzwc zzwc) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zzwc);
        this.zza.zzs(new zzaag(str, str2, str3), new zzsr(this, zzwc));
    }

    public final void zzD(EmailAuthCredential emailAuthCredential, zzwc zzwc) {
        Preconditions.checkNotNull(emailAuthCredential);
        Preconditions.checkNotNull(zzwc);
        if (emailAuthCredential.f36379f) {
            zzM(emailAuthCredential.f36378e, new zzss(this, emailAuthCredential, zzwc));
        } else {
            zzN(new zzyi(emailAuthCredential, (String) null), zzwc);
        }
    }

    public final void zzE(zzaai zzaai, zzwc zzwc) {
        Preconditions.checkNotNull(zzaai);
        Preconditions.checkNotNull(zzwc);
        this.zza.zzt(zzaai, new zztd(this, zzwc));
    }

    public final void zzF(zzzu zzzu, zzwc zzwc) {
        Preconditions.checkNotNull(zzzu);
        Preconditions.checkNotNull(zzwc);
        this.zza.zzo(zzzu, new zzto(this, zzwc));
    }

    public final void zzG(zzzw zzzw, zzwc zzwc) {
        Preconditions.checkNotNull(zzzw);
        Preconditions.checkNotNull(zzwc);
        this.zza.zzp(zzzw, new zztt(this, zzwc));
    }

    public final void zzH(String str, String str2, zzwc zzwc) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zzwc);
        zzM(str, new zztn(this, str2, zzwc));
    }

    public final void zzI(String str, zzwc zzwc) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzwc);
        zzM(str, new zztj(this, zzwc));
    }

    public final void zzJ(String str, String str2, zzwc zzwc) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zzwc);
        zzM(str2, new zztl(this, str, zzwc));
    }

    public final void zzK(String str, UserProfileChangeRequest userProfileChangeRequest, zzwc zzwc) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(userProfileChangeRequest);
        Preconditions.checkNotNull(zzwc);
        zzM(str, new zzuc(this, userProfileChangeRequest, zzwc));
    }

    public final void zzL(zzyx zzyx, zzwc zzwc) {
        zzP(zzyx, zzwc);
    }

    public final void zzg(String str, String str2, zzwc zzwc) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzwc);
        zzzq zzzq = new zzzq();
        zzzq.zzf(str);
        zzzq.zzi(str2);
        this.zza.zzl(zzzq, new zzuf(this, zzwc));
    }

    public final void zzh(String str, String str2, zzwc zzwc) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zzwc);
        zzM(str, new zzud(this, str2, zzwc));
    }

    public final void zzi(String str, String str2, zzwc zzwc) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zzwc);
        zzM(str, new zzue(this, str2, zzwc));
    }

    public final void zzj(String str, String str2, zzwc zzwc) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzwc);
        this.zza.zzj(new zzzk(str, (String) null, str2), new zzsz(this, zzwc));
    }

    public final void zzk(String str, String str2, String str3, zzwc zzwc) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zzwc);
        this.zza.zzj(new zzzk(str, str2, str3), new zztb(this, zzwc));
    }

    public final void zzl(String str, String str2, String str3, zzwc zzwc) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zzwc);
        this.zza.zzn(new zzzs(str, str2, (String) null, str3), new zzsq(this, zzwc));
    }

    public final void zzm(String str, zzwc zzwc) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzwc);
        zzM(str, new zztx(this, zzwc));
    }

    public final void zzn(zzyk zzyk, String str, zzwc zzwc) {
        Preconditions.checkNotNull(zzyk);
        Preconditions.checkNotNull(zzwc);
        zzM(str, new zztr(this, zzyk, zzwc));
    }

    public final void zzo(zzym zzym, zzwc zzwc) {
        Preconditions.checkNotNull(zzym);
        Preconditions.checkNotNull(zzwc);
        this.zza.zze(zzym, new zzts(this, zzwc));
    }

    public final void zzp(String str, zzwc zzwc) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzwc);
        this.zza.zzf(new zzyp(str), new zzta(this, zzwc));
    }

    public final void zzq(String str, String str2, zzwc zzwc) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzwc);
        this.zza.zza(new zzye(str, str2), new zzsx(this, zzwc));
    }

    public final void zzr(String str, String str2, String str3, zzwc zzwc) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotNull(zzwc);
        zzM(str3, new zzte(this, str, str2, zzwc));
    }

    public final void zzs(String str, zzaaa zzaaa, zzwc zzwc) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzaaa);
        Preconditions.checkNotNull(zzwc);
        zzM(str, new zzti(this, zzaaa, zzwc));
    }

    public final void zzt(String str, zzaai zzaai, zzwc zzwc) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzaai);
        Preconditions.checkNotNull(zzwc);
        zzM(str, new zztg(this, zzaai, zzwc));
    }

    public final void zzu(String str, zzwc zzwc) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzwc);
        zzM(str, new zztv(this, zzwc));
    }

    public final void zzv(String str, ActionCodeSettings actionCodeSettings, zzwc zzwc) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzwc);
        zzyx zzyx = new zzyx(4);
        zzyx.zzg(str);
        if (actionCodeSettings != null) {
            zzyx.zzd(actionCodeSettings);
        }
        zzP(zzyx, zzwc);
    }

    public final void zzw(String str, ActionCodeSettings actionCodeSettings, String str2, zzwc zzwc) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzwc);
        zzyx zzyx = new zzyx(actionCodeSettings.f36373j);
        zzyx.zze(str);
        zzyx.zzd(actionCodeSettings);
        zzyx.zzf(str2);
        this.zza.zzh(zzyx, new zzsy(this, zzwc));
    }

    public final void zzx(zzzn zzzn, zzwc zzwc) {
        Preconditions.checkNotEmpty(zzzn.zzd());
        Preconditions.checkNotNull(zzwc);
        this.zza.zzk(zzzn, new zztc(this, zzwc));
    }

    public final void zzy(String str, zzwc zzwc) {
        Preconditions.checkNotNull(zzwc);
        this.zza.zzm(str, new zzty(this, zzwc));
    }

    public final void zzz(String str, zzwc zzwc) {
        Preconditions.checkNotNull(zzwc);
        this.zza.zzn(new zzzs(str), new zzub(this, zzwc));
    }
}
