package p543hq;

import com.moovit.GooglePlayServicesUnavailableActivity;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.devices.HuaweiProtectedAppIntroActivity;
import com.moovit.home.lines.search.SearchLineActivity;
import com.moovit.home.lines.search.SearchLinePagerActivity;
import com.moovit.home.stops.search.SearchStopActivity;
import com.moovit.home.stops.search.SearchStopPagerActivity;
import com.moovit.location.ChooseFixedLocationActivity;
import com.moovit.location.mappicker.MapLocationPickerActivity;
import com.moovit.offline.GraphBuildFailureActivity;
import com.moovit.search.SearchLocationActivity;
import com.moovit.web.WebViewActivity;
import g30.C4789q;
import java.util.HashMap;

/* renamed from: hq.c */
public class C17476c {

    /* renamed from: a */
    public final HashMap f44999a;

    public C17476c() {
        HashMap hashMap = new HashMap();
        this.f44999a = hashMap;
        mo49948b(hashMap);
    }

    /* renamed from: a */
    public final AnalyticsFlowKey mo49947a(Class<?> cls) {
        return (AnalyticsFlowKey) this.f44999a.get(cls.getName());
    }

    /* renamed from: b */
    public void mo49948b(HashMap hashMap) {
        hashMap.put(GooglePlayServicesUnavailableActivity.class.getName(), AnalyticsFlowKey.GOOGLE_PLAY_SERVICE_UNAVAILABLE_SCREEN);
        hashMap.put(WebViewActivity.class.getName(), AnalyticsFlowKey.WEB_VIEW_ACTIVITY);
        hashMap.put(SearchLocationActivity.class.getName(), AnalyticsFlowKey.SEARCH_LOCATION_ACTIVITY);
        hashMap.put(SearchLineActivity.class.getName(), AnalyticsFlowKey.LINE_SEARCH_ACTIVITY);
        hashMap.put(SearchLinePagerActivity.class.getName(), AnalyticsFlowKey.LINE_SEARCH_PAGER_ACTIVITY);
        hashMap.put(SearchStopActivity.class.getName(), AnalyticsFlowKey.STOP_SEARCH_ACTIVITY);
        hashMap.put(SearchStopPagerActivity.class.getName(), AnalyticsFlowKey.STOP_SEARCH_PAGER_ACTIVITY);
        hashMap.put(MapLocationPickerActivity.class.getName(), AnalyticsFlowKey.MAP_LOCATION_PICKER_ACTIVITY);
        hashMap.put(HuaweiProtectedAppIntroActivity.class.getName(), AnalyticsFlowKey.HUAWEI_PROTECTED_APP_INTRO_ACTIVITY);
        hashMap.put(ChooseFixedLocationActivity.class.getName(), AnalyticsFlowKey.EDIT_LOCATION);
        hashMap.put(GraphBuildFailureActivity.class.getName(), AnalyticsFlowKey.GRAPH_BUILD_FAILURE_ACTIVITY);
        hashMap.put(C4789q.class.getName(), AnalyticsFlowKey.METRO_UPDATE_SERVICE);
    }
}
