package p233r5;

import android.view.View;
import com.appboy.models.cards.Card;
import com.appboy.p044ui.actions.UriAction;
import com.appboy.p044ui.contentcards.view.BaseContentCardView;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.linedetail.p416ui.C15101a;
import com.moovit.app.lineschedule.LineScheduleActivity;
import com.moovit.app.map.DocklessVehicleBottomSheetDialog;
import com.moovit.app.wondo.tickets.offers.WondoOffersActivity;
import com.moovit.commons.utils.AppDeepLink;
import com.moovit.map.walking.MapWalkingDirectionsActivity;
import com.moovit.network.model.ServerId;
import com.moovit.transit.LocationDescriptor;
import com.moovit.transit.Schedule;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitPatternTrips;
import com.moovit.transit.TransitStop;
import com.moovit.util.time.Time;
import com.moovit.view.ScheduleView;
import ja0.C12797f;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p499fu.C17073a;
import p523gu.C17231c;
import p543hq.C17474b;
import s30.C6452b;

/* renamed from: r5.a */
public final /* synthetic */ class C6253a implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f19728b;

    /* renamed from: c */
    public final /* synthetic */ Object f19729c;

    /* renamed from: d */
    public final /* synthetic */ Object f19730d;

    /* renamed from: e */
    public final /* synthetic */ Object f19731e;

    public /* synthetic */ C6253a(int i, Object obj, Object obj2, Object obj3) {
        this.f19728b = i;
        this.f19729c = obj;
        this.f19730d = obj2;
        this.f19731e = obj3;
    }

    public final void onClick(View view) {
        C17231c p2;
        List<TransitLine> list;
        boolean z;
        Time time;
        Time time2;
        Schedule schedule;
        long j;
        switch (this.f19728b) {
            case 0:
                ((BaseContentCardView) this.f19729c).lambda$bindViewHolder$0((Card) this.f19730d, (UriAction) this.f19731e, view);
                return;
            case 1:
                C12797f fVar = (C12797f) this.f19730d;
                ScheduleView scheduleView = (ScheduleView) this.f19731e;
                C17231c.C17232a aVar = ((C17231c) this.f19729c).f44550t;
                if (aVar != null) {
                    String displayType = scheduleView.getDisplayType();
                    C15101a aVar2 = (C15101a) aVar;
                    int adapterPosition = fVar.getAdapterPosition();
                    if (adapterPosition != -1 && (p2 = aVar2.mo45462p2()) != null) {
                        if (p2 instanceof C17073a) {
                            list = ((C17073a) p2).f44257y;
                        } else {
                            list = Collections.singletonList(p2.f44539i);
                        }
                        TransitStop transitStop = p2.f44545o.get(adapterPosition);
                        if (aVar2.f38842z.f38853g != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            ServerId serverId = p2.f44551u.f23730b;
                            TransitPatternTrips transitPatternTrips = p2.f44540j;
                            time2 = null;
                            if (transitPatternTrips != null) {
                                schedule = transitPatternTrips.f23726k.get(serverId);
                            } else {
                                schedule = null;
                            }
                            if (schedule != null) {
                                time2 = schedule.mo24326m();
                            }
                            if (time2 == null) {
                                C15101a.C15107f fVar2 = aVar2.f38842z;
                                Time time3 = fVar2.f38852f;
                                if (time3 != null) {
                                    j = time3.mo24631g();
                                } else {
                                    j = System.currentTimeMillis();
                                }
                                time = new Time((TimeUnit.DAYS.toMillis(1) * ((long) fVar2.f38853g)) + j);
                                aVar2.startActivity(LineScheduleActivity.m38522y2(aVar2.requireContext(), aVar2.f38832p, ServerId.m11393d(list), transitStop.f23730b, (ServerId) null, time));
                                C17474b.C17475a aVar3 = new C17474b.C17475a(AnalyticsEventKey.LINE_SCHEDULE_CLICKED);
                                aVar3.mo49939g(AnalyticsAttributeKey.SCHEDULE_TYPE, displayType);
                                aVar3.mo49937e(AnalyticsAttributeKey.STOP_ID, transitStop.f23730b);
                                aVar3.mo49935c(AnalyticsAttributeKey.STOP_INDEX, adapterPosition);
                                aVar2.mo46797j2(aVar3.mo49933a());
                                return;
                            }
                        } else {
                            time2 = aVar2.f38811A;
                        }
                        time = time2;
                        aVar2.startActivity(LineScheduleActivity.m38522y2(aVar2.requireContext(), aVar2.f38832p, ServerId.m11393d(list), transitStop.f23730b, (ServerId) null, time));
                        C17474b.C17475a aVar32 = new C17474b.C17475a(AnalyticsEventKey.LINE_SCHEDULE_CLICKED);
                        aVar32.mo49939g(AnalyticsAttributeKey.SCHEDULE_TYPE, displayType);
                        aVar32.mo49937e(AnalyticsAttributeKey.STOP_ID, transitStop.f23730b);
                        aVar32.mo49935c(AnalyticsAttributeKey.STOP_INDEX, adapterPosition);
                        aVar2.mo46797j2(aVar32.mo49933a());
                        return;
                    }
                    return;
                }
                return;
            case 2:
                DocklessVehicleBottomSheetDialog docklessVehicleBottomSheetDialog = (DocklessVehicleBottomSheetDialog) this.f19729c;
                int i = DocklessVehicleBottomSheetDialog.f38877w;
                docklessVehicleBottomSheetDialog.getClass();
                C17474b.C17475a aVar4 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar4.mo49939g(AnalyticsAttributeKey.TYPE, "wondo_offer_clicked");
                aVar4.mo49939g(AnalyticsAttributeKey.PROVIDER, (String) this.f19730d);
                docklessVehicleBottomSheetDialog.mo22564R1(aVar4.mo49933a());
                docklessVehicleBottomSheetDialog.startActivity(WondoOffersActivity.m39988y2(view.getContext(), ((AppDeepLink) this.f19731e).f40997b));
                return;
            default:
                C6452b bVar = (C6452b) this.f19729c;
                LocationDescriptor locationDescriptor = (LocationDescriptor) this.f19730d;
                int i2 = C6452b.f20158y;
                bVar.getClass();
                C17474b.C17475a aVar5 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar5.mo49939g(AnalyticsAttributeKey.TYPE, "get_directions");
                aVar5.mo49945m(AnalyticsAttributeKey.DESTINATION, locationDescriptor.f23651f);
                bVar.mo22564R1(aVar5.mo49933a());
                bVar.startActivity(MapWalkingDirectionsActivity.m41577y2((MoovitActivity) this.f19731e, locationDescriptor, bVar.f20161w.f14897e));
                return;
        }
    }
}
