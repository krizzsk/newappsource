package com.moovit.app.mot.p417qr;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import b00.C13556a;
import c00.C13717b;
import c70.C13751d;
import com.moovit.C15682c;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.mot.model.MotActivation;
import com.moovit.app.mot.model.MotActivationStationInfo;
import com.moovit.app.mot.p417qr.StationQrCodeCardView;
import com.moovit.app.stopdetail.StopDetailActivity;
import com.moovit.location.C16202a;
import com.moovit.location.LocationSettingsFixer;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitStop;
import com.tranzmate.R;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import p039c7.C1800c;
import p543hq.C17474b;
import p664mu.C18443f;
import p736pu.C19006n;
import p736pu.C19007o;
import p853uu.C19991a;
import p853uu.C19996f;
import p853uu.C19997g;
import p858uz.C20061g;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import p977zz.C20927a0;

/* renamed from: com.moovit.app.mot.qr.a */
public class C15174a extends C15682c<MoovitAppActivity> implements StationQrCodeCardView.C15173b {

    /* renamed from: r */
    public static final /* synthetic */ int f39086r = 0;

    /* renamed from: n */
    public final C15175a f39087n = new C15175a();

    /* renamed from: o */
    public StationQrCodeCardView f39088o;

    /* renamed from: p */
    public List<MotActivation> f39089p;

    /* renamed from: q */
    public C13556a f39090q;

    /* renamed from: com.moovit.app.mot.qr.a$a */
    public class C15175a extends C20438i<C19006n, C19007o> {
        public C15175a() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C19006n nVar = (C19006n) cVar;
            C15174a aVar = C15174a.this;
            aVar.f39090q = null;
            aVar.mo46784S1();
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C19006n nVar = (C19006n) cVar;
            C19007o oVar = (C19007o) gVar;
            C15174a aVar = C15174a.this;
            int i = C15174a.f39086r;
            ((MoovitAppActivity) aVar.f40822c).finish();
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C15174a.this.mo46795h2(C13751d.m34341b(((C19006n) cVar).f51759b, (String) null, exc));
            return true;
        }
    }

    public C15174a() {
        super(MoovitAppActivity.class);
    }

    /* renamed from: I1 */
    public final C20061g mo21526I1() {
        return C16202a.get(this.f40822c).getPermissionAwareHighAccuracyFrequentUpdates();
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        return Collections.singleton("METRO_CONTEXT");
    }

    /* renamed from: j1 */
    public final void mo45631j1() {
        MotActivationStationInfo motActivationStationInfo = ((MotActivation) C13717b.m34256c(this.f39089p)).f38997n;
        if (motActivationStationInfo != null) {
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "station_timeline_clicked");
            aVar.mo49943k(AnalyticsAttributeKey.STOP_ID, motActivationStationInfo.mo45575c());
            mo46797j2(aVar.mo49933a());
            startActivity(StopDetailActivity.m39207B2(requireContext(), motActivationStationInfo.mo45575c(), (ServerId) null, (TransitStop) null, (List) null));
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.mot_qr_fragment_menu, menu);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.mot_station_entrance_qr_code_viewer_fragment, viewGroup, false);
        StationQrCodeCardView stationQrCodeCardView = (StationQrCodeCardView) inflate.findViewById(R.id.station_qr_code_view);
        this.f39088o = stationQrCodeCardView;
        stationQrCodeCardView.setListener(this);
        inflate.findViewById(R.id.cancel_purchase_view).setOnClickListener(new C1800c(this, 19));
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
            C18443f.m45298d().mo50887a(string).onSuccessTask(MoovitExecutors.COMPUTATION, new C19991a(serverId)).addOnSuccessListener((Activity) this.f40822c, new C19996f(this, 0));
            return;
        }
        throw new IllegalStateException("Did you use MotStationEntranceQrCodeViewerFragment.newInstance(...)?");
    }

    /* renamed from: t0 */
    public final boolean mo19430t0(String str, int i, Bundle bundle) {
        if ("cancel_purchase_dialog_fragment_tag".equals(str)) {
            if (i == -1) {
                mo46798k2("mot_train_ride_cancel_clicked");
                LocationSettingsFixer.C16198a aVar = new LocationSettingsFixer.C16198a((C15682c<?>) this);
                aVar.f42260g = true;
                aVar.mo48528a(new C19997g(this, requireContext()));
            } else if (i == -2) {
                mo46798k2("cancel_clicked");
            }
            return true;
        }
        super.mo19430t0(str, i, bundle);
        return true;
    }

    /* renamed from: x0 */
    public final void mo45632x0(int i) {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.SWIPE);
        aVar.mo49935c(AnalyticsAttributeKey.SELECTED_INDEX, i);
        aVar.mo49943k(AnalyticsAttributeKey.ID, this.f39089p.get(i).f38985b);
        mo46797j2(aVar.mo49933a());
    }
}
