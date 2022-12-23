package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.appboy.models.InAppMessageBase;
import com.appsflyer.ServerParameters;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.ads.internal.util.zzcb;
import com.google.android.gms.ads.internal.util.zzce;
import com.google.android.gms.ads.internal.util.zzci;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzm;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.unity3d.ads.metadata.MediationMetaData;
import com.usebutton.sdk.internal.util.DiskLruCache;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressLint({"ViewConstructor"})
@VisibleForTesting
final class zzcmb extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, zzcli {
    public static final /* synthetic */ int zza = 0;
    private boolean zzA;
    private boolean zzB;
    private zzbkn zzC;
    private zzbkl zzD;
    private zzbbz zzE;
    private int zzF;
    /* access modifiers changed from: private */
    public int zzG;
    private zzbik zzH;
    private final zzbik zzI;
    private zzbik zzJ;
    private final zzbil zzK;
    private int zzL;
    private int zzM;
    private int zzN;
    private zzl zzO;
    private boolean zzP;
    private final zzci zzQ;
    private int zzR = -1;
    private int zzS = -1;
    private int zzT = -1;
    private int zzU = -1;
    private Map zzV;
    private final WindowManager zzW;
    private final zzbdl zzX;
    private final zzcmw zzb;
    private final zzaoc zzc;
    private final zzbix zzd;
    private final zzcfo zze;
    private com.google.android.gms.ads.internal.zzl zzf;
    private final zza zzg;
    private final DisplayMetrics zzh;
    private final float zzi;
    private zzfbg zzj;
    private zzfbj zzk;
    private boolean zzl = false;
    private boolean zzm = false;
    private zzclp zzn;
    private zzl zzo;
    private IObjectWrapper zzp;
    private zzcmx zzq;
    private final String zzr;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private Boolean zzw;
    private boolean zzx = true;
    private final String zzy = "";
    private zzcme zzz;

    @VisibleForTesting
    public zzcmb(zzcmw zzcmw, zzcmx zzcmx, String str, boolean z, boolean z2, zzaoc zzaoc, zzbix zzbix, zzcfo zzcfo, zzbin zzbin, com.google.android.gms.ads.internal.zzl zzl2, zza zza2, zzbdl zzbdl, zzfbg zzfbg, zzfbj zzfbj) {
        super(zzcmw);
        zzfbj zzfbj2;
        this.zzb = zzcmw;
        this.zzq = zzcmx;
        this.zzr = str;
        this.zzu = z;
        this.zzc = zzaoc;
        this.zzd = zzbix;
        this.zze = zzcfo;
        this.zzf = zzl2;
        this.zzg = zza2;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.zzW = windowManager;
        zzt.zzp();
        DisplayMetrics zzr2 = zzs.zzr(windowManager);
        this.zzh = zzr2;
        this.zzi = zzr2.density;
        this.zzX = zzbdl;
        this.zzj = zzfbg;
        this.zzk = zzfbj;
        this.zzQ = new zzci(zzcmw.zza(), this, this, (ViewTreeObserver.OnScrollChangedListener) null);
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            zzcfi.zzh("Unable to enable Javascript.", e);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setMixedContentMode(2);
        settings.setUserAgentString(zzt.zzp().zzc(zzcmw, zzcfo.zza));
        zzt.zzp();
        Context context = getContext();
        zzcb.zza(context, new zzm(settings, context));
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setDownloadListener(this);
        zzaU();
        addJavascriptInterface(new zzcmi(this, new zzcmh(this), (byte[]) null), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        zzbc();
        zzbil zzbil = new zzbil(new zzbin(true, "make_wv", this.zzr));
        this.zzK = zzbil;
        zzbil.zza().zzc((zzbin) null);
        if (!(!((Boolean) zzay.zzc().zzb(zzbhy.zzbB)).booleanValue() || (zzfbj2 = this.zzk) == null || zzfbj2.zzb == null)) {
            zzbil.zza().zzd("gqi", this.zzk.zzb);
        }
        zzbil.zza();
        zzbik zzf2 = zzbin.zzf();
        this.zzI = zzf2;
        zzbil.zzb("native:view_create", zzf2);
        this.zzJ = null;
        this.zzH = null;
        zzce.zza().zzb(zzcmw);
        zzt.zzo().zzq();
    }

    private final synchronized void zzaU() {
        zzfbg zzfbg = this.zzj;
        if (zzfbg != null) {
            if (zzfbg.zzao) {
                zzcfi.zze("Disabling hardware acceleration on an overlay.");
                zzaW();
                return;
            }
        }
        if (!this.zzu) {
            if (!this.zzq.zzi()) {
                zzcfi.zze("Enabling hardware acceleration on an AdView.");
                zzaY();
                return;
            }
        }
        zzcfi.zze("Enabling hardware acceleration on an overlay.");
        zzaY();
    }

    private final synchronized void zzaV() {
        if (!this.zzP) {
            this.zzP = true;
            zzt.zzo().zzp();
        }
    }

    private final synchronized void zzaW() {
        if (!this.zzv) {
            setLayerType(1, (Paint) null);
        }
        this.zzv = true;
    }

    private final void zzaX(boolean z) {
        String str;
        HashMap hashMap = new HashMap();
        if (true != z) {
            str = "0";
        } else {
            str = DiskLruCache.VERSION_1;
        }
        hashMap.put("isVisible", str);
        zzd("onAdVisibilityChanged", hashMap);
    }

    private final synchronized void zzaY() {
        if (this.zzv) {
            setLayerType(0, (Paint) null);
        }
        this.zzv = false;
    }

    private final synchronized void zzaZ(String str) {
        try {
            super.loadUrl("about:blank");
        } catch (Throwable th) {
            zzt.zzo().zzt(th, "AdWebViewImpl.loadUrlUnsafe");
            zzcfi.zzk("Could not call loadUrl in destroy(). ", th);
        }
    }

    private final void zzba() {
        zzbif.zza(this.zzK.zza(), this.zzI, "aeh2");
    }

    private final synchronized void zzbb() {
        Map map = this.zzV;
        if (map != null) {
            for (zzcju release : map.values()) {
                release.release();
            }
        }
        this.zzV = null;
    }

    private final void zzbc() {
        zzbil zzbil = this.zzK;
        if (zzbil != null) {
            zzbin zza2 = zzbil.zza();
            zzbid zzf2 = zzt.zzo().zzf();
            if (zzf2 != null) {
                zzf2.zzf(zza2);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:9|10|11|12) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        zzaS(java.lang.Boolean.FALSE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void zzbd() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzcer r0 = com.google.android.gms.ads.internal.zzt.zzo()     // Catch:{ all -> 0x0023 }
            java.lang.Boolean r0 = r0.zzk()     // Catch:{ all -> 0x0023 }
            r2.zzw = r0     // Catch:{ all -> 0x0023 }
            if (r0 != 0) goto L_0x0021
            java.lang.String r0 = "(function(){})()"
            r1 = 0
            r2.evaluateJavascript(r0, r1)     // Catch:{ IllegalStateException -> 0x001a }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ IllegalStateException -> 0x001a }
            r2.zzaS(r0)     // Catch:{ IllegalStateException -> 0x001a }
            monitor-exit(r2)
            return
        L_0x001a:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0023 }
            r2.zzaS(r0)     // Catch:{ all -> 0x0023 }
            monitor-exit(r2)
            return
        L_0x0021:
            monitor-exit(r2)
            return
        L_0x0023:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcmb.zzbd():void");
    }

    public final synchronized void destroy() {
        zzbc();
        this.zzQ.zza();
        zzl zzl2 = this.zzo;
        if (zzl2 != null) {
            zzl2.zzb();
            this.zzo.zzl();
            this.zzo = null;
        }
        this.zzp = null;
        this.zzn.zzy();
        this.zzE = null;
        this.zzf = null;
        setOnClickListener((View.OnClickListener) null);
        setOnTouchListener((View.OnTouchListener) null);
        if (!this.zzt) {
            zzt.zzy().zzd(this);
            zzbb();
            this.zzt = true;
            if (((Boolean) zzay.zzc().zzb(zzbhy.zzig)).booleanValue()) {
                zze.zza("Initiating WebView self destruct sequence in 3...");
                zze.zza("Loading blank page in WebView, 2...");
                zzaZ("about:blank");
                return;
            }
            zze.zza("Destroying the WebView immediately...");
            zzW();
        }
    }

    public final synchronized void evaluateJavascript(String str, ValueCallback valueCallback) {
        if (zzaB()) {
            zzcfi.zzl("#004 The webview is destroyed. Ignoring action.", (Throwable) null);
            if (valueCallback != null) {
                valueCallback.onReceiveValue((Object) null);
                return;
            }
            return;
        }
        super.evaluateJavascript(str, valueCallback);
    }

    public final void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!this.zzt) {
                    this.zzn.zzy();
                    zzt.zzy().zzd(this);
                    zzbb();
                    zzaV();
                }
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    public final synchronized void loadData(String str, String str2, String str3) {
        if (!zzaB()) {
            super.loadData(str, str2, str3);
        } else {
            zzcfi.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!zzaB()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            zzcfi.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final synchronized void loadUrl(String str) {
        if (!zzaB()) {
            try {
                super.loadUrl(str);
            } catch (Throwable th) {
                zzt.zzo().zzt(th, "AdWebViewImpl.loadUrl");
                zzcfi.zzk("Could not call loadUrl. ", th);
            }
        } else {
            zzcfi.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final void onAdClicked() {
        zzclp zzclp = this.zzn;
        if (zzclp != null) {
            zzclp.onAdClicked();
        }
    }

    public final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!zzaB()) {
            this.zzQ.zzc();
        }
        boolean z = this.zzA;
        zzclp zzclp = this.zzn;
        if (zzclp != null && zzclp.zzK()) {
            if (!this.zzB) {
                this.zzn.zza();
                this.zzn.zzb();
                this.zzB = true;
            }
            zzaT();
            z = true;
        }
        zzaX(z);
    }

    public final void onDetachedFromWindow() {
        zzclp zzclp;
        synchronized (this) {
            if (!zzaB()) {
                this.zzQ.zzd();
            }
            super.onDetachedFromWindow();
            if (this.zzB && (zzclp = this.zzn) != null && zzclp.zzK() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.zzn.zza();
                this.zzn.zzb();
                this.zzB = false;
            }
        }
        zzaX(false);
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            zzt.zzp();
            zzs.zzI(getContext(), intent);
        } catch (ActivityNotFoundException unused) {
            zzcfi.zze("Couldn't find an Activity to view url/mimetype: " + str + " / " + str4);
        }
    }

    @TargetApi(21)
    public final void onDraw(Canvas canvas) {
        if (!zzaB()) {
            if (Build.VERSION.SDK_INT != 21 || !canvas.isHardwareAccelerated() || isAttachedToWindow()) {
                super.onDraw(canvas);
            }
        }
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > BitmapDescriptorFactory.HUE_RED && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < BitmapDescriptorFactory.HUE_RED && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > BitmapDescriptorFactory.HUE_RED && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < BitmapDescriptorFactory.HUE_RED && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    public final void onGlobalLayout() {
        boolean zzaT = zzaT();
        zzl zzN2 = zzN();
        if (zzN2 != null && zzaT) {
            zzN2.zzm();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01bb A[SYNTHETIC, Splitter:B:111:0x01bb] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0138  */
    @android.annotation.SuppressLint({"DrawAllocation"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.zzaB()     // Catch:{ all -> 0x01e1 }
            r1 = 0
            if (r0 == 0) goto L_0x000d
            r8.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01e1 }
            monitor-exit(r8)
            return
        L_0x000d:
            boolean r0 = r8.isInEditMode()     // Catch:{ all -> 0x01e1 }
            if (r0 != 0) goto L_0x01dc
            boolean r0 = r8.zzu     // Catch:{ all -> 0x01e1 }
            if (r0 != 0) goto L_0x01dc
            com.google.android.gms.internal.ads.zzcmx r0 = r8.zzq     // Catch:{ all -> 0x01e1 }
            boolean r0 = r0.zzf()     // Catch:{ all -> 0x01e1 }
            if (r0 == 0) goto L_0x0021
            goto L_0x01dc
        L_0x0021:
            com.google.android.gms.internal.ads.zzcmx r0 = r8.zzq     // Catch:{ all -> 0x01e1 }
            boolean r0 = r0.zzh()     // Catch:{ all -> 0x01e1 }
            if (r0 == 0) goto L_0x002e
            super.onMeasure(r9, r10)     // Catch:{ all -> 0x01e1 }
            monitor-exit(r8)
            return
        L_0x002e:
            com.google.android.gms.internal.ads.zzcmx r0 = r8.zzq     // Catch:{ all -> 0x01e1 }
            boolean r0 = r0.zzj()     // Catch:{ all -> 0x01e1 }
            if (r0 == 0) goto L_0x0095
            com.google.android.gms.internal.ads.zzbhq r0 = com.google.android.gms.internal.ads.zzbhy.zzcS     // Catch:{ all -> 0x01e1 }
            com.google.android.gms.internal.ads.zzbhw r2 = com.google.android.gms.ads.internal.client.zzay.zzc()     // Catch:{ all -> 0x01e1 }
            java.lang.Object r0 = r2.zzb(r0)     // Catch:{ all -> 0x01e1 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01e1 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01e1 }
            if (r0 == 0) goto L_0x004d
            super.onMeasure(r9, r10)     // Catch:{ all -> 0x01e1 }
            monitor-exit(r8)
            return
        L_0x004d:
            com.google.android.gms.internal.ads.zzcme r0 = r8.zzs()     // Catch:{ all -> 0x01e1 }
            r2 = 0
            if (r0 == 0) goto L_0x0059
            float r0 = r0.zze()     // Catch:{ all -> 0x01e1 }
            goto L_0x005a
        L_0x0059:
            r0 = 0
        L_0x005a:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x0063
            super.onMeasure(r9, r10)     // Catch:{ all -> 0x01e1 }
            monitor-exit(r8)
            return
        L_0x0063:
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01e1 }
            int r10 = android.view.View.MeasureSpec.getSize(r10)     // Catch:{ all -> 0x01e1 }
            float r2 = (float) r10     // Catch:{ all -> 0x01e1 }
            float r2 = r2 * r0
            int r2 = (int) r2     // Catch:{ all -> 0x01e1 }
            float r3 = (float) r9     // Catch:{ all -> 0x01e1 }
            float r3 = r3 / r0
            int r3 = (int) r3     // Catch:{ all -> 0x01e1 }
            if (r10 != 0) goto L_0x007e
            if (r3 == 0) goto L_0x007d
            float r10 = (float) r3     // Catch:{ all -> 0x01e1 }
            float r10 = r10 * r0
            int r2 = (int) r10     // Catch:{ all -> 0x01e1 }
            r1 = r9
            r10 = r3
            goto L_0x0088
        L_0x007d:
            r10 = 0
        L_0x007e:
            if (r9 != 0) goto L_0x0087
            if (r2 == 0) goto L_0x0088
            float r9 = (float) r2     // Catch:{ all -> 0x01e1 }
            float r9 = r9 / r0
            int r3 = (int) r9     // Catch:{ all -> 0x01e1 }
            r1 = r2
            goto L_0x0088
        L_0x0087:
            r1 = r9
        L_0x0088:
            int r9 = java.lang.Math.min(r2, r1)     // Catch:{ all -> 0x01e1 }
            int r10 = java.lang.Math.min(r3, r10)     // Catch:{ all -> 0x01e1 }
            r8.setMeasuredDimension(r9, r10)     // Catch:{ all -> 0x01e1 }
            monitor-exit(r8)
            return
        L_0x0095:
            com.google.android.gms.internal.ads.zzcmx r0 = r8.zzq     // Catch:{ all -> 0x01e1 }
            boolean r0 = r0.zzg()     // Catch:{ all -> 0x01e1 }
            if (r0 == 0) goto L_0x00de
            com.google.android.gms.internal.ads.zzbhq r0 = com.google.android.gms.internal.ads.zzbhy.zzcY     // Catch:{ all -> 0x01e1 }
            com.google.android.gms.internal.ads.zzbhw r1 = com.google.android.gms.ads.internal.client.zzay.zzc()     // Catch:{ all -> 0x01e1 }
            java.lang.Object r0 = r1.zzb(r0)     // Catch:{ all -> 0x01e1 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01e1 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01e1 }
            if (r0 == 0) goto L_0x00b4
            super.onMeasure(r9, r10)     // Catch:{ all -> 0x01e1 }
            monitor-exit(r8)
            return
        L_0x00b4:
            com.google.android.gms.internal.ads.zzclz r0 = new com.google.android.gms.internal.ads.zzclz     // Catch:{ all -> 0x01e1 }
            r0.<init>(r8)     // Catch:{ all -> 0x01e1 }
            java.lang.String r1 = "/contentHeight"
            r8.zzaf(r1, r0)     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = "(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();"
            r8.zzaQ(r0)     // Catch:{ all -> 0x01e1 }
            android.util.DisplayMetrics r0 = r8.zzh     // Catch:{ all -> 0x01e1 }
            float r0 = r0.density     // Catch:{ all -> 0x01e1 }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01e1 }
            int r1 = r8.zzG     // Catch:{ all -> 0x01e1 }
            r2 = -1
            if (r1 == r2) goto L_0x00d5
            float r10 = (float) r1     // Catch:{ all -> 0x01e1 }
            float r10 = r10 * r0
            int r10 = (int) r10     // Catch:{ all -> 0x01e1 }
            goto L_0x00d9
        L_0x00d5:
            int r10 = android.view.View.MeasureSpec.getSize(r10)     // Catch:{ all -> 0x01e1 }
        L_0x00d9:
            r8.setMeasuredDimension(r9, r10)     // Catch:{ all -> 0x01e1 }
            monitor-exit(r8)
            return
        L_0x00de:
            com.google.android.gms.internal.ads.zzcmx r0 = r8.zzq     // Catch:{ all -> 0x01e1 }
            boolean r0 = r0.zzi()     // Catch:{ all -> 0x01e1 }
            if (r0 == 0) goto L_0x00f1
            android.util.DisplayMetrics r9 = r8.zzh     // Catch:{ all -> 0x01e1 }
            int r10 = r9.widthPixels     // Catch:{ all -> 0x01e1 }
            int r9 = r9.heightPixels     // Catch:{ all -> 0x01e1 }
            r8.setMeasuredDimension(r10, r9)     // Catch:{ all -> 0x01e1 }
            monitor-exit(r8)
            return
        L_0x00f1:
            int r0 = android.view.View.MeasureSpec.getMode(r9)     // Catch:{ all -> 0x01e1 }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01e1 }
            int r2 = android.view.View.MeasureSpec.getMode(r10)     // Catch:{ all -> 0x01e1 }
            int r10 = android.view.View.MeasureSpec.getSize(r10)     // Catch:{ all -> 0x01e1 }
            r3 = 2147483647(0x7fffffff, float:NaN)
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r5) goto L_0x0111
            if (r0 != r4) goto L_0x010d
            goto L_0x0111
        L_0x010d:
            r0 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0112
        L_0x0111:
            r0 = r9
        L_0x0112:
            if (r2 == r5) goto L_0x0116
            if (r2 != r4) goto L_0x0117
        L_0x0116:
            r3 = r10
        L_0x0117:
            com.google.android.gms.internal.ads.zzcmx r2 = r8.zzq     // Catch:{ all -> 0x01e1 }
            int r4 = r2.zzb     // Catch:{ all -> 0x01e1 }
            r5 = 1
            if (r4 > r0) goto L_0x0125
            int r2 = r2.zza     // Catch:{ all -> 0x01e1 }
            if (r2 <= r3) goto L_0x0123
            goto L_0x0125
        L_0x0123:
            r2 = 0
            goto L_0x0126
        L_0x0125:
            r2 = 1
        L_0x0126:
            com.google.android.gms.internal.ads.zzbhq r4 = com.google.android.gms.internal.ads.zzbhy.zzes     // Catch:{ all -> 0x01e1 }
            com.google.android.gms.internal.ads.zzbhw r6 = com.google.android.gms.ads.internal.client.zzay.zzc()     // Catch:{ all -> 0x01e1 }
            java.lang.Object r4 = r6.zzb(r4)     // Catch:{ all -> 0x01e1 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x01e1 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x01e1 }
            if (r4 == 0) goto L_0x0154
            com.google.android.gms.internal.ads.zzcmx r4 = r8.zzq     // Catch:{ all -> 0x01e1 }
            int r6 = r4.zzb     // Catch:{ all -> 0x01e1 }
            float r7 = r8.zzi     // Catch:{ all -> 0x01e1 }
            float r6 = (float) r6     // Catch:{ all -> 0x01e1 }
            float r6 = r6 / r7
            float r0 = (float) r0     // Catch:{ all -> 0x01e1 }
            float r0 = r0 / r7
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0152
            int r0 = r4.zza     // Catch:{ all -> 0x01e1 }
            float r0 = (float) r0     // Catch:{ all -> 0x01e1 }
            float r0 = r0 / r7
            float r3 = (float) r3     // Catch:{ all -> 0x01e1 }
            float r3 = r3 / r7
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0152
            r0 = 1
            goto L_0x0153
        L_0x0152:
            r0 = 0
        L_0x0153:
            r2 = r2 & r0
        L_0x0154:
            r0 = 8
            if (r2 == 0) goto L_0x01bb
            com.google.android.gms.internal.ads.zzcmx r2 = r8.zzq     // Catch:{ all -> 0x01e1 }
            int r3 = r2.zzb     // Catch:{ all -> 0x01e1 }
            float r4 = r8.zzi     // Catch:{ all -> 0x01e1 }
            int r2 = r2.zza     // Catch:{ all -> 0x01e1 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e1 }
            r6.<init>()     // Catch:{ all -> 0x01e1 }
            java.lang.String r7 = "Not enough space to show ad. Needs "
            r6.append(r7)     // Catch:{ all -> 0x01e1 }
            float r3 = (float) r3     // Catch:{ all -> 0x01e1 }
            float r3 = r3 / r4
            int r3 = (int) r3     // Catch:{ all -> 0x01e1 }
            r6.append(r3)     // Catch:{ all -> 0x01e1 }
            java.lang.String r3 = "x"
            r6.append(r3)     // Catch:{ all -> 0x01e1 }
            float r2 = (float) r2     // Catch:{ all -> 0x01e1 }
            float r2 = r2 / r4
            int r2 = (int) r2     // Catch:{ all -> 0x01e1 }
            r6.append(r2)     // Catch:{ all -> 0x01e1 }
            java.lang.String r2 = " dp, but only has "
            r6.append(r2)     // Catch:{ all -> 0x01e1 }
            float r9 = (float) r9     // Catch:{ all -> 0x01e1 }
            float r9 = r9 / r4
            int r9 = (int) r9     // Catch:{ all -> 0x01e1 }
            r6.append(r9)     // Catch:{ all -> 0x01e1 }
            java.lang.String r9 = "x"
            r6.append(r9)     // Catch:{ all -> 0x01e1 }
            float r9 = (float) r10     // Catch:{ all -> 0x01e1 }
            float r9 = r9 / r4
            int r9 = (int) r9     // Catch:{ all -> 0x01e1 }
            r6.append(r9)     // Catch:{ all -> 0x01e1 }
            java.lang.String r9 = " dp."
            r6.append(r9)     // Catch:{ all -> 0x01e1 }
            java.lang.String r9 = r6.toString()     // Catch:{ all -> 0x01e1 }
            com.google.android.gms.internal.ads.zzcfi.zzj(r9)     // Catch:{ all -> 0x01e1 }
            int r9 = r8.getVisibility()     // Catch:{ all -> 0x01e1 }
            if (r9 == r0) goto L_0x01a7
            r9 = 4
            r8.setVisibility(r9)     // Catch:{ all -> 0x01e1 }
        L_0x01a7:
            r8.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01e1 }
            boolean r9 = r8.zzl     // Catch:{ all -> 0x01e1 }
            if (r9 != 0) goto L_0x01b9
            com.google.android.gms.internal.ads.zzbdl r9 = r8.zzX     // Catch:{ all -> 0x01e1 }
            r10 = 10001(0x2711, float:1.4014E-41)
            r9.zzc(r10)     // Catch:{ all -> 0x01e1 }
            r8.zzl = r5     // Catch:{ all -> 0x01e1 }
            monitor-exit(r8)
            return
        L_0x01b9:
            monitor-exit(r8)
            return
        L_0x01bb:
            int r9 = r8.getVisibility()     // Catch:{ all -> 0x01e1 }
            if (r9 == r0) goto L_0x01c4
            r8.setVisibility(r1)     // Catch:{ all -> 0x01e1 }
        L_0x01c4:
            boolean r9 = r8.zzm     // Catch:{ all -> 0x01e1 }
            if (r9 != 0) goto L_0x01d1
            com.google.android.gms.internal.ads.zzbdl r9 = r8.zzX     // Catch:{ all -> 0x01e1 }
            r10 = 10002(0x2712, float:1.4016E-41)
            r9.zzc(r10)     // Catch:{ all -> 0x01e1 }
            r8.zzm = r5     // Catch:{ all -> 0x01e1 }
        L_0x01d1:
            com.google.android.gms.internal.ads.zzcmx r9 = r8.zzq     // Catch:{ all -> 0x01e1 }
            int r10 = r9.zzb     // Catch:{ all -> 0x01e1 }
            int r9 = r9.zza     // Catch:{ all -> 0x01e1 }
            r8.setMeasuredDimension(r10, r9)     // Catch:{ all -> 0x01e1 }
            monitor-exit(r8)
            return
        L_0x01dc:
            super.onMeasure(r9, r10)     // Catch:{ all -> 0x01e1 }
            monitor-exit(r8)
            return
        L_0x01e1:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcmb.onMeasure(int, int):void");
    }

    public final void onPause() {
        if (!zzaB()) {
            try {
                super.onPause();
            } catch (Exception e) {
                zzcfi.zzh("Could not pause webview.", e);
            }
        }
    }

    public final void onResume() {
        if (!zzaB()) {
            try {
                super.onResume();
            } catch (Exception e) {
                zzcfi.zzh("Could not resume webview.", e);
            }
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.zzn.zzK() || this.zzn.zzI()) {
            zzaoc zzaoc = this.zzc;
            if (zzaoc != null) {
                zzaoc.zzd(motionEvent);
            }
            zzbix zzbix = this.zzd;
            if (zzbix != null) {
                zzbix.zzb(motionEvent);
            }
        } else {
            synchronized (this) {
                zzbkn zzbkn = this.zzC;
                if (zzbkn != null) {
                    zzbkn.zzd(motionEvent);
                }
            }
        }
        if (zzaB()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof zzclp) {
            this.zzn = (zzclp) webViewClient;
        }
    }

    public final void stopLoading() {
        if (!zzaB()) {
            try {
                super.stopLoading();
            } catch (Exception e) {
                zzcfi.zzh("Could not stop loading webview.", e);
            }
        }
    }

    public final void zzA(int i) {
        this.zzM = i;
    }

    public final void zzB(boolean z) {
        this.zzn.zzB(false);
    }

    public final synchronized void zzC(int i) {
        this.zzL = i;
    }

    public final void zzD(int i) {
    }

    public final synchronized void zzE(zzcme zzcme) {
        if (this.zzz != null) {
            zzcfi.zzg("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.zzz = zzcme;
        }
    }

    public final zzfbg zzF() {
        return this.zzj;
    }

    public final Context zzG() {
        return this.zzb.zzb();
    }

    public final View zzH() {
        return this;
    }

    public final WebView zzI() {
        return this;
    }

    public final WebViewClient zzJ() {
        return this.zzn;
    }

    public final zzaoc zzK() {
        return this.zzc;
    }

    public final synchronized zzbbz zzL() {
        return this.zzE;
    }

    public final synchronized zzbkn zzM() {
        return this.zzC;
    }

    public final synchronized zzl zzN() {
        return this.zzo;
    }

    public final synchronized zzl zzO() {
        return this.zzO;
    }

    public final /* synthetic */ zzcmv zzP() {
        return this.zzn;
    }

    public final synchronized zzcmx zzQ() {
        return this.zzq;
    }

    public final zzfbj zzR() {
        return this.zzk;
    }

    public final synchronized IObjectWrapper zzS() {
        return this.zzp;
    }

    public final zzfvj zzT() {
        zzbix zzbix = this.zzd;
        if (zzbix == null) {
            return zzfva.zzi((Object) null);
        }
        return zzbix.zza();
    }

    public final synchronized String zzU() {
        return this.zzr;
    }

    public final void zzV(zzfbg zzfbg, zzfbj zzfbj) {
        this.zzj = zzfbg;
        this.zzk = zzfbj;
    }

    public final synchronized void zzW() {
        zze.zza("Destroying WebView!");
        zzaV();
        zzs.zza.post(new zzcma(this));
    }

    public final void zzX() {
        zzba();
        HashMap hashMap = new HashMap(1);
        hashMap.put(MediationMetaData.KEY_VERSION, this.zze.zza);
        zzd("onhide", hashMap);
    }

    public final void zzY(int i) {
        if (i == 0) {
            zzbif.zza(this.zzK.zza(), this.zzI, "aebb2");
        }
        zzba();
        this.zzK.zza();
        this.zzK.zza().zzd("close_type", String.valueOf(i));
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put(MediationMetaData.KEY_VERSION, this.zze.zza);
        zzd("onhide", hashMap);
    }

    public final void zzZ() {
        if (this.zzH == null) {
            zzbif.zza(this.zzK.zza(), this.zzI, "aes2");
            this.zzK.zza();
            zzbik zzf2 = zzbin.zzf();
            this.zzH = zzf2;
            this.zzK.zzb("native:view_show", zzf2);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put(MediationMetaData.KEY_VERSION, this.zze.zza);
        zzd("onshow", hashMap);
    }

    public final void zza(String str) {
        throw null;
    }

    public final boolean zzaA(boolean z, int i) {
        destroy();
        this.zzX.zzb(new zzcly(z, i));
        this.zzX.zzc(10003);
        return true;
    }

    public final synchronized boolean zzaB() {
        return this.zzt;
    }

    public final synchronized boolean zzaC() {
        return this.zzu;
    }

    public final boolean zzaD() {
        return false;
    }

    public final synchronized boolean zzaE() {
        return this.zzx;
    }

    public final void zzaF(zzc zzc2, boolean z) {
        this.zzn.zzr(zzc2, z);
    }

    public final void zzaG(zzbr zzbr, zzeen zzeen, zzdwg zzdwg, zzfgo zzfgo, String str, String str2, int i) {
        this.zzn.zzs(zzbr, zzeen, zzdwg, zzfgo, str, str2, 14);
    }

    public final void zzaH(boolean z, int i, boolean z2) {
        this.zzn.zzt(z, i, z2);
    }

    public final void zzaI(boolean z, int i, String str, boolean z2) {
        this.zzn.zzv(z, i, str, z2);
    }

    public final void zzaJ(boolean z, int i, String str, String str2, boolean z2) {
        this.zzn.zzw(z, i, str, str2, z2);
    }

    public final zzclp zzaL() {
        return this.zzn;
    }

    @VisibleForTesting
    public final synchronized Boolean zzaM() {
        return this.zzw;
    }

    public final synchronized void zzaP(String str, ValueCallback valueCallback) {
        if (!zzaB()) {
            evaluateJavascript(str, (ValueCallback) null);
        } else {
            zzcfi.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final void zzaQ(String str) {
        if (PlatformVersion.isAtLeastKitKat()) {
            if (zzaM() == null) {
                zzbd();
            }
            if (zzaM().booleanValue()) {
                zzaP(str, (ValueCallback) null);
            } else {
                zzaR("javascript:".concat(str));
            }
        } else {
            zzaR("javascript:".concat(str));
        }
    }

    public final synchronized void zzaR(String str) {
        if (!zzaB()) {
            loadUrl(str);
        } else {
            zzcfi.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @VisibleForTesting
    public final void zzaS(Boolean bool) {
        synchronized (this) {
            this.zzw = bool;
        }
        zzt.zzo().zzu(bool);
    }

    public final boolean zzaT() {
        int i;
        int i2;
        boolean z = false;
        if (!this.zzn.zzJ() && !this.zzn.zzK()) {
            return false;
        }
        zzaw.zzb();
        DisplayMetrics displayMetrics = this.zzh;
        int zzt2 = zzcfb.zzt(displayMetrics, displayMetrics.widthPixels);
        zzaw.zzb();
        DisplayMetrics displayMetrics2 = this.zzh;
        int zzt3 = zzcfb.zzt(displayMetrics2, displayMetrics2.heightPixels);
        Activity zza2 = this.zzb.zza();
        if (zza2 == null || zza2.getWindow() == null) {
            i2 = zzt2;
            i = zzt3;
        } else {
            zzt.zzp();
            int[] zzM2 = zzs.zzM(zza2);
            zzaw.zzb();
            int zzt4 = zzcfb.zzt(this.zzh, zzM2[0]);
            zzaw.zzb();
            i = zzcfb.zzt(this.zzh, zzM2[1]);
            i2 = zzt4;
        }
        int i3 = this.zzS;
        if (i3 == zzt2 && this.zzR == zzt3 && this.zzT == i2 && this.zzU == i) {
            return false;
        }
        if (!(i3 == zzt2 && this.zzR == zzt3)) {
            z = true;
        }
        this.zzS = zzt2;
        this.zzR = zzt3;
        this.zzT = i2;
        this.zzU = i;
        new zzbwu(this, "").zzi(zzt2, zzt3, i2, i, this.zzh.density, this.zzW.getDefaultDisplay().getRotation());
        return z;
    }

    public final void zzaa() {
        throw null;
    }

    public final void zzab(boolean z) {
        this.zzn.zzh(z);
    }

    public final void zzac() {
        this.zzQ.zzb();
    }

    public final synchronized void zzad(String str, String str2, String str3) {
        String str4;
        if (!zzaB()) {
            String[] strArr = new String[1];
            String str5 = (String) zzay.zzc().zzb(zzbhy.zzN);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(MediationMetaData.KEY_VERSION, str5);
                jSONObject.put(ServerParameters.ANDROID_SDK_INT, "Google Mobile Ads");
                jSONObject.put("sdkVersion", "12.4.51-000");
                str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
            } catch (JSONException e) {
                zzcfi.zzk("Unable to build MRAID_ENV", e);
                str4 = null;
            }
            strArr[0] = str4;
            super.loadDataWithBaseURL(str, zzcmo.zza(str2, strArr), "text/html", "UTF-8", (String) null);
            return;
        }
        zzcfi.zzj("#004 The webview is destroyed. Ignoring action.");
    }

    public final void zzae() {
        if (this.zzJ == null) {
            this.zzK.zza();
            zzbik zzf2 = zzbin.zzf();
            this.zzJ = zzf2;
            this.zzK.zzb("native:view_load", zzf2);
        }
    }

    public final void zzaf(String str, zzbol zzbol) {
        zzclp zzclp = this.zzn;
        if (zzclp != null) {
            zzclp.zzx(str, zzbol);
        }
    }

    public final void zzag() {
        throw null;
    }

    public final synchronized void zzah(zzl zzl2) {
        this.zzo = zzl2;
    }

    public final synchronized void zzai(zzcmx zzcmx) {
        this.zzq = zzcmx;
        requestLayout();
    }

    public final synchronized void zzaj(zzbbz zzbbz) {
        this.zzE = zzbbz;
    }

    public final synchronized void zzak(boolean z) {
        this.zzx = z;
    }

    public final void zzal() {
        setBackgroundColor(0);
    }

    public final void zzam(Context context) {
        this.zzb.setBaseContext(context);
        this.zzQ.zze(this.zzb.zza());
    }

    public final synchronized void zzan(boolean z) {
        zzl zzl2 = this.zzo;
        if (zzl2 != null) {
            zzl2.zzw(this.zzn.zzJ(), z);
        } else {
            this.zzs = z;
        }
    }

    public final synchronized void zzao(zzbkl zzbkl) {
        this.zzD = zzbkl;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzap(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.zzu     // Catch:{ all -> 0x003a }
            r2.zzu = r3     // Catch:{ all -> 0x003a }
            r2.zzaU()     // Catch:{ all -> 0x003a }
            if (r3 == r0) goto L_0x0038
            com.google.android.gms.internal.ads.zzbhq r0 = com.google.android.gms.internal.ads.zzbhy.zzO     // Catch:{ all -> 0x003a }
            com.google.android.gms.internal.ads.zzbhw r1 = com.google.android.gms.ads.internal.client.zzay.zzc()     // Catch:{ all -> 0x003a }
            java.lang.Object r0 = r1.zzb(r0)     // Catch:{ all -> 0x003a }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x003a }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0024
            com.google.android.gms.internal.ads.zzcmx r0 = r2.zzq     // Catch:{ all -> 0x003a }
            boolean r0 = r0.zzi()     // Catch:{ all -> 0x003a }
            if (r0 != 0) goto L_0x0038
        L_0x0024:
            com.google.android.gms.internal.ads.zzbwu r0 = new com.google.android.gms.internal.ads.zzbwu     // Catch:{ all -> 0x003a }
            java.lang.String r1 = ""
            r0.<init>(r2, r1)     // Catch:{ all -> 0x003a }
            r1 = 1
            if (r1 == r3) goto L_0x0031
            java.lang.String r3 = "default"
            goto L_0x0033
        L_0x0031:
            java.lang.String r3 = "expanded"
        L_0x0033:
            r0.zzk(r3)     // Catch:{ all -> 0x003a }
            monitor-exit(r2)
            return
        L_0x0038:
            monitor-exit(r2)
            return
        L_0x003a:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcmb.zzap(boolean):void");
    }

    public final synchronized void zzaq(zzbkn zzbkn) {
        this.zzC = zzbkn;
    }

    public final synchronized void zzar(IObjectWrapper iObjectWrapper) {
        this.zzp = iObjectWrapper;
    }

    public final synchronized void zzas(int i) {
        zzl zzl2 = this.zzo;
        if (zzl2 != null) {
            zzl2.zzy(i);
        }
    }

    public final synchronized void zzat(zzl zzl2) {
        this.zzO = zzl2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0016, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzau(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.zzF     // Catch:{ all -> 0x0017 }
            r1 = 1
            if (r1 == r3) goto L_0x0007
            r1 = -1
        L_0x0007:
            int r0 = r0 + r1
            r2.zzF = r0     // Catch:{ all -> 0x0017 }
            if (r0 > 0) goto L_0x0015
            com.google.android.gms.ads.internal.overlay.zzl r3 = r2.zzo     // Catch:{ all -> 0x0017 }
            if (r3 == 0) goto L_0x0015
            r3.zzC()     // Catch:{ all -> 0x0017 }
            monitor-exit(r2)
            return
        L_0x0015:
            monitor-exit(r2)
            return
        L_0x0017:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcmb.zzau(boolean):void");
    }

    public final synchronized void zzav(boolean z) {
        if (z) {
            setBackgroundColor(0);
        }
        zzl zzl2 = this.zzo;
        if (zzl2 != null) {
            zzl2.zzz(z);
        }
    }

    public final void zzaw(String str, zzbol zzbol) {
        zzclp zzclp = this.zzn;
        if (zzclp != null) {
            zzclp.zzG(str, zzbol);
        }
    }

    public final void zzax(String str, Predicate predicate) {
        zzclp zzclp = this.zzn;
        if (zzclp != null) {
            zzclp.zzH(str, predicate);
        }
    }

    public final synchronized boolean zzay() {
        return this.zzs;
    }

    public final synchronized boolean zzaz() {
        return this.zzF > 0;
    }

    public final void zzb(String str, String str2) {
        zzaQ(C25541a.m63882l(str, "(", str2, ");"));
    }

    public final synchronized void zzbn() {
        com.google.android.gms.ads.internal.zzl zzl2 = this.zzf;
        if (zzl2 != null) {
            zzl2.zzbn();
        }
    }

    public final synchronized void zzbo() {
        com.google.android.gms.ads.internal.zzl zzl2 = this.zzf;
        if (zzl2 != null) {
            zzl2.zzbo();
        }
    }

    public final zzchg zzbp() {
        return null;
    }

    public final void zzc(zzbal zzbal) {
        boolean z;
        synchronized (this) {
            z = zzbal.zzj;
            this.zzA = z;
        }
        zzaX(z);
    }

    public final void zzd(String str, Map map) {
        try {
            zze(str, zzaw.zzb().zzh(map));
        } catch (JSONException unused) {
            zzcfi.zzj("Could not convert parameters to JSON.");
        }
    }

    public final void zze(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        StringBuilder h = C16759e.m42352h("(window.AFMA_ReceiveMessage || function() {})('", str, "',", jSONObject.toString(), ");");
        zzcfi.zze("Dispatching AFMA event: ".concat(h.toString()));
        zzaQ(h.toString());
    }

    public final int zzf() {
        return this.zzN;
    }

    public final int zzg() {
        return this.zzM;
    }

    public final synchronized int zzh() {
        return this.zzL;
    }

    public final int zzi() {
        return getMeasuredHeight();
    }

    public final int zzj() {
        return getMeasuredWidth();
    }

    public final Activity zzk() {
        return this.zzb.zza();
    }

    public final void zzl(String str, JSONObject jSONObject) {
        zzb(str, jSONObject.toString());
    }

    public final zza zzm() {
        return this.zzg;
    }

    public final zzbik zzn() {
        return this.zzI;
    }

    public final zzbil zzo() {
        return this.zzK;
    }

    public final zzcfo zzp() {
        return this.zze;
    }

    public final void zzq() {
        zzclp zzclp = this.zzn;
        if (zzclp != null) {
            zzclp.zzq();
        }
    }

    public final synchronized zzcju zzr(String str) {
        Map map = this.zzV;
        if (map == null) {
            return null;
        }
        return (zzcju) map.get(str);
    }

    public final synchronized zzcme zzs() {
        return this.zzz;
    }

    public final synchronized String zzt() {
        zzfbj zzfbj = this.zzk;
        if (zzfbj == null) {
            return null;
        }
        return zzfbj.zzb;
    }

    public final synchronized String zzu() {
        return this.zzy;
    }

    public final synchronized void zzv(String str, zzcju zzcju) {
        if (this.zzV == null) {
            this.zzV = new HashMap();
        }
        this.zzV.put(str, zzcju);
    }

    public final void zzw() {
        zzl zzN2 = zzN();
        if (zzN2 != null) {
            zzN2.zzd();
        }
    }

    public final void zzx(boolean z, long j) {
        String str;
        HashMap hashMap = new HashMap(2);
        if (true != z) {
            str = "0";
        } else {
            str = DiskLruCache.VERSION_1;
        }
        hashMap.put(WidgetMessageParser.KEY_SUCCESS, str);
        hashMap.put(InAppMessageBase.DURATION, Long.toString(j));
        zzd("onCacheAccessComplete", hashMap);
    }

    public final synchronized void zzy() {
        zzbkl zzbkl = this.zzD;
        if (zzbkl != null) {
            zzs.zza.post(new zzdrb((zzdrd) zzbkl));
        }
    }

    public final void zzz(int i) {
        this.zzN = i;
    }
}
