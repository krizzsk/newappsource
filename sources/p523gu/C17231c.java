package p523gu;

import a00.C13382a;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import c00.C13717b;
import c00.C13720d;
import c00.C13722f;
import ce0.C21100e;
import com.google.android.exoplayer2.p052ui.C4054t;
import com.google.android.play.core.assetpacks.C14256d1;
import com.moovit.app.linedetail.p416ui.C15101a;
import com.moovit.commons.geo.BoxE6;
import com.moovit.commons.utils.Color;
import com.moovit.commons.utils.UiUtils;
import com.moovit.commons.utils.collections.CollectionHashMap;
import com.moovit.design.view.list.ListItemView;
import com.moovit.network.model.ServerId;
import com.moovit.transit.C7843b;
import com.moovit.transit.Schedule;
import com.moovit.transit.TransitAgency;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitLineGroup;
import com.moovit.transit.TransitPatternTrips;
import com.moovit.transit.TransitStop;
import com.moovit.transit.TransitType;
import com.moovit.util.time.Time;
import com.moovit.util.time.TimeVehicleLocation;
import com.moovit.view.ScheduleView;
import com.tranzmate.R;
import ja0.C12796e;
import ja0.C12797f;
import ja0.C12799h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import k00.C17988b;
import p233r5.C6253a;
import p241s0.C6302b;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p310x5.C7156a;
import p373au.C13536h;
import p451du.C16721r;
import p684nq.C18583d;
import p824tp.C19738p;
import p924xt.C20603k;
import p952yy.C20787c;
import p977zz.C20975x0;

/* renamed from: gu.c */
public class C17231c extends RecyclerView.Adapter<C12797f> {

    /* renamed from: g */
    public final Context f44537g;

    /* renamed from: h */
    public final LayoutInflater f44538h;

    /* renamed from: i */
    public final TransitLine f44539i;

    /* renamed from: j */
    public final TransitPatternTrips f44540j;

    /* renamed from: k */
    public final SparseArray<Schedule> f44541k = new SparseArray<>();

    /* renamed from: l */
    public final C6302b f44542l = new C6302b();

    /* renamed from: m */
    public final SparseArray<List<Time>> f44543m = new SparseArray<>();

    /* renamed from: n */
    public final ArrayList<Time> f44544n = new ArrayList<>();

    /* renamed from: o */
    public final List<TransitStop> f44545o;

    /* renamed from: p */
    public final C12796e f44546p;

    /* renamed from: q */
    public final ServerId f44547q;

    /* renamed from: r */
    public BoxE6 f44548r;

    /* renamed from: s */
    public final C17233b f44549s;

    /* renamed from: t */
    public final C17232a f44550t;

    /* renamed from: u */
    public TransitStop f44551u;

    /* renamed from: v */
    public int f44552v;

    /* renamed from: w */
    public TransitType.ViewType f44553w;

    /* renamed from: x */
    public final int f44554x;

    /* renamed from: gu.c$a */
    public interface C17232a {
    }

    /* renamed from: gu.c$b */
    public interface C17233b {
        /* renamed from: Z0 */
        Time mo45458Z0();

        /* renamed from: e */
        boolean mo45460e();
    }

    public C17231c(Context context, TransitLine transitLine, List list, TransitPatternTrips transitPatternTrips, ServerId serverId, TransitStop transitStop, C15101a aVar, C15101a aVar2) {
        TransitAgency transitAgency;
        int i;
        Context context2 = context;
        TransitLine transitLine2 = transitLine;
        List list2 = list;
        TransitPatternTrips transitPatternTrips2 = transitPatternTrips;
        TransitStop transitStop2 = transitStop;
        C21100e.m49371w(context);
        this.f44537g = context2;
        this.f44547q = serverId;
        this.f44538h = LayoutInflater.from(context);
        C21100e.m49373x(transitLine2, "lines");
        this.f44539i = transitLine2;
        this.f44540j = transitPatternTrips2;
        C21100e.m49373x(list2, "lineStops");
        this.f44545o = list2;
        this.f44554x = list.size();
        this.f44551u = transitStop2;
        this.f44549s = aVar;
        this.f44550t = aVar2;
        this.f44553w = C7843b.m17878e(transitLine);
        this.f44552v = list2.indexOf(transitStop2);
        TransitLineGroup b = transitLine.mo24369b();
        int i2 = this.f44552v;
        Color a = C7843b.m17874a(context2, b);
        Color b2 = C7843b.m17875b(context2, a);
        Resources resources = context.getResources();
        int i3 = C19738p.line_group_decorator_start_offset;
        int dimensionPixelSize = resources.getDimensionPixelSize(i3);
        Resources resources2 = context.getResources();
        int i4 = C19738p.line_group_decorator_radius;
        this.f44546p = new C12796e(context, i2, dimensionPixelSize, resources2.getDimensionPixelSize(i4), context.getResources().getDimensionPixelSize(C19738p.line_group_decorator_stroke_size), C14256d1.m35491i(0.65f, a.f41007b, Color.f41003g.f41007b), a.f41007b, b2.f41007b);
        TransitLineGroup b3 = transitLine.mo24369b();
        BoxE6 boxE6 = null;
        if (b3 != null) {
            transitAgency = b3.f23696d.get();
        } else {
            transitAgency = null;
        }
        TransitType d = C7843b.m17877d(transitAgency);
        if (d != null) {
            i = d.f23760e.smallIconResId;
        } else {
            i = R.drawable.ic_transit_type_bus_16_on_surface;
        }
        TransitLineGroup b4 = transitLine.mo24369b();
        Drawable b5 = C17988b.m44611b(i, context2);
        C21100e.m49373x(b4, "group");
        C21100e.m49373x(b5, "vehicleIcon");
        Color a2 = C7843b.m17874a(context2, b4);
        Color b6 = C7843b.m17875b(context2, a2);
        Resources resources3 = context.getResources();
        new C12799h(context, resources3.getDimensionPixelSize(i3), resources3.getDimensionPixelSize(i4), a2.f41007b, b5, b6.f41007b, android.graphics.Color.argb(25, 0, 0, 0), resources3.getDimensionPixelSize(C19738p.line_group_vehicle_border_width), resources3.getDimensionPixelSize(C19738p.line_group_vehicle_radius));
        this.f44548r = transitPatternTrips2 != null ? transitPatternTrips2.f23727l : boxE6;
    }

    public final int getItemCount() {
        return this.f44554x;
    }

    public final int getItemViewType(int i) {
        int i2;
        int i3 = this.f44552v;
        TransitType.ViewType viewType = this.f44553w;
        if (viewType == null || viewType == TransitType.ViewType.DEFAULT) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (i2 == 0 || i != i3) {
            return i2 ^ 1;
        }
        return 2;
    }

    /* renamed from: j */
    public Schedule mo49673j(int i, ServerId serverId) {
        return this.f44541k.get(i);
    }

    /* renamed from: k */
    public Schedule mo49674k(int i, ServerId serverId) {
        TransitPatternTrips transitPatternTrips = this.f44540j;
        if (transitPatternTrips != null) {
            return transitPatternTrips.f23725j.get(i);
        }
        return null;
    }

    /* renamed from: l */
    public void mo49675l(CollectionHashMap.ArrayListHashMap arrayListHashMap) {
        ArrayList arrayList = (ArrayList) arrayListHashMap.get(this.f44539i.f23687c);
        if (!C13717b.m34258e(arrayList)) {
            ServerId serverId = this.f44540j.f23717b.f23708b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                CollectionHashMap.ArrayListHashMap arrayListHashMap2 = new CollectionHashMap.ArrayListHashMap();
                Iterator<Time> it2 = ((C20787c) it.next()).f52458c.iterator();
                while (it2.hasNext()) {
                    Time next = it2.next();
                    if (serverId.equals(next.mo24630f())) {
                        arrayListHashMap2.mo47001a(Integer.valueOf(next.f23906g), next);
                        TimeVehicleLocation timeVehicleLocation = next.f23912m;
                        if (timeVehicleLocation != null) {
                            this.f44542l.put(timeVehicleLocation.f23924b, timeVehicleLocation);
                        }
                    }
                }
                for (Map.Entry entry : arrayListHashMap2.entrySet()) {
                    this.f44541k.put(((Integer) entry.getKey()).intValue(), new Schedule((List) entry.getValue(), true));
                }
            }
            mo49794m();
            notifyDataSetChanged();
        }
    }

    /* renamed from: m */
    public final void mo49794m() {
        List<Time> list;
        List<Time> list2;
        List<Time> list3;
        if (this.f44551u != null) {
            ArrayList arrayList = new ArrayList();
            int i = this.f44552v;
            Schedule schedule = this.f44541k.get(i);
            if (schedule != null) {
                list = schedule.mo24327n();
            } else {
                list = Collections.emptyList();
            }
            this.f44544n.clear();
            this.f44544n.ensureCapacity(list.size());
            C17230b bVar = new C17230b(this, 0);
            ArrayList<Time> arrayList2 = this.f44544n;
            C13720d.m34276f(list, (C13722f) null, bVar, arrayList2);
            arrayList.addAll(C13717b.m34260g(3, C13717b.m34265l(arrayList2, new C18583d(3))));
            if (i < this.f44540j.f23717b.mo24389f() - 1) {
                Schedule schedule2 = this.f44541k.get(i);
                if (schedule2 != null) {
                    list2 = schedule2.mo24327n();
                } else {
                    list2 = Collections.emptyList();
                }
                if (!list2.isEmpty()) {
                    Schedule schedule3 = this.f44541k.get(i + 1);
                    if (schedule3 != null) {
                        list3 = schedule3.mo24327n();
                    } else {
                        list3 = Collections.emptyList();
                    }
                    int d = C13717b.m34257d(list3, new C16721r(list2.get(0), 1));
                    if (d != -1) {
                        List<Time> subList = list3.subList(0, d);
                        this.f44544n.clear();
                        this.f44544n.ensureCapacity(subList.size());
                        C17230b bVar2 = new C17230b(this, 0);
                        ArrayList<Time> arrayList3 = this.f44544n;
                        C13720d.m34276f(subList, (C13722f) null, bVar2, arrayList3);
                        Collections.reverse(arrayList3);
                        arrayList.addAll(C13717b.m34260g(3, C13717b.m34265l(arrayList3, new C20603k(1))));
                    }
                }
            }
            this.f44543m.put(i, arrayList);
        }
    }

    public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
        Schedule schedule;
        int i2;
        C12797f fVar = (C12797f) a0Var;
        ListItemView listItemView = (ListItemView) fVar.mo39639f(R.id.item);
        View f = fVar.mo39639f(R.id.stop_details);
        View f2 = fVar.mo39639f(R.id.stop_schedule);
        TransitStop transitStop = this.f44545o.get(i);
        if (C20975x0.m49118e(transitStop.f23730b, this.f44547q)) {
            listItemView.setSubtitle((int) R.string.line_nearby_station);
        } else {
            listItemView.setSubtitle(0);
        }
        listItemView.setTitle((CharSequence) transitStop.f23731c);
        listItemView.setContentDescription(C13382a.m33667c(this.f44537g.getString(R.string.voice_over_lineview_station_name, new Object[]{listItemView.getTitle()}), listItemView.getSubtitle()));
        View accessoryView = listItemView.getAccessoryView();
        if (accessoryView != null) {
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            C6333d0.C6337d.m15059s(accessoryView, 1);
        }
        if (fVar.getItemViewType() == 2) {
            ServerId serverId = this.f44545o.get(i).f23730b;
            ScheduleView scheduleView = (ScheduleView) fVar.mo39639f(R.id.time);
            Schedule k = mo49674k(i, serverId);
            if (this.f44549s.mo45460e()) {
                schedule = null;
            } else {
                schedule = mo49673j(i, serverId);
            }
            if (schedule != null) {
                k = schedule;
            }
            Time Z0 = this.f44549s.mo45458Z0();
            scheduleView.getClass();
            C21100e.m49373x(k, "schedule");
            scheduleView.f23972d = k;
            scheduleView.setBaseTime(Z0);
            C13382a.m33674j(listItemView, C13382a.m33667c(listItemView.getContentDescription(), listItemView.getSubtitle()), scheduleView.getContentDescription());
            if (i == this.f44554x - 1) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            UiUtils.m40238F(i2, f, f2);
            f.setOnClickListener(new C7156a(3, this, fVar));
            f2.setOnClickListener(new C6253a(1, this, fVar, scheduleView));
        } else if (fVar.getItemViewType() == 1) {
            listItemView.setAccessoryDrawable((int) R.drawable.ic_arrow_end_12_on_surface_emphasis_low);
            fVar.itemView.setOnClickListener(new C4054t(5, this, fVar));
        } else {
            fVar.itemView.setOnClickListener(new C13536h(1, this, fVar));
        }
    }

    public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        boolean z;
        int i2;
        if (i == 2) {
            z = true;
        } else {
            z = false;
        }
        LayoutInflater layoutInflater = this.f44538h;
        if (z) {
            i2 = R.layout.line_detail_stop_schedule_view;
        } else {
            i2 = R.layout.line_detail_stop_view;
        }
        View inflate = layoutInflater.inflate(i2, viewGroup, false);
        inflate.setActivated(z);
        return new C12797f(inflate);
    }

    public final void onViewRecycled(RecyclerView.C1119a0 a0Var) {
        C12797f fVar = (C12797f) a0Var;
        if (fVar.getItemViewType() == 2 && fVar.getAdapterPosition() != this.f44552v) {
            ((ViewGroup) fVar.itemView).setLayoutTransition((LayoutTransition) null);
        }
    }
}
