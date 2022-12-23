package com.moovit.app.mot.p417qr;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.moovit.C15682c;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.mot.model.MotActivation;
import com.moovit.app.mot.p417qr.StationQrCodeCardView;
import com.moovit.network.model.ServerId;
import com.tranzmate.R;
import java.util.List;
import p259t5.C6592b;
import p543hq.C17474b;
import p613kq.C18114a;
import p664mu.C18443f;
import p853uu.C19991a;
import p977zz.C20927a0;

/* renamed from: com.moovit.app.mot.qr.b */
public class C15176b extends C15682c<MotQrCodeViewerActivity> implements StationQrCodeCardView.C15173b {

    /* renamed from: p */
    public static final /* synthetic */ int f39092p = 0;

    /* renamed from: n */
    public StationQrCodeCardView f39093n;

    /* renamed from: o */
    public List<MotActivation> f39094o;

    public C15176b() {
        super(MotQrCodeViewerActivity.class);
    }

    /* renamed from: j1 */
    public final /* synthetic */ void mo45631j1() {
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.mot_qr_fragment_menu, menu);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.mot_station_exit_qr_code_viewer_fragment, viewGroup, false);
        StationQrCodeCardView stationQrCodeCardView = (StationQrCodeCardView) inflate.findViewById(R.id.station_qr_code_view);
        this.f39093n = stationQrCodeCardView;
        stationQrCodeCardView.setListener(this);
        inflate.findViewById(R.id.ride_details_view).setOnClickListener(new C6592b(this, 21));
        return inflate;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.contact_us) {
            return super.onOptionsItemSelected(menuItem);
        }
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "mot_qr_technical_support_clicked");
        mo46797j2(aVar.mo49933a());
        C20927a0.m49017l(requireContext(), C20927a0.m49011f(getString(R.string.payment_mot_qr_support_number)));
        return true;
    }

    public final void onStart() {
        super.onStart();
        Bundle Q1 = mo46782Q1();
        String string = Q1.getString("price_reference");
        ServerId serverId = (ServerId) Q1.getParcelable("activation_id");
        if (string != null) {
            C18443f.m45298d().mo50887a(string).onSuccessTask(MoovitExecutors.COMPUTATION, new C19991a(serverId)).addOnSuccessListener((Activity) this.f40822c, new C18114a(this, 6));
            return;
        }
        throw new IllegalStateException("Did you use MotStationEntranceQrCodeViewerFragment.newInstance(...)?");
    }

    /* renamed from: x0 */
    public final void mo45632x0(int i) {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.SWIPE);
        aVar.mo49935c(AnalyticsAttributeKey.SELECTED_INDEX, i);
        aVar.mo49943k(AnalyticsAttributeKey.ID, this.f39094o.get(i).f38985b);
        mo46797j2(aVar.mo49933a());
    }
}
