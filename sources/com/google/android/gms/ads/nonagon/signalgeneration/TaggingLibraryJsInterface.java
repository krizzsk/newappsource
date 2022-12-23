package com.google.android.gms.ads.nonagon.signalgeneration;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzaoc;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzcfv;
import com.google.android.gms.internal.ads.zzdwb;
import com.google.android.gms.internal.ads.zzdwl;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

final class TaggingLibraryJsInterface {
    private final Context zza;
    /* access modifiers changed from: private */
    public final WebView zzb;
    private final zzaoc zzc;
    private final int zzd = ((Integer) zzay.zzc().zzb(zzbhy.zzhM)).intValue();
    private final zzdwl zze;
    private final boolean zzf = ((Boolean) zzay.zzc().zzb(zzbhy.zzhN)).booleanValue();

    public TaggingLibraryJsInterface(WebView webView, zzaoc zzaoc, zzdwl zzdwl) {
        this.zzb = webView;
        Context context = webView.getContext();
        this.zza = context;
        this.zzc = zzaoc;
        this.zze = zzdwl;
        zzbhy.zzc(context);
    }

    @JavascriptInterface
    @TargetApi(21)
    @KeepForSdk
    public String getClickSignals(String str) {
        try {
            long currentTimeMillis = zzt.zzA().currentTimeMillis();
            String zze2 = this.zzc.zzc().zze(this.zza, str, this.zzb);
            if (this.zzf) {
                long currentTimeMillis2 = zzt.zzA().currentTimeMillis() - currentTimeMillis;
                zzf.zzc(this.zze, (zzdwb) null, "csg", new Pair("clat", String.valueOf(currentTimeMillis2)));
            }
            return zze2;
        } catch (RuntimeException e) {
            zzcfi.zzh("Exception getting click signals. ", e);
            zzt.zzo().zzt(e, "TaggingLibraryJsInterface.getClickSignals");
            return "";
        }
    }

    @JavascriptInterface
    @TargetApi(21)
    @KeepForSdk
    public String getClickSignalsWithTimeout(String str, int i) {
        if (i <= 0) {
            zzcfi.zzg("Invalid timeout for getting click signals. Timeout=" + i);
            return "";
        }
        int min = Math.min(i, this.zzd);
        try {
            return (String) zzcfv.zza.zzb(new zzan(this, str)).get((long) min, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zzcfi.zzh("Exception getting click signals with timeout. ", e);
            zzt.zzo().zzt(e, "TaggingLibraryJsInterface.getClickSignalsWithTimeout");
            if (e instanceof TimeoutException) {
                return "17";
            }
            return "";
        }
    }

    @JavascriptInterface
    @TargetApi(21)
    @KeepForSdk
    public String getQueryInfo() {
        zzt.zzp();
        String uuid = UUID.randomUUID().toString();
        Bundle b = C25541a.m63872b("query_info_type", "requester_type_6");
        Context context = this.zza;
        AdFormat adFormat = AdFormat.BANNER;
        AdRequest.Builder builder = new AdRequest.Builder();
        builder.addNetworkExtrasBundle(AdMobAdapter.class, b);
        QueryInfo.generate(context, adFormat, builder.build(), new zzao(this, uuid));
        return uuid;
    }

    @JavascriptInterface
    @TargetApi(21)
    @KeepForSdk
    public String getViewSignals() {
        try {
            long currentTimeMillis = zzt.zzA().currentTimeMillis();
            String zzh = this.zzc.zzc().zzh(this.zza, this.zzb, (Activity) null);
            if (this.zzf) {
                long currentTimeMillis2 = zzt.zzA().currentTimeMillis() - currentTimeMillis;
                zzf.zzc(this.zze, (zzdwb) null, "vsg", new Pair("vlat", String.valueOf(currentTimeMillis2)));
            }
            return zzh;
        } catch (RuntimeException e) {
            zzcfi.zzh("Exception getting view signals. ", e);
            zzt.zzo().zzt(e, "TaggingLibraryJsInterface.getViewSignals");
            return "";
        }
    }

    @JavascriptInterface
    @TargetApi(21)
    @KeepForSdk
    public String getViewSignalsWithTimeout(int i) {
        if (i <= 0) {
            zzcfi.zzg("Invalid timeout for getting view signals. Timeout=" + i);
            return "";
        }
        int min = Math.min(i, this.zzd);
        try {
            return (String) zzcfv.zza.zzb(new zzam(this)).get((long) min, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zzcfi.zzh("Exception getting view signals with timeout. ", e);
            zzt.zzo().zzt(e, "TaggingLibraryJsInterface.getViewSignalsWithTimeout");
            if (e instanceof TimeoutException) {
                return "17";
            }
            return "";
        }
    }

    @JavascriptInterface
    @TargetApi(21)
    @KeepForSdk
    public void reportTouchEvent(String str) {
        int i;
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i2 = jSONObject.getInt("x");
            int i3 = jSONObject.getInt("y");
            int i4 = jSONObject.getInt("duration_ms");
            float f = (float) jSONObject.getDouble("force");
            int i5 = jSONObject.getInt("type");
            if (i5 == 0) {
                i = 0;
            } else if (i5 == 1) {
                i = 1;
            } else if (i5 == 2) {
                i = 2;
            } else if (i5 != 3) {
                i = -1;
            } else {
                i = 3;
            }
            try {
                this.zzc.zzd(MotionEvent.obtain(0, (long) i4, i, (float) i2, (float) i3, f, 1.0f, 0, 1.0f, 1.0f, 0, 0));
            } catch (RuntimeException | JSONException e) {
                e = e;
                zzcfi.zzh("Failed to parse the touch string. ", e);
                zzt.zzo().zzt(e, "TaggingLibraryJsInterface.reportTouchEvent");
            }
        } catch (RuntimeException | JSONException e2) {
            e = e2;
            zzcfi.zzh("Failed to parse the touch string. ", e);
            zzt.zzo().zzt(e, "TaggingLibraryJsInterface.reportTouchEvent");
        }
    }
}
