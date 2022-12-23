package com.moovit.app.itinerary.nogroup;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import c00.C13717b;
import ce0.C21100e;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.itinerary.nogroup.ItineraryNoGroupActivity;
import com.moovit.app.lineschedule.LineScheduleActivity;
import com.moovit.database.DbEntityRef;
import com.moovit.itinerary.model.leg.TransitLineLeg;
import com.moovit.transit.TransitLine;
import com.tranzmate.R;
import ha0.C12746b;
import java.util.Collections;
import java.util.List;
import p543hq.C17474b;

public class NoGroupTransitLegView extends LinearLayout {

    /* renamed from: b */
    public TransitLineLeg f38610b;

    /* renamed from: c */
    public C15062c f38611c;

    /* renamed from: d */
    public final C15060a f38612d;

    /* renamed from: e */
    public final C15061b f38613e;

    /* renamed from: com.moovit.app.itinerary.nogroup.NoGroupTransitLegView$a */
    public class C15060a implements View.OnClickListener {
        public C15060a() {
        }

        public final void onClick(View view) {
            NoGroupTransitLegView noGroupTransitLegView = NoGroupTransitLegView.this;
            C15062c cVar = noGroupTransitLegView.f38611c;
            if (cVar != null) {
                TransitLineLeg transitLineLeg = noGroupTransitLegView.f38610b;
                ItineraryNoGroupActivity.C15056a aVar = (ItineraryNoGroupActivity.C15056a) cVar;
                ItineraryNoGroupActivity itineraryNoGroupActivity = ItineraryNoGroupActivity.this;
                C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "view_stops_clicked");
                itineraryNoGroupActivity.mo44545v2(aVar2.mo49933a());
                ItineraryNoGroupActivity itineraryNoGroupActivity2 = ItineraryNoGroupActivity.this;
                itineraryNoGroupActivity2.getClass();
                List<T> entities = DbEntityRef.getEntities(transitLineLeg.f42111e);
                int i = C12746b.f31489j;
                C21100e.m49373x(entities, "stops");
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("stops", C13717b.m34264k(entities));
                bundle.putParcelable("line", transitLineLeg.f42110d.get());
                C12746b bVar = new C12746b();
                bVar.setArguments(bundle);
                bVar.show(itineraryNoGroupActivity2.getSupportFragmentManager(), "LineStopsDialogFragment");
            }
        }
    }

    /* renamed from: com.moovit.app.itinerary.nogroup.NoGroupTransitLegView$b */
    public class C15061b implements View.OnClickListener {
        public C15061b() {
        }

        public final void onClick(View view) {
            NoGroupTransitLegView noGroupTransitLegView = NoGroupTransitLegView.this;
            C15062c cVar = noGroupTransitLegView.f38611c;
            if (cVar != null) {
                TransitLineLeg transitLineLeg = noGroupTransitLegView.f38610b;
                ItineraryNoGroupActivity itineraryNoGroupActivity = ItineraryNoGroupActivity.this;
                int i = ItineraryNoGroupActivity.f38596o0;
                itineraryNoGroupActivity.getClass();
                TransitLine transitLine = transitLineLeg.f42110d.get();
                itineraryNoGroupActivity.startActivity(LineScheduleActivity.m38522y2(itineraryNoGroupActivity, transitLine.mo24369b().f23694b, Collections.singletonList(transitLine.f23687c), transitLineLeg.mo48332W().f23649d, transitLineLeg.mo48334e2().f23649d, transitLineLeg.f42108b));
            }
        }
    }

    /* renamed from: com.moovit.app.itinerary.nogroup.NoGroupTransitLegView$c */
    public interface C15062c {
    }

    public NoGroupTransitLegView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NoGroupTransitLegView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38612d = new C15060a();
        this.f38613e = new C15061b();
        setOrientation(1);
        LayoutInflater.from(context).inflate(R.layout.itinerary_ng_transit_leg_layout, this, true);
    }
}
