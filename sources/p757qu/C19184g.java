package p757qu;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import b00.C13556a;
import c00.C13717b;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.mot.model.MotNearestStationInfo;
import com.moovit.app.mot.purchase.MotStationEntranceOnlyActivationActivity;
import com.moovit.app.search.AbstractSearchActivity;
import com.moovit.app.search.locations.SearchLocationItem;
import com.moovit.app.stopdetail.StopGalleryActivity;
import com.moovit.app.useraccount.manager.favorites.LocationFavorite;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.list.ListItemView;
import com.moovit.network.model.ServerId;
import com.moovit.payment.registration.steps.question.QuestionButton;
import com.moovit.payment.registration.steps.question.QuestionInstructions;
import com.moovit.request.RequestOptions;
import com.moovit.ticketing.purchase.itinerary.C7707a;
import com.moovit.ticketing.ticket.Ticket;
import com.moovit.ticketing.ticket.TicketDetailsActivity;
import java.util.ArrayList;
import java.util.List;
import m80.C12873i;
import p453dw.C16738n;
import p455dy.C16753e;
import p543hq.C17474b;
import p736pu.C19004l;
import p824tp.C19728f;
import p878vv.C20236c;
import p977zz.C20927a0;
import u60.C19876a;

/* renamed from: qu.g */
public final /* synthetic */ class C19184g implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f48775b;

    /* renamed from: c */
    public final /* synthetic */ Object f48776c;

    /* renamed from: d */
    public final /* synthetic */ Object f48777d;

    /* renamed from: e */
    public final /* synthetic */ Object f48778e;

    public /* synthetic */ C19184g(int i, Object obj, Object obj2, Object obj3) {
        this.f48775b = i;
        this.f48776c = obj;
        this.f48777d = obj2;
        this.f48778e = obj3;
    }

    public final void onClick(View view) {
        String str;
        switch (this.f48775b) {
            case 0:
                MotStationEntranceOnlyActivationActivity motStationEntranceOnlyActivationActivity = (MotStationEntranceOnlyActivationActivity) this.f48776c;
                LatLonE6 latLonE6 = (LatLonE6) this.f48777d;
                MotNearestStationInfo motNearestStationInfo = (MotNearestStationInfo) this.f48778e;
                int i = MotStationEntranceOnlyActivationActivity.f39043q0;
                motStationEntranceOnlyActivationActivity.mo44543u2((CharSequence) null);
                C13556a aVar = motStationEntranceOnlyActivationActivity.f39048o0;
                if (aVar != null) {
                    aVar.cancel(true);
                    motStationEntranceOnlyActivationActivity.f39048o0 = null;
                }
                C19004l lVar = new C19004l(motStationEntranceOnlyActivationActivity.mo44548x1(), (C19728f) motStationEntranceOnlyActivationActivity.mo44537r1("METRO_CONTEXT"), latLonE6, motStationEntranceOnlyActivationActivity.f39049p0, motStationEntranceOnlyActivationActivity.f39046m0.getCounter());
                String O = lVar.mo51491O();
                RequestOptions requestOptions = new RequestOptions();
                requestOptions.f42909f = true;
                motStationEntranceOnlyActivationActivity.f39048o0 = motStationEntranceOnlyActivationActivity.mo44527k2(O, lVar, requestOptions, motStationEntranceOnlyActivationActivity.f39044Z);
                C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "validate_clicked");
                aVar2.mo49937e(AnalyticsAttributeKey.STOP_ID, motNearestStationInfo.f39023b.f23730b);
                aVar2.mo49935c(AnalyticsAttributeKey.COUNT, motStationEntranceOnlyActivationActivity.f39046m0.getCounter());
                motStationEntranceOnlyActivationActivity.mo44545v2(aVar2.mo49933a());
                return;
            case 1:
                AbstractSearchActivity abstractSearchActivity = (AbstractSearchActivity) this.f48776c;
                SearchLocationItem searchLocationItem = (SearchLocationItem) this.f48777d;
                String str2 = AbstractSearchActivity.f39419l0;
                abstractSearchActivity.getClass();
                C17474b.C17475a aVar3 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar3.mo49939g(AnalyticsAttributeKey.TYPE, "removed_custom_favorite_from_recent");
                aVar3.mo49939g(AnalyticsAttributeKey.SELECTED_CAPTION, searchLocationItem.f39460e);
                aVar3.mo49939g(AnalyticsAttributeKey.SELECTED_TYPE, searchLocationItem.f39458c.name());
                aVar3.mo49937e(AnalyticsAttributeKey.SELECTED_ID, searchLocationItem.f39457b);
                abstractSearchActivity.mo44545v2(aVar3.mo49933a());
                ((C16753e) abstractSearchActivity.getSystemService("user_favorites_manager_service")).mo49445t((LocationFavorite) this.f48778e);
                C20236c f = C20236c.m47804f(abstractSearchActivity);
                f.mo51499b();
                f.f48438c.mo40645c(searchLocationItem);
                return;
            case 2:
                C16738n nVar = (C16738n) this.f48776c;
                C16738n.C16739a aVar4 = (C16738n.C16739a) this.f48778e;
                int i2 = C16738n.f43588t;
                nVar.getClass();
                Context context = ((ImageView) this.f48777d).getContext();
                C17474b.C17475a aVar5 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar5.mo49939g(AnalyticsAttributeKey.TYPE, "gallery_map_icon_clicked");
                aVar5.mo49937e(AnalyticsAttributeKey.STOP_ID, aVar4.f43593a);
                nVar.mo46797j2(aVar5.mo49933a());
                ArrayList arrayList = aVar4.f43594b;
                if (arrayList != null && arrayList.size() != 0) {
                    ArrayList arrayList2 = aVar4.f43594b;
                    ServerId serverId = aVar4.f43593a;
                    int i3 = StopGalleryActivity.f39690n0;
                    Intent intent = new Intent(context, StopGalleryActivity.class);
                    intent.putParcelableArrayListExtra("stopImages", C13717b.m34264k(arrayList2));
                    intent.putExtra("stopId", serverId);
                    nVar.startActivity(intent);
                    return;
                }
                return;
            case 3:
                C19876a aVar6 = (C19876a) this.f48776c;
                int i4 = C19876a.f50486t;
                aVar6.getClass();
                aVar6.mo52159y2(((QuestionInstructions) this.f48777d).f42865b, ((QuestionButton) this.f48778e).f42862b);
                return;
            case 4:
                C7707a.C7710c cVar = (C7707a.C7710c) this.f48776c;
                ListItemView listItemView = (ListItemView) this.f48777d;
                List list = (List) this.f48778e;
                cVar.getClass();
                boolean equals = true ^ Boolean.TRUE.equals(listItemView.getTag());
                if (equals) {
                    UiUtils.m40237E(0, list);
                    listItemView.setSubtitle(C12873i.purchase_ticket_itinerary_less_details);
                } else {
                    UiUtils.m40237E(8, list);
                    listItemView.setSubtitle(C12873i.purchase_ticket_itinerary_more_details);
                }
                C7707a aVar7 = C7707a.this;
                C17474b.C17475a aVar8 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.TYPE;
                if (equals) {
                    str = "more_details";
                } else {
                    str = "less_details";
                }
                aVar8.mo49939g(analyticsAttributeKey, str);
                aVar7.mo46797j2(aVar8.mo49933a());
                listItemView.setTag(Boolean.valueOf(equals));
                return;
            default:
                TicketDetailsActivity ticketDetailsActivity = (TicketDetailsActivity) this.f48776c;
                Ticket ticket = (Ticket) this.f48777d;
                int i5 = TicketDetailsActivity.f23504m0;
                ticketDetailsActivity.getClass();
                C17474b.C17475a aVar9 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar9.mo49939g(AnalyticsAttributeKey.TYPE, "phone_call_clicked");
                aVar9.mo49937e(AnalyticsAttributeKey.PROVIDER, ticket.f23473b.f23511b);
                aVar9.mo49939g(AnalyticsAttributeKey.ID, ticket.f23473b.f23513d);
                ticketDetailsActivity.mo44545v2(aVar9.mo49933a());
                ticketDetailsActivity.startActivity(C20927a0.m49011f((String) this.f48778e));
                return;
        }
    }
}
