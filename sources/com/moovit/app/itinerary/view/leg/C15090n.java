package com.moovit.app.itinerary.view.leg;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.itinerary.ItineraryActivity;
import com.moovit.app.itinerary.view.NextArrivalsView;
import com.moovit.app.itinerary.view.leg.AbstractLegView;
import com.moovit.app.servicealerts.LineServiceAlertDigestView;
import com.moovit.commons.utils.UiUtils;
import com.moovit.image.model.Image;
import com.moovit.image.model.ResourceImage;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.itinerary.model.leg.WaitToTransitLineLeg;
import com.moovit.network.model.ServerId;
import com.moovit.servicealerts.LineServiceAlertDigest;
import com.moovit.servicealerts.ServiceStatusCategory;
import com.moovit.transit.Schedule;
import com.moovit.util.time.Time;
import com.tranzmate.R;
import e20.C16783l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p373au.C13532d;
import p397bu.C13685c;
import p397bu.C13686d;
import p543hq.C17474b;
import p716oy.C18860a;
import p876vt.C20230a;
import p952yy.C20787c;

/* renamed from: com.moovit.app.itinerary.view.leg.n */
public final class C15090n extends AbstractLegView<WaitToTransitLineLeg> {

    /* renamed from: E */
    public static final /* synthetic */ int f38722E = 0;

    /* renamed from: C */
    public final C15091a f38723C = new C15091a();

    /* renamed from: D */
    public NextArrivalsView f38724D;

    /* renamed from: com.moovit.app.itinerary.view.leg.n$a */
    public class C15091a extends View.AccessibilityDelegate {
        public C15091a() {
        }

        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() == 32768) {
                C15090n.this.mo45377J();
            }
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }
    }

    public C15090n(Context context) {
        super(context, (AttributeSet) null);
    }

    public int getBottomExtraViewsDividerSpec() {
        return 0;
    }

    /* renamed from: q */
    public final List mo45383q(LinearLayout linearLayout, Leg leg, Leg leg2) {
        WaitToTransitLineLeg waitToTransitLineLeg = (WaitToTransitLineLeg) leg;
        View a = C20230a.m47798a(linearLayout, waitToTransitLineLeg, Collections.singletonList(waitToTransitLineLeg));
        if (a == null) {
            return Collections.emptyList();
        }
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "train_leg_assistance_button_impression");
        C17474b a2 = aVar.mo49933a();
        AbstractLegView.C15075b bVar = this.f38691h;
        if (bVar != null) {
            ((ItineraryActivity) bVar).mo44545v2(a2);
        }
        a.setOnClickListener(new C13686d(this, waitToTransitLineLeg, leg2, 1));
        return Collections.singletonList(a);
    }

    /* renamed from: r */
    public final List mo45384r(Leg leg, Leg leg2) {
        Time time;
        WaitToTransitLineLeg waitToTransitLineLeg = (WaitToTransitLineLeg) leg;
        ArrayList arrayList = new ArrayList(Collections.emptyList());
        NextArrivalsView nextArrivalsView = new NextArrivalsView(getContext(), (AttributeSet) null);
        this.f38724D = nextArrivalsView;
        if (C18860a.m45884a().f48029q) {
            time = C16783l.m42482n(waitToTransitLineLeg.f42132c);
        } else {
            time = null;
        }
        nextArrivalsView.setBaseTime(time);
        this.f38724D.mo45343a(waitToTransitLineLeg, waitToTransitLineLeg.f42138i.f42142b);
        this.f38724D.setAccessibilityDelegate(this.f38723C);
        arrayList.add(this.f38724D);
        if (this.f38724D.getDisplayedLinesSchedules().size() > 1) {
            setInstructionText(getResources().getString(R.string.tripplan_itinerary_wait_multiple));
        }
        if (C13532d.m33910e(getContext())) {
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.wait_leg_action_view, this, false);
            textView.setOnClickListener(new C13685c(1, this, waitToTransitLineLeg, leg2));
            arrayList.add(textView);
        }
        LineServiceAlertDigest lineServiceAlertDigest = waitToTransitLineLeg.f42139j;
        if (lineServiceAlertDigest != null && ServiceStatusCategory.IMPORTANT_LEVEL.contains(lineServiceAlertDigest.f23186c.f23213b)) {
            Context context = getContext();
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, UiUtils.m40248g(context, 4.0f), 0, UiUtils.m40249h(context.getResources(), 14.0f));
            LineServiceAlertDigestView lineServiceAlertDigestView = new LineServiceAlertDigestView(context, (AttributeSet) null);
            lineServiceAlertDigestView.setLayoutParams(layoutParams);
            lineServiceAlertDigestView.setLineServiceAlertDigest(lineServiceAlertDigest);
            arrayList.add(lineServiceAlertDigestView);
        }
        return arrayList;
    }

    public void setRealTime(Map<ServerId, C20787c> map) {
        Schedule schedule;
        WaitToTransitLineLeg waitToTransitLineLeg = (WaitToTransitLineLeg) getLeg();
        C20787c cVar = map.get(waitToTransitLineLeg.f42135f.getServerId());
        if (cVar != null) {
            schedule = cVar.f52458c;
        } else {
            schedule = waitToTransitLineLeg.f42138i.f42142b;
        }
        NextArrivalsView nextArrivalsView = this.f38724D;
        if (nextArrivalsView != null) {
            nextArrivalsView.mo45343a(waitToTransitLineLeg, schedule);
        }
    }

    /* renamed from: u */
    public final AbstractLegView.FooterViewType mo45393u(Leg leg) {
        WaitToTransitLineLeg waitToTransitLineLeg = (WaitToTransitLineLeg) leg;
        return AbstractLegView.FooterViewType.NONE;
    }

    /* renamed from: v */
    public final CharSequence mo45394v(Leg leg) {
        WaitToTransitLineLeg waitToTransitLineLeg = (WaitToTransitLineLeg) leg;
        return getResources().getString(R.string.tripplan_itinerary_wait);
    }

    /* renamed from: w */
    public final /* bridge */ /* synthetic */ Image mo45395w(Leg leg) {
        WaitToTransitLineLeg waitToTransitLineLeg = (WaitToTransitLineLeg) leg;
        return null;
    }

    /* renamed from: x */
    public final ResourceImage mo45396x(Leg leg) {
        WaitToTransitLineLeg waitToTransitLineLeg = (WaitToTransitLineLeg) leg;
        return new ResourceImage(R.drawable.ic_clock_24_on_surface_emphasis_high, new String[0]);
    }

    /* renamed from: y */
    public final /* bridge */ /* synthetic */ List mo45397y(Leg leg) {
        WaitToTransitLineLeg waitToTransitLineLeg = (WaitToTransitLineLeg) leg;
        return null;
    }

    /* renamed from: z */
    public final /* bridge */ /* synthetic */ CharSequence mo45398z(Leg leg) {
        WaitToTransitLineLeg waitToTransitLineLeg = (WaitToTransitLineLeg) leg;
        return null;
    }
}
