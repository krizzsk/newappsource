package p687nt;

import a00.C13382a;
import aa0.C7554s;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.C1208m;
import androidx.recyclerview.widget.C1241u;
import androidx.recyclerview.widget.RecyclerView;
import c00.C13717b;
import c20.C13744a;
import ce0.C21100e;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.commons.view.behavior.MyBottomSheetBehavior;
import com.moovit.database.DbEntityRef;
import com.moovit.design.view.AlertMessageView;
import com.moovit.design.view.ImagesOrTextsView;
import com.moovit.image.model.Image;
import com.moovit.image.model.ResourceImage;
import com.moovit.l10n.C16181a;
import com.moovit.l10n.LinePresentationType;
import com.moovit.servicealerts.ServiceStatusCategory;
import com.moovit.transit.Schedule;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitLineGroup;
import com.moovit.transit.TransitStop;
import com.moovit.transit.TransitStopPlatform;
import com.moovit.util.time.Time;
import com.moovit.view.ScheduleView;
import com.moovit.view.TransitLineListItemView;
import com.tranzmate.R;
import g20.C17161i;
import j80.C12775d;
import ja0.C12797f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p297w5.C6996c;
import p435de.C16596f;
import p687nt.C18604l;
import p824tp.C19728f;
import p872vp.C20195b;
import p952yy.C20787c;
import p977zz.C20944i0;
import p977zz.C20964s0;
import x00.C20440a;

/* renamed from: nt.c */
public abstract class C18591c extends RecyclerView.Adapter<C12797f> {

    /* renamed from: l */
    public static final C20440a f47329l = new C20440a((CharSequence) " • ", (String) null);

    /* renamed from: g */
    public final C6996c f47330g = new C6996c(this, 14);

    /* renamed from: h */
    public final ArrayList<C18593b> f47331h = new ArrayList<>();

    /* renamed from: i */
    public final ScheduleView.C7927a f47332i;

    /* renamed from: j */
    public C17161i<C16181a.C16184c, TransitLine> f47333j;

    /* renamed from: k */
    public C18592a f47334k = null;

    /* renamed from: nt.c$a */
    public static class C18592a implements C1241u {

        /* renamed from: a */
        public final RecyclerView f47335a;

        /* renamed from: b */
        public final RecyclerView.Adapter<?> f47336b;

        /* renamed from: c */
        public MyBottomSheetBehavior<?> f47337c = null;

        public C18592a(RecyclerView recyclerView, RecyclerView.Adapter<?> adapter) {
            C21100e.m49373x(recyclerView, "recyclerView");
            this.f47335a = recyclerView;
            C21100e.m49373x(adapter, "adapter");
            this.f47336b = adapter;
        }

        /* renamed from: a */
        public final void mo5011a(int i, int i2) {
            this.f47336b.notifyItemRangeInserted(i, i2);
            mo50987e();
        }

        /* renamed from: b */
        public final void mo5012b(int i, int i2) {
            this.f47336b.notifyItemRangeRemoved(i, i2);
            mo50987e();
        }

        /* renamed from: c */
        public final void mo5013c(int i, int i2, Object obj) {
            this.f47336b.notifyItemRangeChanged(i, i2, obj);
            mo50987e();
        }

        /* renamed from: d */
        public final void mo5014d(int i, int i2) {
            this.f47336b.notifyItemMoved(i, i2);
            mo50987e();
        }

        /* renamed from: e */
        public final void mo50987e() {
            if (this.f47335a.isAttachedToWindow()) {
                if (this.f47337c == null) {
                    this.f47337c = MyBottomSheetBehavior.from((View) this.f47335a.getParent().getParent());
                }
                if (this.f47337c.getState() != 3) {
                    this.f47335a.mo4589e0(0);
                }
            }
        }
    }

    /* renamed from: nt.c$b */
    public static class C18593b {

        /* renamed from: a */
        public final int f47338a;

        /* renamed from: b */
        public final TransitStop f47339b;

        /* renamed from: c */
        public final TransitLine f47340c;

        /* renamed from: d */
        public final C20787c f47341d;

        /* renamed from: e */
        public final int f47342e;

        /* renamed from: f */
        public final boolean f47343f;

        /* renamed from: g */
        public final C12775d f47344g;

        /* renamed from: h */
        public final C20944i0<Integer, Integer> f47345h;

        public C18593b(int i, TransitStop transitStop, TransitLine transitLine, C20787c cVar, int i2, boolean z, C12775d dVar, C20944i0<Integer, Integer> i0Var) {
            this.f47338a = i;
            this.f47339b = transitStop;
            this.f47340c = transitLine;
            this.f47341d = cVar;
            this.f47342e = i2;
            this.f47343f = z;
            this.f47344g = dVar;
            this.f47345h = i0Var;
        }

        /* renamed from: a */
        public static C18593b m45517a(int i, int i2) {
            return new C18593b(1, (TransitStop) null, (TransitLine) null, (C20787c) null, -1, false, (C12775d) null, new C20944i0(Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    public C18591c(C18604l.C18606b bVar) {
        C21100e.m49373x(bVar, "coordinator");
        this.f47332i = bVar;
        this.f47333j = null;
    }

    public final int getItemCount() {
        return this.f47331h.size();
    }

    public final int getItemViewType(int i) {
        return this.f47331h.get(i).f47338a;
    }

    /* renamed from: j */
    public final void mo50986j(List<C18593b> list, C1208m.C1212d dVar) {
        this.f47331h.clear();
        this.f47331h.ensureCapacity(list.size());
        this.f47331h.addAll(list);
        C18592a aVar = this.f47334k;
        if (aVar != null) {
            dVar.mo5103b(aVar);
        } else {
            notifyDataSetChanged();
        }
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f47334k = new C18592a(recyclerView, this);
    }

    public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
        int i2;
        boolean z;
        char c;
        int i3;
        C20440a aVar;
        boolean z2;
        C20440a aVar2;
        int i4;
        String str;
        Schedule schedule;
        String str2;
        int i5 = i;
        C12797f fVar = (C12797f) a0Var;
        int itemViewType = getItemViewType(i5);
        String str3 = null;
        switch (itemViewType) {
            case 1:
                C18593b bVar = this.f47331h.get(i5);
                AlertMessageView alertMessageView = (AlertMessageView) fVar.itemView;
                int intValue = ((Integer) bVar.f47345h.f52692a).intValue();
                if (intValue != 0) {
                    alertMessageView.setImage(intValue);
                }
                int intValue2 = ((Integer) bVar.f47345h.f52693b).intValue();
                if (intValue2 != 0) {
                    alertMessageView.setSubtitle(intValue2);
                    return;
                }
                return;
            case 2:
            case 3:
                C18593b bVar2 = this.f47331h.get(i5);
                Context e = fVar.mo39638e();
                Resources resources = e.getResources();
                C13744a.m34301c((ImageView) fVar.mo39639f(R.id.image), bVar2.f47339b.f23734f, 4);
                View f = fVar.mo39639f(R.id.image_badge);
                if (bVar2.f47343f) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                f.setVisibility(i2);
                String str4 = bVar2.f47339b.f23731c;
                ((TextView) fVar.mo39639f(R.id.name)).setText(str4);
                List<DbEntityRef<TransitLine>> list = bVar2.f47339b.f23735g;
                int size = list.size();
                ArrayList arrayList = new ArrayList(size + 2);
                String str5 = bVar2.f47339b.f23733e;
                if (!C20964s0.m49090h(str5)) {
                    arrayList.add(new C20440a((CharSequence) resources.getString(R.string.android_stop_id, new Object[]{str5}), (String) null));
                }
                if ((1 & bVar2.f47339b.f23745q.f23627b) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (!arrayList.isEmpty()) {
                        arrayList.add(f47329l);
                    }
                    arrayList.add(new C20440a((Image) new ResourceImage(R.drawable.ic_wheelchair_16_on_surface_emphasis_high, new String[0]), (String) null));
                }
                if (bVar2.f47342e > 0) {
                    if (!arrayList.isEmpty()) {
                        arrayList.add(f47329l);
                    }
                    arrayList.add(new C20440a((CharSequence) resources.getString(R.string.walking_minutes, new Object[]{Integer.valueOf(bVar2.f47342e)}), (String) null));
                }
                ArrayList arrayList2 = new ArrayList(size);
                for (DbEntityRef next : list) {
                    TransitLine transitLine = (TransitLine) next.get();
                    if (transitLine == null) {
                        C16596f a = C16596f.m42113a();
                        StringBuilder k = C13555b.m33972k("NearByAdapter line is null, lineId = ");
                        k.append(next.getServerId());
                        k.append(", stopId = ");
                        k.append(bVar2.f47339b.f23730b);
                        k.append(" ");
                        k.append(C13717b.m34269p(list));
                        a.mo49364c(new ApplicationBugException(k.toString()));
                    } else {
                        arrayList2.add(transitLine);
                    }
                }
                C20440a aVar3 = C7554s.f23036a;
                HashSet hashSet = new HashSet(arrayList2.size());
                ArrayList arrayList3 = new ArrayList(arrayList2.size());
                Iterator it = arrayList2.iterator();
                C20440a aVar4 = null;
                while (it.hasNext()) {
                    TransitLine transitLine2 = (TransitLine) it.next();
                    TransitLineGroup transitLineGroup = transitLine2.f23686b;
                    Iterator it2 = it;
                    Image b = transitLineGroup.mo24376b(1, transitLineGroup.f23697e);
                    String l = C20195b.m47768l(transitLine2);
                    if (b != null) {
                        aVar = new C20440a(b, l);
                    } else {
                        aVar = new C20440a((CharSequence) transitLine2.mo24369b().f23697e, l);
                    }
                    if (hashSet.contains(aVar)) {
                        it = it2;
                    } else {
                        if (aVar4 != null) {
                            if (aVar4.f51781a != null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                aVar2 = C7554s.f23036a;
                            } else {
                                aVar2 = C7554s.f23037b;
                            }
                            arrayList3.add(aVar2);
                        }
                        hashSet.add(aVar);
                        arrayList3.add(aVar);
                        it = it2;
                        aVar4 = aVar;
                    }
                }
                if (!arrayList.isEmpty() && !arrayList3.isEmpty()) {
                    arrayList.add(f47329l);
                }
                arrayList.addAll(arrayList3);
                ((ImagesOrTextsView) fVar.mo39639f(R.id.metadata)).setItems(arrayList);
                if (!C13382a.m33671g(e)) {
                    StringBuilder sb = new StringBuilder();
                    if (!C20964s0.m49090h(str4)) {
                        C13382a.m33666b(sb, resources.getString(R.string.voice_over_home_station_name, new Object[]{str4}));
                    }
                    if (!C20964s0.m49090h(str5)) {
                        C13382a.m33666b(sb, str5);
                    }
                    if (z) {
                        C13382a.m33666b(sb, resources.getString(R.string.accessibility_station));
                    }
                    int i6 = bVar2.f47342e;
                    if (i6 > 0) {
                        i3 = 1;
                        c = 0;
                        C13382a.m33666b(sb, resources.getString(R.string.voice_over_home_station_walk, new Object[]{String.valueOf(i6)}));
                    } else {
                        i3 = 1;
                        c = 0;
                    }
                    if (!arrayList3.isEmpty()) {
                        Object[] objArr = new Object[i3];
                        objArr[c] = C20195b.m47767k(arrayList3);
                        C13382a.m33666b(sb, resources.getString(R.string.voice_over_home_station_lines, objArr));
                    }
                    if (bVar2.f47343f) {
                        C13382a.m33666b(sb, resources.getString(R.string.voiceover_favorites_station));
                    }
                    fVar.itemView.setContentDescription(sb);
                }
                fVar.itemView.setOnClickListener(this.f47330g);
                return;
            case 4:
                fVar.itemView.setOnClickListener(this.f47330g);
                return;
            case 5:
                C18593b bVar3 = this.f47331h.get(i5);
                Context e2 = fVar.mo39638e();
                TransitLineListItemView transitLineListItemView = (TransitLineListItemView) fVar.itemView;
                if (this.f47333j == null) {
                    HashSet hashSet2 = C19728f.f50164e;
                    this.f47333j = ((C19728f) e2.getSystemService("metro_context")).mo52082b(LinePresentationType.NEAR_ME);
                }
                transitLineListItemView.mo24765v(this.f47333j, bVar3.f47340c);
                if (bVar3.f47343f) {
                    i4 = R.drawable.ic_star_16_favorite;
                } else {
                    i4 = 0;
                }
                transitLineListItemView.setIconStartDecorationDrawable(i4);
                C12775d dVar = bVar3.f47344g;
                if (dVar == null || !ServiceStatusCategory.IMPORTANT_LEVEL.contains(dVar.f31580b.f23213b)) {
                    transitLineListItemView.setIconTopEndDecorationDrawable(0);
                    str = null;
                } else {
                    transitLineListItemView.setIconTopEndDecorationDrawable(bVar3.f47344g.f31580b.f23213b.getSmallIconResId());
                    str = C13382a.m33667c(e2.getString(R.string.service_alert_line_status), e2.getString(bVar3.f47344g.f31580b.f23213b.getAccessibilityResId()));
                }
                C20787c cVar = bVar3.f47341d;
                if (cVar != null) {
                    schedule = cVar.f52458c;
                } else {
                    schedule = Schedule.f23657c;
                }
                transitLineListItemView.setSchedule(schedule);
                Time m = schedule.mo24326m();
                if (m != null) {
                    str2 = m.f23909j;
                } else {
                    str2 = null;
                }
                if (str2 == null) {
                    TransitStopPlatform c2 = bVar3.f47339b.mo24411c(bVar3.f47340c.f23687c);
                    if (c2 == null || C20964s0.m49090h(c2.f23754b)) {
                        str2 = null;
                    } else {
                        str2 = c2.f23754b;
                    }
                }
                if (str2 != null) {
                    String string = fVar.mo39638e().getString(R.string.pathway_guidance_platform, new Object[]{str2});
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    CharSequence subtitle = transitLineListItemView.getSubtitle();
                    if (!C20964s0.m49090h(subtitle)) {
                        spannableStringBuilder.append(subtitle).append(transitLineListItemView.getResources().getString(R.string.string_list_delimiter_dot));
                    }
                    spannableStringBuilder.append(string);
                    transitLineListItemView.setSubtitle((CharSequence) spannableStringBuilder);
                }
                CharSequence[] charSequenceArr = new CharSequence[3];
                charSequenceArr[0] = transitLineListItemView.getContentDescription();
                charSequenceArr[1] = str;
                if (bVar3.f47343f) {
                    str3 = e2.getString(R.string.voiceover_favorites_line);
                }
                charSequenceArr[2] = str3;
                C13382a.m33674j(transitLineListItemView, charSequenceArr);
                transitLineListItemView.setTag(R.id.transit_line_list_item_view_tag, transitLineListItemView.getContentDescription());
                transitLineListItemView.setOnClickListener(this.f47330g);
                return;
            case 6:
                return;
            default:
                throw new IllegalStateException(C16759e.m42349e("Unknown view type: ", itemViewType));
        }
    }

    public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        TransitLineListItemView transitLineListItemView;
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        switch (i) {
            case 1:
                transitLineListItemView = ((C18604l.C18612h) this).f47416m;
                break;
            case 2:
            case 3:
                transitLineListItemView = from.inflate(R.layout.nearby_stop_list_item, viewGroup, false);
                break;
            case 4:
                transitLineListItemView = from.inflate(R.layout.nearby_stop_link_list_item, viewGroup, false);
                break;
            case 5:
                TransitLineListItemView transitLineListItemView2 = (TransitLineListItemView) from.inflate(R.layout.nearby_line_list_item, viewGroup, false);
                transitLineListItemView2.getScheduleView().setCoordinator(this.f47332i);
                transitLineListItemView = transitLineListItemView2;
                break;
            case 6:
                transitLineListItemView = from.inflate(R.layout.nearby_line_loading_list_item, viewGroup, false);
                break;
            default:
                throw new IllegalStateException(C16759e.m42349e("Unknown view type: ", i));
        }
        C12797f fVar = new C12797f(transitLineListItemView);
        transitLineListItemView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        transitLineListItemView.setTag(fVar);
        return fVar;
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.f47334k = null;
    }
}
