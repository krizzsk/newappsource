package com.moovit.app.stopdetail;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import c00.C13717b;
import c00.C13720d;
import c00.C13722f;
import c00.C13723g;
import com.moovit.app.stopdetail.BaseSectionAdapter;
import com.moovit.app.stopdetail.C15340c;
import com.moovit.arrivals.ArrivalsResponseKey;
import com.moovit.database.DbEntityRef;
import com.moovit.design.view.list.ListItemView;
import com.moovit.network.model.ServerId;
import com.moovit.transit.Schedule;
import com.moovit.transit.TransitLine;
import com.moovit.util.time.C7925b;
import com.moovit.util.time.StopRealTimeCongestion;
import com.moovit.util.time.Time;
import com.tranzmate.R;
import j00.C17687f;
import j00.C17689h;
import ja0.C12797f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import o00.C18676l;
import p453dw.C16725a;
import p453dw.C16726b;
import p543hq.C17478e;
import p829tu.C19777h;
import p924xt.C20602j;
import p924xt.C20603k;
import p952yy.C20787c;
import p977zz.C20943i;

/* renamed from: com.moovit.app.stopdetail.a */
public final class C15338a extends BaseSectionAdapter {
    public C15338a(C15340c.C15350j jVar) {
        super(jVar);
    }

    /* renamed from: B */
    public final boolean mo45888B(int i) {
        return i == 12 || i == 13;
    }

    /* renamed from: m */
    public final int mo40090m(int i, int i2) {
        C18676l.C18679c n = mo51052n(i);
        BaseSectionAdapter.C15327d dVar = (BaseSectionAdapter.C15327d) n.getItem(i2);
        if (i2 == n.mo40089e() - 1) {
            if (mo45887A(dVar)) {
                return 13;
            }
            return 11;
        } else if (mo45887A(dVar)) {
            return 12;
        } else {
            return 10;
        }
    }

    /* renamed from: p */
    public final int mo23815p(int i) {
        return 0;
    }

    /* renamed from: r */
    public final boolean mo40091r(int i) {
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: s */
    public final boolean mo23816s(int i) {
        return i == 0;
    }

    /* renamed from: t */
    public final void mo23817t(RecyclerView.C1119a0 a0Var, int i, int i2) {
        ObjectAnimator objectAnimator;
        C12797f fVar = (C12797f) a0Var;
        super.mo45889C(fVar, i, i2);
        C15340c cVar = this.f39642l.f39726b;
        ServerId serverId = ((BaseSectionAdapter.C15327d) ((BaseSectionAdapter.C15328e) mo51052n(i)).get(i2)).f39647a.f23687c;
        ServerId serverId2 = cVar.f39717v;
        boolean z = false;
        if (serverId2 != null && serverId2.equals(serverId)) {
            cVar.f39717v = null;
            z = true;
        }
        if (z) {
            View view = fVar.itemView;
            Drawable background = view.getBackground();
            int[] iArr = {13431293, -3345923, 13431293};
            if (C20943i.m49051d(21)) {
                objectAnimator = ObjectAnimator.ofArgb(view, "backgroundColor", iArr);
            } else {
                objectAnimator = ObjectAnimator.ofInt(view, "backgroundColor", iArr);
                objectAnimator.setEvaluator(C17689h.f45442a);
            }
            objectAnimator.setStartDelay(300);
            objectAnimator.setDuration(3500);
            objectAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
            objectAnimator.addListener(new C17687f(view, background));
            objectAnimator.start();
        }
    }

    /* renamed from: v */
    public final void mo23818v(RecyclerView.C1119a0 a0Var, int i) {
        int i2;
        C12797f fVar = (C12797f) a0Var;
        Context e = fVar.mo39638e();
        BaseSectionAdapter.C15328e eVar = (BaseSectionAdapter.C15328e) mo51052n(i);
        ListItemView listItemView = (ListItemView) fVar.itemView;
        listItemView.setTitle(eVar.f47556c);
        listItemView.setSubtitle(eVar.f39650e);
        Button button = (Button) listItemView.getAccessoryView();
        if (eVar.f39651f != null) {
            button.setVisibility(0);
            button.setText(eVar.f39651f);
            button.setOnClickListener(this.f39640j);
            button.setContentDescription(e.getString(R.string.voice_over_tripplan_time, new Object[]{button.getText()}));
            if (eVar.f39649d == BaseSectionAdapter.SectionType.STATIC_TIMES) {
                i2 = R.string.station_view_fixed_timetables_estimated_subtitle;
            } else {
                i2 = R.string.station_view_inactive_lines_future_time_subtitle;
            }
            C15340c cVar = this.f39642l.f39726b;
            if (cVar.f39710o) {
                listItemView.setSubtitle((CharSequence) e.getString(i2, new Object[]{e.getString(R.string.time_filter_last)}));
                return;
            }
            Time time = cVar.f39709n;
            if (time != null) {
                listItemView.setSubtitle((CharSequence) e.getString(i2, new Object[]{C7925b.m18018f(e, time.mo24631g(), false)}));
                return;
            }
            return;
        }
        button.setVisibility(8);
    }

    /* renamed from: x */
    public final RecyclerView.C1119a0 mo23820x(ViewGroup viewGroup, int i) {
        return new C12797f(C13715c.m34239e(viewGroup, R.layout.stop_detail_section_header_default, viewGroup, false));
    }

    /* renamed from: z */
    public final ArrayList mo45895z(Context context, Time time, Map map) {
        Collection<C20787c> collection;
        String str;
        String str2;
        Context context2 = context;
        Time time2 = time;
        Map map2 = map;
        Map map3 = (Map) map2.get(this.f39642l.f39726b.f39711p);
        Map map4 = (Map) map2.get(ArrivalsResponseKey.NOW_BASED_RESPONSE);
        HashSet hashSet = new HashSet(this.f39642l.f39729e.size());
        ArrayList<T> c = C13723g.m34282c(this.f39642l.f39728d, new C19777h(this, 1));
        if (map4 != null) {
            collection = map4.values();
        } else {
            collection = map3.values();
        }
        ArrayList arrayList = new ArrayList();
        for (C20787c cVar : collection) {
            ServerId serverId = cVar.f52456a;
            if (this.f39642l.f39729e.contains(serverId)) {
                DbEntityRef<TransitLine> b = this.f39642l.f39727c.mo24410b(serverId);
                if (b != null) {
                    TransitLine transitLine = b.get();
                    if (!C13717b.m34258e(cVar.f52458c.f23660b) && cVar.f52458c.mo24322B((Time) null)) {
                        ArrayList<T> c2 = C13723g.m34282c(cVar.f52458c.f23660b, new C20603k(4));
                        if (!C13717b.m34258e(c2)) {
                            arrayList.add(new BaseSectionAdapter.C15327d(transitLine, new Schedule(c2, true)));
                            hashSet.add(serverId);
                        }
                    }
                } else {
                    throw new IllegalStateException("Missing line id, " + serverId + ", reference");
                }
            }
        }
        Collections.sort(arrayList, new C16725a(c, Schedule.m17782D()));
        Collection<C20787c> values = map3.values();
        ArrayList arrayList2 = new ArrayList();
        for (C20787c cVar2 : values) {
            ServerId serverId2 = cVar2.f52456a;
            if (this.f39642l.f39729e.contains(serverId2)) {
                DbEntityRef<TransitLine> b2 = this.f39642l.f39727c.mo24410b(serverId2);
                if (b2 != null) {
                    TransitLine transitLine2 = b2.get();
                    if (!C13717b.m34258e(cVar2.f52458c.f23660b) && cVar2.f52458c.mo24322B(time2)) {
                        arrayList2.add(new BaseSectionAdapter.C15327d(transitLine2, new Schedule(C13720d.m34273c(cVar2.f52458c, (C13722f) null, new C17478e(2)), false)));
                        hashSet.add(serverId2);
                    }
                } else {
                    throw new IllegalStateException("Missing line id, " + serverId2 + ", reference");
                }
            }
        }
        if (time2 == null) {
            time2 = Time.m17980k();
        }
        Collections.sort(arrayList2, new C16726b(c, new Schedule.C7799d(time2)));
        ArrayList arrayList3 = new ArrayList(Math.abs(this.f39642l.f39728d.size() - hashSet.size()));
        for (TransitLine next : this.f39642l.f39728d) {
            if (!hashSet.contains(next.f23687c)) {
                arrayList3.add(new BaseSectionAdapter.C15327d(next, Schedule.f23657c));
            }
        }
        Collections.sort(arrayList3, new C20602j(c, 1));
        ArrayList arrayList4 = new ArrayList(3);
        if (!arrayList.isEmpty()) {
            str = null;
            arrayList4.add(new BaseSectionAdapter.C15328e(BaseSectionAdapter.SectionType.REAL_TIMES, context2.getString(R.string.station_view_next_arrivals_title), context2.getString(R.string.station_view_buses_gps_subtitle), (String) null, arrayList, (StopRealTimeCongestion) null));
        } else {
            str = null;
        }
        if (!arrayList2.isEmpty()) {
            arrayList4.add(new BaseSectionAdapter.C15328e(BaseSectionAdapter.SectionType.STATIC_TIMES, context2.getString(R.string.station_view_fixed_timetables_title), context2.getString(R.string.station_view_fixed_timetables_subtitle), context2.getString(R.string.station_view_set_time), arrayList2, (StopRealTimeCongestion) null));
        }
        if (!arrayList3.isEmpty()) {
            BaseSectionAdapter.SectionType sectionType = BaseSectionAdapter.SectionType.NON_ACTIVE;
            String string = context2.getString(R.string.station_view_inactive_lines_title);
            String string2 = context2.getString(R.string.station_view_inactive_lines_subtitle);
            if (arrayList2.isEmpty()) {
                str2 = context2.getString(R.string.station_view_set_time);
            } else {
                str2 = str;
            }
            arrayList4.add(new BaseSectionAdapter.C15328e(sectionType, string, string2, str2, arrayList3, (StopRealTimeCongestion) null));
        }
        return arrayList4;
    }
}
