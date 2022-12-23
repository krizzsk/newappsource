package com.google.android.gms.internal.p986firebaseauthapi;

import android.app.Activity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FirebaseUser;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p357ae.C13416c;
import p382be.C13602j;
import p743qd.C19107d;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxd */
abstract class zzxd implements zzxf {
    /* access modifiers changed from: private */
    public boolean zza;
    public final int zzb;
    @VisibleForTesting
    public final zzxa zzc = new zzxa(this);
    public C19107d zzd;
    public FirebaseUser zze;
    public Object zzf;
    public C13602j zzg;
    public final List zzh = new ArrayList();
    public Executor zzi;
    public zzza zzj;
    public zzyt zzk;
    public zzyf zzl;
    public zzzl zzm;
    public String zzn;
    public String zzo;
    public AuthCredential zzp;
    public String zzq;
    public String zzr;
    public zzso zzs;
    @VisibleForTesting
    public Object zzt;
    @VisibleForTesting
    public Status zzu;
    public zzxc zzv;

    public zzxd(int i) {
        this.zzb = i;
    }

    public static /* bridge */ /* synthetic */ void zzj(zzxd zzxd) {
        zzxd.zzb();
        Preconditions.checkState(zzxd.zza, "no success or failure set on method implementation");
    }

    public static /* bridge */ /* synthetic */ void zzk(zzxd zzxd, Status status) {
        C13602j jVar = zzxd.zzg;
        if (jVar != null) {
            jVar.zzb(status);
        }
    }

    public abstract void zzb();

    public final zzxd zzd(Object obj) {
        this.zzf = Preconditions.checkNotNull(obj, "external callback cannot be null");
        return this;
    }

    public final zzxd zze(C13602j jVar) {
        this.zzg = (C13602j) Preconditions.checkNotNull(jVar, "external failure callback cannot be null");
        return this;
    }

    public final zzxd zzf(C19107d dVar) {
        this.zzd = (C19107d) Preconditions.checkNotNull(dVar, "firebaseApp cannot be null");
        return this;
    }

    public final zzxd zzg(FirebaseUser firebaseUser) {
        this.zze = (FirebaseUser) Preconditions.checkNotNull(firebaseUser, "firebaseUser cannot be null");
        return this;
    }

    public final zzxd zzh(C13416c cVar, Activity activity, Executor executor, String str) {
        C13416c zza2 = zzxr.zza(str, cVar, this);
        synchronized (this.zzh) {
            this.zzh.add((C13416c) Preconditions.checkNotNull(zza2));
        }
        if (activity != null) {
            zzwu.zza(activity, this.zzh);
        }
        this.zzi = (Executor) Preconditions.checkNotNull(executor);
        return this;
    }

    public final void zzl(Status status) {
        this.zza = true;
        this.zzu = status;
        this.zzv.zza((Object) null, status);
    }

    public final void zzm(Object obj) {
        this.zza = true;
        this.zzt = obj;
        this.zzv.zza(obj, (Status) null);
    }
}
