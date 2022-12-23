package p397bu;

import android.view.View;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.editing.EditStopOverviewActivity;
import com.moovit.app.editing.entity.EditPathwayEntityActivity;
import com.moovit.app.editing.transit.EditorTransitStopPathway;
import com.moovit.app.itinerary.view.leg.C15087l;
import com.moovit.app.map.C15121c;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.itinerary.model.leg.WaitToMultiTransitLinesLeg;
import com.moovit.network.model.ServerId;
import com.moovit.payment.registration.steps.question.QuestionButton;
import com.moovit.payment.registration.steps.question.QuestionInstructions;
import com.moovit.ticketing.ticket.Ticket;
import com.moovit.ticketing.ticket.TicketDetailsActivity;
import p028ba.C1512f;
import p371as.C13508a;
import p543hq.C17474b;
import p853uu.C19998h;
import p853uu.C20000j;
import p977zz.C20927a0;
import u60.C19876a;

/* renamed from: bu.h */
public final /* synthetic */ class C13690h implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f33743b;

    /* renamed from: c */
    public final /* synthetic */ Object f33744c;

    /* renamed from: d */
    public final /* synthetic */ Object f33745d;

    /* renamed from: e */
    public final /* synthetic */ Object f33746e;

    public /* synthetic */ C13690h(int i, Object obj, Object obj2, Object obj3) {
        this.f33743b = i;
        this.f33744c = obj;
        this.f33745d = obj2;
        this.f33746e = obj3;
    }

    public final void onClick(View view) {
        switch (this.f33743b) {
            case 0:
                ((C15087l) this.f33744c).mo45371D(view, (WaitToMultiTransitLinesLeg) this.f33745d, (Leg) this.f33746e);
                return;
            case 1:
                C15121c cVar = (C15121c) this.f33744c;
                cVar.getClass();
                C13508a aVar = (C13508a) cVar;
                EditStopOverviewActivity editStopOverviewActivity = aVar.f33424c;
                C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "pathway_tooltip_clicked");
                editStopOverviewActivity.mo44545v2(aVar2.mo49933a());
                EditStopOverviewActivity editStopOverviewActivity2 = aVar.f33424c;
                editStopOverviewActivity2.startActivityForResult(EditPathwayEntityActivity.m37473N2(editStopOverviewActivity2.getApplicationContext(), (EditorTransitStopPathway) this.f33746e, false), 1001);
                return;
            case 2:
                C19998h hVar = (C19998h) this.f33744c;
                ServerId serverId = (ServerId) this.f33746e;
                int i = C19998h.f50842n;
                hVar.getClass();
                C17474b.C17475a aVar3 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar3.mo49939g(AnalyticsAttributeKey.TYPE, "mot_train_ride_show_entry_qr_for_inspection");
                aVar3.mo49943k(AnalyticsAttributeKey.ID, serverId);
                hVar.mo46797j2(aVar3.mo49933a());
                hVar.mo46786U1(C20000j.class, new C1512f(1, (String) this.f33745d, serverId));
                return;
            case 3:
                C19876a aVar4 = (C19876a) this.f33744c;
                int i2 = C19876a.f50486t;
                aVar4.getClass();
                aVar4.mo52159y2(((QuestionInstructions) this.f33745d).f42865b, ((QuestionButton) this.f33746e).f42862b);
                return;
            default:
                TicketDetailsActivity ticketDetailsActivity = (TicketDetailsActivity) this.f33744c;
                Ticket ticket = (Ticket) this.f33745d;
                int i3 = TicketDetailsActivity.f23504m0;
                ticketDetailsActivity.getClass();
                C17474b.C17475a aVar5 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar5.mo49939g(AnalyticsAttributeKey.TYPE, "email_clicked");
                aVar5.mo49937e(AnalyticsAttributeKey.PROVIDER, ticket.f23473b.f23511b);
                aVar5.mo49939g(AnalyticsAttributeKey.ID, ticket.f23473b.f23513d);
                ticketDetailsActivity.mo44545v2(aVar5.mo49933a());
                ticketDetailsActivity.startActivity(C20927a0.m49009d((String) null, (String) null, new String[]{(String) this.f33746e}));
                return;
        }
    }
}
