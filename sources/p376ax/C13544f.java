package p376ax;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.lifecycle.C1033p;
import com.moovit.app.tod.bookingflow.TodBookingOrderViewModel;
import com.moovit.app.tod.bookingflow.model.TodBookingDropOffInformation;
import com.moovit.transit.LocationDescriptor;
import com.tranzmate.R;
import p304x.C7121y;
import p572iw.C17662e;
import p783rw.C19370b;
import p923xs.C20581k;
import p977zz.C20961r;

/* renamed from: ax.f */
public class C13544f extends C13540b {

    /* renamed from: u */
    public static final /* synthetic */ int f33477u = 0;

    /* renamed from: r */
    public TextView f33478r;

    /* renamed from: s */
    public Button f33479s;

    /* renamed from: t */
    public ProgressBar f33480t;

    /* renamed from: m2 */
    public final String mo40433m2() {
        return "tod_order_destination_impression";
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.tod_booking_order_destination_step_fragment, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) view.findViewById(R.id.location_text);
        this.f33478r = textView;
        textView.setOnClickListener(new C17662e(this, 2));
        Button button = (Button) view.findViewById(R.id.action);
        this.f33479s = button;
        button.setOnClickListener(new C19370b(this, 2));
        this.f33480t = (ProgressBar) view.findViewById(R.id.progress_bar);
        C1033p viewLifecycleOwner = getViewLifecycleOwner();
        TodBookingOrderViewModel p2 = mo40436p2();
        p2.f40080l.observe(viewLifecycleOwner, new C20581k(this, 3));
        p2.f40077i.observe(viewLifecycleOwner, new C7121y(this, 3));
        p2.f40079k.observe(viewLifecycleOwner, new C13543e(this, 0));
    }

    /* renamed from: r0 */
    public final void mo40439r0() {
        this.f33479s.setEnabled(false);
        this.f33480t.setVisibility(0);
        this.f33478r.setText(R.string.locating);
    }

    /* renamed from: r2 */
    public final void mo40438r2() {
        mo40434n2().mo52906b((CharSequence) null);
        getParentFragmentManager().mo3936Q();
    }

    /* renamed from: s2 */
    public final String mo40425s2() {
        return "tod_order_destination_address_clicked";
    }

    /* renamed from: t2 */
    public final String mo40426t2() {
        TodBookingDropOffInformation todBookingDropOffInformation;
        C20961r value = mo40436p2().f40077i.getValue();
        if (value != null) {
            todBookingDropOffInformation = (TodBookingDropOffInformation) value.f52712b;
        } else {
            todBookingDropOffInformation = null;
        }
        if (todBookingDropOffInformation != null) {
            return todBookingDropOffInformation.f40090e;
        }
        return null;
    }

    /* renamed from: u2 */
    public final String mo40427u2() {
        return "tod_order_destination_map_moved";
    }

    /* renamed from: v2 */
    public final int mo40428v2() {
        return R.layout.tod_map_location_picker_destination_pin;
    }

    /* renamed from: w2 */
    public final int mo40429w2() {
        return R.string.tod_order_text_search_destination_placeholder;
    }

    /* renamed from: x2 */
    public final void mo40430x2(LocationDescriptor locationDescriptor) {
        TodBookingOrderViewModel p2 = mo40436p2();
        p2.f40080l.postValue(Boolean.TRUE);
        p2.f40078j.postValue(locationDescriptor);
    }
}
