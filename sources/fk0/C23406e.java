package fk0;

import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p781ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;

/* renamed from: fk0.e */
public final class C23406e extends ViewPager2.C1362g {

    /* renamed from: a */
    public boolean f59185a = true;

    /* renamed from: b */
    public final /* synthetic */ ScrollingPagerIndicator f59186b;

    /* renamed from: c */
    public final /* synthetic */ C23407f f59187c;

    public C23406e(C23407f fVar, ScrollingPagerIndicator scrollingPagerIndicator) {
        this.f59187c = fVar;
        this.f59186b = scrollingPagerIndicator;
    }

    /* renamed from: a */
    public final void mo5603a(int i) {
        this.f59185a = i == 0;
    }

    /* renamed from: b */
    public final void mo5638b(int i, float f, int i2) {
        C23407f fVar = this.f59187c;
        ScrollingPagerIndicator scrollingPagerIndicator = this.f59186b;
        fVar.getClass();
        if (f < BitmapDescriptorFactory.HUE_RED) {
            f = BitmapDescriptorFactory.HUE_RED;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        scrollingPagerIndicator.mo61317d(f, i);
    }

    /* renamed from: c */
    public final void mo5604c(int i) {
        if (this.f59185a) {
            C23407f fVar = this.f59187c;
            ScrollingPagerIndicator scrollingPagerIndicator = this.f59186b;
            scrollingPagerIndicator.setDotCount(fVar.f59189b.getItemCount());
            scrollingPagerIndicator.setCurrentPosition(fVar.f59191d.getCurrentItem());
        }
    }
}
