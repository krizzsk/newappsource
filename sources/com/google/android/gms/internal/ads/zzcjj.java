package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.appboy.models.InAppMessageBase;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.usebutton.sdk.internal.util.DiskLruCache;
import java.util.Map;

public final class zzcjj implements zzbol {
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        float f;
        zzchr zzchr = (zzchr) obj;
        zzcme zzs = zzchr.zzs();
        if (zzs == null) {
            try {
                zzcme zzcme = new zzcme(zzchr, Float.parseFloat((String) map.get(InAppMessageBase.DURATION)), DiskLruCache.VERSION_1.equals(map.get("customControlsAllowed")), DiskLruCache.VERSION_1.equals(map.get("clickToExpandAllowed")));
                zzchr.zzE(zzcme);
                zzs = zzcme;
            } catch (NullPointerException e) {
                e = e;
                zzcfi.zzh("Unable to parse videoMeta message.", e);
                zzt.zzo().zzt(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            } catch (NumberFormatException e2) {
                e = e2;
                zzcfi.zzh("Unable to parse videoMeta message.", e);
                zzt.zzo().zzt(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float parseFloat = Float.parseFloat((String) map.get(InAppMessageBase.DURATION));
        boolean equals = DiskLruCache.VERSION_1.equals(map.get("muted"));
        float parseFloat2 = Float.parseFloat((String) map.get("currentTime"));
        int parseInt = Integer.parseInt((String) map.get("playbackState"));
        int i = 0;
        if (parseInt >= 0) {
            if (parseInt <= 3) {
                i = parseInt;
            }
        }
        String str = (String) map.get("aspectRatio");
        if (TextUtils.isEmpty(str)) {
            f = BitmapDescriptorFactory.HUE_RED;
        } else {
            f = Float.parseFloat(str);
        }
        if (zzcfi.zzm(3)) {
            zzcfi.zze("Video Meta GMSG: currentTime : " + parseFloat2 + " , duration : " + parseFloat + " , isMuted : " + equals + " , playbackState : " + i + " , aspectRatio : " + str);
        }
        zzs.zzc(parseFloat2, parseFloat, i, equals, f);
    }
}
