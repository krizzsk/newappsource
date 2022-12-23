package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzch;
import com.google.android.gms.ads.internal.util.zze;
import com.usebutton.sdk.internal.events.Events;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001a0.C0016g;

public final class zzcji implements zzbol {
    private boolean zza;

    private static int zzb(Context context, Map map, String str, int i) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                zzaw.zzb();
                i = zzcfb.zzv(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                zzcfi.zzj("Could not parse " + str + " in a video GMSG: " + str2);
            }
        }
        if (zze.zzc()) {
            StringBuilder h = C16759e.m42352h("Parse pixels for ", str, ", got string ", str2, ", int ");
            h.append(i);
            h.append(".");
            zze.zza(h.toString());
        }
        return i;
    }

    private static void zzc(zzchf zzchf, Map map) {
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                zzchf.zzA(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                zzcfi.zzj(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", new Object[]{str, str2}));
                return;
            }
        }
        if (str2 != null) {
            zzchf.zzz(Integer.parseInt(str2));
        }
        if (str3 != null) {
            zzchf.zzx(Integer.parseInt(str3));
        }
        if (str4 != null) {
            zzchf.zzy(Integer.parseInt(str4));
        }
        if (str5 != null) {
            zzchf.zzC(Integer.parseInt(str5));
        }
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        int i;
        int i2;
        int i3;
        zzchr zzchr = (zzchr) obj;
        String str = (String) map.get(Events.PROPERTY_ACTION);
        if (str == null) {
            zzcfi.zzj("Action missing from video GMSG.");
            return;
        }
        if (zzcfi.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            zzcfi.zze("Video GMSG: " + str + " " + jSONObject.toString());
        }
        if (PostInstallNotificationProvider.KEY_BG.equals(str)) {
            String str2 = (String) map.get("color");
            if (TextUtils.isEmpty(str2)) {
                zzcfi.zzj("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                zzchr.setBackgroundColor(Color.parseColor(str2));
            } catch (IllegalArgumentException unused) {
                zzcfi.zzj("Invalid color parameter in background video GMSG.");
            }
        } else if ("playerBackground".equals(str)) {
            String str3 = (String) map.get("color");
            if (TextUtils.isEmpty(str3)) {
                zzcfi.zzj("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                zzchr.zzD(Color.parseColor(str3));
            } catch (IllegalArgumentException unused2) {
                zzcfi.zzj("Invalid color parameter in playerBackground video GMSG.");
            }
        } else {
            if ("decoderProps".equals(str)) {
                String str4 = (String) map.get("mimeTypes");
                if (str4 == null) {
                    zzcfi.zzj("No MIME types specified for decoder properties inspection.");
                    HashMap hashMap = new HashMap();
                    hashMap.put("event", "decoderProps");
                    hashMap.put("error", "missingMimeTypes");
                    zzchr.zzd("onVideoEvent", hashMap);
                    return;
                }
                HashMap hashMap2 = new HashMap();
                for (String str5 : str4.split(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR)) {
                    hashMap2.put(str5, zzch.zza(str5.trim()));
                }
                HashMap hashMap3 = new HashMap();
                hashMap3.put("event", "decoderProps");
                hashMap3.put("mimeTypes", hashMap2);
                zzchr.zzd("onVideoEvent", hashMap3);
                return;
            }
            zzchg zzbp = zzchr.zzbp();
            if (zzbp == null) {
                zzcfi.zzj("Could not get underlay container for a video GMSG.");
                return;
            }
            boolean equals = "new".equals(str);
            boolean equals2 = "position".equals(str);
            if (equals || equals2) {
                Context context = zzchr.getContext();
                int zzb = zzb(context, map, "x", 0);
                int zzb2 = zzb(context, map, "y", 0);
                int zzb3 = zzb(context, map, "w", -1);
                zzbhq zzbhq = zzbhy.zzcT;
                if (!((Boolean) zzay.zzc().zzb(zzbhq)).booleanValue()) {
                    if (zze.zzc()) {
                        StringBuilder s = C0016g.m35s("Calculate width with original width ", zzb3, ", videoHost.getVideoBoundingWidth() ", zzchr.zzj(), ", x ");
                        s.append(zzb);
                        s.append(".");
                        zze.zza(s.toString());
                    }
                    i = Math.min(zzb3, zzchr.zzj() - zzb);
                } else if (zzb3 == -1) {
                    i = zzchr.zzj();
                } else {
                    i = Math.min(zzb3, zzchr.zzj());
                }
                int i4 = i;
                int zzb4 = zzb(context, map, "h", -1);
                if (!((Boolean) zzay.zzc().zzb(zzbhq)).booleanValue()) {
                    if (zze.zzc()) {
                        StringBuilder s2 = C0016g.m35s("Calculate height with original height ", zzb4, ", videoHost.getVideoBoundingHeight() ", zzchr.zzi(), ", y ");
                        s2.append(zzb2);
                        s2.append(".");
                        zze.zza(s2.toString());
                    }
                    i2 = Math.min(zzb4, zzchr.zzi() - zzb2);
                } else if (zzb4 == -1) {
                    i2 = zzchr.zzi();
                } else {
                    i2 = Math.min(zzb4, zzchr.zzi());
                }
                int i5 = i2;
                try {
                    i3 = Integer.parseInt((String) map.get("player"));
                } catch (NumberFormatException unused3) {
                    i3 = 0;
                }
                boolean parseBoolean = Boolean.parseBoolean((String) map.get("spherical"));
                if (!equals || zzbp.zza() != null) {
                    zzbp.zzb(zzb, zzb2, i4, i5);
                    return;
                }
                zzbp.zzc(zzb, zzb2, i4, i5, i3, parseBoolean, new zzchq((String) map.get("flags")));
                zzchf zza2 = zzbp.zza();
                if (zza2 != null) {
                    zzc(zza2, map);
                    return;
                }
                return;
            }
            zzcme zzs = zzchr.zzs();
            if (zzs != null) {
                if ("timeupdate".equals(str)) {
                    String str6 = (String) map.get("currentTime");
                    if (str6 == null) {
                        zzcfi.zzj("currentTime parameter missing from timeupdate video GMSG.");
                        return;
                    }
                    try {
                        zzs.zzt(Float.parseFloat(str6));
                        return;
                    } catch (NumberFormatException unused4) {
                        zzcfi.zzj("Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str6));
                        return;
                    }
                } else if ("skip".equals(str)) {
                    zzs.zzu();
                    return;
                }
            }
            zzchf zza3 = zzbp.zza();
            if (zza3 == null) {
                HashMap hashMap4 = new HashMap();
                hashMap4.put("event", "no_video_view");
                zzchr.zzd("onVideoEvent", hashMap4);
            } else if ("click".equals(str)) {
                Context context2 = zzchr.getContext();
                int zzb5 = zzb(context2, map, "x", 0);
                int zzb6 = zzb(context2, map, "y", 0);
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, (float) zzb5, (float) zzb6, 0);
                zza3.zzw(obtain);
                obtain.recycle();
            } else if ("currentTime".equals(str)) {
                String str7 = (String) map.get("time");
                if (str7 == null) {
                    zzcfi.zzj("Time parameter missing from currentTime video GMSG.");
                    return;
                }
                try {
                    zza3.zzv((int) (Float.parseFloat(str7) * 1000.0f));
                } catch (NumberFormatException unused5) {
                    zzcfi.zzj("Could not parse time parameter from currentTime video GMSG: ".concat(str7));
                }
            } else if ("hide".equals(str)) {
                zza3.setVisibility(4);
            } else if ("load".equals(str)) {
                zza3.zzq();
            } else if ("loadControl".equals(str)) {
                zzc(zza3, map);
            } else if ("muted".equals(str)) {
                if (Boolean.parseBoolean((String) map.get("muted"))) {
                    zza3.zzr();
                } else {
                    zza3.zzH();
                }
            } else if ("pause".equals(str)) {
                zza3.zzt();
            } else if ("play".equals(str)) {
                zza3.zzu();
            } else if ("show".equals(str)) {
                zza3.setVisibility(0);
            } else if ("src".equals(str)) {
                String str8 = (String) map.get("src");
                Integer num = null;
                if (map.containsKey("periodicReportIntervalMs")) {
                    try {
                        num = Integer.valueOf(Integer.parseInt((String) map.get("periodicReportIntervalMs")));
                    } catch (NumberFormatException unused6) {
                        zzcfi.zzj("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(String.valueOf((String) map.get("periodicReportIntervalMs"))));
                    }
                }
                String[] strArr = {str8};
                String str9 = (String) map.get("demuxed");
                if (str9 != null) {
                    try {
                        JSONArray jSONArray = new JSONArray(str9);
                        String[] strArr2 = new String[jSONArray.length()];
                        for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                            strArr2[i6] = jSONArray.getString(i6);
                        }
                        strArr = strArr2;
                    } catch (JSONException unused7) {
                        zzcfi.zzj("Malformed demuxed URL list for playback: ".concat(str9));
                        strArr = new String[]{str8};
                    }
                }
                if (num != null) {
                    zzchr.zzC(num.intValue());
                }
                zza3.zzD(str8, strArr);
            } else if ("touchMove".equals(str)) {
                Context context3 = zzchr.getContext();
                zza3.zzG((float) zzb(context3, map, "dx", 0), (float) zzb(context3, map, "dy", 0));
                if (!this.zza) {
                    zzchr.zzw();
                    this.zza = true;
                }
            } else if ("volume".equals(str)) {
                String str10 = (String) map.get("volume");
                if (str10 == null) {
                    zzcfi.zzj("Level parameter missing from volume video GMSG.");
                    return;
                }
                try {
                    zza3.zzF(Float.parseFloat(str10));
                } catch (NumberFormatException unused8) {
                    zzcfi.zzj("Could not parse volume parameter from volume video GMSG: ".concat(str10));
                }
            } else if ("watermark".equals(str)) {
                zza3.zzm();
            } else {
                zzcfi.zzj("Unknown video action: ".concat(str));
            }
        }
    }
}
