package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.work.C1385a;
import androidx.work.C1388b;
import androidx.work.NetworkType;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzcfi;
import java.util.HashMap;
import p081f3.C4648b;
import p081f3.C4658i;
import p092g3.C4763k;

@KeepForSdk
public class WorkManagerUtil extends zzbq {
    private static void zzb(Context context) {
        try {
            C4763k.m12080h(context.getApplicationContext(), new C1385a(new C1385a.C1386a()));
        } catch (IllegalStateException unused) {
        }
    }

    public final void zze(IObjectWrapper iObjectWrapper) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzb(context);
        try {
            C4763k g = C4763k.m12079g(context);
            g.mo20275e("offline_ping_sender_work");
            C4648b.C4649a aVar = new C4648b.C4649a();
            aVar.f15887c = NetworkType.CONNECTED;
            g.mo20185a((C4658i) ((C4658i.C4659a) ((C4658i.C4659a) new C4658i.C4659a(OfflinePingSender.class).mo20192f(new C4648b(aVar))).mo20189a("offline_ping_sender_work")).mo20190b());
        } catch (IllegalStateException e) {
            zzcfi.zzk("Failed to instantiate WorkManager.", e);
        }
    }

    public final boolean zzf(IObjectWrapper iObjectWrapper, String str, String str2) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzb(context);
        C4648b.C4649a aVar = new C4648b.C4649a();
        aVar.f15887c = NetworkType.CONNECTED;
        C4648b bVar = new C4648b(aVar);
        HashMap hashMap = new HashMap();
        hashMap.put("uri", str);
        hashMap.put("gws_query_id", str2);
        C1388b bVar2 = new C1388b(hashMap);
        C1388b.m3716c(bVar2);
        try {
            C4763k.m12079g(context).mo20185a((C4658i) ((C4658i.C4659a) ((C4658i.C4659a) ((C4658i.C4659a) new C4658i.C4659a(OfflineNotificationPoster.class).mo20192f(bVar)).mo20194h(bVar2)).mo20189a("offline_notification_work")).mo20190b());
            return true;
        } catch (IllegalStateException e) {
            zzcfi.zzk("Failed to instantiate WorkManager.", e);
            return false;
        }
    }
}
