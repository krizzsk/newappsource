package p665mv;

import android.graphics.Rect;
import com.moovit.app.ridesharing.EventDetailActivity;
import com.moovit.commons.geo.BoxE6;
import com.moovit.commons.geo.Polyline;
import com.moovit.commons.geo.Polylon;
import com.moovit.commons.utils.Color;
import com.moovit.image.model.ResourceImage;
import com.moovit.map.C16281i;
import com.moovit.map.MapFragment;
import com.moovit.map.MarkerZoomStyle;
import p762qz.C19206b;
import p824tp.C19739q;

/* renamed from: mv.b */
public final /* synthetic */ class C18466b implements MapFragment.C16237r {

    /* renamed from: a */
    public final /* synthetic */ EventDetailActivity f47061a;

    /* renamed from: b */
    public final /* synthetic */ C19206b f47062b;

    /* renamed from: c */
    public final /* synthetic */ C19206b f47063c;

    /* renamed from: d */
    public final /* synthetic */ Polyline f47064d;

    /* renamed from: e */
    public final /* synthetic */ Polyline f47065e;

    public /* synthetic */ C18466b(EventDetailActivity eventDetailActivity, C19206b bVar, C19206b bVar2, Polyline polyline, Polylon polylon) {
        this.f47061a = eventDetailActivity;
        this.f47062b = bVar;
        this.f47063c = bVar2;
        this.f47064d = polyline;
        this.f47065e = polylon;
    }

    /* renamed from: a */
    public final void mo21406a() {
        EventDetailActivity eventDetailActivity = this.f47061a;
        C19206b bVar = this.f47062b;
        C19206b bVar2 = this.f47063c;
        Polyline polyline = this.f47064d;
        Polyline polyline2 = this.f47065e;
        eventDetailActivity.f39276r0.mo48609E2();
        MarkerZoomStyle markerZoomStyle = new MarkerZoomStyle(new ResourceImage(C19739q.ic_trip_start_16_on_surface_emphasis_high, new String[0]));
        eventDetailActivity.f39276r0.mo48646o2(bVar, bVar, markerZoomStyle);
        MarkerZoomStyle h = C16281i.m41512h();
        eventDetailActivity.f39276r0.mo48646o2(bVar2, bVar2, h);
        Rect k = C16281i.m41515k(eventDetailActivity.getApplicationContext(), markerZoomStyle, h);
        if (polyline != null) {
            eventDetailActivity.f39276r0.mo48662w2(polyline, C16281i.m41519o(eventDetailActivity, Color.f41002f));
            eventDetailActivity.f39276r0.mo48606B2(k, polyline.getBounds(), false);
        } else {
            eventDetailActivity.f39276r0.mo48606B2(k, BoxE6.m40164c(bVar.getLocation(), bVar2.getLocation()), false);
        }
        if (polyline2 != null) {
            eventDetailActivity.f39276r0.mo48662w2(polyline2, C16281i.m41521q(eventDetailActivity));
        }
    }
}
