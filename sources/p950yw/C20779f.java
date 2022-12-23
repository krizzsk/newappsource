package p950yw;

import android.content.Context;
import android.graphics.Bitmap;
import ce0.C21100e;
import com.appboy.support.ValidationUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.app.tod.bookingflow.model.FailureReason;
import com.moovit.app.tod.bookingflow.model.TodBookingPickupLocationState;
import com.moovit.app.tod.bookingflow.model.TodZoneShape;
import com.moovit.commons.utils.Color;
import com.moovit.commons.utils.UiUtils;
import com.moovit.image.model.Image;
import com.moovit.map.C16281i;
import com.moovit.map.C16286k;
import com.moovit.map.LineStyle;
import com.moovit.map.MapFragment;
import com.moovit.map.MarkerZoomStyle;
import com.moovit.transit.LocationDescriptor;
import com.tranzmate.R;
import java.util.Iterator;
import java.util.List;
import k00.C17988b;
import o20.C18699e;
import o20.C18711q;
import p304x.C7097r;
import p451du.C16716m;

/* renamed from: yw.f */
public final class C20779f {

    /* renamed from: a */
    public final Context f52429a;

    /* renamed from: b */
    public final MapFragment f52430b;

    /* renamed from: c */
    public final LineStyle f52431c;

    /* renamed from: d */
    public final LineStyle f52432d;

    /* renamed from: e */
    public final C16286k f52433e;

    /* renamed from: f */
    public final C18711q f52434f;

    public C20779f(MapFragment mapFragment) {
        C21100e.m49373x(mapFragment, "mapFragment");
        this.f52430b = mapFragment;
        Context requireContext = mapFragment.requireContext();
        this.f52429a = requireContext;
        this.f52432d = C16281i.m41519o(requireContext, Color.m40220d(R.attr.colorSurfaceInverse, requireContext));
        LineStyle.LineJoin lineJoin = LineStyle.LineJoin.NONE;
        Color d = Color.m40220d(R.attr.colorSurfaceInverseEmphasisLow, requireContext);
        C21100e.m49373x(d, "color");
        this.f52431c = new LineStyle(d, 10.0f, lineJoin, C17988b.m44610a(R.drawable.map_ring_inner_small, requireContext), (Bitmap) null, BitmapDescriptorFactory.HUE_RED);
        Color color = new Color(android.graphics.Color.argb(21, 98, 156, ValidationUtils.APPBOY_STRING_MAX_LENGTH));
        Color color2 = new Color(android.graphics.Color.rgb(26, 101, 229));
        LineStyle.LineJoin lineJoin2 = LineStyle.LineJoin.ROUND;
        C21100e.m49373x(lineJoin2, "lineJoin");
        float e = UiUtils.m40246e(mapFragment.requireContext(), 2.0f);
        C21100e.m49357p(e, "strokeWidth");
        this.f52433e = new C16286k(color, new LineStyle(color2, e, lineJoin2, (Bitmap) null, (Bitmap) null, BitmapDescriptorFactory.HUE_RED));
        this.f52434f = mapFragment.mo48614K2(1100);
    }

    /* renamed from: a */
    public final void mo52908a(Runnable runnable) {
        if (!this.f52430b.mo48624U2()) {
            this.f52430b.mo48656t2(new C16716m(1, this, runnable));
        } else {
            runnable.run();
        }
    }

    /* renamed from: b */
    public final MarkerZoomStyle mo52909b(int i, LocationDescriptor locationDescriptor) {
        Context context = this.f52429a;
        MarkerZoomStyle i2 = C16281i.m41513i(context, i, C17988b.m44611b(i, context), locationDescriptor.mo24313f());
        this.f52430b.mo48646o2(locationDescriptor.mo24310d(), locationDescriptor, i2);
        return i2;
    }

    /* renamed from: c */
    public final void mo52910c(TodBookingPickupLocationState todBookingPickupLocationState) {
        this.f52430b.mo48610F2();
        this.f52430b.mo48613I2();
        if (todBookingPickupLocationState != null) {
            if (FailureReason.NONE.equals(todBookingPickupLocationState.f40100c)) {
                mo52909b(R.drawable.img_tod_map_trip_start_24, todBookingPickupLocationState.f40099b);
            }
            mo52908a(new C7097r(19, this, todBookingPickupLocationState));
        }
    }

    /* renamed from: d */
    public final void mo52911d(List<TodZoneShape> list) {
        this.f52430b.mo48612H2();
        for (TodZoneShape todZoneShape : list) {
            this.f52430b.mo48660v2(todZoneShape.f40103c, this.f52433e);
        }
    }

    /* renamed from: e */
    public final void mo52912e(int i, List list) {
        MarkerZoomStyle markerZoomStyle;
        this.f52434f.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LocationDescriptor locationDescriptor = (LocationDescriptor) it.next();
            Image image = locationDescriptor.f23655j;
            if (image != null) {
                markerZoomStyle = new MarkerZoomStyle(image);
            } else {
                markerZoomStyle = C16281i.m41506b(i);
            }
            this.f52430b.mo48650q2(locationDescriptor.mo24310d(), locationDescriptor, new C18699e(markerZoomStyle), this.f52434f);
        }
    }
}
