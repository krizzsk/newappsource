package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.appboy.Constants;
import com.appboy.models.InAppMessageBase;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashMap;
import p001a0.C0016g;

public final class zzchf extends FrameLayout implements zzcgw {
    @VisibleForTesting
    public final zzcht zza;
    private final zzchr zzb;
    private final FrameLayout zzc;
    private final View zzd;
    private final zzbin zze;
    private final long zzf;
    private final zzcgx zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private String zzn;
    private String[] zzo;
    private Bitmap zzp;
    private final ImageView zzq;
    private boolean zzr;

    /* JADX WARNING: type inference failed for: r13v0, types: [com.google.android.gms.internal.ads.zzcgx, android.view.View] */
    /* JADX WARNING: type inference failed for: r1v27, types: [com.google.android.gms.internal.ads.zzcgv] */
    /* JADX WARNING: type inference failed for: r1v28, types: [com.google.android.gms.internal.ads.zzcij] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzchf(android.content.Context r16, com.google.android.gms.internal.ads.zzchr r17, int r18, boolean r19, com.google.android.gms.internal.ads.zzbin r20, com.google.android.gms.internal.ads.zzchq r21) {
        /*
            r15 = this;
            r0 = r15
            r8 = r16
            r9 = r20
            r15.<init>(r16)
            r7 = r17
            r0.zzb = r7
            r0.zze = r9
            android.widget.FrameLayout r10 = new android.widget.FrameLayout
            r10.<init>(r8)
            r0.zzc = r10
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r11 = -1
            r1.<init>(r11, r11)
            r15.addView(r10, r1)
            com.google.android.gms.ads.internal.zza r1 = r17.zzm()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            com.google.android.gms.ads.internal.zza r1 = r17.zzm()
            com.google.android.gms.internal.ads.zzcgy r1 = r1.zza
            com.google.android.gms.internal.ads.zzchs r12 = new com.google.android.gms.internal.ads.zzchs
            com.google.android.gms.internal.ads.zzcfo r3 = r17.zzp()
            java.lang.String r4 = r17.zzu()
            com.google.android.gms.internal.ads.zzbik r6 = r17.zzn()
            r1 = r12
            r2 = r16
            r5 = r20
            r1.<init>(r2, r3, r4, r5, r6)
            r1 = 2
            r2 = r18
            if (r2 != r1) goto L_0x005a
            com.google.android.gms.internal.ads.zzcij r13 = new com.google.android.gms.internal.ads.zzcij
            boolean r6 = com.google.android.gms.internal.ads.zzcgy.zza(r17)
            r1 = r13
            r2 = r16
            r3 = r12
            r4 = r17
            r5 = r19
            r7 = r21
            r1.<init>(r2, r3, r4, r5, r6, r7)
            goto L_0x0082
        L_0x005a:
            com.google.android.gms.internal.ads.zzcgv r13 = new com.google.android.gms.internal.ads.zzcgv
            boolean r12 = com.google.android.gms.internal.ads.zzcgy.zza(r17)
            com.google.android.gms.internal.ads.zzchs r14 = new com.google.android.gms.internal.ads.zzchs
            com.google.android.gms.internal.ads.zzcfo r3 = r17.zzp()
            java.lang.String r4 = r17.zzu()
            com.google.android.gms.internal.ads.zzbik r6 = r17.zzn()
            r1 = r14
            r2 = r16
            r5 = r20
            r1.<init>(r2, r3, r4, r5, r6)
            r1 = r13
            r3 = r17
            r4 = r19
            r5 = r12
            r6 = r21
            r7 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7)
        L_0x0082:
            r0.zzg = r13
            android.view.View r1 = new android.view.View
            r1.<init>(r8)
            r0.zzd = r1
            r2 = 0
            r1.setBackgroundColor(r2)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r3 = 17
            r2.<init>(r11, r11, r3)
            r10.addView(r13, r2)
            com.google.android.gms.internal.ads.zzbhq r2 = com.google.android.gms.internal.ads.zzbhy.zzD
            com.google.android.gms.internal.ads.zzbhw r3 = com.google.android.gms.ads.internal.client.zzay.zzc()
            java.lang.Object r2 = r3.zzb(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x00b6
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r11, r11)
            r10.addView(r1, r2)
            r10.bringChildToFront(r1)
        L_0x00b6:
            com.google.android.gms.internal.ads.zzbhq r1 = com.google.android.gms.internal.ads.zzbhy.zzA
            com.google.android.gms.internal.ads.zzbhw r2 = com.google.android.gms.ads.internal.client.zzay.zzc()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x00cb
            r15.zzm()
        L_0x00cb:
            android.widget.ImageView r1 = new android.widget.ImageView
            r1.<init>(r8)
            r0.zzq = r1
            com.google.android.gms.internal.ads.zzbhq r1 = com.google.android.gms.internal.ads.zzbhy.zzF
            com.google.android.gms.internal.ads.zzbhw r2 = com.google.android.gms.ads.internal.client.zzay.zzc()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r0.zzf = r1
            com.google.android.gms.internal.ads.zzbhq r1 = com.google.android.gms.internal.ads.zzbhy.zzC
            com.google.android.gms.internal.ads.zzbhw r2 = com.google.android.gms.ads.internal.client.zzay.zzc()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r0.zzk = r1
            if (r9 == 0) goto L_0x0105
            r2 = 1
            if (r2 == r1) goto L_0x00fe
            java.lang.String r1 = "0"
            goto L_0x0100
        L_0x00fe:
            java.lang.String r1 = "1"
        L_0x0100:
            java.lang.String r2 = "spinner_used"
            r9.zzd(r2, r1)
        L_0x0105:
            com.google.android.gms.internal.ads.zzcht r1 = new com.google.android.gms.internal.ads.zzcht
            r1.<init>(r15)
            r0.zza = r1
            r13.zzr(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzchf.<init>(android.content.Context, com.google.android.gms.internal.ads.zzchr, int, boolean, com.google.android.gms.internal.ads.zzbin, com.google.android.gms.internal.ads.zzchq):void");
    }

    private final void zzI() {
        if (this.zzb.zzk() != null && this.zzi && !this.zzj) {
            this.zzb.zzk().getWindow().clearFlags(RecyclerView.C1119a0.FLAG_IGNORE);
            this.zzi = false;
        }
    }

    /* access modifiers changed from: private */
    public final void zzJ(String str, String... strArr) {
        HashMap u = C0016g.m37u("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                u.put(str2, str3);
                str2 = null;
            }
        }
        this.zzb.zzd("onVideoEvent", u);
    }

    private final boolean zzK() {
        return this.zzq.getParent() != null;
    }

    public final void finalize() throws Throwable {
        try {
            this.zza.zza();
            zzcgx zzcgx = this.zzg;
            if (zzcgx != null) {
                zzcfv.zze.execute(new zzcgz(zzcgx));
            }
        } finally {
            super.finalize();
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.zza.zzb();
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
        }
        zzs.zza.post(new zzcha(this, z));
    }

    public final void onWindowVisibilityChanged(int i) {
        boolean z;
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            this.zza.zzb();
            z = true;
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
            z = false;
        }
        zzs.zza.post(new zzche(this, z));
    }

    public final void zzA(int i) {
        zzcgx zzcgx = this.zzg;
        if (zzcgx != null) {
            zzcgx.zzz(i);
        }
    }

    public final void zzB(int i) {
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzD)).booleanValue()) {
            this.zzc.setBackgroundColor(i);
            this.zzd.setBackgroundColor(i);
        }
    }

    public final void zzC(int i) {
        zzcgx zzcgx = this.zzg;
        if (zzcgx != null) {
            zzcgx.zzA(i);
        }
    }

    public final void zzD(String str, String[] strArr) {
        this.zzn = str;
        this.zzo = strArr;
    }

    public final void zzE(int i, int i2, int i3, int i4) {
        if (zze.zzc()) {
            StringBuilder s = C0016g.m35s("Set video bounds to x:", i, ";y:", i2, ";w:");
            s.append(i3);
            s.append(";h:");
            s.append(i4);
            zze.zza(s.toString());
        }
        if (i3 != 0 && i4 != 0) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
            layoutParams.setMargins(i, i2, 0, 0);
            this.zzc.setLayoutParams(layoutParams);
            requestLayout();
        }
    }

    public final void zzF(float f) {
        zzcgx zzcgx = this.zzg;
        if (zzcgx != null) {
            zzcgx.zzb.zze(f);
            zzcgx.zzn();
        }
    }

    public final void zzG(float f, float f2) {
        zzcgx zzcgx = this.zzg;
        if (zzcgx != null) {
            zzcgx.zzu(f, f2);
        }
    }

    public final void zzH() {
        zzcgx zzcgx = this.zzg;
        if (zzcgx != null) {
            zzcgx.zzb.zzd(false);
            zzcgx.zzn();
        }
    }

    public final void zza() {
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzbE)).booleanValue()) {
            this.zza.zza();
        }
        zzJ("ended", new String[0]);
        zzI();
    }

    public final void zzb(String str, String str2) {
        zzJ("error", "what", str, Constants.APPBOY_PUSH_EXTRAS_KEY, str2);
    }

    public final void zzc(String str, String str2) {
        zzJ("exception", "what", "ExoPlayerAdapter exception", Constants.APPBOY_PUSH_EXTRAS_KEY, str2);
    }

    public final void zzd() {
        zzJ("pause", new String[0]);
        zzI();
        this.zzh = false;
    }

    public final void zze() {
        boolean z;
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzbE)).booleanValue()) {
            this.zza.zzb();
        }
        if (this.zzb.zzk() != null && !this.zzi) {
            if ((this.zzb.zzk().getWindow().getAttributes().flags & RecyclerView.C1119a0.FLAG_IGNORE) != 0) {
                z = true;
            } else {
                z = false;
            }
            this.zzj = z;
            if (!z) {
                this.zzb.zzk().getWindow().addFlags(RecyclerView.C1119a0.FLAG_IGNORE);
                this.zzi = true;
            }
        }
        this.zzh = true;
    }

    public final void zzf() {
        zzcgx zzcgx = this.zzg;
        if (zzcgx != null && this.zzm == 0) {
            zzJ("canplaythrough", InAppMessageBase.DURATION, String.valueOf(((float) zzcgx.zzc()) / 1000.0f), "videoWidth", String.valueOf(this.zzg.zze()), "videoHeight", String.valueOf(this.zzg.zzd()));
        }
    }

    public final void zzg() {
        this.zzd.setVisibility(4);
        zzs.zza.post(new zzchb(this));
    }

    public final void zzh() {
        this.zza.zzb();
        zzs.zza.post(new zzchc(this));
    }

    public final void zzi() {
        if (this.zzr && this.zzp != null && !zzK()) {
            this.zzq.setImageBitmap(this.zzp);
            this.zzq.invalidate();
            this.zzc.addView(this.zzq, new FrameLayout.LayoutParams(-1, -1));
            this.zzc.bringChildToFront(this.zzq);
        }
        this.zza.zza();
        this.zzm = this.zzl;
        zzs.zza.post(new zzchd(this));
    }

    public final void zzj(int i, int i2) {
        if (this.zzk) {
            zzbhq zzbhq = zzbhy.zzE;
            int max = Math.max(i / ((Integer) zzay.zzc().zzb(zzbhq)).intValue(), 1);
            int max2 = Math.max(i2 / ((Integer) zzay.zzc().zzb(zzbhq)).intValue(), 1);
            Bitmap bitmap = this.zzp;
            if (bitmap == null || bitmap.getWidth() != max || this.zzp.getHeight() != max2) {
                this.zzp = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                this.zzr = false;
            }
        }
    }

    public final void zzk() {
        if (this.zzh && zzK()) {
            this.zzc.removeView(this.zzq);
        }
        if (this.zzg != null && this.zzp != null) {
            long elapsedRealtime = zzt.zzA().elapsedRealtime();
            if (this.zzg.getBitmap(this.zzp) != null) {
                this.zzr = true;
            }
            long elapsedRealtime2 = zzt.zzA().elapsedRealtime() - elapsedRealtime;
            if (zze.zzc()) {
                zze.zza("Spinner frame grab took " + elapsedRealtime2 + "ms");
            }
            if (elapsedRealtime2 > this.zzf) {
                zzcfi.zzj("Spinner frame grab crossed jank threshold! Suspending spinner.");
                this.zzk = false;
                this.zzp = null;
                zzbin zzbin = this.zze;
                if (zzbin != null) {
                    zzbin.zzd("spinner_jank", Long.toString(elapsedRealtime2));
                }
            }
        }
    }

    public final void zzm() {
        zzcgx zzcgx = this.zzg;
        if (zzcgx != null) {
            TextView textView = new TextView(zzcgx.getContext());
            textView.setText("AdMob - ".concat(this.zzg.zzj()));
            textView.setTextColor(-65536);
            textView.setBackgroundColor(-256);
            this.zzc.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
            this.zzc.bringChildToFront(textView);
        }
    }

    public final void zzn() {
        this.zza.zza();
        zzcgx zzcgx = this.zzg;
        if (zzcgx != null) {
            zzcgx.zzt();
        }
        zzI();
    }

    public final /* synthetic */ void zzo() {
        zzJ("firstFrameRendered", new String[0]);
    }

    public final /* synthetic */ void zzp(boolean z) {
        zzJ("windowFocusChanged", "hasWindowFocus", String.valueOf(z));
    }

    public final void zzq() {
        if (this.zzg != null) {
            if (!TextUtils.isEmpty(this.zzn)) {
                this.zzg.zzB(this.zzn, this.zzo);
            } else {
                zzJ("no_src", new String[0]);
            }
        }
    }

    public final void zzr() {
        zzcgx zzcgx = this.zzg;
        if (zzcgx != null) {
            zzcgx.zzb.zzd(true);
            zzcgx.zzn();
        }
    }

    public final void zzs() {
        zzcgx zzcgx = this.zzg;
        if (zzcgx != null) {
            long zza2 = (long) zzcgx.zza();
            if (this.zzl != zza2 && zza2 > 0) {
                float f = ((float) zza2) / 1000.0f;
                if (((Boolean) zzay.zzc().zzb(zzbhy.zzbB)).booleanValue()) {
                    zzJ("timeupdate", "time", String.valueOf(f), "totalBytes", String.valueOf(this.zzg.zzh()), "qoeCachedBytes", String.valueOf(this.zzg.zzf()), "qoeLoadedBytes", String.valueOf(this.zzg.zzg()), "droppedFrames", String.valueOf(this.zzg.zzb()), "reportTime", String.valueOf(zzt.zzA().currentTimeMillis()));
                } else {
                    zzJ("timeupdate", "time", String.valueOf(f));
                }
                this.zzl = zza2;
            }
        }
    }

    public final void zzt() {
        zzcgx zzcgx = this.zzg;
        if (zzcgx != null) {
            zzcgx.zzo();
        }
    }

    public final void zzu() {
        zzcgx zzcgx = this.zzg;
        if (zzcgx != null) {
            zzcgx.zzp();
        }
    }

    public final void zzv(int i) {
        zzcgx zzcgx = this.zzg;
        if (zzcgx != null) {
            zzcgx.zzq(i);
        }
    }

    public final void zzw(MotionEvent motionEvent) {
        zzcgx zzcgx = this.zzg;
        if (zzcgx != null) {
            zzcgx.dispatchTouchEvent(motionEvent);
        }
    }

    public final void zzx(int i) {
        zzcgx zzcgx = this.zzg;
        if (zzcgx != null) {
            zzcgx.zzw(i);
        }
    }

    public final void zzy(int i) {
        zzcgx zzcgx = this.zzg;
        if (zzcgx != null) {
            zzcgx.zzx(i);
        }
    }

    public final void zzz(int i) {
        zzcgx zzcgx = this.zzg;
        if (zzcgx != null) {
            zzcgx.zzy(i);
        }
    }
}
