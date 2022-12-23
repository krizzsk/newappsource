package p397bu;

import android.view.View;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.itinerary.view.leg.C15079d;
import com.moovit.app.itinerary.view.leg.C15089m;
import com.moovit.app.servicealerts.LineServiceAlertSelectionActivity;
import com.moovit.app.servicealerts.ServiceAlertDetailsActivity;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.list.ListItemView;
import com.moovit.itinerary.model.leg.DocklessBicycleLeg;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.itinerary.model.leg.WaitToTaxiLeg;
import com.moovit.servicealerts.ServiceAlert;
import com.moovit.servicealerts.ServiceAlertAffectedLine;
import com.moovit.ticketing.purchase.cart.PurchaseCartConfirmationActivity;
import java.util.List;
import m80.C12873i;
import p543hq.C17474b;

/* renamed from: bu.b */
public final /* synthetic */ class C13684b implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f33725b;

    /* renamed from: c */
    public final /* synthetic */ Object f33726c;

    /* renamed from: d */
    public final /* synthetic */ Object f33727d;

    /* renamed from: e */
    public final /* synthetic */ Object f33728e;

    public /* synthetic */ C13684b(int i, Object obj, Object obj2, Object obj3) {
        this.f33725b = i;
        this.f33727d = obj;
        this.f33728e = obj2;
        this.f33726c = obj3;
    }

    public final void onClick(View view) {
        String str;
        switch (this.f33725b) {
            case 0:
                ((C15079d) this.f33727d).mo45371D(view, (DocklessBicycleLeg) this.f33728e, (Leg) this.f33726c);
                return;
            case 1:
                int i = C15089m.f38721C;
                ((C15089m) this.f33727d).mo45371D(view, (WaitToTaxiLeg) this.f33728e, (Leg) this.f33726c);
                return;
            case 2:
                LineServiceAlertSelectionActivity lineServiceAlertSelectionActivity = (LineServiceAlertSelectionActivity) this.f33727d;
                int i2 = LineServiceAlertSelectionActivity.f39551X;
                lineServiceAlertSelectionActivity.getClass();
                lineServiceAlertSelectionActivity.startActivity(ServiceAlertDetailsActivity.m39147A2(lineServiceAlertSelectionActivity, (ServiceAlert) this.f33728e, ((ServiceAlertAffectedLine) this.f33726c).f23206d));
                return;
            default:
                PurchaseCartConfirmationActivity.C7653c cVar = (PurchaseCartConfirmationActivity.C7653c) this.f33727d;
                ListItemView listItemView = (ListItemView) this.f33728e;
                List list = (List) this.f33726c;
                cVar.getClass();
                boolean z = !Boolean.TRUE.equals(listItemView.getTag());
                if (z) {
                    UiUtils.m40237E(0, list);
                    listItemView.setSubtitle(C12873i.less_details);
                } else {
                    UiUtils.m40237E(8, list);
                    listItemView.setSubtitle(C12873i.more_details);
                }
                PurchaseCartConfirmationActivity purchaseCartConfirmationActivity = PurchaseCartConfirmationActivity.this;
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.TYPE;
                if (z) {
                    str = "more_details";
                } else {
                    str = "less_details";
                }
                aVar.mo49939g(analyticsAttributeKey, str);
                purchaseCartConfirmationActivity.mo44545v2(aVar.mo49933a());
                listItemView.setTag(Boolean.valueOf(z));
                return;
        }
    }
}
