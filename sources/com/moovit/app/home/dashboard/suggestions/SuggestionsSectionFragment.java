package com.moovit.app.home.dashboard.suggestions;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1021l0;
import androidx.recyclerview.widget.C1208m;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import bf0.C21049c;
import com.google.android.exoplayer2.p052ui.C4051q;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.moovit.C15682c;
import com.moovit.app.home.HomeActivity;
import com.moovit.commons.utils.C15780a;
import com.moovit.commons.utils.UiUtils;
import com.tranzmate.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.C23812a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C23816b;
import kotlin.collections.EmptyList;
import mf0.C24362h;
import mf0.C24365j;
import p389bl.C13637c;
import p474et.C16872d;
import p474et.C16877i;
import p474et.C16878j;
import p474et.C16879k;
import p609km.C18097c;
import p648me.relex.circleindicator.CircleIndicator3;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, mo59060d2 = {"Lcom/moovit/app/home/dashboard/suggestions/SuggestionsSectionFragment;", "Lcom/moovit/c;", "Lcom/moovit/app/home/HomeActivity;", "<init>", "()V", "a", "b", "App_moovitWorldRelease"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class SuggestionsSectionFragment extends C15682c<HomeActivity> {

    /* renamed from: w */
    public static final /* synthetic */ int f38283w = 0;

    /* renamed from: n */
    public final C1021l0 f38284n;

    /* renamed from: o */
    public final C14962d f38285o = new C14962d(this);

    /* renamed from: p */
    public final C14961c f38286p = new C14961c(this);

    /* renamed from: q */
    public boolean f38287q;

    /* renamed from: r */
    public boolean f38288r;

    /* renamed from: s */
    public ViewGroup f38289s;

    /* renamed from: t */
    public C14959a f38290t;

    /* renamed from: u */
    public ViewPager2 f38291u;

    /* renamed from: v */
    public CircleIndicator3 f38292v;

    /* renamed from: com.moovit.app.home.dashboard.suggestions.SuggestionsSectionFragment$a */
    public static final class C14959a extends FragmentStateAdapter {

        /* renamed from: o */
        public List<? extends C16872d> f38293o = EmptyList.f60173b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14959a(SuggestionsSectionFragment suggestionsSectionFragment) {
            super(suggestionsSectionFragment.getChildFragmentManager(), suggestionsSectionFragment.getLifecycle());
            C24362h.m61211f(suggestionsSectionFragment, "fragment");
        }

        public final int getItemCount() {
            return this.f38293o.size();
        }

        public final long getItemId(int i) {
            return ((C16872d) this.f38293o.get(i)).f43884b.getMostSignificantBits();
        }

        /* renamed from: k */
        public final boolean mo5594k(long j) {
            T t;
            boolean z;
            Iterator<T> it = this.f38293o.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (((C16872d) t).f43884b.getMostSignificantBits() == j) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            if (t != null) {
                return true;
            }
            return false;
        }

        /* renamed from: l */
        public final Fragment mo5595l(int i) {
            return ((C16872d) this.f38293o.get(i)).mo49530a(i);
        }
    }

    /* renamed from: com.moovit.app.home.dashboard.suggestions.SuggestionsSectionFragment$b */
    public static final class C14960b extends C1208m.C1210b {

        /* renamed from: a */
        public final List<C16872d> f38294a;

        /* renamed from: b */
        public final List<C16872d> f38295b;

        public C14960b(List<? extends C16872d> list, List<? extends C16872d> list2) {
            C24362h.m61211f(list, "oldList");
            this.f38294a = list;
            this.f38295b = list2;
        }

        public final boolean areContentsTheSame(int i, int i2) {
            return C24362h.m61206a(this.f38294a.get(i).f43884b, this.f38295b.get(i2).f43884b);
        }

        public final boolean areItemsTheSame(int i, int i2) {
            return C24362h.m61206a(this.f38294a.get(i).f43884b, this.f38295b.get(i2).f43884b);
        }

        public final int getNewListSize() {
            return this.f38295b.size();
        }

        public final int getOldListSize() {
            return this.f38294a.size();
        }
    }

    /* renamed from: com.moovit.app.home.dashboard.suggestions.SuggestionsSectionFragment$c */
    public static final class C14961c extends RecyclerView.C1133l {

        /* renamed from: b */
        public final /* synthetic */ SuggestionsSectionFragment f38296b;

        public C14961c(SuggestionsSectionFragment suggestionsSectionFragment) {
            this.f38296b = suggestionsSectionFragment;
        }

        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1152x xVar) {
            C24362h.m61211f(rect, "outRect");
            C24362h.m61211f(view, Promotion.ACTION_VIEW);
            C24362h.m61211f(recyclerView, "parent");
            C24362h.m61211f(xVar, "state");
            int g = UiUtils.m40248g(this.f38296b.requireContext(), 8.0f);
            int I = RecyclerView.m3000I(view);
            if (I == 0) {
                rect.right = g;
            } else if (I == xVar.mo4935b() - 1) {
                rect.left = g;
            } else {
                rect.right = g;
                rect.left = g;
            }
        }
    }

    /* renamed from: com.moovit.app.home.dashboard.suggestions.SuggestionsSectionFragment$d */
    public static final class C14962d extends RecyclerView.C1133l {

        /* renamed from: b */
        public final /* synthetic */ SuggestionsSectionFragment f38297b;

        public C14962d(SuggestionsSectionFragment suggestionsSectionFragment) {
            this.f38297b = suggestionsSectionFragment;
        }

        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1152x xVar) {
            C24362h.m61211f(rect, "outRect");
            C24362h.m61211f(view, Promotion.ACTION_VIEW);
            C24362h.m61211f(recyclerView, "parent");
            C24362h.m61211f(xVar, "state");
            int g = UiUtils.m40248g(this.f38297b.requireContext(), 8.0f);
            int I = RecyclerView.m3000I(view);
            if (I == 0) {
                rect.left = g;
            } else if (I == xVar.mo4935b() - 1) {
                rect.right = g;
            } else {
                rect.right = g;
                rect.left = g;
            }
        }
    }

    public SuggestionsSectionFragment() {
        super(HomeActivity.class);
        C21049c a = C23812a.m58431a(LazyThreadSafetyMode.NONE, new SuggestionsSectionFragment$special$$inlined$viewModels$default$2(new SuggestionsSectionFragment$special$$inlined$viewModels$default$1(this)));
        this.f38284n = C18097c.m44768b(this, C24365j.m61219a(SuggestionsSectionViewModel.class), new SuggestionsSectionFragment$special$$inlined$viewModels$default$3(a), new SuggestionsSectionFragment$special$$inlined$viewModels$default$4(a), new SuggestionsSectionFragment$special$$inlined$viewModels$default$5(this, a));
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(C13637c.m34083z(1));
        C23816b.m58450f1(linkedHashSet, new String[]{"LATEST_ITINERARY_CONTROLLER"});
        return linkedHashSet;
    }

    /* renamed from: V1 */
    public final void mo40555V1() {
        super.mo40555V1();
        mo45163m2().mo45164c(false);
    }

    /* renamed from: m2 */
    public final SuggestionsSectionViewModel mo45163m2() {
        return (SuggestionsSectionViewModel) this.f38284n.getValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C24362h.m61211f(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.suggestions_section_fragment, viewGroup, false);
    }

    public final void onStart() {
        super.onStart();
        if (mo46775H1()) {
            mo45163m2().mo45164c(false);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        RecyclerView.C1133l lVar;
        C24362h.m61211f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.container);
        C24362h.m61210e(findViewById, "view.findViewById(R.id.container)");
        this.f38289s = (ViewGroup) findViewById;
        this.f38287q = C15780a.m40268a(requireContext());
        View findViewById2 = view.findViewById(R.id.view_pager);
        C24362h.m61210e(findViewById2, "view.findViewById(R.id.view_pager)");
        ViewPager2 viewPager2 = (ViewPager2) findViewById2;
        this.f38291u = viewPager2;
        viewPager2.setLayoutDirection(this.f38287q ? 1 : 0);
        ViewPager2 viewPager22 = this.f38291u;
        if (viewPager22 != null) {
            int i = 1;
            viewPager22.setOffscreenPageLimit(1);
            ViewPager2 viewPager23 = this.f38291u;
            if (viewPager23 != null) {
                viewPager23.setClipChildren(false);
                ViewPager2 viewPager24 = this.f38291u;
                if (viewPager24 != null) {
                    viewPager24.setClipToPadding(false);
                    ViewPager2 viewPager25 = this.f38291u;
                    if (viewPager25 != null) {
                        if (this.f38287q) {
                            lVar = this.f38285o;
                        } else {
                            lVar = this.f38286p;
                        }
                        viewPager25.f5074k.mo4593g(lVar, -1);
                        ViewPager2 viewPager26 = this.f38291u;
                        if (viewPager26 != null) {
                            int g = UiUtils.m40248g(requireContext(), 16.0f) + UiUtils.m40248g(requireContext(), 4.0f);
                            if (!this.f38287q) {
                                i = -1;
                            }
                            viewPager26.setPageTransformer(new C16879k(i, g));
                            C14959a aVar = new C14959a(this);
                            this.f38290t = aVar;
                            ViewPager2 viewPager27 = this.f38291u;
                            if (viewPager27 != null) {
                                viewPager27.setAdapter(aVar);
                                View findViewById3 = view.findViewById(R.id.dot_indicator);
                                C24362h.m61210e(findViewById3, "view.findViewById(R.id.dot_indicator)");
                                CircleIndicator3 circleIndicator3 = (CircleIndicator3) findViewById3;
                                this.f38292v = circleIndicator3;
                                ViewPager2 viewPager28 = this.f38291u;
                                if (viewPager28 != null) {
                                    circleIndicator3.setViewPager(viewPager28);
                                    C14959a aVar2 = this.f38290t;
                                    if (aVar2 != null) {
                                        CircleIndicator3 circleIndicator32 = this.f38292v;
                                        if (circleIndicator32 != null) {
                                            aVar2.registerAdapterDataObserver(circleIndicator32.getAdapterDataObserver());
                                            View findViewById4 = view.findViewById(R.id.refresh);
                                            C24362h.m61210e(findViewById4, "view.findViewById(R.id.refresh)");
                                            ((Button) findViewById4).setOnClickListener(new C4051q(this, 14));
                                            mo45163m2().f38300e.observe(getViewLifecycleOwner(), new C16877i(new SuggestionsSectionFragment$onViewCreated$2(this, view), 0));
                                            mo45163m2().f38302g.observe(getViewLifecycleOwner(), new C16878j(new SuggestionsSectionFragment$onViewCreated$3(this), 0));
                                            return;
                                        }
                                        C24362h.m61217l("indicator");
                                        throw null;
                                    }
                                    C24362h.m61217l("adapter");
                                    throw null;
                                }
                                C24362h.m61217l("viewPager");
                                throw null;
                            }
                            C24362h.m61217l("viewPager");
                            throw null;
                        }
                        C24362h.m61217l("viewPager");
                        throw null;
                    }
                    C24362h.m61217l("viewPager");
                    throw null;
                }
                C24362h.m61217l("viewPager");
                throw null;
            }
            C24362h.m61217l("viewPager");
            throw null;
        }
        C24362h.m61217l("viewPager");
        throw null;
    }
}
