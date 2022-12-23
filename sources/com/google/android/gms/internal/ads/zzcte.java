package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class zzcte implements zzcso {
    private final CookieManager zza;

    public zzcte(Context context) {
        this.zza = zzt.zzq().zzb(context);
    }

    public final void zza(Map map) {
        if (this.zza != null) {
            if (((String) map.get("clear")) != null) {
                String str = (String) zzay.zzc().zzb(zzbhy.zzaH);
                String cookie = this.zza.getCookie(str);
                if (cookie != null) {
                    List zzf = zzfpe.zzc(zzfof.zzc(';')).zzf(cookie);
                    int i = 0;
                    while (i < zzf.size()) {
                        CookieManager cookieManager = this.zza;
                        Iterator it = zzfpe.zzc(zzfof.zzc('=')).zzd((String) zzf.get(i)).iterator();
                        it.getClass();
                        if (it.hasNext()) {
                            cookieManager.setCookie(str, String.valueOf((String) it.next()).concat(String.valueOf((String) zzay.zzc().zzb(zzbhy.zzau))));
                            i++;
                        } else {
                            throw new IndexOutOfBoundsException(C13715c.m34242h(91, "position (0) must be less than the number of elements that remained (", 0, ")"));
                        }
                    }
                    return;
                }
                return;
            }
            String str2 = (String) map.get("cookie");
            if (!TextUtils.isEmpty(str2)) {
                this.zza.setCookie((String) zzay.zzc().zzb(zzbhy.zzaH), str2);
            }
        }
    }
}
