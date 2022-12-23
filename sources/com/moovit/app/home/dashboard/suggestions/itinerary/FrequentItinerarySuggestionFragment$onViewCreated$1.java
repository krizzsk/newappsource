package com.moovit.app.home.dashboard.suggestions.itinerary;

import bf0.C21050d;
import com.moovit.itinerary.model.Itinerary;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import mf0.C24362h;
import p977zz.C20961r;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo59060d2 = {"Lzz/r;", "Lcom/moovit/itinerary/model/Itinerary;", "kotlin.jvm.PlatformType", "result", "Lbf0/d;", "invoke", "(Lzz/r;)V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
public final class FrequentItinerarySuggestionFragment$onViewCreated$1 extends Lambda implements C24236l<C20961r<Itinerary>, C21050d> {
    public final /* synthetic */ FrequentItinerarySuggestionFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FrequentItinerarySuggestionFragment$onViewCreated$1(FrequentItinerarySuggestionFragment frequentItinerarySuggestionFragment) {
        super(1);
        this.this$0 = frequentItinerarySuggestionFragment;
    }

    public final Object invoke(Object obj) {
        C20961r rVar = (C20961r) obj;
        FrequentItinerarySuggestionFragment frequentItinerarySuggestionFragment = this.this$0;
        C24362h.m61210e(rVar, "result");
        int i = FrequentItinerarySuggestionFragment.f38307u;
        frequentItinerarySuggestionFragment.getClass();
        if (rVar.f52711a) {
            T t = rVar.f52712b;
            C24362h.m61210e(t, "itineraryDataResult.data");
            frequentItinerarySuggestionFragment.mo45181o2((Itinerary) t);
        } else {
            frequentItinerarySuggestionFragment.mo45170p2(true);
            frequentItinerarySuggestionFragment.mo45180n2(4);
            frequentItinerarySuggestionFragment.mo45171q2(0);
        }
        return C21050d.f52856a;
    }
}
