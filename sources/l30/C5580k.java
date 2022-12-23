package l30;

import a40.C0078a;
import com.google.android.gms.tasks.Task;
import com.moovit.MoovitExecutors;
import com.moovit.commons.geo.BoxE6;
import com.moovit.map.MapFragment;
import com.moovit.map.MarkerZoomStyle;
import com.moovit.micromobility.ride.MicroMobilityRide;
import java.util.concurrent.ExecutorService;
import p304x.C7070l;
import p688nu.C18630b;
import p977zz.C20944i0;

/* renamed from: l30.k */
public final /* synthetic */ class C5580k implements MapFragment.C16237r {

    /* renamed from: a */
    public final /* synthetic */ C5585p f18283a;

    /* renamed from: b */
    public final /* synthetic */ C20944i0 f18284b;

    /* renamed from: c */
    public final /* synthetic */ MicroMobilityRide f18285c;

    public /* synthetic */ C5580k(C20944i0 i0Var, C5585p pVar, MicroMobilityRide microMobilityRide) {
        this.f18283a = pVar;
        this.f18284b = i0Var;
        this.f18285c = microMobilityRide;
    }

    /* renamed from: a */
    public final void mo21406a() {
        C5585p pVar = this.f18283a;
        C20944i0 i0Var = this.f18284b;
        MicroMobilityRide microMobilityRide = this.f18285c;
        pVar.f18304c.mo48641l3((MapFragment.MapFollowMode) i0Var.f52692a, false);
        BoxE6 boxE6 = (BoxE6) i0Var.f52693b;
        if (boxE6 != null) {
            C0078a aVar = microMobilityRide.f14992j;
            Task<MarkerZoomStyle> f = pVar.mo21413f(aVar.f197b, aVar.f198c);
            ExecutorService executorService = MoovitExecutors.COMPUTATION;
            f.continueWith(executorService, new C5582m(pVar)).onSuccessTask(executorService, new C7070l(pVar, 16)).addOnSuccessListener(MoovitExecutors.MAIN_THREAD, new C18630b(1, pVar, boxE6));
        }
    }
}
