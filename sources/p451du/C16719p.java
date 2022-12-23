package p451du;

import com.moovit.app.linedetail.p416ui.LineDetailMapFragment;
import com.moovit.map.MapFragment;
import com.moovit.map.MarkerZoomStyle;
import com.moovit.transit.TransitStop;

/* renamed from: du.p */
public final /* synthetic */ class C16719p implements MapFragment.C16237r {

    /* renamed from: a */
    public final /* synthetic */ LineDetailMapFragment f43545a;

    /* renamed from: b */
    public final /* synthetic */ TransitStop f43546b;

    /* renamed from: c */
    public final /* synthetic */ int f43547c;

    /* renamed from: d */
    public final /* synthetic */ boolean f43548d;

    /* renamed from: e */
    public final /* synthetic */ boolean f43549e;

    /* renamed from: f */
    public final /* synthetic */ MarkerZoomStyle f43550f;

    public /* synthetic */ C16719p(LineDetailMapFragment lineDetailMapFragment, TransitStop transitStop, int i, boolean z, boolean z2, MarkerZoomStyle markerZoomStyle) {
        this.f43545a = lineDetailMapFragment;
        this.f43546b = transitStop;
        this.f43547c = i;
        this.f43548d = z;
        this.f43549e = z2;
        this.f43550f = markerZoomStyle;
    }

    /* renamed from: a */
    public final void mo21406a() {
        LineDetailMapFragment lineDetailMapFragment = this.f43545a;
        TransitStop transitStop = this.f43546b;
        int i = this.f43547c;
        boolean z = this.f43548d;
        boolean z2 = this.f43549e;
        MarkerZoomStyle markerZoomStyle = this.f43550f;
        int i2 = LineDetailMapFragment.f38746Y0;
        lineDetailMapFragment.mo45427B3(transitStop, i, z, z2, markerZoomStyle);
    }
}
