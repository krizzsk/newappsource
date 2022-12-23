package com.veriff.sdk.camera.core.impl;

import android.view.Surface;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.veriff.sdk.camera.core.impl.DeferrableSurface;
import com.veriff.sdk.camera.core.impl.utils.futures.FutureCallback;
import com.veriff.sdk.camera.core.impl.utils.futures.Futures;
import fd0.C12686g;
import fd0.C12687h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p001a0.C0016g;
import p304x.C7029b1;
import p695od.C18728c;

public final class DeferrableSurfaces {
    public static void decrementAll(List<DeferrableSurface> list) {
        for (DeferrableSurface decrementUseCount : list) {
            decrementUseCount.decrementUseCount();
        }
    }

    public static void incrementAll(List<DeferrableSurface> list) throws DeferrableSurface.SurfaceClosedException {
        if (!list.isEmpty()) {
            int i = 0;
            do {
                try {
                    list.get(i).incrementUseCount();
                    i++;
                } catch (DeferrableSurface.SurfaceClosedException e) {
                    for (int i2 = i - 1; i2 >= 0; i2--) {
                        list.get(i2).decrementUseCount();
                    }
                    throw e;
                }
            } while (i < list.size());
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$surfaceListWithTimeout$0(C18728c cVar, CallbackToFutureAdapter.C0673a aVar, long j) {
        if (!cVar.isDone()) {
            aVar.mo2698c(new TimeoutException(C0016g.m29l("Cannot complete surfaceList within ", j)));
            cVar.cancel(true);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object lambda$surfaceListWithTimeout$3(List list, ScheduledExecutorService scheduledExecutorService, Executor executor, long j, final boolean z, final CallbackToFutureAdapter.C0673a aVar) throws Exception {
        C18728c successfulAsList = Futures.successfulAsList(list);
        final ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new C12687h(executor, successfulAsList, aVar, j), j, TimeUnit.MILLISECONDS);
        aVar.mo2696a(new C7029b1(successfulAsList, 15), executor);
        Futures.addCallback(successfulAsList, new FutureCallback<List<Surface>>() {
            public void onFailure(Throwable th) {
                aVar.mo2697b(Collections.unmodifiableList(Collections.emptyList()));
                schedule.cancel(true);
            }

            public void onSuccess(List<Surface> list) {
                ArrayList arrayList = new ArrayList(list);
                if (z) {
                    arrayList.removeAll(Collections.singleton((Object) null));
                }
                aVar.mo2697b(arrayList);
                schedule.cancel(true);
            }
        }, executor);
        return "surfaceList";
    }

    public static C18728c<List<Surface>> surfaceListWithTimeout(Collection<DeferrableSurface> collection, boolean z, long j, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        ArrayList arrayList = new ArrayList();
        for (DeferrableSurface surface : collection) {
            arrayList.add(surface.getSurface());
        }
        return CallbackToFutureAdapter.m1884a(new C12686g(arrayList, scheduledExecutorService, executor, j, z));
    }
}
