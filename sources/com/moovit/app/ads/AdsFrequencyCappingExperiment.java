package com.moovit.app.ads;

import ce0.C21100e;
import com.moovit.MoovitActivity;
import com.moovit.app.home.tab.HomeTab;
import com.moovit.app.stopdetail.StopDetailActivity;
import com.moovit.app.suggestedroutes.SuggestRoutesActivity;
import com.moovit.home.lines.search.SearchLineActivity;
import com.moovit.home.stops.search.SearchStopActivity;
import com.moovit.search.SearchLocationActivity;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p862vf.C20118b;
import p886wf.C20304i;
import p977zz.C20944i0;

public enum AdsFrequencyCappingExperiment {
    CONTROL("ads_frequency_capping_type_a"),
    TEST("ads_frequency_capping_type_b");
    
    private static final Set<Class<? extends MoovitActivity>> ADS_BLACK_LIST_TEST = null;
    private final String analyticsConstant;

    /* access modifiers changed from: public */
    static {
        ADS_BLACK_LIST_TEST = new HashSet(Arrays.asList(new Class[]{StopDetailActivity.class, SuggestRoutesActivity.class, SearchLocationActivity.class, SearchLineActivity.class, SearchStopActivity.class}));
    }

    private AdsFrequencyCappingExperiment(String str) {
        C21100e.m49373x(str, "analyticsConstant");
        this.analyticsConstant = str;
    }

    private static C20944i0<AdsFrequencyCappingExperiment, Long> getFrequencyCappingType() {
        long j;
        AdsFrequencyCappingExperiment adsFrequencyCappingExperiment;
        C20304i e = C20118b.m47697e().f51045g.mo52470e("min_time_interval_between_ads_in_seconds");
        if (e.f51490b == 2) {
            j = TimeUnit.SECONDS.toMillis(e.mo52360b());
        } else {
            j = TimeUnit.MINUTES.toMillis(10);
        }
        if (j < TimeUnit.MINUTES.toMillis(5)) {
            adsFrequencyCappingExperiment = TEST;
        } else {
            adsFrequencyCappingExperiment = CONTROL;
        }
        return new C20944i0<>(adsFrequencyCappingExperiment, Long.valueOf(j));
    }

    public static String getFrequencyCappingTypeAnalyticValue() {
        C20944i0<AdsFrequencyCappingExperiment, Long> frequencyCappingType = getFrequencyCappingType();
        StringBuilder k = C13555b.m33972k("v2_");
        k.append(((AdsFrequencyCappingExperiment) frequencyCappingType.f52692a).analyticsConstant);
        k.append("_");
        k.append(frequencyCappingType.f52693b);
        return k.toString();
    }

    public static boolean shouldBlockAdOn(MoovitActivity moovitActivity) {
        if (!TEST.equals((AdsFrequencyCappingExperiment) getFrequencyCappingType().f52692a) || !ADS_BLACK_LIST_TEST.contains(moovitActivity.getClass())) {
            return false;
        }
        return true;
    }

    public static boolean shouldShowAdOnHomeTabChange(HomeTab homeTab) {
        return true;
    }

    public static boolean shouldShowAdOnWDYWTGClick() {
        return ((AdsFrequencyCappingExperiment) getFrequencyCappingType().f52692a).equals(CONTROL);
    }
}
