package com.moovit.app.stopdetail;

import a00.C13382a;
import aa0.C7554s;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c00.C13723g;
import com.moovit.app.stopdetail.BaseSectionAdapter;
import com.moovit.app.stopdetail.C15340c;
import com.moovit.commons.utils.C15780a;
import com.moovit.commons.utils.UiUtils;
import com.moovit.commons.utils.collections.CollectionHashMap;
import com.moovit.design.view.list.ListItemView;
import com.moovit.transit.Schedule;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitStopPlatform;
import com.moovit.util.time.C7925b;
import com.moovit.util.time.CongestionLevel;
import com.moovit.util.time.StopRealTimeCongestion;
import com.moovit.util.time.StopRealTimeInformation;
import com.moovit.util.time.Time;
import com.moovit.view.TransitLineListItemView;
import com.tranzmate.R;
import ja0.C12797f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import k00.C17988b;
import o00.C18676l;
import p241s0.C6302b;
import p453dw.C16727c;
import p732pq.C18947h;
import p824tp.C19735m;
import p824tp.C19739q;
import p824tp.C19746x;
import p952yy.C20787c;
import p977zz.C20941h;
import p977zz.C20944i0;
import x00.C20440a;

/* renamed from: com.moovit.app.stopdetail.b */
public final class C15339b extends BaseSectionAdapter {
    public C15339b(C15340c.C15350j jVar) {
        super(jVar);
    }

    /* renamed from: B */
    public final boolean mo45888B(int i) {
        return i == 22 || i == 23;
    }

    /* renamed from: m */
    public final int mo40090m(int i, int i2) {
        C18676l.C18679c n = mo51052n(i);
        BaseSectionAdapter.C15327d dVar = (BaseSectionAdapter.C15327d) n.getItem(i2);
        if (i2 == n.mo40089e() - 1) {
            if (mo45887A(dVar)) {
                return 23;
            }
            return 21;
        } else if (mo45887A(dVar)) {
            return 22;
        } else {
            return 20;
        }
    }

    /* renamed from: p */
    public final int mo23815p(int i) {
        return 1;
    }

    /* renamed from: r */
    public final boolean mo40091r(int i) {
        switch (i) {
            case 20:
            case 21:
            case 22:
            case 23:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: s */
    public final boolean mo23816s(int i) {
        return i == 1;
    }

    /* renamed from: t */
    public final void mo23817t(RecyclerView.C1119a0 a0Var, int i, int i2) {
        C12797f fVar = (C12797f) a0Var;
        if (((BaseSectionAdapter.C15327d) ((BaseSectionAdapter.C15328e) mo51052n(i)).get(i2)) == null) {
            TransitLineListItemView transitLineListItemView = (TransitLineListItemView) fVar.mo39639f(R.id.item);
            transitLineListItemView.setIcon((int) R.drawable.ic_clock_16_on_surface_emphasis_low);
            transitLineListItemView.setTitle((int) R.string.no_available_subway);
            fVar.mo39639f(R.id.last_arrival).setVisibility(8);
            return;
        }
        super.mo45889C(fVar, i, i2);
    }

    /* renamed from: v */
    public final void mo23818v(RecyclerView.C1119a0 a0Var, int i) {
        long j;
        boolean z;
        int i2;
        int i3;
        C12797f fVar = (C12797f) a0Var;
        BaseSectionAdapter.C15328e eVar = (BaseSectionAdapter.C15328e) mo51052n(i);
        ((ListItemView) fVar.mo39639f(R.id.header)).setTitle(eVar.f47556c);
        StopRealTimeCongestion stopRealTimeCongestion = eVar.f39652g;
        if (stopRealTimeCongestion != null) {
            j = C7925b.m18026n(stopRealTimeCongestion.f23895d, System.currentTimeMillis());
        } else {
            j = Long.MAX_VALUE;
        }
        if (j < 0 || j > 10) {
            z = true;
        } else {
            z = false;
        }
        TextView textView = (TextView) fVar.mo39639f(R.id.status);
        if (z) {
            textView.setVisibility(8);
            return;
        }
        CongestionLevel congestionLevel = stopRealTimeCongestion.f23893b;
        C20440a aVar = C7554s.f23036a;
        switch (C7554s.C7555a.f23038a[congestionLevel.ordinal()]) {
            case 1:
                i2 = C19739q.ic_crowded_empty_16_on_surface_emphasis_medium;
                i3 = C19746x.crowdedness_empty;
                break;
            case 2:
            case 3:
                i2 = C19739q.ic_crowded_low_16_on_surface_emphasis_medium;
                i3 = C19746x.crowdedness_half_full;
                break;
            case 4:
            case 5:
                i2 = C19739q.ic_crowded_medium_16_on_surface_emphasis_medium;
                i3 = C19746x.crowdedness_full;
                break;
            case 6:
            case 7:
                i2 = C19739q.ic_crowded_high_16_on_surface_emphasis_medium;
                i3 = C19746x.crowdedness_packed;
                break;
            default:
                i2 = 0;
                i3 = 0;
                break;
        }
        C15780a.m40271d(textView, UiUtils.Edge.LEFT, C17988b.m44611b(i2, textView.getContext()));
        textView.setText(i3);
        textView.setTextColor(C20941h.m49043f(C19735m.colorOnSurfaceEmphasisMedium, textView.getContext()));
        C13382a.m33674j(textView, textView.getContext().getString(C19746x.voiceover_platform_crowdedness, new Object[]{textView.getText()}));
        textView.setVisibility(0);
    }

    /* renamed from: x */
    public final RecyclerView.C1119a0 mo23820x(ViewGroup viewGroup, int i) {
        return new C12797f(C13715c.m34239e(viewGroup, R.layout.stop_detail_section_header_platform, viewGroup, false));
    }

    /* renamed from: z */
    public final ArrayList mo45895z(Context context, Time time, Map map) {
        CollectionHashMap.ArrayListHashMap arrayListHashMap = new CollectionHashMap.ArrayListHashMap();
        CollectionHashMap.ArrayListHashMap arrayListHashMap2 = new CollectionHashMap.ArrayListHashMap();
        C6302b bVar = new C6302b();
        List<TransitStopPlatform> list = this.f39642l.f39727c.f23741m;
        ArrayList arrayList = new ArrayList(list.size());
        for (TransitStopPlatform next : list) {
            ArrayList<T> c = C13723g.m34282c(next.f23755c, new C18947h(this, 1));
            if (!c.isEmpty()) {
                String str = next.f23754b;
                StopRealTimeCongestion stopRealTimeCongestion = null;
                for (T t : c) {
                    C20787c cVar = (C20787c) ((Map) map.get(this.f39642l.f39726b.f39711p)).get(t.getServerId());
                    if (cVar != null) {
                        if (cVar.f52458c.mo24322B((Time) null)) {
                            arrayListHashMap.mo47002b((TransitLine) t.get(), cVar.f52458c.f23660b);
                        }
                        StopRealTimeInformation stopRealTimeInformation = cVar.f52459d;
                        if (stopRealTimeInformation != null) {
                            stopRealTimeCongestion = stopRealTimeInformation.f23898b.get(str);
                        }
                    }
                }
                Map map2 = map;
                BaseSectionAdapter.C15328e eVar = new BaseSectionAdapter.C15328e(BaseSectionAdapter.SectionType.NO_TYPE, context.getString(R.string.pathway_guidance_platform, new Object[]{str}), (String) null, (String) null, (ArrayList) null, stopRealTimeCongestion);
                if (arrayListHashMap.isEmpty()) {
                    eVar.add(null);
                } else {
                    for (Map.Entry entry : arrayListHashMap.entrySet()) {
                        TransitLine transitLine = (TransitLine) entry.getKey();
                        C20944i0 i0Var = new C20944i0(transitLine.mo24369b(), transitLine.f23689e);
                        arrayListHashMap2.mo47002b(i0Var, (List) entry.getValue());
                        if (!bVar.containsKey(i0Var)) {
                            bVar.put(i0Var, transitLine);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(arrayListHashMap2.size());
                    for (C20944i0 i0Var2 : arrayListHashMap2.keySet()) {
                        arrayList2.add(new BaseSectionAdapter.C15327d((TransitLine) bVar.getOrDefault(i0Var2, null), new Schedule((List) arrayListHashMap2.get(i0Var2), false)));
                    }
                    Collections.sort(arrayList2, new C16727c(Schedule.m17782D()));
                    eVar.addAll(arrayList2);
                }
                arrayList.add(eVar);
                arrayListHashMap.clear();
                arrayListHashMap2.clear();
                bVar.clear();
            }
        }
        return arrayList;
    }
}
