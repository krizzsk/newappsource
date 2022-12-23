package p778rr;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.material.bottomsheet.C13924b;
import com.moovit.C15676b;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.carpool.CarpoolLegDetailsView;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.itinerary.model.leg.CarpoolLeg;
import com.tranzmate.R;
import p073e7.C4584b;
import p472er.C16865g;
import p543hq.C17474b;

/* renamed from: rr.f */
public class C19323f extends C15676b<MoovitActivity> {

    /* renamed from: h */
    public Itinerary f49171h;

    /* renamed from: i */
    public CarpoolLeg f49172i;

    public C19323f() {
        super(MoovitActivity.class);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle K1 = mo46752K1();
        int i = K1.getInt("legIndex", -1);
        Itinerary itinerary = (Itinerary) K1.getParcelable("itinerary");
        this.f49171h = itinerary;
        if (i == -1 || itinerary == null) {
            throw new IllegalStateException("Did you use CarpoolLegDetailsDialogFragment.newInstance(...)?");
        }
        this.f49172i = (CarpoolLeg) itinerary.mo48295u0().get(i);
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        return new C13924b(requireContext());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.download_carpool_app_dialog_fragment, viewGroup, false);
    }

    public final void onStart() {
        super.onStart();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "popup_ride_hailing_preview");
        aVar.mo49939g(AnalyticsAttributeKey.ITINERARY_GUID, this.f49171h.f41894b);
        mo22564R1(aVar.mo49933a());
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Context context = view.getContext();
        ((TextView) view.findViewById(R.id.header)).setText(context.getString(R.string.carpool_booking_provider_header, new Object[]{C16865g.m42679b(context, this.f49172i.f41971g)}));
        ((CarpoolLegDetailsView) view.findViewById(R.id.carpool_leg_details_view)).mo44822d(this.f49171h, this.f49172i, CarpoolLeg.CarpoolProvider.WAZE.equals(this.f49172i.f41971g));
        Button button = (Button) view.findViewById(R.id.download_button);
        button.setText(context.getString(R.string.carpool_download_partner_app, new Object[]{C16865g.m42679b(context, this.f49172i.f41971g)}));
        button.setOnClickListener(new C4584b(this, 4));
    }
}
