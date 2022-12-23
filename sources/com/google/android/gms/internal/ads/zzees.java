package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.DialogInterface;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.usebutton.sdk.internal.widget.FullScreenWidgetActivity;
import p001a0.C0016g;

public final /* synthetic */ class zzees implements DialogInterface.OnClickListener {
    public final /* synthetic */ zzeen zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzdwg zzc;
    public final /* synthetic */ Activity zzd;
    public final /* synthetic */ zzfgo zze;
    public final /* synthetic */ zzl zzf;

    public /* synthetic */ zzees(zzeen zzeen, String str, zzdwg zzdwg, Activity activity, zzfgo zzfgo, zzl zzl) {
        this.zza = zzeen;
        this.zzb = str;
        this.zzc = zzdwg;
        this.zzd = activity;
        this.zze = zzfgo;
        this.zzf = zzl;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        zzeen zzeen = this.zza;
        String str = this.zzb;
        zzdwg zzdwg = this.zzc;
        Activity activity = this.zzd;
        zzfgo zzfgo = this.zze;
        zzl zzl = this.zzf;
        zzeen.zzc(str);
        if (zzdwg != null) {
            zzeev.zzd(activity, zzdwg, zzfgo, zzeen, str, "dialog_click", C0016g.m37u("dialog_action", FullScreenWidgetActivity.EXTRA_DISMISS));
        }
        if (zzl != null) {
            zzl.zzb();
        }
    }
}
