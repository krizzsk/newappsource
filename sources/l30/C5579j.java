package l30;

import com.google.android.gms.tasks.OnSuccessListener;
import com.moovit.map.MarkerZoomStyle;
import com.moovit.transit.LocationDescriptor;

/* renamed from: l30.j */
public final /* synthetic */ class C5579j implements OnSuccessListener {

    /* renamed from: b */
    public final /* synthetic */ C5585p f18281b;

    /* renamed from: c */
    public final /* synthetic */ LocationDescriptor f18282c;

    public /* synthetic */ C5579j(C5585p pVar, LocationDescriptor locationDescriptor) {
        this.f18281b = pVar;
        this.f18282c = locationDescriptor;
    }

    public final void onSuccess(Object obj) {
        C5585p pVar = this.f18281b;
        LocationDescriptor locationDescriptor = this.f18282c;
        pVar.f18304c.mo48646o2(locationDescriptor, locationDescriptor, (MarkerZoomStyle) obj);
    }
}
