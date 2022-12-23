package z70;

import com.google.android.gms.tasks.OnFailureListener;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.search.C7604a;

/* renamed from: z70.d */
public final /* synthetic */ class C13326d implements OnFailureListener {

    /* renamed from: b */
    public final /* synthetic */ C7604a f33083b;

    /* renamed from: c */
    public final /* synthetic */ String f33084c;

    /* renamed from: d */
    public final /* synthetic */ LatLonE6 f33085d;

    public /* synthetic */ C13326d(C7604a aVar, String str, LatLonE6 latLonE6) {
        this.f33083b = aVar;
        this.f33084c = str;
        this.f33085d = latLonE6;
    }

    public final void onFailure(Exception exc) {
        C7604a aVar = this.f33083b;
        aVar.f23154c.remove(aVar.mo23775a(this.f33084c, this.f33085d));
    }
}
