package l40;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import ce0.C21100e;
import com.appsflyer.ServerParameters;
import com.moovit.offline.GtfsConfiguration;
import com.moovit.offline.TripPlannerService;
import com.moovit.tripplanner.TripPlannerLocations;
import com.moovit.tripplanner.TripPlannerTime;
import d00.C16531a;
import g00.C17136a;
import java.util.Calendar;
import p977zz.C20936e0;
import s00.C19391d;

/* renamed from: l40.i */
public final class C5621i extends C16531a<C5623b> {

    /* renamed from: b */
    public final C5622a f18358b = new C5622a();

    /* renamed from: c */
    public final GtfsConfiguration f18359c;

    /* renamed from: d */
    public final C19391d f18360d;

    /* renamed from: e */
    public final C5623b f18361e;

    /* renamed from: f */
    public TripPlannerService f18362f = null;

    /* renamed from: l40.i$a */
    public class C5622a implements ServiceConnection {
        public C5622a() {
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C5621i iVar = C5621i.this;
            iVar.f18362f = (TripPlannerService) ((C17136a) iBinder).f44367b;
            iVar.onContentChanged();
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            C5621i.this.f18362f = null;
        }
    }

    /* renamed from: l40.i$b */
    public static class C5623b {

        /* renamed from: a */
        public final TripPlannerLocations f18364a;

        /* renamed from: b */
        public final TripPlannerTime f18365b;

        /* renamed from: c */
        public final int f18366c;

        /* renamed from: d */
        public final C5618f f18367d;

        public C5623b(TripPlannerLocations tripPlannerLocations, TripPlannerTime tripPlannerTime) {
            this(0, (C5618f) null, tripPlannerLocations, tripPlannerTime);
        }

        public C5623b(int i, C5618f fVar, TripPlannerLocations tripPlannerLocations, TripPlannerTime tripPlannerTime) {
            C21100e.m49373x(tripPlannerLocations, "locations");
            this.f18364a = tripPlannerLocations;
            C21100e.m49373x(tripPlannerTime, "time");
            this.f18365b = tripPlannerTime;
            this.f18367d = fVar;
            C21100e.m49359q(i, ServerParameters.RETRIES);
            this.f18366c = i;
        }
    }

    public C5621i(Context context, GtfsConfiguration gtfsConfiguration, C19391d dVar, C5623b bVar) {
        super(context);
        this.f18359c = gtfsConfiguration;
        this.f18360d = dVar;
        C21100e.m49373x(bVar, "request");
        this.f18361e = bVar;
    }

    /* renamed from: a */
    public final void mo21481a(Context context) {
        context.bindService(new Intent(context, TripPlannerService.class), this.f18358b, 1);
    }

    /* renamed from: c */
    public final void mo21482c(Context context) {
        context.unbindService(this.f18358b);
    }

    public final Object loadInBackground() {
        long b = this.f18361e.f18365b.mo24487b();
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(b);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        int i = this.f18359c.f15149d / 2;
        int timeInMillis = (int) (instance.getTimeInMillis() / 86400000);
        int c = (this.f18361e.f18366c * i) + C20936e0.m49037c(instance.get(11), i);
        TripPlannerService tripPlannerService = this.f18362f;
        C5618f fVar = null;
        if (tripPlannerService != null) {
            GtfsConfiguration gtfsConfiguration = this.f18359c;
            C19391d dVar = this.f18360d;
            synchronized (tripPlannerService) {
                C21100e.m49355o();
                TripPlannerService.C4261a aVar = new TripPlannerService.C4261a(dVar.f49321d, dVar.f49322e, timeInMillis, c);
                if (tripPlannerService.f15156b == null) {
                    tripPlannerService.f15156b = tripPlannerService.mo19772b(dVar);
                }
                if (tripPlannerService.f15156b != null) {
                    fVar = (C5618f) tripPlannerService.f15157c.getOrDefault(aVar, null);
                    if (fVar == null && (fVar = tripPlannerService.mo19771a(tripPlannerService.f15156b, dVar, gtfsConfiguration, aVar)) != null) {
                        tripPlannerService.f15157c.put(aVar, fVar);
                    }
                }
            }
        }
        C5623b bVar = this.f18361e;
        return new C5623b(bVar.f18366c, fVar, bVar.f18364a, bVar.f18365b);
    }
}
