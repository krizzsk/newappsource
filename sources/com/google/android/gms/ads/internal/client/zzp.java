package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.query.AdInfo;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.internal.ads.zzcfb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

public final class zzp {
    public static final zzp zza = new zzp();

    public final zzl zza(Context context, zzdr zzdr) {
        long j;
        List list;
        Context context2;
        zzc zzc;
        zzfc zzfc;
        String str;
        String str2;
        zzdr zzdr2 = zzdr;
        Date zzo = zzdr.zzo();
        if (zzo != null) {
            j = zzo.getTime();
        } else {
            j = -1;
        }
        long j2 = j;
        String zzl = zzdr.zzl();
        int zza2 = zzdr.zza();
        Set zzr = zzdr.zzr();
        if (!zzr.isEmpty()) {
            list = Collections.unmodifiableList(new ArrayList(zzr));
            context2 = context;
        } else {
            context2 = context;
            list = null;
        }
        boolean zzt = zzdr2.zzt(context2);
        Bundle zzf = zzdr2.zzf(AdMobAdapter.class);
        AdInfo zzi = zzdr.zzi();
        if (zzi != null) {
            QueryInfo queryInfo = zzi.getQueryInfo();
            if (queryInfo != null) {
                str2 = queryInfo.zza().zzc();
            } else {
                str2 = "";
            }
            zzc = new zzc(zzdr.zzi().getAdString(), str2);
        } else {
            zzc = null;
        }
        String zzm = zzdr.zzm();
        SearchAdRequest zzj = zzdr.zzj();
        if (zzj != null) {
            zzfc = new zzfc(zzj);
        } else {
            zzfc = null;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            zzaw.zzb();
            str = zzcfb.zzo(Thread.currentThread().getStackTrace(), packageName);
        } else {
            str = null;
        }
        boolean zzs = zzdr.zzs();
        RequestConfiguration zzc2 = zzee.zzf().zzc();
        int max = Math.max(zzdr.zzc(), zzc2.getTagForChildDirectedTreatment());
        int max2 = Math.max(-1, zzc2.getTagForUnderAgeOfConsent());
        String[] strArr = {null, zzc2.getMaxAdContentRating()};
        return new zzl(8, j2, zzf, zza2, list, zzt, max, false, zzm, zzfc, (Location) null, zzl, zzdr.zzg(), zzdr.zze(), Collections.unmodifiableList(new ArrayList(zzdr.zzq())), zzdr.zzn(), str, zzs, zzc, max2, (String) Collections.max(Arrays.asList(strArr), zzo.zza), zzdr.zzp(), zzdr.zzb(), zzdr.zzk());
    }
}
