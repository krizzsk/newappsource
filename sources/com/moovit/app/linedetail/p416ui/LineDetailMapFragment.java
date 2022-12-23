package com.moovit.app.linedetail.p416ui;

import a00.C13382a;
import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import c00.C13717b;
import com.appboy.support.ValidationUtils;
import com.google.android.play.core.assetpacks.C14256d1;
import com.moovit.app.linedetail.p416ui.C15101a;
import com.moovit.commons.geo.BoxE6;
import com.moovit.commons.geo.Polyline;
import com.moovit.commons.utils.Color;
import com.moovit.image.model.ImageSet;
import com.moovit.map.C16281i;
import com.moovit.map.LineStyle;
import com.moovit.map.MapFragment;
import com.moovit.map.MapOverlaysLayout;
import com.moovit.map.MarkerZoomStyle;
import com.moovit.network.model.ServerId;
import com.moovit.transit.C7843b;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitLineGroup;
import com.moovit.transit.TransitPatternShape;
import com.moovit.transit.TransitPatternTrips;
import com.moovit.transit.TransitStop;
import com.moovit.transit.TransitType;
import com.moovit.util.time.Time;
import com.moovit.util.time.TimeVehicleLocation;
import com.tranzmate.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import o20.C18699e;
import o20.C18711q;
import p025b6.C1495h;
import p241s0.C6302b;
import p241s0.C6307g;
import p297w5.C6994a;
import p451du.C16713j;
import p451du.C16714k;
import p451du.C16715l;
import p451du.C16716m;
import p451du.C16717n;
import p451du.C16718o;
import p451du.C16719p;
import p824tp.C19739q;
import p977zz.C20943i;
import p977zz.C20944i0;
import p977zz.C20975x0;

/* renamed from: com.moovit.app.linedetail.ui.LineDetailMapFragment */
public class LineDetailMapFragment extends MapFragment implements C15101a.C15108g {

    /* renamed from: Y0 */
    public static final /* synthetic */ int f38746Y0 = 0;

    /* renamed from: J0 */
    public ImageView f38747J0;

    /* renamed from: K0 */
    public LineStyle f38748K0;

    /* renamed from: L0 */
    public LineStyle f38749L0;

    /* renamed from: M0 */
    public Color f38750M0;

    /* renamed from: N0 */
    public MarkerZoomStyle f38751N0;

    /* renamed from: O0 */
    public MarkerZoomStyle f38752O0;

    /* renamed from: P0 */
    public Object f38753P0;

    /* renamed from: Q0 */
    public BoxE6 f38754Q0;

    /* renamed from: R0 */
    public TransitStop f38755R0;

    /* renamed from: S0 */
    public final ArrayList f38756S0 = new ArrayList();

    /* renamed from: T0 */
    public final C6302b f38757T0 = new C6302b();

    /* renamed from: U0 */
    public C18711q f38758U0;

    /* renamed from: V0 */
    public C18699e<MarkerZoomStyle> f38759V0;

    /* renamed from: W0 */
    public MarkerZoomStyle f38760W0;

    /* renamed from: X0 */
    public Rect f38761X0;

    /* renamed from: com.moovit.app.linedetail.ui.LineDetailMapFragment$a */
    public interface C15094a {
        /* renamed from: u0 */
        void mo45424u0(int i, TransitStop transitStop);
    }

    /* renamed from: A3 */
    public final void mo45426A3(List<TransitStop> list, int i, int i2, int i3, MarkerZoomStyle markerZoomStyle) {
        boolean z;
        boolean z2;
        TransitStop transitStop = list.get(list.size() - 1);
        while (i2 <= i3) {
            TransitStop transitStop2 = list.get(i2);
            Object remove = this.f38757T0.remove(transitStop2.f23730b);
            if (remove != null) {
                mo48636g3(remove);
            }
            if (!transitStop2.equals(transitStop)) {
                if (i2 == i) {
                    z = true;
                } else {
                    z = false;
                }
                if (i2 == i) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                mo45427B3(transitStop2, i2, z, z2, markerZoomStyle);
            }
            i2++;
        }
    }

    /* renamed from: B0 */
    public final void mo45407B0() {
    }

    /* renamed from: B3 */
    public final void mo45427B3(TransitStop transitStop, int i, boolean z, boolean z2, MarkerZoomStyle markerZoomStyle) {
        int i2;
        if (!mo48624U2()) {
            mo48656t2(new C16719p(this, transitStop, i, z, z2, markerZoomStyle));
            return;
        }
        ImageSet imageSet = transitStop.f23738j;
        if (z || z2) {
            i2 = ValidationUtils.APPBOY_STRING_MAX_LENGTH;
        } else {
            i2 = 127;
        }
        SparseArray d = MarkerZoomStyle.m41441d(imageSet, (C1495h) null, i2);
        if (z) {
            C16281i.m41507c(d);
        } else if (d.size() > 0 && d.keyAt(0) > 1400) {
            d.put(1400, markerZoomStyle);
        }
        this.f38757T0.put(transitStop.f23730b, mo48648p2(transitStop.f23732d, new C20944i0(transitStop, Integer.valueOf(i)), C18699e.m45697a(d)));
    }

    /* renamed from: C3 */
    public final void mo45428C3(boolean z, List<TransitPatternTrips> list, List<TransitStop> list2, TransitStop transitStop, int i, TransitLine transitLine) {
        boolean z2;
        if (!mo48624U2()) {
            mo48656t2(new C16717n(this, z, list, list2, transitStop, i, transitLine));
            return;
        }
        mo45433y3();
        mo45434z3(i, list, z);
        TransitType.ViewType e = C7843b.m17878e(transitLine);
        if (e == null || e == TransitType.ViewType.DEFAULT) {
            z2 = false;
        } else {
            z2 = true;
        }
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            TransitStop transitStop2 = list2.get(i2);
            if (i2 == size - 1) {
                this.f38753P0 = mo48646o2(transitStop2.f23732d, new C20944i0(transitStop2, Integer.valueOf(i2)), this.f38760W0);
            } else if (i2 < i) {
                mo45427B3(transitStop2, i2, C20975x0.m49118e(transitStop2, transitStop), z2, this.f38752O0);
            } else {
                mo45427B3(transitStop2, i2, C20975x0.m49118e(transitStop2, transitStop), z2, this.f38751N0);
            }
        }
    }

    /* renamed from: D3 */
    public final void mo45429D3(boolean z, List<TransitPatternTrips> list, TransitStop transitStop, int i, List<TransitStop> list2, TransitStop transitStop2, int i2) {
        int i3 = i;
        int i4 = i2;
        if (!mo48624U2()) {
            mo48656t2(new C16718o(this, z, list, transitStop, i, list2, transitStop2, i2));
            return;
        }
        TransitStop transitStop3 = transitStop;
        if (!C20975x0.m49118e(transitStop2, transitStop) || i3 != i4) {
            if (i4 < i3) {
                mo45426A3(list2, i, i2, i, this.f38752O0);
            } else {
                mo45426A3(list2, i, i, i2, this.f38751N0);
            }
            Object obj = this.f38753P0;
            if (obj != null) {
                mo48636g3(obj);
            }
            int size = list2.size() - 1;
            TransitStop transitStop4 = list2.get(size);
            this.f38753P0 = mo48646o2(transitStop4.f23732d, new C20944i0(transitStop4, Integer.valueOf(size)), this.f38760W0);
            if (!z) {
                List<TransitPatternTrips> list3 = list;
                mo45434z3(i, list, false);
            }
        }
    }

    /* renamed from: E3 */
    public final void mo45430E3(boolean z) {
        int i;
        this.f38747J0.setTag(Boolean.valueOf(z));
        ImageView imageView = this.f38747J0;
        if (z) {
            i = R.drawable.ic_collapse_24_on_surface_emphasis_high;
        } else {
            i = R.drawable.ic_expand_24_on_surface_emphasis_high;
        }
        imageView.setImageResource(i);
        C13382a.m33672h(this.f38747J0);
    }

    /* renamed from: G0 */
    public final void mo45412G0() {
        Set emptySet = Collections.emptySet();
        this.f42354M.clear();
        this.f42354M.addAll(emptySet);
        mo48633d3();
        this.f38747J0.setVisibility(8);
    }

    /* renamed from: H */
    public final void mo45414H() {
    }

    /* renamed from: I0 */
    public final void mo45416I0(boolean z, boolean z2, TransitLine transitLine, BoxE6 boxE6, List list, List list2, TransitStop transitStop, Integer num, ServerId serverId) {
        TransitStop transitStop2 = transitStop;
        this.f38754Q0 = boxE6;
        this.f38755R0 = transitStop2;
        if (z) {
            mo45428C3(z2, list, list2, transitStop, num.intValue(), transitLine);
            if (transitStop2 == null || !transitStop2.f23730b.equals(serverId)) {
                BoxE6 boxE62 = this.f38754Q0;
                if (boxE62 != null) {
                    mo45431w3(boxE62);
                    return;
                }
                return;
            }
            TransitStop transitStop3 = this.f38755R0;
            if (transitStop3 != null) {
                mo45432x3(transitStop3);
                return;
            }
            return;
        }
        mo45433y3();
    }

    /* renamed from: c1 */
    public final void mo45419c1(List<Time> list) {
        mo48611G2(this.f38758U0);
        if (!C13717b.m34258e(list)) {
            for (Time next : list) {
                TimeVehicleLocation timeVehicleLocation = next.f23912m;
                if (timeVehicleLocation != null) {
                    mo48650q2(timeVehicleLocation.f23926d, next, this.f38759V0, this.f38758U0);
                }
            }
        }
    }

    /* renamed from: i */
    public final void mo45420i(boolean z, List<TransitPatternTrips> list, TransitStop transitStop, int i, List<TransitStop> list2, TransitStop transitStop2, int i2) {
        mo48641l3(MapFragment.MapFollowMode.NONE, false);
        mo45429D3(z, list, transitStop, i, list2, transitStop2, i2);
        mo45432x3(transitStop);
    }

    /* renamed from: k0 */
    public final void mo45421k0(Time time) {
    }

    /* renamed from: l1 */
    public final void mo45422l1(TransitLine transitLine) {
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f38755R0 = (TransitStop) bundle.getParcelable("centeredStop");
            this.f38754Q0 = (BoxE6) bundle.getParcelable("centeredBoundingBox");
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("centeredStop", this.f38755R0);
        bundle.putParcelable("centeredBoundingBox", this.f38754Q0);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        mo48658u2(new C16713j(this));
        MapOverlaysLayout mapOverlaysLayout = this.f42386w;
        LayoutInflater.from(getContext()).inflate(R.layout.line_detail_map_overlay, mapOverlaysLayout, true);
        this.f38747J0 = (ImageView) mapOverlaysLayout.findViewById(R.id.map_zoom_line_button);
        mo45430E3(false);
        this.f38747J0.setOnClickListener(new C6994a(this, 16));
        this.f42350I.add(new C16714k(this, 0));
        LayoutTransition layoutTransition = mapOverlaysLayout.getLayoutTransition();
        if (layoutTransition == null) {
            layoutTransition = new LayoutTransition();
        }
        if (C20943i.m49051d(16)) {
            layoutTransition.enableTransitionType(2);
        }
        mapOverlaysLayout.setLayoutTransition(layoutTransition);
        this.f38758U0 = mo48614K2(1);
    }

    /* renamed from: w0 */
    public final void mo45425w0(TransitLineGroup transitLineGroup, boolean z, boolean z2) {
        int i;
        if (z) {
            Context requireContext = requireContext();
            Color a = C7843b.m17874a(requireContext, transitLineGroup);
            Color b = C7843b.m17875b(requireContext, a);
            Color color = new Color(C14256d1.m35491i(0.65f, a.f41007b, Color.f41003g.f41007b));
            this.f38748K0 = C16281i.m41519o(requireContext, a);
            this.f38749L0 = C16281i.m41519o(requireContext, color);
            this.f38750M0 = b;
            Float valueOf = Float.valueOf(4.0f);
            this.f38751N0 = C16281i.m41516l(a, b, valueOf);
            this.f38752O0 = C16281i.m41516l(color, b, valueOf);
            Color a2 = C7843b.m17874a(requireContext, transitLineGroup);
            TransitType d = C7843b.m17877d(transitLineGroup.f23696d.get());
            if (d != null) {
                i = d.f23760e.smallIconResId;
            } else {
                i = C19739q.ic_transit_type_bus_16_on_surface;
            }
            this.f38759V0 = new C18699e<>(C16281i.m41510f(a2, i, C7843b.m17875b(requireContext, a2), (Color) null, false));
            MarkerZoomStyle h = C16281i.m41512h();
            this.f38760W0 = h;
            this.f38761X0 = C16281i.m41515k(requireContext, h);
        }
    }

    /* renamed from: w3 */
    public final void mo45431w3(BoxE6 boxE6) {
        if (!mo48624U2()) {
            mo48656t2(new C16716m(0, this, boxE6));
            return;
        }
        this.f38754Q0 = boxE6;
        if (boxE6 != null) {
            mo48606B2(this.f38761X0, boxE6, true);
        }
        mo45430E3(true);
    }

    /* renamed from: x3 */
    public final void mo45432x3(TransitStop transitStop) {
        if (!mo48624U2()) {
            mo48656t2(new C16715l(this, transitStop, 0));
            return;
        }
        this.f38755R0 = transitStop;
        if (transitStop != null) {
            mo48663x2(transitStop.f23732d);
            mo45430E3(false);
        }
    }

    /* renamed from: y3 */
    public final void mo45433y3() {
        Iterator it = this.f38756S0.iterator();
        while (it.hasNext()) {
            mo48634e3(it.next());
        }
        this.f38756S0.clear();
        Collection values = this.f38757T0.values();
        C18711q F = this.f42368n.mo48783F();
        Iterator it2 = ((C6307g.C6312e) values).iterator();
        while (true) {
            C6307g.C6308a aVar = (C6307g.C6308a) it2;
            if (!aVar.hasNext()) {
                break;
            }
            mo48637h3(aVar.next(), F);
        }
        this.f38757T0.clear();
        Object obj = this.f38753P0;
        if (obj != null) {
            mo48636g3(obj);
        }
    }

    /* renamed from: z3 */
    public final void mo45434z3(int i, List list, boolean z) {
        Iterator it = this.f38756S0.iterator();
        while (it.hasNext()) {
            mo48634e3(it.next());
        }
        this.f38756S0.clear();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            TransitPatternTrips transitPatternTrips = (TransitPatternTrips) it2.next();
            if (z) {
                for (TransitPatternShape next : transitPatternTrips.f23723h) {
                    this.f38756S0.add(mo48642m2(next.mo24396c(0, next.f23713b.size()), this.f38748K0, this.f38750M0));
                }
            } else {
                int f = transitPatternTrips.f23717b.mo24389f();
                for (TransitPatternShape next2 : transitPatternTrips.f23723h) {
                    Polyline c = next2.mo24396c(0, i);
                    if (c != null) {
                        this.f38756S0.add(mo48642m2(c, this.f38749L0, this.f38750M0));
                    }
                    Polyline c2 = next2.mo24396c(i, f - 1);
                    if (c2 != null) {
                        this.f38756S0.add(mo48642m2(c2, this.f38748K0, this.f38750M0));
                    }
                }
            }
        }
    }
}
