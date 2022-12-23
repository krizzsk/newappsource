package d40;

import android.location.Location;
import android.os.AsyncTask;
import android.os.PowerManager;
import ce0.C21100e;
import com.moovit.navigation.C4226a;
import com.moovit.navigation.event.NavigableUpdateEvent;
import com.moovit.network.model.ServerId;

/* renamed from: d40.h */
public final class C4358h extends AsyncTask<Void, Void, Object> {

    /* renamed from: a */
    public final /* synthetic */ ServerId[] f15345a;

    /* renamed from: b */
    public final /* synthetic */ PowerManager.WakeLock f15346b;

    /* renamed from: c */
    public final /* synthetic */ C4351g f15347c;

    public C4358h(C4351g gVar, Location location, ServerId[] serverIdArr, PowerManager.WakeLock wakeLock) {
        this.f15347c = gVar;
        this.f15345a = serverIdArr;
        this.f15346b = wakeLock;
    }

    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        C21100e.m49373x(this.f15345a, "currentGeofenceIds");
        this.f15347c.f15325b.mo19599D1();
        return null;
    }

    public final void onCancelled() {
        super.onCancelled();
        this.f15347c.f15331h = null;
        this.f15346b.release();
    }

    public final void onPostExecute(Object obj) {
        this.f15346b.release();
        if (obj != null) {
            C4351g gVar = this.f15347c;
            gVar.f15325b.mo19611y1();
            C4226a aVar = gVar.f15328e;
            aVar.f15098c.mo19611y1();
            if (aVar.f15100e) {
                aVar.f15082h.mo50015m(new C4349e(aVar));
            }
            gVar.mo19857g(new NavigableUpdateEvent(gVar.f15325b.mo19639e0()));
            gVar.mo19855e();
        }
        this.f15347c.f15331h = null;
    }
}
