package com.moovit.app.stopdetail;

import a00.C13382a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ce0.C21100e;
import com.moovit.app.stopdetail.C15340c;
import com.moovit.arrivals.ArrivalsResponseKey;
import com.moovit.network.model.ServerId;
import com.moovit.servicealerts.ServiceStatusCategory;
import com.moovit.transit.Schedule;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitLineGroup;
import com.moovit.util.time.C7925b;
import com.moovit.util.time.StopRealTimeCongestion;
import com.moovit.util.time.Time;
import com.moovit.view.ScheduleView;
import com.moovit.view.TransitLineListItemView;
import com.tranzmate.R;
import j80.C12775d;
import ja0.C12797f;
import java.util.ArrayList;
import java.util.Map;
import o00.C18676l;
import p455dy.C16753e;
import p952yy.C20787c;
import p977zz.C20964s0;

public abstract class BaseSectionAdapter extends C18676l<C15327d, C15328e, C12797f> implements C15340c.C15349i {

    /* renamed from: j */
    public final C15324a f39640j = new C15324a();

    /* renamed from: k */
    public final C15325b f39641k = new C15325b();

    /* renamed from: l */
    public final C15340c.C15350j f39642l;

    public enum SectionType {
        REAL_TIMES,
        STATIC_TIMES,
        NON_ACTIVE,
        NO_TYPE
    }

    /* renamed from: com.moovit.app.stopdetail.BaseSectionAdapter$a */
    public class C15324a implements View.OnClickListener {
        public C15324a() {
        }

        public final void onClick(View view) {
            C15340c.C15350j jVar = BaseSectionAdapter.this.f39642l;
            jVar.f39732h.mo45912W((TextView) view, jVar.f39726b.f39709n);
        }
    }

    /* renamed from: com.moovit.app.stopdetail.BaseSectionAdapter$b */
    public class C15325b implements View.OnClickListener {
        public C15325b() {
        }

        public final void onClick(View view) {
            TransitLine transitLine = (TransitLine) view.getTag(R.id.view_tag_param1);
            C12775d dVar = (C12775d) view.getTag(R.id.view_tag_param2);
            String str = (String) view.getTag(R.id.view_tag_param3);
            if (transitLine != null) {
                BaseSectionAdapter.this.f39642l.f39732h.mo45913Y(transitLine, dVar, str);
            }
        }
    }

    /* renamed from: com.moovit.app.stopdetail.BaseSectionAdapter$c */
    public class C15326c extends View.AccessibilityDelegate {

        /* renamed from: a */
        public final /* synthetic */ TransitLineListItemView f39645a;

        /* renamed from: b */
        public final /* synthetic */ CharSequence f39646b;

        public C15326c(TransitLineListItemView transitLineListItemView, String str) {
            this.f39645a = transitLineListItemView;
            this.f39646b = str;
        }

        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() == 32768) {
                TransitLineListItemView transitLineListItemView = this.f39645a;
                C13382a.m33674j(transitLineListItemView, transitLineListItemView.getContentDescription(), this.f39646b);
            }
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }
    }

    /* renamed from: com.moovit.app.stopdetail.BaseSectionAdapter$d */
    public static class C15327d {

        /* renamed from: a */
        public final TransitLine f39647a;

        /* renamed from: b */
        public final Schedule f39648b;

        public C15327d(TransitLine transitLine, Schedule schedule) {
            C21100e.m49373x(transitLine, "line");
            this.f39647a = transitLine;
            C21100e.m49373x(schedule, "schedule");
            this.f39648b = schedule;
        }
    }

    /* renamed from: com.moovit.app.stopdetail.BaseSectionAdapter$e */
    public static class C15328e extends C18676l.C18678b<C15327d> {

        /* renamed from: d */
        public final SectionType f39649d;

        /* renamed from: e */
        public final CharSequence f39650e;

        /* renamed from: f */
        public final String f39651f;

        /* renamed from: g */
        public final StopRealTimeCongestion f39652g;

        public C15328e(SectionType sectionType, String str, String str2, String str3, ArrayList arrayList, StopRealTimeCongestion stopRealTimeCongestion) {
            super(str, arrayList);
            this.f39650e = str2;
            this.f39652g = stopRealTimeCongestion;
            this.f39651f = str3;
            this.f39649d = sectionType;
        }
    }

    public BaseSectionAdapter(C15340c.C15350j jVar) {
        this.f39642l = jVar;
    }

    /* renamed from: A */
    public final boolean mo45887A(C15327d dVar) {
        boolean z;
        if (dVar != null) {
            C16753e eVar = this.f39642l.f39731g;
            TransitLineGroup b = dVar.f39647a.mo24369b();
            eVar.getClass();
            C21100e.m49373x(b, "line");
            if (eVar.mo49440o(b.f23694b) != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: B */
    public abstract boolean mo45888B(int i);

    /* renamed from: C */
    public void mo45889C(C12797f fVar, int i, int i2) {
        Time time;
        String str;
        Schedule schedule;
        C12797f fVar2 = fVar;
        Context e = fVar.mo39638e();
        C15328e eVar = (C15328e) mo51052n(i);
        C15327d dVar = (C15327d) eVar.get(i2);
        View view = fVar2.itemView;
        view.setTag(R.id.view_tag_param1, dVar.f39647a);
        view.setOnClickListener(this.f39641k);
        boolean z = this.f39642l.f39726b.f39710o;
        Schedule schedule2 = dVar.f39648b;
        int size = schedule2.size();
        while (true) {
            size--;
            if (size < 0) {
                time = null;
                break;
            }
            time = schedule2.mo24331u(size);
            if (time.f23911l) {
                break;
            }
        }
        TransitLineListItemView transitLineListItemView = (TransitLineListItemView) fVar2.mo39639f(R.id.item);
        transitLineListItemView.mo24765v(this.f39642l.f39730f, dVar.f39647a);
        C12775d dVar2 = this.f39642l.f39726b.f39706k.get(dVar.f39647a.f23687c);
        if (dVar2 == null || !ServiceStatusCategory.IMPORTANT_LEVEL.contains(dVar2.f31580b.f23213b)) {
            transitLineListItemView.setIconTopEndDecorationDrawable(0);
            str = null;
        } else {
            transitLineListItemView.setIconTopEndDecorationDrawable(dVar2.f31580b.f23213b.getSmallIconResId());
            str = C13382a.m33667c(e.getString(R.string.service_alert_line_status), e.getString(dVar2.f31580b.f23213b.getAccessibilityResId()));
        }
        view.setTag(R.id.view_tag_param2, dVar2);
        if (!z || eVar.f39649d == SectionType.REAL_TIMES) {
            schedule = dVar.f39648b;
        } else if (time == null) {
            schedule = Schedule.f23657c;
        } else {
            schedule = Schedule.m17783E(time);
        }
        ScheduleView scheduleView = (ScheduleView) fVar2.mo39639f(R.id.time);
        if (eVar.f39649d == SectionType.REAL_TIMES) {
            scheduleView.getClass();
            C21100e.m49373x(schedule, "schedule");
            scheduleView.f23972d = schedule;
            scheduleView.setBaseTime((Time) null);
        } else {
            Time time2 = this.f39642l.f39726b.f39709n;
            scheduleView.getClass();
            C21100e.m49373x(schedule, "schedule");
            scheduleView.f23972d = schedule;
            scheduleView.setBaseTime(time2);
        }
        view.setTag(R.id.view_tag_param3, scheduleView.getDisplayType());
        TextView textView = (TextView) fVar2.mo39639f(R.id.last_arrival);
        if (z || time == null) {
            textView.setVisibility(8);
        } else {
            textView.setText(C20964s0.m49097o(" - ", e.getString(R.string.time_filter_last), C7925b.m18024l(e, time.mo24631g())));
            textView.setVisibility(0);
        }
        view.setAccessibilityDelegate(new C15326c(transitLineListItemView, str));
    }

    /* renamed from: b */
    public final void mo45890b(String str) {
    }

    /* renamed from: d */
    public final RecyclerView.Adapter mo45891d() {
        return this;
    }

    /* renamed from: e */
    public final void mo45892e(Context context, Time time, boolean z, Map<ArrivalsResponseKey, Map<ServerId, C20787c>> map) {
        mo51055y(mo45895z(context, time, map));
    }

    /* renamed from: f */
    public final boolean mo45893f() {
        return false;
    }

    /* renamed from: h */
    public boolean mo45894h() {
        return this instanceof C15338a;
    }

    /* renamed from: w */
    public final RecyclerView.C1119a0 mo23819w(ViewGroup viewGroup, int i) {
        int i2 = 0;
        C12797f fVar = new C12797f(C13715c.m34239e(viewGroup, R.layout.stop_detail_default_and_platforms_list_item_view, viewGroup, false));
        TransitLineListItemView transitLineListItemView = (TransitLineListItemView) fVar.mo39639f(R.id.item);
        if (mo45888B(i)) {
            i2 = R.drawable.ic_star_16_favorite;
        }
        transitLineListItemView.setIconTopStartDecorationDrawable(i2);
        return fVar;
    }

    /* renamed from: z */
    public abstract ArrayList mo45895z(Context context, Time time, Map map);
}
