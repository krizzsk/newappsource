package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaoc;
import com.google.android.gms.internal.ads.zzbdl;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbin;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbnl;
import com.google.android.gms.internal.ads.zzbnn;
import com.google.android.gms.internal.ads.zzbom;
import com.google.android.gms.internal.ads.zzboo;
import com.google.android.gms.internal.ads.zzbwu;
import com.google.android.gms.internal.ads.zzbwv;
import com.google.android.gms.internal.ads.zzbxt;
import com.google.android.gms.internal.ads.zzccj;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzcfo;
import com.google.android.gms.internal.ads.zzcli;
import com.google.android.gms.internal.ads.zzclu;
import com.google.android.gms.internal.ads.zzcmv;
import com.google.android.gms.internal.ads.zzcmx;
import com.google.android.gms.internal.ads.zzdjf;
import com.google.android.gms.internal.ads.zzdwg;
import com.google.android.gms.internal.ads.zzeen;
import com.google.android.gms.internal.ads.zzeev;
import com.google.android.gms.internal.ads.zzfbg;
import com.google.android.gms.internal.ads.zzfbj;
import com.google.android.gms.internal.ads.zzfgo;
import com.google.android.gms.internal.ads.zzfig;
import com.google.android.gms.internal.ads.zzfnu;
import java.util.Collections;

public class zzl extends zzbxt implements zzaa {
    @VisibleForTesting
    public static final int zza = Color.argb(0, 0, 0, 0);
    public final Activity zzb;
    @VisibleForTesting
    public AdOverlayInfoParcel zzc;
    @VisibleForTesting
    public zzcli zzd;
    @VisibleForTesting
    public zzh zze;
    @VisibleForTesting
    public zzr zzf;
    @VisibleForTesting
    public boolean zzg = false;
    @VisibleForTesting
    public FrameLayout zzh;
    @VisibleForTesting
    public WebChromeClient.CustomViewCallback zzi;
    @VisibleForTesting
    public boolean zzj = false;
    @VisibleForTesting
    public boolean zzk = false;
    @VisibleForTesting
    public zzg zzl;
    @VisibleForTesting
    public boolean zzm = false;
    @VisibleForTesting
    public int zzn = 1;
    private final Object zzo = new Object();
    private Runnable zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs = false;
    private boolean zzt = false;
    private boolean zzu = true;

    public zzl(Activity activity) {
        this.zzb = activity;
    }

    private final void zzG(Configuration configuration) {
        boolean z;
        int i;
        zzj zzj2;
        zzj zzj3;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        boolean z2 = true;
        boolean z3 = false;
        if (adOverlayInfoParcel == null || (zzj3 = adOverlayInfoParcel.zzo) == null || !zzj3.zzb) {
            z = false;
        } else {
            z = true;
        }
        boolean zze2 = zzt.zzq().zze(this.zzb, configuration);
        if ((!this.zzk || z) && !zze2) {
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
            if (!(adOverlayInfoParcel2 == null || (zzj2 = adOverlayInfoParcel2.zzo) == null || !zzj2.zzg)) {
                z3 = true;
            }
        } else {
            z2 = false;
        }
        Window window = this.zzb.getWindow();
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzaY)).booleanValue()) {
            View decorView = window.getDecorView();
            if (!z2) {
                i = 256;
            } else if (z3) {
                i = 5894;
            } else {
                i = 5380;
            }
            decorView.setSystemUiVisibility(i);
        } else if (z2) {
            window.addFlags(1024);
            window.clearFlags(2048);
            if (z3) {
                window.getDecorView().setSystemUiVisibility(4098);
            }
        } else {
            window.addFlags(2048);
            window.clearFlags(1024);
        }
    }

    private static final void zzH(IObjectWrapper iObjectWrapper, View view) {
        if (iObjectWrapper != null && view != null) {
            zzt.zzh().zzc(iObjectWrapper, view);
        }
    }

    public final void zzA(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        FrameLayout frameLayout = new FrameLayout(this.zzb);
        this.zzh = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        this.zzh.addView(view, -1, -1);
        this.zzb.setContentView(this.zzh);
        this.zzr = true;
        this.zzi = customViewCallback;
        this.zzg = true;
    }

    public final void zzB(boolean z) throws zzf {
        zzcmv zzcmv;
        boolean z2;
        zzcmx zzcmx;
        String str;
        zza zza2;
        if (!this.zzr) {
            this.zzb.requestWindowFeature(1);
        }
        Window window = this.zzb.getWindow();
        if (window != null) {
            zzcli zzcli = this.zzc.zzd;
            zzb zzb2 = null;
            if (zzcli != null) {
                zzcmv = zzcli.zzP();
            } else {
                zzcmv = null;
            }
            boolean z3 = false;
            if (zzcmv == null || !zzcmv.zzJ()) {
                z2 = false;
            } else {
                z2 = true;
            }
            this.zzm = false;
            if (z2) {
                int i = this.zzc.zzj;
                if (i == 6) {
                    if (this.zzb.getResources().getConfiguration().orientation == 1) {
                        z3 = true;
                    }
                    this.zzm = z3;
                } else if (i == 7) {
                    if (this.zzb.getResources().getConfiguration().orientation == 2) {
                        z3 = true;
                    }
                    this.zzm = z3;
                }
            }
            zzcfi.zze("Delay onShow to next orientation change: " + z3);
            zzy(this.zzc.zzj);
            window.setFlags(16777216, 16777216);
            zzcfi.zze("Hardware acceleration on the AdActivity window enabled.");
            if (!this.zzk) {
                this.zzl.setBackgroundColor(-16777216);
            } else {
                this.zzl.setBackgroundColor(zza);
            }
            this.zzb.setContentView(this.zzl);
            this.zzr = true;
            if (z) {
                try {
                    zzt.zzz();
                    Activity activity = this.zzb;
                    zzcli zzcli2 = this.zzc.zzd;
                    if (zzcli2 != null) {
                        zzcmx = zzcli2.zzQ();
                    } else {
                        zzcmx = null;
                    }
                    zzcli zzcli3 = this.zzc.zzd;
                    if (zzcli3 != null) {
                        str = zzcli3.zzU();
                    } else {
                        str = null;
                    }
                    AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
                    zzcfo zzcfo = adOverlayInfoParcel.zzm;
                    zzcli zzcli4 = adOverlayInfoParcel.zzd;
                    if (zzcli4 != null) {
                        zza2 = zzcli4.zzm();
                    } else {
                        zza2 = null;
                    }
                    zzcli zza3 = zzclu.zza(activity, zzcmx, str, true, z2, (zzaoc) null, (zzbix) null, zzcfo, (zzbin) null, (com.google.android.gms.ads.internal.zzl) null, zza2, zzbdl.zza(), (zzfbg) null, (zzfbj) null);
                    this.zzd = zza3;
                    zzcmv zzP = zza3.zzP();
                    AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
                    zzbnl zzbnl = adOverlayInfoParcel2.zzp;
                    zzbnn zzbnn = adOverlayInfoParcel2.zze;
                    zzw zzw = adOverlayInfoParcel2.zzi;
                    zzcli zzcli5 = adOverlayInfoParcel2.zzd;
                    if (zzcli5 != null) {
                        zzb2 = zzcli5.zzP().zzd();
                    }
                    zzP.zzL((com.google.android.gms.ads.internal.client.zza) null, zzbnl, (zzo) null, zzbnn, zzw, true, (zzboo) null, zzb2, (zzbwv) null, (zzccj) null, (zzeen) null, (zzfig) null, (zzdwg) null, (zzfgo) null, (zzbom) null, (zzdjf) null);
                    this.zzd.zzP().zzz(new zzd(this));
                    AdOverlayInfoParcel adOverlayInfoParcel3 = this.zzc;
                    String str2 = adOverlayInfoParcel3.zzl;
                    if (str2 != null) {
                        this.zzd.loadUrl(str2);
                    } else {
                        String str3 = adOverlayInfoParcel3.zzh;
                        if (str3 != null) {
                            this.zzd.loadDataWithBaseURL(adOverlayInfoParcel3.zzf, str3, "text/html", "UTF-8", (String) null);
                        } else {
                            throw new zzf("No URL or HTML to display in ad overlay.");
                        }
                    }
                    zzcli zzcli6 = this.zzc.zzd;
                    if (zzcli6 != null) {
                        zzcli6.zzat(this);
                    }
                } catch (Exception e) {
                    zzcfi.zzh("Error obtaining webview.", e);
                    throw new zzf("Could not obtain webview for the overlay.");
                }
            } else {
                zzcli zzcli7 = this.zzc.zzd;
                this.zzd = zzcli7;
                zzcli7.zzam(this.zzb);
            }
            this.zzd.zzah(this);
            zzcli zzcli8 = this.zzc.zzd;
            if (zzcli8 != null) {
                zzH(zzcli8.zzS(), this.zzl);
            }
            if (this.zzc.zzk != 5) {
                ViewParent parent = this.zzd.getParent();
                if (parent != null && (parent instanceof ViewGroup)) {
                    ((ViewGroup) parent).removeView(this.zzd.zzH());
                }
                if (this.zzk) {
                    this.zzd.zzal();
                }
                this.zzl.addView(this.zzd.zzH(), -1, -1);
            }
            if (!z && !this.zzm) {
                zze();
            }
            AdOverlayInfoParcel adOverlayInfoParcel4 = this.zzc;
            if (adOverlayInfoParcel4.zzk != 5) {
                zzu(z2);
                if (this.zzd.zzay()) {
                    zzw(z2, true);
                    return;
                }
                return;
            }
            zzeev.zzh(this.zzb, this, adOverlayInfoParcel4.zzu, adOverlayInfoParcel4.zzr, adOverlayInfoParcel4.zzs, adOverlayInfoParcel4.zzt, adOverlayInfoParcel4.zzq, adOverlayInfoParcel4.zzv);
            return;
        }
        throw new zzf("Invalid activity, no window available.");
    }

    public final void zzC() {
        synchronized (this.zzo) {
            this.zzq = true;
            Runnable runnable = this.zzp;
            if (runnable != null) {
                zzfnu zzfnu = zzs.zza;
                zzfnu.removeCallbacks(runnable);
                zzfnu.post(this.zzp);
            }
        }
    }

    public final void zzD() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        zzo zzo2;
        if (this.zzb.isFinishing() && !this.zzs) {
            this.zzs = true;
            zzcli zzcli = this.zzd;
            if (zzcli != null) {
                zzcli.zzY(this.zzn - 1);
                synchronized (this.zzo) {
                    if (!this.zzq && this.zzd.zzaz()) {
                        if (((Boolean) zzay.zzc().zzb(zzbhy.zzdP)).booleanValue() && !this.zzt && (adOverlayInfoParcel = this.zzc) != null && (zzo2 = adOverlayInfoParcel.zzc) != null) {
                            zzo2.zzbC();
                        }
                        zze zze2 = new zze(this);
                        this.zzp = zze2;
                        zzs.zza.postDelayed(zze2, ((Long) zzay.zzc().zzb(zzbhy.zzaR)).longValue());
                        return;
                    }
                }
            }
            zzc();
        }
    }

    public final boolean zzE() {
        this.zzn = 1;
        if (this.zzd == null) {
            return true;
        }
        if (!((Boolean) zzay.zzc().zzb(zzbhy.zzhr)).booleanValue() || !this.zzd.canGoBack()) {
            boolean zzaE = this.zzd.zzaE();
            if (!zzaE) {
                this.zzd.zzd("onbackblocked", Collections.emptyMap());
            }
            return zzaE;
        }
        this.zzd.goBack();
        return false;
    }

    public final void zzb() {
        this.zzn = 3;
        this.zzb.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && adOverlayInfoParcel.zzk == 5) {
            this.zzb.overridePendingTransition(0, 0);
        }
    }

    public final void zzbJ() {
        this.zzn = 2;
        this.zzb.finish();
    }

    @VisibleForTesting
    public final void zzc() {
        zzcli zzcli;
        zzo zzo2;
        if (!this.zzt) {
            this.zzt = true;
            zzcli zzcli2 = this.zzd;
            if (zzcli2 != null) {
                this.zzl.removeView(zzcli2.zzH());
                zzh zzh2 = this.zze;
                if (zzh2 != null) {
                    this.zzd.zzam(zzh2.zzd);
                    this.zzd.zzap(false);
                    ViewGroup viewGroup = this.zze.zzc;
                    View zzH = this.zzd.zzH();
                    zzh zzh3 = this.zze;
                    viewGroup.addView(zzH, zzh3.zza, zzh3.zzb);
                    this.zze = null;
                } else if (this.zzb.getApplicationContext() != null) {
                    this.zzd.zzam(this.zzb.getApplicationContext());
                }
                this.zzd = null;
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
            if (!(adOverlayInfoParcel == null || (zzo2 = adOverlayInfoParcel.zzc) == null)) {
                zzo2.zzf(this.zzn);
            }
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
            if (adOverlayInfoParcel2 != null && (zzcli = adOverlayInfoParcel2.zzd) != null) {
                zzH(zzcli.zzS(), this.zzc.zzd.zzH());
            }
        }
    }

    public final void zzd() {
        this.zzl.zzb = true;
    }

    public final void zze() {
        this.zzd.zzZ();
    }

    public final void zzf() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && this.zzg) {
            zzy(adOverlayInfoParcel.zzj);
        }
        if (this.zzh != null) {
            this.zzb.setContentView(this.zzl);
            this.zzr = true;
            this.zzh.removeAllViews();
            this.zzh = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.zzi;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.zzi = null;
        }
        this.zzg = false;
    }

    public final void zzg(int i, int i2, Intent intent) {
    }

    public final void zzh() {
        this.zzn = 1;
    }

    public final void zzj(IObjectWrapper iObjectWrapper) {
        zzG((Configuration) ObjectWrapper.unwrap(iObjectWrapper));
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0071 A[Catch:{ zzf -> 0x00f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c4 A[Catch:{ zzf -> 0x00f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00e9 A[Catch:{ zzf -> 0x00f5 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void zzk(android.os.Bundle r9) {
        /*
            r8 = this;
            android.app.Activity r0 = r8.zzb
            r1 = 1
            r0.requestWindowFeature(r1)
            r0 = 0
            if (r9 == 0) goto L_0x0013
            java.lang.String r2 = "com.google.android.gms.ads.internal.overlay.hasResumed"
            boolean r2 = r9.getBoolean(r2, r0)
            if (r2 == 0) goto L_0x0013
            r2 = 1
            goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            r8.zzj = r2
            r2 = 4
            android.app.Activity r3 = r8.zzb     // Catch:{ zzf -> 0x00f5 }
            android.content.Intent r3 = r3.getIntent()     // Catch:{ zzf -> 0x00f5 }
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel.zza(r3)     // Catch:{ zzf -> 0x00f5 }
            r8.zzc = r3     // Catch:{ zzf -> 0x00f5 }
            if (r3 == 0) goto L_0x00ed
            com.google.android.gms.internal.ads.zzcfo r3 = r3.zzm     // Catch:{ zzf -> 0x00f5 }
            int r3 = r3.zzc     // Catch:{ zzf -> 0x00f5 }
            r4 = 7500000(0x7270e0, float:1.0509738E-38)
            if (r3 <= r4) goto L_0x0030
            r8.zzn = r2     // Catch:{ zzf -> 0x00f5 }
        L_0x0030:
            android.app.Activity r3 = r8.zzb     // Catch:{ zzf -> 0x00f5 }
            android.content.Intent r3 = r3.getIntent()     // Catch:{ zzf -> 0x00f5 }
            if (r3 == 0) goto L_0x0046
            android.app.Activity r3 = r8.zzb     // Catch:{ zzf -> 0x00f5 }
            android.content.Intent r3 = r3.getIntent()     // Catch:{ zzf -> 0x00f5 }
            java.lang.String r4 = "shouldCallOnOverlayOpened"
            boolean r3 = r3.getBooleanExtra(r4, r1)     // Catch:{ zzf -> 0x00f5 }
            r8.zzu = r3     // Catch:{ zzf -> 0x00f5 }
        L_0x0046:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r8.zzc     // Catch:{ zzf -> 0x00f5 }
            com.google.android.gms.ads.internal.zzj r4 = r3.zzo     // Catch:{ zzf -> 0x00f5 }
            r5 = 5
            if (r4 == 0) goto L_0x0054
            boolean r6 = r4.zza     // Catch:{ zzf -> 0x00f5 }
            r8.zzk = r6     // Catch:{ zzf -> 0x00f5 }
            if (r6 == 0) goto L_0x006f
            goto L_0x005a
        L_0x0054:
            int r6 = r3.zzk     // Catch:{ zzf -> 0x00f5 }
            if (r6 != r5) goto L_0x006d
            r8.zzk = r1     // Catch:{ zzf -> 0x00f5 }
        L_0x005a:
            int r3 = r3.zzk     // Catch:{ zzf -> 0x00f5 }
            if (r3 == r5) goto L_0x006f
            int r3 = r4.zzf     // Catch:{ zzf -> 0x00f5 }
            r4 = -1
            if (r3 == r4) goto L_0x006f
            com.google.android.gms.ads.internal.overlay.zzk r3 = new com.google.android.gms.ads.internal.overlay.zzk     // Catch:{ zzf -> 0x00f5 }
            r4 = 0
            r3.<init>(r8, r4)     // Catch:{ zzf -> 0x00f5 }
            r3.zzb()     // Catch:{ zzf -> 0x00f5 }
            goto L_0x006f
        L_0x006d:
            r8.zzk = r0     // Catch:{ zzf -> 0x00f5 }
        L_0x006f:
            if (r9 != 0) goto L_0x009d
            boolean r9 = r8.zzu     // Catch:{ zzf -> 0x00f5 }
            if (r9 == 0) goto L_0x0087
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r9 = r8.zzc     // Catch:{ zzf -> 0x00f5 }
            com.google.android.gms.internal.ads.zzdcf r9 = r9.zzx     // Catch:{ zzf -> 0x00f5 }
            if (r9 == 0) goto L_0x007e
            r9.zzd()     // Catch:{ zzf -> 0x00f5 }
        L_0x007e:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r9 = r8.zzc     // Catch:{ zzf -> 0x00f5 }
            com.google.android.gms.ads.internal.overlay.zzo r9 = r9.zzc     // Catch:{ zzf -> 0x00f5 }
            if (r9 == 0) goto L_0x0087
            r9.zzb()     // Catch:{ zzf -> 0x00f5 }
        L_0x0087:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r9 = r8.zzc     // Catch:{ zzf -> 0x00f5 }
            int r3 = r9.zzk     // Catch:{ zzf -> 0x00f5 }
            if (r3 == r1) goto L_0x009d
            com.google.android.gms.ads.internal.client.zza r9 = r9.zzb     // Catch:{ zzf -> 0x00f5 }
            if (r9 == 0) goto L_0x0094
            r9.onAdClicked()     // Catch:{ zzf -> 0x00f5 }
        L_0x0094:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r9 = r8.zzc     // Catch:{ zzf -> 0x00f5 }
            com.google.android.gms.internal.ads.zzdjf r9 = r9.zzy     // Catch:{ zzf -> 0x00f5 }
            if (r9 == 0) goto L_0x009d
            r9.zzq()     // Catch:{ zzf -> 0x00f5 }
        L_0x009d:
            com.google.android.gms.ads.internal.overlay.zzg r9 = new com.google.android.gms.ads.internal.overlay.zzg     // Catch:{ zzf -> 0x00f5 }
            android.app.Activity r3 = r8.zzb     // Catch:{ zzf -> 0x00f5 }
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r4 = r8.zzc     // Catch:{ zzf -> 0x00f5 }
            java.lang.String r6 = r4.zzn     // Catch:{ zzf -> 0x00f5 }
            com.google.android.gms.internal.ads.zzcfo r7 = r4.zzm     // Catch:{ zzf -> 0x00f5 }
            java.lang.String r7 = r7.zza     // Catch:{ zzf -> 0x00f5 }
            java.lang.String r4 = r4.zzw     // Catch:{ zzf -> 0x00f5 }
            r9.<init>(r3, r6, r7, r4)     // Catch:{ zzf -> 0x00f5 }
            r8.zzl = r9     // Catch:{ zzf -> 0x00f5 }
            r3 = 1000(0x3e8, float:1.401E-42)
            r9.setId(r3)     // Catch:{ zzf -> 0x00f5 }
            com.google.android.gms.ads.internal.util.zzaa r9 = com.google.android.gms.ads.internal.zzt.zzq()     // Catch:{ zzf -> 0x00f5 }
            android.app.Activity r3 = r8.zzb     // Catch:{ zzf -> 0x00f5 }
            r9.zzi(r3)     // Catch:{ zzf -> 0x00f5 }
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r9 = r8.zzc     // Catch:{ zzf -> 0x00f5 }
            int r3 = r9.zzk     // Catch:{ zzf -> 0x00f5 }
            if (r3 == r1) goto L_0x00e9
            r4 = 2
            if (r3 == r4) goto L_0x00dc
            r9 = 3
            if (r3 == r9) goto L_0x00d8
            if (r3 != r5) goto L_0x00d0
            r8.zzB(r0)     // Catch:{ zzf -> 0x00f5 }
            return
        L_0x00d0:
            com.google.android.gms.ads.internal.overlay.zzf r9 = new com.google.android.gms.ads.internal.overlay.zzf     // Catch:{ zzf -> 0x00f5 }
            java.lang.String r0 = "Could not determine ad overlay type."
            r9.<init>(r0)     // Catch:{ zzf -> 0x00f5 }
            throw r9     // Catch:{ zzf -> 0x00f5 }
        L_0x00d8:
            r8.zzB(r1)     // Catch:{ zzf -> 0x00f5 }
            return
        L_0x00dc:
            com.google.android.gms.ads.internal.overlay.zzh r1 = new com.google.android.gms.ads.internal.overlay.zzh     // Catch:{ zzf -> 0x00f5 }
            com.google.android.gms.internal.ads.zzcli r9 = r9.zzd     // Catch:{ zzf -> 0x00f5 }
            r1.<init>(r9)     // Catch:{ zzf -> 0x00f5 }
            r8.zze = r1     // Catch:{ zzf -> 0x00f5 }
            r8.zzB(r0)     // Catch:{ zzf -> 0x00f5 }
            return
        L_0x00e9:
            r8.zzB(r0)     // Catch:{ zzf -> 0x00f5 }
            return
        L_0x00ed:
            com.google.android.gms.ads.internal.overlay.zzf r9 = new com.google.android.gms.ads.internal.overlay.zzf     // Catch:{ zzf -> 0x00f5 }
            java.lang.String r0 = "Could not get info for ad overlay."
            r9.<init>(r0)     // Catch:{ zzf -> 0x00f5 }
            throw r9     // Catch:{ zzf -> 0x00f5 }
        L_0x00f5:
            r9 = move-exception
            java.lang.String r9 = r9.getMessage()
            com.google.android.gms.internal.ads.zzcfi.zzj(r9)
            r8.zzn = r2
            android.app.Activity r9 = r8.zzb
            r9.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzl.zzk(android.os.Bundle):void");
    }

    public final void zzl() {
        zzcli zzcli = this.zzd;
        if (zzcli != null) {
            try {
                this.zzl.removeView(zzcli.zzH());
            } catch (NullPointerException unused) {
            }
        }
        zzD();
    }

    public final void zzm() {
        if (this.zzm) {
            this.zzm = false;
            zze();
        }
    }

    public final void zzn() {
        zzo zzo2;
        zzf();
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (!(adOverlayInfoParcel == null || (zzo2 = adOverlayInfoParcel.zzc) == null)) {
            zzo2.zzbr();
        }
        if (!((Boolean) zzay.zzc().zzb(zzbhy.zzdR)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzD();
    }

    public final void zzo() {
    }

    public final void zzp() {
        zzo zzo2;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (!(adOverlayInfoParcel == null || (zzo2 = adOverlayInfoParcel.zzc) == null)) {
            zzo2.zzbK();
        }
        zzG(this.zzb.getResources().getConfiguration());
        if (!((Boolean) zzay.zzc().zzb(zzbhy.zzdR)).booleanValue()) {
            zzcli zzcli = this.zzd;
            if (zzcli == null || zzcli.zzaB()) {
                zzcfi.zzj("The webview does not exist. Ignoring action.");
            } else {
                this.zzd.onResume();
            }
        }
    }

    public final void zzq(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzj);
    }

    public final void zzr() {
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzdR)).booleanValue()) {
            zzcli zzcli = this.zzd;
            if (zzcli == null || zzcli.zzaB()) {
                zzcfi.zzj("The webview does not exist. Ignoring action.");
            } else {
                this.zzd.onResume();
            }
        }
    }

    public final void zzs() {
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzdR)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzD();
    }

    public final void zzt() {
        zzo zzo2;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzo2 = adOverlayInfoParcel.zzc) != null) {
            zzo2.zze();
        }
    }

    public final void zzu(boolean z) {
        boolean z2;
        int i;
        int i2;
        int intValue = ((Integer) zzay.zzc().zzb(zzbhy.zzdT)).intValue();
        int i3 = 0;
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzaU)).booleanValue() || z) {
            z2 = true;
        } else {
            z2 = false;
        }
        zzq zzq2 = new zzq();
        zzq2.zzd = 50;
        if (true != z2) {
            i = 0;
        } else {
            i = intValue;
        }
        zzq2.zza = i;
        if (true != z2) {
            i3 = intValue;
        }
        zzq2.zzb = i3;
        zzq2.zzc = intValue;
        this.zzf = new zzr(this.zzb, zzq2, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        if (true != z2) {
            i2 = 9;
        } else {
            i2 = 11;
        }
        layoutParams.addRule(i2);
        zzw(z, this.zzc.zzg);
        this.zzl.addView(this.zzf, layoutParams);
    }

    public final void zzv() {
        this.zzr = true;
    }

    public final void zzw(boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        AdOverlayInfoParcel adOverlayInfoParcel;
        zzj zzj2;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        zzj zzj3;
        boolean z5 = true;
        if (!((Boolean) zzay.zzc().zzb(zzbhy.zzaS)).booleanValue() || (adOverlayInfoParcel2 = this.zzc) == null || (zzj3 = adOverlayInfoParcel2.zzo) == null || !zzj3.zzh) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!((Boolean) zzay.zzc().zzb(zzbhy.zzaT)).booleanValue() || (adOverlayInfoParcel = this.zzc) == null || (zzj2 = adOverlayInfoParcel.zzo) == null || !zzj2.zzi) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z && z2 && z3 && !z4) {
            new zzbwu(this.zzd, "useCustomClose").zzg("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        zzr zzr2 = this.zzf;
        if (zzr2 != null) {
            if (!z4 && (!z2 || z3)) {
                z5 = false;
            }
            zzr2.zzb(z5);
        }
    }

    public final void zzx() {
        this.zzl.removeView(this.zzf);
        zzu(true);
    }

    public final void zzy(int i) {
        if (this.zzb.getApplicationInfo().targetSdkVersion >= ((Integer) zzay.zzc().zzb(zzbhy.zzeU)).intValue()) {
            if (this.zzb.getApplicationInfo().targetSdkVersion <= ((Integer) zzay.zzc().zzb(zzbhy.zzeV)).intValue()) {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= ((Integer) zzay.zzc().zzb(zzbhy.zzeW)).intValue()) {
                    if (i2 <= ((Integer) zzay.zzc().zzb(zzbhy.zzeX)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.zzb.setRequestedOrientation(i);
        } catch (Throwable th) {
            zzt.zzo().zzs(th, "AdOverlay.setRequestedOrientation");
        }
    }

    public final void zzz(boolean z) {
        if (z) {
            this.zzl.setBackgroundColor(0);
        } else {
            this.zzl.setBackgroundColor(-16777216);
        }
    }
}
