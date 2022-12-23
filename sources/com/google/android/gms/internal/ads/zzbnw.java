package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.google.android.gms.ads.internal.util.zze;
import com.moovit.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
import java.util.Map;

public final /* synthetic */ class zzbnw implements zzbol {
    public static final /* synthetic */ zzbnw zza = new zzbnw();

    private /* synthetic */ zzbnw() {
    }

    public final void zza(Object obj, Map map) {
        String str;
        zzcmj zzcmj = (zzcmj) obj;
        zzbol zzbol = zzbok.zza;
        String str2 = (String) map.get("urls");
        if (TextUtils.isEmpty(str2)) {
            zzcfi.zzj("URLs missing in canOpenURLs GMSG.");
            return;
        }
        String[] split = str2.split(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
        HashMap hashMap = new HashMap();
        PackageManager packageManager = zzcmj.getContext().getPackageManager();
        for (String str3 : split) {
            String[] split2 = str3.split(";", 2);
            String trim = split2[0].trim();
            boolean z = true;
            if (split2.length > 1) {
                str = split2[1].trim();
            } else {
                str = "android.intent.action.VIEW";
            }
            if (packageManager.resolveActivity(new Intent(str, Uri.parse(trim)), SQLiteDatabase.OPEN_FULLMUTEX) == null) {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            hashMap.put(str3, valueOf);
            zze.zza("/canOpenURLs;" + str3 + ";" + valueOf);
        }
        ((zzbrc) zzcmj).zzd("openableURLs", hashMap);
    }
}
