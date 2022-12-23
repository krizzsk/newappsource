package com.moovit.home.lines.search;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.moovit.C14688a;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.design.view.AlertMessageView;
import com.moovit.home.lines.search.C16007c;
import com.moovit.transit.TransitAgency;
import com.moovit.transit.TransitType;
import ja0.C12793c;
import ja0.C12800i;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import n10.C18505b;
import o00.C18671h;
import o00.C18681n;
import p001a0.C0016g;
import p104h2.C5037a;
import p117i2.C5260b;
import p453dw.C16740o;
import p543hq.C17474b;
import p824tp.C19728f;
import p824tp.C19731i;
import p824tp.C19739q;
import p824tp.C19740r;
import p824tp.C19742t;
import p824tp.C19746x;
import p977zz.C20964s0;
import q00.C19047a;
import q00.C19053d;
import z20.C20806a;
import z70.C13337m;

public class SearchLineFragment extends C15682c<MoovitActivity> implements C5037a.C5038a<C16007c.C16008a> {

    /* renamed from: w */
    public static final /* synthetic */ int f41623w = 0;

    /* renamed from: n */
    public final C15993a f41624n = new C15993a();

    /* renamed from: o */
    public final C15994b f41625o = new C15994b(C19742t.general_error_view);

    /* renamed from: p */
    public final C13337m f41626p = new C13337m();

    /* renamed from: q */
    public RecyclerView f41627q;

    /* renamed from: r */
    public TransitType f41628r;

    /* renamed from: s */
    public TransitAgency f41629s;

    /* renamed from: t */
    public String f41630t = "";

    /* renamed from: u */
    public boolean f41631u;

    /* renamed from: v */
    public boolean f41632v;

    /* renamed from: com.moovit.home.lines.search.SearchLineFragment$a */
    public class C15993a extends C16004b {
        public C15993a() {
        }
    }

    /* renamed from: com.moovit.home.lines.search.SearchLineFragment$b */
    public class C15994b extends C18671h {
        public C15994b(int... iArr) {
            super(iArr);
        }

        public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            RecyclerView.C1119a0 onCreateViewHolder = super.onCreateViewHolder(viewGroup, i);
            AlertMessageView alertMessageView = (AlertMessageView) onCreateViewHolder.itemView;
            alertMessageView.setImage(C19739q.img_empty_no_network);
            alertMessageView.setNegativeButtonClickListener(new C16740o(this, 9));
            return onCreateViewHolder;
        }
    }

    /* renamed from: com.moovit.home.lines.search.SearchLineFragment$c */
    public interface C15995c {
        /* renamed from: e0 */
        EmptySearchLineViewFactory mo48147e0();
    }

    public SearchLineFragment() {
        super(MoovitActivity.class);
    }

    /* renamed from: m2 */
    public static String m40738m2(Context context, TransitType transitType, TransitAgency transitAgency) {
        if (transitAgency != null) {
            return context.getString(C19746x.line_search_by_agency_hint, new Object[]{transitAgency.f23673c});
        } else if (transitType == null) {
            return context.getString(C19746x.line_search_hint);
        } else {
            return context.getString(C19746x.line_search_by_transit_hint, new Object[]{context.getString(transitType.f23758c)});
        }
    }

    /* renamed from: n2 */
    public static SearchLineFragment m40739n2(TransitType transitType, boolean z, boolean z2) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("transitType", transitType);
        bundle.putParcelable("agency", (Parcelable) null);
        bundle.putBoolean("showTwitterFeeds", z);
        bundle.putBoolean("showServiceAlerts", z2);
        SearchLineFragment searchLineFragment = new SearchLineFragment();
        searchLineFragment.setArguments(bundle);
        return searchLineFragment;
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        HashSet hashSet = new HashSet(3);
        hashSet.add("METRO_CONTEXT");
        hashSet.add("CONFIGURATION");
        hashSet.add("SEARCH_LINE_FTS");
        return hashSet;
    }

    /* renamed from: W1 */
    public final void mo23788W1(View view) {
        if (this.f40824e) {
            mo48149o2(this.f41630t);
        }
    }

    /* renamed from: X1 */
    public final void mo46787X1(Object obj, String str) {
        if (this.f41627q != null && "SEARCH_LINE_FTS".equals(str)) {
            this.f41627q.mo4627l0(this.f41625o);
        }
    }

    /* renamed from: o2 */
    public final void mo48149o2(String str) {
        this.f41630t = str;
        this.f41626p.mo40229d(str);
        if (this.f40824e && mo46775H1()) {
            C5037a.m12866a(this).mo20760b(this);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = mo46782Q1();
        }
        this.f41628r = (TransitType) bundle.getParcelable("transitType");
        this.f41629s = (TransitAgency) bundle.getParcelable("agency");
        this.f41630t = bundle.getString("searchQuery", this.f41630t);
        this.f41631u = bundle.getBoolean("showTwitterFeeds", false);
        this.f41632v = bundle.getBoolean("showServiceAlerts", false);
    }

    public final C5260b<C16007c.C16008a> onCreateLoader(int i, Bundle bundle) {
        C19731i a = C19731i.m47197a(getContext());
        a.getClass();
        return new C16007c(getContext(), a.mo52085c(((C19728f) mo46776J1("METRO_CONTEXT")).f50165a), ((Integer) ((C19047a) mo46776J1("CONFIGURATION")).mo51505b(C19053d.f48453E)).intValue(), this.f41630t, this.f41628r, this.f41629s, this.f41632v, this.f41631u);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C19742t.search_lines_fragment, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C19740r.recycler_view);
        this.f41627q = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        this.f41627q.setItemAnimator((RecyclerView.C1128j) null);
        RecyclerView recyclerView2 = this.f41627q;
        Context context = recyclerView2.getContext();
        SparseIntArray sparseIntArray = new SparseIntArray(2);
        int i = C19739q.divider_horizontal;
        sparseIntArray.append(3, i);
        sparseIntArray.append(5, i);
        recyclerView2.mo4593g(new C18681n(context, sparseIntArray, false), -1);
        this.f41627q.mo4615h(this.f41626p);
        this.f41627q.setAdapter(new C12793c());
        return inflate;
    }

    public final void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(context, attributeSet, bundle);
        setArguments(new Bundle());
    }

    public final void onLoadFinished(C5260b bVar, Object obj) {
        boolean z;
        C16007c.C16008a aVar = (C16007c.C16008a) obj;
        this.f41624n.mo48164k(aVar);
        this.f41626p.mo40230e(aVar.f41678a, this.f41624n.getItemCount(), Collections.singletonMap(AnalyticsAttributeKey.TRANSIT_TYPE, C0016g.m15E(aVar.f41679b)), (Set<String>) null);
        this.f41624n.getItemCount();
        boolean z2 = false;
        if (C20964s0.m49090h(aVar.f41678a) || this.f41624n.getItemCount() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            RecyclerView recyclerView = this.f41627q;
            EmptySearchLineViewFactory emptySearchLineViewFactory = (EmptySearchLineViewFactory) mo46779N1(C15995c.class, new C18505b(0));
            if (emptySearchLineViewFactory == null) {
                emptySearchLineViewFactory = new DefaultEmptySearchLineViewFactory();
            }
            recyclerView.mo4627l0(new C12800i(emptySearchLineViewFactory.mo45196O1(this, this.f41627q)));
            return;
        }
        if (aVar.f41682e[0] >= 0) {
            z2 = true;
        }
        if (z2) {
            C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
            aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "twitter");
            mo46797j2(aVar2.mo49933a());
        }
        RecyclerView.Adapter adapter = this.f41627q.getAdapter();
        C15993a aVar3 = this.f41624n;
        if (adapter != aVar3) {
            this.f41627q.mo4627l0(aVar3);
        }
    }

    public final void onLoaderReset(C5260b<C16007c.C16008a> bVar) {
        this.f41624n.mo48164k((C16007c.C16008a) null);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("transitType", this.f41628r);
        bundle.putParcelable("agency", this.f41629s);
        bundle.putString("searchQuery", this.f41630t);
        bundle.putBoolean("showTwitterFeeds", this.f41631u);
        bundle.putBoolean("showServiceAlerts", this.f41632v);
    }

    public final void onStart() {
        super.onStart();
        if (mo46775H1()) {
            mo48149o2(this.f41630t);
        }
    }

    public final void onStop() {
        super.onStop();
        if (this.f41626p.f33108b == 0) {
            new C20806a.C20807a("no_lines_found_se").mo52935c();
        }
        mo46797j2(this.f41626p.mo40228c());
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C14688a aVar = this.f40831l;
        if (!aVar.f37345b.contains("SEARCH_LINE_FTS")) {
            throw new IllegalStateException("App data part SEARCH_LINE_FTS has not been declared as a required part");
        } else if (aVar.f37347d.containsKey("SEARCH_LINE_FTS")) {
            this.f41627q.mo4627l0(this.f41625o);
        }
    }

    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        this.f41626p.f33115i = z;
    }
}
