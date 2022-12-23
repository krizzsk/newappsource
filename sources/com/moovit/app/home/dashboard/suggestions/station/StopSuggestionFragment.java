package com.moovit.app.home.dashboard.suggestions.station;

import aa0.C7530f;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.TextAppearanceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.C1021l0;
import androidx.lifecycle.C1043v;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bf0.C21049c;
import cf0.C21139m;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.C15682c;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.home.HomeActivity;
import com.moovit.app.useraccount.manager.UserAccountManager;
import com.moovit.design.view.list.ListItemView;
import com.moovit.l10n.LinePresentationType;
import com.moovit.transit.Schedule;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitStop;
import com.moovit.util.DistanceUtils;
import com.moovit.view.ScheduleView;
import com.moovit.view.TransitLineListItemView;
import com.tranzmate.R;
import ja0.C12797f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.C23812a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import mf0.C24362h;
import mf0.C24365j;
import o00.C18665b;
import p039c7.C1800c;
import p314xa.C7191i;
import p455dy.C16753e;
import p474et.C16877i;
import p496fr.C17064a;
import p543hq.C17474b;
import p609km.C18097c;
import p824tp.C19728f;
import p977zz.C20936e0;
import p977zz.C20944i0;
import p977zz.C20964s0;
import q00.C19047a;
import q00.C19053d;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, mo59060d2 = {"Lcom/moovit/app/home/dashboard/suggestions/station/StopSuggestionFragment;", "Lcom/moovit/c;", "Lcom/moovit/app/home/HomeActivity;", "<init>", "()V", "a", "App_moovitWorldRelease"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class StopSuggestionFragment extends C15682c<HomeActivity> {

    /* renamed from: s */
    public static final /* synthetic */ int f38338s = 0;

    /* renamed from: n */
    public final C1021l0 f38339n;

    /* renamed from: o */
    public final C21049c f38340o = C23812a.m58432b(new StopSuggestionFragment$stop$2(this));

    /* renamed from: p */
    public final C14981b f38341p = new C14981b(this);

    /* renamed from: q */
    public C16753e f38342q;

    /* renamed from: r */
    public C14980a f38343r;

    /* renamed from: com.moovit.app.home.dashboard.suggestions.station.StopSuggestionFragment$a */
    public final class C14980a extends RecyclerView.Adapter<C12797f> {

        /* renamed from: g */
        public List<C20944i0<TransitLine, Schedule>> f38344g = new ArrayList();

        public C14980a() {
        }

        public final int getItemCount() {
            int[] iArr = {this.f38344g.size(), 2};
            int i = C20936e0.f52684d;
            int i2 = Integer.MAX_VALUE;
            for (int i3 = 0; i3 < 2; i3++) {
                i2 = Math.min(i2, iArr[i3]);
            }
            return i2;
        }

        public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
            boolean z;
            C12797f fVar = (C12797f) a0Var;
            C24362h.m61211f(fVar, "holder");
            View view = fVar.itemView;
            C24362h.m61210e(view, "holder.getItemView()");
            TransitLineListItemView transitLineListItemView = (TransitLineListItemView) view;
            TransitLine transitLine = (TransitLine) this.f38344g.get(i).f52692a;
            transitLineListItemView.mo24765v(C19728f.m47195a(fVar.mo39638e()).mo52082b(LinePresentationType.STOP_DETAIL), transitLine);
            transitLineListItemView.setSchedule((Schedule) this.f38344g.get(i).f52693b);
            transitLineListItemView.getScheduleView().setCoordinator(StopSuggestionFragment.this.f38341p);
            int i2 = 0;
            if (StopSuggestionFragment.this.mo46775H1()) {
                C16753e eVar = StopSuggestionFragment.this.f38342q;
                if (eVar != null) {
                    z = eVar.mo49441p(transitLine.mo24369b().f23694b);
                } else {
                    C24362h.m61217l("favoritesManager");
                    throw null;
                }
            } else {
                z = false;
            }
            if (z) {
                i2 = R.drawable.ic_star_12_favorite;
            }
            transitLineListItemView.setIconStartDecorationDrawable(i2);
            transitLineListItemView.setOnClickListener(new C17064a(3, this, transitLine));
        }

        public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            C24362h.m61211f(viewGroup, "parent");
            return new C12797f(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.suggestions_stop_transit_line_item, viewGroup, false));
        }
    }

    /* renamed from: com.moovit.app.home.dashboard.suggestions.station.StopSuggestionFragment$b */
    public static final class C14981b extends ScheduleView.C7927a {

        /* renamed from: c */
        public final /* synthetic */ StopSuggestionFragment f38346c;

        public C14981b(StopSuggestionFragment stopSuggestionFragment) {
            this.f38346c = stopSuggestionFragment;
        }

        /* renamed from: a */
        public final void mo24745a() {
            Object obj;
            C14980a aVar = this.f38346c.f38343r;
            if (aVar != null) {
                List<C20944i0<TransitLine, Schedule>> list = aVar.f38344g;
                StopSuggestionFragment stopSuggestionFragment = StopSuggestionFragment.this;
                int i = StopSuggestionFragment.f38338s;
                stopSuggestionFragment.getClass();
                Schedule.C7799d D = Schedule.m17782D();
                if (stopSuggestionFragment.mo46775H1()) {
                    obj = new StopSuggestionFragment$getNextArrivalComparator$1(stopSuggestionFragment, D);
                } else {
                    obj = new StopSuggestionFragment$getNextArrivalComparator$2(D);
                }
                C21139m.m49437Y(list, new C7191i(obj, 1));
                aVar.notifyDataSetChanged();
                return;
            }
            C24362h.m61217l("adapter");
            throw null;
        }
    }

    public StopSuggestionFragment() {
        super(HomeActivity.class);
        C21049c a = C23812a.m58431a(LazyThreadSafetyMode.NONE, new StopSuggestionFragment$special$$inlined$viewModels$default$2(new StopSuggestionFragment$special$$inlined$viewModels$default$1(this)));
        this.f38339n = C18097c.m44768b(this, C24365j.m61219a(StopSuggestionViewModel.class), new StopSuggestionFragment$special$$inlined$viewModels$default$3(a), new StopSuggestionFragment$special$$inlined$viewModels$default$4(a), new StopSuggestionFragment$special$$inlined$viewModels$default$5(this, a));
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        HashSet hashSet = new HashSet(2);
        hashSet.add("CONFIGURATION");
        hashSet.add("USER_ACCOUNT");
        return hashSet;
    }

    /* renamed from: V1 */
    public final void mo40555V1() {
        super.mo40555V1();
        this.f38342q = ((UserAccountManager) mo46776J1("USER_ACCOUNT")).mo46573d();
    }

    /* renamed from: m2 */
    public final TransitStop mo45186m2() {
        return (TransitStop) this.f38340o.getValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C24362h.m61211f(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.suggestions_stop_fragment, viewGroup, false);
    }

    public final void onResume() {
        super.onResume();
        Bundle requireArguments = requireArguments();
        C24362h.m61210e(requireArguments, "requireArguments()");
        String string = requireArguments.getString("source");
        int i = requireArguments.getInt("index");
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "suggestions_data_type_station");
        aVar.mo49939g(AnalyticsAttributeKey.SOURCE, string);
        aVar.mo49934b(AnalyticsAttributeKey.DISTANCE, C7530f.m17271d(requireContext(), mo45186m2().f23732d));
        aVar.mo49935c(AnalyticsAttributeKey.SELECTED_INDEX, i);
        mo46797j2(aVar.mo49933a());
        StopSuggestionViewModel stopSuggestionViewModel = (StopSuggestionViewModel) this.f38339n.getValue();
        C1043v vVar = (C1043v) stopSuggestionViewModel.f38347c.getValue();
        TransitStop transitStop = (TransitStop) ((C1043v) stopSuggestionViewModel.f38347c.getValue()).getValue();
        if (transitStop != null) {
            vVar.setValue(transitStop);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        Object obj;
        int i;
        int i2;
        C24362h.m61211f(view, Promotion.ACTION_VIEW);
        Bundle arguments = getArguments();
        if (arguments != null) {
            obj = arguments.get("isFavorite");
        } else {
            obj = null;
        }
        C24362h.m61209d(obj, "null cannot be cast to non-null type kotlin.Boolean");
        boolean booleanValue = ((Boolean) obj).booleanValue();
        View findViewById = view.findViewById(R.id.header);
        C24362h.m61210e(findViewById, "view.findViewById(R.id.header)");
        TextView textView = (TextView) findViewById;
        if (booleanValue) {
            i = R.string.smart_component_favorite_station;
        } else {
            i = R.string.smart_component_nearest_station;
        }
        textView.setText(i);
        View findViewById2 = view.findViewById(R.id.line_view);
        C24362h.m61210e(findViewById2, "view.findViewById(R.id.line_view)");
        ListItemView listItemView = (ListItemView) findViewById2;
        listItemView.setTitle((CharSequence) mo45186m2().f23731c);
        listItemView.setIcon(mo45186m2().f23734f);
        if (booleanValue) {
            i2 = R.drawable.ic_star_12_favorite;
        } else {
            i2 = 0;
        }
        listItemView.setIconTopStartDecorationDrawable(i2);
        listItemView.setOnClickListener(new C1800c(this, 6));
        View findViewById3 = view.findViewById(R.id.recycler_view);
        C24362h.m61210e(findViewById3, "view.findViewById(R.id.recycler_view)");
        RecyclerView recyclerView = (RecyclerView) findViewById3;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.mo4593g(new C18665b(requireContext(), R.drawable.divider_horizontal), -1);
        C14980a aVar = new C14980a();
        this.f38343r = aVar;
        recyclerView.setAdapter(aVar);
        Context requireContext = requireContext();
        C24362h.m61210e(requireContext, "requireContext()");
        float max = Math.max(BitmapDescriptorFactory.HUE_RED, C7530f.m17271d(requireContext, mo45186m2().f23732d));
        String a = DistanceUtils.m17934a((int) DistanceUtils.m17936c(requireContext, max), requireContext);
        Object b = ((C19047a) mo46776J1("CONFIGURATION")).mo51505b(C19053d.f48482u);
        C24362h.m61210e(b, "configuration[AppSysConfig.WALKING_SPEED_FACTOR]");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TextAppearanceSpan b2 = C20964s0.m49084b(requireContext(), R.attr.textAppearanceCaption, R.attr.colorOnSurfaceEmphasisHigh);
        spannableStringBuilder.append(a);
        spannableStringBuilder.append(getString(R.string.string_list_delimiter_dot), b2, 33);
        spannableStringBuilder.append(getString(R.string.walking_minutes, Integer.valueOf((int) ((float) Math.ceil((double) ((max / ((Number) b).floatValue()) / 60.0f))))));
        View findViewById4 = view.findViewById(R.id.line_view);
        C24362h.m61210e(findViewById4, "viewById(view, R.id.line_view)");
        ((ListItemView) findViewById4).setSubtitle((CharSequence) spannableStringBuilder);
        StopSuggestionViewModel stopSuggestionViewModel = (StopSuggestionViewModel) this.f38339n.getValue();
        TransitStop m2 = mo45186m2();
        stopSuggestionViewModel.getClass();
        C24362h.m61211f(m2, "stop");
        ((C1043v) stopSuggestionViewModel.f38347c.getValue()).setValue(m2);
        ((StopSuggestionViewModel) this.f38339n.getValue()).f38349e.observe(getViewLifecycleOwner(), new C16877i(new StopSuggestionFragment$onViewCreated$1(this), 1));
    }
}
