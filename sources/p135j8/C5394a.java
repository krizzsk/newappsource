package p135j8;

import android.content.Context;
import android.os.Bundle;
import bf0.C21050d;
import com.facebook.appevents.C2338j;
import com.facebook.internal.C2429s;
import com.facebook.internal.FetchedAppSettingsManager;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import mf0.C24362h;
import p009a8.C0098d0;
import p009a8.C0115o;
import p262t8.C6606a;

/* renamed from: j8.a */
public final /* synthetic */ class C5394a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ long f17715b;

    /* renamed from: c */
    public final /* synthetic */ String f17716c;

    public /* synthetic */ C5394a(long j, String str) {
        this.f17715b = j;
        this.f17716c = str;
    }

    public final void run() {
        long j;
        int i;
        long j2 = this.f17715b;
        String str = this.f17716c;
        C24362h.m61211f(str, "$activityName");
        if (C5396c.f17725g == null) {
            C5396c.f17725g = new C5405i(Long.valueOf(j2), (Long) null);
        }
        C5405i iVar = C5396c.f17725g;
        if (iVar != null) {
            iVar.f17747b = Long.valueOf(j2);
        }
        if (C5396c.f17724f.get() <= 0) {
            C5395b bVar = new C5395b(j2, str);
            synchronized (C5396c.f17723e) {
                ScheduledExecutorService scheduledExecutorService = C5396c.f17721c;
                C5396c.f17719a.getClass();
                FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.f8592a;
                C2429s b = FetchedAppSettingsManager.m6261b(C0115o.m211b());
                if (b == null) {
                    i = 60;
                } else {
                    i = b.f8709b;
                }
                C5396c.f17722d = scheduledExecutorService.schedule(bVar, (long) i, TimeUnit.SECONDS);
                C21050d dVar = C21050d.f52856a;
            }
        }
        long j3 = C5396c.f17728j;
        if (j3 > 0) {
            j = (j2 - j3) / ((long) 1000);
        } else {
            j = 0;
        }
        C5399e eVar = C5399e.f17732a;
        Context a = C0115o.m210a();
        C2429s f = FetchedAppSettingsManager.m6264f(C0115o.m211b(), false);
        if (f != null && f.f8712e && j > 0) {
            C2338j jVar = new C2338j(a, (String) null);
            Bundle bundle = new Bundle(1);
            bundle.putCharSequence("fb_aa_time_spent_view_name", str);
            double d = (double) j;
            if (C0098d0.m169b() && !C6606a.m15601b(jVar)) {
                try {
                    jVar.mo12485e("fb_aa_time_spent_on_view", Double.valueOf(d), bundle, false, C5396c.m13498a());
                } catch (Throwable th) {
                    C6606a.m15600a(jVar, th);
                }
            }
        }
        C5405i iVar2 = C5396c.f17725g;
        if (iVar2 != null) {
            iVar2.mo21171a();
        }
    }
}
