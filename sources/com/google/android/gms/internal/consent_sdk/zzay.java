package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p576jd.C17716b;
import p576jd.C17722g;
import p576jd.C17723h;

public final class zzay implements C17716b {
    private final Application zza;
    private final zzac zzb;
    private final zzbi zzc;
    private final zzam zzd;
    private final zzbc zze;
    private final zzcl<zzbg> zzf;
    private Dialog zzg;
    private zzbg zzh;
    private final AtomicBoolean zzi = new AtomicBoolean();
    private final AtomicReference<zzax> zzj = new AtomicReference<>();
    private final AtomicReference<C17716b.C17717a> zzk = new AtomicReference<>();
    private final AtomicReference<zzaw> zzl = new AtomicReference<>();

    public zzay(Application application, zzac zzac, zzbi zzbi, zzam zzam, zzbc zzbc, zzcl<zzbg> zzcl) {
        this.zza = application;
        this.zzb = zzac;
        this.zzc = zzbi;
        this.zzd = zzam;
        this.zze = zzbc;
        this.zzf = zzcl;
    }

    private final void zzg() {
        Dialog dialog = this.zzg;
        if (dialog != null) {
            dialog.dismiss();
            this.zzg = null;
        }
        this.zzc.zza((Activity) null);
        zzaw andSet = this.zzl.getAndSet((Object) null);
        if (andSet != null) {
            andSet.zza.zza.unregisterActivityLifecycleCallbacks(andSet);
        }
    }

    public final void show(Activity activity, C17716b.C17717a aVar) {
        zzcd.zza();
        if (!this.zzi.compareAndSet(false, true)) {
            new zzj(3, "ConsentForm#show can only be invoked once.").zza();
            aVar.mo50165a();
            return;
        }
        zzaw zzaw = new zzaw(this, activity);
        this.zza.registerActivityLifecycleCallbacks(zzaw);
        this.zzl.set(zzaw);
        this.zzc.zza(activity);
        Dialog dialog = new Dialog(activity, 16973840);
        dialog.setContentView(this.zzh);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        if (window == null) {
            new zzj(3, "Activity with null windows is passed in.").zza();
            aVar.mo50165a();
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        this.zzk.set(aVar);
        dialog.show();
        this.zzg = dialog;
        this.zzh.zzb("UMP_messagePresented", "");
    }

    public final zzbg zza() {
        return this.zzh;
    }

    public final void zzb(C17723h hVar, C17722g gVar) {
        zzbg zza2 = ((zzbh) this.zzf).zzb();
        this.zzh = zza2;
        zza2.setBackgroundColor(0);
        zza2.getSettings().setJavaScriptEnabled(true);
        zza2.setWebViewClient(new zzbf(zza2, (zzbe) null));
        this.zzj.set(new zzax(hVar, gVar, (zzav) null));
        this.zzh.loadDataWithBaseURL(this.zze.zza(), this.zze.zzb(), "text/html", "UTF-8", (String) null);
        zzcd.zza.postDelayed(new zzau(this), 10000);
    }

    public final void zzc(int i) {
        zzg();
        C17716b.C17717a andSet = this.zzk.getAndSet((Object) null);
        if (andSet != null) {
            this.zzd.zzf(3);
            andSet.mo50165a();
        }
    }

    public final void zzd(zzj zzj2) {
        zzg();
        C17716b.C17717a andSet = this.zzk.getAndSet((Object) null);
        if (andSet != null) {
            zzj2.zza();
            andSet.mo50165a();
        }
    }

    public final void zze() {
        zzax andSet = this.zzj.getAndSet((Object) null);
        if (andSet != null) {
            andSet.onConsentFormLoadSuccess(this);
        }
    }

    public final void zzf(zzj zzj2) {
        zzax andSet = this.zzj.getAndSet((Object) null);
        if (andSet != null) {
            andSet.onConsentFormLoadFailure(zzj2.zza());
        }
    }
}
