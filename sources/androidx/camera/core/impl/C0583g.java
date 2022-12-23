package androidx.camera.core.impl;

import androidx.camera.core.impl.DeferrableSurface;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p066e0.C4455s;
import p102h0.C5023g;

/* renamed from: androidx.camera.core.impl.g */
public final class C0583g {
    /* renamed from: a */
    public static void m1628a(List<DeferrableSurface> list) throws DeferrableSurface.SurfaceClosedException {
        if (!list.isEmpty()) {
            int i = 0;
            do {
                try {
                    list.get(i).mo2454e();
                    i++;
                } catch (DeferrableSurface.SurfaceClosedException e) {
                    for (int i2 = i - 1; i2 >= 0; i2--) {
                        list.get(i2).mo2451b();
                    }
                    throw e;
                }
            } while (i < list.size());
        }
    }

    /* renamed from: b */
    public static CallbackToFutureAdapter.C0675c m1629b(List list, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C5023g.m12858f(((DeferrableSurface) it.next()).mo2452c()));
        }
        return CallbackToFutureAdapter.m1884a(new C4455s(arrayList, scheduledExecutorService, executor));
    }
}
