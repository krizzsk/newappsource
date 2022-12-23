package p451du;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.moovit.app.linedetail.p416ui.C15101a;
import com.moovit.commons.utils.UiUtils;

/* renamed from: du.c */
public final /* synthetic */ class C16706c implements ViewPager.OnAdapterChangeListener {

    /* renamed from: b */
    public final /* synthetic */ C15101a f43503b;

    public /* synthetic */ C16706c(C15101a aVar) {
        this.f43503b = aVar;
    }

    public final void onAdapterChanged(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        C15101a aVar = this.f43503b;
        UiUtils.m40259r(aVar.f38836t, new C16709f(aVar, 0));
    }
}
