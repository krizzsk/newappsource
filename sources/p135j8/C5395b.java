package p135j8;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import bf0.C21050d;
import mf0.C24362h;
import p009a8.C0115o;

/* renamed from: j8.b */
public final /* synthetic */ class C5395b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ long f17717b;

    /* renamed from: c */
    public final /* synthetic */ String f17718c;

    public /* synthetic */ C5395b(long j, String str) {
        this.f17717b = j;
        this.f17718c = str;
    }

    public final void run() {
        long j = this.f17717b;
        String str = this.f17718c;
        C24362h.m61211f(str, "$activityName");
        if (C5396c.f17725g == null) {
            C5396c.f17725g = new C5405i(Long.valueOf(j), (Long) null);
        }
        if (C5396c.f17724f.get() <= 0) {
            C5406j jVar = C5406j.f17752a;
            C5406j.m13511c(str, C5396c.f17725g, C5396c.f17727i);
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(C0115o.m210a()).edit();
            edit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
            edit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
            edit.remove("com.facebook.appevents.SessionInfo.interruptionCount");
            edit.remove("com.facebook.appevents.SessionInfo.sessionId");
            edit.apply();
            SharedPreferences.Editor edit2 = PreferenceManager.getDefaultSharedPreferences(C0115o.m210a()).edit();
            edit2.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
            edit2.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
            edit2.apply();
            C5396c.f17725g = null;
        }
        synchronized (C5396c.f17723e) {
            C5396c.f17722d = null;
            C21050d dVar = C21050d.f52856a;
        }
    }
}
