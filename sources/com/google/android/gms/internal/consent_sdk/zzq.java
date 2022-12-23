package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import p576jd.C17718c;
import p576jd.C17719d;
import p576jd.C17720e;

public final /* synthetic */ class zzq implements Runnable {
    public final /* synthetic */ zzv zza;
    public final /* synthetic */ Activity zzb;
    public final /* synthetic */ C17720e zzc;
    public final /* synthetic */ C17719d zzd;
    public final /* synthetic */ C17718c zze;

    public /* synthetic */ zzq(zzv zzv, Activity activity, C17720e eVar, C17719d dVar, C17718c cVar) {
        this.zza = zzv;
        this.zzb = activity;
        this.zzd = dVar;
        this.zze = cVar;
    }

    public final void run() {
        this.zza.zzb(this.zzb, (C17720e) null, this.zzd, this.zze);
    }
}
