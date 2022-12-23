package p310x5;

import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import com.appboy.models.cards.BannerImageCard;
import com.appboy.p044ui.widget.BannerImageCardView;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.itinerary.C15035a;
import com.moovit.app.itinerary.ItineraryActivity;
import com.moovit.app.itinerary.StepByStepActivity;
import com.moovit.app.itinerary.view.leg.AbstractLegView;
import com.moovit.app.itinerary.view.leg.C15084i;
import com.moovit.app.linedetail.p416ui.C15101a;
import com.moovit.commons.view.BannerView;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.network.model.ServerId;
import com.moovit.ticketing.activation.C7632a;
import com.moovit.ticketing.purchase.PurchaseTicketActivity;
import com.moovit.ticketing.purchase.storedvalue.PurchaseStoredValueIntent;
import com.moovit.ticketing.ticket.Ticket;
import com.moovit.transit.TransitStop;
import com.tranzmate.R;
import f00.C16918f;
import h90.C12739a;
import h90.C12740b;
import ja0.C12797f;
import p001a0.C0016g;
import p453dw.C16738n;
import p523gu.C17231c;
import p543hq.C17474b;
import p977zz.C20927a0;
import v30.C6855a;

/* renamed from: x5.a */
public final /* synthetic */ class C7156a implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f22227b;

    /* renamed from: c */
    public final /* synthetic */ Object f22228c;

    /* renamed from: d */
    public final /* synthetic */ Object f22229d;

    public /* synthetic */ C7156a(int i, Object obj, Object obj2) {
        this.f22227b = i;
        this.f22228c = obj;
        this.f22229d = obj2;
    }

    public final void onClick(View view) {
        int i;
        String str;
        switch (this.f22227b) {
            case 0:
                ((BannerImageCardView) this.f22228c).lambda$onSetCard$0((BannerImageCard) this.f22229d, view);
                return;
            case 1:
                TransitStop transitStop = (TransitStop) this.f22229d;
                C15035a aVar = C15035a.this;
                C15035a.C15037b bVar = aVar.f38528t;
                if (bVar != null) {
                    bVar.mo45307g(transitStop);
                }
                aVar.dismiss();
                return;
            case 2:
                AbstractLegView abstractLegView = (AbstractLegView) this.f22228c;
                Leg leg = (Leg) this.f22229d;
                AbstractLegView.C15075b bVar2 = abstractLegView.f38691h;
                if (bVar2 != null) {
                    ItineraryActivity itineraryActivity = (ItineraryActivity) bVar2;
                    Itinerary A2 = itineraryActivity.mo45266A2();
                    int indexOf = A2.mo48295u0().indexOf(leg);
                    boolean z = abstractLegView instanceof C15084i;
                    if (z) {
                        i = 0;
                    } else {
                        i = indexOf + 1;
                    }
                    if (z) {
                        indexOf = -1;
                    }
                    if (z) {
                        str = "start_step";
                    } else {
                        str = C0016g.m20c(leg.getType());
                    }
                    C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                    aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "itinerary_step_button_type");
                    aVar2.mo49939g(AnalyticsAttributeKey.ITINERARY_STEP_TYPE, str);
                    aVar2.mo49935c(AnalyticsAttributeKey.ITINERARY_STEP_INDEX, i);
                    itineraryActivity.mo44545v2(aVar2.mo49933a());
                    itineraryActivity.startActivity(StepByStepActivity.m38046R2(itineraryActivity.getBaseContext(), A2, indexOf, itineraryActivity.f38475A0, (String) null));
                    return;
                }
                return;
            case 3:
                C12797f fVar = (C12797f) this.f22229d;
                C17231c.C17232a aVar3 = ((C17231c) this.f22228c).f44550t;
                if (aVar3 != null) {
                    ((C15101a) aVar3).mo45447B2(fVar, true);
                    return;
                }
                return;
            case 4:
                C16738n nVar = (C16738n) this.f22228c;
                ImageView imageView = (ImageView) this.f22229d;
                int i2 = C16738n.f43588t;
                nVar.getClass();
                nVar.mo49424y2(imageView.getContext(), (ServerId) imageView.getTag(R.id.stop_id_key));
                return;
            case 5:
                C16918f fVar2 = (C16918f) this.f22229d;
                int i3 = BannerView.f41046j;
                ((BannerView) this.f22228c).setVisibility(8);
                if (fVar2 != null) {
                    fVar2.mo49544c(Boolean.TRUE);
                    return;
                }
                return;
            case 6:
                C6855a aVar4 = (C6855a) this.f22228c;
                int i4 = C6855a.f21206q;
                aVar4.getClass();
                C17474b.C17475a aVar5 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar5.mo49939g(AnalyticsAttributeKey.TYPE, "action_clicked");
                aVar5.mo49939g(AnalyticsAttributeKey.SELECTED_TYPE, aVar4.f21207n.f14921c);
                aVar4.mo46797j2(aVar5.mo49933a());
                aVar4.startActivity(C20927a0.m49014i(Uri.parse((String) this.f22229d)));
                return;
            case 7:
                C7632a aVar6 = (C7632a) this.f22228c;
                int i5 = C7632a.f23237h;
                aVar6.mo23976U1((Ticket) this.f22229d, "cancel_clicked");
                aVar6.dismissAllowingStateLoss();
                return;
            default:
                C12739a aVar7 = (C12739a) this.f22229d;
                C12740b bVar3 = C12740b.this;
                int i6 = C12740b.f31473s;
                bVar3.getClass();
                C17474b.C17475a aVar8 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar8.mo49939g(AnalyticsAttributeKey.TYPE, "stored_value_clicked");
                aVar8.mo49939g(AnalyticsAttributeKey.ID, aVar7.f31468b.f23495b);
                aVar8.mo49939g(AnalyticsAttributeKey.AGENCY_NAME, aVar7.f31468b.mo24223c());
                aVar8.mo49937e(AnalyticsAttributeKey.PROVIDER, aVar7.f31467a);
                aVar8.mo49936d(AnalyticsAttributeKey.BALANCE, C0016g.m19b(aVar7.f31469c));
                aVar8.mo49939g(AnalyticsAttributeKey.CURRENCY_CODE, aVar7.f31469c.f23844b);
                bVar3.mo46797j2(aVar8.mo49933a());
                bVar3.startActivity(PurchaseTicketActivity.m17465z2(bVar3.requireContext(), new PurchaseStoredValueIntent(aVar7.f31468b.f23495b)));
                return;
        }
    }
}
