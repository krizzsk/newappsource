package com.umo.ads.p347l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.umo.ads.p350u.zzk;
import com.usebutton.sdk.internal.api.AppActionRequest;
import com.usebutton.sdk.internal.events.Events;
import java.util.List;
import mf0.C24362h;
import p130j2.C5367a;

/* renamed from: com.umo.ads.l.zzd */
public abstract class zzd extends BroadcastReceiver {

    /* renamed from: d */
    public static final /* synthetic */ int f30827d = 0;

    /* renamed from: a */
    public final Context f30828a;

    /* renamed from: b */
    public final String f30829b;

    /* renamed from: c */
    public final List<zzk> f30830c;

    /* renamed from: com.umo.ads.l.zzd$a */
    public static final class C12091a {
        /* renamed from: a */
        public static void m32061a(Context context, String str, String str2, String str3) {
            C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
            C24362h.m61211f(str, "spotId");
            C24362h.m61211f(str2, Events.PROPERTY_ACTION);
            Intent intent = new Intent(str2);
            intent.putExtra("BROADCAST_IDENTIFIER", str);
            intent.putExtra("BROADCAST_ACTION_DATA", str3);
            C5367a.m13473a(context.getApplicationContext()).mo21147c(intent);
        }
    }

    public zzd(Context context, String str, List<? extends zzk> list) {
        C24362h.m61211f(str, "spotId");
        this.f30828a = context;
        this.f30829b = str;
        this.f30830c = list;
        IntentFilter intentFilter = new IntentFilter();
        if (list != null) {
            for (zzk zzk : list) {
                intentFilter.addAction(zzk.zza);
            }
        }
        C5367a.m13473a(this.f30828a).mo21146b(this, intentFilter);
    }
}
