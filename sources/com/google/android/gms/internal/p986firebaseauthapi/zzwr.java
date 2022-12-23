package com.google.android.gms.internal.p986firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import p743qd.C19107d;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwr */
final class zzwr extends zzxj implements zzya {
    @VisibleForTesting
    public zzws zza;
    private zzwl zzb;
    private zzwm zzc;
    private zzxo zzd;
    private final zzwq zze;
    private final C19107d zzf;
    private final String zzg;

    @VisibleForTesting
    public zzwr(C19107d dVar, zzwq zzwq, zzxo zzxo, zzwl zzwl, zzwm zzwm) {
        this.zzf = dVar;
        dVar.mo51535a();
        String str = dVar.f48570c.f48581a;
        this.zzg = str;
        this.zze = (zzwq) Preconditions.checkNotNull(zzwq);
        zzw((zzxo) null, (zzwl) null, (zzwm) null);
        zzyb.zze(str, this);
    }

    private final zzws zzv() {
        if (this.zza == null) {
            C19107d dVar = this.zzf;
            String zzb2 = this.zze.zzb();
            dVar.mo51535a();
            this.zza = new zzws(dVar.f48568a, dVar, zzb2);
        }
        return this.zza;
    }

    private final void zzw(zzxo zzxo, zzwl zzwl, zzwm zzwm) {
        this.zzd = null;
        this.zzb = null;
        this.zzc = null;
        String zza2 = zzxy.zza("firebear.secureToken");
        if (TextUtils.isEmpty(zza2)) {
            zza2 = zzyb.zzd(this.zzg);
        } else {
            "Found hermetic configuration for secureToken URL: ".concat(String.valueOf(zza2));
        }
        if (this.zzd == null) {
            this.zzd = new zzxo(zza2, zzv());
        }
        String zza3 = zzxy.zza("firebear.identityToolkit");
        if (TextUtils.isEmpty(zza3)) {
            zza3 = zzyb.zzb(this.zzg);
        } else {
            "Found hermetic configuration for identityToolkit URL: ".concat(String.valueOf(zza3));
        }
        if (this.zzb == null) {
            this.zzb = new zzwl(zza3, zzv());
        }
        String zza4 = zzxy.zza("firebear.identityToolkitV2");
        if (TextUtils.isEmpty(zza4)) {
            zza4 = zzyb.zzc(this.zzg);
        } else {
            "Found hermetic configuration for identityToolkitV2 URL: ".concat(String.valueOf(zza4));
        }
        if (this.zzc == null) {
            this.zzc = new zzwm(zza4, zzv());
        }
    }

    public final void zza(zzye zzye, zzxi zzxi) {
        Preconditions.checkNotNull(zzye);
        Preconditions.checkNotNull(zzxi);
        zzwl zzwl = this.zzb;
        zzxl.zza(zzwl.zza("/createAuthUri", this.zzg), zzye, zzxi, zzyf.class, zzwl.zzb);
    }

    public final void zzb(zzyh zzyh, zzxi zzxi) {
        Preconditions.checkNotNull(zzyh);
        Preconditions.checkNotNull(zzxi);
        zzwl zzwl = this.zzb;
        zzxl.zza(zzwl.zza("/deleteAccount", this.zzg), zzyh, zzxi, Void.class, zzwl.zzb);
    }

    public final void zzc(zzyi zzyi, zzxi zzxi) {
        Preconditions.checkNotNull(zzyi);
        Preconditions.checkNotNull(zzxi);
        zzwl zzwl = this.zzb;
        zzxl.zza(zzwl.zza("/emailLinkSignin", this.zzg), zzyi, zzxi, zzyj.class, zzwl.zzb);
    }

    public final void zzd(zzyk zzyk, zzxi zzxi) {
        Preconditions.checkNotNull(zzyk);
        Preconditions.checkNotNull(zzxi);
        zzwm zzwm = this.zzc;
        zzxl.zza(zzwm.zza("/accounts/mfaEnrollment:finalize", this.zzg), zzyk, zzxi, zzyl.class, zzwm.zzb);
    }

    public final void zze(zzym zzym, zzxi zzxi) {
        Preconditions.checkNotNull(zzym);
        Preconditions.checkNotNull(zzxi);
        zzwm zzwm = this.zzc;
        zzxl.zza(zzwm.zza("/accounts/mfaSignIn:finalize", this.zzg), zzym, zzxi, zzyn.class, zzwm.zzb);
    }

    public final void zzf(zzyp zzyp, zzxi zzxi) {
        Preconditions.checkNotNull(zzyp);
        Preconditions.checkNotNull(zzxi);
        zzxo zzxo = this.zzd;
        zzxl.zza(zzxo.zza("/token", this.zzg), zzyp, zzxi, zzza.class, zzxo.zzb);
    }

    public final void zzg(zzyq zzyq, zzxi zzxi) {
        Preconditions.checkNotNull(zzyq);
        Preconditions.checkNotNull(zzxi);
        zzwl zzwl = this.zzb;
        zzxl.zza(zzwl.zza("/getAccountInfo", this.zzg), zzyq, zzxi, zzyr.class, zzwl.zzb);
    }

    public final void zzh(zzyx zzyx, zzxi zzxi) {
        Preconditions.checkNotNull(zzyx);
        Preconditions.checkNotNull(zzxi);
        if (zzyx.zzb() != null) {
            zzv().zzc(zzyx.zzb().f36372i);
        }
        zzwl zzwl = this.zzb;
        zzxl.zza(zzwl.zza("/getOobConfirmationCode", this.zzg), zzyx, zzxi, zzyy.class, zzwl.zzb);
    }

    public final void zzi() {
        zzw((zzxo) null, (zzwl) null, (zzwm) null);
    }

    public final void zzj(zzzk zzzk, zzxi zzxi) {
        Preconditions.checkNotNull(zzzk);
        Preconditions.checkNotNull(zzxi);
        zzwl zzwl = this.zzb;
        zzxl.zza(zzwl.zza("/resetPassword", this.zzg), zzzk, zzxi, zzzl.class, zzwl.zzb);
    }

    public final void zzk(zzzn zzzn, zzxi zzxi) {
        Preconditions.checkNotNull(zzzn);
        Preconditions.checkNotNull(zzxi);
        if (!TextUtils.isEmpty(zzzn.zzc())) {
            zzv().zzc(zzzn.zzc());
        }
        zzwl zzwl = this.zzb;
        zzxl.zza(zzwl.zza("/sendVerificationCode", this.zzg), zzzn, zzxi, zzzp.class, zzwl.zzb);
    }

    public final void zzl(zzzq zzzq, zzxi zzxi) {
        Preconditions.checkNotNull(zzzq);
        Preconditions.checkNotNull(zzxi);
        zzwl zzwl = this.zzb;
        zzxl.zza(zzwl.zza("/setAccountInfo", this.zzg), zzzq, zzxi, zzzr.class, zzwl.zzb);
    }

    public final void zzm(String str, zzxi zzxi) {
        Preconditions.checkNotNull(zzxi);
        zzv().zzb(str);
        ((zzty) zzxi).zza.zzm();
    }

    public final void zzn(zzzs zzzs, zzxi zzxi) {
        Preconditions.checkNotNull(zzzs);
        Preconditions.checkNotNull(zzxi);
        zzwl zzwl = this.zzb;
        zzxl.zza(zzwl.zza("/signupNewUser", this.zzg), zzzs, zzxi, zzzt.class, zzwl.zzb);
    }

    public final void zzo(zzzu zzzu, zzxi zzxi) {
        Preconditions.checkNotNull(zzzu);
        Preconditions.checkNotNull(zzxi);
        if (!TextUtils.isEmpty(zzzu.zzc())) {
            zzv().zzc(zzzu.zzc());
        }
        zzwm zzwm = this.zzc;
        zzxl.zza(zzwm.zza("/accounts/mfaEnrollment:start", this.zzg), zzzu, zzxi, zzzv.class, zzwm.zzb);
    }

    public final void zzp(zzzw zzzw, zzxi zzxi) {
        Preconditions.checkNotNull(zzzw);
        Preconditions.checkNotNull(zzxi);
        if (!TextUtils.isEmpty(zzzw.zzc())) {
            zzv().zzc(zzzw.zzc());
        }
        zzwm zzwm = this.zzc;
        zzxl.zza(zzwm.zza("/accounts/mfaSignIn:start", this.zzg), zzzw, zzxi, zzzx.class, zzwm.zzb);
    }

    public final void zzq(zzaaa zzaaa, zzxi zzxi) {
        Preconditions.checkNotNull(zzaaa);
        Preconditions.checkNotNull(zzxi);
        zzwl zzwl = this.zzb;
        zzxl.zza(zzwl.zza("/verifyAssertion", this.zzg), zzaaa, zzxi, zzaac.class, zzwl.zzb);
    }

    public final void zzr(zzaad zzaad, zzxi zzxi) {
        Preconditions.checkNotNull(zzaad);
        Preconditions.checkNotNull(zzxi);
        zzwl zzwl = this.zzb;
        zzxl.zza(zzwl.zza("/verifyCustomToken", this.zzg), zzaad, zzxi, zzaae.class, zzwl.zzb);
    }

    public final void zzs(zzaag zzaag, zzxi zzxi) {
        Preconditions.checkNotNull(zzaag);
        Preconditions.checkNotNull(zzxi);
        zzwl zzwl = this.zzb;
        zzxl.zza(zzwl.zza("/verifyPassword", this.zzg), zzaag, zzxi, zzaah.class, zzwl.zzb);
    }

    public final void zzt(zzaai zzaai, zzxi zzxi) {
        Preconditions.checkNotNull(zzaai);
        Preconditions.checkNotNull(zzxi);
        zzwl zzwl = this.zzb;
        zzxl.zza(zzwl.zza("/verifyPhoneNumber", this.zzg), zzaai, zzxi, zzaaj.class, zzwl.zzb);
    }

    public final void zzu(zzaak zzaak, zzxi zzxi) {
        Preconditions.checkNotNull(zzaak);
        Preconditions.checkNotNull(zzxi);
        zzwm zzwm = this.zzc;
        zzxl.zza(zzwm.zza("/accounts/mfaEnrollment:withdraw", this.zzg), zzaak, zzxi, zzaal.class, zzwm.zzb);
    }
}
