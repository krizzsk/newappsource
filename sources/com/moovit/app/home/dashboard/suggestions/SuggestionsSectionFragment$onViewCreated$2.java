package com.moovit.app.home.dashboard.suggestions;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.C1164b;
import androidx.recyclerview.widget.C1208m;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import bf0.C21050d;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.analytics.AnalyticsEventLifecycleSender;
import com.moovit.app.home.dashboard.suggestions.SuggestionsSectionFragment;
import com.moovit.genies.Genie;
import com.tranzmate.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import m10.C18316a;
import mf0.C24362h;
import p474et.C16872d;
import p474et.C16875g;
import p543hq.C17474b;
import p648me.relex.circleindicator.CircleIndicator3;
import p977zz.C20961r;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo59060d2 = {"Lzz/r;", "Let/g;", "kotlin.jvm.PlatformType", "result", "Lbf0/d;", "invoke", "(Lzz/r;)V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
public final class SuggestionsSectionFragment$onViewCreated$2 extends Lambda implements C24236l<C20961r<C16875g>, C21050d> {
    public final /* synthetic */ View $view;
    public final /* synthetic */ SuggestionsSectionFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuggestionsSectionFragment$onViewCreated$2(SuggestionsSectionFragment suggestionsSectionFragment, View view) {
        super(1);
        this.this$0 = suggestionsSectionFragment;
        this.$view = view;
    }

    public final Object invoke(Object obj) {
        RecyclerView.C1133l lVar;
        C20961r rVar = (C20961r) obj;
        SuggestionsSectionFragment suggestionsSectionFragment = this.this$0;
        View view = this.$view;
        C24362h.m61210e(rVar, "result");
        int i = SuggestionsSectionFragment.f38283w;
        suggestionsSectionFragment.getClass();
        if (rVar.f52711a && !((C16875g) rVar.f52712b).f43891a.isEmpty()) {
            ViewGroup viewGroup = suggestionsSectionFragment.f38289s;
            if (viewGroup != null) {
                if (viewGroup.getVisibility() == 8) {
                    ViewGroup viewGroup2 = suggestionsSectionFragment.f38289s;
                    if (viewGroup2 != null) {
                        viewGroup2.setVisibility(0);
                        Lifecycle.State state = Lifecycle.State.RESUMED;
                        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
                        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "suggestions_impression");
                        AnalyticsEventLifecycleSender.m37028a(suggestionsSectionFragment, new AnalyticsEventLifecycleSender.C14713b(suggestionsSectionFragment), state, aVar.mo49933a());
                    } else {
                        C24362h.m61217l("container");
                        throw null;
                    }
                }
                List<C16872d> list = ((C16875g) rVar.f52712b).f43891a;
                SuggestionsSectionFragment.C14959a aVar2 = suggestionsSectionFragment.f38290t;
                if (aVar2 != null) {
                    C24362h.m61211f(list, "value");
                    C1208m.C1212d a = C1208m.m3293a(new SuggestionsSectionFragment.C14960b(aVar2.f38293o, list), true);
                    aVar2.f38293o = list;
                    a.mo5103b(new C1164b(aVar2));
                    ViewPager2 viewPager2 = suggestionsSectionFragment.f38291u;
                    if (viewPager2 != null) {
                        ViewPager2.C1368k kVar = viewPager2.f5074k;
                        if (kVar.f4277q.size() != 0) {
                            RecyclerView.C1134m mVar = kVar.f4271n;
                            if (mVar != null) {
                                mVar.assertNotInLayoutOrScroll("Cannot invalidate item decorations during a scroll or layout");
                            }
                            kVar.mo4558P();
                            kVar.requestLayout();
                        }
                        SuggestionsSectionFragment.C14959a aVar3 = suggestionsSectionFragment.f38290t;
                        if (aVar3 != null) {
                            if (aVar3.f38293o.size() > 1) {
                                CircleIndicator3 circleIndicator3 = suggestionsSectionFragment.f38292v;
                                if (circleIndicator3 != null) {
                                    circleIndicator3.setVisibility(0);
                                    ViewPager2 viewPager22 = suggestionsSectionFragment.f38291u;
                                    if (viewPager22 == null) {
                                        C24362h.m61217l("viewPager");
                                        throw null;
                                    } else if (viewPager22.getItemDecorationCount() == 0) {
                                        ViewPager2 viewPager23 = suggestionsSectionFragment.f38291u;
                                        if (viewPager23 != null) {
                                            if (suggestionsSectionFragment.f38287q) {
                                                lVar = suggestionsSectionFragment.f38285o;
                                            } else {
                                                lVar = suggestionsSectionFragment.f38286p;
                                            }
                                            viewPager23.f5074k.mo4593g(lVar, -1);
                                        } else {
                                            C24362h.m61217l("viewPager");
                                            throw null;
                                        }
                                    }
                                } else {
                                    C24362h.m61217l("indicator");
                                    throw null;
                                }
                            }
                            C18316a.f46708c.mo50767a(Genie.PERSONALIZED_SUGGESTIONS, view.findViewById(R.id.view_pager), suggestionsSectionFragment.f40822c);
                        } else {
                            C24362h.m61217l("adapter");
                            throw null;
                        }
                    } else {
                        C24362h.m61217l("viewPager");
                        throw null;
                    }
                } else {
                    C24362h.m61217l("adapter");
                    throw null;
                }
            } else {
                C24362h.m61217l("container");
                throw null;
            }
        }
        return C21050d.f52856a;
    }
}
