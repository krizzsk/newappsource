package com.moovit.app.itinerary.view;

import a00.C13382a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import c00.C13720d;
import c00.C13722f;
import com.moovit.itinerary.model.leg.WaitToTransitLineLeg;
import com.moovit.l10n.C16181a;
import com.moovit.l10n.LinePresentationType;
import com.moovit.servicealerts.LineServiceAlertDigest;
import com.moovit.servicealerts.ServiceStatusCategory;
import com.moovit.transit.C7843b;
import com.moovit.transit.Schedule;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitStopPlatform;
import com.moovit.transit.TransitType;
import com.moovit.util.time.Time;
import com.moovit.view.ScheduleView;
import com.moovit.view.TransitLineListItemView;
import com.tranzmate.R;
import e20.C16783l;
import g20.C17161i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p373au.C13533e;
import p373au.C13534f;
import p641lu.C18277b;
import p824tp.C19728f;
import p977zz.C20944i0;
import p977zz.C20964s0;
import p977zz.C20975x0;
import q00.C19047a;
import q00.C19053d;

public class NextArrivalsView extends LinearLayout {

    /* renamed from: g */
    public static final /* synthetic */ int f38657g = 0;

    /* renamed from: b */
    public final C15072a f38658b;

    /* renamed from: c */
    public C17161i<C16181a.C16184c, TransitLine> f38659c;

    /* renamed from: d */
    public Time f38660d;

    /* renamed from: e */
    public List<C20944i0<WaitToTransitLineLeg, Schedule>> f38661e;

    /* renamed from: f */
    public final StringBuilder f38662f;

    /* renamed from: com.moovit.app.itinerary.view.NextArrivalsView$a */
    public class C15072a extends ScheduleView.C7927a {
        public C15072a() {
        }

        /* renamed from: a */
        public final void mo24745a() {
            NextArrivalsView nextArrivalsView = NextArrivalsView.this;
            int i = NextArrivalsView.f38657g;
            nextArrivalsView.mo45344b();
        }
    }

    public NextArrivalsView() {
        throw null;
    }

    public NextArrivalsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private C17161i<C16181a.C16184c, TransitLine> getTemplate() {
        if (this.f38659c == null) {
            this.f38659c = C19728f.m47195a(getContext()).mo52082b(LinePresentationType.STOP_DETAIL);
        }
        return this.f38659c;
    }

    /* renamed from: a */
    public final void mo45343a(WaitToTransitLineLeg waitToTransitLineLeg, Schedule schedule) {
        setLinesSchedules(Collections.singletonList(new C20944i0(waitToTransitLineLeg, schedule)));
    }

    /* renamed from: b */
    public final void mo45344b() {
        Schedule.C7799d dVar;
        String str;
        this.f38662f.setLength(0);
        Time time = this.f38660d;
        if (time != null) {
            dVar = new Schedule.C7799d(time);
        } else {
            dVar = Schedule.m17782D();
        }
        Collections.sort(this.f38661e, new C13534f(dVar, 0));
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            TransitLineListItemView transitLineListItemView = (TransitLineListItemView) getChildAt(i);
            C20944i0 i0Var = this.f38661e.get(i);
            WaitToTransitLineLeg waitToTransitLineLeg = (WaitToTransitLineLeg) i0Var.f52692a;
            Schedule schedule = (Schedule) i0Var.f52693b;
            transitLineListItemView.mo24765v(getTemplate(), waitToTransitLineLeg.f42135f.get());
            LineServiceAlertDigest lineServiceAlertDigest = waitToTransitLineLeg.f42139j;
            String str2 = null;
            if (lineServiceAlertDigest == null || !ServiceStatusCategory.IMPORTANT_LEVEL.contains(lineServiceAlertDigest.f23186c.f23213b)) {
                transitLineListItemView.setIconTopEndDecorationDrawable((Drawable) null);
            } else {
                transitLineListItemView.setIconTopEndDecorationDrawable(lineServiceAlertDigest.f23186c.f23213b.getSmallIconResId());
            }
            transitLineListItemView.setSchedule(schedule);
            Time m = schedule.mo24326m();
            if (m != null) {
                str = m.f23909j;
            } else {
                str = null;
            }
            if (str == null) {
                C18277b bVar = C16783l.f43688a;
                TransitStopPlatform c = waitToTransitLineLeg.f42136g.get().mo24411c(waitToTransitLineLeg.f42135f.getServerId());
                if (c != null && !C20964s0.m49090h(c.f23754b)) {
                    str2 = c.f23754b;
                }
                str = str2;
            }
            if (str != null) {
                String string = getContext().getString(R.string.pathway_guidance_platform, new Object[]{str});
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                CharSequence subtitle = transitLineListItemView.getSubtitle();
                if (!C20964s0.m49090h(subtitle)) {
                    spannableStringBuilder.append(subtitle).append(transitLineListItemView.getResources().getString(R.string.string_list_delimiter_dot));
                }
                spannableStringBuilder.append(string);
                transitLineListItemView.setSubtitle((CharSequence) spannableStringBuilder);
            }
            C13382a.m33666b(this.f38662f, transitLineListItemView.getContentDescription());
        }
        C13382a.m33674j(this, this.f38662f);
    }

    public List<C20944i0<WaitToTransitLineLeg, Schedule>> getDisplayedLinesSchedules() {
        return Collections.unmodifiableList(this.f38661e.subList(0, getChildCount()));
    }

    public void setBaseTime(Time time) {
        if (!C20975x0.m49118e(this.f38660d, time)) {
            this.f38660d = time;
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                ((TransitLineListItemView) getChildAt(i)).getScheduleView().setBaseTime(time);
            }
        }
    }

    public void setLinesSchedules(List<C20944i0<WaitToTransitLineLeg, Schedule>> list) {
        int i;
        int i2;
        ArrayList arrayList = new ArrayList();
        for (C20944i0 next : list) {
            TransitType.ViewType e = C7843b.m17878e(((WaitToTransitLineLeg) next.f52692a).f42135f.get());
            List<Time> n = ((Schedule) next.f52693b).mo24327n();
            if (!TransitType.ViewType.TRIPS.equals(e) || n.isEmpty()) {
                arrayList.add(next);
            } else {
                C13720d.m34276f(n, (C13722f) null, new C13533e(next, 0), arrayList);
            }
        }
        this.f38661e = arrayList;
        int size = arrayList.size();
        C19047a a = C19047a.m46164a(getContext().getApplicationContext());
        if (a != null) {
            i = ((Integer) a.mo51505b(C19053d.f48461M)).intValue();
        } else {
            i = 2;
        }
        int min = Math.min(size, i);
        int childCount = getChildCount();
        if (childCount != min) {
            if (childCount > min) {
                removeViews(min, childCount - min);
            } else {
                C19047a a2 = C19047a.m46164a(getContext().getApplicationContext());
                if (a2 == null || ((Boolean) a2.mo51505b(C19053d.f48463O)).booleanValue()) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                LayoutInflater from = LayoutInflater.from(getContext());
                while (childCount < min) {
                    TransitLineListItemView transitLineListItemView = (TransitLineListItemView) from.inflate(R.layout.next_line_arrivals_list_item_view, this, false);
                    ScheduleView scheduleView = transitLineListItemView.getScheduleView();
                    scheduleView.setBaseTime(this.f38660d);
                    scheduleView.setCoordinator(this.f38658b);
                    scheduleView.setPeekTimesMode(i2);
                    addView(transitLineListItemView);
                    childCount++;
                }
            }
        }
        mo45344b();
    }

    public NextArrivalsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38658b = new C15072a();
        this.f38660d = null;
        this.f38661e = Collections.emptyList();
        this.f38662f = new StringBuilder();
        setOrientation(1);
    }
}
