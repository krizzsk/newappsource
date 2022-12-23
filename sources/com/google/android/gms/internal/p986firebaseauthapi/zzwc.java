package com.google.android.gms.internal.p986firebaseauthapi;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.firebase.auth.PhoneAuthCredential;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwc */
public class zzwc {
    private final zzwb zza;
    private final Logger zzb;

    public zzwc(zzwb zzwb, Logger logger) {
        this.zza = (zzwb) Preconditions.checkNotNull(zzwb);
        this.zzb = (Logger) Preconditions.checkNotNull(logger);
    }

    public final void zza(String str) {
        try {
            this.zza.zza(str);
        } catch (RemoteException e) {
            this.zzb.mo65851e("RemoteException when sending auto retrieval timeout response.", e, new Object[0]);
        }
    }

    public void zzb(String str) {
        try {
            this.zza.zzb(str);
        } catch (RemoteException e) {
            this.zzb.mo65851e("RemoteException when sending send verification code response.", e, new Object[0]);
        }
    }

    public final void zzc(zzyf zzyf) {
        try {
            this.zza.zzc(zzyf);
        } catch (RemoteException e) {
            this.zzb.mo65851e("RemoteException when sending create auth uri response.", e, new Object[0]);
        }
    }

    public final void zzd() {
        try {
            this.zza.zzd();
        } catch (RemoteException e) {
            this.zzb.mo65851e("RemoteException when sending delete account response.", e, new Object[0]);
        }
    }

    public final void zze(zzsm zzsm) {
        try {
            this.zza.zze(zzsm);
        } catch (RemoteException e) {
            this.zzb.mo65851e("RemoteException when sending failure result with credential", e, new Object[0]);
        }
    }

    public final void zzf(zzso zzso) {
        try {
            this.zza.zzf(zzso);
        } catch (RemoteException e) {
            this.zzb.mo65851e("RemoteException when sending failure result for mfa", e, new Object[0]);
        }
    }

    public final void zzg(Status status, PhoneAuthCredential phoneAuthCredential) {
        try {
            this.zza.zzg(status, phoneAuthCredential);
        } catch (RemoteException e) {
            this.zzb.mo65851e("RemoteException when sending failure result.", e, new Object[0]);
        }
    }

    public void zzh(Status status) {
        try {
            this.zza.zzh(status);
        } catch (RemoteException e) {
            this.zzb.mo65851e("RemoteException when sending failure result.", e, new Object[0]);
        }
    }

    public final void zzi(zzza zzza, zzyt zzyt) {
        try {
            this.zza.zzi(zzza, zzyt);
        } catch (RemoteException e) {
            this.zzb.mo65851e("RemoteException when sending get token and account info user response", e, new Object[0]);
        }
    }

    public final void zzj(zzzl zzzl) {
        try {
            this.zza.zzj(zzzl);
        } catch (RemoteException e) {
            this.zzb.mo65851e("RemoteException when sending password reset response.", e, new Object[0]);
        }
    }

    public final void zzk() {
        try {
            this.zza.zzk();
        } catch (RemoteException e) {
            this.zzb.mo65851e("RemoteException when sending email verification response.", e, new Object[0]);
        }
    }

    public final void zzl(String str) {
        try {
            this.zza.zzl(str);
        } catch (RemoteException e) {
            this.zzb.mo65851e("RemoteException when sending set account info response.", e, new Object[0]);
        }
    }

    public final void zzm() {
        try {
            this.zza.zzm();
        } catch (RemoteException e) {
            this.zzb.mo65851e("RemoteException when setting FirebaseUI Version", e, new Object[0]);
        }
    }

    public final void zzn(zzza zzza) {
        try {
            this.zza.zzn(zzza);
        } catch (RemoteException e) {
            this.zzb.mo65851e("RemoteException when sending token result.", e, new Object[0]);
        }
    }

    public final void zzo(PhoneAuthCredential phoneAuthCredential) {
        try {
            this.zza.zzo(phoneAuthCredential);
        } catch (RemoteException e) {
            this.zzb.mo65851e("RemoteException when sending verification completed response.", e, new Object[0]);
        }
    }

    public zzwc(zzwc zzwc) {
        this(zzwc.zza, zzwc.zzb);
    }
}
