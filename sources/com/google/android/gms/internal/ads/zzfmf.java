package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import com.appsflyer.share.Constants;
import com.facebook.ads.AdError;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import java.util.HashMap;
import java.util.Map;

final class zzfmf implements zzfkv {
    private final Object zza;
    private final zzfmg zzb;
    private final zzfmr zzc;
    private final zzfks zzd;

    public zzfmf(Object obj, zzfmg zzfmg, zzfmr zzfmr, zzfks zzfks) {
        this.zza = obj;
        this.zzb = zzfmg;
        this.zzc = zzfmr;
        this.zzd = zzfks;
    }

    private static String zzi(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        zzamk zza2 = zzaml.zza();
        zza2.zzc(5);
        zza2.zza(zzgjg.zzv(bArr));
        return Base64.encodeToString(((zzaml) zza2.zzaj()).zzau(), 11);
    }

    private final synchronized byte[] zzj(Map map, Map map2) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e) {
            this.zzd.zzc(2007, System.currentTimeMillis() - currentTimeMillis, e);
            return null;
        }
        return (byte[]) this.zza.getClass().getDeclaredMethod("xss", new Class[]{Map.class, Map.class}).invoke(this.zza, new Object[]{null, map2});
    }

    public final synchronized String zza(Context context, String str, String str2, View view, Activity activity) {
        Map zza2;
        zza2 = this.zzc.zza();
        zza2.put(InneractiveMediationDefs.GENDER_FEMALE, Constants.URL_CAMPAIGN);
        zza2.put("ctx", context);
        zza2.put("cs", str2);
        zza2.put("aid", (Object) null);
        zza2.put(Promotion.ACTION_VIEW, view);
        zza2.put("act", activity);
        return zzi(zzj((Map) null, zza2));
    }

    public final synchronized String zzb(Context context, String str, View view, Activity activity) {
        Map zzc2;
        zzc2 = this.zzc.zzc();
        zzc2.put(InneractiveMediationDefs.GENDER_FEMALE, "v");
        zzc2.put("ctx", context);
        zzc2.put("aid", (Object) null);
        zzc2.put(Promotion.ACTION_VIEW, view);
        zzc2.put("act", activity);
        return zzi(zzj((Map) null, zzc2));
    }

    public final synchronized String zzc(Context context, String str) {
        Map zzb2;
        zzb2 = this.zzc.zzb();
        zzb2.put(InneractiveMediationDefs.GENDER_FEMALE, "q");
        zzb2.put("ctx", context);
        zzb2.put("aid", (Object) null);
        return zzi(zzj((Map) null, zzb2));
    }

    public final synchronized void zzd(String str, MotionEvent motionEvent) throws zzfmp {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put(com.appboy.Constants.APPBOY_PUSH_TITLE_KEY, new Throwable());
            hashMap.put("aid", (Object) null);
            hashMap.put("evt", motionEvent);
            this.zza.getClass().getDeclaredMethod("he", new Class[]{Map.class}).invoke(this.zza, new Object[]{hashMap});
            this.zzd.zzd(AuthApiStatusCodes.AUTH_API_SERVER_ERROR, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e) {
            throw new zzfmp(2005, (Throwable) e);
        }
    }

    public final synchronized int zze() throws zzfmp {
        try {
        } catch (Exception e) {
            throw new zzfmp((int) AdError.INTERNAL_ERROR_2006, (Throwable) e);
        }
        return ((Integer) this.zza.getClass().getDeclaredMethod("lcs", new Class[0]).invoke(this.zza, new Object[0])).intValue();
    }

    public final zzfmg zzf() {
        return this.zzb;
    }

    public final synchronized void zzg() throws zzfmp {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.zza.getClass().getDeclaredMethod("close", new Class[0]).invoke(this.zza, new Object[0]);
            this.zzd.zzd(3001, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e) {
            throw new zzfmp((int) AdError.INTERNAL_ERROR_2003, (Throwable) e);
        }
    }

    public final synchronized boolean zzh() throws zzfmp {
        try {
        } catch (Exception e) {
            throw new zzfmp((int) AdError.INTERNAL_ERROR_CODE, (Throwable) e);
        }
        return ((Boolean) this.zza.getClass().getDeclaredMethod("init", new Class[0]).invoke(this.zza, new Object[0])).booleanValue();
    }
}
