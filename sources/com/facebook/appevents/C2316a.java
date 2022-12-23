package com.facebook.appevents;

import com.cubic.umo.p045ad.C2218a;
import com.cubic.umo.p045ad.ext.interfaces.UMOAdKit;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import p110h8.C5140d;
import p262t8.C6606a;

/* renamed from: com.facebook.appevents.a */
public final /* synthetic */ class C2316a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f8486b;

    public /* synthetic */ C2316a(int i) {
        this.f8486b = i;
    }

    public final void run() {
        switch (this.f8486b) {
            case 0:
                C2317b.f8487a.getClass();
                C2317b.m6187a();
                return;
            case 1:
                C5140d dVar = C5140d.f17156a;
                Class<C5140d> cls = C5140d.class;
                if (!C6606a.m15601b(cls)) {
                    try {
                        C5140d.f17156a.mo20857a();
                        return;
                    } catch (Throwable th) {
                        C6606a.m15600a(cls, th);
                        return;
                    }
                } else {
                    return;
                }
            case 2:
                int i = AlarmManagerSchedulerBroadcastReceiver.f13390a;
                return;
            default:
                C2218a.f7237a = null;
                UMOAdKit.f7238a.deInitialize();
                return;
        }
    }
}
