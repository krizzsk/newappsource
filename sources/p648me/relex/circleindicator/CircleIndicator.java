package p648me.relex.circleindicator;

import android.content.Context;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import p648me.relex.circleindicator.BaseCircleIndicator;

/* renamed from: me.relex.circleindicator.CircleIndicator */
public class CircleIndicator extends BaseCircleIndicator {

    /* renamed from: l */
    public ViewPager f61650l;

    /* renamed from: m */
    public final C24342a f61651m = new C24342a();

    /* renamed from: n */
    public final C24343b f61652n = new C24343b();

    /* renamed from: me.relex.circleindicator.CircleIndicator$a */
    public class C24342a implements ViewPager.OnPageChangeListener {
        public C24342a() {
        }

        public final void onPageScrollStateChanged(int i) {
        }

        public final void onPageScrolled(int i, float f, int i2) {
        }

        public final void onPageSelected(int i) {
            if (CircleIndicator.this.f61650l.getAdapter() != null && CircleIndicator.this.f61650l.getAdapter().getCount() > 0) {
                CircleIndicator.this.mo60496a(i);
            }
        }
    }

    /* renamed from: me.relex.circleindicator.CircleIndicator$b */
    public class C24343b extends DataSetObserver {
        public C24343b() {
        }

        public final void onChanged() {
            int i;
            super.onChanged();
            ViewPager viewPager = CircleIndicator.this.f61650l;
            if (viewPager != null) {
                PagerAdapter adapter = viewPager.getAdapter();
                int i2 = 0;
                if (adapter != null) {
                    i = adapter.getCount();
                } else {
                    i = 0;
                }
                if (i != CircleIndicator.this.getChildCount()) {
                    CircleIndicator circleIndicator = CircleIndicator.this;
                    if (circleIndicator.f61649k < i) {
                        circleIndicator.f61649k = circleIndicator.f61650l.getCurrentItem();
                    } else {
                        circleIndicator.f61649k = -1;
                    }
                    CircleIndicator circleIndicator2 = CircleIndicator.this;
                    PagerAdapter adapter2 = circleIndicator2.f61650l.getAdapter();
                    if (adapter2 != null) {
                        i2 = adapter2.getCount();
                    }
                    circleIndicator2.mo60497b(i2, circleIndicator2.f61650l.getCurrentItem());
                }
            }
        }
    }

    public CircleIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DataSetObserver getDataSetObserver() {
        return this.f61652n;
    }

    public /* bridge */ /* synthetic */ void setIndicatorCreatedListener(BaseCircleIndicator.C24340a aVar) {
        super.setIndicatorCreatedListener(aVar);
    }

    @Deprecated
    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        ViewPager viewPager = this.f61650l;
        if (viewPager != null) {
            viewPager.removeOnPageChangeListener(onPageChangeListener);
            this.f61650l.addOnPageChangeListener(onPageChangeListener);
            return;
        }
        throw new NullPointerException("can not find Viewpager , setViewPager first");
    }

    public void setViewPager(ViewPager viewPager) {
        int i;
        this.f61650l = viewPager;
        if (viewPager != null && viewPager.getAdapter() != null) {
            this.f61649k = -1;
            PagerAdapter adapter = this.f61650l.getAdapter();
            if (adapter == null) {
                i = 0;
            } else {
                i = adapter.getCount();
            }
            mo60497b(i, this.f61650l.getCurrentItem());
            this.f61650l.removeOnPageChangeListener(this.f61651m);
            this.f61650l.addOnPageChangeListener(this.f61651m);
            this.f61651m.onPageSelected(this.f61650l.getCurrentItem());
        }
    }

    public CircleIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
