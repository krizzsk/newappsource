package p927xw;

import android.content.Context;
import c70.C13751d;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.tod.TodRideActivity;
import com.moovit.design.dialog.AlertDialogFragment;
import com.moovit.util.CurrencyAmount;
import com.tranzmate.R;
import p502fx.C17116a;
import p543hq.C17474b;
import p596jx.C17958g;
import p596jx.C17959h;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;

/* renamed from: xw.j */
public final class C20643j extends C20438i<C17958g, C17959h> {

    /* renamed from: b */
    public final /* synthetic */ TodRideActivity f52209b;

    public C20643j(TodRideActivity todRideActivity) {
        this.f52209b = todRideActivity;
    }

    /* renamed from: a */
    public final void mo313a(C20431c cVar, boolean z) {
        C17958g gVar = (C17958g) cVar;
        this.f52209b.mo44506I1();
    }

    /* renamed from: k */
    public final void mo21408k(C20431c cVar, C20436g gVar) {
        C17958g gVar2 = (C17958g) cVar;
        C17959h hVar = (C17959h) gVar;
        TodRideActivity todRideActivity = this.f52209b;
        int i = TodRideActivity.f39996t0;
        todRideActivity.getClass();
        CurrencyAmount currencyAmount = hVar.f46026m;
        C17116a aVar = hVar.f46027n;
        String str = aVar.f44296a;
        String str2 = aVar.f44297b;
        if (todRideActivity.mo44534p1("cancel_ride_confirmation_dialog_fragment") == null) {
            AlertDialogFragment.C15856a k = new AlertDialogFragment.C15856a((Context) todRideActivity).mo47682k("cancel_ride_confirmation_dialog_fragment");
            k.mo47676e(R.drawable.img_cancel_warning, false);
            AlertDialogFragment.C15856a i2 = k.mo47684m(str).mo47679h(str2).mo47681j(R.string.tod_passenger_cancel_ride_popup_yes_button).mo47680i(R.string.tod_passenger_cancel_ride_popup_no_button);
            i2.f41328b.putParcelable("cancelFee", currencyAmount);
            i2.mo47673b().show(todRideActivity.getSupportFragmentManager(), "cancel_ride_confirmation_dialog_fragment");
            C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "cancel_clicked");
            todRideActivity.mo44545v2(aVar2.mo49933a());
        }
    }

    /* renamed from: w */
    public final boolean mo21415w(C20431c cVar, Exception exc) {
        C17958g gVar = (C17958g) cVar;
        C13751d.m34341b(this.f52209b, (String) null, exc).show(this.f52209b.getSupportFragmentManager(), (String) null);
        return true;
    }
}
