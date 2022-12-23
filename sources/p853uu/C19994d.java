package p853uu;

import androidx.viewpager.widget.ViewPager;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import p543hq.C17474b;

/* renamed from: uu.d */
public final class C19994d extends ViewPager.SimpleOnPageChangeListener {

    /* renamed from: b */
    public final /* synthetic */ C19995e f50835b;

    public C19994d(C19995e eVar) {
        this.f50835b = eVar;
    }

    public final void onPageSelected(int i) {
        C19995e eVar = this.f50835b;
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.SWIPE);
        aVar.mo49935c(AnalyticsAttributeKey.SELECTED_INDEX, i);
        aVar.mo49943k(AnalyticsAttributeKey.ID, eVar.f50838o.get(i).f38985b);
        eVar.mo46797j2(aVar.mo49933a());
    }
}
