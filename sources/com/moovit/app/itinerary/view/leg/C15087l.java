package com.moovit.app.itinerary.view.leg;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import c00.C13720d;
import c00.C13722f;
import c00.C13723g;
import com.facebook.appevents.C2342l;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.itinerary.C15053i;
import com.moovit.app.itinerary.ItineraryActivity;
import com.moovit.app.itinerary.view.NextArrivalsView;
import com.moovit.app.itinerary.view.leg.AbstractLegView;
import com.moovit.app.servicealerts.LineServiceAlertDigestView;
import com.moovit.commons.utils.UiUtils;
import com.moovit.image.model.Image;
import com.moovit.image.model.ResourceImage;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.itinerary.model.leg.WaitToMultiTransitLinesLeg;
import com.moovit.itinerary.model.leg.WaitToTransitLineLeg;
import com.moovit.network.model.ServerId;
import com.moovit.transit.Schedule;
import com.moovit.util.time.Time;
import com.tranzmate.R;
import e20.C16783l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p373au.C13532d;
import p397bu.C13683a;
import p397bu.C13689g;
import p397bu.C13690h;
import p543hq.C17474b;
import p716oy.C18860a;
import p826tr.C19752b;
import p876vt.C20230a;
import p952yy.C20787c;
import p977zz.C20944i0;

/* renamed from: com.moovit.app.itinerary.view.leg.l */
public final class C15087l extends AbstractLegView<WaitToMultiTransitLinesLeg> {

    /* renamed from: E */
    public static final /* synthetic */ int f38717E = 0;

    /* renamed from: C */
    public final C15088a f38718C = new C15088a();

    /* renamed from: D */
    public NextArrivalsView f38719D;

    /* renamed from: com.moovit.app.itinerary.view.leg.l$a */
    public class C15088a extends View.AccessibilityDelegate {
        public C15088a() {
        }

        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() == 32768) {
                C15087l.this.mo45377J();
            }
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }
    }

    public C15087l(Context context) {
        super(context, (AttributeSet) null);
    }

    public int getBottomExtraViewsDividerSpec() {
        return 0;
    }

    /* renamed from: q */
    public final List mo45383q(LinearLayout linearLayout, Leg leg, Leg leg2) {
        WaitToMultiTransitLinesLeg waitToMultiTransitLinesLeg = (WaitToMultiTransitLinesLeg) leg;
        View a = C20230a.m47798a(linearLayout, waitToMultiTransitLinesLeg.mo48467b(), waitToMultiTransitLinesLeg.f42117b);
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
        a.setOnClickListener(new C13683a(1, this, waitToMultiTransitLinesLeg, leg2));
        return Collections.singletonList(a);
    }

    /* renamed from: r */
    public final List mo45384r(Leg leg, Leg leg2) {
        Time time;
        WaitToMultiTransitLinesLeg waitToMultiTransitLinesLeg = (WaitToMultiTransitLinesLeg) leg;
        ArrayList arrayList = new ArrayList(Collections.emptyList());
        WaitToTransitLineLeg b = waitToMultiTransitLinesLeg.mo48467b();
        if (C18860a.m45884a().f48029q) {
            time = C16783l.m42482n(b.f42132c);
        } else {
            time = null;
        }
        ArrayList<O> c = C13720d.m34273c(waitToMultiTransitLinesLeg.f42117b, (C13722f) null, new C19752b(3));
        NextArrivalsView nextArrivalsView = new NextArrivalsView(getContext(), (AttributeSet) null);
        this.f38719D = nextArrivalsView;
        nextArrivalsView.setBaseTime(time);
        this.f38719D.setLinesSchedules(c);
        this.f38719D.setAccessibilityDelegate(this.f38718C);
        arrayList.add(this.f38719D);
        List<C20944i0<WaitToTransitLineLeg, Schedule>> displayedLinesSchedules = this.f38719D.getDisplayedLinesSchedules();
        if (displayedLinesSchedules.size() > 1) {
            setInstructionText(getResources().getString(R.string.tripplan_itinerary_wait_multiple));
        }
        int size = C13720d.m34277g(displayedLinesSchedules, (C13722f) null, new C2342l(4)).size();
        if (C13532d.m33910e(getContext())) {
            int size2 = waitToMultiTransitLinesLeg.f42117b.size() - size;
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.wait_leg_action_view, this, false);
            if (size2 > 0) {
                textView.setText(getResources().getQuantityString(R.plurals.tripplan_itinerary_view_show_more_options, size2, new Object[]{Integer.valueOf(size2)}));
            } else {
                textView.setText(getResources().getString(R.string.tripplan_itinerary_more));
            }
            textView.setOnClickListener(new C13690h(0, this, waitToMultiTransitLinesLeg, leg2));
            arrayList.add(textView);
        }
        ArrayList z = C16783l.m42494z(waitToMultiTransitLinesLeg);
        if (C13723g.m34280a(z, new C15053i(1))) {
            Context context = getContext();
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, UiUtils.m40248g(context, 4.0f), 0, UiUtils.m40245d(context.getResources(), 14.0f));
            LineServiceAlertDigestView lineServiceAlertDigestView = new LineServiceAlertDigestView(context, (AttributeSet) null);
            lineServiceAlertDigestView.setLayoutParams(layoutParams);
            lineServiceAlertDigestView.setLineServiceAlertDigests(z);
            arrayList.add(lineServiceAlertDigestView);
        }
        return arrayList;
    }

    public void setRealTime(Map<ServerId, C20787c> map) {
        ArrayList<O> c = C13720d.m34273c(((WaitToMultiTransitLinesLeg) getLeg()).f42117b, (C13722f) null, new C13689g(map, 0));
        NextArrivalsView nextArrivalsView = this.f38719D;
        if (nextArrivalsView != null) {
            nextArrivalsView.setLinesSchedules(c);
        }
    }

    /* renamed from: u */
    public final AbstractLegView.FooterViewType mo45393u(Leg leg) {
        WaitToMultiTransitLinesLeg waitToMultiTransitLinesLeg = (WaitToMultiTransitLinesLeg) leg;
        return AbstractLegView.FooterViewType.NONE;
    }

    /* renamed from: v */
    public final CharSequence mo45394v(Leg leg) {
        WaitToMultiTransitLinesLeg waitToMultiTransitLinesLeg = (WaitToMultiTransitLinesLeg) leg;
        return getResources().getString(R.string.tripplan_itinerary_wait);
    }

    /* renamed from: w */
    public final /* bridge */ /* synthetic */ Image mo45395w(Leg leg) {
        WaitToMultiTransitLinesLeg waitToMultiTransitLinesLeg = (WaitToMultiTransitLinesLeg) leg;
        return null;
    }

    /* renamed from: x */
    public final ResourceImage mo45396x(Leg leg) {
        WaitToMultiTransitLinesLeg waitToMultiTransitLinesLeg = (WaitToMultiTransitLinesLeg) leg;
        return new ResourceImage(R.drawable.ic_clock_24_on_surface_emphasis_high, new String[0]);
    }

    /* renamed from: y */
    public final /* bridge */ /* synthetic */ List mo45397y(Leg leg) {
        WaitToMultiTransitLinesLeg waitToMultiTransitLinesLeg = (WaitToMultiTransitLinesLeg) leg;
        return null;
    }

    /* renamed from: z */
    public final /* bridge */ /* synthetic */ CharSequence mo45398z(Leg leg) {
        WaitToMultiTransitLinesLeg waitToMultiTransitLinesLeg = (WaitToMultiTransitLinesLeg) leg;
        return null;
    }
}
