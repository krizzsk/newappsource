package com.facebook.appevents;

import android.content.Context;
import bf0.C21050d;
import java.util.UUID;
import kotlin.Metadata;
import mf0.C24362h;
import p262t8.C6606a;

public final class AppEventsLogger {

    /* renamed from: a */
    public final C2338j f8485a;

    @Metadata(mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, mo59060d2 = {"Lcom/facebook/appevents/AppEventsLogger$FlushBehavior;", "", "(Ljava/lang/String;I)V", "AUTO", "EXPLICIT_ONLY", "facebook-core_release"}, mo59061k = 1, mo59062mv = {1, 5, 1}, mo59064xi = 48)
    public enum FlushBehavior {
        AUTO,
        EXPLICIT_ONLY
    }

    /* renamed from: com.facebook.appevents.AppEventsLogger$a */
    public static final class C2315a {
        /* renamed from: a */
        public static String m6184a(Context context) {
            Class<C2338j> cls = C2338j.class;
            if (C2338j.m6205a() == null) {
                synchronized (C2338j.m6207c()) {
                    if (C2338j.m6205a() == null) {
                        String string = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", (String) null);
                        if (!C6606a.m15601b(cls)) {
                            try {
                                C2338j.f8540f = string;
                            } catch (Throwable th) {
                                C6606a.m15600a(cls, th);
                            }
                        }
                        if (C2338j.m6205a() == null) {
                            UUID randomUUID = UUID.randomUUID();
                            C24362h.m61210e(randomUUID, "randomUUID()");
                            String k = C24362h.m61216k(randomUUID, "XZ");
                            if (!C6606a.m15601b(cls)) {
                                try {
                                    C2338j.f8540f = k;
                                } catch (Throwable th2) {
                                    C6606a.m15600a(cls, th2);
                                }
                            }
                            context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", C2338j.m6205a()).apply();
                        }
                    }
                    C21050d dVar = C21050d.f52856a;
                }
            }
            String a = C2338j.m6205a();
            if (a != null) {
                return a;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
    }

    public AppEventsLogger(Context context) {
        this.f8485a = new C2338j(context, (String) null);
    }
}
