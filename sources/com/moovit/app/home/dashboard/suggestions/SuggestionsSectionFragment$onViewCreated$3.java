package com.moovit.app.home.dashboard.suggestions;

import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import bf0.C21050d;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.analytics.AnalyticsEventLifecycleSender;
import com.moovit.app.home.dashboard.suggestions.SuggestionsSectionFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C23825c;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import mf0.C24362h;
import p474et.C16874f;
import p543hq.C17474b;
import p648me.relex.circleindicator.CircleIndicator3;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0018\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052&\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002 \u0003*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo59060d2 = {"", "Let/f;", "", "kotlin.jvm.PlatformType", "result", "Lbf0/d;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
public final class SuggestionsSectionFragment$onViewCreated$3 extends Lambda implements C24236l<Map<C16874f, ? extends Float>, C21050d> {
    public final /* synthetic */ SuggestionsSectionFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuggestionsSectionFragment$onViewCreated$3(SuggestionsSectionFragment suggestionsSectionFragment) {
        super(1);
        this.this$0 = suggestionsSectionFragment;
    }

    public final Object invoke(Object obj) {
        RecyclerView.C1133l lVar;
        Map map = (Map) obj;
        SuggestionsSectionFragment suggestionsSectionFragment = this.this$0;
        C24362h.m61210e(map, "result");
        SuggestionsSectionFragment.C14959a aVar = suggestionsSectionFragment.f38290t;
        if (aVar != null) {
            if (aVar.f38293o.size() == 1) {
                CircleIndicator3 circleIndicator3 = suggestionsSectionFragment.f38292v;
                if (circleIndicator3 != null) {
                    circleIndicator3.setVisibility(8);
                    ViewPager2 viewPager2 = suggestionsSectionFragment.f38291u;
                    if (viewPager2 != null) {
                        if (suggestionsSectionFragment.f38287q) {
                            lVar = suggestionsSectionFragment.f38285o;
                        } else {
                            lVar = suggestionsSectionFragment.f38286p;
                        }
                        viewPager2.f5074k.mo4568Z(lVar);
                    } else {
                        C24362h.m61217l("viewPager");
                        throw null;
                    }
                } else {
                    C24362h.m61217l("indicator");
                    throw null;
                }
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                C16874f fVar = (C16874f) entry.getKey();
                float floatValue = ((Number) entry.getValue()).floatValue();
                if (fVar.f43889e) {
                    Lifecycle.State state = Lifecycle.State.RESUMED;
                    C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.DATA_LOADED);
                    aVar2.mo49939g(AnalyticsAttributeKey.TYPE, fVar.f43890f);
                    aVar2.mo49934b(AnalyticsAttributeKey.DURATION, floatValue);
                    AnalyticsEventLifecycleSender.m37029c(suggestionsSectionFragment, state, aVar2.mo49933a());
                    arrayList.add(fVar.f43885a);
                } else {
                    Lifecycle.State state2 = Lifecycle.State.RESUMED;
                    C17474b.C17475a aVar3 = new C17474b.C17475a(AnalyticsEventKey.EXPERIMENT_DATA);
                    aVar3.mo49939g(AnalyticsAttributeKey.TYPE, fVar.f43885a);
                    aVar3.mo49941i(AnalyticsAttributeKey.IS_EMPTY, fVar.f43886b);
                    aVar3.mo49934b(AnalyticsAttributeKey.DISTANCE, fVar.f43887c);
                    aVar3.mo49941i(AnalyticsAttributeKey.SUCCESS, false);
                    AnalyticsEventLifecycleSender.m37029c(suggestionsSectionFragment, state2, aVar3.mo49933a());
                }
            }
            Lifecycle.State state3 = Lifecycle.State.RESUMED;
            C17474b.C17475a aVar4 = new C17474b.C17475a(AnalyticsEventKey.DATA_LOADED);
            aVar4.mo49939g(AnalyticsAttributeKey.TYPE, "suggestions_result");
            aVar4.mo49941i(AnalyticsAttributeKey.IS_FIRST_TIME, true ^ suggestionsSectionFragment.f38288r);
            AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.DURATION;
            Collection<Number> values = map.values();
            C24362h.m61211f(values, "<this>");
            float f = BitmapDescriptorFactory.HUE_RED;
            for (Number floatValue2 : values) {
                f += floatValue2.floatValue();
            }
            aVar4.mo49934b(analyticsAttributeKey, f);
            aVar4.mo49939g(AnalyticsAttributeKey.RESULTS_QUERY_STRING, C23825c.m58520q0(arrayList, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, (String) null, (String) null, (C24236l) null, 62));
            AnalyticsEventLifecycleSender.m37029c(suggestionsSectionFragment, state3, aVar4.mo49933a());
            return C21050d.f52856a;
        }
        C24362h.m61217l("adapter");
        throw null;
    }
}
