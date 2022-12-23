package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.res.Resources;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.util.zzbr;

public final /* synthetic */ class zzeer implements DialogInterface.OnClickListener {
    public final /* synthetic */ zzdwg zza;
    public final /* synthetic */ Activity zzb;
    public final /* synthetic */ zzfgo zzc;
    public final /* synthetic */ zzeen zzd;
    public final /* synthetic */ String zze;
    public final /* synthetic */ zzbr zzf;
    public final /* synthetic */ String zzg;
    public final /* synthetic */ Resources zzh;
    public final /* synthetic */ zzl zzi;

    public /* synthetic */ zzeer(zzdwg zzdwg, Activity activity, zzfgo zzfgo, zzeen zzeen, String str, zzbr zzbr, String str2, Resources resources, zzl zzl) {
        this.zza = zzdwg;
        this.zzb = activity;
        this.zzc = zzfgo;
        this.zzd = zzeen;
        this.zze = str;
        this.zzf = zzbr;
        this.zzg = str2;
        this.zzh = resources;
        this.zzi = zzl;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0035, code lost:
        if (r0.zzf(com.google.android.gms.dynamic.ObjectWrapper.wrap(r10), r14, r13) == false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r18, int r19) {
        /*
            r17 = this;
            r1 = r17
            com.google.android.gms.internal.ads.zzdwg r9 = r1.zza
            android.app.Activity r10 = r1.zzb
            com.google.android.gms.internal.ads.zzfgo r11 = r1.zzc
            com.google.android.gms.internal.ads.zzeen r12 = r1.zzd
            java.lang.String r13 = r1.zze
            com.google.android.gms.ads.internal.util.zzbr r0 = r1.zzf
            java.lang.String r14 = r1.zzg
            android.content.res.Resources r15 = r1.zzh
            com.google.android.gms.ads.internal.overlay.zzl r8 = r1.zzi
            if (r9 == 0) goto L_0x002c
            java.lang.String r2 = "dialog_action"
            java.lang.String r3 = "confirm"
            java.util.HashMap r16 = p001a0.C0016g.m37u(r2, r3)
            java.lang.String r7 = "dialog_click"
            r2 = r10
            r3 = r9
            r4 = r11
            r5 = r12
            r6 = r13
            r1 = r8
            r8 = r16
            com.google.android.gms.internal.ads.zzeev.zzd(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x002d
        L_0x002c:
            r1 = r8
        L_0x002d:
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r10)     // Catch:{ RemoteException -> 0x0038 }
            boolean r0 = r0.zzf(r2, r14, r13)     // Catch:{ RemoteException -> 0x0038 }
            if (r0 != 0) goto L_0x004d
            goto L_0x003e
        L_0x0038:
            r0 = move-exception
            java.lang.String r2 = "Failed to schedule offline notification poster."
            com.google.android.gms.internal.ads.zzcfi.zzh(r2, r0)
        L_0x003e:
            r12.zzc(r13)
            if (r9 == 0) goto L_0x004d
            java.lang.String r7 = "offline_notification_worker_not_scheduled"
            r2 = r10
            r3 = r9
            r4 = r11
            r5 = r12
            r6 = r13
            com.google.android.gms.internal.ads.zzeev.zzc(r2, r3, r4, r5, r6, r7)
        L_0x004d:
            com.google.android.gms.ads.internal.zzt.zzp()
            com.google.android.gms.ads.internal.util.zzaa r0 = com.google.android.gms.ads.internal.zzt.zzq()
            android.app.AlertDialog$Builder r2 = new android.app.AlertDialog$Builder
            int r0 = r0.zza()
            r2.<init>(r10, r0)
            if (r15 != 0) goto L_0x0062
            java.lang.String r0 = "You'll get a notification with the link when you're back online"
            goto L_0x0068
        L_0x0062:
            int r0 = com.google.android.gms.ads.impl.C25559R.string.offline_opt_in_confirmation
            java.lang.String r0 = r15.getString(r0)
        L_0x0068:
            android.app.AlertDialog$Builder r0 = r2.setMessage(r0)
            com.google.android.gms.internal.ads.zzeeq r3 = new com.google.android.gms.internal.ads.zzeeq
            r3.<init>(r1)
            r0.setOnCancelListener(r3)
            android.app.AlertDialog r0 = r2.create()
            r0.show()
            java.util.Timer r2 = new java.util.Timer
            r2.<init>()
            com.google.android.gms.internal.ads.zzeeu r3 = new com.google.android.gms.internal.ads.zzeeu
            r3.<init>(r0, r2, r1)
            r0 = 3000(0xbb8, double:1.482E-320)
            r2.schedule(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeer.onClick(android.content.DialogInterface, int):void");
    }
}
