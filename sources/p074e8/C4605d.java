package p074e8;

import android.view.MotionEvent;
import android.view.View;
import com.facebook.appevents.codeless.internal.EventBinding;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.lang.ref.WeakReference;
import mf0.C24362h;
import p085f8.C4714d;

/* renamed from: e8.d */
public final class C4605d {

    /* renamed from: a */
    public static final /* synthetic */ int f15822a = 0;

    /* renamed from: e8.d$a */
    public static final class C4606a implements View.OnTouchListener {

        /* renamed from: b */
        public final EventBinding f15823b;

        /* renamed from: c */
        public final WeakReference<View> f15824c;

        /* renamed from: d */
        public final WeakReference<View> f15825d;

        /* renamed from: e */
        public final View.OnTouchListener f15826e;

        /* renamed from: f */
        public boolean f15827f = true;

        public C4606a(EventBinding eventBinding, View view, View view2) {
            this.f15823b = eventBinding;
            this.f15824c = new WeakReference<>(view2);
            this.f15825d = new WeakReference<>(view);
            this.f15826e = C4714d.m12016f(view2);
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C24362h.m61211f(view, Promotion.ACTION_VIEW);
            C24362h.m61211f(motionEvent, "motionEvent");
            View view2 = this.f15825d.get();
            View view3 = this.f15824c.get();
            if (!(view2 == null || view3 == null || motionEvent.getAction() != 1)) {
                C4596a aVar = C4596a.f15790a;
                C4596a.m11909a(this.f15823b, view2, view3);
            }
            View.OnTouchListener onTouchListener = this.f15826e;
            if (onTouchListener == null || !onTouchListener.onTouch(view, motionEvent)) {
                return false;
            }
            return true;
        }
    }

    static {
        new C4605d();
    }
}
