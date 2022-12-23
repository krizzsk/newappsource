package p648me.relex.circleindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import p648me.relex.circleindicator.BaseCircleIndicator;

/* renamed from: me.relex.circleindicator.CircleIndicator3 */
public class CircleIndicator3 extends BaseCircleIndicator {

    /* renamed from: l */
    public ViewPager2 f61659l;

    /* renamed from: m */
    public final C24346a f61660m = new C24346a();

    /* renamed from: n */
    public final C24347b f61661n = new C24347b();

    /* renamed from: me.relex.circleindicator.CircleIndicator3$a */
    public class C24346a extends ViewPager2.C1362g {
        public C24346a() {
        }

        /* renamed from: c */
        public final void mo5604c(int i) {
            CircleIndicator3 circleIndicator3 = CircleIndicator3.this;
            if (i != circleIndicator3.f61649k && circleIndicator3.f61659l.getAdapter() != null && CircleIndicator3.this.f61659l.getAdapter().getItemCount() > 0) {
                CircleIndicator3.this.mo60496a(i);
            }
        }
    }

    /* renamed from: me.relex.circleindicator.CircleIndicator3$b */
    public class C24347b extends RecyclerView.C1125g {
        public C24347b() {
        }

        /* renamed from: a */
        public final void mo4765a() {
            int i;
            ViewPager2 viewPager2 = CircleIndicator3.this.f61659l;
            if (viewPager2 != null) {
                RecyclerView.Adapter adapter = viewPager2.getAdapter();
                int i2 = 0;
                if (adapter != null) {
                    i = adapter.getItemCount();
                } else {
                    i = 0;
                }
                if (i != CircleIndicator3.this.getChildCount()) {
                    CircleIndicator3 circleIndicator3 = CircleIndicator3.this;
                    if (circleIndicator3.f61649k < i) {
                        circleIndicator3.f61649k = circleIndicator3.f61659l.getCurrentItem();
                    } else {
                        circleIndicator3.f61649k = -1;
                    }
                    CircleIndicator3 circleIndicator32 = CircleIndicator3.this;
                    RecyclerView.Adapter adapter2 = circleIndicator32.f61659l.getAdapter();
                    if (adapter2 != null) {
                        i2 = adapter2.getItemCount();
                    }
                    circleIndicator32.mo60497b(i2, circleIndicator32.f61659l.getCurrentItem());
                }
            }
        }

        /* renamed from: b */
        public final void mo4766b(int i, int i2) {
            mo4765a();
        }

        /* renamed from: c */
        public final void mo4767c(int i, int i2, Object obj) {
            mo4765a();
            mo4765a();
        }

        /* renamed from: d */
        public final void mo4768d(int i, int i2) {
            mo4765a();
        }

        /* renamed from: e */
        public final void mo4769e(int i, int i2) {
            mo4765a();
        }

        /* renamed from: f */
        public final void mo4770f(int i, int i2) {
            mo4765a();
        }
    }

    public CircleIndicator3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RecyclerView.C1125g getAdapterDataObserver() {
        return this.f61661n;
    }

    public /* bridge */ /* synthetic */ void setIndicatorCreatedListener(BaseCircleIndicator.C24340a aVar) {
        super.setIndicatorCreatedListener(aVar);
    }

    public void setViewPager(ViewPager2 viewPager2) {
        int i;
        this.f61659l = viewPager2;
        if (viewPager2 != null && viewPager2.getAdapter() != null) {
            this.f61649k = -1;
            RecyclerView.Adapter adapter = this.f61659l.getAdapter();
            if (adapter == null) {
                i = 0;
            } else {
                i = adapter.getItemCount();
            }
            mo60497b(i, this.f61659l.getCurrentItem());
            ViewPager2 viewPager22 = this.f61659l;
            viewPager22.f5067d.f5104a.remove(this.f61660m);
            ViewPager2 viewPager23 = this.f61659l;
            viewPager23.f5067d.f5104a.add(this.f61660m);
            this.f61660m.mo5604c(this.f61659l.getCurrentItem());
        }
    }

    public CircleIndicator3(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
