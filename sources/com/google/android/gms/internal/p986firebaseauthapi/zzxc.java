package com.google.android.gms.internal.p986firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxc */
public final class zzxc {
    private final zzxd zza;
    private final TaskCompletionSource zzb;

    public zzxc(zzxd zzxd, TaskCompletionSource taskCompletionSource) {
        this.zza = zzxd;
        this.zzb = taskCompletionSource;
    }

    public final void zza(Object obj, Status status) {
        FirebaseUser firebaseUser;
        Preconditions.checkNotNull(this.zzb, "completion source cannot be null");
        if (status != null) {
            zzxd zzxd = this.zza;
            if (zzxd.zzs != null) {
                TaskCompletionSource taskCompletionSource = this.zzb;
                FirebaseAuth instance = FirebaseAuth.getInstance(zzxd.zzd);
                zzxd zzxd2 = this.zza;
                zzso zzso = zzxd2.zzs;
                if ("reauthenticateWithCredential".equals(zzxd2.zza()) || "reauthenticateWithCredentialWithData".equals(this.zza.zza())) {
                    firebaseUser = this.zza.zze;
                } else {
                    firebaseUser = null;
                }
                taskCompletionSource.setException(zzwe.zzc(instance, zzso, firebaseUser));
                return;
            }
            AuthCredential authCredential = zzxd.zzp;
            if (authCredential != null) {
                this.zzb.setException(zzwe.zzb(status, authCredential, zzxd.zzq, zzxd.zzr));
            } else {
                this.zzb.setException(zzwe.zza(status));
            }
        } else {
            this.zzb.setResult(obj);
        }
    }
}
