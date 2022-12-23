package com.facebook.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.facebook.appevents.C2338j;
import java.util.Set;
import kotlin.Metadata;
import kotlin.text.Regex;
import mf0.C24362h;
import p009a8.C0098d0;
import p009a8.C0115o;
import p130j2.C5367a;
import p262t8.C6606a;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, mo59060d2 = {"Lcom/facebook/internal/BoltsMeasurementEventListener;", "Landroid/content/BroadcastReceiver;", "a", "facebook-core_release"}, mo59061k = 1, mo59062mv = {1, 5, 1})
public final class BoltsMeasurementEventListener extends BroadcastReceiver {

    /* renamed from: b */
    public static BoltsMeasurementEventListener f8583b;

    /* renamed from: a */
    public final Context f8584a;

    /* renamed from: com.facebook.internal.BoltsMeasurementEventListener$a */
    public static final class C2364a {
        /* renamed from: a */
        public static void m6252a(Context context) {
            if (BoltsMeasurementEventListener.m6251a() != null) {
                BoltsMeasurementEventListener.m6251a();
                return;
            }
            BoltsMeasurementEventListener boltsMeasurementEventListener = new BoltsMeasurementEventListener(context);
            if (!C6606a.m15601b(BoltsMeasurementEventListener.class)) {
                try {
                    if (!C6606a.m15601b(boltsMeasurementEventListener)) {
                        C5367a a = C5367a.m13473a(boltsMeasurementEventListener.f8584a);
                        C24362h.m61210e(a, "getInstance(applicationContext)");
                        a.mo21146b(boltsMeasurementEventListener, new IntentFilter("com.parse.bolts.measurement_event"));
                    }
                } catch (Throwable th) {
                    C6606a.m15600a(BoltsMeasurementEventListener.class, th);
                }
            }
            if (!C6606a.m15601b(BoltsMeasurementEventListener.class)) {
                try {
                    BoltsMeasurementEventListener.f8583b = boltsMeasurementEventListener;
                } catch (Throwable th2) {
                    C6606a.m15600a(BoltsMeasurementEventListener.class, th2);
                }
            }
            BoltsMeasurementEventListener.m6251a();
        }
    }

    public BoltsMeasurementEventListener(Context context) {
        Context applicationContext = context.getApplicationContext();
        C24362h.m61210e(applicationContext, "context.applicationContext");
        this.f8584a = applicationContext;
    }

    /* renamed from: a */
    public static final /* synthetic */ BoltsMeasurementEventListener m6251a() {
        if (C6606a.m15601b(BoltsMeasurementEventListener.class)) {
            return null;
        }
        try {
            return f8583b;
        } catch (Throwable th) {
            C6606a.m15600a(BoltsMeasurementEventListener.class, th);
            return null;
        }
    }

    public final void finalize() throws Throwable {
        if (!C6606a.m15601b(this)) {
            try {
                if (!C6606a.m15601b(this)) {
                    C5367a a = C5367a.m13473a(this.f8584a);
                    C24362h.m61210e(a, "getInstance(applicationContext)");
                    a.mo21148d(this);
                }
            } catch (Throwable th) {
                C6606a.m15600a(this, th);
            }
        }
    }

    public final void onReceive(Context context, Intent intent) {
        String str;
        Bundle bundle;
        if (!C6606a.m15601b(this)) {
            try {
                Set<String> set = null;
                C2338j jVar = new C2338j(context, (String) null);
                if (intent == null) {
                    str = null;
                } else {
                    str = intent.getStringExtra("event_name");
                }
                String k = C24362h.m61216k(str, "bf_");
                if (intent == null) {
                    bundle = null;
                } else {
                    bundle = intent.getBundleExtra("event_args");
                }
                Bundle bundle2 = new Bundle();
                if (bundle != null) {
                    set = bundle.keySet();
                }
                if (set != null) {
                    for (String next : set) {
                        C24362h.m61210e(next, LinksConfiguration.KEY_KEY);
                        bundle2.putString(new Regex("[ -]*$").mo60284c(new Regex("^[ -]*").mo60284c(new Regex("[^0-9a-zA-Z _-]").mo60284c(next, "-"), ""), ""), (String) bundle.get(next));
                    }
                }
                C0115o oVar = C0115o.f331a;
                if (C0098d0.m169b()) {
                    jVar.mo12484d(bundle2, k);
                }
            } catch (Throwable th) {
                C6606a.m15600a(this, th);
            }
        }
    }
}
