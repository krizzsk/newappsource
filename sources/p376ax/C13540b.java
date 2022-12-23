package p376ax;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.activity.result.C0207b;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.search.AppSearchLocationCallback;
import com.moovit.app.tod.bookingflow.TodBookingOrderActivity;
import com.moovit.app.tod.bookingflow.model.FailureReason;
import com.moovit.location.mappicker.MapLocationPickerHelper;
import com.moovit.map.MapFragment;
import com.moovit.search.SearchLocationActivity;
import com.moovit.transit.LocationDescriptor;
import com.moovit.web.WebViewActivity;
import com.tranzmate.R;
import p054d0.C4267a0;
import p065e.C4413c;
import p543hq.C17474b;

/* renamed from: ax.b */
public abstract class C13540b extends C13541c implements MapLocationPickerHelper.C16212c {

    /* renamed from: q */
    public static final /* synthetic */ int f33467q = 0;

    /* renamed from: o */
    public final C0207b<Intent> f33468o = registerForActivityResult(new C4413c(), new C4267a0(this, 7));

    /* renamed from: p */
    public MenuItem f33469p;

    /* renamed from: A2 */
    public final void mo40424A2(FailureReason failureReason) {
        if (!FailureReason.NONE.equals(failureReason)) {
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "tod_location_denial_impression");
            aVar.mo49939g(AnalyticsAttributeKey.REASON, failureReason.getDescription());
            mo46797j2(aVar.mo49933a());
        }
        mo40434n2().mo52905a(failureReason.getResId());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        MapFragment mapFragment = (MapFragment) ((TodBookingOrderActivity) this.f40822c).mo44529n1(R.id.map_fragment);
        mapFragment.mo48656t2(new C13539a(this, mapFragment));
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.activity_tod_booking, menu);
        this.f33469p = menu.findItem(R.id.action_explain);
        mo40432z2(mo40426t2());
    }

    /* renamed from: s2 */
    public abstract String mo40425s2();

    /* renamed from: t2 */
    public abstract String mo40426t2();

    /* renamed from: u2 */
    public abstract String mo40427u2();

    /* renamed from: v2 */
    public abstract int mo40428v2();

    /* renamed from: w2 */
    public abstract int mo40429w2();

    /* renamed from: x2 */
    public abstract void mo40430x2(LocationDescriptor locationDescriptor);

    /* renamed from: y2 */
    public final void mo40431y2() {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49945m(AnalyticsAttributeKey.TYPE, mo40425s2());
        mo46797j2(aVar.mo49933a());
        this.f33468o.mo772a(SearchLocationActivity.m17347y2(requireContext(), new AppSearchLocationCallback(mo40429w2(), 0, false, false, true), "tod_booking_order_flow", (String) null));
        mo40434n2().mo52906b((CharSequence) null);
    }

    /* renamed from: z2 */
    public final void mo40432z2(String str) {
        Intent intent;
        boolean z;
        if (this.f33469p != null) {
            if (str != null) {
                intent = WebViewActivity.m18168y2(requireContext(), str, "");
            } else {
                intent = null;
            }
            this.f33469p.setIntent(intent);
            MenuItem menuItem = this.f33469p;
            if (intent != null) {
                z = true;
            } else {
                z = false;
            }
            menuItem.setVisible(z);
        }
    }
}
