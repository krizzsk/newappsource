package p648me.relex.circleindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import p648me.relex.circleindicator.BaseCircleIndicator;

/* renamed from: me.relex.circleindicator.CircleIndicator2 */
public class CircleIndicator2 extends BaseCircleIndicator {

    /* renamed from: m */
    public static final /* synthetic */ int f61655m = 0;

    /* renamed from: l */
    public final C24345b f61656l = new C24345b();

    /* renamed from: me.relex.circleindicator.CircleIndicator2$a */
    public class C24344a extends RecyclerView.C1142q {
        public C24344a() {
        }

        /* renamed from: b */
        public final void mo4914b(RecyclerView recyclerView, int i, int i2) {
            CircleIndicator2 circleIndicator2 = CircleIndicator2.this;
            RecyclerView.C1134m layoutManager = recyclerView.getLayoutManager();
            circleIndicator2.getClass();
            if (layoutManager != null) {
                throw null;
            }
        }
    }

    /* renamed from: me.relex.circleindicator.CircleIndicator2$b */
    public class C24345b extends RecyclerView.C1125g {
        public C24345b() {
        }

        /* renamed from: a */
        public final void mo4765a() {
            CircleIndicator2 circleIndicator2 = CircleIndicator2.this;
            int i = CircleIndicator2.f61655m;
            circleIndicator2.getClass();
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

    public CircleIndicator2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new C24344a();
    }

    public RecyclerView.C1125g getAdapterDataObserver() {
        return this.f61656l;
    }

    public /* bridge */ /* synthetic */ void setIndicatorCreatedListener(BaseCircleIndicator.C24340a aVar) {
        super.setIndicatorCreatedListener(aVar);
    }

    public CircleIndicator2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new C24344a();
    }
}
