package com.google.android.gms.internal.p986firebaseauthapi;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.PhoneAuthCredential;
import p382be.C13597f;
import p382be.C13602j;

@VisibleForTesting
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxa */
final class zzxa implements zzwb {
    public final /* synthetic */ zzxd zza;

    public zzxa(zzxd zzxd) {
        this.zza = zzxd;
    }

    private final void zzp(zzxb zzxb) {
        this.zza.zzi.execute(new zzwz(this, zzxb));
    }

    private final void zzq(Status status, AuthCredential authCredential, String str, String str2) {
        zzxd.zzk(this.zza, status);
        zzxd zzxd = this.zza;
        zzxd.zzp = authCredential;
        zzxd.zzq = str;
        zzxd.zzr = str2;
        C13602j jVar = zzxd.zzg;
        if (jVar != null) {
            jVar.zzb(status);
        }
        this.zza.zzl(status);
    }

    public final void zza(String str) throws RemoteException {
        boolean z;
        int i = this.zza.zzb;
        if (i == 8) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "Unexpected response type " + i);
        zzxd zzxd = this.zza;
        zzxd.zzo = str;
        zzxd.zza = true;
        zzp(new zzwx(this, str));
    }

    public final void zzb(String str) throws RemoteException {
        boolean z;
        int i = this.zza.zzb;
        if (i == 8) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "Unexpected response type " + i);
        this.zza.zzo = str;
        zzp(new zzwv(this, str));
    }

    public final void zzc(zzyf zzyf) throws RemoteException {
        boolean z;
        int i = this.zza.zzb;
        if (i == 3) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "Unexpected response type " + i);
        zzxd zzxd = this.zza;
        zzxd.zzl = zzyf;
        zzxd.zzj(zzxd);
    }

    public final void zzd() throws RemoteException {
        boolean z;
        int i = this.zza.zzb;
        if (i == 5) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "Unexpected response type " + i);
        zzxd.zzj(this.zza);
    }

    public final void zze(zzsm zzsm) {
        zzq(zzsm.zza(), zzsm.zzb(), zzsm.zzc(), zzsm.zzd());
    }

    public final void zzf(zzso zzso) {
        zzxd zzxd = this.zza;
        zzxd.zzs = zzso;
        zzxd.zzl(C13597f.m34015a("REQUIRES_SECOND_FACTOR_AUTH"));
    }

    public final void zzg(Status status, PhoneAuthCredential phoneAuthCredential) throws RemoteException {
        boolean z;
        int i = this.zza.zzb;
        if (i == 2) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "Unexpected response type " + i);
        zzq(status, phoneAuthCredential, (String) null, (String) null);
    }

    public final void zzh(Status status) throws RemoteException {
        String statusMessage = status.getStatusMessage();
        if (statusMessage != null) {
            if (statusMessage.contains("MISSING_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17081);
            } else if (statusMessage.contains("MISSING_MFA_ENROLLMENT_ID")) {
                status = new Status(17082);
            } else if (statusMessage.contains("INVALID_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17083);
            } else if (statusMessage.contains("MFA_ENROLLMENT_NOT_FOUND")) {
                status = new Status(17084);
            } else if (statusMessage.contains("ADMIN_ONLY_OPERATION")) {
                status = new Status(17085);
            } else if (statusMessage.contains("UNVERIFIED_EMAIL")) {
                status = new Status(17086);
            } else if (statusMessage.contains("SECOND_FACTOR_EXISTS")) {
                status = new Status(17087);
            } else if (statusMessage.contains("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                status = new Status(17088);
            } else if (statusMessage.contains("UNSUPPORTED_FIRST_FACTOR")) {
                status = new Status(17089);
            } else if (statusMessage.contains("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                status = new Status(17090);
            }
        }
        zzxd zzxd = this.zza;
        if (zzxd.zzb == 8) {
            zzxd.zza = true;
            zzp(new zzwy(this, status));
            return;
        }
        zzxd.zzk(zzxd, status);
        this.zza.zzl(status);
    }

    public final void zzi(zzza zzza, zzyt zzyt) throws RemoteException {
        boolean z;
        int i = this.zza.zzb;
        if (i == 2) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "Unexpected response type: " + i);
        zzxd zzxd = this.zza;
        zzxd.zzj = zzza;
        zzxd.zzk = zzyt;
        zzxd.zzj(zzxd);
    }

    public final void zzj(zzzl zzzl) throws RemoteException {
        boolean z;
        int i = this.zza.zzb;
        if (i == 4) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "Unexpected response type " + i);
        zzxd zzxd = this.zza;
        zzxd.zzm = zzzl;
        zzxd.zzj(zzxd);
    }

    public final void zzk() throws RemoteException {
        boolean z;
        int i = this.zza.zzb;
        if (i == 6) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "Unexpected response type " + i);
        zzxd.zzj(this.zza);
    }

    public final void zzl(String str) throws RemoteException {
        boolean z;
        int i = this.zza.zzb;
        if (i == 7) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "Unexpected response type " + i);
        zzxd zzxd = this.zza;
        zzxd.zzn = str;
        zzxd.zzj(zzxd);
    }

    public final void zzm() throws RemoteException {
        boolean z;
        int i = this.zza.zzb;
        if (i == 9) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "Unexpected response type " + i);
        zzxd.zzj(this.zza);
    }

    public final void zzn(zzza zzza) throws RemoteException {
        int i = this.zza.zzb;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        Preconditions.checkState(z, "Unexpected response type: " + i);
        zzxd zzxd = this.zza;
        zzxd.zzj = zzza;
        zzxd.zzj(zzxd);
    }

    public final void zzo(PhoneAuthCredential phoneAuthCredential) throws RemoteException {
        boolean z;
        int i = this.zza.zzb;
        if (i == 8) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "Unexpected response type " + i);
        this.zza.zza = true;
        zzp(new zzww(this, phoneAuthCredential));
    }
}
