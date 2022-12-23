package p397bu;

import android.content.Context;
import android.view.View;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.itinerary.view.leg.C15080e;
import com.moovit.app.itinerary.view.leg.C15090n;
import com.moovit.itinerary.model.leg.DocklessCarLeg;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.itinerary.model.leg.WaitToTransitLineLeg;
import com.moovit.network.model.ServerId;
import com.moovit.ticketing.purchase.storedvalue.PurchaseStoredValueConfirmedActivity;
import com.moovit.ticketing.ticket.TicketId;
import com.moovit.ticketing.validation.TicketValidationActivity;
import com.moovit.web.WebViewActivity;
import p543hq.C17474b;
import p903ww.C20424c;

/* renamed from: bu.c */
public final /* synthetic */ class C13685c implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f33729b;

    /* renamed from: c */
    public final /* synthetic */ Object f33730c;

    /* renamed from: d */
    public final /* synthetic */ Object f33731d;

    /* renamed from: e */
    public final /* synthetic */ Object f33732e;

    public /* synthetic */ C13685c(int i, Object obj, Object obj2, Object obj3) {
        this.f33729b = i;
        this.f33731d = obj;
        this.f33732e = obj2;
        this.f33730c = obj3;
    }

    public final void onClick(View view) {
        switch (this.f33729b) {
            case 0:
                ((C15080e) this.f33731d).mo45371D(view, (DocklessCarLeg) this.f33732e, (Leg) this.f33730c);
                return;
            case 1:
                int i = C15090n.f38722E;
                ((C15090n) this.f33731d).mo45371D(view, (WaitToTransitLineLeg) this.f33732e, (Leg) this.f33730c);
                return;
            case 2:
                C20424c cVar = (C20424c) this.f33731d;
                int i2 = C20424c.f51743q;
                cVar.getClass();
                cVar.startActivity(WebViewActivity.m18168y2((Context) this.f33732e, (String) this.f33730c, (CharSequence) null));
                return;
            default:
                PurchaseStoredValueConfirmedActivity purchaseStoredValueConfirmedActivity = (PurchaseStoredValueConfirmedActivity) this.f33731d;
                int i3 = PurchaseStoredValueConfirmedActivity.f23436U;
                purchaseStoredValueConfirmedActivity.getClass();
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar.mo49939g(AnalyticsAttributeKey.TYPE, "validate_clicked");
                purchaseStoredValueConfirmedActivity.mo44545v2(aVar.mo49933a());
                purchaseStoredValueConfirmedActivity.startActivity(TicketValidationActivity.m17717y2(purchaseStoredValueConfirmedActivity, (ServerId) this.f33732e, (String) this.f33730c, (TicketId) null));
                return;
        }
    }
}
