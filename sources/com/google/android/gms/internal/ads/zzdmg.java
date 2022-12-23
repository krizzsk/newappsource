package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.appboy.models.outgoing.AttributionData;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzcq;
import com.google.android.gms.ads.internal.client.zzcu;
import com.google.android.gms.ads.internal.util.zzbx;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzdmg implements zzdno {
    private zzcq zzA;
    private final Context zza;
    private final zzdnr zzb;
    private final JSONObject zzc;
    private final zzdsd zzd;
    private final zzdng zze;
    private final zzaoc zzf;
    /* access modifiers changed from: private */
    public final zzdck zzg;
    /* access modifiers changed from: private */
    public final zzdbq zzh;
    /* access modifiers changed from: private */
    public final zzdjd zzi;
    private final zzfbg zzj;
    private final zzcfo zzk;
    private final zzfby zzl;
    private final zzcuc zzm;
    private final zzdoj zzn;
    private final Clock zzo;
    private final zzdja zzp;
    private final zzfig zzq;
    private final zzfhq zzr;
    private boolean zzs = false;
    private boolean zzt;
    private boolean zzu = false;
    private boolean zzv = false;
    private Point zzw = new Point();
    private Point zzx = new Point();
    private long zzy = 0;
    private long zzz = 0;

    public zzdmg(Context context, zzdnr zzdnr, JSONObject jSONObject, zzdsd zzdsd, zzdng zzdng, zzaoc zzaoc, zzdck zzdck, zzdbq zzdbq, zzdjd zzdjd, zzfbg zzfbg, zzcfo zzcfo, zzfby zzfby, zzcuc zzcuc, zzdoj zzdoj, Clock clock, zzdja zzdja, zzfig zzfig, zzfhq zzfhq) {
        this.zza = context;
        this.zzb = zzdnr;
        this.zzc = jSONObject;
        this.zzd = zzdsd;
        this.zze = zzdng;
        this.zzf = zzaoc;
        this.zzg = zzdck;
        this.zzh = zzdbq;
        this.zzi = zzdjd;
        this.zzj = zzfbg;
        this.zzk = zzcfo;
        this.zzl = zzfby;
        this.zzm = zzcuc;
        this.zzn = zzdoj;
        this.zzo = clock;
        this.zzp = zzdja;
        this.zzq = zzfig;
        this.zzr = zzfhq;
    }

    private final String zzB(View view, Map map) {
        if (!(map == null || view == null)) {
            for (Map.Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    return (String) entry.getKey();
                }
            }
        }
        int zzc2 = this.zze.zzc();
        if (zzc2 == 1) {
            return "1099";
        }
        if (zzc2 == 2) {
            return "2099";
        }
        if (zzc2 != 6) {
            return null;
        }
        return "3099";
    }

    private final boolean zzC(String str) {
        JSONObject optJSONObject = this.zzc.optJSONObject("allow_pub_event_reporting");
        if (optJSONObject == null || !optJSONObject.optBoolean(str, false)) {
            return false;
        }
        return true;
    }

    private final boolean zzD() {
        return this.zzc.optBoolean("allow_custom_click_gesture", false);
    }

    private final boolean zzE(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z) {
        Preconditions.checkMainThread("recordImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put(AttributionData.CREATIVE_KEY, this.zzc);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) zzay.zzc().zzb(zzbhy.zzcE)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z);
            Context context = this.zza;
            JSONObject jSONObject7 = new JSONObject();
            zzt.zzp();
            DisplayMetrics zzr2 = zzs.zzr((WindowManager) context.getSystemService("window"));
            try {
                jSONObject7.put("width", zzaw.zzb().zzb(context, zzr2.widthPixels));
                jSONObject7.put("height", zzaw.zzb().zzb(context, zzr2.heightPixels));
            } catch (JSONException unused) {
                jSONObject7 = null;
            }
            jSONObject6.put("screen", jSONObject7);
            if (((Boolean) zzay.zzc().zzb(zzbhy.zzgZ)).booleanValue()) {
                this.zzd.zzi("/clickRecorded", new zzdmd(this, (zzdmc) null));
            } else {
                this.zzd.zzi("/logScionEvent", new zzdmb(this, (zzdma) null));
            }
            this.zzd.zzi("/nativeImpression", new zzdmf(this, (zzdme) null));
            zzcfy.zza(this.zzd.zzd("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (this.zzs) {
                return true;
            }
            this.zzs = zzt.zzs().zzn(this.zza, this.zzk.zza, this.zzj.zzD.toString(), this.zzl.zzf);
            return true;
        } catch (JSONException e) {
            zzcfi.zzh("Unable to create impression JSON.", e);
            return false;
        }
    }

    public final boolean zzA(Bundle bundle) {
        if (!zzC("impression_reporting")) {
            zzcfi.zzg("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
            return false;
        }
        return zzE((JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (String) null, zzaw.zzb().zzi(bundle, (JSONObject) null), false);
    }

    public final JSONObject zzd(View view, Map map, Map map2) {
        JSONObject zzd2 = zzbx.zzd(this.zza, map, map2, view);
        JSONObject zzg2 = zzbx.zzg(this.zza, view);
        JSONObject zzf2 = zzbx.zzf(view);
        JSONObject zze2 = zzbx.zze(this.zza, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", zzd2);
            jSONObject.put("ad_view_signal", zzg2);
            jSONObject.put("scroll_view_signal", zzf2);
            jSONObject.put("lock_screen_signal", zze2);
            return jSONObject;
        } catch (JSONException e) {
            zzcfi.zzh("Unable to create native ad view signals JSON.", e);
            return null;
        }
    }

    public final JSONObject zze(View view, Map map, Map map2) {
        JSONObject zzd2 = zzd(view, map, map2);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.zzv && zzD()) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (zzd2 != null) {
                jSONObject.put("nas", zzd2);
            }
        } catch (JSONException e) {
            zzcfi.zzh("Unable to create native click meta data JSON.", e);
        }
        return jSONObject;
    }

    public final void zzf() {
        try {
            zzcq zzcq = this.zzA;
            if (zzcq != null) {
                zzcq.zze();
            }
        } catch (RemoteException e) {
            zzcfi.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzg() {
        if (this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.zzn.zzb();
        }
    }

    public final void zzh() {
        this.zzd.zzf();
    }

    public final void zzi(zzcu zzcu) {
        try {
            if (!this.zzu) {
                if (zzcu == null) {
                    zzdng zzdng = this.zze;
                    if (zzdng.zzk() != null) {
                        this.zzu = true;
                        this.zzq.zzc(zzdng.zzk().zzf(), this.zzr);
                        zzf();
                        return;
                    }
                }
                this.zzu = true;
                this.zzq.zzc(zzcu.zzf(), this.zzr);
                zzf();
            }
        } catch (RemoteException e) {
            zzcfi.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzj(View view, View view2, Map map, Map map2, boolean z) {
        View view3;
        View view4 = view2;
        Map map3 = map;
        JSONObject zzd2 = zzbx.zzd(this.zza, map, map2, view2);
        JSONObject zzg2 = zzbx.zzg(this.zza, view2);
        JSONObject zzf2 = zzbx.zzf(view2);
        JSONObject zze2 = zzbx.zze(this.zza, view2);
        View view5 = view;
        String zzB = zzB(view, map);
        JSONObject zzc2 = zzbx.zzc(zzB, this.zza, this.zzx, this.zzw);
        if (true == ((Boolean) zzay.zzc().zzb(zzbhy.zzcF)).booleanValue()) {
            view3 = view4;
        } else {
            view3 = view5;
        }
        zzm(view3, zzg2, zzd2, zzf2, zze2, zzB, zzc2, (JSONObject) null, z, false);
    }

    public final void zzk(String str) {
        zzm((View) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, str, (JSONObject) null, (JSONObject) null, false, false);
    }

    public final void zzl(Bundle bundle) {
        String str;
        if (bundle == null) {
            zzcfi.zze("Click data is null. No click is reported.");
        } else if (!zzC("click_reporting")) {
            zzcfi.zzg("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
        } else {
            Bundle bundle2 = bundle.getBundle("click_signal");
            if (bundle2 != null) {
                str = bundle2.getString("asset_id");
            } else {
                str = null;
            }
            zzm((View) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, str, (JSONObject) null, zzaw.zzb().zzi(bundle, (JSONObject) null), false, false);
        }
    }

    @VisibleForTesting
    public final void zzm(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        String str2;
        Preconditions.checkMainThread("performClick must be called on the main UI thread.");
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put(AttributionData.CREATIVE_KEY, this.zzc);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            boolean z6 = false;
            if (this.zzb.zzc(this.zze.zzy()) != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            jSONObject7.put("has_custom_click_handler", z3);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.zze.zzc());
            jSONObject8.put("view_aware_api_used", z);
            zzbko zzbko = this.zzl.zzi;
            if (zzbko == null || !zzbko.zzg) {
                z4 = false;
            } else {
                z4 = true;
            }
            jSONObject8.put("custom_mute_requested", z4);
            if (this.zze.zzF().isEmpty() || this.zze.zzk() == null) {
                z5 = false;
            } else {
                z5 = true;
            }
            jSONObject8.put("custom_mute_enabled", z5);
            if (this.zzn.zza() != null && this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put("timestamp", this.zzo.currentTimeMillis());
            if (this.zzv && zzD()) {
                jSONObject8.put("custom_click_gesture_eligible", true);
            }
            if (z2) {
                jSONObject8.put("is_custom_click_gesture", true);
            }
            if (this.zzb.zzc(this.zze.zzy()) != null) {
                z6 = true;
            }
            jSONObject8.put("has_custom_click_handler", z6);
            try {
                JSONObject optJSONObject = this.zzc.optJSONObject("tracking_urls_and_actions");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                str2 = this.zzf.zzc().zze(this.zza, optJSONObject.optString("click_string"), view);
            } catch (Exception e) {
                zzcfi.zzh("Exception obtaining click signals", e);
                str2 = null;
            }
            jSONObject8.put("click_signals", str2);
            if (((Boolean) zzay.zzc().zzb(zzbhy.zzdE)).booleanValue()) {
                jSONObject8.put("open_chrome_custom_tab", true);
            }
            if (((Boolean) zzay.zzc().zzb(zzbhy.zzhd)).booleanValue() && PlatformVersion.isAtLeastR()) {
                jSONObject8.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) zzay.zzc().zzb(zzbhy.zzhe)).booleanValue() && PlatformVersion.isAtLeastR()) {
                jSONObject8.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject7.put("click", jSONObject8);
            JSONObject jSONObject9 = new JSONObject();
            long currentTimeMillis = this.zzo.currentTimeMillis();
            jSONObject9.put("time_from_last_touch_down", currentTimeMillis - this.zzy);
            jSONObject9.put("time_from_last_touch", currentTimeMillis - this.zzz);
            jSONObject7.put("touch_signal", jSONObject9);
            zzcfy.zza(this.zzd.zzd("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e2) {
            zzcfi.zzh("Unable to create click JSON.", e2);
        }
    }

    public final void zzn(View view, Map map, Map map2, boolean z) {
        View view2 = view;
        Map map3 = map;
        if (!this.zzv) {
            zzcfi.zze("Custom click reporting failed. enableCustomClickGesture is not set.");
        } else if (!zzD()) {
            zzcfi.zze("Custom click reporting failed. Ad unit id not in the allow list.");
        } else {
            Map map4 = map2;
            JSONObject zzd2 = zzbx.zzd(this.zza, map, map2, view);
            JSONObject zzg2 = zzbx.zzg(this.zza, view);
            JSONObject zzf2 = zzbx.zzf(view);
            JSONObject zze2 = zzbx.zze(this.zza, view);
            String zzB = zzB((View) null, map);
            zzm(view, zzg2, zzd2, zzf2, zze2, zzB, zzbx.zzc(zzB, this.zza, this.zzx, this.zzw), (JSONObject) null, z, true);
        }
    }

    public final void zzo() {
        Preconditions.checkMainThread("recordDownloadedImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(AttributionData.CREATIVE_KEY, this.zzc);
            zzcfy.zza(this.zzd.zzd("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e) {
            zzcfi.zzh("", e);
        }
    }

    public final void zzp(View view, Map map, Map map2) {
        String str;
        JSONObject zzd2 = zzbx.zzd(this.zza, map, map2, view);
        JSONObject zzg2 = zzbx.zzg(this.zza, view);
        JSONObject zzf2 = zzbx.zzf(view);
        JSONObject zze2 = zzbx.zze(this.zza, view);
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzcE)).booleanValue()) {
            try {
                str = this.zzf.zzc().zzh(this.zza, view, (Activity) null);
            } catch (Exception unused) {
                zzcfi.zzg("Exception getting data.");
            }
            zzE(zzg2, zzd2, zzf2, zze2, str, (JSONObject) null, zzbx.zzh(this.zza, this.zzj));
        }
        str = null;
        zzE(zzg2, zzd2, zzf2, zze2, str, (JSONObject) null, zzbx.zzh(this.zza, this.zzj));
    }

    public final void zzq() {
        zzE((JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (String) null, (JSONObject) null, false);
    }

    public final void zzr(View view, MotionEvent motionEvent, View view2) {
        this.zzw = zzbx.zza(motionEvent, view2);
        long currentTimeMillis = this.zzo.currentTimeMillis();
        this.zzz = currentTimeMillis;
        if (motionEvent.getAction() == 0) {
            this.zzy = currentTimeMillis;
            this.zzx = this.zzw;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        Point point = this.zzw;
        obtain.setLocation((float) point.x, (float) point.y);
        this.zzf.zzd(obtain);
        obtain.recycle();
    }

    public final void zzs(Bundle bundle) {
        if (bundle == null) {
            zzcfi.zze("Touch event data is null. No touch event is reported.");
        } else if (!zzC("touch_reporting")) {
            zzcfi.zzg("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
        } else {
            float f = bundle.getFloat("x");
            float f2 = bundle.getFloat("y");
            this.zzf.zzc().zzl((int) f, (int) f2, bundle.getInt("duration_ms"));
        }
    }

    public final void zzt(View view) {
        if (!this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            zzcfi.zzj("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        zzdoj zzdoj = this.zzn;
        if (view != null) {
            view.setOnClickListener(zzdoj);
            view.setClickable(true);
            zzdoj.zzc = new WeakReference(view);
        }
    }

    public final void zzu() {
        this.zzv = true;
    }

    public final void zzv(zzcq zzcq) {
        this.zzA = zzcq;
    }

    public final void zzw(zzbmu zzbmu) {
        if (!this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            zzcfi.zzj("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        } else {
            this.zzn.zzc(zzbmu);
        }
    }

    public final void zzx(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.zzw = new Point();
        this.zzx = new Point();
        if (!this.zzt) {
            this.zzp.zza(view);
            this.zzt = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.zzm.zzi(this);
        boolean zzi2 = zzbx.zzi(this.zzk.zzc);
        if (map != null) {
            for (Map.Entry value : map.entrySet()) {
                View view2 = (View) ((WeakReference) value.getValue()).get();
                if (view2 != null) {
                    if (zzi2) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            for (Map.Entry value2 : map2.entrySet()) {
                View view3 = (View) ((WeakReference) value2.getValue()).get();
                if (view3 != null) {
                    if (zzi2) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    public final void zzy(View view, Map map) {
        this.zzw = new Point();
        this.zzx = new Point();
        if (view != null) {
            this.zzp.zzb(view);
        }
        this.zzt = false;
    }

    public final boolean zzz() {
        return zzD();
    }
}
