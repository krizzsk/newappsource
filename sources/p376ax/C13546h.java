package p376ax;

import android.location.Location;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.lifecycle.C1033p;
import com.google.android.exoplayer2.p052ui.C4052r;
import com.moovit.app.tod.bookingflow.TodBookingOrderActivity;
import com.moovit.app.tod.bookingflow.TodBookingOrderViewModel;
import com.moovit.app.tod.bookingflow.model.TodBookingPickupInformation;
import com.moovit.app.tod.bookingflow.model.TodBookingPickupLocationState;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.design.view.list.ListItemView;
import com.moovit.image.model.Image;
import com.moovit.map.MapFragment;
import com.moovit.network.model.ServerId;
import com.moovit.transit.LocationDescriptor;
import com.tranzmate.R;
import ga0.C12699d;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import p073e7.C4585c;
import p453dw.C16740o;
import p501fw.C17110h;
import p777rq.C19314d;
import p873vq.C20197b;
import p923xs.C20576h;
import p977zz.C20961r;
import x00.C20440a;

/* renamed from: ax.h */
public class C13546h extends C13540b {

    /* renamed from: w */
    public static final /* synthetic */ int f33483w = 0;

    /* renamed from: r */
    public TextView f33484r;

    /* renamed from: s */
    public ListItemView f33485s;

    /* renamed from: t */
    public Button f33486t;

    /* renamed from: u */
    public ProgressBar f33487u;

    /* renamed from: v */
    public boolean f33488v;

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        return Collections.singleton("CONFIGURATION");
    }

    /* renamed from: Z1 */
    public final void mo40440Z1(int i, String str) {
        C12699d dVar;
        long j;
        if ("trip_plan_time_tag".equals(str) && i == -1 && (dVar = (C12699d) getParentFragmentManager().mo3923A(str)) != null) {
            TodBookingOrderViewModel p2 = mo40436p2();
            if (dVar.f31361z) {
                j = -1;
            } else {
                j = dVar.mo39477W1();
            }
            long j2 = j;
            TodBookingOrderViewModel.OrderInformation value = p2.f40071c.getValue();
            if (value != null) {
                p2.f40071c.postValue(new TodBookingOrderViewModel.OrderInformation(value.f40082b, value.f40083c, j2, (LocationDescriptor) null, (LocationDescriptor) null));
            }
        }
    }

    /* renamed from: m2 */
    public final String mo40433m2() {
        return "tod_order_origin_impression";
    }

    public final void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        if (bundle == null || !bundle.getBoolean("isServiceAreaPopupShown")) {
            z = false;
        } else {
            z = true;
        }
        this.f33488v = z;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.tod_booking_order_origin_step_fragment, viewGroup, false);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("isServiceAreaPopupShown", this.f33488v);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        LocationDescriptor locationDescriptor;
        View view2 = view;
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) view2.findViewById(R.id.location_text);
        this.f33484r = textView;
        textView.setOnClickListener(new C4585c(this, 27));
        ListItemView listItemView = (ListItemView) view2.findViewById(R.id.time);
        this.f33485s = listItemView;
        listItemView.getAccessoryView().setOnClickListener(new C16740o(this, 2));
        Button button = (Button) view2.findViewById(R.id.action);
        this.f33486t = button;
        button.setOnClickListener(new C4052r(this, 25));
        this.f33487u = (ProgressBar) view2.findViewById(R.id.progress_bar);
        C1033p viewLifecycleOwner = getViewLifecycleOwner();
        TodBookingOrderViewModel p2 = mo40436p2();
        p2.f40071c.observe(viewLifecycleOwner, new C17110h(this, 4));
        p2.f40076h.observe(viewLifecycleOwner, new C19314d(this, 2));
        p2.f40075g.observe(viewLifecycleOwner, new C20576h(this, 3));
        p2.f40072d.observe(viewLifecycleOwner, new C20197b(this, 2));
        p2.f40074f.observe(viewLifecycleOwner, new C13545g(this, 0));
        TodBookingOrderViewModel p22 = mo40436p2();
        TodBookingPickupLocationState value = mo40436p2().f40074f.getValue();
        if (value != null) {
            locationDescriptor = value.f40099b;
        } else {
            locationDescriptor = null;
        }
        if (locationDescriptor == null) {
            MapFragment mapFragment = (MapFragment) ((TodBookingOrderActivity) this.f40822c).mo44529n1(R.id.map_fragment);
            Location O1 = mapFragment.mo46780O1();
            double latitude = O1.getLatitude();
            double longitude = O1.getLongitude();
            LocationDescriptor locationDescriptor2 = new LocationDescriptor(LocationDescriptor.LocationType.COORDINATE, LocationDescriptor.SourceType.EXTERNAL, (ServerId) null, (String) null, mapFragment.requireContext().getString(R.string.current_location), (List<C20440a>) null, LatLonE6.m40176g(latitude, longitude), (LatLonE6) null, (Image) null, (Image) null);
            p22.f40075g.postValue(Boolean.TRUE);
            p22.f40073e.postValue(locationDescriptor2);
            mo40434n2().mo52905a(R.string.tod_order_map_selection_origin_hint);
        }
    }

    /* renamed from: r0 */
    public final void mo40439r0() {
        this.f33486t.setEnabled(false);
        this.f33487u.setVisibility(0);
        this.f33484r.setText(R.string.locating);
    }

    /* renamed from: s2 */
    public final String mo40425s2() {
        return "tod_order_origin_address_clicked";
    }

    /* renamed from: t2 */
    public final String mo40426t2() {
        TodBookingPickupInformation todBookingPickupInformation;
        C20961r value = mo40436p2().f40072d.getValue();
        if (value != null) {
            todBookingPickupInformation = (TodBookingPickupInformation) value.f52712b;
        } else {
            todBookingPickupInformation = null;
        }
        if (todBookingPickupInformation != null) {
            return todBookingPickupInformation.f40098f;
        }
        return null;
    }

    /* renamed from: u2 */
    public final String mo40427u2() {
        return "tod_order_origin_map_moved";
    }

    /* renamed from: v2 */
    public final int mo40428v2() {
        return R.layout.tod_map_location_picker_origin_pin;
    }

    /* renamed from: w2 */
    public final int mo40429w2() {
        return R.string.tod_order_text_search_origin_placeholder;
    }

    /* renamed from: x2 */
    public final void mo40430x2(LocationDescriptor locationDescriptor) {
        TodBookingOrderViewModel p2 = mo40436p2();
        p2.f40075g.postValue(Boolean.TRUE);
        p2.f40073e.postValue(locationDescriptor);
    }
}
